
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
public interface InvoiceDetailInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailgetIn Input Object Key.
   * @return InvoiceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceDetailObjectData get (InvoiceDetailObjectKeyData InvoiceDetailgetIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailgetIn Input Object Key.
   * @return InvoiceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceDetailObjectData get (BSDMSessionContext context, InvoiceDetailObjectKeyData InvoiceDetailgetIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoiceDetailObjectData get (InvoiceDetailObjectKeyData InvoiceDetailgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoiceDetailObjectData get (BSDMSessionContext context, InvoiceDetailObjectKeyData InvoiceDetailgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailfindIn Input Filter Object.  Defaulted Fields: LanguageCode.
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceDetailObjectDataList find (InvoiceDetailObjectFilter InvoiceDetailfindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailfindIn Input Filter Object.  Defaulted Fields: LanguageCode.
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceDetailObjectDataList find (BSDMSessionContext context, InvoiceDetailObjectFilter InvoiceDetailfindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailfindIn Input Filter Object.  Defaulted Fields: LanguageCode.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoiceDetailObjectDataList find (InvoiceDetailObjectFilter InvoiceDetailfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailfindIn Input Filter Object.  Defaulted Fields: LanguageCode.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoiceDetailObjectDataList find (BSDMSessionContext context, InvoiceDetailObjectFilter InvoiceDetailfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAdjfindIn Input Filter Object.
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceDetailObjectDataList adjustmentFind (InvoiceDetailObjectFilter InvoiceDetailAdjfindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAdjfindIn Input Filter Object.
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceDetailObjectDataList adjustmentFind (BSDMSessionContext context, InvoiceDetailObjectFilter InvoiceDetailAdjfindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAdjfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoiceDetailObjectDataList adjustmentFind (InvoiceDetailObjectFilter InvoiceDetailAdjfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAdjfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoiceDetailObjectDataList adjustmentFind (BSDMSessionContext context, InvoiceDetailObjectFilter InvoiceDetailAdjfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Return InvoiceDetail and filter on Invoice and Account attributes..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceDetailObjectDataList byAccountFind (InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindIn, Boolean LatestInvoice) throws BSDMResourceException;
  /**
   * Return InvoiceDetail and filter on Invoice and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InvoiceDetailObjectDataList byAccountFind (BSDMSessionContext context, InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindIn, Boolean LatestInvoice) throws BSDMResourceException;


  /**
   * Return InvoiceDetail and filter on Invoice and Account attributes..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvoiceDetailObjectDataList byAccountFind (InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindIn, Boolean LatestInvoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Return InvoiceDetail and filter on Invoice and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvoiceDetailObjectDataList byAccountFind (BSDMSessionContext context, InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindIn, Boolean LatestInvoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Return COUNT of InvoiceDetail and filter on Invoice and Account attributes..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAccountfindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer byAccountFindCount (InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindCountIn, Boolean LatestInvoice1) throws BSDMResourceException;
  /**
   * Return COUNT of InvoiceDetail and filter on Invoice and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAccountfindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer byAccountFindCount (BSDMSessionContext context, InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindCountIn, Boolean LatestInvoice1) throws BSDMResourceException;


  /**
   * Return COUNT of InvoiceDetail and filter on Invoice and Account attributes..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAccountfindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer byAccountFindCount (InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindCountIn, Boolean LatestInvoice1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Return COUNT of InvoiceDetail and filter on Invoice and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAccountfindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer byAccountFindCount (BSDMSessionContext context, InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindCountIn, Boolean LatestInvoice1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).
   * @param EffectiveDate.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData adjust (InvoiceDetailObjectData InvoiceDetailAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, Date EffectiveDate) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).
   * @param EffectiveDate.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData adjust (BSDMSessionContext context, InvoiceDetailObjectData InvoiceDetailAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, Date EffectiveDate) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).
   * @param EffectiveDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentObjectData adjust (InvoiceDetailObjectData InvoiceDetailAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, Date EffectiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).
   * @param EffectiveDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentObjectData adjust (BSDMSessionContext context, InvoiceDetailObjectData InvoiceDetailAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, Date EffectiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAmountIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger amountGet (InvoiceDetailObjectKeyData InvoiceDetailAmountIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAmountIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger amountGet (BSDMSessionContext context, InvoiceDetailObjectKeyData InvoiceDetailAmountIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAmountIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BigInteger amountGet (InvoiceDetailObjectKeyData InvoiceDetailAmountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAmountIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BigInteger amountGet (BSDMSessionContext context, InvoiceDetailObjectKeyData InvoiceDetailAmountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id (null is allowed).
   * @return BillInvoiceDetailAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInvoiceDetailAmountObjectData billInvoiceDetailAmountGet (Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id (null is allowed).
   * @return BillInvoiceDetailAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInvoiceDetailAmountObjectData billInvoiceDetailAmountGet (BSDMSessionContext context, Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInvoiceDetailAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillInvoiceDetailAmountObjectData billInvoiceDetailAmountGet (Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInvoiceDetailAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillInvoiceDetailAmountObjectData billInvoiceDetailAmountGet (BSDMSessionContext context, Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailfindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (InvoiceDetailObjectFilter InvoiceDetailfindCountIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailfindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (BSDMSessionContext context, InvoiceDetailObjectFilter InvoiceDetailfindCountIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailfindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findCount (InvoiceDetailObjectFilter InvoiceDetailfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailfindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findCount (BSDMSessionContext context, InvoiceDetailObjectFilter InvoiceDetailfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
