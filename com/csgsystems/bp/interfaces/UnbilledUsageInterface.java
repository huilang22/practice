
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
public interface UnbilledUsageInterface extends BaliInterface {

  /**
   * Get a unique UnbilledUsage row..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagegetIn Input Object Key.
   * @return UnbilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageObjectData get (UnbilledUsageObjectKeyData UnbilledUsagegetIn) throws BSDMResourceException;
  /**
   * Get a unique UnbilledUsage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagegetIn Input Object Key.
   * @return UnbilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageObjectData get (BSDMSessionContext context, UnbilledUsageObjectKeyData UnbilledUsagegetIn) throws BSDMResourceException;


  /**
   * Get a unique UnbilledUsage row..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagegetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public UnbilledUsageObjectData get (UnbilledUsageObjectKeyData UnbilledUsagegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique UnbilledUsage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagegetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public UnbilledUsageObjectData get (BSDMSessionContext context, UnbilledUsageObjectKeyData UnbilledUsagegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find UnbilledUsage..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagefindIn Input Filter Object.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageObjectDataList find (UnbilledUsageObjectFilter UnbilledUsagefindIn) throws BSDMResourceException;
  /**
   * Find UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagefindIn Input Filter Object.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageObjectDataList find (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagefindIn) throws BSDMResourceException;


  /**
   * Find UnbilledUsage..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagefindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public UnbilledUsageObjectDataList find (UnbilledUsageObjectFilter UnbilledUsagefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagefindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public UnbilledUsageObjectDataList find (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Count of UnbilledUsage..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (UnbilledUsageObjectFilter UnbilledUsagefindCountIn) throws BSDMResourceException;
  /**
   * Find Count of UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagefindCountIn) throws BSDMResourceException;


  /**
   * Find Count of UnbilledUsage..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagefindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findCount (UnbilledUsageObjectFilter UnbilledUsagefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Count of UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagefindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findCount (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find UnbilledUsage by Account..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageAcctfindIn Input Filter Object.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageObjectDataList byAccountFind (UnbilledUsageAccountObjectFilter UnbilledUsageAcctfindIn) throws BSDMResourceException;
  /**
   * Find UnbilledUsage by Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAcctfindIn Input Filter Object.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageObjectDataList byAccountFind (BSDMSessionContext context, UnbilledUsageAccountObjectFilter UnbilledUsageAcctfindIn) throws BSDMResourceException;


  /**
   * Find UnbilledUsage by Account..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageAcctfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public UnbilledUsageObjectDataList byAccountFind (UnbilledUsageAccountObjectFilter UnbilledUsageAcctfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find UnbilledUsage by Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAcctfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public UnbilledUsageObjectDataList byAccountFind (BSDMSessionContext context, UnbilledUsageAccountObjectFilter UnbilledUsageAcctfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Count of UnbilledUsage..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageAccountfindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer byAccountFindCount (UnbilledUsageAccountObjectFilter UnbilledUsageAccountfindCountIn) throws BSDMResourceException;
  /**
   * Find Count of UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAccountfindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer byAccountFindCount (BSDMSessionContext context, UnbilledUsageAccountObjectFilter UnbilledUsageAccountfindCountIn) throws BSDMResourceException;


  /**
   * Find Count of UnbilledUsage..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageAccountfindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer byAccountFindCount (UnbilledUsageAccountObjectFilter UnbilledUsageAccountfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Count of UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAccountfindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer byAccountFindCount (BSDMSessionContext context, UnbilledUsageAccountObjectFilter UnbilledUsageAccountfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find UnbilledUsage by Service..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageServicefindIn Input Filter Object.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageObjectDataList byServiceFind (UnbilledUsageServiceObjectFilter UnbilledUsageServicefindIn) throws BSDMResourceException;
  /**
   * Find UnbilledUsage by Service..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageServicefindIn Input Filter Object.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageObjectDataList byServiceFind (BSDMSessionContext context, UnbilledUsageServiceObjectFilter UnbilledUsageServicefindIn) throws BSDMResourceException;


  /**
   * Find UnbilledUsage by Service..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageServicefindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public UnbilledUsageObjectDataList byServiceFind (UnbilledUsageServiceObjectFilter UnbilledUsageServicefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find UnbilledUsage by Service..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageServicefindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public UnbilledUsageObjectDataList byServiceFind (BSDMSessionContext context, UnbilledUsageServiceObjectFilter UnbilledUsageServicefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Count of UnbilledUsage..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageServicefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer byServiceFindCount (UnbilledUsageServiceObjectFilter UnbilledUsageServicefindCountIn) throws BSDMResourceException;
  /**
   * Find Count of UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageServicefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer byServiceFindCount (BSDMSessionContext context, UnbilledUsageServiceObjectFilter UnbilledUsageServicefindCountIn) throws BSDMResourceException;


  /**
   * Find Count of UnbilledUsage..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageServicefindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer byServiceFindCount (UnbilledUsageServiceObjectFilter UnbilledUsageServicefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Count of UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageServicefindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer byServiceFindCount (BSDMSessionContext context, UnbilledUsageServiceObjectFilter UnbilledUsageServicefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Adjust a unique UnbilledUsage row..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
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
  public AdjustmentObjectData adjust (UnbilledUsageObjectData UnbilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber) throws BSDMResourceException;
  /**
   * Adjust a unique UnbilledUsage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
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
  public AdjustmentObjectData adjust (BSDMSessionContext context, UnbilledUsageObjectData UnbilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber) throws BSDMResourceException;


  /**
   * Adjust a unique UnbilledUsage row..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
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
  public AdjustmentObjectData adjust (UnbilledUsageObjectData UnbilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Adjust a unique UnbilledUsage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
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
  public AdjustmentObjectData adjust (BSDMSessionContext context, UnbilledUsageObjectData UnbilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retreive the total unbilled usage for an Account/Service.  .
   * Convenience method using default BSDMSessionContext.
   * @param AccountExternalId.
   * @param AccountExternalIdType.
   * @param ServiceExternalId (null is allowed).
   * @param ServiceExternalIdType (null is allowed).
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger total (String AccountExternalId, Integer AccountExternalIdType, String ServiceExternalId, Integer ServiceExternalIdType) throws BSDMResourceException;
  /**
   * Retreive the total unbilled usage for an Account/Service.  .
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountExternalId.
   * @param AccountExternalIdType.
   * @param ServiceExternalId (null is allowed).
   * @param ServiceExternalIdType (null is allowed).
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger total (BSDMSessionContext context, String AccountExternalId, Integer AccountExternalIdType, String ServiceExternalId, Integer ServiceExternalIdType) throws BSDMResourceException;


  /**
   * Retreive the total unbilled usage for an Account/Service.  .
   * Convenience method using default BSDMSessionContext.
   * @param AccountExternalId.
   * @param AccountExternalIdType.
   * @param ServiceExternalId (null is allowed).
   * @param ServiceExternalIdType (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BigInteger total (String AccountExternalId, Integer AccountExternalIdType, String ServiceExternalId, Integer ServiceExternalIdType, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retreive the total unbilled usage for an Account/Service.  .
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountExternalId.
   * @param AccountExternalIdType.
   * @param ServiceExternalId (null is allowed).
   * @param ServiceExternalIdType (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BigInteger total (BSDMSessionContext context, String AccountExternalId, Integer AccountExternalIdType, String ServiceExternalId, Integer ServiceExternalIdType, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Given an UnbilledUsage key the AdjustmentEligibleAmount and Tax are calculated and returned. The following two objects are used to calculate the AdjustmentEligibleAmount and Tax: UnbilledUsage and Adjustment. .
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageAmountIn Input Object Key.
   * @return UnbilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageAmountObjectData amountGet (UnbilledUsageObjectKeyData UnbilledUsageAmountIn) throws BSDMResourceException;
  /**
   * Given an UnbilledUsage key the AdjustmentEligibleAmount and Tax are calculated and returned. The following two objects are used to calculate the AdjustmentEligibleAmount and Tax: UnbilledUsage and Adjustment. .
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAmountIn Input Object Key.
   * @return UnbilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageAmountObjectData amountGet (BSDMSessionContext context, UnbilledUsageObjectKeyData UnbilledUsageAmountIn) throws BSDMResourceException;


  /**
   * Given an UnbilledUsage key the AdjustmentEligibleAmount and Tax are calculated and returned. The following two objects are used to calculate the AdjustmentEligibleAmount and Tax: UnbilledUsage and Adjustment. .
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageAmountIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public UnbilledUsageAmountObjectData amountGet (UnbilledUsageObjectKeyData UnbilledUsageAmountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Given an UnbilledUsage key the AdjustmentEligibleAmount and Tax are calculated and returned. The following two objects are used to calculate the AdjustmentEligibleAmount and Tax: UnbilledUsage and Adjustment. .
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAmountIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public UnbilledUsageAmountObjectData amountGet (BSDMSessionContext context, UnbilledUsageObjectKeyData UnbilledUsageAmountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFind, but does not return nor filter on as many fields..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageffindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageObjectDataList findFast (UnbilledUsageObjectFilter UnbilledUsageffindIn) throws BSDMResourceException;
  /**
   * Find UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFind, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageffindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageObjectDataList findFast (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsageffindIn) throws BSDMResourceException;


  /**
   * Find UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFind, but does not return nor filter on as many fields..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageffindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public UnbilledUsageObjectDataList findFast (UnbilledUsageObjectFilter UnbilledUsageffindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFind, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageffindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public UnbilledUsageObjectDataList findFast (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsageffindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Count of UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFindCount, but does not return nor filter on as many fields..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageffindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findFastCount (UnbilledUsageObjectFilter UnbilledUsageffindCountIn) throws BSDMResourceException;
  /**
   * Find Count of UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFindCount, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageffindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findFastCount (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsageffindCountIn) throws BSDMResourceException;


  /**
   * Find Count of UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFindCount, but does not return nor filter on as many fields..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageffindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findFastCount (UnbilledUsageObjectFilter UnbilledUsageffindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Count of UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFindCount, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageffindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findFastCount (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsageffindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFast, but does not return nor filter on as many fields..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagesfindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageObjectDataList findSummary (UnbilledUsageObjectFilter UnbilledUsagesfindIn) throws BSDMResourceException;
  /**
   * Find UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFast, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagesfindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public UnbilledUsageObjectDataList findSummary (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagesfindIn) throws BSDMResourceException;


  /**
   * Find UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFast, but does not return nor filter on as many fields..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagesfindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public UnbilledUsageObjectDataList findSummary (UnbilledUsageObjectFilter UnbilledUsagesfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFast, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagesfindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public UnbilledUsageObjectDataList findSummary (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagesfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Count of UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFastCount, but does not return nor filter on as many fields..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagesfindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findSummaryCount (UnbilledUsageObjectFilter UnbilledUsagesfindCountIn) throws BSDMResourceException;
  /**
   * Find Count of UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFastCount, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagesfindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findSummaryCount (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagesfindCountIn) throws BSDMResourceException;


  /**
   * Find Count of UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFastCount, but does not return nor filter on as many fields..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagesfindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findSummaryCount (UnbilledUsageObjectFilter UnbilledUsagesfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Count of UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFastCount, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagesfindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findSummaryCount (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagesfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
