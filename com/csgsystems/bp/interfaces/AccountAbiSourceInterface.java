
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
public interface AccountAbiSourceInterface extends BaliInterface {

  /**
   * Get an AccountAbiSource row..
   * Convenience method using default BSDMSessionContext.
   * @param ABIgetIn Input Object Key.
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountAbiSourceObjectData get (AccountAbiSourceObjectKeyData ABIgetIn) throws BSDMResourceException;
  /**
   * Get an AccountAbiSource row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIgetIn Input Object Key.
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountAbiSourceObjectData get (BSDMSessionContext context, AccountAbiSourceObjectKeyData ABIgetIn) throws BSDMResourceException;


  /**
   * Get an AccountAbiSource row..
   * Convenience method using default BSDMSessionContext.
   * @param ABIgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountAbiSourceObjectData get (AccountAbiSourceObjectKeyData ABIgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get an AccountAbiSource row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountAbiSourceObjectData get (BSDMSessionContext context, AccountAbiSourceObjectKeyData ABIgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AccountAbiSource's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ABIfindIn Input Filter Object.
   * @return AccountAbiSourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountAbiSourceObjectDataList find (AccountAbiSourceObjectFilter ABIfindIn) throws BSDMResourceException;
  /**
   * Find AccountAbiSource's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIfindIn Input Filter Object.
   * @return AccountAbiSourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountAbiSourceObjectDataList find (BSDMSessionContext context, AccountAbiSourceObjectFilter ABIfindIn) throws BSDMResourceException;


  /**
   * Find AccountAbiSource's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ABIfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountAbiSourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountAbiSourceObjectDataList find (AccountAbiSourceObjectFilter ABIfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AccountAbiSource's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountAbiSourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountAbiSourceObjectDataList find (BSDMSessionContext context, AccountAbiSourceObjectFilter ABIfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new AccountAbiSource..
   * Convenience method using default BSDMSessionContext.
   * @param ABIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountAbiSourceObjectData create (AccountAbiSourceObjectData ABIcreateIn) throws BSDMResourceException;
  /**
   * Create a new AccountAbiSource..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountAbiSourceObjectData create (BSDMSessionContext context, AccountAbiSourceObjectData ABIcreateIn) throws BSDMResourceException;


  /**
   * Create a new AccountAbiSource..
   * Convenience method using default BSDMSessionContext.
   * @param ABIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountAbiSourceObjectData create (AccountAbiSourceObjectData ABIcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new AccountAbiSource..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountAbiSourceObjectData create (BSDMSessionContext context, AccountAbiSourceObjectData ABIcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of an AccountAbiSource row..
   * Convenience method using default BSDMSessionContext.
   * @param ABIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountAbiSourceObjectData update (AccountAbiSourceObjectData ABIupdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of an AccountAbiSource row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountAbiSourceObjectData update (BSDMSessionContext context, AccountAbiSourceObjectData ABIupdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of an AccountAbiSource row..
   * Convenience method using default BSDMSessionContext.
   * @param ABIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountAbiSourceObjectData update (AccountAbiSourceObjectData ABIupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of an AccountAbiSource row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountAbiSourceObjectData update (BSDMSessionContext context, AccountAbiSourceObjectData ABIupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease an AccountAbiSource row..
   * Convenience method using default BSDMSessionContext.
   * @param ABIdelIn Input Object Key.
   * @param inactive_date (has a default).
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountAbiSourceObjectData delete (AccountAbiSourceObjectKeyData ABIdelIn, Date inactive_date) throws BSDMResourceException;
  /**
   * Cease an AccountAbiSource row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIdelIn Input Object Key.
   * @param inactive_date (has a default).
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountAbiSourceObjectData delete (BSDMSessionContext context, AccountAbiSourceObjectKeyData ABIdelIn, Date inactive_date) throws BSDMResourceException;


  /**
   * Cease an AccountAbiSource row..
   * Convenience method using default BSDMSessionContext.
   * @param ABIdelIn Input Object Key.
   * @param inactive_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountAbiSourceObjectData delete (AccountAbiSourceObjectKeyData ABIdelIn, Date inactive_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease an AccountAbiSource row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIdelIn Input Object Key.
   * @param inactive_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountAbiSourceObjectData delete (BSDMSessionContext context, AccountAbiSourceObjectKeyData ABIdelIn, Date inactive_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease AccountAbiSources that match a supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ABILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param InactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (AccountAbiSourceObjectFilter ABILdelIn, Date InactiveDate) throws BSDMResourceException;
  /**
   * Cease AccountAbiSources that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param InactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, AccountAbiSourceObjectFilter ABILdelIn, Date InactiveDate) throws BSDMResourceException;


  /**
   * Cease AccountAbiSources that match a supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ABILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param InactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (AccountAbiSourceObjectFilter ABILdelIn, Date InactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease AccountAbiSources that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param InactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, AccountAbiSourceObjectFilter ABILdelIn, Date InactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
