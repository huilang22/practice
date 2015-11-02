
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: BillInsertGroupMapBean.java
 * Definition File: Admin/BillInsertGroupMap.xml
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
import com.csgsystems.bp.interfaces.BillInsertGroupMapInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="BillInsertGroupMapSessionBean"
 * display-name="BillInsertGroupMap Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/BillInsertGroupMapBean"
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

@Stateless(name="BillInsertGroupMapBean", mappedName = "BillInsertGroupMap")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("BillInsertGroupMaps")

public class BillInsertGroupMapBean implements BillInsertGroupMapInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _BillInsertGroupMapGetSpec = null;
  /**
   * Retrieve a unique BillInsertGroupMap row..
   * Convenience method using default BSDMSessionContext.
   * @param BIGGetIn Input Object Key.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillInsertGroupMapObjectData get (BillInsertGroupMapObjectKeyData BIGGetIn) throws BSDMResourceException
  {
    return get (null, BIGGetIn);
  }
  /**
   * Retrieve a unique BillInsertGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGGetIn Input Object Key.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public BillInsertGroupMapObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BillInsertGroupMapObjectKeyData BIGGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillInsertGroupMapGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BIGGetIn != null) BillInsertGroupMapObjectKeyHelper.toMap (BIGGetIn, record, "BillInsertGroupMap");
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
return BillInsertGroupMapObjectHelper.fromMap (record, "BillInsertGroupMap");
}

  private BSDMInteractionSpec _BillInsertGroupMapFindSpec = null;
  /**
   * Find BillInsertGroupMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BIGFindIn Input Filter Object.
   * @return BillInsertGroupMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillInsertGroupMapObjectDataList find (BillInsertGroupMapObjectFilter BIGFindIn) throws BSDMResourceException
  {
    return find (null, BIGFindIn);
  }
  /**
   * Find BillInsertGroupMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGFindIn Input Filter Object.
   * @return BillInsertGroupMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillInsertGroupMapObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,BillInsertGroupMapObjectFilter BIGFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillInsertGroupMapFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BIGFindIn != null) BillInsertGroupMapObjectHelper.toMap (BIGFindIn, record, "BillInsertGroupMap");
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
return BillInsertGroupMapObjectHelper.fromMapList (record, "BillInsertGroupMapList");
}

  private BSDMInteractionSpec _BillInsertGroupMapUpdateSpec = null;
  /**
   * Update non-key fields of a BillInsertGroupMap..
   * Convenience method using default BSDMSessionContext.
   * @param BIGUpdateIn Input  Object.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillInsertGroupMapObjectData update (BillInsertGroupMapObjectData BIGUpdateIn) throws BSDMResourceException
  {
    return update (null, BIGUpdateIn);
  }
  /**
   * Update non-key fields of a BillInsertGroupMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGUpdateIn Input  Object.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillInsertGroupMapObjectData update (@HeaderParam ("context")BSDMSessionContext context,BillInsertGroupMapObjectData BIGUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillInsertGroupMapUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BIGUpdateIn != null) BillInsertGroupMapObjectHelper.toMap (BIGUpdateIn, record, "BillInsertGroupMap");
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
return BillInsertGroupMapObjectHelper.fromMap (record, "BillInsertGroupMap");
}

  private BSDMInteractionSpec _BillInsertGroupMapDeleteSpec = null;
  /**
   * Delete a BillInsertGroupMap row..
   * Convenience method using default BSDMSessionContext.
   * @param BIGDeleteIn Input Object Key.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillInsertGroupMapObjectData delete (BillInsertGroupMapObjectKeyData BIGDeleteIn) throws BSDMResourceException
  {
    return delete (null, BIGDeleteIn);
  }
  /**
   * Delete a BillInsertGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGDeleteIn Input Object Key.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillInsertGroupMapObjectData delete (@HeaderParam ("context")BSDMSessionContext context,BillInsertGroupMapObjectKeyData BIGDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillInsertGroupMapDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BIGDeleteIn != null) BillInsertGroupMapObjectKeyHelper.toMap (BIGDeleteIn, record, "BillInsertGroupMap");
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
return BillInsertGroupMapObjectHelper.fromMap (record, "BillInsertGroupMap");
}

  private BSDMInteractionSpec _BillInsertGroupMapCreateSpec = null;
  /**
   * Create a new BillInsertGroupMap row..
   * Convenience method using default BSDMSessionContext.
   * @param BIGCreateIn Input  Object.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillInsertGroupMapObjectData create (BillInsertGroupMapObjectData BIGCreateIn) throws BSDMResourceException
  {
    return create (null, BIGCreateIn);
  }
  /**
   * Create a new BillInsertGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGCreateIn Input  Object.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BillInsertGroupMapObjectData create (@HeaderParam ("context")BSDMSessionContext context,BillInsertGroupMapObjectData BIGCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillInsertGroupMapCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BIGCreateIn != null) BillInsertGroupMapObjectHelper.toMap (BIGCreateIn, record, "BillInsertGroupMap");
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
return BillInsertGroupMapObjectHelper.fromMap (record, "BillInsertGroupMap");
}

  /**

   * Retrieve a unique BillInsertGroupMap row..

   * Convenience method using default BSDMSessionContext.

   * @param BIGGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillInsertGroupMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillInsertGroupMapObjectData get (BillInsertGroupMapObjectKeyData BIGGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, BIGGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique BillInsertGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillInsertGroupMapObjectData get (BSDMSessionContext context, BillInsertGroupMapObjectKeyData BIGGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BIGGetIn, defaultAction);
       
     cManager.checkConstraints(BIGGetIn, constraintAction);
       return get (context, BIGGetIn);
  }

  /**

   * Find BillInsertGroupMap rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param BIGFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillInsertGroupMapObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillInsertGroupMapObjectDataList find (BillInsertGroupMapObjectFilter BIGFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, BIGFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find BillInsertGroupMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillInsertGroupMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillInsertGroupMapObjectDataList find (BSDMSessionContext context, BillInsertGroupMapObjectFilter BIGFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BIGFindIn, defaultAction);
       
     cManager.checkConstraints(BIGFindIn, constraintAction);
       return find (context, BIGFindIn);
  }

  /**

   * Update non-key fields of a BillInsertGroupMap..

   * Convenience method using default BSDMSessionContext.

   * @param BIGUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillInsertGroupMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillInsertGroupMapObjectData update (BillInsertGroupMapObjectData BIGUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, BIGUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a BillInsertGroupMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillInsertGroupMapObjectData update (BSDMSessionContext context, BillInsertGroupMapObjectData BIGUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BIGUpdateIn, defaultAction);
       
     cManager.checkConstraints(BIGUpdateIn, constraintAction);
       return update (context, BIGUpdateIn);
  }

  /**

   * Delete a BillInsertGroupMap row..

   * Convenience method using default BSDMSessionContext.

   * @param BIGDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillInsertGroupMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillInsertGroupMapObjectData delete (BillInsertGroupMapObjectKeyData BIGDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, BIGDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a BillInsertGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillInsertGroupMapObjectData delete (BSDMSessionContext context, BillInsertGroupMapObjectKeyData BIGDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BIGDeleteIn, defaultAction);
       
     cManager.checkConstraints(BIGDeleteIn, constraintAction);
       return delete (context, BIGDeleteIn);
  }

  /**

   * Create a new BillInsertGroupMap row..

   * Convenience method using default BSDMSessionContext.

   * @param BIGCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillInsertGroupMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillInsertGroupMapObjectData create (BillInsertGroupMapObjectData BIGCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, BIGCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new BillInsertGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillInsertGroupMapObjectData create (BSDMSessionContext context, BillInsertGroupMapObjectData BIGCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BIGCreateIn, defaultAction);
       
     cManager.checkConstraints(BIGCreateIn, constraintAction);
       return create (context, BIGCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public BillInsertGroupMapBean ()
  {
    try
    {
      _BillInsertGroupMapGetSpec = new BSDMInteractionSpec("BillInsertGroupMapGet", ApiMappings.getCallName ("BillInsertGroupMapGet"), Boolean.TRUE);

      _BillInsertGroupMapFindSpec = new BSDMInteractionSpec("BillInsertGroupMapFind", ApiMappings.getCallName ("BillInsertGroupMapFind"), Boolean.TRUE);

      _BillInsertGroupMapUpdateSpec = new BSDMInteractionSpec("BillInsertGroupMapUpdate", ApiMappings.getCallName ("BillInsertGroupMapUpdate"), Boolean.TRUE);

      _BillInsertGroupMapDeleteSpec = new BSDMInteractionSpec("BillInsertGroupMapDelete", ApiMappings.getCallName ("BillInsertGroupMapDelete"), Boolean.TRUE);

      _BillInsertGroupMapCreateSpec = new BSDMInteractionSpec("BillInsertGroupMapCreate", ApiMappings.getCallName ("BillInsertGroupMapCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public BillInsertGroupMapBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public BillInsertGroupMapBean(BSDMSettings settings, BSDMConnectionManager cm)
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
