
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: RefundBean.java
 * Definition File: Customer/Refund.xml
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
import com.csgsystems.bp.interfaces.RefundInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="RefundSessionBean"
 * display-name="Refund Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/RefundBean"
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

@Stateless(name="RefundBean", mappedName = "Refund")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Refunds")

public class RefundBean implements RefundInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _RefundGetSpec = null;
  /**
   * Get a unique Refund row..
   * Convenience method using default BSDMSessionContext.
   * @param refundGetIn Input Object Key.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RefundObjectData get (RefundObjectKeyData refundGetIn) throws BSDMResourceException
  {
    return get (null, refundGetIn);
  }
  /**
   * Get a unique Refund row..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundGetIn Input Object Key.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public RefundObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam RefundObjectKeyData refundGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RefundGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (refundGetIn != null) RefundObjectKeyHelper.toMap (refundGetIn, record, "Refund");
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
return RefundObjectHelper.fromMap (record, "Refund");
}

  private BSDMInteractionSpec _RefundFindSpec = null;
  /**
   * Find Refund's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param refundFindIn Input Filter Object.
   * @return RefundObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RefundObjectDataList find (RefundObjectFilter refundFindIn) throws BSDMResourceException
  {
    return find (null, refundFindIn);
  }
  /**
   * Find Refund's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundFindIn Input Filter Object.
   * @return RefundObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RefundObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,RefundObjectFilter refundFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RefundFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (refundFindIn != null) RefundObjectHelper.toMap (refundFindIn, record, "Refund");
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
return RefundObjectHelper.fromMapList (record, "RefundList");
}

  private BSDMInteractionSpec _RefundCreateSpec = null;
  /**
   * Create a new Refund..
   * Convenience method using default BSDMSessionContext.
   * @param refundCreateIn Input  Object.  Defaulted Fields: RefundReasonCode, RefundStatus.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RefundObjectData create (RefundObjectData refundCreateIn) throws BSDMResourceException
  {
    return create (null, refundCreateIn);
  }
  /**
   * Create a new Refund..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundCreateIn Input  Object.  Defaulted Fields: RefundReasonCode, RefundStatus.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RefundObjectData create (@HeaderParam ("context")BSDMSessionContext context,RefundObjectData refundCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RefundCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (refundCreateIn != null) RefundObjectHelper.toMap (refundCreateIn, record, "Refund");
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
return RefundObjectHelper.fromMap (record, "Refund");
}

  private BSDMInteractionSpec _RefundMarkPaidSpec = null;
  /**
   * Mark the supplied Refund row as having been Paid..
   * Convenience method using default BSDMSessionContext.
   * @param refundMarkIn Input Object Key.
   * @param TreasuryDate.
   * @param CheckNum.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RefundObjectData markPaid (RefundObjectKeyData refundMarkIn, Date TreasuryDate, String CheckNum) throws BSDMResourceException
  {
    return markPaid (null, refundMarkIn, TreasuryDate, CheckNum);
  }
  /**
   * Mark the supplied Refund row as having been Paid..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundMarkIn Input Object Key.
   * @param TreasuryDate.
   * @param CheckNum.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("markPaid")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RefundObjectData markPaid (@HeaderParam ("context")BSDMSessionContext context,RefundObjectKeyData refundMarkIn,@FormParam("TreasuryDate")Date TreasuryDate,@FormParam("CheckNum")String CheckNum) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RefundMarkPaidSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (refundMarkIn != null) RefundObjectKeyHelper.toMap (refundMarkIn, record, "Refund");

      if (TreasuryDate != null) record.put ("TreasuryDate", TreasuryDate);

      if (CheckNum != null) record.put ("CheckNum", CheckNum);
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
return RefundObjectHelper.fromMap (record, "Refund");
}

  private BSDMInteractionSpec _RefundDenySpec = null;
  /**
   * Deny the request for the Refund..
   * Convenience method using default BSDMSessionContext.
   * @param refundDenyIn Input Object Key.
   * @param TreasuryFlag (null is allowed) (has a default).
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RefundObjectData deny (RefundObjectKeyData refundDenyIn, Integer TreasuryFlag) throws BSDMResourceException
  {
    return deny (null, refundDenyIn, TreasuryFlag);
  }
  /**
   * Deny the request for the Refund..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundDenyIn Input Object Key.
   * @param TreasuryFlag (null is allowed) (has a default).
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("deny")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RefundObjectData deny (@HeaderParam ("context")BSDMSessionContext context,RefundObjectKeyData refundDenyIn,@FormParam("TreasuryFlag")Integer TreasuryFlag) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RefundDenySpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (refundDenyIn != null) RefundObjectKeyHelper.toMap (refundDenyIn, record, "Refund");

      if (TreasuryFlag != null) record.put ("TreasuryFlag", TreasuryFlag);
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
return RefundObjectHelper.fromMap (record, "Refund");
}

  private BSDMInteractionSpec _RefundApproveSpec = null;
  /**
   * Approve the requested Refund..
   * Convenience method using default BSDMSessionContext.
   * @param refundApproveIn Input Object Key.
   * @param AccountInternalId.
   * @param User.
   * @param Supervisor.
   * @param Amount.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RefundObjectData approve (RefundObjectKeyData refundApproveIn, Integer AccountInternalId, String User, String Supervisor, BigInteger Amount) throws BSDMResourceException
  {
    return approve (null, refundApproveIn, AccountInternalId, User, Supervisor, Amount);
  }
  /**
   * Approve the requested Refund..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundApproveIn Input Object Key.
   * @param AccountInternalId.
   * @param User.
   * @param Supervisor.
   * @param Amount.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("approve")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RefundObjectData approve (@HeaderParam ("context")BSDMSessionContext context,RefundObjectKeyData refundApproveIn,@FormParam("AccountInternalId")Integer AccountInternalId,@FormParam("User")String User,@FormParam("Supervisor")String Supervisor,@FormParam("Amount")BigInteger Amount) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RefundApproveSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (refundApproveIn != null) RefundObjectKeyHelper.toMap (refundApproveIn, record, "Refund");

      if (AccountInternalId != null) record.put ("AccountInternalId", AccountInternalId);

      if (User != null) record.put ("User", User);

      if (Supervisor != null) record.put ("Supervisor", Supervisor);

      if (Amount != null) record.put ("Amount", Amount);
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
return RefundObjectHelper.fromMap (record, "Refund");
}

  private BSDMInteractionSpec _RefundUpdateSpec = null;
  /**
   * Update the non-key fields of the Refund..
   * Can only update AltContactId and AltCurrencyCode, and only when RefundStatus is NEW (0).
   * Convenience method using default BSDMSessionContext.
   * @param refundUpdateIn Input  Object.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RefundObjectData update (RefundObjectData refundUpdateIn) throws BSDMResourceException
  {
    return update (null, refundUpdateIn);
  }
  /**
   * Update the non-key fields of the Refund..
   * Can only update AltContactId and AltCurrencyCode, and only when RefundStatus is NEW (0).
   * @param context The session context to use when connecting to the APITS server.
   * @param refundUpdateIn Input  Object.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RefundObjectData update (@HeaderParam ("context")BSDMSessionContext context,RefundObjectData refundUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RefundUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (refundUpdateIn != null) RefundObjectHelper.toMap (refundUpdateIn, record, "Refund");
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
return RefundObjectHelper.fromMap (record, "Refund");
}

  /**

   * Get a unique Refund row..

   * Convenience method using default BSDMSessionContext.

   * @param refundGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RefundObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RefundObjectData get (RefundObjectKeyData refundGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, refundGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique Refund row..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RefundObjectData get (BSDMSessionContext context, RefundObjectKeyData refundGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(refundGetIn, defaultAction);
       
     cManager.checkConstraints(refundGetIn, constraintAction);
       return get (context, refundGetIn);
  }

  /**

   * Find Refund's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param refundFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RefundObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RefundObjectDataList find (RefundObjectFilter refundFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, refundFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find Refund's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RefundObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RefundObjectDataList find (BSDMSessionContext context, RefundObjectFilter refundFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(refundFindIn, defaultAction);
       
     cManager.checkConstraints(refundFindIn, constraintAction);
       return find (context, refundFindIn);
  }

  /**

   * Create a new Refund..

   * Convenience method using default BSDMSessionContext.

   * @param refundCreateIn Input  Object.  Defaulted Fields: RefundReasonCode, RefundStatus.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RefundObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RefundObjectData create (RefundObjectData refundCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, refundCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new Refund..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundCreateIn Input  Object.  Defaulted Fields: RefundReasonCode, RefundStatus.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RefundObjectData create (BSDMSessionContext context, RefundObjectData refundCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(refundCreateIn, defaultAction);
       
     cManager.checkConstraints(refundCreateIn, constraintAction);
       return create (context, refundCreateIn);
  }

  /**

   * Mark the supplied Refund row as having been Paid..

   * Convenience method using default BSDMSessionContext.

   * @param refundMarkIn Input Object Key.

   * @param TreasuryDate.

   * @param CheckNum.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RefundObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RefundObjectData markPaid (RefundObjectKeyData refundMarkIn, Date TreasuryDate, String CheckNum, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return markPaid (null, refundMarkIn, TreasuryDate, CheckNum, defaultAction, constraintAction);
  }
  /** 
   * Mark the supplied Refund row as having been Paid..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundMarkIn Input Object Key.
   * @param TreasuryDate.
   * @param CheckNum.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RefundObjectData markPaid (BSDMSessionContext context, RefundObjectKeyData refundMarkIn, Date TreasuryDate, String CheckNum, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(refundMarkIn, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(refundMarkIn, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return markPaid (context, refundMarkIn, TreasuryDate, CheckNum);
  }

  /**

   * Deny the request for the Refund..

   * Convenience method using default BSDMSessionContext.

   * @param refundDenyIn Input Object Key.

   * @param TreasuryFlag (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RefundObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RefundObjectData deny (RefundObjectKeyData refundDenyIn, Integer TreasuryFlag, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return deny (null, refundDenyIn, TreasuryFlag, defaultAction, constraintAction);
  }
  /** 
   * Deny the request for the Refund..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundDenyIn Input Object Key.
   * @param TreasuryFlag (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RefundObjectData deny (BSDMSessionContext context, RefundObjectKeyData refundDenyIn, Integer TreasuryFlag, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(refundDenyIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(refundDenyIn, constraintAction);
       
    //Constraints not supported on Input-Column
return deny (context, refundDenyIn, TreasuryFlag);
  }

  /**

   * Approve the requested Refund..

   * Convenience method using default BSDMSessionContext.

   * @param refundApproveIn Input Object Key.

   * @param AccountInternalId.

   * @param User.

   * @param Supervisor.

   * @param Amount.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RefundObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RefundObjectData approve (RefundObjectKeyData refundApproveIn, Integer AccountInternalId, String User, String Supervisor, BigInteger Amount, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return approve (null, refundApproveIn, AccountInternalId, User, Supervisor, Amount, defaultAction, constraintAction);
  }
  /** 
   * Approve the requested Refund..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundApproveIn Input Object Key.
   * @param AccountInternalId.
   * @param User.
   * @param Supervisor.
   * @param Amount.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RefundObjectData approve (BSDMSessionContext context, RefundObjectKeyData refundApproveIn, Integer AccountInternalId, String User, String Supervisor, BigInteger Amount, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(refundApproveIn, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(refundApproveIn, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return approve (context, refundApproveIn, AccountInternalId, User, Supervisor, Amount);
  }

  /**

   * Update the non-key fields of the Refund..

   * Can only update AltContactId and AltCurrencyCode, and only when RefundStatus is NEW (0).

   * Convenience method using default BSDMSessionContext.

   * @param refundUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RefundObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RefundObjectData update (RefundObjectData refundUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, refundUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of the Refund..
   * Can only update AltContactId and AltCurrencyCode, and only when RefundStatus is NEW (0).
   * @param context The session context to use when connecting to the APITS server.
   * @param refundUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RefundObjectData update (BSDMSessionContext context, RefundObjectData refundUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(refundUpdateIn, defaultAction);
       
     cManager.checkConstraints(refundUpdateIn, constraintAction);
       return update (context, refundUpdateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public RefundBean ()
  {
    try
    {
      _RefundGetSpec = new BSDMInteractionSpec("RefundGet", ApiMappings.getCallName ("RefundGet"), Boolean.TRUE);

      _RefundFindSpec = new BSDMInteractionSpec("RefundFind", ApiMappings.getCallName ("RefundFind"), Boolean.TRUE);

      _RefundCreateSpec = new BSDMInteractionSpec("RefundCreate", ApiMappings.getCallName ("RefundCreate"), Boolean.TRUE);

      _RefundMarkPaidSpec = new BSDMInteractionSpec("RefundMarkPaid", ApiMappings.getCallName ("RefundMarkPaid"), Boolean.TRUE);

      _RefundDenySpec = new BSDMInteractionSpec("RefundDeny", ApiMappings.getCallName ("RefundDeny"), Boolean.TRUE);

      _RefundApproveSpec = new BSDMInteractionSpec("RefundApprove", ApiMappings.getCallName ("RefundApprove"), Boolean.TRUE);

      _RefundUpdateSpec = new BSDMInteractionSpec("RefundUpdate", ApiMappings.getCallName ("RefundUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public RefundBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public RefundBean(BSDMSettings settings, BSDMConnectionManager cm)
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
