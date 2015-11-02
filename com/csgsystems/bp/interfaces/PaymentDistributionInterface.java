
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
public interface PaymentDistributionInterface extends BaliInterface {

  /**
   * Retrieve a PaymentDistribution based upon its key..
   * Convenience method using default BSDMSessionContext.
   * @param payDistribGetIn Input Object Key.
   * @return PaymentDistributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentDistributionObjectData get (PaymentDistributionObjectKeyData payDistribGetIn) throws BSDMResourceException;
  /**
   * Retrieve a PaymentDistribution based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param payDistribGetIn Input Object Key.
   * @return PaymentDistributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentDistributionObjectData get (BSDMSessionContext context, PaymentDistributionObjectKeyData payDistribGetIn) throws BSDMResourceException;


  /**
   * Retrieve a PaymentDistribution based upon its key..
   * Convenience method using default BSDMSessionContext.
   * @param payDistribGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentDistributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentDistributionObjectData get (PaymentDistributionObjectKeyData payDistribGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a PaymentDistribution based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param payDistribGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentDistributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentDistributionObjectData get (BSDMSessionContext context, PaymentDistributionObjectKeyData payDistribGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find PaymentDistributions that match the supplied filter.  If you're filtering on OrigBillRefNo=0, it is much faster to use PaymentDistributionSuspenseFind..
   * Convenience method using default BSDMSessionContext.
   * @param payDistribFindIn Input Filter Object.
   * @return PaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentDistributionObjectDataList find (PaymentDistributionObjectFilter payDistribFindIn) throws BSDMResourceException;
  /**
   * Find PaymentDistributions that match the supplied filter.  If you're filtering on OrigBillRefNo=0, it is much faster to use PaymentDistributionSuspenseFind..
   * @param context The session context to use when connecting to the APITS server.
   * @param payDistribFindIn Input Filter Object.
   * @return PaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentDistributionObjectDataList find (BSDMSessionContext context, PaymentDistributionObjectFilter payDistribFindIn) throws BSDMResourceException;


  /**
   * Find PaymentDistributions that match the supplied filter.  If you're filtering on OrigBillRefNo=0, it is much faster to use PaymentDistributionSuspenseFind..
   * Convenience method using default BSDMSessionContext.
   * @param payDistribFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentDistributionObjectDataList find (PaymentDistributionObjectFilter payDistribFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find PaymentDistributions that match the supplied filter.  If you're filtering on OrigBillRefNo=0, it is much faster to use PaymentDistributionSuspenseFind..
   * @param context The session context to use when connecting to the APITS server.
   * @param payDistribFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentDistributionObjectDataList find (BSDMSessionContext context, PaymentDistributionObjectFilter payDistribFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Count of PaymentDistributions that match the supplied filter.  If you're filtering on OrigBillRefNo=0, it is much faster to use PaymentDistributionSuspenseFindCount..
   * Convenience method using default BSDMSessionContext.
   * @param payDistribFindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (PaymentDistributionObjectFilter payDistribFindCountIn) throws BSDMResourceException;
  /**
   * Find Count of PaymentDistributions that match the supplied filter.  If you're filtering on OrigBillRefNo=0, it is much faster to use PaymentDistributionSuspenseFindCount..
   * @param context The session context to use when connecting to the APITS server.
   * @param payDistribFindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (BSDMSessionContext context, PaymentDistributionObjectFilter payDistribFindCountIn) throws BSDMResourceException;


  /**
   * Find Count of PaymentDistributions that match the supplied filter.  If you're filtering on OrigBillRefNo=0, it is much faster to use PaymentDistributionSuspenseFindCount..
   * Convenience method using default BSDMSessionContext.
   * @param payDistribFindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findCount (PaymentDistributionObjectFilter payDistribFindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Count of PaymentDistributions that match the supplied filter.  If you're filtering on OrigBillRefNo=0, it is much faster to use PaymentDistributionSuspenseFindCount..
   * @param context The session context to use when connecting to the APITS server.
   * @param payDistribFindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findCount (BSDMSessionContext context, PaymentDistributionObjectFilter payDistribFindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find PaymentDistributions that match the supplied filter and have OrigBillRefNo and OrigBillRefResets both set to 0..
   * Convenience method using default BSDMSessionContext.
   * @param payDistribFind2In Input Filter Object.  Read-Only fields: OrigBillRefNo, OrigBillRefResets.
   * @return PaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentDistributionObjectDataList suspenseFind (PaymentDistributionObjectFilter payDistribFind2In) throws BSDMResourceException;
  /**
   * Find PaymentDistributions that match the supplied filter and have OrigBillRefNo and OrigBillRefResets both set to 0..
   * @param context The session context to use when connecting to the APITS server.
   * @param payDistribFind2In Input Filter Object.  Read-Only fields: OrigBillRefNo, OrigBillRefResets.
   * @return PaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentDistributionObjectDataList suspenseFind (BSDMSessionContext context, PaymentDistributionObjectFilter payDistribFind2In) throws BSDMResourceException;


  /**
   * Find PaymentDistributions that match the supplied filter and have OrigBillRefNo and OrigBillRefResets both set to 0..
   * Convenience method using default BSDMSessionContext.
   * @param payDistribFind2In Input Filter Object.  Read-Only fields: OrigBillRefNo, OrigBillRefResets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentDistributionObjectDataList suspenseFind (PaymentDistributionObjectFilter payDistribFind2In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find PaymentDistributions that match the supplied filter and have OrigBillRefNo and OrigBillRefResets both set to 0..
   * @param context The session context to use when connecting to the APITS server.
   * @param payDistribFind2In Input Filter Object.  Read-Only fields: OrigBillRefNo, OrigBillRefResets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentDistributionObjectDataList suspenseFind (BSDMSessionContext context, PaymentDistributionObjectFilter payDistribFind2In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Count of PaymentDistributions that match the supplied filter and have OrigBillRefNo and OrigBillRefResets both set to 0..
   * Convenience method using default BSDMSessionContext.
   * @param payDistribFindCount2In Input Filter Object.  Read-Only fields: OrigBillRefNo, OrigBillRefResets.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer suspenseFindCount (PaymentDistributionObjectFilter payDistribFindCount2In) throws BSDMResourceException;
  /**
   * Find Count of PaymentDistributions that match the supplied filter and have OrigBillRefNo and OrigBillRefResets both set to 0..
   * @param context The session context to use when connecting to the APITS server.
   * @param payDistribFindCount2In Input Filter Object.  Read-Only fields: OrigBillRefNo, OrigBillRefResets.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer suspenseFindCount (BSDMSessionContext context, PaymentDistributionObjectFilter payDistribFindCount2In) throws BSDMResourceException;


  /**
   * Find Count of PaymentDistributions that match the supplied filter and have OrigBillRefNo and OrigBillRefResets both set to 0..
   * Convenience method using default BSDMSessionContext.
   * @param payDistribFindCount2In Input Filter Object.  Read-Only fields: OrigBillRefNo, OrigBillRefResets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer suspenseFindCount (PaymentDistributionObjectFilter payDistribFindCount2In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Count of PaymentDistributions that match the supplied filter and have OrigBillRefNo and OrigBillRefResets both set to 0..
   * @param context The session context to use when connecting to the APITS server.
   * @param payDistribFindCount2In Input Filter Object.  Read-Only fields: OrigBillRefNo, OrigBillRefResets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer suspenseFindCount (BSDMSessionContext context, PaymentDistributionObjectFilter payDistribFindCount2In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve PaymentDistribution Summaries based upon BmfTrackingId and BmfTrackingIdServ..
   * Convenience method using default BSDMSessionContext.
   * @param payDistribSumFindIn Input Filter Object.
   * @return PaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentDistributionObjectDataList summaryFind (PaymentDistributionObjectFilter payDistribSumFindIn) throws BSDMResourceException;
  /**
   * Retrieve PaymentDistribution Summaries based upon BmfTrackingId and BmfTrackingIdServ..
   * @param context The session context to use when connecting to the APITS server.
   * @param payDistribSumFindIn Input Filter Object.
   * @return PaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentDistributionObjectDataList summaryFind (BSDMSessionContext context, PaymentDistributionObjectFilter payDistribSumFindIn) throws BSDMResourceException;


  /**
   * Retrieve PaymentDistribution Summaries based upon BmfTrackingId and BmfTrackingIdServ..
   * Convenience method using default BSDMSessionContext.
   * @param payDistribSumFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentDistributionObjectDataList summaryFind (PaymentDistributionObjectFilter payDistribSumFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve PaymentDistribution Summaries based upon BmfTrackingId and BmfTrackingIdServ..
   * @param context The session context to use when connecting to the APITS server.
   * @param payDistribSumFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentDistributionObjectDataList summaryFind (BSDMSessionContext context, PaymentDistributionObjectFilter payDistribSumFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
