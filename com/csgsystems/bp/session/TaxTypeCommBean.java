
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: TaxTypeCommBean.java
 * Definition File: Admin/TaxTypeComm.xml
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
import com.csgsystems.bp.interfaces.TaxTypeCommInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="TaxTypeCommSessionBean"
 * display-name="TaxTypeComm Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/TaxTypeCommBean"
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

@Stateless(name="TaxTypeCommBean", mappedName = "TaxTypeComm")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("TaxTypeComms")

public class TaxTypeCommBean implements TaxTypeCommInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _TaxTypeCommGetSpec = null;
  /**
   * Get a unique TaxTypeComm..
   * Convenience method using default BSDMSessionContext.
   * @param TTCGetIn Input Object Key.
   * @return TTCObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TTCObjectData get (TTCObjectKeyData TTCGetIn) throws BSDMResourceException
  {
    return get (null, TTCGetIn);
  }
  /**
   * Get a unique TaxTypeComm..
   * @param context The session context to use when connecting to the APITS server.
   * @param TTCGetIn Input Object Key.
   * @return TTCObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public TTCObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam TTCObjectKeyData TTCGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TaxTypeCommGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TTCGetIn != null) TTCObjectKeyHelper.toMap (TTCGetIn, record, "TaxTypeComm");
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
return TTCObjectHelper.fromMap (record, "TaxTypeComm");
}

  private BSDMInteractionSpec _TaxTypeCommFindSpec = null;
  /**
   * Find TaxTypeComm's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TTCFindIn Input Filter Object.
   * @return TTCObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TTCObjectDataList find (TTCObjectFilter TTCFindIn) throws BSDMResourceException
  {
    return find (null, TTCFindIn);
  }
  /**
   * Find TaxTypeComm's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TTCFindIn Input Filter Object.
   * @return TTCObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TTCObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,TTCObjectFilter TTCFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TaxTypeCommFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TTCFindIn != null) TTCObjectHelper.toMap (TTCFindIn, record, "TaxTypeComm");
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
return TTCObjectHelper.fromMapList (record, "TaxTypeCommList");
}

  /**

   * Get a unique TaxTypeComm..

   * Convenience method using default BSDMSessionContext.

   * @param TTCGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TTCObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TTCObjectData get (TTCObjectKeyData TTCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, TTCGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique TaxTypeComm..
   * @param context The session context to use when connecting to the APITS server.
   * @param TTCGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TTCObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TTCObjectData get (BSDMSessionContext context, TTCObjectKeyData TTCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TTCGetIn, defaultAction);
       
     cManager.checkConstraints(TTCGetIn, constraintAction);
       return get (context, TTCGetIn);
  }

  /**

   * Find TaxTypeComm's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param TTCFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TTCObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TTCObjectDataList find (TTCObjectFilter TTCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, TTCFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find TaxTypeComm's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TTCFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TTCObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TTCObjectDataList find (BSDMSessionContext context, TTCObjectFilter TTCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TTCFindIn, defaultAction);
       
     cManager.checkConstraints(TTCFindIn, constraintAction);
       return find (context, TTCFindIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public TaxTypeCommBean ()
  {
    try
    {
      _TaxTypeCommGetSpec = new BSDMInteractionSpec("TaxTypeCommGet", ApiMappings.getCallName ("TaxTypeCommGet"), Boolean.TRUE);

      _TaxTypeCommFindSpec = new BSDMInteractionSpec("TaxTypeCommFind", ApiMappings.getCallName ("TaxTypeCommFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public TaxTypeCommBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public TaxTypeCommBean(BSDMSettings settings, BSDMConnectionManager cm)
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
