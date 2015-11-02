
package com.csgsystems.bp.interfaces;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.Remote;

import com.csgsystems.bali.BaliInterface;

import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.constraint.ConstraintException;


import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface AccountBonusPointTransactionInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData get (AccountBonusPointTransactionObjectKeyData getIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData get (BSDMSessionContext context, AccountBonusPointTransactionObjectKeyData getIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBonusPointTransactionObjectData get (AccountBonusPointTransactionObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBonusPointTransactionObjectData get (BSDMSessionContext context, AccountBonusPointTransactionObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectDataList find (AccountBonusPointTransactionObjectFilter findIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectDataList find (BSDMSessionContext context, AccountBonusPointTransactionObjectFilter findIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBonusPointTransactionObjectDataList find (AccountBonusPointTransactionObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBonusPointTransactionObjectDataList find (BSDMSessionContext context, AccountBonusPointTransactionObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param CBPCreateIn1 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, EntryDate, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData create (AccountBonusPointTransactionObjectData CBPCreateIn1) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPCreateIn1 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, EntryDate, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData create (BSDMSessionContext context, AccountBonusPointTransactionObjectData CBPCreateIn1) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param CBPCreateIn1 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, EntryDate, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBonusPointTransactionObjectData create (AccountBonusPointTransactionObjectData CBPCreateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPCreateIn1 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, EntryDate, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBonusPointTransactionObjectData create (BSDMSessionContext context, AccountBonusPointTransactionObjectData CBPCreateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param CBPUpdateIn1 Input  Object.  Read-Only fields: TransStatus, BonusPointTransType, BillRefNo, BillRefResets, DistributedAmount, ChgWho.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData update (AccountBonusPointTransactionObjectData CBPUpdateIn1) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPUpdateIn1 Input  Object.  Read-Only fields: TransStatus, BonusPointTransType, BillRefNo, BillRefResets, DistributedAmount, ChgWho.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData update (BSDMSessionContext context, AccountBonusPointTransactionObjectData CBPUpdateIn1) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param CBPUpdateIn1 Input  Object.  Read-Only fields: TransStatus, BonusPointTransType, BillRefNo, BillRefResets, DistributedAmount, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBonusPointTransactionObjectData update (AccountBonusPointTransactionObjectData CBPUpdateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPUpdateIn1 Input  Object.  Read-Only fields: TransStatus, BonusPointTransType, BillRefNo, BillRefResets, DistributedAmount, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBonusPointTransactionObjectData update (BSDMSessionContext context, AccountBonusPointTransactionObjectData CBPUpdateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param CBPDelIn1 Input Object Key.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData delete (AccountBonusPointTransactionObjectKeyData CBPDelIn1) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPDelIn1 Input Object Key.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData delete (BSDMSessionContext context, AccountBonusPointTransactionObjectKeyData CBPDelIn1) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param CBPDelIn1 Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBonusPointTransactionObjectData delete (AccountBonusPointTransactionObjectKeyData CBPDelIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPDelIn1 Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBonusPointTransactionObjectData delete (BSDMSessionContext context, AccountBonusPointTransactionObjectKeyData CBPDelIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param account_internal_id.
   * @param current_date (has a default).
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger balance (Integer account_internal_id, Date current_date) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internal_id.
   * @param current_date (has a default).
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger balance (BSDMSessionContext context, Integer account_internal_id, Date current_date) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param account_internal_id.
   * @param current_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BigInteger balance (Integer account_internal_id, Date current_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internal_id.
   * @param current_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BigInteger balance (BSDMSessionContext context, Integer account_internal_id, Date current_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AccountInternalId.
   * @param from_date (has a default).
   * @param to_date (has a default).
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger expiringBalance (Integer AccountInternalId, Date from_date, Date to_date) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountInternalId.
   * @param from_date (has a default).
   * @param to_date (has a default).
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger expiringBalance (BSDMSessionContext context, Integer AccountInternalId, Date from_date, Date to_date) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AccountInternalId.
   * @param from_date (has a default).
   * @param to_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BigInteger expiringBalance (Integer AccountInternalId, Date from_date, Date to_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountInternalId.
   * @param from_date (has a default).
   * @param to_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BigInteger expiringBalance (BSDMSessionContext context, Integer AccountInternalId, Date from_date, Date to_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param actIn1 Input Object Key.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData activate (AccountBonusPointTransactionObjectKeyData actIn1) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param actIn1 Input Object Key.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData activate (BSDMSessionContext context, AccountBonusPointTransactionObjectKeyData actIn1) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param actIn1 Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBonusPointTransactionObjectData activate (AccountBonusPointTransactionObjectKeyData actIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param actIn1 Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBonusPointTransactionObjectData activate (BSDMSessionContext context, AccountBonusPointTransactionObjectKeyData actIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Transfer AccountBonusPointTransaction's from one Account to another.  In MSA environment, method should be called with AccountServer set to the From Account's ServerId, so that the call will be routed to the From Server..
   * Convenience method using default BSDMSessionContext.
   * @param AccountBonusPointTransactionTo Input  Object.
   * @param AccountBonusPointTransactionFrom Input  Object.
   * @return AccountBonusPointTransactionTransferOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionTransferOutputData transfer (AccountBonusPointTransactionObjectData AccountBonusPointTransactionTo, AccountBonusPointTransactionObjectData AccountBonusPointTransactionFrom) throws BSDMResourceException;
  /**
   * Transfer AccountBonusPointTransaction's from one Account to another.  In MSA environment, method should be called with AccountServer set to the From Account's ServerId, so that the call will be routed to the From Server..
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountBonusPointTransactionTo Input  Object.
   * @param AccountBonusPointTransactionFrom Input  Object.
   * @return AccountBonusPointTransactionTransferOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionTransferOutputData transfer (BSDMSessionContext context, AccountBonusPointTransactionObjectData AccountBonusPointTransactionTo, AccountBonusPointTransactionObjectData AccountBonusPointTransactionFrom) throws BSDMResourceException;


  /**
   * Transfer AccountBonusPointTransaction's from one Account to another.  In MSA environment, method should be called with AccountServer set to the From Account's ServerId, so that the call will be routed to the From Server..
   * Convenience method using default BSDMSessionContext.
   * @param AccountBonusPointTransactionTo Input  Object.
   * @param AccountBonusPointTransactionFrom Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionTransferOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBonusPointTransactionTransferOutputData transfer (AccountBonusPointTransactionObjectData AccountBonusPointTransactionTo, AccountBonusPointTransactionObjectData AccountBonusPointTransactionFrom, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Transfer AccountBonusPointTransaction's from one Account to another.  In MSA environment, method should be called with AccountServer set to the From Account's ServerId, so that the call will be routed to the From Server..
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountBonusPointTransactionTo Input  Object.
   * @param AccountBonusPointTransactionFrom Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionTransferOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBonusPointTransactionTransferOutputData transfer (BSDMSessionContext context, AccountBonusPointTransactionObjectData AccountBonusPointTransactionTo, AccountBonusPointTransactionObjectData AccountBonusPointTransactionFrom, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   *  Find record in CMF_BONUS_POINT depending on CMF_REWARD_BALANCE_DETAIL and REWARD_BALANCE_ENTITY_MAPPING. .
   * Convenience method using default BSDMSessionContext.
   * @param findByIn Input Filter Object.
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectDataList findbyRewardbalance (AccountBonusPointTransactionObjectFilter findByIn) throws BSDMResourceException;
  /**
   *  Find record in CMF_BONUS_POINT depending on CMF_REWARD_BALANCE_DETAIL and REWARD_BALANCE_ENTITY_MAPPING. .
   * @param context The session context to use when connecting to the APITS server.
   * @param findByIn Input Filter Object.
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectDataList findbyRewardbalance (BSDMSessionContext context, AccountBonusPointTransactionObjectFilter findByIn) throws BSDMResourceException;


  /**
   *  Find record in CMF_BONUS_POINT depending on CMF_REWARD_BALANCE_DETAIL and REWARD_BALANCE_ENTITY_MAPPING. .
   * Convenience method using default BSDMSessionContext.
   * @param findByIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBonusPointTransactionObjectDataList findbyRewardbalance (AccountBonusPointTransactionObjectFilter findByIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   *  Find record in CMF_BONUS_POINT depending on CMF_REWARD_BALANCE_DETAIL and REWARD_BALANCE_ENTITY_MAPPING. .
   * @param context The session context to use when connecting to the APITS server.
   * @param findByIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBonusPointTransactionObjectDataList findbyRewardbalance (BSDMSessionContext context, AccountBonusPointTransactionObjectFilter findByIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   *  Update the Expiration_date in  CMF_BONUS_POINT table for a given account_no and bonus_point_id and for a given date range if and only if it is provided ..
   * Convenience method using default BSDMSessionContext.
   * @param ABPTO_In Input  Object.
   * @param ABPToDate_In (null is allowed).
   * @param ABPFromDate_In (null is allowed).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer updateUnredeemed (AccountBonusPointTransactionObjectData ABPTO_In, Date ABPToDate_In, Date ABPFromDate_In) throws BSDMResourceException;
  /**
   *  Update the Expiration_date in  CMF_BONUS_POINT table for a given account_no and bonus_point_id and for a given date range if and only if it is provided ..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABPTO_In Input  Object.
   * @param ABPToDate_In (null is allowed).
   * @param ABPFromDate_In (null is allowed).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer updateUnredeemed (BSDMSessionContext context, AccountBonusPointTransactionObjectData ABPTO_In, Date ABPToDate_In, Date ABPFromDate_In) throws BSDMResourceException;


  /**
   *  Update the Expiration_date in  CMF_BONUS_POINT table for a given account_no and bonus_point_id and for a given date range if and only if it is provided ..
   * Convenience method using default BSDMSessionContext.
   * @param ABPTO_In Input  Object.
   * @param ABPToDate_In (null is allowed).
   * @param ABPFromDate_In (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer updateUnredeemed (AccountBonusPointTransactionObjectData ABPTO_In, Date ABPToDate_In, Date ABPFromDate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   *  Update the Expiration_date in  CMF_BONUS_POINT table for a given account_no and bonus_point_id and for a given date range if and only if it is provided ..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABPTO_In Input  Object.
   * @param ABPToDate_In (null is allowed).
   * @param ABPFromDate_In (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer updateUnredeemed (BSDMSessionContext context, AccountBonusPointTransactionObjectData ABPTO_In, Date ABPToDate_In, Date ABPFromDate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param CBPCreateIn2 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, ExpirationBillRefNo, ExpirationBillRefResets, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate, BillRefNo, BillRefResets, EntryDate.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData updatePoints (AccountBonusPointTransactionObjectData CBPCreateIn2) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPCreateIn2 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, ExpirationBillRefNo, ExpirationBillRefResets, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate, BillRefNo, BillRefResets, EntryDate.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData updatePoints (BSDMSessionContext context, AccountBonusPointTransactionObjectData CBPCreateIn2) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param CBPCreateIn2 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, ExpirationBillRefNo, ExpirationBillRefResets, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate, BillRefNo, BillRefResets, EntryDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBonusPointTransactionObjectData updatePoints (AccountBonusPointTransactionObjectData CBPCreateIn2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CBPCreateIn2 Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho, ExpirationBillRefNo, ExpirationBillRefResets, PointTransTrackingId, PointTransTrackingIdServ.  Defaulted Fields: Amount, DistributedAmount, TransDate, BillRefNo, BillRefResets, EntryDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBonusPointTransactionObjectData updatePoints (BSDMSessionContext context, AccountBonusPointTransactionObjectData CBPCreateIn2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param ExtBalAddIn Input  Object.  Defaulted Fields: BonusPointTransType, DistributedAmount, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, TransStatus.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, TransDate, ChgWho, EntryDate.
   * @param AccountExternalId.
   * @param AccountExternalIdType.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData addBalance (AccountBonusPointTransactionObjectData ExtBalAddIn, String AccountExternalId, BigInteger AccountExternalIdType) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param ExtBalAddIn Input  Object.  Defaulted Fields: BonusPointTransType, DistributedAmount, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, TransStatus.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, TransDate, ChgWho, EntryDate.
   * @param AccountExternalId.
   * @param AccountExternalIdType.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData addBalance (BSDMSessionContext context, AccountBonusPointTransactionObjectData ExtBalAddIn, String AccountExternalId, BigInteger AccountExternalIdType) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param ExtBalAddIn Input  Object.  Defaulted Fields: BonusPointTransType, DistributedAmount, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, TransStatus.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, TransDate, ChgWho, EntryDate.
   * @param AccountExternalId.
   * @param AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBonusPointTransactionObjectData addBalance (AccountBonusPointTransactionObjectData ExtBalAddIn, String AccountExternalId, BigInteger AccountExternalIdType, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param ExtBalAddIn Input  Object.  Defaulted Fields: BonusPointTransType, DistributedAmount, BillRefNo, BillRefResets, ExpirationBillRefNo, ExpirationBillRefResets, TransStatus.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, TransDate, ChgWho, EntryDate.
   * @param AccountExternalId.
   * @param AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBonusPointTransactionObjectData addBalance (BSDMSessionContext context, AccountBonusPointTransactionObjectData ExtBalAddIn, String AccountExternalId, BigInteger AccountExternalIdType, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param RedeemPointIn Input  Object.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData redeemPoints (AccountBonusPointTransactionObjectData RedeemPointIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param RedeemPointIn Input  Object.
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointTransactionObjectData redeemPoints (BSDMSessionContext context, AccountBonusPointTransactionObjectData RedeemPointIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param RedeemPointIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBonusPointTransactionObjectData redeemPoints (AccountBonusPointTransactionObjectData RedeemPointIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param RedeemPointIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBonusPointTransactionObjectData redeemPoints (BSDMSessionContext context, AccountBonusPointTransactionObjectData RedeemPointIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
