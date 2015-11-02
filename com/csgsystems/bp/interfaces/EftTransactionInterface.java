
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
public interface EftTransactionInterface extends BaliInterface {

  /**
   * Get the EftTransaction row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param eftGetIn Input Object Key.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftTransactionObjectData get (EftTransactionObjectKeyData eftGetIn) throws BSDMResourceException;
  /**
   * Get the EftTransaction row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftGetIn Input Object Key.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftTransactionObjectData get (BSDMSessionContext context, EftTransactionObjectKeyData eftGetIn) throws BSDMResourceException;


  /**
   * Get the EftTransaction row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param eftGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EftTransactionObjectData get (EftTransactionObjectKeyData eftGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get the EftTransaction row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EftTransactionObjectData get (BSDMSessionContext context, EftTransactionObjectKeyData eftGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find EftTransactions that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param eftFindIn Input Filter Object.
   * @return EftTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftTransactionObjectDataList find (EftTransactionObjectFilter eftFindIn) throws BSDMResourceException;
  /**
   * Find EftTransactions that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftFindIn Input Filter Object.
   * @return EftTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftTransactionObjectDataList find (BSDMSessionContext context, EftTransactionObjectFilter eftFindIn) throws BSDMResourceException;


  /**
   * Find EftTransactions that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param eftFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EftTransactionObjectDataList find (EftTransactionObjectFilter eftFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find EftTransactions that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftTransactionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EftTransactionObjectDataList find (BSDMSessionContext context, EftTransactionObjectFilter eftFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields for an EftTransaction row.  You can only update the bank information for an EftTransaction.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row..
   * Convenience method using default BSDMSessionContext.
   * @param eftUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, ClearingHouseId, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftTransactionObjectData update (EftTransactionObjectData eftUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields for an EftTransaction row.  You can only update the bank information for an EftTransaction.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, ClearingHouseId, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftTransactionObjectData update (BSDMSessionContext context, EftTransactionObjectData eftUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields for an EftTransaction row.  You can only update the bank information for an EftTransaction.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row..
   * Convenience method using default BSDMSessionContext.
   * @param eftUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, ClearingHouseId, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EftTransactionObjectData update (EftTransactionObjectData eftUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields for an EftTransaction row.  You can only update the bank information for an EftTransaction.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, ClearingHouseId, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EftTransactionObjectData update (BSDMSessionContext context, EftTransactionObjectData eftUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Change a WAITING EftTransaction's status to HOLD..
   * Convenience method using default BSDMSessionContext.
   * @param eftHoldIn Input Object Key.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftTransactionObjectData hold (EftTransactionObjectKeyData eftHoldIn) throws BSDMResourceException;
  /**
   * Change a WAITING EftTransaction's status to HOLD..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftHoldIn Input Object Key.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftTransactionObjectData hold (BSDMSessionContext context, EftTransactionObjectKeyData eftHoldIn) throws BSDMResourceException;


  /**
   * Change a WAITING EftTransaction's status to HOLD..
   * Convenience method using default BSDMSessionContext.
   * @param eftHoldIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EftTransactionObjectData hold (EftTransactionObjectKeyData eftHoldIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Change a WAITING EftTransaction's status to HOLD..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftHoldIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EftTransactionObjectData hold (BSDMSessionContext context, EftTransactionObjectKeyData eftHoldIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Release a Held EftTransaction..
   * Convenience method using default BSDMSessionContext.
   * @param eftRelIn Input Object Key.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftTransactionObjectData release (EftTransactionObjectKeyData eftRelIn) throws BSDMResourceException;
  /**
   * Release a Held EftTransaction..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftRelIn Input Object Key.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftTransactionObjectData release (BSDMSessionContext context, EftTransactionObjectKeyData eftRelIn) throws BSDMResourceException;


  /**
   * Release a Held EftTransaction..
   * Convenience method using default BSDMSessionContext.
   * @param eftRelIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EftTransactionObjectData release (EftTransactionObjectKeyData eftRelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Release a Held EftTransaction..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftRelIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EftTransactionObjectData release (BSDMSessionContext context, EftTransactionObjectKeyData eftRelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the Payment-Profile id to the value provided in input request, if it is a non-real time Direct-Debit profile, in the PAYMENT_TRANS table.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row in PAYMENT_TRANS, but no row is inserted in PAYMENT_PROFILE table..
   * Convenience method using default BSDMSessionContext.
   * @param eftUpdateFAIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftTransactionObjectData updateFromAccount (EftTransUFAObjectData eftUpdateFAIn) throws BSDMResourceException;
  /**
   * Update the Payment-Profile id to the value provided in input request, if it is a non-real time Direct-Debit profile, in the PAYMENT_TRANS table.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row in PAYMENT_TRANS, but no row is inserted in PAYMENT_PROFILE table..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftUpdateFAIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftTransactionObjectData updateFromAccount (BSDMSessionContext context, EftTransUFAObjectData eftUpdateFAIn) throws BSDMResourceException;


  /**
   * Update the Payment-Profile id to the value provided in input request, if it is a non-real time Direct-Debit profile, in the PAYMENT_TRANS table.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row in PAYMENT_TRANS, but no row is inserted in PAYMENT_PROFILE table..
   * Convenience method using default BSDMSessionContext.
   * @param eftUpdateFAIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EftTransactionObjectData updateFromAccount (EftTransUFAObjectData eftUpdateFAIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the Payment-Profile id to the value provided in input request, if it is a non-real time Direct-Debit profile, in the PAYMENT_TRANS table.  You can only update an EftTransaction row that has a status of 0, 1, or 4 (WAITING, HOLD, or REJECTED).  The result of the Update is actually a new row in PAYMENT_TRANS, but no row is inserted in PAYMENT_PROFILE table..
   * @param context The session context to use when connecting to the APITS server.
   * @param eftUpdateFAIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, EftTransType, BmfTransType, ChgDate, FileId, ResponseCode, BmfTrackingId, BmfTrackingIdServ, OrigTrackingId, OrigTrackingIdServ, EftTransStatus, PmtReqSentCounter, NoBill.  Derived Fields: ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftTransactionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EftTransactionObjectData updateFromAccount (BSDMSessionContext context, EftTransUFAObjectData eftUpdateFAIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
