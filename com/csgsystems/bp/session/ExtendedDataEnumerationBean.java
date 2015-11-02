
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ExtendedDataEnumerationBean.java
 * Definition File: Admin/ExtendedDataEnumeration.xml
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
import com.csgsystems.bp.interfaces.ExtendedDataEnumerationInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ExtendedDataEnumerationSessionBean"
 * display-name="ExtendedDataEnumeration Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ExtendedDataEnumerationBean"
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

@Stateless(name="ExtendedDataEnumerationBean", mappedName = "ExtendedDataEnumeration")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ExtendedDataEnumerations")

public class ExtendedDataEnumerationBean implements ExtendedDataEnumerationInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ExtendedDataEnumerationGetSpec = null;
  /**
   * Get a unique ExtendedDataEnumeration row..
   * Convenience method using default BSDMSessionContext.
   * @param EDGetIn Input Object Key.
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EDObjectData get (EDObjectKeyData EDGetIn) throws BSDMResourceException
  {
    return get (null, EDGetIn);
  }
  /**
   * Get a unique ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDGetIn Input Object Key.
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public EDObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam EDObjectKeyData EDGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataEnumerationGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EDGetIn != null) EDObjectKeyHelper.toMap (EDGetIn, record, "ExtendedDataEnumeration");
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
return EDObjectHelper.fromMap (record, "ExtendedDataEnumeration");
}

  private BSDMInteractionSpec _ExtendedDataEnumerationFindSpec = null;
  /**
   * Find ExtendedDataEnumeration's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param EDFindIn Input Filter Object.
   * @return EDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EDObjectDataList find (EDObjectFilter EDFindIn) throws BSDMResourceException
  {
    return find (null, EDFindIn);
  }
  /**
   * Find ExtendedDataEnumeration's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDFindIn Input Filter Object.
   * @return EDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EDObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,EDObjectFilter EDFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataEnumerationFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EDFindIn != null) EDObjectHelper.toMap (EDFindIn, record, "ExtendedDataEnumeration");
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
return EDObjectHelper.fromMapList (record, "ExtendedDataEnumerationList");
}

  private BSDMInteractionSpec _ExtendedDataEnumerationUpdateSpec = null;
  /**
   * Update non-key fields of an ExtendedDataEnumeration row..
   * Convenience method using default BSDMSessionContext.
   * @param EDUpdateIn Input  Object.
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EDObjectData update (EDObjectData EDUpdateIn) throws BSDMResourceException
  {
    return update (null, EDUpdateIn);
  }
  /**
   * Update non-key fields of an ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDUpdateIn Input  Object.
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EDObjectData update (@HeaderParam ("context")BSDMSessionContext context,EDObjectData EDUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataEnumerationUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EDUpdateIn != null) EDObjectHelper.toMap (EDUpdateIn, record, "ExtendedDataEnumeration");
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
return EDObjectHelper.fromMap (record, "ExtendedDataEnumeration");
}

  private BSDMInteractionSpec _ExtendedDataEnumerationDeleteSpec = null;
  /**
   * Delete an ExtendedDataEnumeration row..
   * Convenience method using default BSDMSessionContext.
   * @param EDDeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void delete (EDObjectKeyData EDDeleteIn) throws BSDMResourceException
  {
    delete (null, EDDeleteIn);
  }
  /**
   * Delete an ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDDeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})

 public void delete (@HeaderParam ("context")BSDMSessionContext context,EDObjectKeyData EDDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataEnumerationDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EDDeleteIn != null) EDObjectKeyHelper.toMap (EDDeleteIn, record, "ExtendedDataEnumeration");
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
return;
}

  private BSDMInteractionSpec _ExtendedDataEnumerationCreateSpec = null;
  /**
   * Create a new ExtendedDataEnumeration row..
   * Convenience method using default BSDMSessionContext.
   * @param EDCreateIn Input  Object.
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EDObjectData create (EDObjectData EDCreateIn) throws BSDMResourceException
  {
    return create (null, EDCreateIn);
  }
  /**
   * Create a new ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDCreateIn Input  Object.
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EDObjectData create (@HeaderParam ("context")BSDMSessionContext context,EDObjectData EDCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExtendedDataEnumerationCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EDCreateIn != null) EDObjectHelper.toMap (EDCreateIn, record, "ExtendedDataEnumeration");
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
return EDObjectHelper.fromMap (record, "ExtendedDataEnumeration");
}

  /**

   * Get a unique ExtendedDataEnumeration row..

   * Convenience method using default BSDMSessionContext.

   * @param EDGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EDObjectData get (EDObjectKeyData EDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, EDGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EDObjectData get (BSDMSessionContext context, EDObjectKeyData EDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EDGetIn, defaultAction);
       
     cManager.checkConstraints(EDGetIn, constraintAction);
       return get (context, EDGetIn);
  }

  /**

   * Find ExtendedDataEnumeration's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param EDFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EDObjectDataList find (EDObjectFilter EDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, EDFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ExtendedDataEnumeration's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EDObjectDataList find (BSDMSessionContext context, EDObjectFilter EDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EDFindIn, defaultAction);
       
     cManager.checkConstraints(EDFindIn, constraintAction);
       return find (context, EDFindIn);
  }

  /**

   * Update non-key fields of an ExtendedDataEnumeration row..

   * Convenience method using default BSDMSessionContext.

   * @param EDUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EDObjectData update (EDObjectData EDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, EDUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of an ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EDObjectData update (BSDMSessionContext context, EDObjectData EDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EDUpdateIn, defaultAction);
       
     cManager.checkConstraints(EDUpdateIn, constraintAction);
       return update (context, EDUpdateIn);
  }

  /**

   * Delete an ExtendedDataEnumeration row..

   * Convenience method using default BSDMSessionContext.

   * @param EDDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void delete (EDObjectKeyData EDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    delete (null, EDDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete an ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void delete (BSDMSessionContext context, EDObjectKeyData EDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EDDeleteIn, defaultAction);
       
     cManager.checkConstraints(EDDeleteIn, constraintAction);
       delete (context, EDDeleteIn);
  }

  /**

   * Create a new ExtendedDataEnumeration row..

   * Convenience method using default BSDMSessionContext.

   * @param EDCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EDObjectData create (EDObjectData EDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, EDCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EDObjectData create (BSDMSessionContext context, EDObjectData EDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EDCreateIn, defaultAction);
       
     cManager.checkConstraints(EDCreateIn, constraintAction);
       return create (context, EDCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ExtendedDataEnumerationBean ()
  {
    try
    {
      _ExtendedDataEnumerationGetSpec = new BSDMInteractionSpec("ExtendedDataEnumerationGet", ApiMappings.getCallName ("ExtendedDataEnumerationGet"), Boolean.TRUE);

      _ExtendedDataEnumerationFindSpec = new BSDMInteractionSpec("ExtendedDataEnumerationFind", ApiMappings.getCallName ("ExtendedDataEnumerationFind"), Boolean.TRUE);

      _ExtendedDataEnumerationUpdateSpec = new BSDMInteractionSpec("ExtendedDataEnumerationUpdate", ApiMappings.getCallName ("ExtendedDataEnumerationUpdate"), Boolean.TRUE);

      _ExtendedDataEnumerationDeleteSpec = new BSDMInteractionSpec("ExtendedDataEnumerationDelete", ApiMappings.getCallName ("ExtendedDataEnumerationDelete"), Boolean.TRUE);

      _ExtendedDataEnumerationCreateSpec = new BSDMInteractionSpec("ExtendedDataEnumerationCreate", ApiMappings.getCallName ("ExtendedDataEnumerationCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ExtendedDataEnumerationBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ExtendedDataEnumerationBean(BSDMSettings settings, BSDMConnectionManager cm)
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
