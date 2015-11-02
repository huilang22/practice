
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AccountSegmentBean.java
 * Definition File: Admin/AccountSegment.xml
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
import com.csgsystems.bp.interfaces.AccountSegmentInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AccountSegmentSessionBean"
 * display-name="AccountSegment Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AccountSegmentBean"
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

@Stateless(name="AccountSegmentBean", mappedName = "AccountSegment")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AccountSegments")

public class AccountSegmentBean implements AccountSegmentInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AccountSegmentGetSpec = null;
  /**
   * Get an AccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param ASGetIn Input Object Key.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountSegmentObjectData get (AccountSegmentObjectKeyData ASGetIn) throws BSDMResourceException
  {
    return get (null, ASGetIn);
  }
  /**
   * Get an AccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASGetIn Input Object Key.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AccountSegmentObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountSegmentObjectKeyData ASGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountSegmentGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ASGetIn != null) AccountSegmentObjectKeyHelper.toMap (ASGetIn, record, "AccountSegment");
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
return AccountSegmentObjectHelper.fromMap (record, "AccountSegment");
}

  private BSDMInteractionSpec _AccountSegmentFindSpec = null;
  /**
   * Find AccountSegments that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ASFindIn Input Filter Object.
   * @return AccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountSegmentObjectDataList find (AccountSegmentObjectFilter ASFindIn) throws BSDMResourceException
  {
    return find (null, ASFindIn);
  }
  /**
   * Find AccountSegments that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASFindIn Input Filter Object.
   * @return AccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountSegmentObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AccountSegmentObjectFilter ASFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountSegmentFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ASFindIn != null) AccountSegmentObjectHelper.toMap (ASFindIn, record, "AccountSegment");
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
return AccountSegmentObjectHelper.fromMapList (record, "AccountSegmentList");
}

  private BSDMInteractionSpec _AccountSegmentUpdateSpec = null;
  /**
   * Update non-key fields of an AccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param ASUpdateIn Input  Object.
   * @param ASUpdateFilter Input Filter Object.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountSegmentObjectData update (AccountSegmentObjectData ASUpdateIn, AccountSegmentObjectFilter ASUpdateFilter) throws BSDMResourceException
  {
    return update (null, ASUpdateIn, ASUpdateFilter);
  }
  /**
   * Update non-key fields of an AccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASUpdateIn Input  Object.
   * @param ASUpdateFilter Input Filter Object.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountSegmentObjectData update (@HeaderParam ("context")BSDMSessionContext context,AccountSegmentObjectData ASUpdateIn,@FormParam("AccountSegmentObject")AccountSegmentObjectFilter ASUpdateFilter) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountSegmentUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ASUpdateIn != null) AccountSegmentObjectHelper.toMap (ASUpdateIn, record, "AccountSegment");
      if (ASUpdateFilter != null) AccountSegmentObjectHelper.toMap (ASUpdateFilter, record, "ASUpdateFilter");
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
return AccountSegmentObjectHelper.fromMap (record, "AccountSegment");
}

  private BSDMInteractionSpec _AccountSegmentDeleteSpec = null;
  /**
   * Delete AccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param ASDeleteIn Input Object Key.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountSegmentObjectData delete (AccountSegmentObjectKeyData ASDeleteIn) throws BSDMResourceException
  {
    return delete (null, ASDeleteIn);
  }
  /**
   * Delete AccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASDeleteIn Input Object Key.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountSegmentObjectData delete (@HeaderParam ("context")BSDMSessionContext context,AccountSegmentObjectKeyData ASDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountSegmentDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ASDeleteIn != null) AccountSegmentObjectKeyHelper.toMap (ASDeleteIn, record, "AccountSegment");
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
return AccountSegmentObjectHelper.fromMap (record, "AccountSegment");
}

  private BSDMInteractionSpec _AccountSegmentCreateSpec = null;
  /**
   * Create a new AccountSegment (or create a new AccountSegment description if the id already exists)..
   * Convenience method using default BSDMSessionContext.
   * @param ASCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountSegmentObjectData create (AccountSegmentObjectData ASCreateIn) throws BSDMResourceException
  {
    return create (null, ASCreateIn);
  }
  /**
   * Create a new AccountSegment (or create a new AccountSegment description if the id already exists)..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountSegmentObjectData create (@HeaderParam ("context")BSDMSessionContext context,AccountSegmentObjectData ASCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountSegmentCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ASCreateIn != null) AccountSegmentObjectHelper.toMap (ASCreateIn, record, "AccountSegment");
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
return AccountSegmentObjectHelper.fromMap (record, "AccountSegment");
}

  /**

   * Get an AccountSegment row..

   * Convenience method using default BSDMSessionContext.

   * @param ASGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountSegmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountSegmentObjectData get (AccountSegmentObjectKeyData ASGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, ASGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get an AccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountSegmentObjectData get (BSDMSessionContext context, AccountSegmentObjectKeyData ASGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ASGetIn, defaultAction);
       
     cManager.checkConstraints(ASGetIn, constraintAction);
       return get (context, ASGetIn);
  }

  /**

   * Find AccountSegments that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param ASFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountSegmentObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountSegmentObjectDataList find (AccountSegmentObjectFilter ASFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, ASFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find AccountSegments that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountSegmentObjectDataList find (BSDMSessionContext context, AccountSegmentObjectFilter ASFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ASFindIn, defaultAction);
       
     cManager.checkConstraints(ASFindIn, constraintAction);
       return find (context, ASFindIn);
  }

  /**

   * Update non-key fields of an AccountSegment row..

   * Convenience method using default BSDMSessionContext.

   * @param ASUpdateIn Input  Object.

   * @param ASUpdateFilter Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountSegmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountSegmentObjectData update (AccountSegmentObjectData ASUpdateIn, AccountSegmentObjectFilter ASUpdateFilter, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, ASUpdateIn, ASUpdateFilter, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of an AccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASUpdateIn Input  Object.
   * @param ASUpdateFilter Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountSegmentObjectData update (BSDMSessionContext context, AccountSegmentObjectData ASUpdateIn, AccountSegmentObjectFilter ASUpdateFilter, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ASUpdateIn, defaultAction);
       
     dManager.setObjectDefaults(ASUpdateFilter, defaultAction);
       
     cManager.checkConstraints(ASUpdateIn, constraintAction);
       
     cManager.checkConstraints(ASUpdateFilter, constraintAction);
       return update (context, ASUpdateIn, ASUpdateFilter);
  }

  /**

   * Delete AccountSegment row..

   * Convenience method using default BSDMSessionContext.

   * @param ASDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountSegmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountSegmentObjectData delete (AccountSegmentObjectKeyData ASDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, ASDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete AccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountSegmentObjectData delete (BSDMSessionContext context, AccountSegmentObjectKeyData ASDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ASDeleteIn, defaultAction);
       
     cManager.checkConstraints(ASDeleteIn, constraintAction);
       return delete (context, ASDeleteIn);
  }

  /**

   * Create a new AccountSegment (or create a new AccountSegment description if the id already exists)..

   * Convenience method using default BSDMSessionContext.

   * @param ASCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountSegmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountSegmentObjectData create (AccountSegmentObjectData ASCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, ASCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new AccountSegment (or create a new AccountSegment description if the id already exists)..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountSegmentObjectData create (BSDMSessionContext context, AccountSegmentObjectData ASCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ASCreateIn, defaultAction);
       
     cManager.checkConstraints(ASCreateIn, constraintAction);
       return create (context, ASCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AccountSegmentBean ()
  {
    try
    {
      _AccountSegmentGetSpec = new BSDMInteractionSpec("AccountSegmentGet", ApiMappings.getCallName ("AccountSegmentGet"), Boolean.TRUE);

      _AccountSegmentFindSpec = new BSDMInteractionSpec("AccountSegmentFind", ApiMappings.getCallName ("AccountSegmentFind"), Boolean.TRUE);

      _AccountSegmentUpdateSpec = new BSDMInteractionSpec("AccountSegmentUpdate", ApiMappings.getCallName ("AccountSegmentUpdate"), Boolean.TRUE);

      _AccountSegmentDeleteSpec = new BSDMInteractionSpec("AccountSegmentDelete", ApiMappings.getCallName ("AccountSegmentDelete"), Boolean.TRUE);

      _AccountSegmentCreateSpec = new BSDMInteractionSpec("AccountSegmentCreate", ApiMappings.getCallName ("AccountSegmentCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AccountSegmentBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AccountSegmentBean(BSDMSettings settings, BSDMConnectionManager cm)
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
