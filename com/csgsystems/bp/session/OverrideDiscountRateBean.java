
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: OverrideDiscountRateBean.java
 * Definition File: Customer/OverrideDiscountRate.xml
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
import com.csgsystems.bp.interfaces.OverrideDiscountRateInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="OverrideDiscountRateSessionBean"
 * display-name="OverrideDiscountRate Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/OverrideDiscountRateBean"
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

@Stateless(name="OverrideDiscountRateBean", mappedName = "OverrideDiscountRate")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("OverrideDiscountRates")

public class OverrideDiscountRateBean implements OverrideDiscountRateInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _OverrideDiscountRateGetSpec = null;
  /**
   * Get a unique OverrideDiscountRate that matches the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param RDOGetIn Input Object Key.
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RDOverrideObjectData get (RDOverrideObjectKeyData RDOGetIn) throws BSDMResourceException
  {
    return get (null, RDOGetIn);
  }
  /**
   * Get a unique OverrideDiscountRate that matches the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOGetIn Input Object Key.
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public RDOverrideObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam RDOverrideObjectKeyData RDOGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OverrideDiscountRateGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RDOGetIn != null) RDOverrideObjectKeyHelper.toMap (RDOGetIn, record, "OverrideDiscountRate");
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
return RDOverrideObjectHelper.fromMap (record, "OverrideDiscountRate");
}

  private BSDMInteractionSpec _OverrideDiscountRateFindSpec = null;
  /**
   * Find OverrideDiscountRate's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RDOFindIn Input Filter Object.
   * @return RDOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RDOverrideObjectDataList find (RDOverrideObjectFilter RDOFindIn) throws BSDMResourceException
  {
    return find (null, RDOFindIn);
  }
  /**
   * Find OverrideDiscountRate's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOFindIn Input Filter Object.
   * @return RDOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RDOverrideObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,RDOverrideObjectFilter RDOFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OverrideDiscountRateFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RDOFindIn != null) RDOverrideObjectHelper.toMap (RDOFindIn, record, "OverrideDiscountRate");
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
return RDOverrideObjectHelper.fromMapList (record, "OverrideDiscountRateList");
}

  private BSDMInteractionSpec _OverrideDiscountRateUpdateSpec = null;
  /**
   * Update the non-key fields of an OverrideDiscountRate object..
   * Convenience method using default BSDMSessionContext.
   * @param RDOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RDOverrideObjectData update (RDOverrideObjectData RDOUpdateIn) throws BSDMResourceException
  {
    return update (null, RDOUpdateIn);
  }
  /**
   * Update the non-key fields of an OverrideDiscountRate object..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RDOverrideObjectData update (@HeaderParam ("context")BSDMSessionContext context,RDOverrideObjectData RDOUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OverrideDiscountRateUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RDOUpdateIn != null) RDOverrideObjectHelper.toMap (RDOUpdateIn, record, "OverrideDiscountRate");
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
return RDOverrideObjectHelper.fromMap (record, "OverrideDiscountRate");
}

  private BSDMInteractionSpec _OverrideDiscountRateCreateSpec = null;
  /**
   * Create a new OverrideDiscountRate..
   * Convenience method using default BSDMSessionContext.
   * @param RDOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Defaulted Fields: CurrencyCode, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RDOverrideObjectData create (RDOverrideObjectData RDOCreateIn) throws BSDMResourceException
  {
    return create (null, RDOCreateIn);
  }
  /**
   * Create a new OverrideDiscountRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Defaulted Fields: CurrencyCode, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RDOverrideObjectData create (@HeaderParam ("context")BSDMSessionContext context,RDOverrideObjectData RDOCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OverrideDiscountRateCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RDOCreateIn != null) RDOverrideObjectHelper.toMap (RDOCreateIn, record, "OverrideDiscountRate");
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
return RDOverrideObjectHelper.fromMap (record, "OverrideDiscountRate");
}

  /**

   * Get a unique OverrideDiscountRate that matches the supplied key..

   * Convenience method using default BSDMSessionContext.

   * @param RDOGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RDOverrideObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RDOverrideObjectData get (RDOverrideObjectKeyData RDOGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, RDOGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique OverrideDiscountRate that matches the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RDOverrideObjectData get (BSDMSessionContext context, RDOverrideObjectKeyData RDOGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RDOGetIn, defaultAction);
       
     cManager.checkConstraints(RDOGetIn, constraintAction);
       return get (context, RDOGetIn);
  }

  /**

   * Find OverrideDiscountRate's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param RDOFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RDOverrideObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RDOverrideObjectDataList find (RDOverrideObjectFilter RDOFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, RDOFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find OverrideDiscountRate's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RDOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RDOverrideObjectDataList find (BSDMSessionContext context, RDOverrideObjectFilter RDOFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RDOFindIn, defaultAction);
       
     cManager.checkConstraints(RDOFindIn, constraintAction);
       return find (context, RDOFindIn);
  }

  /**

   * Update the non-key fields of an OverrideDiscountRate object..

   * Convenience method using default BSDMSessionContext.

   * @param RDOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RDOverrideObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RDOverrideObjectData update (RDOverrideObjectData RDOUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, RDOUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of an OverrideDiscountRate object..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RDOverrideObjectData update (BSDMSessionContext context, RDOverrideObjectData RDOUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RDOUpdateIn, defaultAction);
       
     cManager.checkConstraints(RDOUpdateIn, constraintAction);
       return update (context, RDOUpdateIn);
  }

  /**

   * Create a new OverrideDiscountRate..

   * Convenience method using default BSDMSessionContext.

   * @param RDOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Defaulted Fields: CurrencyCode, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RDOverrideObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RDOverrideObjectData create (RDOverrideObjectData RDOCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, RDOCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new OverrideDiscountRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Defaulted Fields: CurrencyCode, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RDOverrideObjectData create (BSDMSessionContext context, RDOverrideObjectData RDOCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RDOCreateIn, defaultAction);
       
     cManager.checkConstraints(RDOCreateIn, constraintAction);
       return create (context, RDOCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public OverrideDiscountRateBean ()
  {
    try
    {
      _OverrideDiscountRateGetSpec = new BSDMInteractionSpec("OverrideDiscountRateGet", ApiMappings.getCallName ("OverrideDiscountRateGet"), Boolean.TRUE);

      _OverrideDiscountRateFindSpec = new BSDMInteractionSpec("OverrideDiscountRateFind", ApiMappings.getCallName ("OverrideDiscountRateFind"), Boolean.TRUE);

      _OverrideDiscountRateUpdateSpec = new BSDMInteractionSpec("OverrideDiscountRateUpdate", ApiMappings.getCallName ("OverrideDiscountRateUpdate"), Boolean.TRUE);

      _OverrideDiscountRateCreateSpec = new BSDMInteractionSpec("OverrideDiscountRateCreate", ApiMappings.getCallName ("OverrideDiscountRateCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public OverrideDiscountRateBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public OverrideDiscountRateBean(BSDMSettings settings, BSDMConnectionManager cm)
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
