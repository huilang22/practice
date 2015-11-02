
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: BilledUsageBulkAdjustmentBean.java
 * Definition File: Catalog/BilledUsageBulkAdjustment.xml
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Current generator limitations
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Object Summary Information
 *---------------------------------------------------------------------------*/
 /**--------------------------------------------------------------------------
 * Product    : BP
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Copyright 2006 Comverse, Inc.  All Rights Reserved.
 *----------------------------------------------------------------------------
 */

package com.csgsystems.bp.session;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.*;
import javax.naming.*;
import javax.resource.*;
import javax.resource.cci.*;

import com.csgsystems.api.defaults.*;
import com.csgsystems.api.constraint.*;

import com.csgsystems.aruba.connection.BSDMConnectionManager;
import com.csgsystems.aruba.connection.BSDMConnectionSpec;
import com.csgsystems.aruba.connection.BSDMInteractionSpec;
import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.aruba.connection.BSDMSettings;
import com.csgsystems.bali.connection.ApiMappings;

import javax.ejb.Stateless;  
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.BeanParam;
import javax.inject.Inject;



import com.csgsystems.bp.data.*;
import com.csgsystems.bp.interfaces.BilledUsageBulkAdjustmentInterface;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bat.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="BilledUsageBulkAdjustmentSessionBean"
 * display-name="BilledUsageBulkAdjustment Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/BilledUsageBulkAdjustmentBean"
 * transaction-type="Bean"
 * @ejb:permission role-name="ArubaUser"
 * @ejb:security-identity run-as="ArubaUser"
 * @ejb:resource-ref res-name="BSDMEIS"
 * res-type="javax.resource.cci.ConnectionFactory"
 * res-auth="Container"
 * @jboss:resource-manager res-man-class="javax.resource.cci.ConnectionFactory"
 * res-man-name="BSDMEIS"
 * res-man-jndi-name="java:/eis/JNITux"
 * @weblogic:resource-description res-ref-name="BSDMEIS"
 * jndi-name="eis/JNITux"
 * @websphere:resource-ref res-name="BSDMEIS"
 * jndi-name="eis/JNITux"
 * @jrun:resource-ref resource-ref-name="BSDMEIS"
 * jndi-name="eis/JNITux"
 * @ejb:transaction type="NotSupported"
 * @ejb:bean view-type="remote"
 */

@Stateless(name="BilledUsageBulkAdjustmentBean", mappedName = "BilledUsageBulkAdjustment")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("BilledUsageBulkAdjustments")

public class BilledUsageBulkAdjustmentBean implements BilledUsageBulkAdjustmentInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _BilledUsageBulkAdjustmentCreateSpec = null;
  /**
   * Creates a new batch to create Billed usage Adjusments.
   * Convenience method using default BSDMSessionContext.
   * @param _BulkAdjustment Input  Object.
   * @param _BatchRequest Input  Object.
   * @param _____BilledUsage Input List Object.
   * @param _BilledUsageQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BatchRequestObjectData create (BulkAdjustmentObjectData _BulkAdjustment, BatchRequestObjectData _BatchRequest, BilledUsageObjectData[] _____BilledUsage, BilledUsageQueryObjectData _BilledUsageQuery, String XMLFileName, String CDFFileName) throws BSDMResourceException
  {
    return create (null, _BulkAdjustment, _BatchRequest, _____BilledUsage, _BilledUsageQuery, XMLFileName, CDFFileName);
  }
  /**
   * Creates a new batch to create Billed usage Adjusments.
   * @param context The session context to use when connecting to the APITS server.
   * @param _BulkAdjustment Input  Object.
   * @param _BatchRequest Input  Object.
   * @param _____BilledUsage Input List Object.
   * @param _BilledUsageQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BatchRequestObjectData create (@HeaderParam ("context")BSDMSessionContext context,BulkAdjustmentObjectData _BulkAdjustment,@FormParam("BatchRequestObject")BatchRequestObjectData _BatchRequest,@FormParam("BilledUsageObject")BilledUsageObjectData[] _____BilledUsage,@FormParam("BilledUsageQueryObject")BilledUsageQueryObjectData _BilledUsageQuery,@FormParam("XMLFileName")String XMLFileName,@FormParam("CDFFileName")String CDFFileName) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageBulkAdjustmentCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (_BulkAdjustment != null) BulkAdjustmentObjectHelper.toMap (_BulkAdjustment, record, "BulkAdjustment");
      if (_BatchRequest != null) BatchRequestObjectHelper.toMap (_BatchRequest, record, "BatchRequest");
      if (_____BilledUsage != null)
    {
      Object[] list = new Object[_____BilledUsage.length];
      for (int i = 0; i < _____BilledUsage.length; i++)
      {
        list[i] = null;
        list[i] = BilledUsageObjectHelper.getMap (_____BilledUsage[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "BilledUsage");
      }
      record.put ("BilledUsageList", list);
    }

      if (XMLFileName != null) record.put ("XMLFileName", XMLFileName);

      if (CDFFileName != null) record.put ("CDFFileName", CDFFileName);
      if (_BilledUsageQuery != null) BilledUsageQueryObjectHelper.toMap (_BilledUsageQuery, record, "BilledUsageQuery");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return BatchRequestObjectHelper.fromMap (record, "BatchRequest");
}

  private BSDMInteractionSpec _BilledUsageBulkAdjustmentGetSpec = null;
  /**
   * retrieves Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param ___BatchRequest Input Object Key.
   * @return BilledUsageBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BilledUsageBulkAdjustmentGetOutputData get (BatchRequestObjectKeyData ___BatchRequest) throws BSDMResourceException
  {
    return get (null, ___BatchRequest);
  }
  /**
   * retrieves Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BatchRequest Input Object Key.
   * @return BilledUsageBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public BilledUsageBulkAdjustmentGetOutputData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BatchRequestObjectKeyData ___BatchRequest) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageBulkAdjustmentGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (___BatchRequest != null) BatchRequestObjectKeyHelper.toMap (___BatchRequest, record, "BatchRequest");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return BilledUsageBulkAdjustmentGetOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _BilledUsageBulkAdjustmentUpdateSpec = null;
  /**
   * Updates Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param ___BulkAdjustment Input  Object.
   * @param _____BatchRequest Input  Object.
   * @param _______BilledUsage Input List Object.
   * @param ____BilledUsageQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BatchRequestObjectData update (BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData _____BatchRequest, BilledUsageObjectData[] _______BilledUsage, BilledUsageQueryObjectData ____BilledUsageQuery, String __XMLFileName, String __CDFFileName) throws BSDMResourceException
  {
    return update (null, ___BulkAdjustment, _____BatchRequest, _______BilledUsage, ____BilledUsageQuery, __XMLFileName, __CDFFileName);
  }
  /**
   * Updates Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BulkAdjustment Input  Object.
   * @param _____BatchRequest Input  Object.
   * @param _______BilledUsage Input List Object.
   * @param ____BilledUsageQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BatchRequestObjectData update (@HeaderParam ("context")BSDMSessionContext context,BulkAdjustmentObjectData ___BulkAdjustment,@FormParam("BatchRequestObject")BatchRequestObjectData _____BatchRequest,@FormParam("BilledUsageObject")BilledUsageObjectData[] _______BilledUsage,@FormParam("BilledUsageQueryObject")BilledUsageQueryObjectData ____BilledUsageQuery,@FormParam("__XMLFileName")String __XMLFileName,@FormParam("__CDFFileName")String __CDFFileName) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageBulkAdjustmentUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (___BulkAdjustment != null) BulkAdjustmentObjectHelper.toMap (___BulkAdjustment, record, "BulkAdjustment");
      if (_____BatchRequest != null) BatchRequestObjectHelper.toMap (_____BatchRequest, record, "BatchRequest");
      if (_______BilledUsage != null)
    {
      Object[] list = new Object[_______BilledUsage.length];
      for (int i = 0; i < _______BilledUsage.length; i++)
      {
        list[i] = null;
        list[i] = BilledUsageObjectHelper.getMap (_______BilledUsage[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "BilledUsage");
      }
      record.put ("BilledUsageList", list);
    }

      if (__XMLFileName != null) record.put ("XMLFileName", __XMLFileName);

      if (__CDFFileName != null) record.put ("CDFFileName", __CDFFileName);
      if (____BilledUsageQuery != null) BilledUsageQueryObjectHelper.toMap (____BilledUsageQuery, record, "BilledUsageQuery");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return BatchRequestObjectHelper.fromMap (record, "BatchRequest");
}

  /**

   * Creates a new batch to create Billed usage Adjusments.

   * Convenience method using default BSDMSessionContext.

   * @param _BulkAdjustment Input  Object.

   * @param _BatchRequest Input  Object.

   * @param _____BilledUsage Input List Object.

   * @param _BilledUsageQuery Input  Object.

   * @param XMLFileName (null is allowed).

   * @param CDFFileName (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BatchRequestObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BatchRequestObjectData create (BulkAdjustmentObjectData _BulkAdjustment, BatchRequestObjectData _BatchRequest, BilledUsageObjectData[] _____BilledUsage, BilledUsageQueryObjectData _BilledUsageQuery, String XMLFileName, String CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, _BulkAdjustment, _BatchRequest, _____BilledUsage, _BilledUsageQuery, XMLFileName, CDFFileName, defaultAction, constraintAction);
  }
  /** 
   * Creates a new batch to create Billed usage Adjusments.
   * @param context The session context to use when connecting to the APITS server.
   * @param _BulkAdjustment Input  Object.
   * @param _BatchRequest Input  Object.
   * @param _____BilledUsage Input List Object.
   * @param _BilledUsageQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BatchRequestObjectData create (BSDMSessionContext context, BulkAdjustmentObjectData _BulkAdjustment, BatchRequestObjectData _BatchRequest, BilledUsageObjectData[] _____BilledUsage, BilledUsageQueryObjectData _BilledUsageQuery, String XMLFileName, String CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(_BulkAdjustment, defaultAction);
       
     dManager.setObjectDefaults(_BatchRequest, defaultAction);
       
     //Defaulting not supported on Arrays
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     dManager.setObjectDefaults(_BilledUsageQuery, defaultAction);
       
     cManager.checkConstraints(_BulkAdjustment, constraintAction);
       
     cManager.checkConstraints(_BatchRequest, constraintAction);
       
     //Constraints not supported on Arrays
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

     cManager.checkConstraints(_BilledUsageQuery, constraintAction);
       return create (context, _BulkAdjustment, _BatchRequest, _____BilledUsage, _BilledUsageQuery, XMLFileName, CDFFileName);
  }

  /**

   * retrieves Batch Request with Template and Particiapant information.

   * Convenience method using default BSDMSessionContext.

   * @param ___BatchRequest Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BilledUsageBulkAdjustmentGetOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BilledUsageBulkAdjustmentGetOutputData get (BatchRequestObjectKeyData ___BatchRequest, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, ___BatchRequest, defaultAction, constraintAction);
  }
  /** 
   * retrieves Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BatchRequest Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BilledUsageBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BilledUsageBulkAdjustmentGetOutputData get (BSDMSessionContext context, BatchRequestObjectKeyData ___BatchRequest, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(___BatchRequest, defaultAction);
       
     cManager.checkConstraints(___BatchRequest, constraintAction);
       return get (context, ___BatchRequest);
  }

  /**

   * Updates Batch Request with Template and Particiapant information.

   * Convenience method using default BSDMSessionContext.

   * @param ___BulkAdjustment Input  Object.

   * @param _____BatchRequest Input  Object.

   * @param _______BilledUsage Input List Object.

   * @param ____BilledUsageQuery Input  Object.

   * @param __XMLFileName (null is allowed).

   * @param __CDFFileName (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BatchRequestObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BatchRequestObjectData update (BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData _____BatchRequest, BilledUsageObjectData[] _______BilledUsage, BilledUsageQueryObjectData ____BilledUsageQuery, String __XMLFileName, String __CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, ___BulkAdjustment, _____BatchRequest, _______BilledUsage, ____BilledUsageQuery, __XMLFileName, __CDFFileName, defaultAction, constraintAction);
  }
  /** 
   * Updates Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BulkAdjustment Input  Object.
   * @param _____BatchRequest Input  Object.
   * @param _______BilledUsage Input List Object.
   * @param ____BilledUsageQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BatchRequestObjectData update (BSDMSessionContext context, BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData _____BatchRequest, BilledUsageObjectData[] _______BilledUsage, BilledUsageQueryObjectData ____BilledUsageQuery, String __XMLFileName, String __CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(___BulkAdjustment, defaultAction);
       
     dManager.setObjectDefaults(_____BatchRequest, defaultAction);
       
     //Defaulting not supported on Arrays
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     dManager.setObjectDefaults(____BilledUsageQuery, defaultAction);
       
     cManager.checkConstraints(___BulkAdjustment, constraintAction);
       
     cManager.checkConstraints(_____BatchRequest, constraintAction);
       
     //Constraints not supported on Arrays
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

     cManager.checkConstraints(____BilledUsageQuery, constraintAction);
       return update (context, ___BulkAdjustment, _____BatchRequest, _______BilledUsage, ____BilledUsageQuery, __XMLFileName, __CDFFileName);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public BilledUsageBulkAdjustmentBean ()
  {
    try
    {
      _BilledUsageBulkAdjustmentCreateSpec = new BSDMInteractionSpec("BilledUsageBulkAdjustmentCreate", ApiMappings.getCallName ("BilledUsageBulkAdjustmentCreate"), Boolean.TRUE);

      _BilledUsageBulkAdjustmentGetSpec = new BSDMInteractionSpec("BilledUsageBulkAdjustmentGet", ApiMappings.getCallName ("BilledUsageBulkAdjustmentGet"), Boolean.TRUE);

      _BilledUsageBulkAdjustmentUpdateSpec = new BSDMInteractionSpec("BilledUsageBulkAdjustmentUpdate", ApiMappings.getCallName ("BilledUsageBulkAdjustmentUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public BilledUsageBulkAdjustmentBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public BilledUsageBulkAdjustmentBean(BSDMSettings settings, BSDMConnectionManager cm)
  {
    this();
    this.settings = settings;
    cf = cm.getConnectionFactory ();
  }
  /** Method used by EJB App Servers. */
  public void setSessionContext(SessionContext sc)
  {
    this.sc = sc;
    Properties props = new Properties();
    String lookupName = "java:comp/env/BSDMEIS";
    try
    {
      props.load(this.getClass().getResourceAsStream("/bsdJndi.properties"));
      String url = props.getProperty("jndi.url");
      String principal = props.getProperty("jndi.principal");
      String credentials = props.getProperty("jndi.credentials");
      String factory = props.getProperty("jndi.factory");
      if (url != null) props.put(Context.PROVIDER_URL, url);
      if (principal != null) props.put(Context.SECURITY_PRINCIPAL, principal);
      if (credentials != null) props.put(Context.SECURITY_CREDENTIALS, credentials);
      if (factory != null) props.put(Context.INITIAL_CONTEXT_FACTORY, factory);
      lookupName = props.getProperty("ConnectorJndiName", "java:comp/env/BSDMEIS");
    }
    catch (Exception x)
    {
      x.printStackTrace();
      props = new Properties();
      lookupName = "java:comp/env/BSDMEIS";
    }
    try
    {
      Context ic = new InitialContext(props);
      cf = (ConnectionFactory) ic.lookup(lookupName);
      settings = BSDMSettings.getDefault ();
    }
    catch (NamingException ex)
    {
      ex.printStackTrace();
    }
  }
  private Connection openConnection() throws ResourceException
  {
    return cf.getConnection();
  }
  private void closeConnection(Connection connection) throws ResourceException
  {
    connection.close();
  }
}
