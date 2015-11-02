
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ProductChargeMapBean.java
 * Definition File: Customer/ProductChargeMap.xml
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
import com.csgsystems.bp.interfaces.ProductChargeMapInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ProductChargeMapSessionBean"
 * display-name="ProductChargeMap Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ProductChargeMapBean"
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

@Stateless(name="ProductChargeMapBean", mappedName = "ProductChargeMap")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ProductChargeMaps")

public class ProductChargeMapBean implements ProductChargeMapInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ProductChargeMapCreateSpec = null;
  /**
   * Create a new ProductChargeMap..
   * Convenience method using default BSDMSessionContext.
   * @param PCMapCreateIn Input  Object.  Defaulted Fields: InArrearsOverride, ActivationCode, TerminationCode.  Derived Fields: ActiveDt.
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductChargeMapObjectData create (ProductChargeMapObjectData PCMapCreateIn) throws BSDMResourceException
  {
    return create (null, PCMapCreateIn);
  }
  /**
   * Create a new ProductChargeMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapCreateIn Input  Object.  Defaulted Fields: InArrearsOverride, ActivationCode, TerminationCode.  Derived Fields: ActiveDt.
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ProductChargeMapObjectData create (@HeaderParam ("context")BSDMSessionContext context,ProductChargeMapObjectData PCMapCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductChargeMapCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PCMapCreateIn != null) ProductChargeMapObjectHelper.toMap (PCMapCreateIn, record, "ProductChargeMap");
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
return ProductChargeMapObjectHelper.fromMap (record, "ProductChargeMap");
}

  private BSDMInteractionSpec _ProductChargeMapGetSpec = null;
  /**
   * Get a unique ProductChargeMap row..
   * Convenience method using default BSDMSessionContext.
   * @param PCMapGetIn Input Object Key.
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductChargeMapObjectData get (ProductChargeMapObjectKeyData PCMapGetIn) throws BSDMResourceException
  {
    return get (null, PCMapGetIn);
  }
  /**
   * Get a unique ProductChargeMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapGetIn Input Object Key.
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ProductChargeMapObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ProductChargeMapObjectKeyData PCMapGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductChargeMapGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PCMapGetIn != null) ProductChargeMapObjectKeyHelper.toMap (PCMapGetIn, record, "ProductChargeMap");
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
return ProductChargeMapObjectHelper.fromMap (record, "ProductChargeMap");
}

  private BSDMInteractionSpec _ProductChargeMapFindSpec = null;
  /**
   * Find ProductChargeMap's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PCMapFindIn Input Filter Object.
   * @return ProductChargeMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductChargeMapObjectDataList find (ProductChargeMapObjectFilter PCMapFindIn) throws BSDMResourceException
  {
    return find (null, PCMapFindIn);
  }
  /**
   * Find ProductChargeMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapFindIn Input Filter Object.
   * @return ProductChargeMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ProductChargeMapObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ProductChargeMapObjectFilter PCMapFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductChargeMapFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PCMapFindIn != null) ProductChargeMapObjectHelper.toMap (PCMapFindIn, record, "ProductChargeMap");
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
return ProductChargeMapObjectHelper.fromMapList (record, "ProductChargeMapList");
}

  private BSDMInteractionSpec _ProductChargeMapUpdateSpec = null;
  /**
   * Update non-key fields of a ProductChargeMap..
   * Convenience method using default BSDMSessionContext.
   * @param PCMapUpdateIn Input  Object.
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductChargeMapObjectData update (ProductChargeMapObjectData PCMapUpdateIn) throws BSDMResourceException
  {
    return update (null, PCMapUpdateIn);
  }
  /**
   * Update non-key fields of a ProductChargeMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapUpdateIn Input  Object.
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ProductChargeMapObjectData update (@HeaderParam ("context")BSDMSessionContext context,ProductChargeMapObjectData PCMapUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductChargeMapUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PCMapUpdateIn != null) ProductChargeMapObjectHelper.toMap (PCMapUpdateIn, record, "ProductChargeMap");
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
return ProductChargeMapObjectHelper.fromMap (record, "ProductChargeMap");
}

  /**

   * Create a new ProductChargeMap..

   * Convenience method using default BSDMSessionContext.

   * @param PCMapCreateIn Input  Object.  Defaulted Fields: InArrearsOverride, ActivationCode, TerminationCode.  Derived Fields: ActiveDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductChargeMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductChargeMapObjectData create (ProductChargeMapObjectData PCMapCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, PCMapCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new ProductChargeMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapCreateIn Input  Object.  Defaulted Fields: InArrearsOverride, ActivationCode, TerminationCode.  Derived Fields: ActiveDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductChargeMapObjectData create (BSDMSessionContext context, ProductChargeMapObjectData PCMapCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PCMapCreateIn, defaultAction);
       
     cManager.checkConstraints(PCMapCreateIn, constraintAction);
       return create (context, PCMapCreateIn);
  }

  /**

   * Get a unique ProductChargeMap row..

   * Convenience method using default BSDMSessionContext.

   * @param PCMapGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductChargeMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductChargeMapObjectData get (ProductChargeMapObjectKeyData PCMapGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, PCMapGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique ProductChargeMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductChargeMapObjectData get (BSDMSessionContext context, ProductChargeMapObjectKeyData PCMapGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PCMapGetIn, defaultAction);
       
     cManager.checkConstraints(PCMapGetIn, constraintAction);
       return get (context, PCMapGetIn);
  }

  /**

   * Find ProductChargeMap's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param PCMapFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductChargeMapObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductChargeMapObjectDataList find (ProductChargeMapObjectFilter PCMapFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, PCMapFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ProductChargeMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductChargeMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductChargeMapObjectDataList find (BSDMSessionContext context, ProductChargeMapObjectFilter PCMapFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PCMapFindIn, defaultAction);
       
     cManager.checkConstraints(PCMapFindIn, constraintAction);
       return find (context, PCMapFindIn);
  }

  /**

   * Update non-key fields of a ProductChargeMap..

   * Convenience method using default BSDMSessionContext.

   * @param PCMapUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductChargeMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductChargeMapObjectData update (ProductChargeMapObjectData PCMapUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, PCMapUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a ProductChargeMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductChargeMapObjectData update (BSDMSessionContext context, ProductChargeMapObjectData PCMapUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PCMapUpdateIn, defaultAction);
       
     cManager.checkConstraints(PCMapUpdateIn, constraintAction);
       return update (context, PCMapUpdateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ProductChargeMapBean ()
  {
    try
    {
      _ProductChargeMapCreateSpec = new BSDMInteractionSpec("ProductChargeMapCreate", ApiMappings.getCallName ("ProductChargeMapCreate"), Boolean.TRUE);

      _ProductChargeMapGetSpec = new BSDMInteractionSpec("ProductChargeMapGet", ApiMappings.getCallName ("ProductChargeMapGet"), Boolean.TRUE);

      _ProductChargeMapFindSpec = new BSDMInteractionSpec("ProductChargeMapFind", ApiMappings.getCallName ("ProductChargeMapFind"), Boolean.TRUE);

      _ProductChargeMapUpdateSpec = new BSDMInteractionSpec("ProductChargeMapUpdate", ApiMappings.getCallName ("ProductChargeMapUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ProductChargeMapBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ProductChargeMapBean(BSDMSettings settings, BSDMConnectionManager cm)
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
