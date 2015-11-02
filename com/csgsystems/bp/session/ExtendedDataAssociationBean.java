
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ExtendedDataAssociationBean.java
 * Definition File: Admin/ExtendedDataAssociation.xml
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
import com.csgsystems.bp.interfaces.ExtendedDataAssociationInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ExtendedDataAssociationSessionBean"
 * display-name="ExtendedDataAssociation Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ExtendedDataAssociationBean"
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

@Stateless(name="ExtendedDataAssociationBean", mappedName = "ExtendedDataAssociation")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ExtendedDataAssociations")

public class ExtendedDataAssociationBean implements ExtendedDataAssociationInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ExtendedDataAssociationGetSpec = null;
  /**
   * Get a unique ExtendedDataAssociation row..
   * Convenience method using default BSDMSessionContext.
   * @param EDGetIn Input Object Key.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ExtendedDataObjectData get (ExtendedDataObjectKeyData EDGetIn) throws BSDMResourceException
  {
    return get (null, EDGetIn);
  }
  /**
   * Get a unique ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDGetIn Input Object Key.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ExtendedDataObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ExtendedDataObjectKeyData EDGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataAssociationGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EDGetIn != null) ExtendedDataObjectKeyHelper.toMap (EDGetIn, record, "ExtendedDataAssociation");
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
return ExtendedDataObjectHelper.fromMap (record, "ExtendedDataAssociation");
}

  private BSDMInteractionSpec _ExtendedDataAssociationFindSpec = null;
  /**
   * Find ExtendedDataAssociations that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param EDFindIn Input Filter Object.
   * @return ExtendedDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ExtendedDataObjectDataList find (ExtendedDataObjectFilter EDFindIn) throws BSDMResourceException
  {
    return find (null, EDFindIn);
  }
  /**
   * Find ExtendedDataAssociations that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDFindIn Input Filter Object.
   * @return ExtendedDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ExtendedDataObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ExtendedDataObjectFilter EDFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataAssociationFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EDFindIn != null) ExtendedDataObjectHelper.toMap (EDFindIn, record, "ExtendedDataAssociation");
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
return ExtendedDataObjectHelper.fromMapList (record, "ExtendedDataAssociationList");
}

  private BSDMInteractionSpec _ExtendedDataAssociationUpdateSpec = null;
  /**
   * Update the non-key fields of an ExtendedDataAssociation row..
   * Convenience method using default BSDMSessionContext.
   * @param EDUpdateIn Input  Object.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ExtendedDataObjectData update (ExtendedDataObjectData EDUpdateIn) throws BSDMResourceException
  {
    return update (null, EDUpdateIn);
  }
  /**
   * Update the non-key fields of an ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDUpdateIn Input  Object.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ExtendedDataObjectData update (@HeaderParam ("context")BSDMSessionContext context,ExtendedDataObjectData EDUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataAssociationUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EDUpdateIn != null) ExtendedDataObjectHelper.toMap (EDUpdateIn, record, "ExtendedDataAssociation");
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
return ExtendedDataObjectHelper.fromMap (record, "ExtendedDataAssociation");
}

  private BSDMInteractionSpec _ExtendedDataAssociationDeleteSpec = null;
  /**
   * Delete an ExtendedDataAssociation row..
   * Convenience method using default BSDMSessionContext.
   * @param EDDeleteIn Input Object Key.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ExtendedDataObjectData delete (ExtendedDataObjectKeyData EDDeleteIn) throws BSDMResourceException
  {
    return delete (null, EDDeleteIn);
  }
  /**
   * Delete an ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDDeleteIn Input Object Key.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ExtendedDataObjectData delete (@HeaderParam ("context")BSDMSessionContext context,ExtendedDataObjectKeyData EDDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataAssociationDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EDDeleteIn != null) ExtendedDataObjectKeyHelper.toMap (EDDeleteIn, record, "ExtendedDataAssociation");
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
return ExtendedDataObjectHelper.fromMap (record, "ExtendedDataAssociation");
}

  private BSDMInteractionSpec _ExtendedDataAssociationCreateSpec = null;
  /**
   * Create a new ExtendedDataAssociation row..
   * Convenience method using default BSDMSessionContext.
   * @param EDCreateIn Input  Object.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ExtendedDataObjectData create (ExtendedDataObjectData EDCreateIn) throws BSDMResourceException
  {
    return create (null, EDCreateIn);
  }
  /**
   * Create a new ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDCreateIn Input  Object.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ExtendedDataObjectData create (@HeaderParam ("context")BSDMSessionContext context,ExtendedDataObjectData EDCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataAssociationCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EDCreateIn != null) ExtendedDataObjectHelper.toMap (EDCreateIn, record, "ExtendedDataAssociation");
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
return ExtendedDataObjectHelper.fromMap (record, "ExtendedDataAssociation");
}

  /**

   * Get a unique ExtendedDataAssociation row..

   * Convenience method using default BSDMSessionContext.

   * @param EDGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ExtendedDataObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ExtendedDataObjectData get (ExtendedDataObjectKeyData EDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, EDGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ExtendedDataObjectData get (BSDMSessionContext context, ExtendedDataObjectKeyData EDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EDGetIn, defaultAction);
       
     cManager.checkConstraints(EDGetIn, constraintAction);
       return get (context, EDGetIn);
  }

  /**

   * Find ExtendedDataAssociations that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param EDFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ExtendedDataObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ExtendedDataObjectDataList find (ExtendedDataObjectFilter EDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, EDFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ExtendedDataAssociations that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ExtendedDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ExtendedDataObjectDataList find (BSDMSessionContext context, ExtendedDataObjectFilter EDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EDFindIn, defaultAction);
       
     cManager.checkConstraints(EDFindIn, constraintAction);
       return find (context, EDFindIn);
  }

  /**

   * Update the non-key fields of an ExtendedDataAssociation row..

   * Convenience method using default BSDMSessionContext.

   * @param EDUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ExtendedDataObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ExtendedDataObjectData update (ExtendedDataObjectData EDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, EDUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of an ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ExtendedDataObjectData update (BSDMSessionContext context, ExtendedDataObjectData EDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EDUpdateIn, defaultAction);
       
     cManager.checkConstraints(EDUpdateIn, constraintAction);
       return update (context, EDUpdateIn);
  }

  /**

   * Delete an ExtendedDataAssociation row..

   * Convenience method using default BSDMSessionContext.

   * @param EDDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ExtendedDataObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ExtendedDataObjectData delete (ExtendedDataObjectKeyData EDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, EDDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete an ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ExtendedDataObjectData delete (BSDMSessionContext context, ExtendedDataObjectKeyData EDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EDDeleteIn, defaultAction);
       
     cManager.checkConstraints(EDDeleteIn, constraintAction);
       return delete (context, EDDeleteIn);
  }

  /**

   * Create a new ExtendedDataAssociation row..

   * Convenience method using default BSDMSessionContext.

   * @param EDCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ExtendedDataObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ExtendedDataObjectData create (ExtendedDataObjectData EDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, EDCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ExtendedDataObjectData create (BSDMSessionContext context, ExtendedDataObjectData EDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EDCreateIn, defaultAction);
       
     cManager.checkConstraints(EDCreateIn, constraintAction);
       return create (context, EDCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ExtendedDataAssociationBean ()
  {
    try
    {
      _ExtendedDataAssociationGetSpec = new BSDMInteractionSpec("ExtendedDataAssociationGet", ApiMappings.getCallName ("ExtendedDataAssociationGet"), Boolean.TRUE);

      _ExtendedDataAssociationFindSpec = new BSDMInteractionSpec("ExtendedDataAssociationFind", ApiMappings.getCallName ("ExtendedDataAssociationFind"), Boolean.TRUE);

      _ExtendedDataAssociationUpdateSpec = new BSDMInteractionSpec("ExtendedDataAssociationUpdate", ApiMappings.getCallName ("ExtendedDataAssociationUpdate"), Boolean.TRUE);

      _ExtendedDataAssociationDeleteSpec = new BSDMInteractionSpec("ExtendedDataAssociationDelete", ApiMappings.getCallName ("ExtendedDataAssociationDelete"), Boolean.TRUE);

      _ExtendedDataAssociationCreateSpec = new BSDMInteractionSpec("ExtendedDataAssociationCreate", ApiMappings.getCallName ("ExtendedDataAssociationCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ExtendedDataAssociationBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ExtendedDataAssociationBean(BSDMSettings settings, BSDMConnectionManager cm)
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
