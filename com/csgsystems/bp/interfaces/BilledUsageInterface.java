
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
public interface BilledUsageInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagegetIn Input Object Key.
   * @return BilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectData get (BilledUsageObjectKeyData BilledUsagegetIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagegetIn Input Object Key.
   * @return BilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectData get (BSDMSessionContext context, BilledUsageObjectKeyData BilledUsagegetIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagegetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BilledUsageObjectData get (BilledUsageObjectKeyData BilledUsagegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagegetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BilledUsageObjectData get (BSDMSessionContext context, BilledUsageObjectKeyData BilledUsagegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefindIn Input Filter Object.
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectDataList find (BilledUsageObjectFilter BilledUsagefindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindIn Input Filter Object.
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectDataList find (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagefindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BilledUsageObjectDataList find (BilledUsageObjectFilter BilledUsagefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BilledUsageObjectDataList find (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (BilledUsageObjectFilter BilledUsagefindCountIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagefindCountIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findCount (BilledUsageObjectFilter BilledUsagefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findCount (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Returns BilledUsage and filter on Invoice, Usage and Account attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectDataList byAccountFind (BilledUsageAccountObjectFilter BilledUsageAccountfindIn, Boolean LatestInvoice) throws BSDMResourceException;
  /**
   * Returns BilledUsage and filter on Invoice, Usage and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectDataList byAccountFind (BSDMSessionContext context, BilledUsageAccountObjectFilter BilledUsageAccountfindIn, Boolean LatestInvoice) throws BSDMResourceException;


  /**
   * Returns BilledUsage and filter on Invoice, Usage and Account attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BilledUsageObjectDataList byAccountFind (BilledUsageAccountObjectFilter BilledUsageAccountfindIn, Boolean LatestInvoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns BilledUsage and filter on Invoice, Usage and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BilledUsageObjectDataList byAccountFind (BSDMSessionContext context, BilledUsageAccountObjectFilter BilledUsageAccountfindIn, Boolean LatestInvoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Account attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefindAccountCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer byAccountFindCount (BilledUsageAccountObjectFilter BilledUsagefindAccountCountIn, Boolean LatestInvoice1) throws BSDMResourceException;
  /**
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindAccountCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer byAccountFindCount (BSDMSessionContext context, BilledUsageAccountObjectFilter BilledUsagefindAccountCountIn, Boolean LatestInvoice1) throws BSDMResourceException;


  /**
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Account attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefindAccountCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer byAccountFindCount (BilledUsageAccountObjectFilter BilledUsagefindAccountCountIn, Boolean LatestInvoice1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindAccountCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer byAccountFindCount (BSDMSessionContext context, BilledUsageAccountObjectFilter BilledUsagefindAccountCountIn, Boolean LatestInvoice1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Returns BilledUsages data, filters on Invoice, Usage and Service attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageServicefindIn Input Filter Object.
   * @param LatestInvoice2 (null is allowed) (has a default).
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectDataList byServiceFind (BilledUsageServiceObjectFilter BilledUsageServicefindIn, Boolean LatestInvoice2) throws BSDMResourceException;
  /**
   * Returns BilledUsages data, filters on Invoice, Usage and Service attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageServicefindIn Input Filter Object.
   * @param LatestInvoice2 (null is allowed) (has a default).
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectDataList byServiceFind (BSDMSessionContext context, BilledUsageServiceObjectFilter BilledUsageServicefindIn, Boolean LatestInvoice2) throws BSDMResourceException;


  /**
   * Returns BilledUsages data, filters on Invoice, Usage and Service attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageServicefindIn Input Filter Object.
   * @param LatestInvoice2 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BilledUsageObjectDataList byServiceFind (BilledUsageServiceObjectFilter BilledUsageServicefindIn, Boolean LatestInvoice2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns BilledUsages data, filters on Invoice, Usage and Service attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageServicefindIn Input Filter Object.
   * @param LatestInvoice2 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BilledUsageObjectDataList byServiceFind (BSDMSessionContext context, BilledUsageServiceObjectFilter BilledUsageServicefindIn, Boolean LatestInvoice2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Service attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefindServiceCountIn Input Filter Object.
   * @param LatestInvoice3 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer byServiceFindCount (BilledUsageServiceObjectFilter BilledUsagefindServiceCountIn, Boolean LatestInvoice3) throws BSDMResourceException;
  /**
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Service attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindServiceCountIn Input Filter Object.
   * @param LatestInvoice3 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer byServiceFindCount (BSDMSessionContext context, BilledUsageServiceObjectFilter BilledUsagefindServiceCountIn, Boolean LatestInvoice3) throws BSDMResourceException;


  /**
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Service attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefindServiceCountIn Input Filter Object.
   * @param LatestInvoice3 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer byServiceFindCount (BilledUsageServiceObjectFilter BilledUsagefindServiceCountIn, Boolean LatestInvoice3, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Service attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindServiceCountIn Input Filter Object.
   * @param LatestInvoice3 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer byServiceFindCount (BSDMSessionContext context, BilledUsageServiceObjectFilter BilledUsagefindServiceCountIn, Boolean LatestInvoice3, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Filters on Invoice, Usage, Service and Account attributes. Ugh..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageAcctServicefindIn Input Filter Object.
   * @param LatestInvoice4 (null is allowed) (has a default).
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectDataList byAccountServiceFind (BilledUsageServiceObjectFilter BilledUsageAcctServicefindIn, Boolean LatestInvoice4) throws BSDMResourceException;
  /**
   * Filters on Invoice, Usage, Service and Account attributes. Ugh..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAcctServicefindIn Input Filter Object.
   * @param LatestInvoice4 (null is allowed) (has a default).
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectDataList byAccountServiceFind (BSDMSessionContext context, BilledUsageServiceObjectFilter BilledUsageAcctServicefindIn, Boolean LatestInvoice4) throws BSDMResourceException;


  /**
   * Filters on Invoice, Usage, Service and Account attributes. Ugh..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageAcctServicefindIn Input Filter Object.
   * @param LatestInvoice4 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BilledUsageObjectDataList byAccountServiceFind (BilledUsageServiceObjectFilter BilledUsageAcctServicefindIn, Boolean LatestInvoice4, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Filters on Invoice, Usage, Service and Account attributes. Ugh..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAcctServicefindIn Input Filter Object.
   * @param LatestInvoice4 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BilledUsageObjectDataList byAccountServiceFind (BSDMSessionContext context, BilledUsageServiceObjectFilter BilledUsageAcctServicefindIn, Boolean LatestInvoice4, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData adjust (BilledUsageObjectData BilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData adjust (BSDMSessionContext context, BilledUsageObjectData BilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentObjectData adjust (BilledUsageObjectData BilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentObjectData adjust (BSDMSessionContext context, BilledUsageObjectData BilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageCalcIn Input  Object.  Read-Only fields: ServerId.
   * @return TaxAndDiscountAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxAndDiscountAmountObjectData calc (BilledUsageObjectData BilledUsageCalcIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageCalcIn Input  Object.  Read-Only fields: ServerId.
   * @return TaxAndDiscountAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxAndDiscountAmountObjectData calc (BSDMSessionContext context, BilledUsageObjectData BilledUsageCalcIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageCalcIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxAndDiscountAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TaxAndDiscountAmountObjectData calc (BilledUsageObjectData BilledUsageCalcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageCalcIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxAndDiscountAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TaxAndDiscountAmountObjectData calc (BSDMSessionContext context, BilledUsageObjectData BilledUsageCalcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageAmountIn Input Object Key.
   * @return BilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageAmountObjectData amountGet (BilledUsageObjectKeyData BilledUsageAmountIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAmountIn Input Object Key.
   * @return BilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageAmountObjectData amountGet (BSDMSessionContext context, BilledUsageObjectKeyData BilledUsageAmountIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageAmountIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BilledUsageAmountObjectData amountGet (BilledUsageObjectKeyData BilledUsageAmountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAmountIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BilledUsageAmountObjectData amountGet (BSDMSessionContext context, BilledUsageObjectKeyData BilledUsageAmountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFindCount..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefcountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findFastCount (BilledUsageObjectFilter BilledUsagefcountIn) throws BSDMResourceException;
  /**
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFindCount..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefcountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findFastCount (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagefcountIn) throws BSDMResourceException;


  /**
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFindCount..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefcountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findFastCount (BilledUsageObjectFilter BilledUsagefcountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFindCount..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefcountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findFastCount (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagefcountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Return only CDR_BILLED data and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFind..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageffindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectDataList findFast (BilledUsageObjectFilter BilledUsageffindIn) throws BSDMResourceException;
  /**
   * Return only CDR_BILLED data and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFind..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageffindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectDataList findFast (BSDMSessionContext context, BilledUsageObjectFilter BilledUsageffindIn) throws BSDMResourceException;


  /**
   * Return only CDR_BILLED data and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFind..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageffindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BilledUsageObjectDataList findFast (BilledUsageObjectFilter BilledUsageffindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Return only CDR_BILLED data and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFind..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageffindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BilledUsageObjectDataList findFast (BSDMSessionContext context, BilledUsageObjectFilter BilledUsageffindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFindCount.  No external ids nor CDR_DATA is available in this query..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagescountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findSummaryCount (BilledUsageObjectFilter BilledUsagescountIn) throws BSDMResourceException;
  /**
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFindCount.  No external ids nor CDR_DATA is available in this query..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagescountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findSummaryCount (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagescountIn) throws BSDMResourceException;


  /**
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFindCount.  No external ids nor CDR_DATA is available in this query..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagescountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findSummaryCount (BilledUsageObjectFilter BilledUsagescountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFindCount.  No external ids nor CDR_DATA is available in this query..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagescountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findSummaryCount (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagescountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Return only CDR_BILLED data and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFind.  No external ids nor CDR_DATA is available in this query..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagesfindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectDataList findSummary (BilledUsageObjectFilter BilledUsagesfindIn) throws BSDMResourceException;
  /**
   * Return only CDR_BILLED data and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFind.  No external ids nor CDR_DATA is available in this query..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagesfindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageObjectDataList findSummary (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagesfindIn) throws BSDMResourceException;


  /**
   * Return only CDR_BILLED data and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFind.  No external ids nor CDR_DATA is available in this query..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagesfindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BilledUsageObjectDataList findSummary (BilledUsageObjectFilter BilledUsagesfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Return only CDR_BILLED data and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFind.  No external ids nor CDR_DATA is available in this query..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagesfindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BilledUsageObjectDataList findSummary (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagesfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
