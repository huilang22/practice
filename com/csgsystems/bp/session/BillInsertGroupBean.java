
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: BillInsertGroupBean.java
 * Definition File: Admin/BillInsertGroup.xml
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
import com.csgsystems.bp.interfaces.BillInsertGroupInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="BillInsertGroupSessionBean"
 * display-name="BillInsertGroup Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/BillInsertGroupBean"
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

@Stateless(name="BillInsertGroupBean", mappedName = "BillInsertGroup")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("BillInsertGroups")

public class BillInsertGroupBean implements BillInsertGroupInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _BillInsertGroupGetSpec = null;
  /**
   * Get a BillInsertGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param IGIGetIn Input Object Key.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillInsertGroupObjectData get (BillInsertGroupObjectKeyData IGIGetIn) throws BSDMResourceException
  {
    return get (null, IGIGetIn);
  }
  /**
   * Get a BillInsertGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIGetIn Input Object Key.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public BillInsertGroupObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BillInsertGroupObjectKeyData IGIGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillInsertGroupGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (IGIGetIn != null) BillInsertGroupObjectKeyHelper.toMap (IGIGetIn, record, "BillInsertGroup");
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
return BillInsertGroupObjectHelper.fromMap (record, "BillInsertGroup");
}

  private BSDMInteractionSpec _BillInsertGroupFindSpec = null;
  /**
   * Find BillInsertGroups that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param IGIFindIn Input Filter Object.
   * @return BillInsertGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillInsertGroupObjectDataList find (BillInsertGroupObjectFilter IGIFindIn) throws BSDMResourceException
  {
    return find (null, IGIFindIn);
  }
  /**
   * Find BillInsertGroups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIFindIn Input Filter Object.
   * @return BillInsertGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillInsertGroupObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,BillInsertGroupObjectFilter IGIFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillInsertGroupFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (IGIFindIn != null) BillInsertGroupObjectHelper.toMap (IGIFindIn, record, "BillInsertGroup");
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
return BillInsertGroupObjectHelper.fromMapList (record, "BillInsertGroupList");
}

  private BSDMInteractionSpec _BillInsertGroupUpdateSpec = null;
  /**
   * Update non-key fields of a BillInsertGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param IGIUpdateIn Input  Object.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillInsertGroupObjectData update (BillInsertGroupObjectData IGIUpdateIn) throws BSDMResourceException
  {
    return update (null, IGIUpdateIn);
  }
  /**
   * Update non-key fields of a BillInsertGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIUpdateIn Input  Object.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillInsertGroupObjectData update (@HeaderParam ("context")BSDMSessionContext context,BillInsertGroupObjectData IGIUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillInsertGroupUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (IGIUpdateIn != null) BillInsertGroupObjectHelper.toMap (IGIUpdateIn, record, "BillInsertGroup");
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
return BillInsertGroupObjectHelper.fromMap (record, "BillInsertGroup");
}

  private BSDMInteractionSpec _BillInsertGroupDeleteSpec = null;
  /**
   * Delete a BillInsertGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param IGIDeleteIn Input Object Key.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillInsertGroupObjectData delete (BillInsertGroupObjectKeyData IGIDeleteIn) throws BSDMResourceException
  {
    return delete (null, IGIDeleteIn);
  }
  /**
   * Delete a BillInsertGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIDeleteIn Input Object Key.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillInsertGroupObjectData delete (@HeaderParam ("context")BSDMSessionContext context,BillInsertGroupObjectKeyData IGIDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillInsertGroupDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (IGIDeleteIn != null) BillInsertGroupObjectKeyHelper.toMap (IGIDeleteIn, record, "BillInsertGroup");
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
return BillInsertGroupObjectHelper.fromMap (record, "BillInsertGroup");
}

  private BSDMInteractionSpec _BillInsertGroupCreateSpec = null;
  /**
   * Create a new BillInsertGroup..
   * Convenience method using default BSDMSessionContext.
   * @param IGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillInsertGroupObjectData create (BillInsertGroupObjectData IGICreateIn) throws BSDMResourceException
  {
    return create (null, IGICreateIn);
  }
  /**
   * Create a new BillInsertGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillInsertGroupObjectData create (@HeaderParam ("context")BSDMSessionContext context,BillInsertGroupObjectData IGICreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillInsertGroupCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (IGICreateIn != null) BillInsertGroupObjectHelper.toMap (IGICreateIn, record, "BillInsertGroup");
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
return BillInsertGroupObjectHelper.fromMap (record, "BillInsertGroup");
}

  /**

   * Get a BillInsertGroup row..

   * Convenience method using default BSDMSessionContext.

   * @param IGIGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillInsertGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillInsertGroupObjectData get (BillInsertGroupObjectKeyData IGIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, IGIGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a BillInsertGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillInsertGroupObjectData get (BSDMSessionContext context, BillInsertGroupObjectKeyData IGIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(IGIGetIn, defaultAction);
       
     cManager.checkConstraints(IGIGetIn, constraintAction);
       return get (context, IGIGetIn);
  }

  /**

   * Find BillInsertGroups that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param IGIFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillInsertGroupObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillInsertGroupObjectDataList find (BillInsertGroupObjectFilter IGIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, IGIFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find BillInsertGroups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillInsertGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillInsertGroupObjectDataList find (BSDMSessionContext context, BillInsertGroupObjectFilter IGIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(IGIFindIn, defaultAction);
       
     cManager.checkConstraints(IGIFindIn, constraintAction);
       return find (context, IGIFindIn);
  }

  /**

   * Update non-key fields of a BillInsertGroup row..

   * Convenience method using default BSDMSessionContext.

   * @param IGIUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillInsertGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillInsertGroupObjectData update (BillInsertGroupObjectData IGIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, IGIUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a BillInsertGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillInsertGroupObjectData update (BSDMSessionContext context, BillInsertGroupObjectData IGIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(IGIUpdateIn, defaultAction);
       
     cManager.checkConstraints(IGIUpdateIn, constraintAction);
       return update (context, IGIUpdateIn);
  }

  /**

   * Delete a BillInsertGroup row..

   * Convenience method using default BSDMSessionContext.

   * @param IGIDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillInsertGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillInsertGroupObjectData delete (BillInsertGroupObjectKeyData IGIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, IGIDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a BillInsertGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillInsertGroupObjectData delete (BSDMSessionContext context, BillInsertGroupObjectKeyData IGIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(IGIDeleteIn, defaultAction);
       
     cManager.checkConstraints(IGIDeleteIn, constraintAction);
       return delete (context, IGIDeleteIn);
  }

  /**

   * Create a new BillInsertGroup..

   * Convenience method using default BSDMSessionContext.

   * @param IGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillInsertGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillInsertGroupObjectData create (BillInsertGroupObjectData IGICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, IGICreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new BillInsertGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillInsertGroupObjectData create (BSDMSessionContext context, BillInsertGroupObjectData IGICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(IGICreateIn, defaultAction);
       
     cManager.checkConstraints(IGICreateIn, constraintAction);
       return create (context, IGICreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public BillInsertGroupBean ()
  {
    try
    {
      _BillInsertGroupGetSpec = new BSDMInteractionSpec("BillInsertGroupGet", ApiMappings.getCallName ("BillInsertGroupGet"), Boolean.TRUE);

      _BillInsertGroupFindSpec = new BSDMInteractionSpec("BillInsertGroupFind", ApiMappings.getCallName ("BillInsertGroupFind"), Boolean.TRUE);

      _BillInsertGroupUpdateSpec = new BSDMInteractionSpec("BillInsertGroupUpdate", ApiMappings.getCallName ("BillInsertGroupUpdate"), Boolean.TRUE);

      _BillInsertGroupDeleteSpec = new BSDMInteractionSpec("BillInsertGroupDelete", ApiMappings.getCallName ("BillInsertGroupDelete"), Boolean.TRUE);

      _BillInsertGroupCreateSpec = new BSDMInteractionSpec("BillInsertGroupCreate", ApiMappings.getCallName ("BillInsertGroupCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public BillInsertGroupBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public BillInsertGroupBean(BSDMSettings settings, BSDMConnectionManager cm)
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
