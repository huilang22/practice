
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AccountBonusPointTransactionBean.java
 * Definition File: Customer/AccountBonusPointTransaction.xml
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
import com.csgsystems.bp.interfaces.AccountBonusPointTransactionInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AccountBonusPointTransactionSessionBean"
 * display-name="AccountBonusPointTransaction Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AccountBonusPointTransactionBean"
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

@Stateless(name="AccountBonusPointTransactionBean", mappedName = "AccountBonusPointTransaction")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AccountBonusPointTransactions")

public class AccountBonusPointTransactionBean implements AccountBonusPointTransactionInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AccountBonusPointTransactionGetSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBonusPointTransactionObjectData get (AccountBonusPointTransactionObjectKeyData getIn) throws BSDMResourceException
  {
    return get (null, getIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AccountBonusPointTransactionObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountBonusPointTransactionObjectKeyData getIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (getIn != null) AccountBonusPointTransactionObjectKeyHelper.toMap (getIn, record, "AccountBonusPointTransaction");
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
return AccountBonusPointTransactionObjectHelper.fromMap (record, "AccountBonusPointTransaction");
}

  private BSDMInteractionSpec _AccountBonusPointTransactionFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBonusPointTransactionObjectDataList find (AccountBonusPointTransactionObjectFilter findIn) throws BSDMResourceException
  {
    return find (null, findIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBonusPointTransactionObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AccountBonusPointTransactionObjectFilter findIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (findIn != null) AccountBonusPointTransactionObjectHelper.toMap (findIn, record, "AccountBonusPointTransaction");
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
return AccountBonusPointTransactionObjectHelper.fromMapList (record, "AccountBonusPointTransactionList");
}

  private BSDMInteractionSpec _AccountBonusPointTransactionCreateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param CBPCreateIn1 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, EntryDate, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBonusPointTransactionObjectData create (AccountBonusPointTransactionObjectData CBPCreateIn1) throws BSDMResourceException
  {
    return create (null, CBPCreateIn1);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPCreateIn1 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, EntryDate, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBonusPointTransactionObjectData create (@HeaderParam ("context")BSDMSessionContext context,AccountBonusPointTransactionObjectData CBPCreateIn1) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CBPCreateIn1 != null) AccountBonusPointTransactionObjectHelper.toMap (CBPCreateIn1, record, "AccountBonusPointTransaction");
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
return AccountBonusPointTransactionObjectHelper.fromMap (record, "AccountBonusPointTransaction");
}

  private BSDMInteractionSpec _AccountBonusPointTransactionUpdateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param CBPUpdateIn1 Input  Object.  Read-Only fields: TransStatus, BonusPointTransType, BillRefNo, BillRefResets, DistributedAmount, ChgWho.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBonusPointTransactionObjectData update (AccountBonusPointTransactionObjectData CBPUpdateIn1) throws BSDMResourceException
  {
    return update (null, CBPUpdateIn1);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPUpdateIn1 Input  Object.  Read-Only fields: TransStatus, BonusPointTransType, BillRefNo, BillRefResets, DistributedAmount, ChgWho.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBonusPointTransactionObjectData update (@HeaderParam ("context")BSDMSessionContext context,AccountBonusPointTransactionObjectData CBPUpdateIn1) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CBPUpdateIn1 != null) AccountBonusPointTransactionObjectHelper.toMap (CBPUpdateIn1, record, "AccountBonusPointTransaction");
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
return AccountBonusPointTransactionObjectHelper.fromMap (record, "AccountBonusPointTransaction");
}

  private BSDMInteractionSpec _AccountBonusPointTransactionDeleteSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param CBPDelIn1 Input Object Key.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBonusPointTransactionObjectData delete (AccountBonusPointTransactionObjectKeyData CBPDelIn1) throws BSDMResourceException
  {
    return delete (null, CBPDelIn1);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPDelIn1 Input Object Key.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBonusPointTransactionObjectData delete (@HeaderParam ("context")BSDMSessionContext context,AccountBonusPointTransactionObjectKeyData CBPDelIn1) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CBPDelIn1 != null) AccountBonusPointTransactionObjectKeyHelper.toMap (CBPDelIn1, record, "AccountBonusPointTransaction");
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
return AccountBonusPointTransactionObjectHelper.fromMap (record, "AccountBonusPointTransaction");
}

  private BSDMInteractionSpec _AccountBonusPointTransactionBalanceSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param account_internal_id.
   * @param current_date (has a default).
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BigInteger balance (Integer account_internal_id, Date current_date) throws BSDMResourceException
  {
    return balance (null, account_internal_id, current_date);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internal_id.
   * @param current_date (has a default).
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("balance")
@Produces({"application/json","application/xml"})
  public BigInteger balance (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("account_internal_id")Integer account_internal_id,@QueryParam("current_date")Date current_date) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionBalanceSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (account_internal_id != null) record.put ("AccountInternalId", account_internal_id);

      if (current_date != null) record.put ("CurrentDate", current_date);
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
Object _tmp = record.get ("Amount");
    BigInteger _out = null;
        _out = (BigInteger) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _AccountBonusPointTransactionExpiringBalanceSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param AccountInternalId.
   * @param from_date (has a default).
   * @param to_date (has a default).
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BigInteger expiringBalance (Integer AccountInternalId, Date from_date, Date to_date) throws BSDMResourceException
  {
    return expiringBalance (null, AccountInternalId, from_date, to_date);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountInternalId.
   * @param from_date (has a default).
   * @param to_date (has a default).
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("expiringBalance")
@Produces({"application/json","application/xml"})
  public BigInteger expiringBalance (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("AccountInternalId")Integer AccountInternalId,@QueryParam("from_date")Date from_date,@QueryParam("to_date")Date to_date) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionExpiringBalanceSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (AccountInternalId != null) record.put ("AccountInternalId", AccountInternalId);

      if (from_date != null) record.put ("FromDate", from_date);

      if (to_date != null) record.put ("ToDate", to_date);
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
Object _tmp = record.get ("Amount");
    BigInteger _out = null;
        _out = (BigInteger) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _AccountBonusPointTransactionActivateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param actIn1 Input Object Key.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBonusPointTransactionObjectData activate (AccountBonusPointTransactionObjectKeyData actIn1) throws BSDMResourceException
  {
    return activate (null, actIn1);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param actIn1 Input Object Key.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("activate")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBonusPointTransactionObjectData activate (@HeaderParam ("context")BSDMSessionContext context,AccountBonusPointTransactionObjectKeyData actIn1) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionActivateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (actIn1 != null) AccountBonusPointTransactionObjectKeyHelper.toMap (actIn1, record, "AccountBonusPointTransaction");
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
return AccountBonusPointTransactionObjectHelper.fromMap (record, "AccountBonusPointTransaction");
}

  private BSDMInteractionSpec _AccountBonusPointTransactionTransferSpec = null;
  /**
   * Transfer AccountBonusPointTransaction's from one Account to another.  In MSA environment, method should be called with AccountServer set to the From Account's ServerId, so that the call will be routed to the From Server..
   * Convenience method using default BSDMSessionContext.
   * @param AccountBonusPointTransactionTo Input  Object.
   * @param AccountBonusPointTransactionFrom Input  Object.
   * @return AccountBonusPointTransactionTransferOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBonusPointTransactionTransferOutputData transfer (AccountBonusPointTransactionObjectData AccountBonusPointTransactionTo, AccountBonusPointTransactionObjectData AccountBonusPointTransactionFrom) throws BSDMResourceException
  {
    return transfer (null, AccountBonusPointTransactionTo, AccountBonusPointTransactionFrom);
  }
  /**
   * Transfer AccountBonusPointTransaction's from one Account to another.  In MSA environment, method should be called with AccountServer set to the From Account's ServerId, so that the call will be routed to the From Server..
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountBonusPointTransactionTo Input  Object.
   * @param AccountBonusPointTransactionFrom Input  Object.
   * @return AccountBonusPointTransactionTransferOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("transfer")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBonusPointTransactionTransferOutputData transfer (@HeaderParam ("context")BSDMSessionContext context,AccountBonusPointTransactionObjectData AccountBonusPointTransactionTo,@FormParam("AccountBonusPointTransactionObject")AccountBonusPointTransactionObjectData AccountBonusPointTransactionFrom) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionTransferSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AccountBonusPointTransactionTo != null) AccountBonusPointTransactionObjectHelper.toMap (AccountBonusPointTransactionTo, record, "AccountBonusPointTransactionTo");
      if (AccountBonusPointTransactionFrom != null) AccountBonusPointTransactionObjectHelper.toMap (AccountBonusPointTransactionFrom, record, "AccountBonusPointTransactionFrom");
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
return AccountBonusPointTransactionTransferOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _AccountBonusPointTransactionFindbyRewardbalanceSpec = null;
  /**
   *  Find record in CMF_BONUS_POINT depending on CMF_REWARD_BALANCE_DETAIL and REWARD_BALANCE_ENTITY_MAPPING. .
   * Convenience method using default BSDMSessionContext.
   * @param findByIn Input Filter Object.
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBonusPointTransactionObjectDataList findbyRewardbalance (AccountBonusPointTransactionObjectFilter findByIn) throws BSDMResourceException
  {
    return findbyRewardbalance (null, findByIn);
  }
  /**
   *  Find record in CMF_BONUS_POINT depending on CMF_REWARD_BALANCE_DETAIL and REWARD_BALANCE_ENTITY_MAPPING. .
   * @param context The session context to use when connecting to the APITS server.
   * @param findByIn Input Filter Object.
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findbyRewardbalance")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBonusPointTransactionObjectDataList findbyRewardbalance (@HeaderParam ("context")BSDMSessionContext context,AccountBonusPointTransactionObjectFilter findByIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionFindbyRewardbalanceSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (findByIn != null) AccountBonusPointTransactionObjectHelper.toMap (findByIn, record, "AccountBonusPointTransaction");
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
return AccountBonusPointTransactionObjectHelper.fromMapList (record, "AccountBonusPointTransactionList");
}

  private BSDMInteractionSpec _AccountBonusPointTransactionUpdateUnredeemedSpec = null;
  /**
   *  Update the Expiration_date in  CMF_BONUS_POINT table for a given account_no and bonus_point_id and for a given date range if and only if it is provided ..
   * Convenience method using default BSDMSessionContext.
   * @param ABPTO_In Input  Object.
   * @param ABPToDate_In (null is allowed).
   * @param ABPFromDate_In (null is allowed).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer updateUnredeemed (AccountBonusPointTransactionObjectData ABPTO_In, Date ABPToDate_In, Date ABPFromDate_In) throws BSDMResourceException
  {
    return updateUnredeemed (null, ABPTO_In, ABPToDate_In, ABPFromDate_In);
  }
  /**
   *  Update the Expiration_date in  CMF_BONUS_POINT table for a given account_no and bonus_point_id and for a given date range if and only if it is provided ..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABPTO_In Input  Object.
   * @param ABPToDate_In (null is allowed).
   * @param ABPFromDate_In (null is allowed).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("updateUnredeemed")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer updateUnredeemed (@HeaderParam ("context")BSDMSessionContext context,AccountBonusPointTransactionObjectData ABPTO_In,@FormParam("ABPToDate_In")Date ABPToDate_In,@FormParam("ABPFromDate_In")Date ABPFromDate_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionUpdateUnredeemedSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ABPTO_In != null) AccountBonusPointTransactionObjectHelper.toMap (ABPTO_In, record, "AccountBonusPointTransaction");

      if (ABPToDate_In != null) record.put ("ABPToDateIn", ABPToDate_In);

      if (ABPFromDate_In != null) record.put ("ABPFromDateIn", ABPFromDate_In);
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
Object _tmp = record.get ("ABPUpdateUnredeemedCountOut");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _AccountBonusPointTransactionUpdatePointsSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param CBPCreateIn2 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, ExpirationBillRefNo, ExpirationBillRefResets, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate, BillRefNo, BillRefResets, EntryDate.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBonusPointTransactionObjectData updatePoints (AccountBonusPointTransactionObjectData CBPCreateIn2) throws BSDMResourceException
  {
    return updatePoints (null, CBPCreateIn2);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPCreateIn2 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, ExpirationBillRefNo, ExpirationBillRefResets, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate, BillRefNo, BillRefResets, EntryDate.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("updatePoints")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBonusPointTransactionObjectData updatePoints (@HeaderParam ("context")BSDMSessionContext context,AccountBonusPointTransactionObjectData CBPCreateIn2) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionUpdatePointsSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CBPCreateIn2 != null) AccountBonusPointTransactionObjectHelper.toMap (CBPCreateIn2, record, "AccountBonusPointTransaction");
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
return AccountBonusPointTransactionObjectHelper.fromMap (record, "AccountBonusPointTransaction");
}

  private BSDMInteractionSpec _AccountBonusPointTransactionAddBalanceSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param ExtBalAddIn Input  Object.  Defaulted Fields: BonusPointTransType, DistributedAmount, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, TransStatus.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, TransDate, ChgWho, EntryDate.
   * @param AccountExternalId.
   * @param AccountExternalIdType.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBonusPointTransactionObjectData addBalance (AccountBonusPointTransactionObjectData ExtBalAddIn, String AccountExternalId, BigInteger AccountExternalIdType) throws BSDMResourceException
  {
    return addBalance (null, ExtBalAddIn, AccountExternalId, AccountExternalIdType);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param ExtBalAddIn Input  Object.  Defaulted Fields: BonusPointTransType, DistributedAmount, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, TransStatus.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, TransDate, ChgWho, EntryDate.
   * @param AccountExternalId.
   * @param AccountExternalIdType.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("addBalance")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBonusPointTransactionObjectData addBalance (@HeaderParam ("context")BSDMSessionContext context,AccountBonusPointTransactionObjectData ExtBalAddIn,@FormParam("AccountExternalId")String AccountExternalId,@FormParam("AccountExternalIdType")BigInteger AccountExternalIdType) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionAddBalanceSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ExtBalAddIn != null) AccountBonusPointTransactionObjectHelper.toMap (ExtBalAddIn, record, "AccountBonusPointTransaction");

      if (AccountExternalId != null) record.put ("AccountExternalId", AccountExternalId);

      if (AccountExternalIdType != null) record.put ("AccountExternalIdType", AccountExternalIdType);
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
return AccountBonusPointTransactionObjectHelper.fromMap (record, "AccountBonusPointTransaction");
}

  private BSDMInteractionSpec _AccountBonusPointTransactionRedeemPointsSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param RedeemPointIn Input  Object.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBonusPointTransactionObjectData redeemPoints (AccountBonusPointTransactionObjectData RedeemPointIn) throws BSDMResourceException
  {
    return redeemPoints (null, RedeemPointIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param RedeemPointIn Input  Object.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("redeemPoints")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBonusPointTransactionObjectData redeemPoints (@HeaderParam ("context")BSDMSessionContext context,AccountBonusPointTransactionObjectData RedeemPointIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBonusPointTransactionRedeemPointsSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RedeemPointIn != null) AccountBonusPointTransactionObjectHelper.toMap (RedeemPointIn, record, "AccountBonusPointTransaction");
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
return AccountBonusPointTransactionObjectHelper.fromMap (record, "AccountBonusPointTransaction");
}

  /**

   * Convenience method using default BSDMSessionContext.

   * @param getIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBonusPointTransactionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBonusPointTransactionObjectData get (AccountBonusPointTransactionObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, getIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBonusPointTransactionObjectData get (BSDMSessionContext context, AccountBonusPointTransactionObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
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

   * @return AccountBonusPointTransactionObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBonusPointTransactionObjectDataList find (AccountBonusPointTransactionObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, findIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBonusPointTransactionObjectDataList find (BSDMSessionContext context, AccountBonusPointTransactionObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(findIn, defaultAction);
       
     cManager.checkConstraints(findIn, constraintAction);
       return find (context, findIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param CBPCreateIn1 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, EntryDate, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBonusPointTransactionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBonusPointTransactionObjectData create (AccountBonusPointTransactionObjectData CBPCreateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CBPCreateIn1, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPCreateIn1 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, EntryDate, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBonusPointTransactionObjectData create (BSDMSessionContext context, AccountBonusPointTransactionObjectData CBPCreateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CBPCreateIn1, defaultAction);
       
     cManager.checkConstraints(CBPCreateIn1, constraintAction);
       return create (context, CBPCreateIn1);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param CBPUpdateIn1 Input  Object.  Read-Only fields: TransStatus, BonusPointTransType, BillRefNo, BillRefResets, DistributedAmount, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBonusPointTransactionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBonusPointTransactionObjectData update (AccountBonusPointTransactionObjectData CBPUpdateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CBPUpdateIn1, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPUpdateIn1 Input  Object.  Read-Only fields: TransStatus, BonusPointTransType, BillRefNo, BillRefResets, DistributedAmount, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBonusPointTransactionObjectData update (BSDMSessionContext context, AccountBonusPointTransactionObjectData CBPUpdateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CBPUpdateIn1, defaultAction);
       
     cManager.checkConstraints(CBPUpdateIn1, constraintAction);
       return update (context, CBPUpdateIn1);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param CBPDelIn1 Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBonusPointTransactionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBonusPointTransactionObjectData delete (AccountBonusPointTransactionObjectKeyData CBPDelIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, CBPDelIn1, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPDelIn1 Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBonusPointTransactionObjectData delete (BSDMSessionContext context, AccountBonusPointTransactionObjectKeyData CBPDelIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CBPDelIn1, defaultAction);
       
     cManager.checkConstraints(CBPDelIn1, constraintAction);
       return delete (context, CBPDelIn1);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param account_internal_id.

   * @param current_date (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BigInteger as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BigInteger balance (Integer account_internal_id, Date current_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return balance (null, account_internal_id, current_date, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internal_id.
   * @param current_date (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BigInteger balance (BSDMSessionContext context, Integer account_internal_id, Date current_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return balance (context, account_internal_id, current_date);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param AccountInternalId.

   * @param from_date (has a default).

   * @param to_date (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BigInteger as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BigInteger expiringBalance (Integer AccountInternalId, Date from_date, Date to_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return expiringBalance (null, AccountInternalId, from_date, to_date, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountInternalId.
   * @param from_date (has a default).
   * @param to_date (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BigInteger expiringBalance (BSDMSessionContext context, Integer AccountInternalId, Date from_date, Date to_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return expiringBalance (context, AccountInternalId, from_date, to_date);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param actIn1 Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBonusPointTransactionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBonusPointTransactionObjectData activate (AccountBonusPointTransactionObjectKeyData actIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return activate (null, actIn1, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param actIn1 Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBonusPointTransactionObjectData activate (BSDMSessionContext context, AccountBonusPointTransactionObjectKeyData actIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(actIn1, defaultAction);
       
     cManager.checkConstraints(actIn1, constraintAction);
       return activate (context, actIn1);
  }

  /**

   * Transfer AccountBonusPointTransaction's from one Account to another.  In MSA environment, method should be called with AccountServer set to the From Account's ServerId, so that the call will be routed to the From Server..

   * Convenience method using default BSDMSessionContext.

   * @param AccountBonusPointTransactionTo Input  Object.

   * @param AccountBonusPointTransactionFrom Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBonusPointTransactionTransferOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBonusPointTransactionTransferOutputData transfer (AccountBonusPointTransactionObjectData AccountBonusPointTransactionTo, AccountBonusPointTransactionObjectData AccountBonusPointTransactionFrom, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return transfer (null, AccountBonusPointTransactionTo, AccountBonusPointTransactionFrom, defaultAction, constraintAction);
  }
  /** 
   * Transfer AccountBonusPointTransaction's from one Account to another.  In MSA environment, method should be called with AccountServer set to the From Account's ServerId, so that the call will be routed to the From Server..
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountBonusPointTransactionTo Input  Object.
   * @param AccountBonusPointTransactionFrom Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBonusPointTransactionTransferOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBonusPointTransactionTransferOutputData transfer (BSDMSessionContext context, AccountBonusPointTransactionObjectData AccountBonusPointTransactionTo, AccountBonusPointTransactionObjectData AccountBonusPointTransactionFrom, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AccountBonusPointTransactionTo, defaultAction);
       
     dManager.setObjectDefaults(AccountBonusPointTransactionFrom, defaultAction);
       
     cManager.checkConstraints(AccountBonusPointTransactionTo, constraintAction);
       
     cManager.checkConstraints(AccountBonusPointTransactionFrom, constraintAction);
       return transfer (context, AccountBonusPointTransactionTo, AccountBonusPointTransactionFrom);
  }

  /**

   *  Find record in CMF_BONUS_POINT depending on CMF_REWARD_BALANCE_DETAIL and REWARD_BALANCE_ENTITY_MAPPING. .

   * Convenience method using default BSDMSessionContext.

   * @param findByIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBonusPointTransactionObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBonusPointTransactionObjectDataList findbyRewardbalance (AccountBonusPointTransactionObjectFilter findByIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findbyRewardbalance (null, findByIn, defaultAction, constraintAction);
  }
  /** 
   *  Find record in CMF_BONUS_POINT depending on CMF_REWARD_BALANCE_DETAIL and REWARD_BALANCE_ENTITY_MAPPING. .
   * @param context The session context to use when connecting to the APITS server.
   * @param findByIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBonusPointTransactionObjectDataList findbyRewardbalance (BSDMSessionContext context, AccountBonusPointTransactionObjectFilter findByIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(findByIn, defaultAction);
       
     cManager.checkConstraints(findByIn, constraintAction);
       return findbyRewardbalance (context, findByIn);
  }

  /**

   *  Update the Expiration_date in  CMF_BONUS_POINT table for a given account_no and bonus_point_id and for a given date range if and only if it is provided ..

   * Convenience method using default BSDMSessionContext.

   * @param ABPTO_In Input  Object.

   * @param ABPToDate_In (null is allowed).

   * @param ABPFromDate_In (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer updateUnredeemed (AccountBonusPointTransactionObjectData ABPTO_In, Date ABPToDate_In, Date ABPFromDate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return updateUnredeemed (null, ABPTO_In, ABPToDate_In, ABPFromDate_In, defaultAction, constraintAction);
  }
  /** 
   *  Update the Expiration_date in  CMF_BONUS_POINT table for a given account_no and bonus_point_id and for a given date range if and only if it is provided ..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABPTO_In Input  Object.
   * @param ABPToDate_In (null is allowed).
   * @param ABPFromDate_In (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer updateUnredeemed (BSDMSessionContext context, AccountBonusPointTransactionObjectData ABPTO_In, Date ABPToDate_In, Date ABPFromDate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ABPTO_In, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(ABPTO_In, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return updateUnredeemed (context, ABPTO_In, ABPToDate_In, ABPFromDate_In);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param CBPCreateIn2 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, ExpirationBillRefNo, ExpirationBillRefResets, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate, BillRefNo, BillRefResets, EntryDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBonusPointTransactionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBonusPointTransactionObjectData updatePoints (AccountBonusPointTransactionObjectData CBPCreateIn2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return updatePoints (null, CBPCreateIn2, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPCreateIn2 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, ExpirationBillRefNo, ExpirationBillRefResets, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate, BillRefNo, BillRefResets, EntryDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBonusPointTransactionObjectData updatePoints (BSDMSessionContext context, AccountBonusPointTransactionObjectData CBPCreateIn2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CBPCreateIn2, defaultAction);
       
     cManager.checkConstraints(CBPCreateIn2, constraintAction);
       return updatePoints (context, CBPCreateIn2);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param ExtBalAddIn Input  Object.  Defaulted Fields: BonusPointTransType, DistributedAmount, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, TransStatus.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, TransDate, ChgWho, EntryDate.

   * @param AccountExternalId.

   * @param AccountExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBonusPointTransactionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBonusPointTransactionObjectData addBalance (AccountBonusPointTransactionObjectData ExtBalAddIn, String AccountExternalId, BigInteger AccountExternalIdType, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return addBalance (null, ExtBalAddIn, AccountExternalId, AccountExternalIdType, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param ExtBalAddIn Input  Object.  Defaulted Fields: BonusPointTransType, DistributedAmount, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, TransStatus.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, TransDate, ChgWho, EntryDate.
   * @param AccountExternalId.
   * @param AccountExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBonusPointTransactionObjectData addBalance (BSDMSessionContext context, AccountBonusPointTransactionObjectData ExtBalAddIn, String AccountExternalId, BigInteger AccountExternalIdType, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ExtBalAddIn, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(ExtBalAddIn, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return addBalance (context, ExtBalAddIn, AccountExternalId, AccountExternalIdType);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param RedeemPointIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBonusPointTransactionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBonusPointTransactionObjectData redeemPoints (AccountBonusPointTransactionObjectData RedeemPointIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return redeemPoints (null, RedeemPointIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param RedeemPointIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBonusPointTransactionObjectData redeemPoints (BSDMSessionContext context, AccountBonusPointTransactionObjectData RedeemPointIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RedeemPointIn, defaultAction);
       
     cManager.checkConstraints(RedeemPointIn, constraintAction);
       return redeemPoints (context, RedeemPointIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AccountBonusPointTransactionBean ()
  {
    try
    {
      _AccountBonusPointTransactionGetSpec = new BSDMInteractionSpec("AccountBonusPointTransactionGet", ApiMappings.getCallName ("AccountBonusPointTransactionGet"), Boolean.TRUE);

      _AccountBonusPointTransactionFindSpec = new BSDMInteractionSpec("AccountBonusPointTransactionFind", ApiMappings.getCallName ("AccountBonusPointTransactionFind"), Boolean.TRUE);

      _AccountBonusPointTransactionCreateSpec = new BSDMInteractionSpec("AccountBonusPointTransactionCreate", ApiMappings.getCallName ("AccountBonusPointTransactionCreate"), Boolean.TRUE);

      _AccountBonusPointTransactionUpdateSpec = new BSDMInteractionSpec("AccountBonusPointTransactionUpdate", ApiMappings.getCallName ("AccountBonusPointTransactionUpdate"), Boolean.TRUE);

      _AccountBonusPointTransactionDeleteSpec = new BSDMInteractionSpec("AccountBonusPointTransactionDelete", ApiMappings.getCallName ("AccountBonusPointTransactionDelete"), Boolean.TRUE);

      _AccountBonusPointTransactionBalanceSpec = new BSDMInteractionSpec("AccountBonusPointTransactionBalance", ApiMappings.getCallName ("AccountBonusPointTransactionBalance"), Boolean.TRUE);

      _AccountBonusPointTransactionExpiringBalanceSpec = new BSDMInteractionSpec("AccountBonusPointTransactionExpiringBalance", ApiMappings.getCallName ("AccountBonusPointTransactionExpiringBalance"), Boolean.TRUE);

      _AccountBonusPointTransactionActivateSpec = new BSDMInteractionSpec("AccountBonusPointTransactionActivate", ApiMappings.getCallName ("AccountBonusPointTransactionActivate"), Boolean.TRUE);

      _AccountBonusPointTransactionTransferSpec = new BSDMInteractionSpec("AccountBonusPointTransactionTransfer", ApiMappings.getCallName ("AccountBonusPointTransactionTransfer"), Boolean.TRUE);

      _AccountBonusPointTransactionFindbyRewardbalanceSpec = new BSDMInteractionSpec("AccountBonusPointTransactionFindbyRewardbalance", ApiMappings.getCallName ("AccountBonusPointTransactionFindbyRewardbalance"), Boolean.TRUE);

      _AccountBonusPointTransactionUpdateUnredeemedSpec = new BSDMInteractionSpec("AccountBonusPointTransactionUpdateUnredeemed", ApiMappings.getCallName ("AccountBonusPointTransactionUpdateUnredeemed"), Boolean.TRUE);

      _AccountBonusPointTransactionUpdatePointsSpec = new BSDMInteractionSpec("AccountBonusPointTransactionUpdatePoints", ApiMappings.getCallName ("AccountBonusPointTransactionUpdatePoints"), Boolean.TRUE);

      _AccountBonusPointTransactionAddBalanceSpec = new BSDMInteractionSpec("AccountBonusPointTransactionAddBalance", ApiMappings.getCallName ("AccountBonusPointTransactionAddBalance"), Boolean.TRUE);

      _AccountBonusPointTransactionRedeemPointsSpec = new BSDMInteractionSpec("AccountBonusPointTransactionRedeemPoints", ApiMappings.getCallName ("AccountBonusPointTransactionRedeemPoints"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AccountBonusPointTransactionBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AccountBonusPointTransactionBean(BSDMSettings settings, BSDMConnectionManager cm)
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
