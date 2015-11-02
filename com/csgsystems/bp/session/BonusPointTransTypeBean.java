
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: BonusPointTransTypeBean.java
 * Definition File: Admin/BonusPointTransType.xml
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
import com.csgsystems.bp.interfaces.BonusPointTransTypeInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="BonusPointTransTypeSessionBean"
 * display-name="BonusPointTransType Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/BonusPointTransTypeBean"
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

@Stateless(name="BonusPointTransTypeBean", mappedName = "BonusPointTransType")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("BonusPointTransTypes")

public class BonusPointTransTypeBean implements BonusPointTransTypeInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _BonusPointTransTypeGetSpec = null;
  /**
   * Get a Bonus Point Transaction Type object..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTGetIn Input Object Key.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BonusPointTransTypeObjectData get (BonusPointTransTypeObjectKeyData BPTTGetIn) throws BSDMResourceException
  {
    return get (null, BPTTGetIn);
  }
  /**
   * Get a Bonus Point Transaction Type object..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTGetIn Input Object Key.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public BonusPointTransTypeObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BonusPointTransTypeObjectKeyData BPTTGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BonusPointTransTypeGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BPTTGetIn != null) BonusPointTransTypeObjectKeyHelper.toMap (BPTTGetIn, record, "BonusPointTransType");
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
return BonusPointTransTypeObjectHelper.fromMap (record, "BonusPointTransType");
}

  private BSDMInteractionSpec _BonusPointTransTypeFindSpec = null;
  /**
   * Find BonusPointTransType's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTFindIn Input Filter Object.
   * @return BonusPointTransTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BonusPointTransTypeObjectDataList find (BonusPointTransTypeObjectFilter BPTTFindIn) throws BSDMResourceException
  {
    return find (null, BPTTFindIn);
  }
  /**
   * Find BonusPointTransType's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTFindIn Input Filter Object.
   * @return BonusPointTransTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BonusPointTransTypeObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,BonusPointTransTypeObjectFilter BPTTFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BonusPointTransTypeFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BPTTFindIn != null) BonusPointTransTypeObjectHelper.toMap (BPTTFindIn, record, "BonusPointTransType");
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
return BonusPointTransTypeObjectHelper.fromMapList (record, "BonusPointTransTypeList");
}

  private BSDMInteractionSpec _BonusPointTransTypeUpdateSpec = null;
  /**
   * Update non-key fields for the BonusPointTransType row..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTUpdateIn Input  Object.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BonusPointTransTypeObjectData update (BonusPointTransTypeObjectData BPTTUpdateIn) throws BSDMResourceException
  {
    return update (null, BPTTUpdateIn);
  }
  /**
   * Update non-key fields for the BonusPointTransType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTUpdateIn Input  Object.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BonusPointTransTypeObjectData update (@HeaderParam ("context")BSDMSessionContext context,BonusPointTransTypeObjectData BPTTUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BonusPointTransTypeUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BPTTUpdateIn != null) BonusPointTransTypeObjectHelper.toMap (BPTTUpdateIn, record, "BonusPointTransType");
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
return BonusPointTransTypeObjectHelper.fromMap (record, "BonusPointTransType");
}

  private BSDMInteractionSpec _BonusPointTransTypeDeleteSpec = null;
  /**
   * Delete a BonusPointTransType row..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTDeleteIn Input Object Key.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BonusPointTransTypeObjectData delete (BonusPointTransTypeObjectKeyData BPTTDeleteIn) throws BSDMResourceException
  {
    return delete (null, BPTTDeleteIn);
  }
  /**
   * Delete a BonusPointTransType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTDeleteIn Input Object Key.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BonusPointTransTypeObjectData delete (@HeaderParam ("context")BSDMSessionContext context,BonusPointTransTypeObjectKeyData BPTTDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BonusPointTransTypeDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BPTTDeleteIn != null) BonusPointTransTypeObjectKeyHelper.toMap (BPTTDeleteIn, record, "BonusPointTransType");
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
return BonusPointTransTypeObjectHelper.fromMap (record, "BonusPointTransType");
}

  private BSDMInteractionSpec _BonusPointTransTypeCreateSpec = null;
  /**
   * Create a new BonusPointTransType..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BonusPointTransTypeObjectData create (BonusPointTransTypeObjectData BPTTCreateIn) throws BSDMResourceException
  {
    return create (null, BPTTCreateIn);
  }
  /**
   * Create a new BonusPointTransType..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BonusPointTransTypeObjectData create (@HeaderParam ("context")BSDMSessionContext context,BonusPointTransTypeObjectData BPTTCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BonusPointTransTypeCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BPTTCreateIn != null) BonusPointTransTypeObjectHelper.toMap (BPTTCreateIn, record, "BonusPointTransType");
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
return BonusPointTransTypeObjectHelper.fromMap (record, "BonusPointTransType");
}

  /**

   * Get a Bonus Point Transaction Type object..

   * Convenience method using default BSDMSessionContext.

   * @param BPTTGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BonusPointTransTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BonusPointTransTypeObjectData get (BonusPointTransTypeObjectKeyData BPTTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, BPTTGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a Bonus Point Transaction Type object..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BonusPointTransTypeObjectData get (BSDMSessionContext context, BonusPointTransTypeObjectKeyData BPTTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BPTTGetIn, defaultAction);
       
     cManager.checkConstraints(BPTTGetIn, constraintAction);
       return get (context, BPTTGetIn);
  }

  /**

   * Find BonusPointTransType's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param BPTTFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BonusPointTransTypeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BonusPointTransTypeObjectDataList find (BonusPointTransTypeObjectFilter BPTTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, BPTTFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find BonusPointTransType's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BonusPointTransTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BonusPointTransTypeObjectDataList find (BSDMSessionContext context, BonusPointTransTypeObjectFilter BPTTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BPTTFindIn, defaultAction);
       
     cManager.checkConstraints(BPTTFindIn, constraintAction);
       return find (context, BPTTFindIn);
  }

  /**

   * Update non-key fields for the BonusPointTransType row..

   * Convenience method using default BSDMSessionContext.

   * @param BPTTUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BonusPointTransTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BonusPointTransTypeObjectData update (BonusPointTransTypeObjectData BPTTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, BPTTUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields for the BonusPointTransType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BonusPointTransTypeObjectData update (BSDMSessionContext context, BonusPointTransTypeObjectData BPTTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BPTTUpdateIn, defaultAction);
       
     cManager.checkConstraints(BPTTUpdateIn, constraintAction);
       return update (context, BPTTUpdateIn);
  }

  /**

   * Delete a BonusPointTransType row..

   * Convenience method using default BSDMSessionContext.

   * @param BPTTDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BonusPointTransTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BonusPointTransTypeObjectData delete (BonusPointTransTypeObjectKeyData BPTTDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, BPTTDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a BonusPointTransType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BonusPointTransTypeObjectData delete (BSDMSessionContext context, BonusPointTransTypeObjectKeyData BPTTDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BPTTDeleteIn, defaultAction);
       
     cManager.checkConstraints(BPTTDeleteIn, constraintAction);
       return delete (context, BPTTDeleteIn);
  }

  /**

   * Create a new BonusPointTransType..

   * Convenience method using default BSDMSessionContext.

   * @param BPTTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BonusPointTransTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BonusPointTransTypeObjectData create (BonusPointTransTypeObjectData BPTTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, BPTTCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new BonusPointTransType..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BonusPointTransTypeObjectData create (BSDMSessionContext context, BonusPointTransTypeObjectData BPTTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BPTTCreateIn, defaultAction);
       
     cManager.checkConstraints(BPTTCreateIn, constraintAction);
       return create (context, BPTTCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public BonusPointTransTypeBean ()
  {
    try
    {
      _BonusPointTransTypeGetSpec = new BSDMInteractionSpec("BonusPointTransTypeGet", ApiMappings.getCallName ("BonusPointTransTypeGet"), Boolean.TRUE);

      _BonusPointTransTypeFindSpec = new BSDMInteractionSpec("BonusPointTransTypeFind", ApiMappings.getCallName ("BonusPointTransTypeFind"), Boolean.TRUE);

      _BonusPointTransTypeUpdateSpec = new BSDMInteractionSpec("BonusPointTransTypeUpdate", ApiMappings.getCallName ("BonusPointTransTypeUpdate"), Boolean.TRUE);

      _BonusPointTransTypeDeleteSpec = new BSDMInteractionSpec("BonusPointTransTypeDelete", ApiMappings.getCallName ("BonusPointTransTypeDelete"), Boolean.TRUE);

      _BonusPointTransTypeCreateSpec = new BSDMInteractionSpec("BonusPointTransTypeCreate", ApiMappings.getCallName ("BonusPointTransTypeCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public BonusPointTransTypeBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public BonusPointTransTypeBean(BSDMSettings settings, BSDMConnectionManager cm)
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
