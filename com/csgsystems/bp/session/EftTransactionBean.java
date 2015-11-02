
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: EftTransactionBean.java
 * Definition File: Customer/EftTransaction.xml
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
import com.csgsystems.bp.interfaces.EftTransactionInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="EftTransactionSessionBean"
 * display-name="EftTransaction Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/EftTransactionBean"
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

@Stateless(name="EftTransactionBean", mappedName = "EftTransaction")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("EftTransactions")

public class EftTransactionBean implements EftTransactionInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _EftTransactionGetSpec = null;
  /**
   * Get the EftTransaction row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param eftGetIn Input Object Key.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EftTransactionObjectData get (EftTransactionObjectKeyData eftGetIn) throws BSDMResourceException
  {
    return get (null, eftGetIn);
  }
  /**
   * Get the EftTransaction row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftGetIn Input Object Key.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public EftTransactionObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam EftTransactionObjectKeyData eftGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EftTransactionGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (eftGetIn != null) EftTransactionObjectKeyHelper.toMap (eftGetIn, record, "EftTransaction");
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
return EftTransactionObjectHelper.fromMap (record, "EftTransaction");
}

  private BSDMInteractionSpec _EftTransactionFindSpec = null;
  /**
   * Find EftTransactions that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param eftFindIn Input Filter Object.
   * @return EftTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EftTransactionObjectDataList find (EftTransactionObjectFilter eftFindIn) throws BSDMResourceException
  {
    return find (null, eftFindIn);
  }
  /**
   * Find EftTransactions that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftFindIn Input Filter Object.
   * @return EftTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EftTransactionObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,EftTransactionObjectFilter eftFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EftTransactionFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (eftFindIn != null) EftTransactionObjectHelper.toMap (eftFindIn, record, "EftTransaction");
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
return EftTransactionObjectHelper.fromMapList (record, "EftTransactionList");
}

  private BSDMInteractionSpec _EftTransactionUpdateSpec = null;
  /**
   * Update non-key fields for an EftTransaction row.  You can only update the bank information for an EftTransaction.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row..
   * Convenience method using default BSDMSessionContext.
   * @param eftUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, ClearingHouseId, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EftTransactionObjectData update (EftTransactionObjectData eftUpdateIn) throws BSDMResourceException
  {
    return update (null, eftUpdateIn);
  }
  /**
   * Update non-key fields for an EftTransaction row.  You can only update the bank information for an EftTransaction.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, ClearingHouseId, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EftTransactionObjectData update (@HeaderParam ("context")BSDMSessionContext context,EftTransactionObjectData eftUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EftTransactionUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (eftUpdateIn != null) EftTransactionObjectHelper.toMap (eftUpdateIn, record, "EftTransaction");
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
return EftTransactionObjectHelper.fromMap (record, "EftTransaction");
}

  private BSDMInteractionSpec _EftTransactionHoldSpec = null;
  /**
   * Change a WAITING EftTransaction's status to HOLD..
   * Convenience method using default BSDMSessionContext.
   * @param eftHoldIn Input Object Key.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EftTransactionObjectData hold (EftTransactionObjectKeyData eftHoldIn) throws BSDMResourceException
  {
    return hold (null, eftHoldIn);
  }
  /**
   * Change a WAITING EftTransaction's status to HOLD..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftHoldIn Input Object Key.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("hold")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EftTransactionObjectData hold (@HeaderParam ("context")BSDMSessionContext context,EftTransactionObjectKeyData eftHoldIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EftTransactionHoldSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (eftHoldIn != null) EftTransactionObjectKeyHelper.toMap (eftHoldIn, record, "EftTransaction");
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
return EftTransactionObjectHelper.fromMap (record, "EftTransaction");
}

  private BSDMInteractionSpec _EftTransactionReleaseSpec = null;
  /**
   * Release a Held EftTransaction..
   * Convenience method using default BSDMSessionContext.
   * @param eftRelIn Input Object Key.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EftTransactionObjectData release (EftTransactionObjectKeyData eftRelIn) throws BSDMResourceException
  {
    return release (null, eftRelIn);
  }
  /**
   * Release a Held EftTransaction..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftRelIn Input Object Key.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("release")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EftTransactionObjectData release (@HeaderParam ("context")BSDMSessionContext context,EftTransactionObjectKeyData eftRelIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EftTransactionReleaseSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (eftRelIn != null) EftTransactionObjectKeyHelper.toMap (eftRelIn, record, "EftTransaction");
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
return EftTransactionObjectHelper.fromMap (record, "EftTransaction");
}

  private BSDMInteractionSpec _EftTransactionUpdateFromAccountSpec = null;
  /**
   * Update the Payment-Profile id to the value provided in input request, if it is a non-real time Direct-Debit profile, in the PAYMENT_TRANS table.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row in PAYMENT_TRANS, but no row is inserted in PAYMENT_PROFILE table..
   * Convenience method using default BSDMSessionContext.
   * @param eftUpdateFAIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EftTransactionObjectData updateFromAccount (EftTransUFAObjectData eftUpdateFAIn) throws BSDMResourceException
  {
    return updateFromAccount (null, eftUpdateFAIn);
  }
  /**
   * Update the Payment-Profile id to the value provided in input request, if it is a non-real time Direct-Debit profile, in the PAYMENT_TRANS table.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row in PAYMENT_TRANS, but no row is inserted in PAYMENT_PROFILE table..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftUpdateFAIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("updateFromAccount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EftTransactionObjectData updateFromAccount (@HeaderParam ("context")BSDMSessionContext context,EftTransUFAObjectData eftUpdateFAIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EftTransactionUpdateFromAccountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (eftUpdateFAIn != null) EftTransUFAObjectHelper.toMap (eftUpdateFAIn, record, "EftTransaction");
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
return EftTransactionObjectHelper.fromMap (record, "EftTransaction");
}

  /**

   * Get the EftTransaction row that corresponds to the supplied key..

   * Convenience method using default BSDMSessionContext.

   * @param eftGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EftTransactionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EftTransactionObjectData get (EftTransactionObjectKeyData eftGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, eftGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get the EftTransaction row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EftTransactionObjectData get (BSDMSessionContext context, EftTransactionObjectKeyData eftGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(eftGetIn, defaultAction);
       
     cManager.checkConstraints(eftGetIn, constraintAction);
       return get (context, eftGetIn);
  }

  /**

   * Find EftTransactions that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param eftFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EftTransactionObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EftTransactionObjectDataList find (EftTransactionObjectFilter eftFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, eftFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find EftTransactions that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EftTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EftTransactionObjectDataList find (BSDMSessionContext context, EftTransactionObjectFilter eftFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(eftFindIn, defaultAction);
       
     cManager.checkConstraints(eftFindIn, constraintAction);
       return find (context, eftFindIn);
  }

  /**

   * Update non-key fields for an EftTransaction row.  You can only update the bank information for an EftTransaction.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row..

   * Convenience method using default BSDMSessionContext.

   * @param eftUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, ClearingHouseId, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EftTransactionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EftTransactionObjectData update (EftTransactionObjectData eftUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, eftUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields for an EftTransaction row.  You can only update the bank information for an EftTransaction.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, ClearingHouseId, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EftTransactionObjectData update (BSDMSessionContext context, EftTransactionObjectData eftUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(eftUpdateIn, defaultAction);
       
     cManager.checkConstraints(eftUpdateIn, constraintAction);
       return update (context, eftUpdateIn);
  }

  /**

   * Change a WAITING EftTransaction's status to HOLD..

   * Convenience method using default BSDMSessionContext.

   * @param eftHoldIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EftTransactionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EftTransactionObjectData hold (EftTransactionObjectKeyData eftHoldIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return hold (null, eftHoldIn, defaultAction, constraintAction);
  }
  /** 
   * Change a WAITING EftTransaction's status to HOLD..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftHoldIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EftTransactionObjectData hold (BSDMSessionContext context, EftTransactionObjectKeyData eftHoldIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(eftHoldIn, defaultAction);
       
     cManager.checkConstraints(eftHoldIn, constraintAction);
       return hold (context, eftHoldIn);
  }

  /**

   * Release a Held EftTransaction..

   * Convenience method using default BSDMSessionContext.

   * @param eftRelIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EftTransactionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EftTransactionObjectData release (EftTransactionObjectKeyData eftRelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return release (null, eftRelIn, defaultAction, constraintAction);
  }
  /** 
   * Release a Held EftTransaction..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftRelIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EftTransactionObjectData release (BSDMSessionContext context, EftTransactionObjectKeyData eftRelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(eftRelIn, defaultAction);
       
     cManager.checkConstraints(eftRelIn, constraintAction);
       return release (context, eftRelIn);
  }

  /**

   * Update the Payment-Profile id to the value provided in input request, if it is a non-real time Direct-Debit profile, in the PAYMENT_TRANS table.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row in PAYMENT_TRANS, but no row is inserted in PAYMENT_PROFILE table..

   * Convenience method using default BSDMSessionContext.

   * @param eftUpdateFAIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EftTransactionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EftTransactionObjectData updateFromAccount (EftTransUFAObjectData eftUpdateFAIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return updateFromAccount (null, eftUpdateFAIn, defaultAction, constraintAction);
  }
  /** 
   * Update the Payment-Profile id to the value provided in input request, if it is a non-real time Direct-Debit profile, in the PAYMENT_TRANS table.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row in PAYMENT_TRANS, but no row is inserted in PAYMENT_PROFILE table..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftUpdateFAIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EftTransactionObjectData updateFromAccount (BSDMSessionContext context, EftTransUFAObjectData eftUpdateFAIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(eftUpdateFAIn, defaultAction);
       
     cManager.checkConstraints(eftUpdateFAIn, constraintAction);
       return updateFromAccount (context, eftUpdateFAIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public EftTransactionBean ()
  {
    try
    {
      _EftTransactionGetSpec = new BSDMInteractionSpec("EftTransactionGet", ApiMappings.getCallName ("EftTransactionGet"), Boolean.TRUE);

      _EftTransactionFindSpec = new BSDMInteractionSpec("EftTransactionFind", ApiMappings.getCallName ("EftTransactionFind"), Boolean.TRUE);

      _EftTransactionUpdateSpec = new BSDMInteractionSpec("EftTransactionUpdate", ApiMappings.getCallName ("EftTransactionUpdate"), Boolean.TRUE);

      _EftTransactionHoldSpec = new BSDMInteractionSpec("EftTransactionHold", ApiMappings.getCallName ("EftTransactionHold"), Boolean.TRUE);

      _EftTransactionReleaseSpec = new BSDMInteractionSpec("EftTransactionRelease", ApiMappings.getCallName ("EftTransactionRelease"), Boolean.TRUE);

      _EftTransactionUpdateFromAccountSpec = new BSDMInteractionSpec("EftTransactionUpdateFromAccount", ApiMappings.getCallName ("EftTransactionUpdateFromAccount"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public EftTransactionBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public EftTransactionBean(BSDMSettings settings, BSDMConnectionManager cm)
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
