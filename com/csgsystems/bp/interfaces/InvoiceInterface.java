
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
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface InvoiceInterface extends BaliInterface {

  /**
   * Get a unique Invoice (including the Suspense Account, Invoice-0)..
   * Convenience method using default BSDMSessionContext.
   * @param InvoicegetIn Input Object Key.
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceObjectData get (InvoiceObjectKeyData InvoicegetIn) throws BSDMResourceException;
  /**
   * Get a unique Invoice (including the Suspense Account, Invoice-0)..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoicegetIn Input Object Key.
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceObjectData get (BSDMSessionContext context, InvoiceObjectKeyData InvoicegetIn) throws BSDMResourceException;


  /**
   * Get a unique Invoice (including the Suspense Account, Invoice-0)..
   * Convenience method using default BSDMSessionContext.
   * @param InvoicegetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoiceObjectData get (InvoiceObjectKeyData InvoicegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique Invoice (including the Suspense Account, Invoice-0)..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoicegetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoiceObjectData get (BSDMSessionContext context, InvoiceObjectKeyData InvoicegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * Convenience method using default BSDMSessionContext.
   * @param InvoicefindIn Input Filter Object.
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceObjectDataList find (InvoiceObjectFilter InvoicefindIn) throws BSDMResourceException;
  /**
   * Find Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoicefindIn Input Filter Object.
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceObjectDataList find (BSDMSessionContext context, InvoiceObjectFilter InvoicefindIn) throws BSDMResourceException;


  /**
   * Find Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * Convenience method using default BSDMSessionContext.
   * @param InvoicefindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoiceObjectDataList find (InvoiceObjectFilter InvoicefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoicefindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoiceObjectDataList find (BSDMSessionContext context, InvoiceObjectFilter InvoicefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Count of Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * Convenience method using default BSDMSessionContext.
   * @param InvoicefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (InvoiceObjectFilter InvoicefindCountIn) throws BSDMResourceException;
  /**
   * Find Count of Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoicefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (BSDMSessionContext context, InvoiceObjectFilter InvoicefindCountIn) throws BSDMResourceException;


  /**
   * Find Count of Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * Convenience method using default BSDMSessionContext.
   * @param InvoicefindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findCount (InvoiceObjectFilter InvoicefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Count of Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoicefindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findCount (BSDMSessionContext context, InvoiceObjectFilter InvoicefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get a unique Re-Issued invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceRgetIn Input Object Key.
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceObjectData reissueGet (InvoiceObjectKeyData InvoiceRgetIn) throws BSDMResourceException;
  /**
   * Get a unique Re-Issued invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceRgetIn Input Object Key.
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceObjectData reissueGet (BSDMSessionContext context, InvoiceObjectKeyData InvoiceRgetIn) throws BSDMResourceException;


  /**
   * Get a unique Re-Issued invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceRgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoiceObjectData reissueGet (InvoiceObjectKeyData InvoiceRgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique Re-Issued invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceRgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoiceObjectData reissueGet (BSDMSessionContext context, InvoiceObjectKeyData InvoiceRgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Re-Issue'd Invoice's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceRfindIn Input Filter Object.
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceObjectDataList reissueFind (InvoiceObjectFilter InvoiceRfindIn) throws BSDMResourceException;
  /**
   * Find Re-Issue'd Invoice's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceRfindIn Input Filter Object.
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceObjectDataList reissueFind (BSDMSessionContext context, InvoiceObjectFilter InvoiceRfindIn) throws BSDMResourceException;


  /**
   * Find Re-Issue'd Invoice's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceRfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoiceObjectDataList reissueFind (InvoiceObjectFilter InvoiceRfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Re-Issue'd Invoice's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceRfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoiceObjectDataList reissueFind (BSDMSessionContext context, InvoiceObjectFilter InvoiceRfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve summary information for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceSumgetIn Input Object Key.
   * @return InvoiceSummaryObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceSummaryObjectData summaryGet (InvoiceObjectKeyData InvoiceSumgetIn) throws BSDMResourceException;
  /**
   * Retrieve summary information for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceSumgetIn Input Object Key.
   * @return InvoiceSummaryObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceSummaryObjectData summaryGet (BSDMSessionContext context, InvoiceObjectKeyData InvoiceSumgetIn) throws BSDMResourceException;


  /**
   * Retrieve summary information for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceSumgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceSummaryObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoiceSummaryObjectData summaryGet (InvoiceObjectKeyData InvoiceSumgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve summary information for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceSumgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceSummaryObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoiceSummaryObjectData summaryGet (BSDMSessionContext context, InvoiceObjectKeyData InvoiceSumgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Re-Issue an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceReissueIn Input Object Key.
   * @param bill_disp_meth.
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceObjectData reIssue (InvoiceObjectKeyData InvoiceReissueIn, Integer bill_disp_meth) throws BSDMResourceException;
  /**
   * Re-Issue an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceReissueIn Input Object Key.
   * @param bill_disp_meth.
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceObjectData reIssue (BSDMSessionContext context, InvoiceObjectKeyData InvoiceReissueIn, Integer bill_disp_meth) throws BSDMResourceException;


  /**
   * Re-Issue an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceReissueIn Input Object Key.
   * @param bill_disp_meth.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoiceObjectData reIssue (InvoiceObjectKeyData InvoiceReissueIn, Integer bill_disp_meth, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Re-Issue an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceReissueIn Input Object Key.
   * @param bill_disp_meth.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoiceObjectData reIssue (BSDMSessionContext context, InvoiceObjectKeyData InvoiceReissueIn, Integer bill_disp_meth, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve the various Invoice amounts for a particular Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceAmountGetIn Input Object Key.
   * @return InvoiceAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceAmountObjectData amountGet (InvoiceObjectKeyData InvoiceAmountGetIn) throws BSDMResourceException;
  /**
   * Retrieve the various Invoice amounts for a particular Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceAmountGetIn Input Object Key.
   * @return InvoiceAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceAmountObjectData amountGet (BSDMSessionContext context, InvoiceObjectKeyData InvoiceAmountGetIn) throws BSDMResourceException;


  /**
   * Retrieve the various Invoice amounts for a particular Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceAmountGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoiceAmountObjectData amountGet (InvoiceObjectKeyData InvoiceAmountGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve the various Invoice amounts for a particular Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceAmountGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoiceAmountObjectData amountGet (BSDMSessionContext context, InvoiceObjectKeyData InvoiceAmountGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve the Summary Balance information for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceBalSumIn Input  Object.  Read-Only fields: PaymentDueDate, OrigBillRefno, OrigBillRefResets, ProcessNum, AccountInternalId, CurrencyCode, OrigPayDueDate, ClosedDate, NewCharges, NetNewCharges, TotalDue, TotalAdj, TotalPaid, BalanceDue, DisputeAmt, LateExemptCharges, CollectionIndicator, ChgDate, ChgWho, GlAmount, BalanceConverted, NewChargeCredits, BillConverted, BillSequenceNum, PrevBillRefno, PrevBillRefResets, PrevBalanceRefno, PrevBalanceRefResets, Zip, FromDate, ToDate, PrepDate, NextToDate, PrevPpdd, PrevCutoffDate, TaxDate, BillPeriod, PayMethod, BillDispMeth, TaxJournalStatus, ImageReq, AccountStatus, ImageDone, SpecialCode, PrepTask, PrepStatus, FormatStatus, DispatchCount, DispatchDate, FileName, StartOffset, EndOffset, PageCount, BillHoldCode, PrepErrorCode, FormatErrorCode, BackoutStatus, CopyType, CollectionHistory, JnlEarnedThruDt, JnlStatus, TestFlag, ArchFlag, InterimBillFlag, IncludeNrc, IncludeRc, IncludeAdj, IncludeUsage, IncludePayment, LanguageCode, WarmBillFlag, BillOrderNumber.  Defaulted Fields: StatementDate.
   * @return InvoiceBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceBalanceSummaryOutputData balanceSummary (InvoiceObjectData InvoiceBalSumIn) throws BSDMResourceException;
  /**
   * Retrieve the Summary Balance information for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceBalSumIn Input  Object.  Read-Only fields: PaymentDueDate, OrigBillRefno, OrigBillRefResets, ProcessNum, AccountInternalId, CurrencyCode, OrigPayDueDate, ClosedDate, NewCharges, NetNewCharges, TotalDue, TotalAdj, TotalPaid, BalanceDue, DisputeAmt, LateExemptCharges, CollectionIndicator, ChgDate, ChgWho, GlAmount, BalanceConverted, NewChargeCredits, BillConverted, BillSequenceNum, PrevBillRefno, PrevBillRefResets, PrevBalanceRefno, PrevBalanceRefResets, Zip, FromDate, ToDate, PrepDate, NextToDate, PrevPpdd, PrevCutoffDate, TaxDate, BillPeriod, PayMethod, BillDispMeth, TaxJournalStatus, ImageReq, AccountStatus, ImageDone, SpecialCode, PrepTask, PrepStatus, FormatStatus, DispatchCount, DispatchDate, FileName, StartOffset, EndOffset, PageCount, BillHoldCode, PrepErrorCode, FormatErrorCode, BackoutStatus, CopyType, CollectionHistory, JnlEarnedThruDt, JnlStatus, TestFlag, ArchFlag, InterimBillFlag, IncludeNrc, IncludeRc, IncludeAdj, IncludeUsage, IncludePayment, LanguageCode, WarmBillFlag, BillOrderNumber.  Defaulted Fields: StatementDate.
   * @return InvoiceBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceBalanceSummaryOutputData balanceSummary (BSDMSessionContext context, InvoiceObjectData InvoiceBalSumIn) throws BSDMResourceException;


  /**
   * Retrieve the Summary Balance information for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceBalSumIn Input  Object.  Read-Only fields: PaymentDueDate, OrigBillRefno, OrigBillRefResets, ProcessNum, AccountInternalId, CurrencyCode, OrigPayDueDate, ClosedDate, NewCharges, NetNewCharges, TotalDue, TotalAdj, TotalPaid, BalanceDue, DisputeAmt, LateExemptCharges, CollectionIndicator, ChgDate, ChgWho, GlAmount, BalanceConverted, NewChargeCredits, BillConverted, BillSequenceNum, PrevBillRefno, PrevBillRefResets, PrevBalanceRefno, PrevBalanceRefResets, Zip, FromDate, ToDate, PrepDate, NextToDate, PrevPpdd, PrevCutoffDate, TaxDate, BillPeriod, PayMethod, BillDispMeth, TaxJournalStatus, ImageReq, AccountStatus, ImageDone, SpecialCode, PrepTask, PrepStatus, FormatStatus, DispatchCount, DispatchDate, FileName, StartOffset, EndOffset, PageCount, BillHoldCode, PrepErrorCode, FormatErrorCode, BackoutStatus, CopyType, CollectionHistory, JnlEarnedThruDt, JnlStatus, TestFlag, ArchFlag, InterimBillFlag, IncludeNrc, IncludeRc, IncludeAdj, IncludeUsage, IncludePayment, LanguageCode, WarmBillFlag, BillOrderNumber.  Defaulted Fields: StatementDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoiceBalanceSummaryOutputData balanceSummary (InvoiceObjectData InvoiceBalSumIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve the Summary Balance information for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceBalSumIn Input  Object.  Read-Only fields: PaymentDueDate, OrigBillRefno, OrigBillRefResets, ProcessNum, AccountInternalId, CurrencyCode, OrigPayDueDate, ClosedDate, NewCharges, NetNewCharges, TotalDue, TotalAdj, TotalPaid, BalanceDue, DisputeAmt, LateExemptCharges, CollectionIndicator, ChgDate, ChgWho, GlAmount, BalanceConverted, NewChargeCredits, BillConverted, BillSequenceNum, PrevBillRefno, PrevBillRefResets, PrevBalanceRefno, PrevBalanceRefResets, Zip, FromDate, ToDate, PrepDate, NextToDate, PrevPpdd, PrevCutoffDate, TaxDate, BillPeriod, PayMethod, BillDispMeth, TaxJournalStatus, ImageReq, AccountStatus, ImageDone, SpecialCode, PrepTask, PrepStatus, FormatStatus, DispatchCount, DispatchDate, FileName, StartOffset, EndOffset, PageCount, BillHoldCode, PrepErrorCode, FormatErrorCode, BackoutStatus, CopyType, CollectionHistory, JnlEarnedThruDt, JnlStatus, TestFlag, ArchFlag, InterimBillFlag, IncludeNrc, IncludeRc, IncludeAdj, IncludeUsage, IncludePayment, LanguageCode, WarmBillFlag, BillOrderNumber.  Defaulted Fields: StatementDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoiceBalanceSummaryOutputData balanceSummary (BSDMSessionContext context, InvoiceObjectData InvoiceBalSumIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Reschedule the Payment Due Date for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceUpdateIn Input Object Key.
   * @param payment_due_date (has a default).
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceObjectData paymentDateReschedule (InvoiceObjectKeyData InvoiceUpdateIn, Date payment_due_date) throws BSDMResourceException;
  /**
   * Reschedule the Payment Due Date for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceUpdateIn Input Object Key.
   * @param payment_due_date (has a default).
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceObjectData paymentDateReschedule (BSDMSessionContext context, InvoiceObjectKeyData InvoiceUpdateIn, Date payment_due_date) throws BSDMResourceException;


  /**
   * Reschedule the Payment Due Date for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceUpdateIn Input Object Key.
   * @param payment_due_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoiceObjectData paymentDateReschedule (InvoiceObjectKeyData InvoiceUpdateIn, Date payment_due_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Reschedule the Payment Due Date for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceUpdateIn Input Object Key.
   * @param payment_due_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoiceObjectData paymentDateReschedule (BSDMSessionContext context, InvoiceObjectKeyData InvoiceUpdateIn, Date payment_due_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve the Sum of Prepaid Billed Usage for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param totalBUPIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger prepaidBilledUsageTotal (InvoiceObjectKeyData totalBUPIn) throws BSDMResourceException;
  /**
   * Retrieve the Sum of Prepaid Billed Usage for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param totalBUPIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger prepaidBilledUsageTotal (BSDMSessionContext context, InvoiceObjectKeyData totalBUPIn) throws BSDMResourceException;


  /**
   * Retrieve the Sum of Prepaid Billed Usage for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param totalBUPIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BigInteger prepaidBilledUsageTotal (InvoiceObjectKeyData totalBUPIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve the Sum of Prepaid Billed Usage for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param totalBUPIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BigInteger prepaidBilledUsageTotal (BSDMSessionContext context, InvoiceObjectKeyData totalBUPIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve the Sum of Postpaid Billed Usage for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param totalBUIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger postpaidBilledUsageTotal (InvoiceObjectKeyData totalBUIn) throws BSDMResourceException;
  /**
   * Retrieve the Sum of Postpaid Billed Usage for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param totalBUIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger postpaidBilledUsageTotal (BSDMSessionContext context, InvoiceObjectKeyData totalBUIn) throws BSDMResourceException;


  /**
   * Retrieve the Sum of Postpaid Billed Usage for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param totalBUIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BigInteger postpaidBilledUsageTotal (InvoiceObjectKeyData totalBUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve the Sum of Postpaid Billed Usage for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param totalBUIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BigInteger postpaidBilledUsageTotal (BSDMSessionContext context, InvoiceObjectKeyData totalBUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve the Sum of Prepaid Unbilled Usage for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param account_internal_id.
   * @return InvoicePrepaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoicePrepaidUnbilledUsageTotalOutputData prepaidUnbilledUsageTotal (Integer account_internal_id) throws BSDMResourceException;
  /**
   * Retrieve the Sum of Prepaid Unbilled Usage for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internal_id.
   * @return InvoicePrepaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoicePrepaidUnbilledUsageTotalOutputData prepaidUnbilledUsageTotal (BSDMSessionContext context, Integer account_internal_id) throws BSDMResourceException;


  /**
   * Retrieve the Sum of Prepaid Unbilled Usage for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param account_internal_id.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoicePrepaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoicePrepaidUnbilledUsageTotalOutputData prepaidUnbilledUsageTotal (Integer account_internal_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve the Sum of Prepaid Unbilled Usage for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internal_id.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoicePrepaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoicePrepaidUnbilledUsageTotalOutputData prepaidUnbilledUsageTotal (BSDMSessionContext context, Integer account_internal_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve the Sum of Postpaid Unbilled Usage for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param account_internalId.
   * @return InvoicePostpaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoicePostpaidUnbilledUsageTotalOutputData postpaidUnbilledUsageTotal (Integer account_internalId) throws BSDMResourceException;
  /**
   * Retrieve the Sum of Postpaid Unbilled Usage for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internalId.
   * @return InvoicePostpaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoicePostpaidUnbilledUsageTotalOutputData postpaidUnbilledUsageTotal (BSDMSessionContext context, Integer account_internalId) throws BSDMResourceException;


  /**
   * Retrieve the Sum of Postpaid Unbilled Usage for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param account_internalId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoicePostpaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoicePostpaidUnbilledUsageTotalOutputData postpaidUnbilledUsageTotal (Integer account_internalId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve the Sum of Postpaid Unbilled Usage for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internalId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoicePostpaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoicePostpaidUnbilledUsageTotalOutputData postpaidUnbilledUsageTotal (BSDMSessionContext context, Integer account_internalId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @return InvoicePostpaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoicePostpaidProductChargeTotalOutputData postpaidProductChargeTotal (Integer bill_ref_no, Integer bill_ref_resets) throws BSDMResourceException;
  /**
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @return InvoicePostpaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoicePostpaidProductChargeTotalOutputData postpaidProductChargeTotal (BSDMSessionContext context, Integer bill_ref_no, Integer bill_ref_resets) throws BSDMResourceException;


  /**
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param bill_ref_no.
   * @param bill_ref_resets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoicePostpaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoicePostpaidProductChargeTotalOutputData postpaidProductChargeTotal (Integer bill_ref_no, Integer bill_ref_resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_ref_no.
   * @param bill_ref_resets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoicePostpaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoicePostpaidProductChargeTotalOutputData postpaidProductChargeTotal (BSDMSessionContext context, Integer bill_ref_no, Integer bill_ref_resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param Bill_ref_no.
   * @param Bill_ref_resets.
   * @return InvoicePrepaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoicePrepaidProductChargeTotalOutputData prepaidProductChargeTotal (Integer Bill_ref_no, Integer Bill_ref_resets) throws BSDMResourceException;
  /**
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param Bill_ref_no.
   * @param Bill_ref_resets.
   * @return InvoicePrepaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoicePrepaidProductChargeTotalOutputData prepaidProductChargeTotal (BSDMSessionContext context, Integer Bill_ref_no, Integer Bill_ref_resets) throws BSDMResourceException;


  /**
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param Bill_ref_no.
   * @param Bill_ref_resets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoicePrepaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoicePrepaidProductChargeTotalOutputData prepaidProductChargeTotal (Integer Bill_ref_no, Integer Bill_ref_resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param Bill_ref_no.
   * @param Bill_ref_resets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoicePrepaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoicePrepaidProductChargeTotalOutputData prepaidProductChargeTotal (BSDMSessionContext context, Integer Bill_ref_no, Integer Bill_ref_resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
