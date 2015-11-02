
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
public interface VoucherStatusMovementInterface extends BaliInterface {

  /**
   * Create A New Record Using Required Fields In voucher_status_movement..
   * Convenience method using default BSDMSessionContext.
   * @param VouSMCIn Input  Object.
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusMovementObjectData create (VoucherStatusMovementObjectData VouSMCIn) throws BSDMResourceException;
  /**
   * Create A New Record Using Required Fields In voucher_status_movement..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMCIn Input  Object.
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusMovementObjectData create (BSDMSessionContext context, VoucherStatusMovementObjectData VouSMCIn) throws BSDMResourceException;


  /**
   * Create A New Record Using Required Fields In voucher_status_movement..
   * Convenience method using default BSDMSessionContext.
   * @param VouSMCIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusMovementObjectData create (VoucherStatusMovementObjectData VouSMCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create A New Record Using Required Fields In voucher_status_movement..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMCIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusMovementObjectData create (BSDMSessionContext context, VoucherStatusMovementObjectData VouSMCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update Non-key Fields For A Row In voucher_status_movement..
   * Convenience method using default BSDMSessionContext.
   * @param VouSMUIn Input  Object.
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusMovementObjectData update (VoucherStatusMovementObjectData VouSMUIn) throws BSDMResourceException;
  /**
   * Update Non-key Fields For A Row In voucher_status_movement..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMUIn Input  Object.
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusMovementObjectData update (BSDMSessionContext context, VoucherStatusMovementObjectData VouSMUIn) throws BSDMResourceException;


  /**
   * Update Non-key Fields For A Row In voucher_status_movement..
   * Convenience method using default BSDMSessionContext.
   * @param VouSMUIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusMovementObjectData update (VoucherStatusMovementObjectData VouSMUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update Non-key Fields For A Row In voucher_status_movement..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMUIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusMovementObjectData update (BSDMSessionContext context, VoucherStatusMovementObjectData VouSMUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get Voucher Status Movement That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouSMGIn Input Object Key.
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusMovementObjectData get (VoucherStatusMovementObjectKeyData VouSMGIn) throws BSDMResourceException;
  /**
   * Get Voucher Status Movement That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMGIn Input Object Key.
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusMovementObjectData get (BSDMSessionContext context, VoucherStatusMovementObjectKeyData VouSMGIn) throws BSDMResourceException;


  /**
   * Get Voucher Status Movement That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouSMGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusMovementObjectData get (VoucherStatusMovementObjectKeyData VouSMGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get Voucher Status Movement That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusMovementObjectData get (BSDMSessionContext context, VoucherStatusMovementObjectKeyData VouSMGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Voucher Status Movement That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouSMFIn Input Filter Object.
   * @return VoucherStatusMovementObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusMovementObjectDataList find (VoucherStatusMovementObjectFilter VouSMFIn) throws BSDMResourceException;
  /**
   * Find Voucher Status Movement That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMFIn Input Filter Object.
   * @return VoucherStatusMovementObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusMovementObjectDataList find (BSDMSessionContext context, VoucherStatusMovementObjectFilter VouSMFIn) throws BSDMResourceException;


  /**
   * Find Voucher Status Movement That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouSMFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusMovementObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusMovementObjectDataList find (VoucherStatusMovementObjectFilter VouSMFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Voucher Status Movement That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusMovementObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusMovementObjectDataList find (BSDMSessionContext context, VoucherStatusMovementObjectFilter VouSMFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
