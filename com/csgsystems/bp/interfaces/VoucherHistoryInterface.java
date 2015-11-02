
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
public interface VoucherHistoryInterface extends BaliInterface {

  /**
   * Get Unique Voucher History Info that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouGIn Input Object Key.
   * @return VoucherHistoryObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherHistoryObjectData get (VoucherHistoryObjectKeyData VouGIn) throws BSDMResourceException;
  /**
   * Get Unique Voucher History Info that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouGIn Input Object Key.
   * @return VoucherHistoryObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherHistoryObjectData get (BSDMSessionContext context, VoucherHistoryObjectKeyData VouGIn) throws BSDMResourceException;


  /**
   * Get Unique Voucher History Info that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherHistoryObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherHistoryObjectData get (VoucherHistoryObjectKeyData VouGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get Unique Voucher History Info that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherHistoryObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherHistoryObjectData get (BSDMSessionContext context, VoucherHistoryObjectKeyData VouGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Voucher History that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouFIn Input Filter Object.
   * @return VoucherHistoryObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherHistoryObjectDataList find (VoucherHistoryObjectFilter VouFIn) throws BSDMResourceException;
  /**
   * Find Voucher History that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouFIn Input Filter Object.
   * @return VoucherHistoryObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherHistoryObjectDataList find (BSDMSessionContext context, VoucherHistoryObjectFilter VouFIn) throws BSDMResourceException;


  /**
   * Find Voucher History that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherHistoryObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherHistoryObjectDataList find (VoucherHistoryObjectFilter VouFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Voucher History that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherHistoryObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherHistoryObjectDataList find (BSDMSessionContext context, VoucherHistoryObjectFilter VouFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
