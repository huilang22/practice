
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
public interface PaymentMerchantIdAssignInterface extends BaliInterface {

  /**
   * Get a PaymentMerchantIdAssign..
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdAssigngetIn Input Object Key.
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdAssignObjectData get (PaymentMerchantIdAssignObjectKeyData PaymentMerchantIdAssigngetIn) throws BSDMResourceException;
  /**
   * Get a PaymentMerchantIdAssign..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssigngetIn Input Object Key.
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdAssignObjectData get (BSDMSessionContext context, PaymentMerchantIdAssignObjectKeyData PaymentMerchantIdAssigngetIn) throws BSDMResourceException;


  /**
   * Get a PaymentMerchantIdAssign..
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdAssigngetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentMerchantIdAssignObjectData get (PaymentMerchantIdAssignObjectKeyData PaymentMerchantIdAssigngetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a PaymentMerchantIdAssign..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssigngetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentMerchantIdAssignObjectData get (BSDMSessionContext context, PaymentMerchantIdAssignObjectKeyData PaymentMerchantIdAssigngetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find PaymentMerchantIdAssigns..
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdAssignfindIn Input Filter Object.
   * @return PaymentMerchantIdAssignObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdAssignObjectDataList find (PaymentMerchantIdAssignObjectFilter PaymentMerchantIdAssignfindIn) throws BSDMResourceException;
  /**
   * Find PaymentMerchantIdAssigns..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssignfindIn Input Filter Object.
   * @return PaymentMerchantIdAssignObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdAssignObjectDataList find (BSDMSessionContext context, PaymentMerchantIdAssignObjectFilter PaymentMerchantIdAssignfindIn) throws BSDMResourceException;


  /**
   * Find PaymentMerchantIdAssigns..
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdAssignfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdAssignObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentMerchantIdAssignObjectDataList find (PaymentMerchantIdAssignObjectFilter PaymentMerchantIdAssignfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find PaymentMerchantIdAssigns..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssignfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdAssignObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentMerchantIdAssignObjectDataList find (BSDMSessionContext context, PaymentMerchantIdAssignObjectFilter PaymentMerchantIdAssignfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdAssignUpdateIn Input  Object.
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdAssignObjectData update (PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignUpdateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssignUpdateIn Input  Object.
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdAssignObjectData update (BSDMSessionContext context, PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignUpdateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdAssignUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentMerchantIdAssignObjectData update (PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssignUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentMerchantIdAssignObjectData update (BSDMSessionContext context, PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdAssignCreateIn Input  Object.
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdAssignObjectData create (PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignCreateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssignCreateIn Input  Object.
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdAssignObjectData create (BSDMSessionContext context, PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignCreateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdAssignCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentMerchantIdAssignObjectData create (PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssignCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentMerchantIdAssignObjectData create (BSDMSessionContext context, PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
