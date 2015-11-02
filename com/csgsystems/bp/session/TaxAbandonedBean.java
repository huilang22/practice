
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: TaxAbandonedBean.java
 * Definition File: Customer/TaxAbandoned.xml
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
import com.csgsystems.bp.interfaces.TaxAbandonedInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="TaxAbandonedSessionBean"
 * display-name="TaxAbandoned Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/TaxAbandonedBean"
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

@Stateless(name="TaxAbandonedBean", mappedName = "TaxAbandoned")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("TaxAbandoneds")

public class TaxAbandonedBean implements TaxAbandonedInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _TaxAbandonedGetSpec = null;
  /**
   * Returns one TaxAbandoned object matching the supplied key value..
   * Convenience method using default BSDMSessionContext.
   * @param TAget_In Input Object Key.
   * @return TaxAbandonedObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TaxAbandonedObjectData get (TaxAbandonedObjectKeyData TAget_In) throws BSDMResourceException
  {
    return get (null, TAget_In);
  }
  /**
   * Returns one TaxAbandoned object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param TAget_In Input Object Key.
   * @return TaxAbandonedObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public TaxAbandonedObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam TaxAbandonedObjectKeyData TAget_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TaxAbandonedGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TAget_In != null) TaxAbandonedObjectKeyHelper.toMap (TAget_In, record, "TaxAbandoned");
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
return TaxAbandonedObjectHelper.fromMap (record, "TaxAbandoned");
}

  private BSDMInteractionSpec _TaxAbandonedFindSpec = null;
  /**
   * Finds all TaxAbandoned objects matching the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TAfind_In Input Filter Object.
   * @return TaxAbandonedObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TaxAbandonedObjectDataList find (TaxAbandonedObjectFilter TAfind_In) throws BSDMResourceException
  {
    return find (null, TAfind_In);
  }
  /**
   * Finds all TaxAbandoned objects matching the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TAfind_In Input Filter Object.
   * @return TaxAbandonedObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TaxAbandonedObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,TaxAbandonedObjectFilter TAfind_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TaxAbandonedFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TAfind_In != null) TaxAbandonedObjectHelper.toMap (TAfind_In, record, "TaxAbandoned");
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
return TaxAbandonedObjectHelper.fromMapList (record, "TaxAbandonedList");
}

  /**

   * Returns one TaxAbandoned object matching the supplied key value..

   * Convenience method using default BSDMSessionContext.

   * @param TAget_In Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TaxAbandonedObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TaxAbandonedObjectData get (TaxAbandonedObjectKeyData TAget_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, TAget_In, defaultAction, constraintAction);
  }
  /** 
   * Returns one TaxAbandoned object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param TAget_In Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TaxAbandonedObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TaxAbandonedObjectData get (BSDMSessionContext context, TaxAbandonedObjectKeyData TAget_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TAget_In, defaultAction);
       
     cManager.checkConstraints(TAget_In, constraintAction);
       return get (context, TAget_In);
  }

  /**

   * Finds all TaxAbandoned objects matching the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param TAfind_In Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TaxAbandonedObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TaxAbandonedObjectDataList find (TaxAbandonedObjectFilter TAfind_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, TAfind_In, defaultAction, constraintAction);
  }
  /** 
   * Finds all TaxAbandoned objects matching the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TAfind_In Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TaxAbandonedObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TaxAbandonedObjectDataList find (BSDMSessionContext context, TaxAbandonedObjectFilter TAfind_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TAfind_In, defaultAction);
       
     cManager.checkConstraints(TAfind_In, constraintAction);
       return find (context, TAfind_In);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public TaxAbandonedBean ()
  {
    try
    {
      _TaxAbandonedGetSpec = new BSDMInteractionSpec("TaxAbandonedGet", ApiMappings.getCallName ("TaxAbandonedGet"), Boolean.TRUE);

      _TaxAbandonedFindSpec = new BSDMInteractionSpec("TaxAbandonedFind", ApiMappings.getCallName ("TaxAbandonedFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public TaxAbandonedBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public TaxAbandonedBean(BSDMSettings settings, BSDMConnectionManager cm)
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
