
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
public interface LbxPaymentTypeInterface extends BaliInterface {

  /**
   * Get a unique LbxPaymentType..
   * Convenience method using default BSDMSessionContext.
   * @param LSGetIn Input Object Key.
   * @return LbxPaymentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LbxPaymentTypeObjectData get (LbxPaymentTypeObjectKeyData LSGetIn) throws BSDMResourceException;
  /**
   * Get a unique LbxPaymentType..
   * @param context The session context to use when connecting to the APITS server.
   * @param LSGetIn Input Object Key.
   * @return LbxPaymentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LbxPaymentTypeObjectData get (BSDMSessionContext context, LbxPaymentTypeObjectKeyData LSGetIn) throws BSDMResourceException;


  /**
   * Get a unique LbxPaymentType..
   * Convenience method using default BSDMSessionContext.
   * @param LSGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LbxPaymentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public LbxPaymentTypeObjectData get (LbxPaymentTypeObjectKeyData LSGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique LbxPaymentType..
   * @param context The session context to use when connecting to the APITS server.
   * @param LSGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LbxPaymentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public LbxPaymentTypeObjectData get (BSDMSessionContext context, LbxPaymentTypeObjectKeyData LSGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find LbxPaymentType's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param LSFindIn Input Filter Object.
   * @return LbxPaymentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LbxPaymentTypeObjectDataList find (LbxPaymentTypeObjectFilter LSFindIn) throws BSDMResourceException;
  /**
   * Find LbxPaymentType's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param LSFindIn Input Filter Object.
   * @return LbxPaymentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LbxPaymentTypeObjectDataList find (BSDMSessionContext context, LbxPaymentTypeObjectFilter LSFindIn) throws BSDMResourceException;


  /**
   * Find LbxPaymentType's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param LSFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LbxPaymentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public LbxPaymentTypeObjectDataList find (LbxPaymentTypeObjectFilter LSFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find LbxPaymentType's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param LSFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LbxPaymentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public LbxPaymentTypeObjectDataList find (BSDMSessionContext context, LbxPaymentTypeObjectFilter LSFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
