
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: BillDispatchMethodBean.java
 * Definition File: Admin/BillDispatchMethod.xml
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
import com.csgsystems.bp.interfaces.BillDispatchMethodInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="BillDispatchMethodSessionBean"
 * display-name="BillDispatchMethod Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/BillDispatchMethodBean"
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

@Stateless(name="BillDispatchMethodBean", mappedName = "BillDispatchMethod")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("BillDispatchMethods")

public class BillDispatchMethodBean implements BillDispatchMethodInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _BillDispatchMethodGetSpec = null;
  /**
   * Get a BillDispatchMethod..
   * Convenience method using default BSDMSessionContext.
   * @param BDMGetIn Input Object Key.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillDispatchMethodObjectData get (BillDispatchMethodObjectKeyData BDMGetIn) throws BSDMResourceException
  {
    return get (null, BDMGetIn);
  }
  /**
   * Get a BillDispatchMethod..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMGetIn Input Object Key.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public BillDispatchMethodObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BillDispatchMethodObjectKeyData BDMGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillDispatchMethodGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BDMGetIn != null) BillDispatchMethodObjectKeyHelper.toMap (BDMGetIn, record, "BillDispatchMethod");
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
return BillDispatchMethodObjectHelper.fromMap (record, "BillDispatchMethod");
}

  private BSDMInteractionSpec _BillDispatchMethodFindSpec = null;
  /**
   * Find BillDispatchMethod's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BDMFindIn Input Filter Object.
   * @return BillDispatchMethodObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillDispatchMethodObjectDataList find (BillDispatchMethodObjectFilter BDMFindIn) throws BSDMResourceException
  {
    return find (null, BDMFindIn);
  }
  /**
   * Find BillDispatchMethod's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMFindIn Input Filter Object.
   * @return BillDispatchMethodObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillDispatchMethodObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,BillDispatchMethodObjectFilter BDMFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillDispatchMethodFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BDMFindIn != null) BillDispatchMethodObjectHelper.toMap (BDMFindIn, record, "BillDispatchMethod");
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
return BillDispatchMethodObjectHelper.fromMapList (record, "BillDispatchMethodList");
}

  private BSDMInteractionSpec _BillDispatchMethodUpdateSpec = null;
  /**
   * Update non-key fields of a BillDispatchMethod row..
   * Convenience method using default BSDMSessionContext.
   * @param BDMUpdateIn Input  Object.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillDispatchMethodObjectData update (BillDispatchMethodObjectData BDMUpdateIn) throws BSDMResourceException
  {
    return update (null, BDMUpdateIn);
  }
  /**
   * Update non-key fields of a BillDispatchMethod row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMUpdateIn Input  Object.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillDispatchMethodObjectData update (@HeaderParam ("context")BSDMSessionContext context,BillDispatchMethodObjectData BDMUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillDispatchMethodUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BDMUpdateIn != null) BillDispatchMethodObjectHelper.toMap (BDMUpdateIn, record, "BillDispatchMethod");
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
return BillDispatchMethodObjectHelper.fromMap (record, "BillDispatchMethod");
}

  private BSDMInteractionSpec _BillDispatchMethodDeleteSpec = null;
  /**
   * Delete a BillDispatchMethod row..
   * Convenience method using default BSDMSessionContext.
   * @param BDMDeleteIn Input Object Key.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillDispatchMethodObjectData delete (BillDispatchMethodObjectKeyData BDMDeleteIn) throws BSDMResourceException
  {
    return delete (null, BDMDeleteIn);
  }
  /**
   * Delete a BillDispatchMethod row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMDeleteIn Input Object Key.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillDispatchMethodObjectData delete (@HeaderParam ("context")BSDMSessionContext context,BillDispatchMethodObjectKeyData BDMDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillDispatchMethodDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BDMDeleteIn != null) BillDispatchMethodObjectKeyHelper.toMap (BDMDeleteIn, record, "BillDispatchMethod");
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
return BillDispatchMethodObjectHelper.fromMap (record, "BillDispatchMethod");
}

  private BSDMInteractionSpec _BillDispatchMethodCreateSpec = null;
  /**
   * Create a new BillDispatchMethod..
   * Convenience method using default BSDMSessionContext.
   * @param BDMCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillDispatchMethodObjectData create (BillDispatchMethodObjectData BDMCreateIn) throws BSDMResourceException
  {
    return create (null, BDMCreateIn);
  }
  /**
   * Create a new BillDispatchMethod..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillDispatchMethodObjectData create (@HeaderParam ("context")BSDMSessionContext context,BillDispatchMethodObjectData BDMCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillDispatchMethodCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BDMCreateIn != null) BillDispatchMethodObjectHelper.toMap (BDMCreateIn, record, "BillDispatchMethod");
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
return BillDispatchMethodObjectHelper.fromMap (record, "BillDispatchMethod");
}

  /**

   * Get a BillDispatchMethod..

   * Convenience method using default BSDMSessionContext.

   * @param BDMGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillDispatchMethodObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillDispatchMethodObjectData get (BillDispatchMethodObjectKeyData BDMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, BDMGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a BillDispatchMethod..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillDispatchMethodObjectData get (BSDMSessionContext context, BillDispatchMethodObjectKeyData BDMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BDMGetIn, defaultAction);
       
     cManager.checkConstraints(BDMGetIn, constraintAction);
       return get (context, BDMGetIn);
  }

  /**

   * Find BillDispatchMethod's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param BDMFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillDispatchMethodObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillDispatchMethodObjectDataList find (BillDispatchMethodObjectFilter BDMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, BDMFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find BillDispatchMethod's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillDispatchMethodObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillDispatchMethodObjectDataList find (BSDMSessionContext context, BillDispatchMethodObjectFilter BDMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BDMFindIn, defaultAction);
       
     cManager.checkConstraints(BDMFindIn, constraintAction);
       return find (context, BDMFindIn);
  }

  /**

   * Update non-key fields of a BillDispatchMethod row..

   * Convenience method using default BSDMSessionContext.

   * @param BDMUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillDispatchMethodObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillDispatchMethodObjectData update (BillDispatchMethodObjectData BDMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, BDMUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a BillDispatchMethod row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillDispatchMethodObjectData update (BSDMSessionContext context, BillDispatchMethodObjectData BDMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BDMUpdateIn, defaultAction);
       
     cManager.checkConstraints(BDMUpdateIn, constraintAction);
       return update (context, BDMUpdateIn);
  }

  /**

   * Delete a BillDispatchMethod row..

   * Convenience method using default BSDMSessionContext.

   * @param BDMDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillDispatchMethodObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillDispatchMethodObjectData delete (BillDispatchMethodObjectKeyData BDMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, BDMDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a BillDispatchMethod row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillDispatchMethodObjectData delete (BSDMSessionContext context, BillDispatchMethodObjectKeyData BDMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BDMDeleteIn, defaultAction);
       
     cManager.checkConstraints(BDMDeleteIn, constraintAction);
       return delete (context, BDMDeleteIn);
  }

  /**

   * Create a new BillDispatchMethod..

   * Convenience method using default BSDMSessionContext.

   * @param BDMCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillDispatchMethodObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillDispatchMethodObjectData create (BillDispatchMethodObjectData BDMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, BDMCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new BillDispatchMethod..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillDispatchMethodObjectData create (BSDMSessionContext context, BillDispatchMethodObjectData BDMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BDMCreateIn, defaultAction);
       
     cManager.checkConstraints(BDMCreateIn, constraintAction);
       return create (context, BDMCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public BillDispatchMethodBean ()
  {
    try
    {
      _BillDispatchMethodGetSpec = new BSDMInteractionSpec("BillDispatchMethodGet", ApiMappings.getCallName ("BillDispatchMethodGet"), Boolean.TRUE);

      _BillDispatchMethodFindSpec = new BSDMInteractionSpec("BillDispatchMethodFind", ApiMappings.getCallName ("BillDispatchMethodFind"), Boolean.TRUE);

      _BillDispatchMethodUpdateSpec = new BSDMInteractionSpec("BillDispatchMethodUpdate", ApiMappings.getCallName ("BillDispatchMethodUpdate"), Boolean.TRUE);

      _BillDispatchMethodDeleteSpec = new BSDMInteractionSpec("BillDispatchMethodDelete", ApiMappings.getCallName ("BillDispatchMethodDelete"), Boolean.TRUE);

      _BillDispatchMethodCreateSpec = new BSDMInteractionSpec("BillDispatchMethodCreate", ApiMappings.getCallName ("BillDispatchMethodCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public BillDispatchMethodBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public BillDispatchMethodBean(BSDMSettings settings, BSDMConnectionManager cm)
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
