
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ExtendedDataParamBean.java
 * Definition File: Admin/ExtendedDataParam.xml
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
import com.csgsystems.bp.interfaces.ExtendedDataParamInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ExtendedDataParamSessionBean"
 * display-name="ExtendedDataParam Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ExtendedDataParamBean"
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

@Stateless(name="ExtendedDataParamBean", mappedName = "ExtendedDataParam")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ExtendedDataParams")

public class ExtendedDataParamBean implements ExtendedDataParamInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ExtendedDataParamGetSpec = null;
  /**
   * Get a unique ExtendedDataParam row..
   * Convenience method using default BSDMSessionContext.
   * @param PDGetIn Input Object Key.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public XPDObjectData get (XPDObjectKeyData PDGetIn) throws BSDMResourceException
  {
    return get (null, PDGetIn);
  }
  /**
   * Get a unique ExtendedDataParam row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDGetIn Input Object Key.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public XPDObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam XPDObjectKeyData PDGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataParamGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PDGetIn != null) XPDObjectKeyHelper.toMap (PDGetIn, record, "ExtendedDataParam");
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
return XPDObjectHelper.fromMap (record, "ExtendedDataParam");
}

  private BSDMInteractionSpec _ExtendedDataParamFindSpec = null;
  /**
   * Find ExtendedDataParam rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PDFindIn Input Filter Object.
   * @return XPDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public XPDObjectDataList find (XPDObjectFilter PDFindIn) throws BSDMResourceException
  {
    return find (null, PDFindIn);
  }
  /**
   * Find ExtendedDataParam rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDFindIn Input Filter Object.
   * @return XPDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public XPDObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,XPDObjectFilter PDFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataParamFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PDFindIn != null) XPDObjectHelper.toMap (PDFindIn, record, "ExtendedDataParam");
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
return XPDObjectHelper.fromMapList (record, "ExtendedDataParamList");
}

  private BSDMInteractionSpec _ExtendedDataParamUpdateSpec = null;
  /**
   * Update a new ExtendedDataParam row..
   * Convenience method using default BSDMSessionContext.
   * @param PDUpdateIn Input  Object.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public XPDObjectData update (XPDObjectData PDUpdateIn) throws BSDMResourceException
  {
    return update (null, PDUpdateIn);
  }
  /**
   * Update a new ExtendedDataParam row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDUpdateIn Input  Object.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public XPDObjectData update (@HeaderParam ("context")BSDMSessionContext context,XPDObjectData PDUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataParamUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PDUpdateIn != null) XPDObjectHelper.toMap (PDUpdateIn, record, "ExtendedDataParam");
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
return XPDObjectHelper.fromMap (record, "ExtendedDataParam");
}

  private BSDMInteractionSpec _ExtendedDataParamDeleteSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param PDDeleteIn Input  Object.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public XPDObjectData delete (XPDObjectData PDDeleteIn) throws BSDMResourceException
  {
    return delete (null, PDDeleteIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PDDeleteIn Input  Object.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public XPDObjectData delete (@HeaderParam ("context")BSDMSessionContext context,XPDObjectData PDDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataParamDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PDDeleteIn != null) XPDObjectHelper.toMap (PDDeleteIn, record, "ExtendedDataParam");
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
return XPDObjectHelper.fromMap (record, "ExtendedDataParam");
}

  private BSDMInteractionSpec _ExtendedDataParamCreateSpec = null;
  /**
   * Create a new ExtendedDataParam row..
   * Convenience method using default BSDMSessionContext.
   * @param PDCreateIn Input  Object.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public XPDObjectData create (XPDObjectData PDCreateIn) throws BSDMResourceException
  {
    return create (null, PDCreateIn);
  }
  /**
   * Create a new ExtendedDataParam row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDCreateIn Input  Object.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public XPDObjectData create (@HeaderParam ("context")BSDMSessionContext context,XPDObjectData PDCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataParamCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PDCreateIn != null) XPDObjectHelper.toMap (PDCreateIn, record, "ExtendedDataParam");
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
return XPDObjectHelper.fromMap (record, "ExtendedDataParam");
}

  /**

   * Get a unique ExtendedDataParam row..

   * Convenience method using default BSDMSessionContext.

   * @param PDGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return XPDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public XPDObjectData get (XPDObjectKeyData PDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, PDGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique ExtendedDataParam row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public XPDObjectData get (BSDMSessionContext context, XPDObjectKeyData PDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PDGetIn, defaultAction);
       
     cManager.checkConstraints(PDGetIn, constraintAction);
       return get (context, PDGetIn);
  }

  /**

   * Find ExtendedDataParam rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param PDFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return XPDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public XPDObjectDataList find (XPDObjectFilter PDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, PDFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ExtendedDataParam rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return XPDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public XPDObjectDataList find (BSDMSessionContext context, XPDObjectFilter PDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PDFindIn, defaultAction);
       
     cManager.checkConstraints(PDFindIn, constraintAction);
       return find (context, PDFindIn);
  }

  /**

   * Update a new ExtendedDataParam row..

   * Convenience method using default BSDMSessionContext.

   * @param PDUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return XPDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public XPDObjectData update (XPDObjectData PDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, PDUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update a new ExtendedDataParam row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public XPDObjectData update (BSDMSessionContext context, XPDObjectData PDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PDUpdateIn, defaultAction);
       
     cManager.checkConstraints(PDUpdateIn, constraintAction);
       return update (context, PDUpdateIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param PDDeleteIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return XPDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public XPDObjectData delete (XPDObjectData PDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, PDDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param PDDeleteIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public XPDObjectData delete (BSDMSessionContext context, XPDObjectData PDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PDDeleteIn, defaultAction);
       
     cManager.checkConstraints(PDDeleteIn, constraintAction);
       return delete (context, PDDeleteIn);
  }

  /**

   * Create a new ExtendedDataParam row..

   * Convenience method using default BSDMSessionContext.

   * @param PDCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return XPDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public XPDObjectData create (XPDObjectData PDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, PDCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new ExtendedDataParam row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public XPDObjectData create (BSDMSessionContext context, XPDObjectData PDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PDCreateIn, defaultAction);
       
     cManager.checkConstraints(PDCreateIn, constraintAction);
       return create (context, PDCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ExtendedDataParamBean ()
  {
    try
    {
      _ExtendedDataParamGetSpec = new BSDMInteractionSpec("ExtendedDataParamGet", ApiMappings.getCallName ("ExtendedDataParamGet"), Boolean.TRUE);

      _ExtendedDataParamFindSpec = new BSDMInteractionSpec("ExtendedDataParamFind", ApiMappings.getCallName ("ExtendedDataParamFind"), Boolean.TRUE);

      _ExtendedDataParamUpdateSpec = new BSDMInteractionSpec("ExtendedDataParamUpdate", ApiMappings.getCallName ("ExtendedDataParamUpdate"), Boolean.TRUE);

      _ExtendedDataParamDeleteSpec = new BSDMInteractionSpec("ExtendedDataParamDelete", ApiMappings.getCallName ("ExtendedDataParamDelete"), Boolean.TRUE);

      _ExtendedDataParamCreateSpec = new BSDMInteractionSpec("ExtendedDataParamCreate", ApiMappings.getCallName ("ExtendedDataParamCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ExtendedDataParamBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ExtendedDataParamBean(BSDMSettings settings, BSDMConnectionManager cm)
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
