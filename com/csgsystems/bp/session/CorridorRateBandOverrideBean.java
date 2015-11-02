
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CorridorRateBandOverrideBean.java
 * Definition File: Admin/CorridorRateBandOverride.xml
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
import com.csgsystems.bp.interfaces.CorridorRateBandOverrideInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CorridorRateBandOverrideSessionBean"
 * display-name="CorridorRateBandOverride Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CorridorRateBandOverrideBean"
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

@Stateless(name="CorridorRateBandOverrideBean", mappedName = "CorridorRateBandOverride")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("CorridorRateBandOverrides")

public class CorridorRateBandOverrideBean implements CorridorRateBandOverrideInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CorridorRateBandOverrideGetSpec = null;
  /**
   * Get a CorridorRateBandOverride..
   * Convenience method using default BSDMSessionContext.
   * @param CRBOGetIn Input Object Key.
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CRBOObjectData get (CRBOObjectKeyData CRBOGetIn) throws BSDMResourceException
  {
    return get (null, CRBOGetIn);
  }
  /**
   * Get a CorridorRateBandOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBOGetIn Input Object Key.
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public CRBOObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CRBOObjectKeyData CRBOGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CorridorRateBandOverrideGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRBOGetIn != null) CRBOObjectKeyHelper.toMap (CRBOGetIn, record, "CorridorRateBandOverride");
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
return CRBOObjectHelper.fromMap (record, "CorridorRateBandOverride");
}

  private BSDMInteractionSpec _CorridorRateBandOverrideFindSpec = null;
  /**
   * Find CorridorRateBandOverrides..
   * Convenience method using default BSDMSessionContext.
   * @param CRBOFindIn Input Filter Object.
   * @return CRBOObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CRBOObjectDataList find (CRBOObjectFilter CRBOFindIn) throws BSDMResourceException
  {
    return find (null, CRBOFindIn);
  }
  /**
   * Find CorridorRateBandOverrides..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBOFindIn Input Filter Object.
   * @return CRBOObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CRBOObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,CRBOObjectFilter CRBOFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CorridorRateBandOverrideFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRBOFindIn != null) CRBOObjectHelper.toMap (CRBOFindIn, record, "CorridorRateBandOverride");
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
return CRBOObjectHelper.fromMapList (record, "CorridorRateBandOverrideList");
}

  private BSDMInteractionSpec _CorridorRateBandOverrideUpdateSpec = null;
  /**
   * Update non-key fields of a CorridorRateBandOverride row..
   * Convenience method using default BSDMSessionContext.
   * @param CRBOUpdateIn Input  Object.
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CRBOObjectData update (CRBOObjectData CRBOUpdateIn) throws BSDMResourceException
  {
    return update (null, CRBOUpdateIn);
  }
  /**
   * Update non-key fields of a CorridorRateBandOverride row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBOUpdateIn Input  Object.
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CRBOObjectData update (@HeaderParam ("context")BSDMSessionContext context,CRBOObjectData CRBOUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CorridorRateBandOverrideUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRBOUpdateIn != null) CRBOObjectHelper.toMap (CRBOUpdateIn, record, "CorridorRateBandOverride");
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
return CRBOObjectHelper.fromMap (record, "CorridorRateBandOverride");
}

  /**

   * Get a CorridorRateBandOverride..

   * Convenience method using default BSDMSessionContext.

   * @param CRBOGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CRBOObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CRBOObjectData get (CRBOObjectKeyData CRBOGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CRBOGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a CorridorRateBandOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBOGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CRBOObjectData get (BSDMSessionContext context, CRBOObjectKeyData CRBOGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRBOGetIn, defaultAction);
       
     cManager.checkConstraints(CRBOGetIn, constraintAction);
       return get (context, CRBOGetIn);
  }

  /**

   * Find CorridorRateBandOverrides..

   * Convenience method using default BSDMSessionContext.

   * @param CRBOFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CRBOObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CRBOObjectDataList find (CRBOObjectFilter CRBOFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CRBOFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find CorridorRateBandOverrides..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBOFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CRBOObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CRBOObjectDataList find (BSDMSessionContext context, CRBOObjectFilter CRBOFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRBOFindIn, defaultAction);
       
     cManager.checkConstraints(CRBOFindIn, constraintAction);
       return find (context, CRBOFindIn);
  }

  /**

   * Update non-key fields of a CorridorRateBandOverride row..

   * Convenience method using default BSDMSessionContext.

   * @param CRBOUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CRBOObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CRBOObjectData update (CRBOObjectData CRBOUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CRBOUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a CorridorRateBandOverride row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBOUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CRBOObjectData update (BSDMSessionContext context, CRBOObjectData CRBOUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRBOUpdateIn, defaultAction);
       
     cManager.checkConstraints(CRBOUpdateIn, constraintAction);
       return update (context, CRBOUpdateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CorridorRateBandOverrideBean ()
  {
    try
    {
      _CorridorRateBandOverrideGetSpec = new BSDMInteractionSpec("CorridorRateBandOverrideGet", ApiMappings.getCallName ("CorridorRateBandOverrideGet"), Boolean.TRUE);

      _CorridorRateBandOverrideFindSpec = new BSDMInteractionSpec("CorridorRateBandOverrideFind", ApiMappings.getCallName ("CorridorRateBandOverrideFind"), Boolean.TRUE);

      _CorridorRateBandOverrideUpdateSpec = new BSDMInteractionSpec("CorridorRateBandOverrideUpdate", ApiMappings.getCallName ("CorridorRateBandOverrideUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CorridorRateBandOverrideBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CorridorRateBandOverrideBean(BSDMSettings settings, BSDMConnectionManager cm)
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
