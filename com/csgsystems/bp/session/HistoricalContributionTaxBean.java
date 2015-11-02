
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: HistoricalContributionTaxBean.java
 * Definition File: Customer/HistoricalContributionTax.xml
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
import com.csgsystems.bp.interfaces.HistoricalContributionTaxInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="HistoricalContributionTaxSessionBean"
 * display-name="HistoricalContributionTax Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/HistoricalContributionTaxBean"
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

@Stateless(name="HistoricalContributionTaxBean", mappedName = "HistoricalContributionTax")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("HistoricalContributionTaxs")

public class HistoricalContributionTaxBean implements HistoricalContributionTaxInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _HistoricalContributionTaxGetSpec = null;
  /**
   * Retrieve a unique HistoricalContributionTax row..
   * Convenience method using default BSDMSessionContext.
   * @param HCTGetIn Input Object Key.
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HistoricalContributionTaxObjectData get (HistoricalContributionTaxObjectKeyData HCTGetIn) throws BSDMResourceException
  {
    return get (null, HCTGetIn);
  }
  /**
   * Retrieve a unique HistoricalContributionTax row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTGetIn Input Object Key.
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public HistoricalContributionTaxObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam HistoricalContributionTaxObjectKeyData HCTGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalContributionTaxGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HCTGetIn != null) HistoricalContributionTaxObjectKeyHelper.toMap (HCTGetIn, record, "HistoricalContributionTax");
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
return HistoricalContributionTaxObjectHelper.fromMap (record, "HistoricalContributionTax");
}

  private BSDMInteractionSpec _HistoricalContributionTaxFindSpec = null;
  /**
   * Find HistoricalContributionTax rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HCTFindIn Input Filter Object.
   * @return HistoricalContributionTaxObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HistoricalContributionTaxObjectDataList find (HistoricalContributionTaxObjectFilter HCTFindIn) throws BSDMResourceException
  {
    return find (null, HCTFindIn);
  }
  /**
   * Find HistoricalContributionTax rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTFindIn Input Filter Object.
   * @return HistoricalContributionTaxObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HistoricalContributionTaxObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,HistoricalContributionTaxObjectFilter HCTFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalContributionTaxFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HCTFindIn != null) HistoricalContributionTaxObjectHelper.toMap (HCTFindIn, record, "HistoricalContributionTax");
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
return HistoricalContributionTaxObjectHelper.fromMapList (record, "HistoricalContributionTaxList");
}

  private BSDMInteractionSpec _HistoricalContributionTaxUpdateSpec = null;
  /**
   * Update non-key fields of a HistoricalContributionTax..
   * Convenience method using default BSDMSessionContext.
   * @param HCTUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HistoricalContributionTaxObjectData update (HistoricalContributionTaxObjectData HCTUpdateIn) throws BSDMResourceException
  {
    return update (null, HCTUpdateIn);
  }
  /**
   * Update non-key fields of a HistoricalContributionTax..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HistoricalContributionTaxObjectData update (@HeaderParam ("context")BSDMSessionContext context,HistoricalContributionTaxObjectData HCTUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalContributionTaxUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HCTUpdateIn != null) HistoricalContributionTaxObjectHelper.toMap (HCTUpdateIn, record, "HistoricalContributionTax");
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
return HistoricalContributionTaxObjectHelper.fromMap (record, "HistoricalContributionTax");
}

  private BSDMInteractionSpec _HistoricalContributionTaxCreateSpec = null;
  /**
   * Create a new HistoricalContributionTax row..
   * Convenience method using default BSDMSessionContext.
   * @param HCTCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HistoricalContributionTaxObjectData create (HistoricalContributionTaxObjectData HCTCreateIn) throws BSDMResourceException
  {
    return create (null, HCTCreateIn);
  }
  /**
   * Create a new HistoricalContributionTax row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HistoricalContributionTaxObjectData create (@HeaderParam ("context")BSDMSessionContext context,HistoricalContributionTaxObjectData HCTCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalContributionTaxCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HCTCreateIn != null) HistoricalContributionTaxObjectHelper.toMap (HCTCreateIn, record, "HistoricalContributionTax");
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
return HistoricalContributionTaxObjectHelper.fromMap (record, "HistoricalContributionTax");
}

  /**

   * Retrieve a unique HistoricalContributionTax row..

   * Convenience method using default BSDMSessionContext.

   * @param HCTGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HistoricalContributionTaxObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HistoricalContributionTaxObjectData get (HistoricalContributionTaxObjectKeyData HCTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, HCTGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique HistoricalContributionTax row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HistoricalContributionTaxObjectData get (BSDMSessionContext context, HistoricalContributionTaxObjectKeyData HCTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HCTGetIn, defaultAction);
       
     cManager.checkConstraints(HCTGetIn, constraintAction);
       return get (context, HCTGetIn);
  }

  /**

   * Find HistoricalContributionTax rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param HCTFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HistoricalContributionTaxObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HistoricalContributionTaxObjectDataList find (HistoricalContributionTaxObjectFilter HCTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, HCTFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find HistoricalContributionTax rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HistoricalContributionTaxObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HistoricalContributionTaxObjectDataList find (BSDMSessionContext context, HistoricalContributionTaxObjectFilter HCTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HCTFindIn, defaultAction);
       
     cManager.checkConstraints(HCTFindIn, constraintAction);
       return find (context, HCTFindIn);
  }

  /**

   * Update non-key fields of a HistoricalContributionTax..

   * Convenience method using default BSDMSessionContext.

   * @param HCTUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HistoricalContributionTaxObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HistoricalContributionTaxObjectData update (HistoricalContributionTaxObjectData HCTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, HCTUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a HistoricalContributionTax..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HistoricalContributionTaxObjectData update (BSDMSessionContext context, HistoricalContributionTaxObjectData HCTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HCTUpdateIn, defaultAction);
       
     cManager.checkConstraints(HCTUpdateIn, constraintAction);
       return update (context, HCTUpdateIn);
  }

  /**

   * Create a new HistoricalContributionTax row..

   * Convenience method using default BSDMSessionContext.

   * @param HCTCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HistoricalContributionTaxObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HistoricalContributionTaxObjectData create (HistoricalContributionTaxObjectData HCTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, HCTCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new HistoricalContributionTax row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HistoricalContributionTaxObjectData create (BSDMSessionContext context, HistoricalContributionTaxObjectData HCTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HCTCreateIn, defaultAction);
       
     cManager.checkConstraints(HCTCreateIn, constraintAction);
       return create (context, HCTCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public HistoricalContributionTaxBean ()
  {
    try
    {
      _HistoricalContributionTaxGetSpec = new BSDMInteractionSpec("HistoricalContributionTaxGet", ApiMappings.getCallName ("HistoricalContributionTaxGet"), Boolean.TRUE);

      _HistoricalContributionTaxFindSpec = new BSDMInteractionSpec("HistoricalContributionTaxFind", ApiMappings.getCallName ("HistoricalContributionTaxFind"), Boolean.TRUE);

      _HistoricalContributionTaxUpdateSpec = new BSDMInteractionSpec("HistoricalContributionTaxUpdate", ApiMappings.getCallName ("HistoricalContributionTaxUpdate"), Boolean.TRUE);

      _HistoricalContributionTaxCreateSpec = new BSDMInteractionSpec("HistoricalContributionTaxCreate", ApiMappings.getCallName ("HistoricalContributionTaxCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public HistoricalContributionTaxBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public HistoricalContributionTaxBean(BSDMSettings settings, BSDMConnectionManager cm)
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
