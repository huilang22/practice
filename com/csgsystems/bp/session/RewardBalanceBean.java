
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: RewardBalanceBean.java
 * Definition File: Admin/RewardBalance.xml
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
import com.csgsystems.bp.interfaces.RewardBalanceInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="RewardBalanceSessionBean"
 * display-name="RewardBalance Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/RewardBalanceBean"
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

@Stateless(name="RewardBalanceBean", mappedName = "RewardBalance")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("RewardBalances")

public class RewardBalanceBean implements RewardBalanceInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _RewardBalanceGetSpec = null;
  /**
   * Get a unique RewardBalance..
   * Convenience method using default BSDMSessionContext.
   * @param RBIGetIn Input Object Key.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RewardBalanceObjectData get (RewardBalanceObjectKeyData RBIGetIn) throws BSDMResourceException
  {
    return get (null, RBIGetIn);
  }
  /**
   * Get a unique RewardBalance..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIGetIn Input Object Key.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public RewardBalanceObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam RewardBalanceObjectKeyData RBIGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RewardBalanceGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RBIGetIn != null) RewardBalanceObjectKeyHelper.toMap (RBIGetIn, record, "RewardBalance");
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
return RewardBalanceObjectHelper.fromMap (record, "RewardBalance");
}

  private BSDMInteractionSpec _RewardBalanceFindSpec = null;
  /**
   * Find RewardBalance rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RBIFindIn Input Filter Object.
   * @return RewardBalanceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RewardBalanceObjectDataList find (RewardBalanceObjectFilter RBIFindIn) throws BSDMResourceException
  {
    return find (null, RBIFindIn);
  }
  /**
   * Find RewardBalance rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIFindIn Input Filter Object.
   * @return RewardBalanceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RewardBalanceObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,RewardBalanceObjectFilter RBIFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RewardBalanceFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RBIFindIn != null) RewardBalanceObjectHelper.toMap (RBIFindIn, record, "RewardBalance");
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
return RewardBalanceObjectHelper.fromMapList (record, "RewardBalanceList");
}

  private BSDMInteractionSpec _RewardBalanceUpdateSpec = null;
  /**
   * Update the non-key fields of an RewardBalance row..
   * Convenience method using default BSDMSessionContext.
   * @param RBIUpdateIn Input  Object.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RewardBalanceObjectData update (RewardBalanceObjectData RBIUpdateIn) throws BSDMResourceException
  {
    return update (null, RBIUpdateIn);
  }
  /**
   * Update the non-key fields of an RewardBalance row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIUpdateIn Input  Object.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RewardBalanceObjectData update (@HeaderParam ("context")BSDMSessionContext context,RewardBalanceObjectData RBIUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RewardBalanceUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RBIUpdateIn != null) RewardBalanceObjectHelper.toMap (RBIUpdateIn, record, "RewardBalance");
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
return RewardBalanceObjectHelper.fromMap (record, "RewardBalance");
}

  private BSDMInteractionSpec _RewardBalanceDeleteSpec = null;
  /**
   * Delete a RewardBalance row..
   * Convenience method using default BSDMSessionContext.
   * @param RBIDeleteIn Input Object Key.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RewardBalanceObjectData delete (RewardBalanceObjectKeyData RBIDeleteIn) throws BSDMResourceException
  {
    return delete (null, RBIDeleteIn);
  }
  /**
   * Delete a RewardBalance row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIDeleteIn Input Object Key.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RewardBalanceObjectData delete (@HeaderParam ("context")BSDMSessionContext context,RewardBalanceObjectKeyData RBIDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RewardBalanceDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RBIDeleteIn != null) RewardBalanceObjectKeyHelper.toMap (RBIDeleteIn, record, "RewardBalance");
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
return RewardBalanceObjectHelper.fromMap (record, "RewardBalance");
}

  private BSDMInteractionSpec _RewardBalanceCreateSpec = null;
  /**
   * Create a new RewardBalance..
   * Convenience method using default BSDMSessionContext.
   * @param RBICreateIn Input  Object.  Defaulted Fields: BalanceType, IsInternal.  Derived Fields: RewardBalanceId.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RewardBalanceObjectData create (RewardBalanceObjectData RBICreateIn) throws BSDMResourceException
  {
    return create (null, RBICreateIn);
  }
  /**
   * Create a new RewardBalance..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBICreateIn Input  Object.  Defaulted Fields: BalanceType, IsInternal.  Derived Fields: RewardBalanceId.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RewardBalanceObjectData create (@HeaderParam ("context")BSDMSessionContext context,RewardBalanceObjectData RBICreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RewardBalanceCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RBICreateIn != null) RewardBalanceObjectHelper.toMap (RBICreateIn, record, "RewardBalance");
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
return RewardBalanceObjectHelper.fromMap (record, "RewardBalance");
}

  /**

   * Get a unique RewardBalance..

   * Convenience method using default BSDMSessionContext.

   * @param RBIGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RewardBalanceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RewardBalanceObjectData get (RewardBalanceObjectKeyData RBIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, RBIGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique RewardBalance..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RewardBalanceObjectData get (BSDMSessionContext context, RewardBalanceObjectKeyData RBIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RBIGetIn, defaultAction);
       
     cManager.checkConstraints(RBIGetIn, constraintAction);
       return get (context, RBIGetIn);
  }

  /**

   * Find RewardBalance rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param RBIFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RewardBalanceObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RewardBalanceObjectDataList find (RewardBalanceObjectFilter RBIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, RBIFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find RewardBalance rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RewardBalanceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RewardBalanceObjectDataList find (BSDMSessionContext context, RewardBalanceObjectFilter RBIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RBIFindIn, defaultAction);
       
     cManager.checkConstraints(RBIFindIn, constraintAction);
       return find (context, RBIFindIn);
  }

  /**

   * Update the non-key fields of an RewardBalance row..

   * Convenience method using default BSDMSessionContext.

   * @param RBIUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RewardBalanceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RewardBalanceObjectData update (RewardBalanceObjectData RBIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, RBIUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of an RewardBalance row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RewardBalanceObjectData update (BSDMSessionContext context, RewardBalanceObjectData RBIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RBIUpdateIn, defaultAction);
       
     cManager.checkConstraints(RBIUpdateIn, constraintAction);
       return update (context, RBIUpdateIn);
  }

  /**

   * Delete a RewardBalance row..

   * Convenience method using default BSDMSessionContext.

   * @param RBIDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RewardBalanceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RewardBalanceObjectData delete (RewardBalanceObjectKeyData RBIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, RBIDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a RewardBalance row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RewardBalanceObjectData delete (BSDMSessionContext context, RewardBalanceObjectKeyData RBIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RBIDeleteIn, defaultAction);
       
     cManager.checkConstraints(RBIDeleteIn, constraintAction);
       return delete (context, RBIDeleteIn);
  }

  /**

   * Create a new RewardBalance..

   * Convenience method using default BSDMSessionContext.

   * @param RBICreateIn Input  Object.  Defaulted Fields: BalanceType, IsInternal.  Derived Fields: RewardBalanceId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RewardBalanceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RewardBalanceObjectData create (RewardBalanceObjectData RBICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, RBICreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new RewardBalance..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBICreateIn Input  Object.  Defaulted Fields: BalanceType, IsInternal.  Derived Fields: RewardBalanceId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RewardBalanceObjectData create (BSDMSessionContext context, RewardBalanceObjectData RBICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RBICreateIn, defaultAction);
       
     cManager.checkConstraints(RBICreateIn, constraintAction);
       return create (context, RBICreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public RewardBalanceBean ()
  {
    try
    {
      _RewardBalanceGetSpec = new BSDMInteractionSpec("RewardBalanceGet", ApiMappings.getCallName ("RewardBalanceGet"), Boolean.TRUE);

      _RewardBalanceFindSpec = new BSDMInteractionSpec("RewardBalanceFind", ApiMappings.getCallName ("RewardBalanceFind"), Boolean.TRUE);

      _RewardBalanceUpdateSpec = new BSDMInteractionSpec("RewardBalanceUpdate", ApiMappings.getCallName ("RewardBalanceUpdate"), Boolean.TRUE);

      _RewardBalanceDeleteSpec = new BSDMInteractionSpec("RewardBalanceDelete", ApiMappings.getCallName ("RewardBalanceDelete"), Boolean.TRUE);

      _RewardBalanceCreateSpec = new BSDMInteractionSpec("RewardBalanceCreate", ApiMappings.getCallName ("RewardBalanceCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public RewardBalanceBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public RewardBalanceBean(BSDMSettings settings, BSDMConnectionManager cm)
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
