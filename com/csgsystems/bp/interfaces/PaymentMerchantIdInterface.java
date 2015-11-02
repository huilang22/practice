
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
public interface PaymentMerchantIdInterface extends BaliInterface {

  /**
   * Get a PaymentMerchantId..
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdgetIn Input Object Key.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdObjectData get (PaymentMerchantIdObjectKeyData PaymentMerchantIdgetIn) throws BSDMResourceException;
  /**
   * Get a PaymentMerchantId..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdgetIn Input Object Key.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdObjectData get (BSDMSessionContext context, PaymentMerchantIdObjectKeyData PaymentMerchantIdgetIn) throws BSDMResourceException;


  /**
   * Get a PaymentMerchantId..
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentMerchantIdObjectData get (PaymentMerchantIdObjectKeyData PaymentMerchantIdgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a PaymentMerchantId..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentMerchantIdObjectData get (BSDMSessionContext context, PaymentMerchantIdObjectKeyData PaymentMerchantIdgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find PaymentMerchantIds..
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdfindIn Input Filter Object.
   * @return PaymentMerchantIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdObjectDataList find (PaymentMerchantIdObjectFilter PaymentMerchantIdfindIn) throws BSDMResourceException;
  /**
   * Find PaymentMerchantIds..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdfindIn Input Filter Object.
   * @return PaymentMerchantIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdObjectDataList find (BSDMSessionContext context, PaymentMerchantIdObjectFilter PaymentMerchantIdfindIn) throws BSDMResourceException;


  /**
   * Find PaymentMerchantIds..
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentMerchantIdObjectDataList find (PaymentMerchantIdObjectFilter PaymentMerchantIdfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find PaymentMerchantIds..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentMerchantIdObjectDataList find (BSDMSessionContext context, PaymentMerchantIdObjectFilter PaymentMerchantIdfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdUpdateIn Input  Object.  Read-Only fields: IsInternal, IsDefault, EpgMerchantId, Status.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdObjectData update (PaymentMerchantIdObjectData PaymentMerchantIdUpdateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdUpdateIn Input  Object.  Read-Only fields: IsInternal, IsDefault, EpgMerchantId, Status.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdObjectData update (BSDMSessionContext context, PaymentMerchantIdObjectData PaymentMerchantIdUpdateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdUpdateIn Input  Object.  Read-Only fields: IsInternal, IsDefault, EpgMerchantId, Status.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentMerchantIdObjectData update (PaymentMerchantIdObjectData PaymentMerchantIdUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdUpdateIn Input  Object.  Read-Only fields: IsInternal, IsDefault, EpgMerchantId, Status.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentMerchantIdObjectData update (BSDMSessionContext context, PaymentMerchantIdObjectData PaymentMerchantIdUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdCreateIn Input  Object.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdObjectData create (PaymentMerchantIdObjectData PaymentMerchantIdCreateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdCreateIn Input  Object.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdObjectData create (BSDMSessionContext context, PaymentMerchantIdObjectData PaymentMerchantIdCreateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentMerchantIdObjectData create (PaymentMerchantIdObjectData PaymentMerchantIdCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentMerchantIdObjectData create (BSDMSessionContext context, PaymentMerchantIdObjectData PaymentMerchantIdCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdDeleteIn Input Object Key.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdObjectData delete (PaymentMerchantIdObjectKeyData PaymentMerchantIdDeleteIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdDeleteIn Input Object Key.
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentMerchantIdObjectData delete (BSDMSessionContext context, PaymentMerchantIdObjectKeyData PaymentMerchantIdDeleteIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentMerchantIdObjectData delete (PaymentMerchantIdObjectKeyData PaymentMerchantIdDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentMerchantIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentMerchantIdObjectData delete (BSDMSessionContext context, PaymentMerchantIdObjectKeyData PaymentMerchantIdDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
