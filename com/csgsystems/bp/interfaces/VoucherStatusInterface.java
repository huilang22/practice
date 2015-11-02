
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
public interface VoucherStatusInterface extends BaliInterface {

  /**
   * Create A New Record Using Required Fields In voucher_status..
   * Convenience method using default BSDMSessionContext.
   * @param VouSCIn Input  Object.
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusObjectData create (VoucherStatusObjectData VouSCIn) throws BSDMResourceException;
  /**
   * Create A New Record Using Required Fields In voucher_status..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSCIn Input  Object.
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusObjectData create (BSDMSessionContext context, VoucherStatusObjectData VouSCIn) throws BSDMResourceException;


  /**
   * Create A New Record Using Required Fields In voucher_status..
   * Convenience method using default BSDMSessionContext.
   * @param VouSCIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusObjectData create (VoucherStatusObjectData VouSCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create A New Record Using Required Fields In voucher_status..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSCIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusObjectData create (BSDMSessionContext context, VoucherStatusObjectData VouSCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update Non-key Fields For A Row In voucher_status..
   * Convenience method using default BSDMSessionContext.
   * @param VouSUIn Input  Object.
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusObjectData update (VoucherStatusObjectData VouSUIn) throws BSDMResourceException;
  /**
   * Update Non-key Fields For A Row In voucher_status..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSUIn Input  Object.
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusObjectData update (BSDMSessionContext context, VoucherStatusObjectData VouSUIn) throws BSDMResourceException;


  /**
   * Update Non-key Fields For A Row In voucher_status..
   * Convenience method using default BSDMSessionContext.
   * @param VouSUIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusObjectData update (VoucherStatusObjectData VouSUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update Non-key Fields For A Row In voucher_status..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSUIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusObjectData update (BSDMSessionContext context, VoucherStatusObjectData VouSUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get Voucher Status That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouSGIn Input Object Key.
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusObjectData get (VoucherStatusObjectKeyData VouSGIn) throws BSDMResourceException;
  /**
   * Get Voucher Status That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSGIn Input Object Key.
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusObjectData get (BSDMSessionContext context, VoucherStatusObjectKeyData VouSGIn) throws BSDMResourceException;


  /**
   * Get Voucher Status That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouSGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusObjectData get (VoucherStatusObjectKeyData VouSGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get Voucher Status That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusObjectData get (BSDMSessionContext context, VoucherStatusObjectKeyData VouSGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Voucher Status That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouSFIn Input Filter Object.
   * @return VoucherStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusObjectDataList find (VoucherStatusObjectFilter VouSFIn) throws BSDMResourceException;
  /**
   * Find Voucher Status That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSFIn Input Filter Object.
   * @return VoucherStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusObjectDataList find (BSDMSessionContext context, VoucherStatusObjectFilter VouSFIn) throws BSDMResourceException;


  /**
   * Find Voucher Status That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouSFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusObjectDataList find (VoucherStatusObjectFilter VouSFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Voucher Status That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusObjectDataList find (BSDMSessionContext context, VoucherStatusObjectFilter VouSFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
