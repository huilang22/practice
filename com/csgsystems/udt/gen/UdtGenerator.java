package com.csgsystems.udt.gen;

import java.io.*;
import java.util.*;

import com.csgsystems.tools.udtgenerator.utilities.MethodInputData;
import com.csgsystems.tools.udtgenerator.utilities.MethodOutputData;
import com.csgsystems.tools.udtgenerator.utilities.UdtGeneratorHelper;

public class UdtGenerator {
	
	private static Map<String, String> nativeJavaTypes = null;
	private static Map<String, String> arubaMap = new TreeMap<String, String>();
	
	static {
		nativeJavaTypes = new HashMap<String, String>();
		nativeJavaTypes.put("bit",               "Boolean");
		nativeJavaTypes.put("blob",              "Object");
		nativeJavaTypes.put("datetime",          "Date");
		nativeJavaTypes.put("error_data",        "BulkErrorData");
		nativeJavaTypes.put("int",               "Integer");
                nativeJavaTypes.put("map",               "Map");
		nativeJavaTypes.put("message_data",      "BulkMessage");
		nativeJavaTypes.put("numeric",           "BigInteger");
		nativeJavaTypes.put("participant_query", "BulkParticipantQuery");
		nativeJavaTypes.put("smallint",          "Integer");
		nativeJavaTypes.put("udt_template",      "BulkUdtTemplateRootRequest");
		nativeJavaTypes.put("varchar",           "String");
		
		/*
		addToArubaMap("AccountSegment");
		addToArubaMap("Adjustment");
		addToArubaMap("AdjustmentReason");
		addToArubaMap("BillDispatchMethod");
		addToArubaMap("BillInsertGroup");
		addToArubaMap("BillMessageGroup");
		addToArubaMap("BillMessageGroupMap");
		addToArubaMap("BillImage");
		addToArubaMap("BonusPointTransType");
		addToArubaMap("ClearingHouse");
		addToArubaMap("CmfStatus");
		addToArubaMap("CmfStatusChgReason");
		addToArubaMap("ConnectReason");
		addToArubaMap("ContractDiscount");
		addToArubaMap("DepositType");
		addToArubaMap("DiscReason");
		addToArubaMap("ExchangeRateClass");
		addToArubaMap("FranchiseCode");
		addToArubaMap("GuiIndicator");
		addToArubaMap("GenderType");
		addToArubaMap("InterimBill");
		addToArubaMap("OpenItem");
		addToArubaMap("OwningCostCenter");
		addToArubaMap("PackageComponentType");
		addToArubaMap("Payment");
		addToArubaMap("Prepayment");
		addToArubaMap("PrivacyLevel");
		addToArubaMap("RefundReason");
		addToArubaMap("RegulatoryId");
		addToArubaMap("RevRcvCostCenter");
		addToArubaMap("SalesChannel");
		addToArubaMap("Server");
		addToArubaMap("ServiceCenter");
		addToArubaMap("ServiceCenterType");
		addToArubaMap("Timezone");
		addToArubaMap("TransferReason");
		addToArubaMap("TransSourceType");
		addToArubaMap("UsageRate");
		arubaMap.put("InterimBillStatusOutputData", "InterimBillStatusOutput");
		*/
	}
	
	
	private Properties props = null;
	private boolean propsLoaded = false;
	private String packge = "";
	private String fileSep = System.getProperty("file.separator");
	private Collection<String> generatedMethods = new ArrayList<String>();
	private String propertiesFile = null;
	
	
	private static void addToArubaMap(String input) {
		arubaMap.put(input+"ObjectData", input+"Data");
		arubaMap.put(input+"ObjectDataList", input+"DataList");
		arubaMap.put(input+"ObjectFilter", input+"Filter");
		arubaMap.put(input+"Object", input);
	}

	public static void main (String[] args) {
		if (args.length == 5) {
			try {
				UdtGenerator gen = new UdtGenerator();
				gen.generate(args[0], args[1], args[2], args[3], args[4]);
			} catch (Exception x) {
				x.printStackTrace();
			}
		} else {
			UdtGenerator.printUsage();
		}
	}
	public UdtGenerator () {
	}
	public void generate(String genFileLoc, String outFileLoc, String pkg, String request, String propFile) throws Exception {
		System.err.println("Using "+genFileLoc+" for location of generator files");
		System.err.println("Using "+outFileLoc+" for location of output files");
		System.err.println("Using "+pkg+" for package");
		System.err.println("Using "+request+" for root request");
		System.err.println("Using "+propFile+" for property file");
		propertiesFile = propFile;
		packge = pkg;
		File genDir = new File(genFileLoc);
		checkMkDir(outFileLoc);
		System.err.println("After checkMkDir");
		if (genDir.isDirectory()) {
			File[] allFiles = genDir.listFiles();
			Set<String> relationships = new TreeSet<String>();
			for (int i = 0; i < allFiles.length; i++) {
				if (allFiles[i].getName().indexOf(".XsdMethods") > 0) {
					String baseName = allFiles[i].getName().substring(0, allFiles[i].getName().indexOf(".XsdMethods"));
					System.err.println("Processing "+baseName);
					//if (!baseName.equals("Adjustment")) continue;
					relationships.add(baseName);
					Set<String> methodInputSet = readSetFromFile(new File(genFileLoc+fileSep+baseName+".MethodInputs"));
					Set<String> methodOutputSet = readSetFromFile(new File(genFileLoc+fileSep+baseName+".MethodOutputs"));
					Map methodInputMap = UdtGeneratorHelper.readMethodInputsFromFile(genFileLoc + fileSep + baseName + ".MethodInputs");
					Map methodOutputMap = UdtGeneratorHelper.readMethodOutputsFromFile(genFileLoc + fileSep + baseName + ".MethodOutputs");

					Set<String> packageSet = readSetFromFile(new File(genFileLoc+fileSep+baseName+".Package"));
					//Hack fix 
					//packageSet.add("aruba.bp");
					Set<String> methodSet = readSetFromFile(new File(genFileLoc+fileSep+baseName+".XsdMethods"));
					Set<String> relationsSet = readSetFromFile(new File(genFileLoc+fileSep+baseName+".XsdRel"));
					Set<String> objectSet = readSetFromFile(new File(genFileLoc+fileSep+baseName+".Object"));
					generateMethodFile(outFileLoc+fileSep, baseName, request, methodSet);
					generateRelationFile(outFileLoc+fileSep, baseName, request, relationsSet);
					generateRequest(outFileLoc+fileSep, baseName, request, relationsSet, methodInputSet, methodOutputSet, packageSet, objectSet);
					generateBulkRequestInterfaceFiles(outFileLoc, request, baseName, methodSet, methodInputMap, methodOutputMap, packageSet);
				}
			}
			generateRequest(outFileLoc+fileSep, request, relationships);
			generateProcessInterfaceFile(outFileLoc+fileSep, request);
			//generateProcessRequestRemoteFile(outFileLoc+fileSep, request);
			generateRequest(outFileLoc+fileSep, request);
		} else {
			System.err.println("Please specify a directory for the generator files location");
		}
	}
	private void checkMkDir (String dir) {
		File appDir = new File(dir);
		if (!appDir.exists()) {
			if (!appDir.mkdirs()) {
				System.err.println("Could not create dir "+dir);
				System.err.flush();	
				System.exit(1);
			}
		}
	}

	private void printHeader(PrintStream ps, String file) throws Exception {
		ps.println("/*");
		ps.println(" * Generated code DO NOT EDIT");
		ps.println(" * Generated file: " + file);
		ps.println(" * Copyright 2006 Comverse, Inc. All Rights Reserved.");
		ps.println("*/");
		ps.println("");
	}
	
	/**
	 * Generate process Java interface file
	 *
	 * @param _outputDir        directory to place output UDT Java client interface code
	 * @param _baseName         process base name
	 */
	private void generateProcessRequestRemoteFile(String _outputDir, String _baseName) throws Exception{
		
		String fileName = _baseName + "SessionBean.java";
		String filePath = _outputDir + "interfaces" + fileSep + fileName;
		
		//System.err.println("Starting to write " + filePath);
		
		// Generate preprocessor statements and forward class references
		
		checkMkDir(_outputDir + "interfaces");
		System.err.println("After checkMkDir");
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream(filePath));
		} catch (Exception x) {
			System.err.println("Error accessing output file - " + filePath);
			x.printStackTrace();
			return;
		}
		printHeader(ps, fileName);
		
		// Generate process class interface
		ps.println("package com.csgsystems.udt."+_baseName.toLowerCase()+".interfaces;");
		ps.println("");
		ps.println("import javax.ejb.EJBObject;");
		
		ps.println("");
		ps.println("public interface " + _baseName + "SessionBean extends EJBObject, "+_baseName+"Interface {");
		ps.println("}");
		
		ps.flush();
		ps.close();
		
	}
	
	/**
	 * Generate process Java interface file
	 *
	 * @param _outputDir        directory to place output UDT Java client interface code
	 * @param _baseName         process base name
	 */
	private void generateProcessInterfaceFile(String _outputDir, String _baseName) throws Exception {
		String fileName = _baseName + "Interface.java";
		//System.err.println("Starting to write "+_outputDir+"interfaces"+fileSep+fileName);

		checkMkDir(_outputDir + "interfaces");
		System.err.println("After checkMkDir");
		String filePath = _outputDir + "interfaces" + fileSep + fileName;
		
		// Generate preprocessor statements and forward class references
		
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream(filePath));
		} catch (Exception x) {
			System.err.println("Error accessing output file - " + filePath);
			x.printStackTrace();
			return;
		}
		printHeader(ps, fileName);
		
		// Generate process class interface
		ps.println("package com.csgsystems.udt."+_baseName.toLowerCase()+".interfaces;");
		ps.println("");
	        ps.println("import javax.ejb.Remote;");	
                ps.println("import com.csgsystems.aruba.connection.*;");
		ps.println("import com.csgsystems.udt."+_baseName.toLowerCase()+"."+_baseName+";");
		
		ps.println("");
	        ps.println("@Remote");	
                ps.println("public interface " + _baseName + "Interface {");
		ps.println("  /**");
		ps.println("   Processes Udt requests for the "+_baseName+" server");
		ps.println("   @param context Session context for request");
		ps.println("   @param request request to be processed");
		ps.println("   @return results for request");
		ps.println("   @throws BSDMResourceException if the request could not be processed");
		ps.println("   */");
		ps.println("");
		ps.println("  public "+_baseName+" process(BSDMSessionContext context, "+_baseName+" request) throws BSDMResourceException;");
		ps.println("}");
		
		ps.flush();
		ps.close();
	}

	
	private void generateRequest(String fileLoc, String name) throws Exception {
		String fileName = name + "Bean.java";
		String filePath = fileLoc + "session" + fileSep + fileName;
		//System.err.println("Starting to write "+fileLoc+"session"+fileSep+fileName);
		checkMkDir(fileLoc + "session");
		System.err.println("After checkMkDir");
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream(filePath));
		} catch (Exception x) {
			System.err.println("Error accessing output file - " + filePath);
			x.printStackTrace();
			return;
		}

		printHeader(ps, name+"Bean.java");
		ps.println("package com.csgsystems.udt."+name.toLowerCase()+".session;");
		ps.println("");
		ps.println("import com.csgsystems.udt.xlate.hashmap.*;");
		ps.println("import com.csgsystems.udt."+name.toLowerCase()+".*;");
		ps.println("import com.csgsystems.udt."+name.toLowerCase()+".interfaces.*;");
		ps.println("import com.csgsystems.aruba.connection.*;");
		ps.println("import com.csgsystems.bali.connection.ApiMappings;");
		ps.println("import com.csgsystems.api.utilities.Logger;");
		ps.println("import terrapin.tuxedo.TuxError;");
		ps.println("import javax.ejb.*;");
		ps.println("import javax.ws.rs.POST;"); 	
		ps.println("import javax.ws.rs.Path;");
		ps.println("import javax.ws.rs.Produces;");  
		ps.println("import javax.ws.rs.Consumes;"); 
		ps.println("import javax.ws.rs.HeaderParam;"); 
		ps.println("import javax.inject.Inject;"); 
		ps.println("import java.util.*;");
		ps.println("/**");
		ps.println(" * @ejb.bean name=\""+name+"Bean\"");
		ps.println(" * display-name=\""+name+"Stateless Session EJB\"");
		ps.println(" * type=\"Stateless\"");
		ps.println(" * jndi-name=\"ejb/"+name+"Bean\"");
		ps.println(" * transaction-type=\"Bean\"");
		ps.println(" * @ejb.permission rolename=\"ArubaUser\"");
		ps.println(" * @ejb.security-identity run-as=\"ArubaUser\"");
		ps.println(" * @ejb:transaction type=\"NotSupported\"");
		ps.println(" */");
	        ps.println("");	
		ps.println("@Stateless(name=\""+name+"Bean\", mappedName=\""+name+"\")"); 
		ps.println("@TransactionManagement(TransactionManagementType.BEAN)"); 
		ps.println("@Path(\""+name+"\")"); 
		ps.println("public final class "+name+"Bean implements "+name+"Interface {");
		ps.println("  protected SessionContext sc = null;");
		ps.println("  @Inject protected BSDMSettings settings = null;");
		ps.println("  protected HashMapUdtTranslator xlator = new HashMapUdtTranslator();");
		ps.println("  /* Constructor */");
		ps.println("  @Inject public "+name+"Bean (BSDMSettings sett) {");
		ps.println("    this.settings = sett;");
		ps.println("  }");
		ps.println("  /**");
		ps.println("   Processes Udt requests for the "+name+" server");
		ps.println("   @param context Session context for request");
		ps.println("   @param request request to be processed");
		ps.println("   @return results for request");
		ps.println("   @throws BSDMReqourceException if the request could not be processed");
		ps.println("   */");
		ps.println("  @Path(\"\")");	
		ps.println("  @POST");
		ps.println("  @Consumes({\"application/json\", \"application/xml\"})"); 
		ps.println("  @Produces({\"application/json\", \"application/xml\"})");  
		ps.println("  public "+name+" process(@HeaderParam (\"context\")BSDMSessionContext context, "+name+" request) throws BSDMResourceException {");
		ps.println("    Connection connection = null;");
		ps.println("    BSDMResourceException cex = null;");
		ps.println("    try {");
		ps.println("      connection = openConnection();");
		ps.println("      HashMapOutput output = (HashMapOutput)xlator.translate(request);");
		ps.println("      if (Logger.DEBUG) output.debug(System.err);");
		ps.println("      HashMap map = connection.call(context, ApiMappings.getCallName(\""+name+"\"), output.getHashMap());");
		ps.println("      HashMapInput input = new HashMapInput();");
		ps.println("      input.setHashMap(map);");
		ps.println("      if (Logger.DEBUG) input.debug(System.err);");
		ps.println("      return ("+name+")xlator.translate(input, request);");
		ps.println("    } catch (Exception e) {");
		ps.println("      cex = new BSDMResourceException (BSDMResourceException.FRONT_END, e);");
		ps.println("      throw cex;");
		ps.println("    } finally {");
		ps.println("      try {");
		ps.println("        closeConnection(connection);");
		ps.println("      } catch (Exception x) {");
		ps.println("        BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, x);");
		ps.println("        if (cex != null) bre.initCause(cex);");
		ps.println("        throw bre;");
		ps.println("      }");
		ps.println("    }");
		ps.println("  }");
		ps.println("  /** Method used by EJB App Servers */");
		ps.println("  public void setSessionContext(SessionContext con) {");
		ps.println("    this.sc = con;");
		ps.println("  }");
		ps.println("  private Connection openConnection() throws TuxError, ServiceException {");
		ps.println("    return ConnectionFactory.instance().createConnection(settings);");
		ps.println("  }");
		ps.println("  private void closeConnection(Connection connection) throws TuxError {");
		ps.println("    connection.close();");
		ps.println("  }");
		ps.println("}");
		ps.flush();
		ps.close();
		//System.err.println("Done writing "+fileLoc+"session"+fileSep+name+"Bean.java");
	}
	
	private void generateRequest(String fileLoc, String name, Set<String> relations) throws Exception {
		PrintStream ps = new PrintStream(new FileOutputStream(fileLoc+name+".java"));
		//System.err.println("Starting to write "+fileLoc+name+".java");
		printHeader(ps, name+".java");
		ps.println("package com.csgsystems.udt."+name.toLowerCase()+";");
		ps.println("");
		ps.println("import com.csgsystems.udt.UdtRootRequest;");
		ps.println("import com.csgsystems.udt.UdtRequest;");
		ps.println("");
		ps.println("public final class "+name+" extends UdtRootRequest {");
		ps.println("  public "+name+" () {");
		ps.println("  }");
		if (relations != null) {
			Iterator<String> iter = relations.iterator();
			String relation = null;
			while (iter.hasNext()) {
				relation = iter.next();
				ps.println("  /**");
				ps.println("  Adds a "+relation+" request at the root level");
				ps.println("  @param request - "+relation+"Request to add");
				ps.println("   */");
				ps.println("  public void add"+relation+"Request ("+relation+"Request request) {");
				ps.println("    requests.add(request);");
				ps.println("  }");
			}
		}
		ps.println("  /**");
		ps.println("  Adds a UdtRequest request at the root level");
		ps.println("  @param request - UdtRequest to add");
		ps.println("   */");
		ps.println("  public void addUdtRequest (UdtRequest request) {");
		ps.println("    requests.add(request);");
		ps.println("  }");

		ps.println("}");
		ps.flush();
		ps.close();
		//System.err.println("Done writing "+fileLoc+name+".java");
	}
	
	private void generateMethodFile(String fileLoc, String name, String request, Set<String> methods) throws Exception {
		PrintStream ps = new PrintStream(new FileOutputStream(fileLoc+name+"RequestMethod.java"));
		//System.err.println("Starting to write "+fileLoc+name+"RequestMethod.java");
		printHeader(ps, name+"RequestMethod.java");
		ps.println("package com.csgsystems.udt."+request.toLowerCase()+";");
		ps.println("");
		ps.println("import com.csgsystems.udt.UdtMethod;");
		ps.println("public final class "+name+"RequestMethod implements UdtMethod {");
		ps.println("  private String method = null;");
		ps.println("  private "+name+"RequestMethod (String meth) {");
		ps.println("    method = meth;");
		ps.println("  }");
		ps.println("  public String getMethod () {");
		ps.println("    return method;");
		ps.println("  }");
		if (methods != null) {
			Iterator<String> iter = methods.iterator();
			String method = null;
			while (iter.hasNext()) {
				method = iter.next();
				ps.println("  /** Variable representing the "+method+" method */");
				ps.println("  public static final "+name+"RequestMethod "+getCapsString(method)+" = new "+name+"RequestMethod(\""+method+"\");");
			}
		}
		ps.println("}");
		ps.flush();
		ps.close();
		//System.err.println("Done writing "+fileLoc+name+"RequestMethod.java");
	}
	
	private void generateRelationFile(String fileLoc, String name, String request, Set<String> relations) throws Exception {
		PrintStream ps = new PrintStream(new FileOutputStream(fileLoc+name+"RequestRelationship.java"));
		//System.err.println("Starting to write "+fileLoc+name+"RequestRelationship.java");
		printHeader(ps, name+"RequestRelationship.java");
		ps.println("package com.csgsystems.udt."+request.toLowerCase()+";");
		ps.println("");
		ps.println("import com.csgsystems.udt.UdtRelationship;");
		ps.println("public final class "+name+"RequestRelationship implements UdtRelationship {");
		ps.println("  private String relationship = null;");
		ps.println("  private "+name+"RequestRelationship (String rel) {");
		ps.println("    relationship = rel;");
		ps.println("  }");
		ps.println("  public String getRelationship () {");
		ps.println("    return relationship;");
		ps.println("  }");
		if (relations != null) {
			Iterator<String> iter = relations.iterator();
			String wholeLine = null;
			String relation = null;
			StringTokenizer tok = null;
			while (iter.hasNext()) {
				wholeLine = iter.next();
				tok = new StringTokenizer(wholeLine, " ");
				relation = tok.nextToken();
				relation = tok.nextToken();
				ps.println("  /** Variable representing the "+relation+" relationship */");
				ps.println("  public static final "+name+"RequestRelationship "+getCapsString(relation)+" = new "+name+"RequestRelationship(\""+relation+"\");");
			}
		}
		ps.println("}");
		ps.flush();
		ps.close();
		//System.err.println("Done writing "+fileLoc+name+"RequestRelationship.java");
	}
	
	private void generateRequest(String fileLoc, String name, String request, Set<String> relations, Set<String> methodInputSet, Set<String> methodOutputSet, Set<String> packages, Set<String> objects) throws Exception {
		Set<String> fields = new HashSet<String>();
		Set<String> objectClasses = new HashSet<String>();
		HashMap<String, String> extendedDataMap = new HashMap<String, String>();
		PrintStream ps = new PrintStream(new FileOutputStream(fileLoc+name+"Request.java"));
		//System.err.println("Starting to write "+fileLoc+name+"Request.java");
		printHeader(ps, name+"Request.java");
		ps.println("package com.csgsystems.udt."+request.toLowerCase()+";");
		ps.println("");
		ps.println("import com.csgsystems.api.bulk.*;");
		ps.println("import com.csgsystems.udt.*;");
		ps.println("import java.util.Map;");
		ps.println("import java.util.Date;");
		ps.println("import java.util.Set;");
		ps.println("import java.util.Collection;");
		ps.println("import java.util.HashMap;");
		ps.println("import java.util.HashSet;");
		ps.println("import java.math.BigInteger;");
		ps.println("");
		if (packages != null) {
			Iterator<String> pkgIter = packages.iterator();
			String pkg = null;
			while (pkgIter.hasNext()) {
				pkg = pkgIter.next();
				if (pkg.indexOf(".") > 0) {
					ps.println("import com.csgsystems."+pkg+".helper.*;");
				} 
				ps.println("import com.csgsystems."+pkg+".data.*;");
			}
		}
		ps.println("public final class "+name+"Request extends UdtRequest {");
		ps.println("  /**");
		ps.println("    Constructor");
		ps.println("    @param request - Unique name for request");
		ps.println("    @param method - Method name for request");
		ps.println("  */");
		ps.println("  public "+name+"Request (String request, "+name+"RequestMethod method) {");
		ps.println("    initialize(request, \""+name+"\", method.getMethod());");
		ps.println("  }");
		ps.println("  /**");
		ps.println("    Adds a SelfRequest for this request");
		ps.println("    @param self Request for SelfRequest");
		ps.println("  */");
		ps.println("  public void addSelfRequest ("+name+"Request self) {");
		ps.println("    requests.add(new SubRequestWrapper(self, new SubRequestData(\"SelfRequest\", null)));");
		ps.println("  }");        
		if (relations != null) {
			Iterator<String> iter = relations.iterator();
			String relation = null;
			String wholeLine = null;
			StringTokenizer tok = null;
			Set<String> relSet = new TreeSet<String>();
			while (iter.hasNext()) {
				wholeLine = iter.next();
				tok = new StringTokenizer(wholeLine, " ");
				relation = tok.nextToken();
				relSet.add(relation);
			}
			iter = relSet.iterator();
			while (iter.hasNext()) {
				relation = (String)iter.next();
				ps.println("  /**");
				ps.println("    Adds a SubRequest for this request");
				ps.println("    @param request Request for SubRequest");
				ps.println("    @param relationship Relationship for SubRequest");
				ps.println("    @param dynamics Collection of DynamicRelationships for SubRequest");
				ps.println("  */");
				ps.println("  public void addSubRequest("+relation+"Request request, "+name+"RequestRelationship relationship, Collection dynamics) {");
				ps.println("    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));");
				ps.println("  }");
				ps.println("  /**");
				ps.println("    Adds a SubRequest for this request");
				ps.println("    @param request Request for SubRequest");
				ps.println("    @param relationship Relationship for SubRequest");
				ps.println("  */");
				ps.println("  public void addSubRequest("+relation+"Request request, "+name+"RequestRelationship relationship) {");
				ps.println("    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));");
				ps.println("  }");                	
			}
		}
		generatedMethods = new ArrayList<String>();
		if (methodInputSet != null) {
			generateInputs(ps, methodInputSet);
		}
		if (methodOutputSet != null) {
			generateOutputs(ps, methodOutputSet);
		}
		
		if (objects != null) {
			Iterator<String> iter = objects.iterator();
			String object = null;
			String objectClassName = null;
			String objectClassNameIO = null;
			String type = null;
			boolean isMultiOutput = false;
			boolean genExtendedDataAccessor = false;
			boolean aruba = false;
			boolean input = false;
			boolean field = false;
			boolean key = false;
			boolean filter = false;
			boolean single = false;
			boolean list = false;
			String apiName = null;
			
			boolean writeMethod = true;
			
			while (iter.hasNext()) {
				writeMethod = true;
				aruba = false;
				apiName = null;
				isMultiOutput = false;
				genExtendedDataAccessor = false;
				input = false;
				field = false;
				filter = false;
				single = false;
				list = false;
				key = false;
				object = iter.next();
				if (object.indexOf("-ExtendedData-") > 0) {
					genExtendedDataAccessor = true;
				}
				if (object.indexOf("-MultipleOutput") > 0) {
					isMultiOutput = true;
					StringTokenizer tok = new StringTokenizer(object, "-");
					if (tok.countTokens() == 3) {
						object = tok.nextToken();
						tok.nextToken();
						String temp = tok.nextToken();
						if (!temp.trim().equals("")) aruba = true;
						object = object+temp;
					} else {
						object = tok.nextToken();
					}
					object = object+"Output";
				}
				if (object.indexOf("-SingleOutput") > 0) {
					single = true;
					StringTokenizer tok = new StringTokenizer(object, "-");
					object = tok.nextToken();
					tok.nextToken();
					apiName = trimObject(tok.nextToken());
				}
				if (object.indexOf("-ListOutput") > 0) {
					list = true;
					object = object.substring(0, object.indexOf("-ListOutput"));
				}
				if (object.indexOf("-SingleKeyOutput") > 0) {
					key = true;
					StringTokenizer tok = new StringTokenizer(object, "-");
					object = tok.nextToken();
					tok.nextToken();
					apiName = trimObject(tok.nextToken());
				}
				if (object.indexOf("-SingleFieldOutput") > 0) {
					field = true;
					StringTokenizer tok = new StringTokenizer(object, "-");
					object = getFieldName(name, tok.nextToken());
					type = tok.nextToken();
					type = getType(tok.nextToken());
				}
				if (object.indexOf("-Input") > 0) {
					input = true;
					single = true;
					StringTokenizer tok = new StringTokenizer(object, "-");
					object = tok.nextToken();
					tok.nextToken();
					apiName = trimObject(tok.nextToken());
				}
				if (object.indexOf("-ListInput") > 0) {
					input = true;
					list = true;
					StringTokenizer tok = new StringTokenizer(object, "-");
					object = tok.nextToken();
				}
				if (object.indexOf("-KeyInput") > 0) {
					input = true;
					key = true;
					StringTokenizer tok = new StringTokenizer(object, "-");
					object = tok.nextToken();
					tok.nextToken();
					apiName = trimObject(tok.nextToken());
				}
				if (object.indexOf("-FilterInput") > 0) {
					input = true;
					filter = true;
					object = object.substring(0, object.indexOf("-FilterInput"));
				}
				if (object.indexOf("-FieldInput") > 0) {
					input = true;
					field = true;
					StringTokenizer tok = new StringTokenizer(object, "-");
					object = getFieldName(name, tok.nextToken());
					type = tok.nextToken();
					type = getType(tok.nextToken());
				}
				
				
				if (arubaMap.containsKey(object)) {
					object = arubaMap.get(object);
					aruba = true;
				}
				String translate = name;
				if (object.indexOf("=") > 0) {
					translate = object.substring(object.indexOf("=")+1, object.length());
					object = object.substring(0, object.indexOf("=")); 
					if (!arubaMap.containsKey(object)) {
						object = object+"Data";
					}
				} else {
					if (isMultiOutput) {
						translate = object+"Data";
					} else {
						if (object.indexOf(name) < 0) {
							int objPos = object.indexOf("Object");
							if (objPos >= 0) {
								translate = object.substring(0, objPos);
							} else {
								translate = object;
							}
						}
					}
				}
				if (arubaMap.containsKey(object)) {
					object = arubaMap.get(object);
					aruba = true;
				}
//				This is a HACK for Adjustment being in Bali and Aruba
				if (!name.equals("Adjustment") && object.equals("Adjustment")) {
					object = "AdjustmentObject";
					aruba = false;
				}
//				End of HACK
				
				if (field) {
					if (fields.contains(object)) continue;
					fields.add(object);
					if (input) {
						if (generatedMethods.contains("set"+object)) writeMethod = false;
						if (writeMethod) {
							writeDeprecated(ps);
							ps.println("  public void set"+object+"("+type+" data) {");
						}
					} else {
						if (generatedMethods.contains("get"+object)) writeMethod = false;
						if (writeMethod) {
							writeDeprecated(ps);
							ps.println("  public "+type+" get"+object+"() {");
						}
					} 
					if (input) {
						if (writeMethod) ps.println("    if (data != null) {");
						if (writeMethod) ps.println("      addInput(\""+object+"\", data);");
						if (writeMethod) ps.println("    }");
					} else {
						if (writeMethod) ps.println("    return ("+type+")outputMap.get(\""+object+"\");");
					}
					if (writeMethod) ps.println("  }");
				} else {
					objectClassName = object;
					if (aruba) { 
						if (key) objectClassName+="KeyData";
						if (single) objectClassName+="Data";
						if (list) objectClassName+="DataList";
						if (filter) objectClassName+="Filter";
					} else {
						if (key) objectClassName+="KeyData";
						if (single) objectClassName+="Data";
						if (list && !input) objectClassName+="DataList";
						if (list && input) objectClassName+="Data[]";
						if (filter) objectClassName+="Filter";
					}
					objectClassNameIO = objectClassName;
					if (input) {
						objectClassNameIO+="Input";
					} else {
						objectClassNameIO+="Output";
					}
					if (objectClasses.contains(objectClassNameIO)) continue;
					objectClasses.add(objectClassNameIO);
					String methodName = null;
					if (input) {
						methodName = "set"+object;
						if (aruba) { 
							if (key) methodName = methodName + "KeyData";
							if (single) methodName = methodName + "Data";
							if (filter) methodName = methodName + "Filter";
						} else {
							if (key) methodName = methodName + "KeyData";
							if (single) methodName = methodName + "Data";
							if (filter) methodName = methodName + "Filter";
							if (list) methodName = methodName + "DataArray";
						}
						if (generatedMethods.contains(methodName)) writeMethod = false;
						if (writeMethod) {
							writeDeprecated(ps);
							ps.print("  public void "+methodName);
							ps.print("("+object);
							if (aruba) {
								if (key) ps.print("KeyData");
								if (single) ps.print("Data");
								if (filter) ps.print("Filter");
							} else {
								if (key) ps.print("KeyData");
								if (single) ps.print("Data");
								if (list) ps.print("Data[]");
								if (filter) ps.print("Filter");
							}
							ps.println(" data) {");
						}
					} else {
						methodName = "get"+object;
						String objName = object;
						
						if (aruba) {
							if (key)  objName = objName + "KeyData";
							if (single)  objName = objName + "Data";
							if (list)  objName = objName + "DataList";
						} else {
							if (key)  objName = objName + "KeyData";
							if (single)  objName = objName + "Data";
							if (isMultiOutput)  objName = objName + "Data";
							if (list)  objName = objName + "DataList";
						}
						if (generatedMethods.contains(methodName)) writeMethod = false;
						
						if (writeMethod) {
							writeDeprecated(ps);
							ps.print("  public "+objName+" ");
							ps.print(methodName);
							if (aruba) {
								if (key) ps.print("KeyData");
								if (single) ps.print("Data");
								if (list) ps.print("DataList");
								if (filter) ps.print("Filter");
							} else {
								if (key) ps.print("KeyData");
								if (single) ps.print("Data");
								if (isMultiOutput) ps.print("Data");
								if (list) ps.print("DataList");
								if (filter) ps.print("Filter");
							}
							ps.println("() {");
						}
					}
					if (writeMethod) {
						if (input) {
							ps.println("    if (data != null) {");
							if (list) {
								ps.println("      Object[] list = new Object[data.length];");
								ps.println("      for (int i = 0; i < data.length; i++) {");
								ps.println("        list[i] = "+object+"Helper.getMap (data[i], (Map) list[i]);");
								ps.println("        if (list[i] != null) ((Map) list[i]).put (\"#NAME\", \""+translate+"\");");
								ps.println("      }");
								ps.println("      addInput(\""+translate+"List\", list);");
							} else {
								if (apiName != null) {
									ps.print("      addInput(\""+apiName+"\", "+object);
								} else {
									ps.print("      addInput(\""+translate+"\", "+object);
								}
								if (key) ps.print("Key");
								ps.println("Helper.toMap(data, new HashMap()).get(\""+object+"\"));");
							}
							ps.println("    }");
						} else {
							if (aruba) {
								ps.println("    try {");
								if (list) {
									ps.println("      Object[] list = (Object[]) outputMap.get(\""+object+"List\");");
									ps.println("      int count = 0;");
									ps.println("      Integer ival = (Integer) outputMap.get(\"TotalCount\");");
									ps.println("      if (ival != null) count = ival.intValue();");
									ps.println("      else count = list.length;");
									ps.println("      "+object+"Data[] array = new "+object+"Data[list.length];");
									ps.println("      for (int i = 0; i < list.length; i++) {");
									ps.println("        array[i] = "+object+"Helper.fromMap ((Map) list[i]);");
									ps.println("      }");
									ps.println("      return new "+object+"DataList(array, count);");
								} else if (isMultiOutput) {
									ps.println("      "+object+" output = new "+object+"();");
									ps.println("      output.fromMap(outputMap);");
									ps.println("      return output;");
								} else {
									ps.println("      return "+object+"Helper.fromMap(outputMap);");
								}
								ps.println("    } catch (Exception x) {");
								ps.println("      return null;");
								ps.println("    }");
							} else {
								ps.print("    return "+object);
								if (key) ps.print("Key");
								ps.print("Helper.fromMap");
								if (list) ps.print("List");
								ps.print("(outputMap");
								if (!isMultiOutput) {
									if (apiName != null) {
										ps.print(", \""+apiName);
									} else {
										ps.print(", \""+translate);
									}
									if (list) ps.print("List");
									ps.print("\"");
								}
								ps.println(");");
							}
						}
						ps.println("  }");
					}
//					Start of Extended Data Accessors
					if (genExtendedDataAccessor) {
						if (!extendedDataMap.containsKey(object)) {
							extendedDataMap.put(object, object);
							
							if (generatedMethods.contains("get"+object+"ExtendedData")) writeMethod = false;
							if (writeMethod) {
								writeDeprecated(ps);
								ps.print("  public Map ");
								ps.println(" get"+object+"ExtendedData() {");
								ps.println("    return " + object + "Helper.fromMap(outputMap, \"" + name + "\").extendedData;");
								ps.println("  }");
								ps.println("  ");
							}
						}
					}
//					End of Extended Data Accessors
					
				} 
			}
		}
		
		ps.println("}");
		ps.flush();
		ps.close();
		//System.err.println("Done writing "+fileLoc+name+"Request.java");
	}
	
	private void generateInputs (PrintStream ps, Set<String> inputs) throws Exception {
		//System.err.println("inputs = "+inputs);
		Map<String, Parameter> params = getParameters(new String("Input"), inputs);
		if (params != null) {
			Parameter param = null;
			String type = null;
			String dataType = null;
			String scalarList = null;
			boolean isAruba = false;

			for (Iterator<Parameter> iter = params.values().iterator(); iter.hasNext();) {

				param = iter.next();
				type = param.getType();
				dataType = param.getDataType();
				scalarList = param.getScalarList();
				if (type.equals("Void")) continue;
				if (type.equals("Native")) {
					dataType = nativeJavaTypes.get(dataType);
					if (scalarList.equals("List")) dataType = dataType+"[]";
				}
				if (arubaMap.containsKey(dataType)) {
					dataType = arubaMap.get(dataType);
					isAruba = true;
				} else {
					isAruba = false;
				}

				//System.err.println("MethodName = "+param.getMethodName());
				
				generatedMethods.add("set"+param.getMapName()+"For"+param.getMethodName());
				
				ps.println("  public void set"+param.getMapName()+"For"+param.getMethodName()+"("+dataType+" data) {");
				ps.println("    if (data != null) {");
				if (type.equals("Native")) {
					if (scalarList.equals("List")) {
						ps.println("      addInput(\""+param.getMapName()+"List\", data);");
					} else {
						ps.println("      addInput(\""+param.getMapName()+"\", data);");
					}
				} else if (type.equals("Object") || type.equals("Key")) {
					if (isAruba && dataType.indexOf("Filter") > 0) {
						ps.println("      addInput(\""+param.getMapName()+"\", "+getHelper(dataType)+"Helper.toMap(data));");						
					} else {
						ps.println("      addInput(\""+param.getMapName()+"\", "+getHelper(dataType)+"Helper.toMap(data, new HashMap(), \""+param.getMapName()+"\").get(\""+param.getMapName()+"\"));");
					}
				} else if (type.equals("List")) {
					ps.println("      addInput(\""+param.getMapName()+"\", "+getHelper(dataType)+"Helper.toMap(data, new HashMap(), \""+param.getMapName()+"\").get(\""+param.getMapName()+"\"));");
				} else {
					System.err.println("UNEXPECTED INPUT TYPE "+type);
				}
				ps.println("    }");
				ps.println("  }");
			}
		}
	}
	
	private void generateOutputs(PrintStream ps, Set<String> outputs) throws Exception {
		Map<String, Parameter> params = getParameters(new String("Output"), outputs);
		if (params != null) {
			Parameter param = null;
			String type = null;
			String baseDataType = null;
			String dataType = null;
			String scalarList = null;
			boolean isAruba = false;
			for (Iterator<Parameter> iter = params.values().iterator(); iter.hasNext();) {
				param = iter.next();
				type = param.getType();
				dataType = param.getDataType();
				scalarList = param.getScalarList();
				if (type.equals("Void")) continue;
				if (type.equals("Native")) {
					dataType = nativeJavaTypes.get(dataType);
					baseDataType = dataType;
					if (scalarList.equals("List")) dataType = dataType+"[]";
				}
				if (arubaMap.containsKey(dataType)) {
					dataType = arubaMap.get(dataType);
					isAruba = true;
				} else {
					isAruba = false;
				}
				if (type.equals("List")) {
					generatedMethods.add("get"+dataType+param.getMapName()+"From"+param.getMethodName());
					ps.println("  public "+dataType+"List get"+dataType+param.getMapName()+"From"+param.getMethodName()+"() {");
				} else if (type.equals("Specialty") && isAruba) {
					dataType = param.getMethodName()+dataType;
					if (arubaMap.containsKey(dataType)) {
						dataType = arubaMap.get(dataType);
					}
					generatedMethods.add("get"+dataType+param.getMapName()+"From"+param.getMethodName());
					ps.println("  public "+dataType+" get"+dataType+param.getMapName()+"From"+param.getMethodName()+"() {");
				} else if (type.equals("Native")) {
					generatedMethods.add("get"+baseDataType+param.getMapName()+"From"+param.getMethodName());
					ps.println("  public "+dataType+" get"+baseDataType+param.getMapName()+"From"+param.getMethodName()+"() {");
				} else {
					generatedMethods.add("get"+dataType+param.getMapName()+"From"+param.getMethodName());
					ps.println("  public "+dataType+" get"+dataType+param.getMapName()+"From"+param.getMethodName()+"() {");
				}		
				if (type.equals("Native")) {
					ps.println("    return ("+dataType+")outputMap.get(\""+param.getMapName()+"\");");
				} else if (type.equals("Specialty")) {
					if (isAruba) {
						ps.println("    "+dataType+" tempVar = new "+dataType+"();");
						ps.println("    tempVar.fromMap(outputMap);");
						ps.println("    return tempVar;");
					} else {
						ps.println("    return "+getHelper(dataType)+"Helper.fromMap(outputMap);");
					}
				} else if (type.equals("List")) {
					if (isAruba) {
						ps.println("    return "+getHelper(dataType)+"Helper.fromMapList(outputMap);");
					} else {
						ps.println("    return "+getHelper(dataType)+"Helper.fromMapList(outputMap, \""+param.getMapName()+"List\");");
					}	
				} else if (type.equals("Object") || type.equals("Key")) {
					if (isAruba) {
						ps.println("    try {");
						ps.println("        return "+getHelper(dataType)+"Helper.fromMap(outputMap);");
						ps.println("    } catch (Exception x) {");
						ps.println("        x.printStackTrace();");
						ps.println("        return null;");
						ps.println("    }");
					} else {
						ps.println("    return "+getHelper(dataType)+"Helper.fromMap(outputMap, \""+param.getMapName()+"\");");
					}
				} else {
					System.err.println("UNEXPECTED OUTPUT TYPE "+type);
				}
//				Ext Data
				//ps.println("    return "+XXX+"Helper.fromMap(outputMap, \""+XXX+"\").extendedData;");
				ps.println("  }");
			}
		}
	}

	private void writeDeprecated (PrintStream ps) throws Exception {
		ps.println("  /**");
		ps.println("   @deprecated");
		ps.println("   */");
	}
	
	private String getHelper(String input) {
	    String retVal = input;
	    int pos = input.lastIndexOf("Data");
	    if (pos > 0) {
	        retVal = input.substring(0, pos);
	    }
	    pos = input.lastIndexOf("Filter");
	    if (pos > 0) {
	        retVal = input.substring(0, pos);
	    }
	    return retVal;
	}
	
	private Map<String, Parameter> getParameters(String paramType, Set<String> inputs) {
		Map<String, Parameter> retVal = null;
		if (inputs != null) {
			retVal = new TreeMap<String, Parameter>();
			Parameter tempParam = null;
			for (Iterator<String> iter = inputs.iterator(); iter.hasNext();) {
				tempParam = new Parameter(paramType, iter.next());
				//System.err.println("Param = "+tempParam);
				retVal.put(tempParam.getMethodName()+tempParam.getMapName(), tempParam);
				//System.err.println("Tried to add "+tempParam.getMethodName()+tempParam.getMapName());
			}
		}
		return retVal;
	}
	
	private String getCapsString(String input) {
		StringBuffer toReturn = new StringBuffer("");
		char charAt;
		for (int i = 0; i < input.length(); i++){
			charAt = input.charAt(i);
			if (i == 0) {
				toReturn.append(charAt);
			} else {
				if (Character.isUpperCase(charAt)) {
					toReturn.append("_"+charAt);
				} else {
					toReturn.append(Character.toUpperCase(charAt));
				}
			}
		}
		return toReturn.toString();
	}
	
	private String getPackage(String input) {
		return packge;
	}
	
	private void loadProps () {
		props = new Properties();
		try {
			props.load(new FileInputStream(propertiesFile));
		} catch (Exception x) {
			x.printStackTrace();
		}
		propsLoaded = true;
	}
	private String getFieldName(String name, String in) {
		if (!propsLoaded) loadProps();
		String val = props.getProperty(name+"."+in);
		if (val != null) return formatName(val);
		else return formatName(in);
	}
	private String formatName(String in) {
		StringTokenizer tok = new StringTokenizer(in, "_");
		StringBuffer buff = new StringBuffer("");
		while (tok.hasMoreTokens()) {
			String temp = tok.nextToken();
			buff.append(temp.substring(0,1).toUpperCase());
			buff.append(temp.substring(1));
		}
		return buff.toString();
	}
	
	private String getType(String in) {
		if (in.equals("raw")) return "Object";
		if (in.equals("varchar")) return "String";
		if (in.equals("text")) return "String";
		if (in.equals("image")) return "String";
		if (in.equals("MVARCHAR")) return "String";
		if (in.equals("MCHAR")) return "String";
		if (in.equals("char")) return "String";
		if (in.equals("tinyint")) return "Integer";
		if (in.equals("smallint")) return "Integer";
		if (in.equals("int")) return "Integer";
		if (in.equals("short")) return "Integer";
		if (in.equals("long")) return "Integer";
		if (in.equals("smalldatetime")) return "Date";
		if (in.equals("datetime")) return "Date";
		if (in.equals("datetime")) return "Date";
		if (in.equals("bit")) return "Boolean";
		if (in.equals("numeric")) return "BigInteger";
		if (in.equals("blob")) return "Object";
		if (in.equals("error_data")) return "BulkErrorData";
		if (in.equals("message_data")) return "BulkMessage";
		if (in.equals("participant_query")) return "BulkParticipantQuery";
		if (in.equals("udt_template")) return "BulkUdtTemplateRootRequest";
                if (in.equals("map")) return "Map";
		return "Bad - "+in;
	}
	private String trimObject(String object) {
		String translate = null;
		int objPos = object.indexOf("Object");
		if (objPos >= 0) {
			translate = object.substring(0, objPos);
		} else {
			translate = object;
		}
		return translate;
	}
	private Set<String> readSetFromFile(File file) throws Exception {
		try {
			Set<String> set = new TreeSet<String>();
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = br.readLine()) != null) {
				set.add(line.trim());
			}
			return set;
		} catch (Exception x) {
			//System.err.println("No file existed for "+file);
			return null;
		}
	}
	public static void printUsage() {
		System.err.println("USAGE - java com.csgsystems.udt.gen.UdtGenerator gen_file_loc out_file_loc package");
	}
	
	class Parameter implements Comparable {
		String methodName = null;
		String dataType = null;
		String scalarList = null;
		String name = null;
		String type = null;
		String mapName = null;
		String udtTemplateFieldNames = null;
		String participantQueryFieldNames = null;
		public Parameter (String paramType, String parseMe) {
			StringTokenizer tok = new StringTokenizer(parseMe);
			if (paramType.equals("Input")) {
				methodName = tok.nextToken();
				dataType = tok.nextToken();
				scalarList = tok.nextToken();
				name = tok.nextToken();
				type = tok.nextToken();
				mapName = tok.nextToken();
			} else {
				methodName = tok.nextToken();
				dataType = tok.nextToken();
				scalarList = tok.nextToken();
				type = tok.nextToken();
				mapName = tok.nextToken();				
				udtTemplateFieldNames = tok.nextToken();				
				participantQueryFieldNames = tok.nextToken();				
			}
		}
		public String getDataType() {
			return dataType;
		}
		public String getMapName() {
			return mapName;
		}
		public String getMethodName() {
			return methodName;
		}
		public String getName() {
			return name;
		}
		public String getScalarList() {
			return scalarList;
		}
		public String getType() {
			return type;
		}
		public String getUDTTemplateFieldNames() {
			return udtTemplateFieldNames;
		}
		public String getParticipantQueryFieldNames() {
			return participantQueryFieldNames;
		}
		public String compareString() {
			return getDataType()+getMapName()+getMethodName()+getName()+getScalarList()+getType()+getUDTTemplateFieldNames()+getParticipantQueryFieldNames();
		}
		public int compareTo(Object obj) {
			if (obj != null) {
				if (obj instanceof Parameter) {
					Parameter input = (Parameter) obj;
					return this.compareString().compareTo(input.compareString());
				} else {
					return -1;
				}
			} else {
				return -1;
			}
		}
		
		public String toString() {
			StringBuffer buff = new StringBuffer("Parameter ");
			buff.append("methodName = ");
			buff.append(methodName);
			buff.append(" dataType = ");
			buff.append(dataType);
			buff.append(" scalarList = ");
			buff.append(scalarList);
			buff.append(" name = ");
			buff.append(name);
			buff.append(" type = ");
			buff.append(type);
			buff.append(" mapName = ");
			buff.append(mapName);
			buff.append(" udtTemplateFieldNames = ");
			buff.append(udtTemplateFieldNames);
			buff.append(" participantQueryFieldNames = ");
			buff.append(participantQueryFieldNames);
			return buff.toString();
		}
	}
	/**
	 * Generate data request Java interface file
	 *
	 * @param _outputDir          directory to place output UDT Java client interface code
	 * @param _rootReqName        root request name
	 * @param _baseName           data request base name
	 * @param _methodSet          list of methods that this data request supports
	 * @param _methodInputMap     method input parameter information
	 * @param _methodOutputMap    method output parameter information
	 * @param _packages request   input packages information
	 */
	private void generateBulkRequestInterfaceFiles(String _outputDir, String _rootReqName, String _baseName, Set _methodSet, Map _methodInputMap, Map _methodOutputMap, Set<String> _packages) throws Exception {
		String requestName = _baseName + "Request";
		String subRequestParentName = _baseName + "SubRequestParent";
				
		
		Iterator iter = null;
		
		String fileName = null;
		String filePath = null;
		
		PrintStream ps = null;
				
		// Generate no-op and functional request classes
		
		String methodName = null;
		String methodNoOpRequestName = null;
		String methodRequestName = null;
		String methodRequestBaseClassName = null;
		String methodInputCategory = null;
		String methodInputMapKeyName = null;
		String methodInputParmVariableName = null;
		String methodOutputCategory = null;
		String methodOutputJavaInputType = null;
		String methodOutputJavaOutputType = null;
		String methodOutputListItemType = null;
		String methodOutputObjectType = null;
		String methodOutputObjectAccessor = null;
		String methodOutputMapKeyName = null;
		String methodOutputParmVariableName = null;
		Iterator methodInputsIter = null;
		MethodInputData methodInput = null;
		MethodOutputData methodOutput = null;
		
		boolean isAruba = false;
		
		iter = _methodSet.iterator();
		
		while (iter.hasNext()) {
			methodName = (String)iter.next();
			methodNoOpRequestName = methodName + "NoOpBulkUdtTemplateItem";
			methodRequestName = methodName + "BulkUdtTemplateItem";
			methodInputsIter = ((Set)_methodInputMap.get(methodName)).iterator();
			methodOutput = (MethodOutputData)_methodOutputMap.get(methodName);
			if (methodOutput.isSubRequestParent()) {
				methodRequestBaseClassName = subRequestParentName;
			} else {
				methodRequestBaseClassName = requestName;
			}
			methodOutputCategory = methodOutput.getCategory();
			methodOutputJavaInputType = methodOutput.getJavaMethodInputType();
			methodOutputJavaOutputType = methodOutput.getJavaMethodOutputType();
			methodOutputObjectType = methodOutput.getJavaType();
			methodOutputListItemType = methodOutput.getJavaMethodOutputListItemType();
			methodOutputMapKeyName = methodOutput.getMapKeyName();
			methodOutputParmVariableName = methodOutput.getParameterVariableName();
			
			if (arubaMap.containsKey(methodOutputObjectType)) {
				methodOutputObjectType = arubaMap.get(methodOutputObjectType);
			}
			if (arubaMap.containsKey(methodOutputJavaOutputType)) {
				methodOutputJavaOutputType = arubaMap.get(methodOutputJavaOutputType);
				isAruba = true;
			} else {
				isAruba = false;
			}
			if (arubaMap.containsKey(methodOutputJavaInputType)) {
				methodOutputJavaInputType = arubaMap.get(methodOutputJavaInputType);
			}
			
			
			// no-op request class
			//
			// Note that no-op request classes only make sense for a methods with output data.
			// What would be the point of NOT executing an operation plus NOT having any data
			// that is useful to subsequent UDT operations?
			
			if (!methodOutput.isVoid()) {
				fileName = methodNoOpRequestName + ".java";
				filePath = _outputDir + fileSep + fileName;
				try {
					ps = new PrintStream(new FileOutputStream(filePath));
				} catch (Exception x) {
					System.err.println("Error accessing output file - " + filePath);
					x.printStackTrace();
					return;
				}
				printHeader(ps, fileName);
				ps.println("package com.csgsystems.udt."+_rootReqName.toLowerCase()+";");
				ps.println("");
				ps.println("import java.util.Date;");
				ps.println("import java.util.HashMap;");
				ps.println("import java.util.Map;");
				ps.println("import java.math.BigInteger;");
				ps.println("");
				ps.println("import com.csgsystems.api.bulk.*;");
				ps.println("import com.csgsystems.udt.*;");
				ps.println("");
				ps.println("import com.csgsystems.aruba.connection.BSDMSessionContext;");
				if (_packages != null) {
					Iterator<String> pkgIter = _packages.iterator();
					String pkg = null;
					while (pkgIter.hasNext()) {
						pkg = pkgIter.next();
						if (pkg.indexOf(".") > 0) {
							ps.println("import com.csgsystems."+pkg+".helper.*;");
						} 
						ps.println("import com.csgsystems."+pkg+".data.*;");
					}
				}
				ps.println("");
				if (isAruba && methodOutputCategory.equals("Specialty")) {
					methodOutputJavaOutputType = methodName+methodOutputJavaOutputType;
				}
				printJavaDocHeader(ps);
				printJavaDocDescription(ps, "NoOp class used to simulate a "+methodNoOpRequestName+" Bulk Request/Response");
				printJavaDocFooter(ps);
				ps.println("public class " + methodNoOpRequestName + " extends BulkUdtTemplateItem {");
				ps.println("");
				ps.println("  protected "+ methodOutputJavaOutputType + " "+methodOutputParmVariableName+";");
				ps.println("");
				printJavaDocHeader(ps);
				printJavaDocDescription(ps, "Constructor to create a   "+methodNoOpRequestName);
				printJavaDocParam(ps, "id", "Unique request name");
				printJavaDocParam(ps, methodOutputParmVariableName+"In", "Simulated response object");
				printJavaDocFooter(ps);
				ps.println("  public " + methodNoOpRequestName + "(String id, BSDMSessionContext context, " + methodOutputJavaOutputType + " "+methodOutputParmVariableName+"In) {");
				ps.println("    super(id, context, \"" + methodName + "\");");
				ps.println("    isNoOp = true;");
				ps.println("    "+methodOutputParmVariableName+" = "+methodOutputParmVariableName+"In;");
				ps.println("  }");
				ps.println("");
				ps.println("  public void translateToMap () {");
				ps.println("    if (" + methodOutputParmVariableName + " != null) {");
				if (methodOutputCategory.equals("Object") || methodOutputCategory.equals("Key")) {
					if (!methodOutputObjectType.endsWith(FILTER)) {
						ps.println("      "+methodOutputParmVariableName+".resetFlags(true, true);");
					} else {
						ps.println("      Integer index =  "+methodOutputParmVariableName+".getIndex();");
						ps.println("      if (index != null) addInput(\"Index\", index);");
						ps.println("      addInput(\""+methodOutputMapKeyName+"\", "+getHelper(methodOutputObjectType)+"Helper.toMap("+methodOutputParmVariableName+", new HashMap(), \""+methodOutputMapKeyName+"\").get(\""+methodOutputMapKeyName+"\"));");
					}
					ps.println("      addInput(\""+methodOutputMapKeyName+"\", "+getHelper(methodOutputObjectType)+"Helper.toMap("+methodOutputParmVariableName+", new HashMap(), \""+methodOutputMapKeyName+"\").get(\""+methodOutputMapKeyName+"\"));");
				} else if (methodOutputCategory.equals("Native")) {
					ps.println("      addInput(\"" + methodOutputMapKeyName + "\", " + methodOutputParmVariableName + ");");
				} else if (methodOutputCategory.equals("List")) {
					ps.println("      Map mapList = new HashMap();");
					ps.println("      Map[] mapArray = null;");
					ps.println("      mapList.put(\"Count\", "+methodOutputParmVariableName+".getLength());");
					ps.println("      mapList.put(\"TotalCount\", "+methodOutputParmVariableName+".getTotalCount());");
					ps.println("      mapList.put(\"Index\", "+methodOutputParmVariableName+".getIndex());");
					ps.println("      mapArray = new HashMap["+methodOutputParmVariableName+".getLength()];");
					ps.println("      for (int i = 0; i < "+methodOutputParmVariableName+".getLength(); i++) {");
					if (isAruba) {
						ps.println("        try {");
						ps.println("          "+methodOutputParmVariableName+".getArray()[i].resetFlags(true, true);");
						ps.println("          mapArray[i] = "+getHelper(methodOutputObjectType)+"Helper.toMap("+methodOutputParmVariableName+".getArray()[i]);");
						ps.println("        } catch (Exception x) {");
						ps.println("          x.printStackTrace();");
						ps.println("        }");
					} else {
						ps.println("          "+methodOutputParmVariableName+".getArray()[i].resetFlags(true, true);");
						ps.println("        mapArray[i] = "+getHelper(methodOutputObjectType)+"Helper.toMap("+methodOutputParmVariableName+".getArray()[i], null);");
					}

					//ps.println("        mapArray[i] = "+getHelper(methodOutputObjectType)+"Helper.toMap("+methodOutputParmVariableName+".getArray()[i], null);");
					ps.println("        addInput(\"" + methodOutputMapKeyName + "\", " + methodOutputParmVariableName + ");");
					ps.println("      }");
					ps.println("      addInput(\""+methodOutputMapKeyName+"\", mapList);");
				} else if (methodOutputCategory.equals("Specialty")) {
					if (isAruba) {
						ps.println("      Map map = new HashMap();");
						ps.println("      "+methodOutputParmVariableName+".toMap(map);");
						ps.println("      addInput(\""+methodOutputMapKeyName+"\", map);");
					} else {
						ps.println("      "+methodOutputParmVariableName+".resetFlags(true, true);");
						ps.println("      addInput(\""+methodOutputMapKeyName+"\", "+getHelper(methodOutputObjectType)+"Helper.toMap("+methodOutputParmVariableName+").get(\""+methodOutputObjectType+"\"));");						
					}

				}
				ps.println("    }");
				
				ps.println("  }");
				/* This is the get/set output data section */
				printJavaDocHeader(ps);
				printJavaDocDescription(ps, "Sets the  "+methodOutputMapKeyName);
				printJavaDocParam(ps, methodOutputParmVariableName+"In", methodOutputJavaOutputType+" to set");
				printJavaDocFooter(ps);
				ps.println("  public void set"+methodOutputMapKeyName+"("+ methodOutputJavaOutputType + " "+methodOutputParmVariableName+"In) {");
				ps.println("    "+methodOutputParmVariableName+" = "+methodOutputParmVariableName+"In;");
				ps.println("  };");

				printJavaDocHeader(ps);
				printJavaDocDescription(ps, "Retrives the "+methodOutputMapKeyName+" passed into the constructor");
				printJavaDocReturn(ps, "Simulated response");
				printJavaDocFooter(ps);
				ps.println("  public " + methodOutputJavaOutputType + " get"+methodOutputMapKeyName+"() {");
				ps.println("    return "+methodOutputParmVariableName+";");
				ps.println("  }");
				ps.println("");
				
				ps.println("public void translateFromMap() {");
				methodOutputMapKeyName = methodOutput.getMapKeyName();
				if (methodOutputCategory.equals("Object") || methodOutputCategory.equals("Key")) {
					if (isAruba) {
						ps.println("    try {");
						ps.println("      "+methodOutputParmVariableName+" = "+getHelper(methodOutputObjectType)+"Helper.fromMap(inputMap);");
						ps.println("    } catch (Exception x) {");
						ps.println("      x.printStackTrace();");
						ps.println("      return null;");
						ps.println("    }");
					} else {
						if (methodOutputObjectType.endsWith(FILTER)) {
							ps.println("    "+methodOutputParmVariableName+" = "+getHelper(methodOutputObjectType)+"Helper.fromMapFilter(inputMap, \""+methodOutputMapKeyName+"\");");							
						} else {
							ps.println("    "+methodOutputParmVariableName+" = "+getHelper(methodOutputObjectType)+"Helper.fromMap(inputMap, \""+methodOutputMapKeyName+"\");");
						}
					}
				} else if (methodOutputCategory.equals("List")) {
					if (isAruba) {
						String tempNonList = methodOutputObjectType;//.substring(0, methodOutputObjectType.lastIndexOf("List"));
						ps.println("    try {");
						ps.println("      Object[] list = (Object[]) inputMap.get(\""+methodOutputMapKeyName+"\");");
						ps.println("      int count = 0;");
						ps.println("      Integer ival = (Integer) inputMap.get(\"TotalCount\");");
						ps.println("      if (ival != null) count = ival.intValue();");
						ps.println("      else count = list.length;");
						ps.println("      "+tempNonList+"[] array = new "+tempNonList+"[list.length];");
						ps.println("      for (int i = 0; i < list.length; i++) {");
						ps.println("        array[i] = "+getHelper(methodOutputObjectType)+"Helper.fromMap ((Map) list[i]);");
						ps.println("      }");
						ps.println("      "+methodOutputParmVariableName+" = new "+methodOutputObjectType+"List(array, count);");
						ps.println("    } catch (Exception x) {");
						ps.println("      x.printStackTrace();");
						ps.println("      "+methodOutputParmVariableName+" = null;");
						ps.println("    }");						
					} else {
						ps.println("    "+methodOutputParmVariableName+" = "+getHelper(methodOutputObjectType)+"Helper.fromMapList(inputMap, \""+methodOutputMapKeyName+"List\");");
					}
				} else if (methodOutputCategory.equals("Native")) {
					methodOutputMapKeyName = methodOutput.getMapKeyName();
					ps.println("    "+methodOutputParmVariableName+" =  ("+methodOutputJavaOutputType+")inputMap.get(\"" + methodOutputMapKeyName + "\");");
				} else if (methodOutputCategory.equals("Specialty")) {
					if (isAruba) {
						ps.println("    "+methodOutputJavaOutputType+" tempVar = new "+methodOutputJavaOutputType+"();");
						ps.println("    tempVar.fromMap(inputMap);");
						ps.println("    "+methodOutputParmVariableName+" = tempVar;");
					} else {
						ps.println("    "+methodOutputParmVariableName+" = "+getHelper(methodOutputObjectType)+"Helper.fromMap(inputMap);");
					}
				}
				ps.println("  }");
				
				/* End of the get/set output data section */
				ps.println("}");
				ps.flush();
				ps.close();    	  
			}
			
			// functional request class
			fileName = methodRequestName + ".java";
			filePath = _outputDir + fileSep + fileName;
			try {
				ps = new PrintStream(new FileOutputStream(filePath));
			} catch (Exception x) {
				System.err.println("Error accessing output file - " + filePath);
				x.printStackTrace();
				return;
			}
			printHeader(ps, fileName);
			ps.println("package com.csgsystems.udt."+_rootReqName.toLowerCase()+";");
			ps.println("");
			ps.println("import java.util.Date;");
			ps.println("import java.util.HashMap;");
			ps.println("import java.util.Map;");
			ps.println("import java.math.BigInteger;");
			ps.println("");
			ps.println("import com.csgsystems.api.bulk.*;");
			ps.println("import com.csgsystems.udt.*;");
			ps.println("");
			ps.println("import com.csgsystems.aruba.connection.BSDMSessionContext;");

			if (_packages != null) {
				Iterator<String> pkgIter = _packages.iterator();
				String pkg = null;
				while (pkgIter.hasNext()) {
					pkg = pkgIter.next();
					if (pkg.indexOf(".") > 0) {
						ps.println("import com.csgsystems."+pkg+".helper.*;");
					} 
					ps.println("import com.csgsystems."+pkg+".data.*;");
				}
			}
			ps.println("");
			printJavaDocHeader(ps);
			printJavaDocDescription(ps, "Class used to create a "+methodRequestName+" Bulk Template");
			printJavaDocFooter(ps);
			ps.println("");
			ps.println("public class " + methodRequestName + " extends BulkUdtTemplateItem {");
			
			methodInputsIter = ((Set)_methodInputMap.get(methodName)).iterator();
			while (methodInputsIter.hasNext()) {
				methodInput = (MethodInputData)methodInputsIter.next();
				String temp = methodInput.getJavaMethodInputType();
				if (arubaMap.containsKey(temp)) temp = arubaMap.get(temp);
				if (!methodInput.isVoid()) {
					ps.println("  protected " +temp + " " + methodInput.getParameterVariableName()+";");
				}
			}
			
			printJavaDocHeader(ps);
			printJavaDocDescription(ps, "Constructor to create a  "+methodRequestName);
			printJavaDocParam(ps, "id", "Unique request name");
			while (methodInputsIter.hasNext()) {
				methodInput = (MethodInputData)methodInputsIter.next();
				String temp = methodInput.getJavaMethodInputType();
				if (arubaMap.containsKey(temp)) temp = arubaMap.get(temp);
				if (!methodInput.isVoid()) {
					printJavaDocParam(ps, methodInput.getParameterVariableName()+"In", temp+" for "+methodRequestName);
				}
			}
			printJavaDocFooter(ps);
			methodInputsIter = ((Set)_methodInputMap.get(methodName)).iterator();
			ps.print("  public " + methodRequestName + "(String id, BSDMSessionContext context");
			while (methodInputsIter.hasNext()) {
				methodInput = (MethodInputData)methodInputsIter.next();
				String temp = methodInput.getJavaMethodInputType();
				if (arubaMap.containsKey(temp)) temp = arubaMap.get(temp);
				if (!methodInput.isVoid()) {
					ps.print(", " +temp + " " + methodInput.getParameterVariableName()+"In");
				}
			}
			ps.println(") {");
			
			ps.println("    super(id, context, \"" + methodName + "\");");
			
			//
			
			methodInputsIter = ((Set)_methodInputMap.get(methodName)).iterator();
			while (methodInputsIter.hasNext()) {
				methodInput = (MethodInputData)methodInputsIter.next();
				if (!methodInput.isVoid()) {
					methodInputCategory = methodInput.getCategory();
					methodInputMapKeyName = methodInput.getMapKeyName();
					methodInputParmVariableName = methodInput.getParameterVariableName();
					methodOutputJavaInputType = methodInput.getJavaMethodInputType();
					
					if (arubaMap.containsKey(methodOutputJavaInputType)) methodOutputJavaInputType = arubaMap.get(methodOutputJavaInputType);
					ps.println("    "+methodInputParmVariableName+" = "+methodInputParmVariableName+"In;");	
				}
			}
			ps.println("  }");
			ps.println("");
			
			
			ps.println("  public void translateToMap() {");
			methodInputsIter = ((Set)_methodInputMap.get(methodName)).iterator();
			while (methodInputsIter.hasNext()) {
				methodInput = (MethodInputData)methodInputsIter.next();
				if (!methodInput.isVoid()) {
					methodInputCategory = methodInput.getCategory();
					methodInputMapKeyName = methodInput.getMapKeyName();
					methodInputParmVariableName = methodInput.getParameterVariableName();
					methodOutputJavaInputType = methodInput.getJavaMethodInputType();
					
					if (arubaMap.containsKey(methodOutputJavaInputType)) methodOutputJavaInputType = arubaMap.get(methodOutputJavaInputType);
						
					ps.println("    if (" + methodInputParmVariableName + " != null) {");
					if (methodInputCategory.equals("Object")) {
						if (!methodOutputJavaInputType.endsWith(FILTER)) {
							ps.println("      "+methodInputParmVariableName+".resetFlags(true, true);");
						} else {
							ps.println("      Integer index =  "+methodInputParmVariableName+".getIndex();");
							ps.println("      if (index != null) addInput(\"Index\", index);");
						}
						ps.println("      addInput(\""+methodInputMapKeyName+"\", "+getHelper(methodOutputJavaInputType)+"Helper.toMap("+methodInputParmVariableName+", new HashMap(), \""+methodOutputMapKeyName+"\").get(\""+methodOutputMapKeyName+"\"));");
					} else if (methodInputCategory.equals("Key")) {
						if (!methodOutputJavaInputType.endsWith(FILTER)) {
							ps.println("      "+methodInputParmVariableName+".resetFlags(true, true);");
						}
						ps.println("      addInput(\""+methodInputMapKeyName+"\", "+getHelper(methodOutputJavaInputType)+"Helper.toMap("+methodInputParmVariableName+", new HashMap(), \""+methodOutputJavaInputType+"\").get(\""+methodOutputJavaInputType+"\"));");
					} else if (methodInputCategory.equals("List")) {
						
						ps.println("      if ("+methodInputParmVariableName+" != null) {");
						ps.println("        Object[] list = new Object["+methodInputParmVariableName+".length];");
						ps.println("        for (int i = 0; i < "+methodInputParmVariableName+".length; i++) {");
						ps.println("          list[i] = "+getHelper(methodOutputJavaInputType)+"Helper.getMap("+methodInputParmVariableName+"[i], (Map) list[i]);");
						ps.println("          if (list[i] != null) ((Map) list[i]).put (\"#NAME\", \""+methodOutputMapKeyName+"\");");
						ps.println("        }");
						ps.println("        addInput(\""+methodInputMapKeyName+"List\", list);");
						ps.println("      }");

						
						
						/*
						ps.println("      Map mapList = new HashMap();");
						ps.println("      Map[] mapArray = null;");
						ps.println("      mapList.put(\"Count\", "+methodInputParmVariableName+".getLength());");
						ps.println("      mapList.put(\"TotalCount\", "+methodInputParmVariableName+".getTotalCount());");
						ps.println("      mapList.put(\"Index\", "+methodInputParmVariableName+".getIndex());");
						ps.println("      mapArray = new HashMap["+methodInputParmVariableName+".getLength()];");
						ps.println("      for (int i = 0; i < "+methodInputParmVariableName+".getLength(); i++) {");
						if (isAruba) {
							ps.println("        try {");
							ps.println("        "+methodInputParmVariableName+".getArray()[i].resetFlags(true, true);");
							ps.println("          mapArray[i] = "+getHelper(methodOutputJavaInputType)+"Helper.toMap("+methodInputParmVariableName+".getArray()[i]);");
							ps.println("        } catch (Exception x) {");
							ps.println("          x.printStackTrace();");
							ps.println("        }");
						} else {
							ps.println("        "+methodInputParmVariableName+".getArray()[i].resetFlags(true, true);");
							ps.println("        mapArray[i] = "+getHelper(methodOutputJavaInputType)+"Helper.toMap("+methodInputParmVariableName+".getArray()[i], null);");
						}
						ps.println("        addInput(\"" + methodInputMapKeyName + "\", " + methodInputParmVariableName + ");");
						ps.println("      }");
						ps.println("      addInput(\""+methodOutputMapKeyName+"\", mapList);");
						*/
					} else if (methodInputCategory.equals("Native")) {
			            if (methodInput.isList()) {
			            	ps.println("      addInput(\"" + methodInputMapKeyName + "List\", " + methodInputParmVariableName + ");");
			            } else {
			            	ps.println("      addInput(\"" + methodInputMapKeyName + "\", " + methodInputParmVariableName + ");");
			            }
					}
					ps.println("    }");
				}
			}
			ps.println("  }");
			ps.println("");
			
			/* Start of get/set for constructor parameters */
			methodInputsIter = ((Set)_methodInputMap.get(methodName)).iterator();
			while (methodInputsIter.hasNext()) {
				methodInput = (MethodInputData)methodInputsIter.next();
				if (!methodInput.isVoid()) {
					methodInputCategory = methodInput.getCategory();
					methodInputMapKeyName = methodInput.getMapKeyName();
					methodInputParmVariableName = methodInput.getParameterVariableName();
					methodOutputJavaInputType = methodInput.getJavaMethodInputType();
					
					ps.println("");
					printJavaDocHeader(ps);
					printJavaDocDescription(ps, "Sets the "+methodInputMapKeyName);
					printJavaDocParam(ps, methodInputParmVariableName+"In", "Value of the "+methodInputParmVariableName);
					printJavaDocFooter(ps);
					ps.println("");
					ps.println("  public void set"+methodInputMapKeyName+"("+methodOutputJavaInputType+" "+methodInputParmVariableName+"In) {");
					
					if (arubaMap.containsKey(methodOutputJavaInputType)) methodOutputJavaInputType = arubaMap.get(methodOutputJavaInputType);
					
					ps.println("    "+methodInputParmVariableName+" = "+methodInputParmVariableName+"In;");
					ps.println("  }");
				}
			}
			ps.println("");

			
			ps.println("  public void translateFromMap() {");
			methodInputsIter = ((Set)_methodInputMap.get(methodName)).iterator();
                        int gotList = 0;
			while (methodInputsIter.hasNext()) {
				methodInput = (MethodInputData)methodInputsIter.next();
				if (!methodInput.isVoid()) {
					methodInputCategory = methodInput.getCategory();
					methodInputMapKeyName = methodInput.getMapKeyName();
					methodInputParmVariableName = methodInput.getParameterVariableName();
					methodOutputJavaInputType = methodInput.getJavaMethodInputType();
					
					if (methodInputCategory.equals("Object") || methodInputCategory.equals("Key")) {
						if (isAruba) {
							ps.println("    try {");
							ps.println("      "+methodInputParmVariableName+" = "+getHelper(methodOutputJavaInputType)+"Helper.fromMap(inputMap);");
							ps.println("    } catch (Exception x) {");
							ps.println("      x.printStackTrace();");
							ps.println("      "+methodInputParmVariableName+" = null;");
							ps.println("    }");

						} else {
							if (methodOutputJavaInputType.endsWith(FILTER)) {
								ps.println("    "+methodInputParmVariableName+" = "+getHelper(methodOutputJavaInputType)+"Helper.fromMapFilter(inputMap, \""+methodInputMapKeyName+"\");");
							} else {
								ps.println("    "+methodInputParmVariableName+" = "+getHelper(methodOutputJavaInputType)+"Helper.fromMap(inputMap, \""+methodInputMapKeyName+"\");");
							}
						}
					} else if (methodInputCategory.equals("List")) {
						if (isAruba) {
							String tempNonList = methodOutputJavaInputType;//.substring(0, methodOutputObjectType.lastIndexOf("List"));
							ps.println("    try {");
							ps.println("      Object[] list = (Object[]) inputMap.get(\""+methodInputMapKeyName+"\");");
							ps.println("      int count = 0;");
							ps.println("      Integer ival = (Integer) inputMap.get(\"TotalCount\");");
							ps.println("      if (ival != null) count = ival.intValue();");
							ps.println("      else count = list.length;");
							ps.println("      "+tempNonList+"[] array = new "+tempNonList+"[list.length];");
							ps.println("      for (int i = 0; i < list.length; i++) {");
							ps.println("        array[i] = "+getHelper(methodOutputJavaInputType)+"Helper.fromMap ((Map) list[i]);");
							ps.println("      }");
							ps.println("      "+methodInputParmVariableName+" = new "+methodOutputJavaInputType+"List(array, count);");
							ps.println("    } catch (Exception x) {");
							ps.println("      x.printStackTrace();");
							ps.println("      "+methodInputParmVariableName+" = null;");
							ps.println("    }");						
						} else {
                                                        if(gotList == 0)
                                                        {
							  ps.println("    Object[] list = (Object[]) inputMap.get(\""+methodInputMapKeyName+"List\");");
                                                        } 
                                                        else
                                                        {
							  ps.println("    list = (Object[]) inputMap.get(\""+methodInputMapKeyName+"List\");");
                                                        }
							ps.println("    if (list != null) {");
							ps.println("      "+methodInputParmVariableName+" = new "+methodOutputJavaInputType.substring(0, methodOutputJavaInputType.lastIndexOf("["))+"[list.length];");
							ps.println("      for (int i = 0; i < list.length; i++) {");
							ps.println("        "+methodInputParmVariableName+"[i] = "+getHelper(methodOutputJavaInputType)+"Helper.getObj((Map) list[i]);");
							ps.println("        "+methodInputParmVariableName+"[i].resetFlags(true, true);");
							ps.println("      }");
							ps.println("    }");
							/*
							ps.println("    "+methodInputParmVariableName+" = "+getHelper(methodOutputJavaInputType)+"Helper.fromMapList(inputMap, \""+methodInputMapKeyName+"List\");");
							*/
						}
                                                gotList++;
					} else if (methodInputCategory.equals("Native")) {
						//methodOutputMapKeyName = methodOutput.getMapKeyName();
						ps.println("    "+methodInputParmVariableName+" = ("+methodOutputJavaInputType+")inputMap.get(\"" + methodInputMapKeyName + "\");");
					} else if (methodInputCategory.equals("Specialty")) {
						ps.println("    "+methodInputParmVariableName+" = "+getHelper(methodOutputJavaInputType)+"Helper.fromMap(inputMap);");
					}
				}
			}
			ps.println("  }");

			
			
			
			methodInputsIter = ((Set)_methodInputMap.get(methodName)).iterator();
			while (methodInputsIter.hasNext()) {
				methodInput = (MethodInputData)methodInputsIter.next();
				if (!methodInput.isVoid()) {
					methodInputCategory = methodInput.getCategory();
					methodInputMapKeyName = methodInput.getMapKeyName();
					methodInputParmVariableName = methodInput.getParameterVariableName();
					methodOutputJavaInputType = methodInput.getJavaMethodInputType();
					
					ps.println("");
					printJavaDocHeader(ps);
					printJavaDocDescription(ps, "Gets the "+methodInputMapKeyName);
					printJavaDocReturn(ps, "Value of the "+methodInputMapKeyName);
					printJavaDocFooter(ps);
					ps.println("");
					ps.println("  public "+methodOutputJavaInputType+" get"+methodInputMapKeyName+"( ) {");
					ps.println("    return "+methodInputParmVariableName+";");
					ps.println("  }");
				}
			}
			ps.println("");
			
			//
			ps.println("}");
			ps.flush();
			ps.close();
		}
		
	}

	private void printJavaDocHeader(PrintStream ps) {
		ps.println("/**");
		ps.println(" *");
	}
	private void printJavaDocFooter(PrintStream ps) {
		ps.println(" *");
		ps.println(" */");
	}
	private void printJavaDocDescription(PrintStream ps, String desc) {
		ps.println(" * "+desc);
	}	
	private void printJavaDocParam(PrintStream ps, String name, String desc) {
		ps.println(" * @param "+name+" "+desc);
	}	
	private void printJavaDocReturn(PrintStream ps, String desc) {
		ps.println(" * @return "+desc);
	}		
	private static final String FILTER = "Filter";
}
