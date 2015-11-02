
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: FranchiseCodeBean.java
 * Definition File: Admin/FranchiseCode.xml
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
import com.csgsystems.bp.interfaces.FranchiseCodeInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="FranchiseCodeSessionBean"
 * display-name="FranchiseCode Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/FranchiseCodeBean"
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

@Stateless(name="FranchiseCodeBean", mappedName = "FranchiseCode")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("FranchiseCodes")

public class FranchiseCodeBean implements FranchiseCodeInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _FranchiseCodeGetSpec = null;
  /**
   * Get a unique FranchiseCode row..
   * Convenience method using default BSDMSessionContext.
   * @param FCGetIn Input Object Key.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public FranchiseCodeObjectData get (FranchiseCodeObjectKeyData FCGetIn) throws BSDMResourceException
  {
    return get (null, FCGetIn);
  }
  /**
   * Get a unique FranchiseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCGetIn Input Object Key.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public FranchiseCodeObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam FranchiseCodeObjectKeyData FCGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_FranchiseCodeGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (FCGetIn != null) FranchiseCodeObjectKeyHelper.toMap (FCGetIn, record, "FranchiseCode");
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
return FranchiseCodeObjectHelper.fromMap (record, "FranchiseCode");
}

  private BSDMInteractionSpec _FranchiseCodeFindSpec = null;
  /**
   * Find FranchiseCode's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param FCFindIn Input Filter Object.
   * @return FranchiseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public FranchiseCodeObjectDataList find (FranchiseCodeObjectFilter FCFindIn) throws BSDMResourceException
  {
    return find (null, FCFindIn);
  }
  /**
   * Find FranchiseCode's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCFindIn Input Filter Object.
   * @return FranchiseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public FranchiseCodeObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,FranchiseCodeObjectFilter FCFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_FranchiseCodeFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (FCFindIn != null) FranchiseCodeObjectHelper.toMap (FCFindIn, record, "FranchiseCode");
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
return FranchiseCodeObjectHelper.fromMapList (record, "FranchiseCodeList");
}

  private BSDMInteractionSpec _FranchiseCodeUpdateSpec = null;
  /**
   * Update non key fields of a FranchiseCode row..
   * Convenience method using default BSDMSessionContext.
   * @param FCUpdateIn Input  Object.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public FranchiseCodeObjectData update (FranchiseCodeObjectData FCUpdateIn) throws BSDMResourceException
  {
    return update (null, FCUpdateIn);
  }
  /**
   * Update non key fields of a FranchiseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCUpdateIn Input  Object.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public FranchiseCodeObjectData update (@HeaderParam ("context")BSDMSessionContext context,FranchiseCodeObjectData FCUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_FranchiseCodeUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (FCUpdateIn != null) FranchiseCodeObjectHelper.toMap (FCUpdateIn, record, "FranchiseCode");
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
return FranchiseCodeObjectHelper.fromMap (record, "FranchiseCode");
}

  private BSDMInteractionSpec _FranchiseCodeDeleteSpec = null;
  /**
   * Delete a FranchiseCode row..
   * Convenience method using default BSDMSessionContext.
   * @param FCDeleteIn Input Object Key.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public FranchiseCodeObjectData delete (FranchiseCodeObjectKeyData FCDeleteIn) throws BSDMResourceException
  {
    return delete (null, FCDeleteIn);
  }
  /**
   * Delete a FranchiseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCDeleteIn Input Object Key.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public FranchiseCodeObjectData delete (@HeaderParam ("context")BSDMSessionContext context,FranchiseCodeObjectKeyData FCDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_FranchiseCodeDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (FCDeleteIn != null) FranchiseCodeObjectKeyHelper.toMap (FCDeleteIn, record, "FranchiseCode");
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
return FranchiseCodeObjectHelper.fromMap (record, "FranchiseCode");
}

  private BSDMInteractionSpec _FranchiseCodeCreateSpec = null;
  /**
   * Create a new FranchiseCode..
   * Convenience method using default BSDMSessionContext.
   * @param FCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public FranchiseCodeObjectData create (FranchiseCodeObjectData FCCreateIn) throws BSDMResourceException
  {
    return create (null, FCCreateIn);
  }
  /**
   * Create a new FranchiseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public FranchiseCodeObjectData create (@HeaderParam ("context")BSDMSessionContext context,FranchiseCodeObjectData FCCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_FranchiseCodeCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (FCCreateIn != null) FranchiseCodeObjectHelper.toMap (FCCreateIn, record, "FranchiseCode");
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
return FranchiseCodeObjectHelper.fromMap (record, "FranchiseCode");
}

  /**

   * Get a unique FranchiseCode row..

   * Convenience method using default BSDMSessionContext.

   * @param FCGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return FranchiseCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public FranchiseCodeObjectData get (FranchiseCodeObjectKeyData FCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, FCGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique FranchiseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public FranchiseCodeObjectData get (BSDMSessionContext context, FranchiseCodeObjectKeyData FCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(FCGetIn, defaultAction);
       
     cManager.checkConstraints(FCGetIn, constraintAction);
       return get (context, FCGetIn);
  }

  /**

   * Find FranchiseCode's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param FCFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return FranchiseCodeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public FranchiseCodeObjectDataList find (FranchiseCodeObjectFilter FCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, FCFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find FranchiseCode's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return FranchiseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public FranchiseCodeObjectDataList find (BSDMSessionContext context, FranchiseCodeObjectFilter FCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(FCFindIn, defaultAction);
       
     cManager.checkConstraints(FCFindIn, constraintAction);
       return find (context, FCFindIn);
  }

  /**

   * Update non key fields of a FranchiseCode row..

   * Convenience method using default BSDMSessionContext.

   * @param FCUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return FranchiseCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public FranchiseCodeObjectData update (FranchiseCodeObjectData FCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, FCUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non key fields of a FranchiseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public FranchiseCodeObjectData update (BSDMSessionContext context, FranchiseCodeObjectData FCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(FCUpdateIn, defaultAction);
       
     cManager.checkConstraints(FCUpdateIn, constraintAction);
       return update (context, FCUpdateIn);
  }

  /**

   * Delete a FranchiseCode row..

   * Convenience method using default BSDMSessionContext.

   * @param FCDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return FranchiseCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public FranchiseCodeObjectData delete (FranchiseCodeObjectKeyData FCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, FCDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a FranchiseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public FranchiseCodeObjectData delete (BSDMSessionContext context, FranchiseCodeObjectKeyData FCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(FCDeleteIn, defaultAction);
       
     cManager.checkConstraints(FCDeleteIn, constraintAction);
       return delete (context, FCDeleteIn);
  }

  /**

   * Create a new FranchiseCode..

   * Convenience method using default BSDMSessionContext.

   * @param FCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return FranchiseCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public FranchiseCodeObjectData create (FranchiseCodeObjectData FCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, FCCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new FranchiseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public FranchiseCodeObjectData create (BSDMSessionContext context, FranchiseCodeObjectData FCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(FCCreateIn, defaultAction);
       
     cManager.checkConstraints(FCCreateIn, constraintAction);
       return create (context, FCCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public FranchiseCodeBean ()
  {
    try
    {
      _FranchiseCodeGetSpec = new BSDMInteractionSpec("FranchiseCodeGet", ApiMappings.getCallName ("FranchiseCodeGet"), Boolean.TRUE);

      _FranchiseCodeFindSpec = new BSDMInteractionSpec("FranchiseCodeFind", ApiMappings.getCallName ("FranchiseCodeFind"), Boolean.TRUE);

      _FranchiseCodeUpdateSpec = new BSDMInteractionSpec("FranchiseCodeUpdate", ApiMappings.getCallName ("FranchiseCodeUpdate"), Boolean.TRUE);

      _FranchiseCodeDeleteSpec = new BSDMInteractionSpec("FranchiseCodeDelete", ApiMappings.getCallName ("FranchiseCodeDelete"), Boolean.TRUE);

      _FranchiseCodeCreateSpec = new BSDMInteractionSpec("FranchiseCodeCreate", ApiMappings.getCallName ("FranchiseCodeCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public FranchiseCodeBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public FranchiseCodeBean(BSDMSettings settings, BSDMConnectionManager cm)
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
