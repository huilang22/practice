
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CsrGroupAmountBean.java
 * Definition File: Admin/CsrGroupAmount.xml
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
import com.csgsystems.bp.interfaces.CsrGroupAmountInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CsrGroupAmountSessionBean"
 * display-name="CsrGroupAmount Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CsrGroupAmountBean"
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

@Stateless(name="CsrGroupAmountBean", mappedName = "CsrGroupAmount")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("CsrGroupAmounts")

public class CsrGroupAmountBean implements CsrGroupAmountInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CsrGroupAmountGetSpec = null;
  /**
   * Retrieve a unique CsrGroupAmount row..
   * Convenience method using default BSDMSessionContext.
   * @param GAGetIn Input Object Key.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrGroupAmountObjectData get (CsrGroupAmountObjectKeyData GAGetIn) throws BSDMResourceException
  {
    return get (null, GAGetIn);
  }
  /**
   * Retrieve a unique CsrGroupAmount row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GAGetIn Input Object Key.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public CsrGroupAmountObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CsrGroupAmountObjectKeyData GAGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrGroupAmountGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GAGetIn != null) CsrGroupAmountObjectKeyHelper.toMap (GAGetIn, record, "CsrGroupAmount");
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
return CsrGroupAmountObjectHelper.fromMap (record, "CsrGroupAmount");
}

  private BSDMInteractionSpec _CsrGroupAmountFindSpec = null;
  /**
   * Find CsrGroupAmount rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GAFindIn Input Filter Object.
   * @return CsrGroupAmountObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrGroupAmountObjectDataList find (CsrGroupAmountObjectFilter GAFindIn) throws BSDMResourceException
  {
    return find (null, GAFindIn);
  }
  /**
   * Find CsrGroupAmount rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GAFindIn Input Filter Object.
   * @return CsrGroupAmountObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CsrGroupAmountObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,CsrGroupAmountObjectFilter GAFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrGroupAmountFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GAFindIn != null) CsrGroupAmountObjectHelper.toMap (GAFindIn, record, "CsrGroupAmount");
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
return CsrGroupAmountObjectHelper.fromMapList (record, "CsrGroupAmountList");
}

  private BSDMInteractionSpec _CsrGroupAmountUpdateSpec = null;
  /**
   * Update non-key fields of a CsrGroupAmount..
   * Convenience method using default BSDMSessionContext.
   * @param GAUpdateIn Input  Object.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrGroupAmountObjectData update (CsrGroupAmountObjectData GAUpdateIn) throws BSDMResourceException
  {
    return update (null, GAUpdateIn);
  }
  /**
   * Update non-key fields of a CsrGroupAmount..
   * @param context The session context to use when connecting to the APITS server.
   * @param GAUpdateIn Input  Object.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CsrGroupAmountObjectData update (@HeaderParam ("context")BSDMSessionContext context,CsrGroupAmountObjectData GAUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrGroupAmountUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GAUpdateIn != null) CsrGroupAmountObjectHelper.toMap (GAUpdateIn, record, "CsrGroupAmount");
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
return CsrGroupAmountObjectHelper.fromMap (record, "CsrGroupAmount");
}

  private BSDMInteractionSpec _CsrGroupAmountDeleteSpec = null;
  /**
   * Delete a CsrGroupAmount row..
   * Convenience method using default BSDMSessionContext.
   * @param GADeleteIn Input Object Key.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrGroupAmountObjectData delete (CsrGroupAmountObjectKeyData GADeleteIn) throws BSDMResourceException
  {
    return delete (null, GADeleteIn);
  }
  /**
   * Delete a CsrGroupAmount row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GADeleteIn Input Object Key.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CsrGroupAmountObjectData delete (@HeaderParam ("context")BSDMSessionContext context,CsrGroupAmountObjectKeyData GADeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrGroupAmountDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GADeleteIn != null) CsrGroupAmountObjectKeyHelper.toMap (GADeleteIn, record, "CsrGroupAmount");
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
return CsrGroupAmountObjectHelper.fromMap (record, "CsrGroupAmount");
}

  private BSDMInteractionSpec _CsrGroupAmountCreateSpec = null;
  /**
   * Create a new CsrGroupAmount row..
   * Convenience method using default BSDMSessionContext.
   * @param GACreateIn Input  Object.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrGroupAmountObjectData create (CsrGroupAmountObjectData GACreateIn) throws BSDMResourceException
  {
    return create (null, GACreateIn);
  }
  /**
   * Create a new CsrGroupAmount row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GACreateIn Input  Object.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CsrGroupAmountObjectData create (@HeaderParam ("context")BSDMSessionContext context,CsrGroupAmountObjectData GACreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrGroupAmountCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GACreateIn != null) CsrGroupAmountObjectHelper.toMap (GACreateIn, record, "CsrGroupAmount");
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
return CsrGroupAmountObjectHelper.fromMap (record, "CsrGroupAmount");
}

  /**

   * Retrieve a unique CsrGroupAmount row..

   * Convenience method using default BSDMSessionContext.

   * @param GAGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrGroupAmountObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrGroupAmountObjectData get (CsrGroupAmountObjectKeyData GAGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, GAGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique CsrGroupAmount row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GAGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrGroupAmountObjectData get (BSDMSessionContext context, CsrGroupAmountObjectKeyData GAGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GAGetIn, defaultAction);
       
     cManager.checkConstraints(GAGetIn, constraintAction);
       return get (context, GAGetIn);
  }

  /**

   * Find CsrGroupAmount rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param GAFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrGroupAmountObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrGroupAmountObjectDataList find (CsrGroupAmountObjectFilter GAFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, GAFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find CsrGroupAmount rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GAFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrGroupAmountObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrGroupAmountObjectDataList find (BSDMSessionContext context, CsrGroupAmountObjectFilter GAFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GAFindIn, defaultAction);
       
     cManager.checkConstraints(GAFindIn, constraintAction);
       return find (context, GAFindIn);
  }

  /**

   * Update non-key fields of a CsrGroupAmount..

   * Convenience method using default BSDMSessionContext.

   * @param GAUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrGroupAmountObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrGroupAmountObjectData update (CsrGroupAmountObjectData GAUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, GAUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a CsrGroupAmount..
   * @param context The session context to use when connecting to the APITS server.
   * @param GAUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrGroupAmountObjectData update (BSDMSessionContext context, CsrGroupAmountObjectData GAUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GAUpdateIn, defaultAction);
       
     cManager.checkConstraints(GAUpdateIn, constraintAction);
       return update (context, GAUpdateIn);
  }

  /**

   * Delete a CsrGroupAmount row..

   * Convenience method using default BSDMSessionContext.

   * @param GADeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrGroupAmountObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrGroupAmountObjectData delete (CsrGroupAmountObjectKeyData GADeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, GADeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a CsrGroupAmount row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GADeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrGroupAmountObjectData delete (BSDMSessionContext context, CsrGroupAmountObjectKeyData GADeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GADeleteIn, defaultAction);
       
     cManager.checkConstraints(GADeleteIn, constraintAction);
       return delete (context, GADeleteIn);
  }

  /**

   * Create a new CsrGroupAmount row..

   * Convenience method using default BSDMSessionContext.

   * @param GACreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrGroupAmountObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrGroupAmountObjectData create (CsrGroupAmountObjectData GACreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, GACreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new CsrGroupAmount row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GACreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrGroupAmountObjectData create (BSDMSessionContext context, CsrGroupAmountObjectData GACreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GACreateIn, defaultAction);
       
     cManager.checkConstraints(GACreateIn, constraintAction);
       return create (context, GACreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CsrGroupAmountBean ()
  {
    try
    {
      _CsrGroupAmountGetSpec = new BSDMInteractionSpec("CsrGroupAmountGet", ApiMappings.getCallName ("CsrGroupAmountGet"), Boolean.TRUE);

      _CsrGroupAmountFindSpec = new BSDMInteractionSpec("CsrGroupAmountFind", ApiMappings.getCallName ("CsrGroupAmountFind"), Boolean.TRUE);

      _CsrGroupAmountUpdateSpec = new BSDMInteractionSpec("CsrGroupAmountUpdate", ApiMappings.getCallName ("CsrGroupAmountUpdate"), Boolean.TRUE);

      _CsrGroupAmountDeleteSpec = new BSDMInteractionSpec("CsrGroupAmountDelete", ApiMappings.getCallName ("CsrGroupAmountDelete"), Boolean.TRUE);

      _CsrGroupAmountCreateSpec = new BSDMInteractionSpec("CsrGroupAmountCreate", ApiMappings.getCallName ("CsrGroupAmountCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CsrGroupAmountBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CsrGroupAmountBean(BSDMSettings settings, BSDMConnectionManager cm)
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
