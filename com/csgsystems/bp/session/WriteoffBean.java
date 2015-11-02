
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: WriteoffBean.java
 * Definition File: Customer/Writeoff.xml
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
import com.csgsystems.bp.interfaces.WriteoffInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="WriteoffSessionBean"
 * display-name="Writeoff Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/WriteoffBean"
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

@Stateless(name="WriteoffBean", mappedName = "Writeoff")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Writeoffs")

public class WriteoffBean implements WriteoffInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _WriteoffGetSpec = null;
  /**
   * Get a unique Writeoff..
   * Convenience method using default BSDMSessionContext.
   * @param WRITEOFFgetIn Input Object Key.
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public WriteoffObjectData get (WriteoffObjectKeyData WRITEOFFgetIn) throws BSDMResourceException
  {
    return get (null, WRITEOFFgetIn);
  }
  /**
   * Get a unique Writeoff..
   * @param context The session context to use when connecting to the APITS server.
   * @param WRITEOFFgetIn Input Object Key.
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public WriteoffObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam WriteoffObjectKeyData WRITEOFFgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_WriteoffGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (WRITEOFFgetIn != null) WriteoffObjectKeyHelper.toMap (WRITEOFFgetIn, record, "Writeoff");
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
return WriteoffObjectHelper.fromMap (record, "Writeoff");
}

  private BSDMInteractionSpec _WriteoffFindSpec = null;
  /**
   * Find Writeoff rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param WRITEOFFfindIn Input Filter Object.
   * @return WriteoffObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public WriteoffObjectDataList find (WriteoffObjectFilter WRITEOFFfindIn) throws BSDMResourceException
  {
    return find (null, WRITEOFFfindIn);
  }
  /**
   * Find Writeoff rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param WRITEOFFfindIn Input Filter Object.
   * @return WriteoffObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public WriteoffObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,WriteoffObjectFilter WRITEOFFfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_WriteoffFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (WRITEOFFfindIn != null) WriteoffObjectHelper.toMap (WRITEOFFfindIn, record, "Writeoff");
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
return WriteoffObjectHelper.fromMapList (record, "WriteoffList");
}

  private BSDMInteractionSpec _WriteoffRecoveryCreateSpec = null;
  /**
   * Create a new Writeoff Recovery..
   * Convenience method using default BSDMSessionContext.
   * @param WRITEOFFcreateIn Input  Object.  Read-Only fields: WriteoffTypeCode, AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ, MicrBankId.  Derived Fields: TrackingId, TrackingIdServ, WriteoffTypeCode.
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public WriteoffObjectData recoveryCreate (WriteoffObjectData WRITEOFFcreateIn) throws BSDMResourceException
  {
    return recoveryCreate (null, WRITEOFFcreateIn);
  }
  /**
   * Create a new Writeoff Recovery..
   * @param context The session context to use when connecting to the APITS server.
   * @param WRITEOFFcreateIn Input  Object.  Read-Only fields: WriteoffTypeCode, AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ, MicrBankId.  Derived Fields: TrackingId, TrackingIdServ, WriteoffTypeCode.
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("recoveryCreate")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public WriteoffObjectData recoveryCreate (@HeaderParam ("context")BSDMSessionContext context,WriteoffObjectData WRITEOFFcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_WriteoffRecoveryCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (WRITEOFFcreateIn != null) WriteoffObjectHelper.toMap (WRITEOFFcreateIn, record, "Writeoff");
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
return WriteoffObjectHelper.fromMap (record, "Writeoff");
}

  /**

   * Get a unique Writeoff..

   * Convenience method using default BSDMSessionContext.

   * @param WRITEOFFgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return WriteoffObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public WriteoffObjectData get (WriteoffObjectKeyData WRITEOFFgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, WRITEOFFgetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique Writeoff..
   * @param context The session context to use when connecting to the APITS server.
   * @param WRITEOFFgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public WriteoffObjectData get (BSDMSessionContext context, WriteoffObjectKeyData WRITEOFFgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(WRITEOFFgetIn, defaultAction);
       
     cManager.checkConstraints(WRITEOFFgetIn, constraintAction);
       return get (context, WRITEOFFgetIn);
  }

  /**

   * Find Writeoff rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param WRITEOFFfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return WriteoffObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public WriteoffObjectDataList find (WriteoffObjectFilter WRITEOFFfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, WRITEOFFfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find Writeoff rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param WRITEOFFfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return WriteoffObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public WriteoffObjectDataList find (BSDMSessionContext context, WriteoffObjectFilter WRITEOFFfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(WRITEOFFfindIn, defaultAction);
       
     cManager.checkConstraints(WRITEOFFfindIn, constraintAction);
       return find (context, WRITEOFFfindIn);
  }

  /**

   * Create a new Writeoff Recovery..

   * Convenience method using default BSDMSessionContext.

   * @param WRITEOFFcreateIn Input  Object.  Read-Only fields: WriteoffTypeCode, AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ, MicrBankId.  Derived Fields: TrackingId, TrackingIdServ, WriteoffTypeCode.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return WriteoffObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public WriteoffObjectData recoveryCreate (WriteoffObjectData WRITEOFFcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return recoveryCreate (null, WRITEOFFcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new Writeoff Recovery..
   * @param context The session context to use when connecting to the APITS server.
   * @param WRITEOFFcreateIn Input  Object.  Read-Only fields: WriteoffTypeCode, AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ, MicrBankId.  Derived Fields: TrackingId, TrackingIdServ, WriteoffTypeCode.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public WriteoffObjectData recoveryCreate (BSDMSessionContext context, WriteoffObjectData WRITEOFFcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(WRITEOFFcreateIn, defaultAction);
       
     cManager.checkConstraints(WRITEOFFcreateIn, constraintAction);
       return recoveryCreate (context, WRITEOFFcreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public WriteoffBean ()
  {
    try
    {
      _WriteoffGetSpec = new BSDMInteractionSpec("WriteoffGet", ApiMappings.getCallName ("WriteoffGet"), Boolean.TRUE);

      _WriteoffFindSpec = new BSDMInteractionSpec("WriteoffFind", ApiMappings.getCallName ("WriteoffFind"), Boolean.TRUE);

      _WriteoffRecoveryCreateSpec = new BSDMInteractionSpec("WriteoffRecoveryCreate", ApiMappings.getCallName ("WriteoffRecoveryCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public WriteoffBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public WriteoffBean(BSDMSettings settings, BSDMConnectionManager cm)
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
