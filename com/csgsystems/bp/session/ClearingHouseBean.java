
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ClearingHouseBean.java
 * Definition File: Admin/ClearingHouse.xml
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
import com.csgsystems.bp.interfaces.ClearingHouseInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ClearingHouseSessionBean"
 * display-name="ClearingHouse Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ClearingHouseBean"
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

@Stateless(name="ClearingHouseBean", mappedName = "ClearingHouse")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ClearingHouses")

public class ClearingHouseBean implements ClearingHouseInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ClearingHouseGetSpec = null;
  /**
   * Get a ClearingHouse object..
   * Convenience method using default BSDMSessionContext.
   * @param CHIGetIn Input Object Key.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ClearingHouseObjectData get (ClearingHouseObjectKeyData CHIGetIn) throws BSDMResourceException
  {
    return get (null, CHIGetIn);
  }
  /**
   * Get a ClearingHouse object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIGetIn Input Object Key.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ClearingHouseObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ClearingHouseObjectKeyData CHIGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ClearingHouseGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CHIGetIn != null) ClearingHouseObjectKeyHelper.toMap (CHIGetIn, record, "ClearingHouse");
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
return ClearingHouseObjectHelper.fromMap (record, "ClearingHouse");
}

  private BSDMInteractionSpec _ClearingHouseFindSpec = null;
  /**
   * Find ClearingHouse's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CHIFindIn Input Filter Object.
   * @return ClearingHouseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ClearingHouseObjectDataList find (ClearingHouseObjectFilter CHIFindIn) throws BSDMResourceException
  {
    return find (null, CHIFindIn);
  }
  /**
   * Find ClearingHouse's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIFindIn Input Filter Object.
   * @return ClearingHouseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ClearingHouseObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ClearingHouseObjectFilter CHIFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ClearingHouseFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CHIFindIn != null) ClearingHouseObjectHelper.toMap (CHIFindIn, record, "ClearingHouse");
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
return ClearingHouseObjectHelper.fromMapList (record, "ClearingHouseList");
}

  private BSDMInteractionSpec _ClearingHouseUpdateSpec = null;
  /**
   * Update non-key fields of a ClearingHouse row..
   * Convenience method using default BSDMSessionContext.
   * @param CHIUpdateIn Input  Object.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ClearingHouseObjectData update (ClearingHouseObjectData CHIUpdateIn) throws BSDMResourceException
  {
    return update (null, CHIUpdateIn);
  }
  /**
   * Update non-key fields of a ClearingHouse row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIUpdateIn Input  Object.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ClearingHouseObjectData update (@HeaderParam ("context")BSDMSessionContext context,ClearingHouseObjectData CHIUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ClearingHouseUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CHIUpdateIn != null) ClearingHouseObjectHelper.toMap (CHIUpdateIn, record, "ClearingHouse");
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
return ClearingHouseObjectHelper.fromMap (record, "ClearingHouse");
}

  private BSDMInteractionSpec _ClearingHouseDeleteSpec = null;
  /**
   * Delete a ClearingHouse row..
   * Convenience method using default BSDMSessionContext.
   * @param CHIDeleteIn Input Object Key.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ClearingHouseObjectData delete (ClearingHouseObjectKeyData CHIDeleteIn) throws BSDMResourceException
  {
    return delete (null, CHIDeleteIn);
  }
  /**
   * Delete a ClearingHouse row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIDeleteIn Input Object Key.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ClearingHouseObjectData delete (@HeaderParam ("context")BSDMSessionContext context,ClearingHouseObjectKeyData CHIDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ClearingHouseDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CHIDeleteIn != null) ClearingHouseObjectKeyHelper.toMap (CHIDeleteIn, record, "ClearingHouse");
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
return ClearingHouseObjectHelper.fromMap (record, "ClearingHouse");
}

  private BSDMInteractionSpec _ClearingHouseCreateSpec = null;
  /**
   * Create a new ClearingHouse..
   * Convenience method using default BSDMSessionContext.
   * @param CHICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ClearingHouseObjectData create (ClearingHouseObjectData CHICreateIn) throws BSDMResourceException
  {
    return create (null, CHICreateIn);
  }
  /**
   * Create a new ClearingHouse..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ClearingHouseObjectData create (@HeaderParam ("context")BSDMSessionContext context,ClearingHouseObjectData CHICreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ClearingHouseCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CHICreateIn != null) ClearingHouseObjectHelper.toMap (CHICreateIn, record, "ClearingHouse");
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
return ClearingHouseObjectHelper.fromMap (record, "ClearingHouse");
}

  /**

   * Get a ClearingHouse object..

   * Convenience method using default BSDMSessionContext.

   * @param CHIGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ClearingHouseObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ClearingHouseObjectData get (ClearingHouseObjectKeyData CHIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CHIGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a ClearingHouse object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ClearingHouseObjectData get (BSDMSessionContext context, ClearingHouseObjectKeyData CHIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CHIGetIn, defaultAction);
       
     cManager.checkConstraints(CHIGetIn, constraintAction);
       return get (context, CHIGetIn);
  }

  /**

   * Find ClearingHouse's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CHIFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ClearingHouseObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ClearingHouseObjectDataList find (ClearingHouseObjectFilter CHIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CHIFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ClearingHouse's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ClearingHouseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ClearingHouseObjectDataList find (BSDMSessionContext context, ClearingHouseObjectFilter CHIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CHIFindIn, defaultAction);
       
     cManager.checkConstraints(CHIFindIn, constraintAction);
       return find (context, CHIFindIn);
  }

  /**

   * Update non-key fields of a ClearingHouse row..

   * Convenience method using default BSDMSessionContext.

   * @param CHIUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ClearingHouseObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ClearingHouseObjectData update (ClearingHouseObjectData CHIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CHIUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a ClearingHouse row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ClearingHouseObjectData update (BSDMSessionContext context, ClearingHouseObjectData CHIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CHIUpdateIn, defaultAction);
       
     cManager.checkConstraints(CHIUpdateIn, constraintAction);
       return update (context, CHIUpdateIn);
  }

  /**

   * Delete a ClearingHouse row..

   * Convenience method using default BSDMSessionContext.

   * @param CHIDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ClearingHouseObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ClearingHouseObjectData delete (ClearingHouseObjectKeyData CHIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, CHIDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a ClearingHouse row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ClearingHouseObjectData delete (BSDMSessionContext context, ClearingHouseObjectKeyData CHIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CHIDeleteIn, defaultAction);
       
     cManager.checkConstraints(CHIDeleteIn, constraintAction);
       return delete (context, CHIDeleteIn);
  }

  /**

   * Create a new ClearingHouse..

   * Convenience method using default BSDMSessionContext.

   * @param CHICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ClearingHouseObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ClearingHouseObjectData create (ClearingHouseObjectData CHICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CHICreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new ClearingHouse..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ClearingHouseObjectData create (BSDMSessionContext context, ClearingHouseObjectData CHICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CHICreateIn, defaultAction);
       
     cManager.checkConstraints(CHICreateIn, constraintAction);
       return create (context, CHICreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ClearingHouseBean ()
  {
    try
    {
      _ClearingHouseGetSpec = new BSDMInteractionSpec("ClearingHouseGet", ApiMappings.getCallName ("ClearingHouseGet"), Boolean.TRUE);

      _ClearingHouseFindSpec = new BSDMInteractionSpec("ClearingHouseFind", ApiMappings.getCallName ("ClearingHouseFind"), Boolean.TRUE);

      _ClearingHouseUpdateSpec = new BSDMInteractionSpec("ClearingHouseUpdate", ApiMappings.getCallName ("ClearingHouseUpdate"), Boolean.TRUE);

      _ClearingHouseDeleteSpec = new BSDMInteractionSpec("ClearingHouseDelete", ApiMappings.getCallName ("ClearingHouseDelete"), Boolean.TRUE);

      _ClearingHouseCreateSpec = new BSDMInteractionSpec("ClearingHouseCreate", ApiMappings.getCallName ("ClearingHouseCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ClearingHouseBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ClearingHouseBean(BSDMSettings settings, BSDMConnectionManager cm)
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
