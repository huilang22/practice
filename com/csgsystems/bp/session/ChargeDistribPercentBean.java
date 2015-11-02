
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ChargeDistribPercentBean.java
 * Definition File: Customer/ChargeDistribPercent.xml
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
import com.csgsystems.bp.interfaces.ChargeDistribPercentInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ChargeDistribPercentSessionBean"
 * display-name="ChargeDistribPercent Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ChargeDistribPercentBean"
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

@Stateless(name="ChargeDistribPercentBean", mappedName = "ChargeDistribPercent")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ChargeDistribPercents")

public class ChargeDistribPercentBean implements ChargeDistribPercentInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ChargeDistribPercentGetSpec = null;
  /**
   * Returns one ChargeDistribPercent object matching the supplied key value..
   * Convenience method using default BSDMSessionContext.
   * @param CDPget_In Input Object Key.
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ChargeDistribPercentObjectData get (ChargeDistribPercentObjectKeyData CDPget_In) throws BSDMResourceException
  {
    return get (null, CDPget_In);
  }
  /**
   * Returns one ChargeDistribPercent object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPget_In Input Object Key.
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ChargeDistribPercentObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ChargeDistribPercentObjectKeyData CDPget_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ChargeDistribPercentGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CDPget_In != null) ChargeDistribPercentObjectKeyHelper.toMap (CDPget_In, record, "ChargeDistribPercent");
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
return ChargeDistribPercentObjectHelper.fromMap (record, "ChargeDistribPercent");
}

  private BSDMInteractionSpec _ChargeDistribPercentFindSpec = null;
  /**
   * Finds all ChargeDistribPercent objects matching the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CDPfind_In Input Filter Object.
   * @return ChargeDistribPercentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ChargeDistribPercentObjectDataList find (ChargeDistribPercentObjectFilter CDPfind_In) throws BSDMResourceException
  {
    return find (null, CDPfind_In);
  }
  /**
   * Finds all ChargeDistribPercent objects matching the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPfind_In Input Filter Object.
   * @return ChargeDistribPercentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ChargeDistribPercentObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ChargeDistribPercentObjectFilter CDPfind_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ChargeDistribPercentFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CDPfind_In != null) ChargeDistribPercentObjectHelper.toMap (CDPfind_In, record, "ChargeDistribPercent");
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
return ChargeDistribPercentObjectHelper.fromMapList (record, "ChargeDistribPercentList");
}

  private BSDMInteractionSpec _ChargeDistribPercentCreateSpec = null;
  /**
   * Create a ChargeDistribPercent based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param CDPcreate_In Input  Object.
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ChargeDistribPercentObjectData create (ChargeDistribPercentObjectData CDPcreate_In) throws BSDMResourceException
  {
    return create (null, CDPcreate_In);
  }
  /**
   * Create a ChargeDistribPercent based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPcreate_In Input  Object.
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ChargeDistribPercentObjectData create (@HeaderParam ("context")BSDMSessionContext context,ChargeDistribPercentObjectData CDPcreate_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ChargeDistribPercentCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CDPcreate_In != null) ChargeDistribPercentObjectHelper.toMap (CDPcreate_In, record, "ChargeDistribPercent");
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
return ChargeDistribPercentObjectHelper.fromMap (record, "ChargeDistribPercent");
}

  private BSDMInteractionSpec _ChargeDistribPercentUpdateSpec = null;
  /**
   * Update non-key fields for a row in ChargeDistribPercent.
   * Convenience method using default BSDMSessionContext.
   * @param CDPupdate_In Input  Object.
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ChargeDistribPercentObjectData update (ChargeDistribPercentObjectData CDPupdate_In) throws BSDMResourceException
  {
    return update (null, CDPupdate_In);
  }
  /**
   * Update non-key fields for a row in ChargeDistribPercent.
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPupdate_In Input  Object.
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ChargeDistribPercentObjectData update (@HeaderParam ("context")BSDMSessionContext context,ChargeDistribPercentObjectData CDPupdate_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ChargeDistribPercentUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CDPupdate_In != null) ChargeDistribPercentObjectHelper.toMap (CDPupdate_In, record, "ChargeDistribPercent");
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
return ChargeDistribPercentObjectHelper.fromMap (record, "ChargeDistribPercent");
}

  /**

   * Returns one ChargeDistribPercent object matching the supplied key value..

   * Convenience method using default BSDMSessionContext.

   * @param CDPget_In Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ChargeDistribPercentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ChargeDistribPercentObjectData get (ChargeDistribPercentObjectKeyData CDPget_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CDPget_In, defaultAction, constraintAction);
  }
  /** 
   * Returns one ChargeDistribPercent object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPget_In Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ChargeDistribPercentObjectData get (BSDMSessionContext context, ChargeDistribPercentObjectKeyData CDPget_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CDPget_In, defaultAction);
       
     cManager.checkConstraints(CDPget_In, constraintAction);
       return get (context, CDPget_In);
  }

  /**

   * Finds all ChargeDistribPercent objects matching the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CDPfind_In Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ChargeDistribPercentObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ChargeDistribPercentObjectDataList find (ChargeDistribPercentObjectFilter CDPfind_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CDPfind_In, defaultAction, constraintAction);
  }
  /** 
   * Finds all ChargeDistribPercent objects matching the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPfind_In Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ChargeDistribPercentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ChargeDistribPercentObjectDataList find (BSDMSessionContext context, ChargeDistribPercentObjectFilter CDPfind_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CDPfind_In, defaultAction);
       
     cManager.checkConstraints(CDPfind_In, constraintAction);
       return find (context, CDPfind_In);
  }

  /**

   * Create a ChargeDistribPercent based upon its input values..

   * Convenience method using default BSDMSessionContext.

   * @param CDPcreate_In Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ChargeDistribPercentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ChargeDistribPercentObjectData create (ChargeDistribPercentObjectData CDPcreate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CDPcreate_In, defaultAction, constraintAction);
  }
  /** 
   * Create a ChargeDistribPercent based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPcreate_In Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ChargeDistribPercentObjectData create (BSDMSessionContext context, ChargeDistribPercentObjectData CDPcreate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CDPcreate_In, defaultAction);
       
     cManager.checkConstraints(CDPcreate_In, constraintAction);
       return create (context, CDPcreate_In);
  }

  /**

   * Update non-key fields for a row in ChargeDistribPercent.

   * Convenience method using default BSDMSessionContext.

   * @param CDPupdate_In Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ChargeDistribPercentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ChargeDistribPercentObjectData update (ChargeDistribPercentObjectData CDPupdate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CDPupdate_In, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields for a row in ChargeDistribPercent.
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPupdate_In Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ChargeDistribPercentObjectData update (BSDMSessionContext context, ChargeDistribPercentObjectData CDPupdate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CDPupdate_In, defaultAction);
       
     cManager.checkConstraints(CDPupdate_In, constraintAction);
       return update (context, CDPupdate_In);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ChargeDistribPercentBean ()
  {
    try
    {
      _ChargeDistribPercentGetSpec = new BSDMInteractionSpec("ChargeDistribPercentGet", ApiMappings.getCallName ("ChargeDistribPercentGet"), Boolean.TRUE);

      _ChargeDistribPercentFindSpec = new BSDMInteractionSpec("ChargeDistribPercentFind", ApiMappings.getCallName ("ChargeDistribPercentFind"), Boolean.TRUE);

      _ChargeDistribPercentCreateSpec = new BSDMInteractionSpec("ChargeDistribPercentCreate", ApiMappings.getCallName ("ChargeDistribPercentCreate"), Boolean.TRUE);

      _ChargeDistribPercentUpdateSpec = new BSDMInteractionSpec("ChargeDistribPercentUpdate", ApiMappings.getCallName ("ChargeDistribPercentUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ChargeDistribPercentBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ChargeDistribPercentBean(BSDMSettings settings, BSDMConnectionManager cm)
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
