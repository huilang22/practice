
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
public interface PaymentTypeInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param bmfGetIn Input Object Key.
   * @return PaymentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTypeObjectData get (PaymentTypeObjectKeyData bmfGetIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param bmfGetIn Input Object Key.
   * @return PaymentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTypeObjectData get (BSDMSessionContext context, PaymentTypeObjectKeyData bmfGetIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param bmfGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentTypeObjectData get (PaymentTypeObjectKeyData bmfGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param bmfGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentTypeObjectData get (BSDMSessionContext context, PaymentTypeObjectKeyData bmfGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param bmfFindIn Input Filter Object.
   * @return PaymentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTypeObjectDataList find (PaymentTypeObjectFilter bmfFindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param bmfFindIn Input Filter Object.
   * @return PaymentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTypeObjectDataList find (BSDMSessionContext context, PaymentTypeObjectFilter bmfFindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param bmfFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentTypeObjectDataList find (PaymentTypeObjectFilter bmfFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param bmfFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentTypeObjectDataList find (BSDMSessionContext context, PaymentTypeObjectFilter bmfFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
