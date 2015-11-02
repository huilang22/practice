
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: RegulatoryIdBean.java
 * Definition File: Admin/RegulatoryId.xml
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
import com.csgsystems.bp.interfaces.RegulatoryIdInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="RegulatoryIdSessionBean"
 * display-name="RegulatoryId Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/RegulatoryIdBean"
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

@Stateless(name="RegulatoryIdBean", mappedName = "RegulatoryId")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("RegulatoryIds")

public class RegulatoryIdBean implements RegulatoryIdInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _RegulatoryIdGetSpec = null;
  /**
   * Retreive a unique RegulatoryId row..
   * Convenience method using default BSDMSessionContext.
   * @param RIGetIn Input Object Key.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RegulatoryIdObjectData get (RegulatoryIdObjectKeyData RIGetIn) throws BSDMResourceException
  {
    return get (null, RIGetIn);
  }
  /**
   * Retreive a unique RegulatoryId row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIGetIn Input Object Key.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public RegulatoryIdObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam RegulatoryIdObjectKeyData RIGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RegulatoryIdGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RIGetIn != null) RegulatoryIdObjectKeyHelper.toMap (RIGetIn, record, "RegulatoryId");
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
return RegulatoryIdObjectHelper.fromMap (record, "RegulatoryId");
}

  private BSDMInteractionSpec _RegulatoryIdFindSpec = null;
  /**
   * Find RegulatoryId's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RIFindIn Input Filter Object.
   * @return RegulatoryIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RegulatoryIdObjectDataList find (RegulatoryIdObjectFilter RIFindIn) throws BSDMResourceException
  {
    return find (null, RIFindIn);
  }
  /**
   * Find RegulatoryId's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIFindIn Input Filter Object.
   * @return RegulatoryIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RegulatoryIdObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,RegulatoryIdObjectFilter RIFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RegulatoryIdFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RIFindIn != null) RegulatoryIdObjectHelper.toMap (RIFindIn, record, "RegulatoryId");
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
return RegulatoryIdObjectHelper.fromMapList (record, "RegulatoryIdList");
}

  private BSDMInteractionSpec _RegulatoryIdUpdateSpec = null;
  /**
   * Update the non-key fields of a RegulatoryId..
   * Convenience method using default BSDMSessionContext.
   * @param RIUpdateIn Input  Object.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RegulatoryIdObjectData update (RegulatoryIdObjectData RIUpdateIn) throws BSDMResourceException
  {
    return update (null, RIUpdateIn);
  }
  /**
   * Update the non-key fields of a RegulatoryId..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIUpdateIn Input  Object.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RegulatoryIdObjectData update (@HeaderParam ("context")BSDMSessionContext context,RegulatoryIdObjectData RIUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RegulatoryIdUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RIUpdateIn != null) RegulatoryIdObjectHelper.toMap (RIUpdateIn, record, "RegulatoryId");
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
return RegulatoryIdObjectHelper.fromMap (record, "RegulatoryId");
}

  private BSDMInteractionSpec _RegulatoryIdDeleteSpec = null;
  /**
   * Delete a RegulatoryId..
   * Convenience method using default BSDMSessionContext.
   * @param RIDeleteIn Input Object Key.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RegulatoryIdObjectData delete (RegulatoryIdObjectKeyData RIDeleteIn) throws BSDMResourceException
  {
    return delete (null, RIDeleteIn);
  }
  /**
   * Delete a RegulatoryId..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIDeleteIn Input Object Key.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RegulatoryIdObjectData delete (@HeaderParam ("context")BSDMSessionContext context,RegulatoryIdObjectKeyData RIDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RegulatoryIdDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RIDeleteIn != null) RegulatoryIdObjectKeyHelper.toMap (RIDeleteIn, record, "RegulatoryId");
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
return RegulatoryIdObjectHelper.fromMap (record, "RegulatoryId");
}

  private BSDMInteractionSpec _RegulatoryIdCreateSpec = null;
  /**
   * Create a new RegulatoryId..
   * Convenience method using default BSDMSessionContext.
   * @param RICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RegulatoryIdObjectData create (RegulatoryIdObjectData RICreateIn) throws BSDMResourceException
  {
    return create (null, RICreateIn);
  }
  /**
   * Create a new RegulatoryId..
   * @param context The session context to use when connecting to the APITS server.
   * @param RICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RegulatoryIdObjectData create (@HeaderParam ("context")BSDMSessionContext context,RegulatoryIdObjectData RICreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RegulatoryIdCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RICreateIn != null) RegulatoryIdObjectHelper.toMap (RICreateIn, record, "RegulatoryId");
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
return RegulatoryIdObjectHelper.fromMap (record, "RegulatoryId");
}

  /**

   * Retreive a unique RegulatoryId row..

   * Convenience method using default BSDMSessionContext.

   * @param RIGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RegulatoryIdObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RegulatoryIdObjectData get (RegulatoryIdObjectKeyData RIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, RIGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retreive a unique RegulatoryId row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RegulatoryIdObjectData get (BSDMSessionContext context, RegulatoryIdObjectKeyData RIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RIGetIn, defaultAction);
       
     cManager.checkConstraints(RIGetIn, constraintAction);
       return get (context, RIGetIn);
  }

  /**

   * Find RegulatoryId's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param RIFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RegulatoryIdObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RegulatoryIdObjectDataList find (RegulatoryIdObjectFilter RIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, RIFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find RegulatoryId's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RegulatoryIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RegulatoryIdObjectDataList find (BSDMSessionContext context, RegulatoryIdObjectFilter RIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RIFindIn, defaultAction);
       
     cManager.checkConstraints(RIFindIn, constraintAction);
       return find (context, RIFindIn);
  }

  /**

   * Update the non-key fields of a RegulatoryId..

   * Convenience method using default BSDMSessionContext.

   * @param RIUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RegulatoryIdObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RegulatoryIdObjectData update (RegulatoryIdObjectData RIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, RIUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of a RegulatoryId..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RegulatoryIdObjectData update (BSDMSessionContext context, RegulatoryIdObjectData RIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RIUpdateIn, defaultAction);
       
     cManager.checkConstraints(RIUpdateIn, constraintAction);
       return update (context, RIUpdateIn);
  }

  /**

   * Delete a RegulatoryId..

   * Convenience method using default BSDMSessionContext.

   * @param RIDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RegulatoryIdObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RegulatoryIdObjectData delete (RegulatoryIdObjectKeyData RIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, RIDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a RegulatoryId..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RegulatoryIdObjectData delete (BSDMSessionContext context, RegulatoryIdObjectKeyData RIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RIDeleteIn, defaultAction);
       
     cManager.checkConstraints(RIDeleteIn, constraintAction);
       return delete (context, RIDeleteIn);
  }

  /**

   * Create a new RegulatoryId..

   * Convenience method using default BSDMSessionContext.

   * @param RICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RegulatoryIdObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RegulatoryIdObjectData create (RegulatoryIdObjectData RICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, RICreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new RegulatoryId..
   * @param context The session context to use when connecting to the APITS server.
   * @param RICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RegulatoryIdObjectData create (BSDMSessionContext context, RegulatoryIdObjectData RICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RICreateIn, defaultAction);
       
     cManager.checkConstraints(RICreateIn, constraintAction);
       return create (context, RICreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public RegulatoryIdBean ()
  {
    try
    {
      _RegulatoryIdGetSpec = new BSDMInteractionSpec("RegulatoryIdGet", ApiMappings.getCallName ("RegulatoryIdGet"), Boolean.TRUE);

      _RegulatoryIdFindSpec = new BSDMInteractionSpec("RegulatoryIdFind", ApiMappings.getCallName ("RegulatoryIdFind"), Boolean.TRUE);

      _RegulatoryIdUpdateSpec = new BSDMInteractionSpec("RegulatoryIdUpdate", ApiMappings.getCallName ("RegulatoryIdUpdate"), Boolean.TRUE);

      _RegulatoryIdDeleteSpec = new BSDMInteractionSpec("RegulatoryIdDelete", ApiMappings.getCallName ("RegulatoryIdDelete"), Boolean.TRUE);

      _RegulatoryIdCreateSpec = new BSDMInteractionSpec("RegulatoryIdCreate", ApiMappings.getCallName ("RegulatoryIdCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public RegulatoryIdBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public RegulatoryIdBean(BSDMSettings settings, BSDMConnectionManager cm)
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
