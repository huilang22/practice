
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ClearingHouseContactsBean.java
 * Definition File: Customer/ClearingHouseContacts.xml
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
import com.csgsystems.bp.interfaces.ClearingHouseContactsInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ClearingHouseContactsSessionBean"
 * display-name="ClearingHouseContacts Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ClearingHouseContactsBean"
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

@Stateless(name="ClearingHouseContactsBean", mappedName = "ClearingHouseContacts")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ClearingHouseContacts")

public class ClearingHouseContactsBean implements ClearingHouseContactsInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ClearingHouseContactsFindSpec = null;
  /**
   * Find ClearingHouseContacts that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CHCFindIn Input Filter Object.
   * @return ClearingHouseContactsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ClearingHouseContactsObjectDataList find (ClearingHouseContactsObjectFilter CHCFindIn) throws BSDMResourceException
  {
    return find (null, CHCFindIn);
  }
  /**
   * Find ClearingHouseContacts that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHCFindIn Input Filter Object.
   * @return ClearingHouseContactsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ClearingHouseContactsObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ClearingHouseContactsObjectFilter CHCFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ClearingHouseContactsFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CHCFindIn != null) ClearingHouseContactsObjectHelper.toMap (CHCFindIn, record, "ClearingHouseContacts");
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
return ClearingHouseContactsObjectHelper.fromMapList (record, "ClearingHouseContactsList");
}

  private BSDMInteractionSpec _ClearingHouseContactsFindCountSpec = null;
  /**
   * Find ClearingHouseContacts count that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CHCFindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer findCount (ClearingHouseContactsObjectFilter CHCFindCountIn) throws BSDMResourceException
  {
    return findCount (null, CHCFindCountIn);
  }
  /**
   * Find ClearingHouseContacts count that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHCFindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer findCount (@HeaderParam ("context")BSDMSessionContext context,ClearingHouseContactsObjectFilter CHCFindCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ClearingHouseContactsFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CHCFindCountIn != null) ClearingHouseContactsObjectHelper.toMap (CHCFindCountIn, record, "ClearingHouseContacts");
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
Object _tmp = record.get ("TotalCount");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  /**

   * Find ClearingHouseContacts that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CHCFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ClearingHouseContactsObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ClearingHouseContactsObjectDataList find (ClearingHouseContactsObjectFilter CHCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CHCFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ClearingHouseContacts that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHCFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ClearingHouseContactsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ClearingHouseContactsObjectDataList find (BSDMSessionContext context, ClearingHouseContactsObjectFilter CHCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CHCFindIn, defaultAction);
       
     cManager.checkConstraints(CHCFindIn, constraintAction);
       return find (context, CHCFindIn);
  }

  /**

   * Find ClearingHouseContacts count that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CHCFindCountIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer findCount (ClearingHouseContactsObjectFilter CHCFindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findCount (null, CHCFindCountIn, defaultAction, constraintAction);
  }
  /** 
   * Find ClearingHouseContacts count that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHCFindCountIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer findCount (BSDMSessionContext context, ClearingHouseContactsObjectFilter CHCFindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CHCFindCountIn, defaultAction);
       
     cManager.checkConstraints(CHCFindCountIn, constraintAction);
       return findCount (context, CHCFindCountIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ClearingHouseContactsBean ()
  {
    try
    {
      _ClearingHouseContactsFindSpec = new BSDMInteractionSpec("ClearingHouseContactsFind", ApiMappings.getCallName ("ClearingHouseContactsFind"), Boolean.TRUE);

      _ClearingHouseContactsFindCountSpec = new BSDMInteractionSpec("ClearingHouseContactsFindCount", ApiMappings.getCallName ("ClearingHouseContactsFindCount"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ClearingHouseContactsBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ClearingHouseContactsBean(BSDMSettings settings, BSDMConnectionManager cm)
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
