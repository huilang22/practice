
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
public interface PaymentProfileInterface extends BaliInterface {

  /**
   * Create a PaymentProfile based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param ppcIn Input  Object.  Defaulted Fields: Status.
   * @param payment_protocol (null is allowed) (has a default).
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentProfileObjectData create (PaymentProfileObjectData ppcIn, Integer payment_protocol) throws BSDMResourceException;
  /**
   * Create a PaymentProfile based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param ppcIn Input  Object.  Defaulted Fields: Status.
   * @param payment_protocol (null is allowed) (has a default).
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentProfileObjectData create (BSDMSessionContext context, PaymentProfileObjectData ppcIn, Integer payment_protocol) throws BSDMResourceException;


  /**
   * Create a PaymentProfile based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param ppcIn Input  Object.  Defaulted Fields: Status.
   * @param payment_protocol (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentProfileObjectData create (PaymentProfileObjectData ppcIn, Integer payment_protocol, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a PaymentProfile based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param ppcIn Input  Object.  Defaulted Fields: Status.
   * @param payment_protocol (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentProfileObjectData create (BSDMSessionContext context, PaymentProfileObjectData ppcIn, Integer payment_protocol, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update a PaymentProfile.
   * Convenience method using default BSDMSessionContext.
   * @param ppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.
   * @param payment_protocol2 (null is allowed) (has a default).
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentProfileObjectData update (PaymentProfileObjectData ppuIn, Integer payment_protocol2) throws BSDMResourceException;
  /**
   * Update a PaymentProfile.
   * @param context The session context to use when connecting to the APITS server.
   * @param ppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.
   * @param payment_protocol2 (null is allowed) (has a default).
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentProfileObjectData update (BSDMSessionContext context, PaymentProfileObjectData ppuIn, Integer payment_protocol2) throws BSDMResourceException;


  /**
   * Update a PaymentProfile.
   * Convenience method using default BSDMSessionContext.
   * @param ppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.
   * @param payment_protocol2 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentProfileObjectData update (PaymentProfileObjectData ppuIn, Integer payment_protocol2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update a PaymentProfile.
   * @param context The session context to use when connecting to the APITS server.
   * @param ppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.
   * @param payment_protocol2 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentProfileObjectData update (BSDMSessionContext context, PaymentProfileObjectData ppuIn, Integer payment_protocol2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param ppdIn Input Object Key.
   * @param profile_status (null is allowed).
   * @param payment_protocol3 (null is allowed) (has a default).
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentProfileObjectData delete (PaymentProfileObjectKeyData ppdIn, Integer profile_status, Integer payment_protocol3) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param ppdIn Input Object Key.
   * @param profile_status (null is allowed).
   * @param payment_protocol3 (null is allowed) (has a default).
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentProfileObjectData delete (BSDMSessionContext context, PaymentProfileObjectKeyData ppdIn, Integer profile_status, Integer payment_protocol3) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param ppdIn Input Object Key.
   * @param profile_status (null is allowed).
   * @param payment_protocol3 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentProfileObjectData delete (PaymentProfileObjectKeyData ppdIn, Integer profile_status, Integer payment_protocol3, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param ppdIn Input Object Key.
   * @param profile_status (null is allowed).
   * @param payment_protocol3 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentProfileObjectData delete (BSDMSessionContext context, PaymentProfileObjectKeyData ppdIn, Integer profile_status, Integer payment_protocol3, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get the PaymentProfile row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param ppgIn Input Object Key.
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentProfileObjectData get (PaymentProfileObjectKeyData ppgIn) throws BSDMResourceException;
  /**
   * Get the PaymentProfile row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param ppgIn Input Object Key.
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentProfileObjectData get (BSDMSessionContext context, PaymentProfileObjectKeyData ppgIn) throws BSDMResourceException;


  /**
   * Get the PaymentProfile row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param ppgIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentProfileObjectData get (PaymentProfileObjectKeyData ppgIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get the PaymentProfile row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param ppgIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentProfileObjectData get (BSDMSessionContext context, PaymentProfileObjectKeyData ppgIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find PaymentProfiles that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ppfIn Input Filter Object.
   * @return PaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentProfileObjectDataList find (PaymentProfileObjectFilter ppfIn) throws BSDMResourceException;
  /**
   * Find PaymentProfiles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ppfIn Input Filter Object.
   * @return PaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentProfileObjectDataList find (BSDMSessionContext context, PaymentProfileObjectFilter ppfIn) throws BSDMResourceException;


  /**
   * Find PaymentProfiles that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ppfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentProfileObjectDataList find (PaymentProfileObjectFilter ppfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find PaymentProfiles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ppfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentProfileObjectDataList find (BSDMSessionContext context, PaymentProfileObjectFilter ppfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
