
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
public interface UnappliedPaymentInterface extends BaliInterface {

  /**
   * Retrieve a UnappliedPayment based upon its key..
   * Convenience method using default BSDMSessionContext.
   * @param unappliedPaymentGetIn Input Object Key.
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnappliedPaymentObjectData get (UnappliedPaymentObjectKeyData unappliedPaymentGetIn) throws BSDMResourceException;
  /**
   * Retrieve a UnappliedPayment based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param unappliedPaymentGetIn Input Object Key.
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnappliedPaymentObjectData get (BSDMSessionContext context, UnappliedPaymentObjectKeyData unappliedPaymentGetIn) throws BSDMResourceException;


  /**
   * Retrieve a UnappliedPayment based upon its key..
   * Convenience method using default BSDMSessionContext.
   * @param unappliedPaymentGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public UnappliedPaymentObjectData get (UnappliedPaymentObjectKeyData unappliedPaymentGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a UnappliedPayment based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param unappliedPaymentGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public UnappliedPaymentObjectData get (BSDMSessionContext context, UnappliedPaymentObjectKeyData unappliedPaymentGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find UnappliedPayments that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param unappliedPaymentFindIn Input Filter Object.
   * @return UnappliedPaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnappliedPaymentObjectDataList find (UnappliedPaymentObjectFilter unappliedPaymentFindIn) throws BSDMResourceException;
  /**
   * Find UnappliedPayments that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param unappliedPaymentFindIn Input Filter Object.
   * @return UnappliedPaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnappliedPaymentObjectDataList find (BSDMSessionContext context, UnappliedPaymentObjectFilter unappliedPaymentFindIn) throws BSDMResourceException;


  /**
   * Find UnappliedPayments that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param unappliedPaymentFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnappliedPaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public UnappliedPaymentObjectDataList find (UnappliedPaymentObjectFilter unappliedPaymentFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find UnappliedPayments that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param unappliedPaymentFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnappliedPaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public UnappliedPaymentObjectDataList find (BSDMSessionContext context, UnappliedPaymentObjectFilter unappliedPaymentFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update an UnappliedPayment based upon its key..
   * Convenience method using default BSDMSessionContext.
   * @param unappliedPaymentUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BmfErrorText, OrigBillRefNo, OrigBillRefResets, CrNoteBillRefNo, CrNoteBillRefResets, BmfTransType, TransDate, PostDate, CurrencyCode, TransAmount, GlAmount, OrigTrackingId, OrigTrackingIdServ, TransSource, ChgDate, SourceType, SourceIdServ, SourceId, BatchId, BatchIdServ, TransSubmitter, ActionCode, ProfileId, MicrBankId, MicrDdaNum, MicrCheckNum, ArchFlag, ManualCcauthCode, ManualCcauthDate, FileId, ResponseCode, BillOrderNumber, ExternalAmount, ExternalCurrency, OpenItemId, Annotation.
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnappliedPaymentObjectData update (UnappliedPaymentObjectData unappliedPaymentUpdateIn) throws BSDMResourceException;
  /**
   * Update an UnappliedPayment based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param unappliedPaymentUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BmfErrorText, OrigBillRefNo, OrigBillRefResets, CrNoteBillRefNo, CrNoteBillRefResets, BmfTransType, TransDate, PostDate, CurrencyCode, TransAmount, GlAmount, OrigTrackingId, OrigTrackingIdServ, TransSource, ChgDate, SourceType, SourceIdServ, SourceId, BatchId, BatchIdServ, TransSubmitter, ActionCode, ProfileId, MicrBankId, MicrDdaNum, MicrCheckNum, ArchFlag, ManualCcauthCode, ManualCcauthDate, FileId, ResponseCode, BillOrderNumber, ExternalAmount, ExternalCurrency, OpenItemId, Annotation.
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnappliedPaymentObjectData update (BSDMSessionContext context, UnappliedPaymentObjectData unappliedPaymentUpdateIn) throws BSDMResourceException;


  /**
   * Update an UnappliedPayment based upon its key..
   * Convenience method using default BSDMSessionContext.
   * @param unappliedPaymentUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BmfErrorText, OrigBillRefNo, OrigBillRefResets, CrNoteBillRefNo, CrNoteBillRefResets, BmfTransType, TransDate, PostDate, CurrencyCode, TransAmount, GlAmount, OrigTrackingId, OrigTrackingIdServ, TransSource, ChgDate, SourceType, SourceIdServ, SourceId, BatchId, BatchIdServ, TransSubmitter, ActionCode, ProfileId, MicrBankId, MicrDdaNum, MicrCheckNum, ArchFlag, ManualCcauthCode, ManualCcauthDate, FileId, ResponseCode, BillOrderNumber, ExternalAmount, ExternalCurrency, OpenItemId, Annotation.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public UnappliedPaymentObjectData update (UnappliedPaymentObjectData unappliedPaymentUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update an UnappliedPayment based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param unappliedPaymentUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BmfErrorText, OrigBillRefNo, OrigBillRefResets, CrNoteBillRefNo, CrNoteBillRefResets, BmfTransType, TransDate, PostDate, CurrencyCode, TransAmount, GlAmount, OrigTrackingId, OrigTrackingIdServ, TransSource, ChgDate, SourceType, SourceIdServ, SourceId, BatchId, BatchIdServ, TransSubmitter, ActionCode, ProfileId, MicrBankId, MicrDdaNum, MicrCheckNum, ArchFlag, ManualCcauthCode, ManualCcauthDate, FileId, ResponseCode, BillOrderNumber, ExternalAmount, ExternalCurrency, OpenItemId, Annotation.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public UnappliedPaymentObjectData update (BSDMSessionContext context, UnappliedPaymentObjectData unappliedPaymentUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
