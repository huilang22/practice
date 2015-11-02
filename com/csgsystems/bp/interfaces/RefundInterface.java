
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
public interface RefundInterface extends BaliInterface {

  /**
   * Get a unique Refund row..
   * Convenience method using default BSDMSessionContext.
   * @param refundGetIn Input Object Key.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectData get (RefundObjectKeyData refundGetIn) throws BSDMResourceException;
  /**
   * Get a unique Refund row..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundGetIn Input Object Key.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectData get (BSDMSessionContext context, RefundObjectKeyData refundGetIn) throws BSDMResourceException;


  /**
   * Get a unique Refund row..
   * Convenience method using default BSDMSessionContext.
   * @param refundGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefundObjectData get (RefundObjectKeyData refundGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique Refund row..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefundObjectData get (BSDMSessionContext context, RefundObjectKeyData refundGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Refund's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param refundFindIn Input Filter Object.
   * @return RefundObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectDataList find (RefundObjectFilter refundFindIn) throws BSDMResourceException;
  /**
   * Find Refund's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundFindIn Input Filter Object.
   * @return RefundObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectDataList find (BSDMSessionContext context, RefundObjectFilter refundFindIn) throws BSDMResourceException;


  /**
   * Find Refund's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param refundFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefundObjectDataList find (RefundObjectFilter refundFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Refund's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefundObjectDataList find (BSDMSessionContext context, RefundObjectFilter refundFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new Refund..
   * Convenience method using default BSDMSessionContext.
   * @param refundCreateIn Input  Object.  Defaulted Fields: RefundReasonCode, RefundStatus.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectData create (RefundObjectData refundCreateIn) throws BSDMResourceException;
  /**
   * Create a new Refund..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundCreateIn Input  Object.  Defaulted Fields: RefundReasonCode, RefundStatus.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectData create (BSDMSessionContext context, RefundObjectData refundCreateIn) throws BSDMResourceException;


  /**
   * Create a new Refund..
   * Convenience method using default BSDMSessionContext.
   * @param refundCreateIn Input  Object.  Defaulted Fields: RefundReasonCode, RefundStatus.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefundObjectData create (RefundObjectData refundCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Refund..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundCreateIn Input  Object.  Defaulted Fields: RefundReasonCode, RefundStatus.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefundObjectData create (BSDMSessionContext context, RefundObjectData refundCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Mark the supplied Refund row as having been Paid..
   * Convenience method using default BSDMSessionContext.
   * @param refundMarkIn Input Object Key.
   * @param TreasuryDate.
   * @param CheckNum.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectData markPaid (RefundObjectKeyData refundMarkIn, Date TreasuryDate, String CheckNum) throws BSDMResourceException;
  /**
   * Mark the supplied Refund row as having been Paid..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundMarkIn Input Object Key.
   * @param TreasuryDate.
   * @param CheckNum.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectData markPaid (BSDMSessionContext context, RefundObjectKeyData refundMarkIn, Date TreasuryDate, String CheckNum) throws BSDMResourceException;


  /**
   * Mark the supplied Refund row as having been Paid..
   * Convenience method using default BSDMSessionContext.
   * @param refundMarkIn Input Object Key.
   * @param TreasuryDate.
   * @param CheckNum.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefundObjectData markPaid (RefundObjectKeyData refundMarkIn, Date TreasuryDate, String CheckNum, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Mark the supplied Refund row as having been Paid..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundMarkIn Input Object Key.
   * @param TreasuryDate.
   * @param CheckNum.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefundObjectData markPaid (BSDMSessionContext context, RefundObjectKeyData refundMarkIn, Date TreasuryDate, String CheckNum, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Deny the request for the Refund..
   * Convenience method using default BSDMSessionContext.
   * @param refundDenyIn Input Object Key.
   * @param TreasuryFlag (null is allowed) (has a default).
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectData deny (RefundObjectKeyData refundDenyIn, Integer TreasuryFlag) throws BSDMResourceException;
  /**
   * Deny the request for the Refund..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundDenyIn Input Object Key.
   * @param TreasuryFlag (null is allowed) (has a default).
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectData deny (BSDMSessionContext context, RefundObjectKeyData refundDenyIn, Integer TreasuryFlag) throws BSDMResourceException;


  /**
   * Deny the request for the Refund..
   * Convenience method using default BSDMSessionContext.
   * @param refundDenyIn Input Object Key.
   * @param TreasuryFlag (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefundObjectData deny (RefundObjectKeyData refundDenyIn, Integer TreasuryFlag, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Deny the request for the Refund..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundDenyIn Input Object Key.
   * @param TreasuryFlag (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefundObjectData deny (BSDMSessionContext context, RefundObjectKeyData refundDenyIn, Integer TreasuryFlag, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Approve the requested Refund..
   * Convenience method using default BSDMSessionContext.
   * @param refundApproveIn Input Object Key.
   * @param AccountInternalId.
   * @param User.
   * @param Supervisor.
   * @param Amount.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectData approve (RefundObjectKeyData refundApproveIn, Integer AccountInternalId, String User, String Supervisor, BigInteger Amount) throws BSDMResourceException;
  /**
   * Approve the requested Refund..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundApproveIn Input Object Key.
   * @param AccountInternalId.
   * @param User.
   * @param Supervisor.
   * @param Amount.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectData approve (BSDMSessionContext context, RefundObjectKeyData refundApproveIn, Integer AccountInternalId, String User, String Supervisor, BigInteger Amount) throws BSDMResourceException;


  /**
   * Approve the requested Refund..
   * Convenience method using default BSDMSessionContext.
   * @param refundApproveIn Input Object Key.
   * @param AccountInternalId.
   * @param User.
   * @param Supervisor.
   * @param Amount.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefundObjectData approve (RefundObjectKeyData refundApproveIn, Integer AccountInternalId, String User, String Supervisor, BigInteger Amount, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Approve the requested Refund..
   * @param context The session context to use when connecting to the APITS server.
   * @param refundApproveIn Input Object Key.
   * @param AccountInternalId.
   * @param User.
   * @param Supervisor.
   * @param Amount.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefundObjectData approve (BSDMSessionContext context, RefundObjectKeyData refundApproveIn, Integer AccountInternalId, String User, String Supervisor, BigInteger Amount, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of the Refund..
   * Can only update AltContactId and AltCurrencyCode, and only when RefundStatus is NEW (0).
   * Convenience method using default BSDMSessionContext.
   * @param refundUpdateIn Input  Object.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectData update (RefundObjectData refundUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of the Refund..
   * Can only update AltContactId and AltCurrencyCode, and only when RefundStatus is NEW (0).
   * @param context The session context to use when connecting to the APITS server.
   * @param refundUpdateIn Input  Object.
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundObjectData update (BSDMSessionContext context, RefundObjectData refundUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of the Refund..
   * Can only update AltContactId and AltCurrencyCode, and only when RefundStatus is NEW (0).
   * Convenience method using default BSDMSessionContext.
   * @param refundUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefundObjectData update (RefundObjectData refundUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of the Refund..
   * Can only update AltContactId and AltCurrencyCode, and only when RefundStatus is NEW (0).
   * @param context The session context to use when connecting to the APITS server.
   * @param refundUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefundObjectData update (BSDMSessionContext context, RefundObjectData refundUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
