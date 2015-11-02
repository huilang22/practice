
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
public interface VoucherTypesInterface extends BaliInterface {

  /**
   * Create A New Record Using Required Fields In voucher_types..
   * Convenience method using default BSDMSessionContext.
   * @param VouTCIn Input  Object.
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherTypesObjectData create (VoucherTypesObjectData VouTCIn) throws BSDMResourceException;
  /**
   * Create A New Record Using Required Fields In voucher_types..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTCIn Input  Object.
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherTypesObjectData create (BSDMSessionContext context, VoucherTypesObjectData VouTCIn) throws BSDMResourceException;


  /**
   * Create A New Record Using Required Fields In voucher_types..
   * Convenience method using default BSDMSessionContext.
   * @param VouTCIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherTypesObjectData create (VoucherTypesObjectData VouTCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create A New Record Using Required Fields In voucher_types..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTCIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherTypesObjectData create (BSDMSessionContext context, VoucherTypesObjectData VouTCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update Non-key Fields For A Row In voucher_types..
   * Convenience method using default BSDMSessionContext.
   * @param VouTUIn Input  Object.
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherTypesObjectData update (VoucherTypesObjectData VouTUIn) throws BSDMResourceException;
  /**
   * Update Non-key Fields For A Row In voucher_types..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTUIn Input  Object.
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherTypesObjectData update (BSDMSessionContext context, VoucherTypesObjectData VouTUIn) throws BSDMResourceException;


  /**
   * Update Non-key Fields For A Row In voucher_types..
   * Convenience method using default BSDMSessionContext.
   * @param VouTUIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherTypesObjectData update (VoucherTypesObjectData VouTUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update Non-key Fields For A Row In voucher_types..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTUIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherTypesObjectData update (BSDMSessionContext context, VoucherTypesObjectData VouTUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get Voucher Types That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouTGIn Input Object Key.
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherTypesObjectData get (VoucherTypesObjectKeyData VouTGIn) throws BSDMResourceException;
  /**
   * Get Voucher Types That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTGIn Input Object Key.
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherTypesObjectData get (BSDMSessionContext context, VoucherTypesObjectKeyData VouTGIn) throws BSDMResourceException;


  /**
   * Get Voucher Types That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouTGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherTypesObjectData get (VoucherTypesObjectKeyData VouTGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get Voucher Types That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherTypesObjectData get (BSDMSessionContext context, VoucherTypesObjectKeyData VouTGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Voucher Types That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouTFIn Input Filter Object.
   * @return VoucherTypesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherTypesObjectDataList find (VoucherTypesObjectFilter VouTFIn) throws BSDMResourceException;
  /**
   * Find Voucher Types That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTFIn Input Filter Object.
   * @return VoucherTypesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherTypesObjectDataList find (BSDMSessionContext context, VoucherTypesObjectFilter VouTFIn) throws BSDMResourceException;


  /**
   * Find Voucher Types That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouTFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherTypesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherTypesObjectDataList find (VoucherTypesObjectFilter VouTFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Voucher Types That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherTypesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherTypesObjectDataList find (BSDMSessionContext context, VoucherTypesObjectFilter VouTFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
