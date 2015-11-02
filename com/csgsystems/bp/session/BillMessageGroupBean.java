
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: BillMessageGroupBean.java
 * Definition File: Admin/BillMessageGroup.xml
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
import com.csgsystems.bp.interfaces.BillMessageGroupInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="BillMessageGroupSessionBean"
 * display-name="BillMessageGroup Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/BillMessageGroupBean"
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

@Stateless(name="BillMessageGroupBean", mappedName = "BillMessageGroup")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("BillMessageGroups")

public class BillMessageGroupBean implements BillMessageGroupInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _BillMessageGroupGetSpec = null;
  /**
   * Get a BillMessageGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param MGIGetIn Input Object Key.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillMessageGroupObjectData get (BillMessageGroupObjectKeyData MGIGetIn) throws BSDMResourceException
  {
    return get (null, MGIGetIn);
  }
  /**
   * Get a BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIGetIn Input Object Key.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public BillMessageGroupObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BillMessageGroupObjectKeyData MGIGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillMessageGroupGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (MGIGetIn != null) BillMessageGroupObjectKeyHelper.toMap (MGIGetIn, record, "BillMessageGroup");
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
return BillMessageGroupObjectHelper.fromMap (record, "BillMessageGroup");
}

  private BSDMInteractionSpec _BillMessageGroupFindSpec = null;
  /**
   * Find BillMessageGroups that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param MGIFindIn Input Filter Object.
   * @return BillMessageGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillMessageGroupObjectDataList find (BillMessageGroupObjectFilter MGIFindIn) throws BSDMResourceException
  {
    return find (null, MGIFindIn);
  }
  /**
   * Find BillMessageGroups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIFindIn Input Filter Object.
   * @return BillMessageGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillMessageGroupObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,BillMessageGroupObjectFilter MGIFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillMessageGroupFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (MGIFindIn != null) BillMessageGroupObjectHelper.toMap (MGIFindIn, record, "BillMessageGroup");
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
return BillMessageGroupObjectHelper.fromMapList (record, "BillMessageGroupList");
}

  private BSDMInteractionSpec _BillMessageGroupUpdateSpec = null;
  /**
   * Update non-key fields of a BillMessageGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param MGIUpdateIn Input  Object.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillMessageGroupObjectData update (BillMessageGroupObjectData MGIUpdateIn) throws BSDMResourceException
  {
    return update (null, MGIUpdateIn);
  }
  /**
   * Update non-key fields of a BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIUpdateIn Input  Object.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillMessageGroupObjectData update (@HeaderParam ("context")BSDMSessionContext context,BillMessageGroupObjectData MGIUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillMessageGroupUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (MGIUpdateIn != null) BillMessageGroupObjectHelper.toMap (MGIUpdateIn, record, "BillMessageGroup");
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
return BillMessageGroupObjectHelper.fromMap (record, "BillMessageGroup");
}

  private BSDMInteractionSpec _BillMessageGroupDeleteSpec = null;
  /**
   * Delete a BillMessageGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param MGIDeleteIn Input Object Key.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillMessageGroupObjectData delete (BillMessageGroupObjectKeyData MGIDeleteIn) throws BSDMResourceException
  {
    return delete (null, MGIDeleteIn);
  }
  /**
   * Delete a BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIDeleteIn Input Object Key.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillMessageGroupObjectData delete (@HeaderParam ("context")BSDMSessionContext context,BillMessageGroupObjectKeyData MGIDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillMessageGroupDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (MGIDeleteIn != null) BillMessageGroupObjectKeyHelper.toMap (MGIDeleteIn, record, "BillMessageGroup");
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
return BillMessageGroupObjectHelper.fromMap (record, "BillMessageGroup");
}

  private BSDMInteractionSpec _BillMessageGroupCreateSpec = null;
  /**
   * Create a new BillMessageGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param MGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillMessageGroupObjectData create (BillMessageGroupObjectData MGICreateIn) throws BSDMResourceException
  {
    return create (null, MGICreateIn);
  }
  /**
   * Create a new BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillMessageGroupObjectData create (@HeaderParam ("context")BSDMSessionContext context,BillMessageGroupObjectData MGICreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillMessageGroupCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (MGICreateIn != null) BillMessageGroupObjectHelper.toMap (MGICreateIn, record, "BillMessageGroup");
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
return BillMessageGroupObjectHelper.fromMap (record, "BillMessageGroup");
}

  /**

   * Get a BillMessageGroup row..

   * Convenience method using default BSDMSessionContext.

   * @param MGIGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillMessageGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillMessageGroupObjectData get (BillMessageGroupObjectKeyData MGIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, MGIGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillMessageGroupObjectData get (BSDMSessionContext context, BillMessageGroupObjectKeyData MGIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(MGIGetIn, defaultAction);
       
     cManager.checkConstraints(MGIGetIn, constraintAction);
       return get (context, MGIGetIn);
  }

  /**

   * Find BillMessageGroups that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param MGIFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillMessageGroupObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillMessageGroupObjectDataList find (BillMessageGroupObjectFilter MGIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, MGIFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find BillMessageGroups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillMessageGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillMessageGroupObjectDataList find (BSDMSessionContext context, BillMessageGroupObjectFilter MGIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(MGIFindIn, defaultAction);
       
     cManager.checkConstraints(MGIFindIn, constraintAction);
       return find (context, MGIFindIn);
  }

  /**

   * Update non-key fields of a BillMessageGroup row..

   * Convenience method using default BSDMSessionContext.

   * @param MGIUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillMessageGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillMessageGroupObjectData update (BillMessageGroupObjectData MGIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, MGIUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillMessageGroupObjectData update (BSDMSessionContext context, BillMessageGroupObjectData MGIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(MGIUpdateIn, defaultAction);
       
     cManager.checkConstraints(MGIUpdateIn, constraintAction);
       return update (context, MGIUpdateIn);
  }

  /**

   * Delete a BillMessageGroup row..

   * Convenience method using default BSDMSessionContext.

   * @param MGIDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillMessageGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillMessageGroupObjectData delete (BillMessageGroupObjectKeyData MGIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, MGIDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillMessageGroupObjectData delete (BSDMSessionContext context, BillMessageGroupObjectKeyData MGIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(MGIDeleteIn, defaultAction);
       
     cManager.checkConstraints(MGIDeleteIn, constraintAction);
       return delete (context, MGIDeleteIn);
  }

  /**

   * Create a new BillMessageGroup row..

   * Convenience method using default BSDMSessionContext.

   * @param MGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillMessageGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillMessageGroupObjectData create (BillMessageGroupObjectData MGICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, MGICreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillMessageGroupObjectData create (BSDMSessionContext context, BillMessageGroupObjectData MGICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(MGICreateIn, defaultAction);
       
     cManager.checkConstraints(MGICreateIn, constraintAction);
       return create (context, MGICreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public BillMessageGroupBean ()
  {
    try
    {
      _BillMessageGroupGetSpec = new BSDMInteractionSpec("BillMessageGroupGet", ApiMappings.getCallName ("BillMessageGroupGet"), Boolean.TRUE);

      _BillMessageGroupFindSpec = new BSDMInteractionSpec("BillMessageGroupFind", ApiMappings.getCallName ("BillMessageGroupFind"), Boolean.TRUE);

      _BillMessageGroupUpdateSpec = new BSDMInteractionSpec("BillMessageGroupUpdate", ApiMappings.getCallName ("BillMessageGroupUpdate"), Boolean.TRUE);

      _BillMessageGroupDeleteSpec = new BSDMInteractionSpec("BillMessageGroupDelete", ApiMappings.getCallName ("BillMessageGroupDelete"), Boolean.TRUE);

      _BillMessageGroupCreateSpec = new BSDMInteractionSpec("BillMessageGroupCreate", ApiMappings.getCallName ("BillMessageGroupCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public BillMessageGroupBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public BillMessageGroupBean(BSDMSettings settings, BSDMConnectionManager cm)
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
