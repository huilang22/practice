
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: PaymentMerchantIdBean.java
 * Definition File: Admin/PaymentMerchantId.xml
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
import com.csgsystems.bp.interfaces.PaymentMerchantIdInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="PaymentMerchantIdSessionBean"
 * display-name="PaymentMerchantId Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/PaymentMerchantIdBean"
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

@Stateless(name="PaymentMerchantIdBean", mappedName = "PaymentMerchantId")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("PaymentMerchantIds")

public class PaymentMerchantIdBean implements PaymentMerchantIdInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _PaymentMerchantIdGetSpec = null;
  /**
   * Get a PaymentMerchantId..
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdgetIn Input Object Key.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentMerchantIdObjectData get (PaymentMerchantIdObjectKeyData PaymentMerchantIdgetIn) throws BSDMResourceException
  {
    return get (null, PaymentMerchantIdgetIn);
  }
  /**
   * Get a PaymentMerchantId..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdgetIn Input Object Key.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public PaymentMerchantIdObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam PaymentMerchantIdObjectKeyData PaymentMerchantIdgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentMerchantIdGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PaymentMerchantIdgetIn != null) PaymentMerchantIdObjectKeyHelper.toMap (PaymentMerchantIdgetIn, record, "PaymentMerchantId");
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
return PaymentMerchantIdObjectHelper.fromMap (record, "PaymentMerchantId");
}

  private BSDMInteractionSpec _PaymentMerchantIdFindSpec = null;
  /**
   * Find PaymentMerchantIds..
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdfindIn Input Filter Object.
   * @return PaymentMerchantIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentMerchantIdObjectDataList find (PaymentMerchantIdObjectFilter PaymentMerchantIdfindIn) throws BSDMResourceException
  {
    return find (null, PaymentMerchantIdfindIn);
  }
  /**
   * Find PaymentMerchantIds..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdfindIn Input Filter Object.
   * @return PaymentMerchantIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentMerchantIdObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,PaymentMerchantIdObjectFilter PaymentMerchantIdfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentMerchantIdFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PaymentMerchantIdfindIn != null) PaymentMerchantIdObjectHelper.toMap (PaymentMerchantIdfindIn, record, "PaymentMerchantId");
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
return PaymentMerchantIdObjectHelper.fromMapList (record, "PaymentMerchantIdList");
}

  private BSDMInteractionSpec _PaymentMerchantIdUpdateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdUpdateIn Input  Object.  Read-Only fields: IsInternal, IsDefault, EpgMerchantId, Status.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentMerchantIdObjectData update (PaymentMerchantIdObjectData PaymentMerchantIdUpdateIn) throws BSDMResourceException
  {
    return update (null, PaymentMerchantIdUpdateIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdUpdateIn Input  Object.  Read-Only fields: IsInternal, IsDefault, EpgMerchantId, Status.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentMerchantIdObjectData update (@HeaderParam ("context")BSDMSessionContext context,PaymentMerchantIdObjectData PaymentMerchantIdUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentMerchantIdUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PaymentMerchantIdUpdateIn != null) PaymentMerchantIdObjectHelper.toMap (PaymentMerchantIdUpdateIn, record, "PaymentMerchantId");
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
return PaymentMerchantIdObjectHelper.fromMap (record, "PaymentMerchantId");
}

  private BSDMInteractionSpec _PaymentMerchantIdCreateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdCreateIn Input  Object.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentMerchantIdObjectData create (PaymentMerchantIdObjectData PaymentMerchantIdCreateIn) throws BSDMResourceException
  {
    return create (null, PaymentMerchantIdCreateIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdCreateIn Input  Object.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentMerchantIdObjectData create (@HeaderParam ("context")BSDMSessionContext context,PaymentMerchantIdObjectData PaymentMerchantIdCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentMerchantIdCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PaymentMerchantIdCreateIn != null) PaymentMerchantIdObjectHelper.toMap (PaymentMerchantIdCreateIn, record, "PaymentMerchantId");
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
return PaymentMerchantIdObjectHelper.fromMap (record, "PaymentMerchantId");
}

  private BSDMInteractionSpec _PaymentMerchantIdDeleteSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdDeleteIn Input Object Key.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentMerchantIdObjectData delete (PaymentMerchantIdObjectKeyData PaymentMerchantIdDeleteIn) throws BSDMResourceException
  {
    return delete (null, PaymentMerchantIdDeleteIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdDeleteIn Input Object Key.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentMerchantIdObjectData delete (@HeaderParam ("context")BSDMSessionContext context,PaymentMerchantIdObjectKeyData PaymentMerchantIdDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentMerchantIdDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PaymentMerchantIdDeleteIn != null) PaymentMerchantIdObjectKeyHelper.toMap (PaymentMerchantIdDeleteIn, record, "PaymentMerchantId");
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
return PaymentMerchantIdObjectHelper.fromMap (record, "PaymentMerchantId");
}

  /**

   * Get a PaymentMerchantId..

   * Convenience method using default BSDMSessionContext.

   * @param PaymentMerchantIdgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentMerchantIdObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentMerchantIdObjectData get (PaymentMerchantIdObjectKeyData PaymentMerchantIdgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, PaymentMerchantIdgetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a PaymentMerchantId..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentMerchantIdObjectData get (BSDMSessionContext context, PaymentMerchantIdObjectKeyData PaymentMerchantIdgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PaymentMerchantIdgetIn, defaultAction);
       
     cManager.checkConstraints(PaymentMerchantIdgetIn, constraintAction);
       return get (context, PaymentMerchantIdgetIn);
  }

  /**

   * Find PaymentMerchantIds..

   * Convenience method using default BSDMSessionContext.

   * @param PaymentMerchantIdfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentMerchantIdObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentMerchantIdObjectDataList find (PaymentMerchantIdObjectFilter PaymentMerchantIdfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, PaymentMerchantIdfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find PaymentMerchantIds..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentMerchantIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentMerchantIdObjectDataList find (BSDMSessionContext context, PaymentMerchantIdObjectFilter PaymentMerchantIdfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PaymentMerchantIdfindIn, defaultAction);
       
     cManager.checkConstraints(PaymentMerchantIdfindIn, constraintAction);
       return find (context, PaymentMerchantIdfindIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param PaymentMerchantIdUpdateIn Input  Object.  Read-Only fields: IsInternal, IsDefault, EpgMerchantId, Status.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentMerchantIdObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentMerchantIdObjectData update (PaymentMerchantIdObjectData PaymentMerchantIdUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, PaymentMerchantIdUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdUpdateIn Input  Object.  Read-Only fields: IsInternal, IsDefault, EpgMerchantId, Status.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentMerchantIdObjectData update (BSDMSessionContext context, PaymentMerchantIdObjectData PaymentMerchantIdUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PaymentMerchantIdUpdateIn, defaultAction);
       
     cManager.checkConstraints(PaymentMerchantIdUpdateIn, constraintAction);
       return update (context, PaymentMerchantIdUpdateIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param PaymentMerchantIdCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentMerchantIdObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentMerchantIdObjectData create (PaymentMerchantIdObjectData PaymentMerchantIdCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, PaymentMerchantIdCreateIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentMerchantIdObjectData create (BSDMSessionContext context, PaymentMerchantIdObjectData PaymentMerchantIdCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PaymentMerchantIdCreateIn, defaultAction);
       
     cManager.checkConstraints(PaymentMerchantIdCreateIn, constraintAction);
       return create (context, PaymentMerchantIdCreateIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param PaymentMerchantIdDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentMerchantIdObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentMerchantIdObjectData delete (PaymentMerchantIdObjectKeyData PaymentMerchantIdDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, PaymentMerchantIdDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentMerchantIdObjectData delete (BSDMSessionContext context, PaymentMerchantIdObjectKeyData PaymentMerchantIdDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PaymentMerchantIdDeleteIn, defaultAction);
       
     cManager.checkConstraints(PaymentMerchantIdDeleteIn, constraintAction);
       return delete (context, PaymentMerchantIdDeleteIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public PaymentMerchantIdBean ()
  {
    try
    {
      _PaymentMerchantIdGetSpec = new BSDMInteractionSpec("PaymentMerchantIdGet", ApiMappings.getCallName ("PaymentMerchantIdGet"), Boolean.TRUE);

      _PaymentMerchantIdFindSpec = new BSDMInteractionSpec("PaymentMerchantIdFind", ApiMappings.getCallName ("PaymentMerchantIdFind"), Boolean.TRUE);

      _PaymentMerchantIdUpdateSpec = new BSDMInteractionSpec("PaymentMerchantIdUpdate", ApiMappings.getCallName ("PaymentMerchantIdUpdate"), Boolean.TRUE);

      _PaymentMerchantIdCreateSpec = new BSDMInteractionSpec("PaymentMerchantIdCreate", ApiMappings.getCallName ("PaymentMerchantIdCreate"), Boolean.TRUE);

      _PaymentMerchantIdDeleteSpec = new BSDMInteractionSpec("PaymentMerchantIdDelete", ApiMappings.getCallName ("PaymentMerchantIdDelete"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public PaymentMerchantIdBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public PaymentMerchantIdBean(BSDMSettings settings, BSDMConnectionManager cm)
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
