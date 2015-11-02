
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: InterimBillBean.java
 * Definition File: Customer/InterimBill.xml
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
import com.csgsystems.bp.interfaces.InterimBillInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="InterimBillSessionBean"
 * display-name="InterimBill Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/InterimBillBean"
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

@Stateless(name="InterimBillBean", mappedName = "InterimBill")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("InterimBills")

public class InterimBillBean implements InterimBillInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _InterimBillGetSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InterimBillObjectData get (InterimBillObjectKeyData getIn) throws BSDMResourceException
  {
    return get (null, getIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public InterimBillObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam InterimBillObjectKeyData getIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InterimBillGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (getIn != null) InterimBillObjectKeyHelper.toMap (getIn, record, "InterimBill");
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
return InterimBillObjectHelper.fromMap (record, "InterimBill");
}

  private BSDMInteractionSpec _InterimBillFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return InterimBillObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InterimBillObjectDataList find (InterimBillObjectFilter findIn) throws BSDMResourceException
  {
    return find (null, findIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return InterimBillObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InterimBillObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,InterimBillObjectFilter findIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InterimBillFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (findIn != null) InterimBillObjectHelper.toMap (findIn, record, "InterimBill");
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
return InterimBillObjectHelper.fromMapList (record, "InterimBillList");
}

  private BSDMInteractionSpec _InterimBillCreateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillCreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Derived Fields: TrackingId, TrackingIdServ.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InterimBillObjectData create (InterimBillObjectData intBillCreateIn) throws BSDMResourceException
  {
    return create (null, intBillCreateIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillCreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Derived Fields: TrackingId, TrackingIdServ.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InterimBillObjectData create (@HeaderParam ("context")BSDMSessionContext context,InterimBillObjectData intBillCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InterimBillCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (intBillCreateIn != null) InterimBillObjectHelper.toMap (intBillCreateIn, record, "InterimBill");
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
return InterimBillObjectHelper.fromMap (record, "InterimBill");
}

  private BSDMInteractionSpec _InterimBillUpdateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillUpdateIn Input  Object.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InterimBillObjectData update (InterimBillObjectData intBillUpdateIn) throws BSDMResourceException
  {
    return update (null, intBillUpdateIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillUpdateIn Input  Object.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InterimBillObjectData update (@HeaderParam ("context")BSDMSessionContext context,InterimBillObjectData intBillUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InterimBillUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (intBillUpdateIn != null) InterimBillObjectHelper.toMap (intBillUpdateIn, record, "InterimBill");
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
return InterimBillObjectHelper.fromMap (record, "InterimBill");
}

  private BSDMInteractionSpec _InterimBillCancelSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillDelIn Input Object Key.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InterimBillObjectData cancel (InterimBillObjectKeyData intBillDelIn) throws BSDMResourceException
  {
    return cancel (null, intBillDelIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillDelIn Input Object Key.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("cancel")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InterimBillObjectData cancel (@HeaderParam ("context")BSDMSessionContext context,InterimBillObjectKeyData intBillDelIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InterimBillCancelSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (intBillDelIn != null) InterimBillObjectKeyHelper.toMap (intBillDelIn, record, "InterimBill");
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
return InterimBillObjectHelper.fromMap (record, "InterimBill");
}

  private BSDMInteractionSpec _InterimBillRequestHotSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillHotIn Input  Object.
   * @param Hot_Invoice Input  Object (Optional).  Read-Only fields: HotReqReturnCustom, HotReqReturnStatus, HotReqBillRefNo, HotReqBillRefResets.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InterimBillObjectData requestHot (InterimBillObjectData intBillHotIn, HotInvoiceObjectData Hot_Invoice) throws BSDMResourceException
  {
    return requestHot (null, intBillHotIn, Hot_Invoice);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillHotIn Input  Object.
   * @param Hot_Invoice Input  Object (Optional).  Read-Only fields: HotReqReturnCustom, HotReqReturnStatus, HotReqBillRefNo, HotReqBillRefResets.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("requestHot")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InterimBillObjectData requestHot (@HeaderParam ("context")BSDMSessionContext context,InterimBillObjectData intBillHotIn,@FormParam("HotInvoiceObject")HotInvoiceObjectData Hot_Invoice) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InterimBillRequestHotSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (intBillHotIn != null) InterimBillObjectHelper.toMap (intBillHotIn, record, "InterimBill");
      if (Hot_Invoice != null) HotInvoiceObjectHelper.toMap (Hot_Invoice, record, "HotInvoice");
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
return InterimBillObjectHelper.fromMap (record, "InterimBill");
}

  private BSDMInteractionSpec _InterimBillPollHotSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillPollIn Input  Object.
   * @return InterimBillPollHotOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InterimBillPollHotOutputData pollHot (InterimBillObjectData intBillPollIn) throws BSDMResourceException
  {
    return pollHot (null, intBillPollIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillPollIn Input  Object.
   * @return InterimBillPollHotOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("pollHot")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InterimBillPollHotOutputData pollHot (@HeaderParam ("context")BSDMSessionContext context,InterimBillObjectData intBillPollIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InterimBillPollHotSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (intBillPollIn != null) InterimBillObjectHelper.toMap (intBillPollIn, record, "InterimBill");
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
return InterimBillPollHotOutputHelper.fromMap (record);
}

  /**

   * Convenience method using default BSDMSessionContext.

   * @param getIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InterimBillObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InterimBillObjectData get (InterimBillObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, getIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InterimBillObjectData get (BSDMSessionContext context, InterimBillObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(getIn, defaultAction);
       
     cManager.checkConstraints(getIn, constraintAction);
       return get (context, getIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param findIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InterimBillObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InterimBillObjectDataList find (InterimBillObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, findIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InterimBillObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InterimBillObjectDataList find (BSDMSessionContext context, InterimBillObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(findIn, defaultAction);
       
     cManager.checkConstraints(findIn, constraintAction);
       return find (context, findIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param intBillCreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Derived Fields: TrackingId, TrackingIdServ.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InterimBillObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InterimBillObjectData create (InterimBillObjectData intBillCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, intBillCreateIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillCreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Derived Fields: TrackingId, TrackingIdServ.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InterimBillObjectData create (BSDMSessionContext context, InterimBillObjectData intBillCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(intBillCreateIn, defaultAction);
       
     cManager.checkConstraints(intBillCreateIn, constraintAction);
       return create (context, intBillCreateIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param intBillUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InterimBillObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InterimBillObjectData update (InterimBillObjectData intBillUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, intBillUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InterimBillObjectData update (BSDMSessionContext context, InterimBillObjectData intBillUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(intBillUpdateIn, defaultAction);
       
     cManager.checkConstraints(intBillUpdateIn, constraintAction);
       return update (context, intBillUpdateIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param intBillDelIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InterimBillObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InterimBillObjectData cancel (InterimBillObjectKeyData intBillDelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return cancel (null, intBillDelIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillDelIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InterimBillObjectData cancel (BSDMSessionContext context, InterimBillObjectKeyData intBillDelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(intBillDelIn, defaultAction);
       
     cManager.checkConstraints(intBillDelIn, constraintAction);
       return cancel (context, intBillDelIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param intBillHotIn Input  Object.

   * @param Hot_Invoice Input  Object (Optional).  Read-Only fields: HotReqReturnCustom, HotReqReturnStatus, HotReqBillRefNo, HotReqBillRefResets.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InterimBillObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InterimBillObjectData requestHot (InterimBillObjectData intBillHotIn, HotInvoiceObjectData Hot_Invoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return requestHot (null, intBillHotIn, Hot_Invoice, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillHotIn Input  Object.
   * @param Hot_Invoice Input  Object (Optional).  Read-Only fields: HotReqReturnCustom, HotReqReturnStatus, HotReqBillRefNo, HotReqBillRefResets.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InterimBillObjectData requestHot (BSDMSessionContext context, InterimBillObjectData intBillHotIn, HotInvoiceObjectData Hot_Invoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(intBillHotIn, defaultAction);
       
     dManager.setObjectDefaults(Hot_Invoice, defaultAction);
       
     cManager.checkConstraints(intBillHotIn, constraintAction);
       
     cManager.checkConstraints(Hot_Invoice, constraintAction);
       return requestHot (context, intBillHotIn, Hot_Invoice);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param intBillPollIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InterimBillPollHotOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InterimBillPollHotOutputData pollHot (InterimBillObjectData intBillPollIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return pollHot (null, intBillPollIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillPollIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InterimBillPollHotOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InterimBillPollHotOutputData pollHot (BSDMSessionContext context, InterimBillObjectData intBillPollIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(intBillPollIn, defaultAction);
       
     cManager.checkConstraints(intBillPollIn, constraintAction);
       return pollHot (context, intBillPollIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public InterimBillBean ()
  {
    try
    {
      _InterimBillGetSpec = new BSDMInteractionSpec("InterimBillGet", ApiMappings.getCallName ("InterimBillGet"), Boolean.TRUE);

      _InterimBillFindSpec = new BSDMInteractionSpec("InterimBillFind", ApiMappings.getCallName ("InterimBillFind"), Boolean.TRUE);

      _InterimBillCreateSpec = new BSDMInteractionSpec("InterimBillCreate", ApiMappings.getCallName ("InterimBillCreate"), Boolean.TRUE);

      _InterimBillUpdateSpec = new BSDMInteractionSpec("InterimBillUpdate", ApiMappings.getCallName ("InterimBillUpdate"), Boolean.TRUE);

      _InterimBillCancelSpec = new BSDMInteractionSpec("InterimBillCancel", ApiMappings.getCallName ("InterimBillCancel"), Boolean.TRUE);

      _InterimBillRequestHotSpec = new BSDMInteractionSpec("InterimBillRequestHot", ApiMappings.getCallName ("InterimBillRequestHot"), Boolean.TRUE);

      _InterimBillPollHotSpec = new BSDMInteractionSpec("InterimBillPollHot", ApiMappings.getCallName ("InterimBillPollHot"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public InterimBillBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public InterimBillBean(BSDMSettings settings, BSDMConnectionManager cm)
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
