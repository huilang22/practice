
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
public interface VoucherLocationInterface extends BaliInterface {

  /**
   * Create A New Record Using Required Fields In voucher_location..
   * Convenience method using default BSDMSessionContext.
   * @param VouLCIn Input  Object.
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherLocationObjectData create (VoucherLocationObjectData VouLCIn) throws BSDMResourceException;
  /**
   * Create A New Record Using Required Fields In voucher_location..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLCIn Input  Object.
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherLocationObjectData create (BSDMSessionContext context, VoucherLocationObjectData VouLCIn) throws BSDMResourceException;


  /**
   * Create A New Record Using Required Fields In voucher_location..
   * Convenience method using default BSDMSessionContext.
   * @param VouLCIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherLocationObjectData create (VoucherLocationObjectData VouLCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create A New Record Using Required Fields In voucher_location..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLCIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherLocationObjectData create (BSDMSessionContext context, VoucherLocationObjectData VouLCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update Non-key Fields For A Row In voucher_location..
   * Convenience method using default BSDMSessionContext.
   * @param VouLUIn Input  Object.
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherLocationObjectData update (VoucherLocationObjectData VouLUIn) throws BSDMResourceException;
  /**
   * Update Non-key Fields For A Row In voucher_location..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLUIn Input  Object.
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherLocationObjectData update (BSDMSessionContext context, VoucherLocationObjectData VouLUIn) throws BSDMResourceException;


  /**
   * Update Non-key Fields For A Row In voucher_location..
   * Convenience method using default BSDMSessionContext.
   * @param VouLUIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherLocationObjectData update (VoucherLocationObjectData VouLUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update Non-key Fields For A Row In voucher_location..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLUIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherLocationObjectData update (BSDMSessionContext context, VoucherLocationObjectData VouLUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get Voucher Location That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouLGIn Input Object Key.
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherLocationObjectData get (VoucherLocationObjectKeyData VouLGIn) throws BSDMResourceException;
  /**
   * Get Voucher Location That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLGIn Input Object Key.
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherLocationObjectData get (BSDMSessionContext context, VoucherLocationObjectKeyData VouLGIn) throws BSDMResourceException;


  /**
   * Get Voucher Location That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouLGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherLocationObjectData get (VoucherLocationObjectKeyData VouLGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get Voucher Location That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherLocationObjectData get (BSDMSessionContext context, VoucherLocationObjectKeyData VouLGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Voucher Location That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouLFIn Input Filter Object.
   * @return VoucherLocationObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherLocationObjectDataList find (VoucherLocationObjectFilter VouLFIn) throws BSDMResourceException;
  /**
   * Find Voucher Location That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLFIn Input Filter Object.
   * @return VoucherLocationObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherLocationObjectDataList find (BSDMSessionContext context, VoucherLocationObjectFilter VouLFIn) throws BSDMResourceException;


  /**
   * Find Voucher Location That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouLFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherLocationObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherLocationObjectDataList find (VoucherLocationObjectFilter VouLFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Voucher Location That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherLocationObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherLocationObjectDataList find (BSDMSessionContext context, VoucherLocationObjectFilter VouLFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
