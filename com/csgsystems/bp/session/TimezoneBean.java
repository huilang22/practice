
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: TimezoneBean.java
 * Definition File: Admin/Timezone.xml
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
import com.csgsystems.bp.interfaces.TimezoneInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="TimezoneSessionBean"
 * display-name="Timezone Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/TimezoneBean"
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

@Stateless(name="TimezoneBean", mappedName = "Timezone")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Timezones")

public class TimezoneBean implements TimezoneInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _TimezoneGetSpec = null;
  /**
   * Get a unique Timezone..
   * Convenience method using default BSDMSessionContext.
   * @param TZGetIn Input Object Key.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TimezoneObjectData get (TimezoneObjectKeyData TZGetIn) throws BSDMResourceException
  {
    return get (null, TZGetIn);
  }
  /**
   * Get a unique Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZGetIn Input Object Key.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public TimezoneObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam TimezoneObjectKeyData TZGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TimezoneGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TZGetIn != null) TimezoneObjectKeyHelper.toMap (TZGetIn, record, "Timezone");
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
return TimezoneObjectHelper.fromMap (record, "Timezone");
}

  private BSDMInteractionSpec _TimezoneFindSpec = null;
  /**
   * Find Timezone's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TZFindIn Input Filter Object.
   * @return TimezoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TimezoneObjectDataList find (TimezoneObjectFilter TZFindIn) throws BSDMResourceException
  {
    return find (null, TZFindIn);
  }
  /**
   * Find Timezone's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZFindIn Input Filter Object.
   * @return TimezoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TimezoneObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,TimezoneObjectFilter TZFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TimezoneFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TZFindIn != null) TimezoneObjectHelper.toMap (TZFindIn, record, "Timezone");
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
return TimezoneObjectHelper.fromMapList (record, "TimezoneList");
}

  private BSDMInteractionSpec _TimezoneUpdateSpec = null;
  /**
   * Update the non-key fields of a Timezone..
   * Convenience method using default BSDMSessionContext.
   * @param TZUpdateIn Input  Object.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TimezoneObjectData update (TimezoneObjectData TZUpdateIn) throws BSDMResourceException
  {
    return update (null, TZUpdateIn);
  }
  /**
   * Update the non-key fields of a Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZUpdateIn Input  Object.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TimezoneObjectData update (@HeaderParam ("context")BSDMSessionContext context,TimezoneObjectData TZUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TimezoneUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TZUpdateIn != null) TimezoneObjectHelper.toMap (TZUpdateIn, record, "Timezone");
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
return TimezoneObjectHelper.fromMap (record, "Timezone");
}

  private BSDMInteractionSpec _TimezoneDeleteSpec = null;
  /**
   * Delete a Timezone..
   * Convenience method using default BSDMSessionContext.
   * @param TZDeleteIn Input Object Key.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TimezoneObjectData delete (TimezoneObjectKeyData TZDeleteIn) throws BSDMResourceException
  {
    return delete (null, TZDeleteIn);
  }
  /**
   * Delete a Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZDeleteIn Input Object Key.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TimezoneObjectData delete (@HeaderParam ("context")BSDMSessionContext context,TimezoneObjectKeyData TZDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TimezoneDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TZDeleteIn != null) TimezoneObjectKeyHelper.toMap (TZDeleteIn, record, "Timezone");
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
return TimezoneObjectHelper.fromMap (record, "Timezone");
}

  private BSDMInteractionSpec _TimezoneCreateSpec = null;
  /**
   * Create a new Timezone..
   * Convenience method using default BSDMSessionContext.
   * @param TZCreateIn Input  Object.  Defaulted Fields: Isdst, IsDefault, IsInternal.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TimezoneObjectData create (TimezoneObjectData TZCreateIn) throws BSDMResourceException
  {
    return create (null, TZCreateIn);
  }
  /**
   * Create a new Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZCreateIn Input  Object.  Defaulted Fields: Isdst, IsDefault, IsInternal.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TimezoneObjectData create (@HeaderParam ("context")BSDMSessionContext context,TimezoneObjectData TZCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TimezoneCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TZCreateIn != null) TimezoneObjectHelper.toMap (TZCreateIn, record, "Timezone");
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
return TimezoneObjectHelper.fromMap (record, "Timezone");
}

  /**

   * Get a unique Timezone..

   * Convenience method using default BSDMSessionContext.

   * @param TZGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TimezoneObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TimezoneObjectData get (TimezoneObjectKeyData TZGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, TZGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TimezoneObjectData get (BSDMSessionContext context, TimezoneObjectKeyData TZGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TZGetIn, defaultAction);
       
     cManager.checkConstraints(TZGetIn, constraintAction);
       return get (context, TZGetIn);
  }

  /**

   * Find Timezone's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param TZFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TimezoneObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TimezoneObjectDataList find (TimezoneObjectFilter TZFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, TZFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find Timezone's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TimezoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TimezoneObjectDataList find (BSDMSessionContext context, TimezoneObjectFilter TZFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TZFindIn, defaultAction);
       
     cManager.checkConstraints(TZFindIn, constraintAction);
       return find (context, TZFindIn);
  }

  /**

   * Update the non-key fields of a Timezone..

   * Convenience method using default BSDMSessionContext.

   * @param TZUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TimezoneObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TimezoneObjectData update (TimezoneObjectData TZUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, TZUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of a Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TimezoneObjectData update (BSDMSessionContext context, TimezoneObjectData TZUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TZUpdateIn, defaultAction);
       
     cManager.checkConstraints(TZUpdateIn, constraintAction);
       return update (context, TZUpdateIn);
  }

  /**

   * Delete a Timezone..

   * Convenience method using default BSDMSessionContext.

   * @param TZDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TimezoneObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TimezoneObjectData delete (TimezoneObjectKeyData TZDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, TZDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TimezoneObjectData delete (BSDMSessionContext context, TimezoneObjectKeyData TZDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TZDeleteIn, defaultAction);
       
     cManager.checkConstraints(TZDeleteIn, constraintAction);
       return delete (context, TZDeleteIn);
  }

  /**

   * Create a new Timezone..

   * Convenience method using default BSDMSessionContext.

   * @param TZCreateIn Input  Object.  Defaulted Fields: Isdst, IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TimezoneObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TimezoneObjectData create (TimezoneObjectData TZCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, TZCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZCreateIn Input  Object.  Defaulted Fields: Isdst, IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TimezoneObjectData create (BSDMSessionContext context, TimezoneObjectData TZCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TZCreateIn, defaultAction);
       
     cManager.checkConstraints(TZCreateIn, constraintAction);
       return create (context, TZCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public TimezoneBean ()
  {
    try
    {
      _TimezoneGetSpec = new BSDMInteractionSpec("TimezoneGet", ApiMappings.getCallName ("TimezoneGet"), Boolean.TRUE);

      _TimezoneFindSpec = new BSDMInteractionSpec("TimezoneFind", ApiMappings.getCallName ("TimezoneFind"), Boolean.TRUE);

      _TimezoneUpdateSpec = new BSDMInteractionSpec("TimezoneUpdate", ApiMappings.getCallName ("TimezoneUpdate"), Boolean.TRUE);

      _TimezoneDeleteSpec = new BSDMInteractionSpec("TimezoneDelete", ApiMappings.getCallName ("TimezoneDelete"), Boolean.TRUE);

      _TimezoneCreateSpec = new BSDMInteractionSpec("TimezoneCreate", ApiMappings.getCallName ("TimezoneCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public TimezoneBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public TimezoneBean(BSDMSettings settings, BSDMConnectionManager cm)
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
