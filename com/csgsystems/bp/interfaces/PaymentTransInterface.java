
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
public interface PaymentTransInterface extends BaliInterface {

  /**
   * Get the Payment Transaction row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param PayTransGetIn Input Object Key.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData get (PaymentTransObjectKeyData PayTransGetIn) throws BSDMResourceException;
  /**
   * Get the Payment Transaction row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param PayTransGetIn Input Object Key.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData get (BSDMSessionContext context, PaymentTransObjectKeyData PayTransGetIn) throws BSDMResourceException;


  /**
   * Get the Payment Transaction row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param PayTransGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentTransObjectData get (PaymentTransObjectKeyData PayTransGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get the Payment Transaction row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param PayTransGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentTransObjectData get (BSDMSessionContext context, PaymentTransObjectKeyData PayTransGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find PaymentTransactions that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PayTransFindIn Input Filter Object.
   * @return PaymentTransObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectDataList find (PaymentTransObjectFilter PayTransFindIn) throws BSDMResourceException;
  /**
   * Find PaymentTransactions that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PayTransFindIn Input Filter Object.
   * @return PaymentTransObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectDataList find (BSDMSessionContext context, PaymentTransObjectFilter PayTransFindIn) throws BSDMResourceException;


  /**
   * Find PaymentTransactions that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PayTransFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentTransObjectDataList find (PaymentTransObjectFilter PayTransFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find PaymentTransactions that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PayTransFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentTransObjectDataList find (BSDMSessionContext context, PaymentTransObjectFilter PayTransFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update a real-time Payment Transaction.
   * Convenience method using default BSDMSessionContext.
   * @param PayTransUpdateIn Input  Object.  Read-Only fields: ChgDate, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, TransType, BmfTransType, FileId, ClearingHouseId, ProviderId, ProfileId, CcauthCode, CcauthDate, PmtReqSentCounter, OpenItemId, OrigTrackingId, OrigTrackingIdServ, NoBill, RequestType, RequestedService, PayMethod, IsRealtime, TransDate, Annotation, OneoffCardnum.  Derived Fields: ChgDate.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData update (PaymentTransObjectData PayTransUpdateIn) throws BSDMResourceException;
  /**
   * Update a real-time Payment Transaction.
   * @param context The session context to use when connecting to the APITS server.
   * @param PayTransUpdateIn Input  Object.  Read-Only fields: ChgDate, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, TransType, BmfTransType, FileId, ClearingHouseId, ProviderId, ProfileId, CcauthCode, CcauthDate, PmtReqSentCounter, OpenItemId, OrigTrackingId, OrigTrackingIdServ, NoBill, RequestType, RequestedService, PayMethod, IsRealtime, TransDate, Annotation, OneoffCardnum.  Derived Fields: ChgDate.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData update (BSDMSessionContext context, PaymentTransObjectData PayTransUpdateIn) throws BSDMResourceException;


  /**
   * Update a real-time Payment Transaction.
   * Convenience method using default BSDMSessionContext.
   * @param PayTransUpdateIn Input  Object.  Read-Only fields: ChgDate, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, TransType, BmfTransType, FileId, ClearingHouseId, ProviderId, ProfileId, CcauthCode, CcauthDate, PmtReqSentCounter, OpenItemId, OrigTrackingId, OrigTrackingIdServ, NoBill, RequestType, RequestedService, PayMethod, IsRealtime, TransDate, Annotation, OneoffCardnum.  Derived Fields: ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentTransObjectData update (PaymentTransObjectData PayTransUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update a real-time Payment Transaction.
   * @param context The session context to use when connecting to the APITS server.
   * @param PayTransUpdateIn Input  Object.  Read-Only fields: ChgDate, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, TransType, BmfTransType, FileId, ClearingHouseId, ProviderId, ProfileId, CcauthCode, CcauthDate, PmtReqSentCounter, OpenItemId, OrigTrackingId, OrigTrackingIdServ, NoBill, RequestType, RequestedService, PayMethod, IsRealtime, TransDate, Annotation, OneoffCardnum.  Derived Fields: ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentTransObjectData update (BSDMSessionContext context, PaymentTransObjectData PayTransUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
