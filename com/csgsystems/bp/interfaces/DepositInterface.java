
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
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface DepositInterface extends BaliInterface {

  /**
   * Retrieve a Deposit based upon its key..
   * Convenience method using default BSDMSessionContext.
   * @param depositGetIn Input Object Key.
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositObjectData get (DepositObjectKeyData depositGetIn) throws BSDMResourceException;
  /**
   * Retrieve a Deposit based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositGetIn Input Object Key.
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositObjectData get (BSDMSessionContext context, DepositObjectKeyData depositGetIn) throws BSDMResourceException;


  /**
   * Retrieve a Deposit based upon its key..
   * Convenience method using default BSDMSessionContext.
   * @param depositGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DepositObjectData get (DepositObjectKeyData depositGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a Deposit based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DepositObjectData get (BSDMSessionContext context, DepositObjectKeyData depositGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Deposits that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param depositFindIn Input Filter Object.
   * @return DepositObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositObjectDataList find (DepositObjectFilter depositFindIn) throws BSDMResourceException;
  /**
   * Find Deposits that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositFindIn Input Filter Object.
   * @return DepositObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositObjectDataList find (BSDMSessionContext context, DepositObjectFilter depositFindIn) throws BSDMResourceException;


  /**
   * Find Deposits that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param depositFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DepositObjectDataList find (DepositObjectFilter depositFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Deposits that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DepositObjectDataList find (BSDMSessionContext context, DepositObjectFilter depositFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new Deposit..
   * Convenience method using default BSDMSessionContext.
   * @param depositCreateIn Input  Object.  Read-Only fields: RefundType, ReasonCode, ChgWho, ChgDate.  Derived Fields: TrackingId, TrackingIdServ, ChgDate, ChgWho.
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositObjectData create (DepositObjectData depositCreateIn) throws BSDMResourceException;
  /**
   * Create a new Deposit..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositCreateIn Input  Object.  Read-Only fields: RefundType, ReasonCode, ChgWho, ChgDate.  Derived Fields: TrackingId, TrackingIdServ, ChgDate, ChgWho.
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositObjectData create (BSDMSessionContext context, DepositObjectData depositCreateIn) throws BSDMResourceException;


  /**
   * Create a new Deposit..
   * Convenience method using default BSDMSessionContext.
   * @param depositCreateIn Input  Object.  Read-Only fields: RefundType, ReasonCode, ChgWho, ChgDate.  Derived Fields: TrackingId, TrackingIdServ, ChgDate, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DepositObjectData create (DepositObjectData depositCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Deposit..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositCreateIn Input  Object.  Read-Only fields: RefundType, ReasonCode, ChgWho, ChgDate.  Derived Fields: TrackingId, TrackingIdServ, ChgDate, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DepositObjectData create (BSDMSessionContext context, DepositObjectData depositCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Return the Account's Deposit..
   * Returns a Deposit.  Also creates a refund payment if refund_type is IN (1,2,3)..
   * Convenience method using default BSDMSessionContext.
   * @param depositReturnIn Input  Object.  Read-Only fields: AccountInternalId, DepositType, DateReceived, DepositAmount, CurrencyCode, ChgWho, ChgDate.  Defaulted Fields: DateReturned.  Derived Fields: ChgDate, ChgWho.
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositObjectData depositReturn (DepositObjectData depositReturnIn) throws BSDMResourceException;
  /**
   * Return the Account's Deposit..
   * Returns a Deposit.  Also creates a refund payment if refund_type is IN (1,2,3)..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositReturnIn Input  Object.  Read-Only fields: AccountInternalId, DepositType, DateReceived, DepositAmount, CurrencyCode, ChgWho, ChgDate.  Defaulted Fields: DateReturned.  Derived Fields: ChgDate, ChgWho.
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositObjectData depositReturn (BSDMSessionContext context, DepositObjectData depositReturnIn) throws BSDMResourceException;


  /**
   * Return the Account's Deposit..
   * Returns a Deposit.  Also creates a refund payment if refund_type is IN (1,2,3)..
   * Convenience method using default BSDMSessionContext.
   * @param depositReturnIn Input  Object.  Read-Only fields: AccountInternalId, DepositType, DateReceived, DepositAmount, CurrencyCode, ChgWho, ChgDate.  Defaulted Fields: DateReturned.  Derived Fields: ChgDate, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DepositObjectData depositReturn (DepositObjectData depositReturnIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Return the Account's Deposit..
   * Returns a Deposit.  Also creates a refund payment if refund_type is IN (1,2,3)..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositReturnIn Input  Object.  Read-Only fields: AccountInternalId, DepositType, DateReceived, DepositAmount, CurrencyCode, ChgWho, ChgDate.  Defaulted Fields: DateReturned.  Derived Fields: ChgDate, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DepositObjectData depositReturn (BSDMSessionContext context, DepositObjectData depositReturnIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
