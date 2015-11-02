
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CmfBonusPointBean.java
 * Definition File: Customer/CmfBonusPoint.xml
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
import com.csgsystems.bp.interfaces.CmfBonusPointInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CmfBonusPointSessionBean"
 * display-name="CmfBonusPoint Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CmfBonusPointBean"
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

@Stateless(name="CmfBonusPointBean", mappedName = "CmfBonusPoint")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("CmfBonusPoints")

public class CmfBonusPointBean implements CmfBonusPointInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CmfBonusPointGetSpec = null;
  /**
   * Get a unique CmfBonusPoint..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDGetIn Input Object Key.
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfBonusPointObjectData get (CmfBonusPointObjectKeyData CRBDGetIn) throws BSDMResourceException
  {
    return get (null, CRBDGetIn);
  }
  /**
   * Get a unique CmfBonusPoint..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDGetIn Input Object Key.
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public CmfBonusPointObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CmfBonusPointObjectKeyData CRBDGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfBonusPointGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRBDGetIn != null) CmfBonusPointObjectKeyHelper.toMap (CRBDGetIn, record, "CmfBonusPoint");
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
return CmfBonusPointObjectHelper.fromMap (record, "CmfBonusPoint");
}

  private BSDMInteractionSpec _CmfBonusPointFindSpec = null;
  /**
   * Find CmfBonusPoint rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDFindIn Input Filter Object.
   * @return CmfBonusPointObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfBonusPointObjectDataList find (CmfBonusPointObjectFilter CRBDFindIn) throws BSDMResourceException
  {
    return find (null, CRBDFindIn);
  }
  /**
   * Find CmfBonusPoint rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDFindIn Input Filter Object.
   * @return CmfBonusPointObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfBonusPointObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,CmfBonusPointObjectFilter CRBDFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfBonusPointFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRBDFindIn != null) CmfBonusPointObjectHelper.toMap (CRBDFindIn, record, "CmfBonusPoint");
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
return CmfBonusPointObjectHelper.fromMapList (record, "CmfBonusPointList");
}

  private BSDMInteractionSpec _CmfBonusPointUpdateSpec = null;
  /**
   * Update the non-key fields of an CmfBonusPoint row..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDUpdateIn Input  Object.
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfBonusPointObjectData update (CmfBonusPointObjectData CRBDUpdateIn) throws BSDMResourceException
  {
    return update (null, CRBDUpdateIn);
  }
  /**
   * Update the non-key fields of an CmfBonusPoint row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDUpdateIn Input  Object.
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfBonusPointObjectData update (@HeaderParam ("context")BSDMSessionContext context,CmfBonusPointObjectData CRBDUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfBonusPointUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRBDUpdateIn != null) CmfBonusPointObjectHelper.toMap (CRBDUpdateIn, record, "CmfBonusPoint");
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
return CmfBonusPointObjectHelper.fromMap (record, "CmfBonusPoint");
}

  private BSDMInteractionSpec _CmfBonusPointCreateSpec = null;
  /**
   * Create a new CmfBonusPoint..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: ExpirationBillRefNo, ExpirationBillRefResets.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, ChgWho.
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfBonusPointObjectData create (CmfBonusPointObjectData CRBDCreateIn) throws BSDMResourceException
  {
    return create (null, CRBDCreateIn);
  }
  /**
   * Create a new CmfBonusPoint..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: ExpirationBillRefNo, ExpirationBillRefResets.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, ChgWho.
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfBonusPointObjectData create (@HeaderParam ("context")BSDMSessionContext context,CmfBonusPointObjectData CRBDCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfBonusPointCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRBDCreateIn != null) CmfBonusPointObjectHelper.toMap (CRBDCreateIn, record, "CmfBonusPoint");
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
return CmfBonusPointObjectHelper.fromMap (record, "CmfBonusPoint");
}

  /**

   * Get a unique CmfBonusPoint..

   * Convenience method using default BSDMSessionContext.

   * @param CRBDGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfBonusPointObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfBonusPointObjectData get (CmfBonusPointObjectKeyData CRBDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CRBDGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique CmfBonusPoint..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfBonusPointObjectData get (BSDMSessionContext context, CmfBonusPointObjectKeyData CRBDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRBDGetIn, defaultAction);
       
     cManager.checkConstraints(CRBDGetIn, constraintAction);
       return get (context, CRBDGetIn);
  }

  /**

   * Find CmfBonusPoint rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CRBDFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfBonusPointObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfBonusPointObjectDataList find (CmfBonusPointObjectFilter CRBDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CRBDFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find CmfBonusPoint rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfBonusPointObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfBonusPointObjectDataList find (BSDMSessionContext context, CmfBonusPointObjectFilter CRBDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRBDFindIn, defaultAction);
       
     cManager.checkConstraints(CRBDFindIn, constraintAction);
       return find (context, CRBDFindIn);
  }

  /**

   * Update the non-key fields of an CmfBonusPoint row..

   * Convenience method using default BSDMSessionContext.

   * @param CRBDUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfBonusPointObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfBonusPointObjectData update (CmfBonusPointObjectData CRBDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CRBDUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of an CmfBonusPoint row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfBonusPointObjectData update (BSDMSessionContext context, CmfBonusPointObjectData CRBDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRBDUpdateIn, defaultAction);
       
     cManager.checkConstraints(CRBDUpdateIn, constraintAction);
       return update (context, CRBDUpdateIn);
  }

  /**

   * Create a new CmfBonusPoint..

   * Convenience method using default BSDMSessionContext.

   * @param CRBDCreateIn Input  Object.  Defaulted Fields: ExpirationBillRefNo, ExpirationBillRefResets.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfBonusPointObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfBonusPointObjectData create (CmfBonusPointObjectData CRBDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CRBDCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new CmfBonusPoint..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: ExpirationBillRefNo, ExpirationBillRefResets.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfBonusPointObjectData create (BSDMSessionContext context, CmfBonusPointObjectData CRBDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRBDCreateIn, defaultAction);
       
     cManager.checkConstraints(CRBDCreateIn, constraintAction);
       return create (context, CRBDCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CmfBonusPointBean ()
  {
    try
    {
      _CmfBonusPointGetSpec = new BSDMInteractionSpec("CmfBonusPointGet", ApiMappings.getCallName ("CmfBonusPointGet"), Boolean.TRUE);

      _CmfBonusPointFindSpec = new BSDMInteractionSpec("CmfBonusPointFind", ApiMappings.getCallName ("CmfBonusPointFind"), Boolean.TRUE);

      _CmfBonusPointUpdateSpec = new BSDMInteractionSpec("CmfBonusPointUpdate", ApiMappings.getCallName ("CmfBonusPointUpdate"), Boolean.TRUE);

      _CmfBonusPointCreateSpec = new BSDMInteractionSpec("CmfBonusPointCreate", ApiMappings.getCallName ("CmfBonusPointCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CmfBonusPointBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CmfBonusPointBean(BSDMSettings settings, BSDMConnectionManager cm)
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
