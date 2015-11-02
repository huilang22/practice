
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
public interface AccountHqContractInterface extends BaliInterface {

  /**
   * Retrieve one unique AccountHqContract object..
   * Convenience method using default BSDMSessionContext.
   * @param AHCgetIn Input Object Key.
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountHqContractObjectData get (AccountHqContractObjectKeyData AHCgetIn) throws BSDMResourceException;
  /**
   * Retrieve one unique AccountHqContract object..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCgetIn Input Object Key.
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountHqContractObjectData get (BSDMSessionContext context, AccountHqContractObjectKeyData AHCgetIn) throws BSDMResourceException;


  /**
   * Retrieve one unique AccountHqContract object..
   * Convenience method using default BSDMSessionContext.
   * @param AHCgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountHqContractObjectData get (AccountHqContractObjectKeyData AHCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve one unique AccountHqContract object..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountHqContractObjectData get (BSDMSessionContext context, AccountHqContractObjectKeyData AHCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new AccountHqContract..
   * Convenience method using default BSDMSessionContext.
   * @param AHCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Defaulted Fields: StartDt, Exclude.  Derived Fields: StartDt.
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountHqContractObjectData create (AccountHqContractObjectData AHCcreateIn) throws BSDMResourceException;
  /**
   * Create a new AccountHqContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Defaulted Fields: StartDt, Exclude.  Derived Fields: StartDt.
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountHqContractObjectData create (BSDMSessionContext context, AccountHqContractObjectData AHCcreateIn) throws BSDMResourceException;


  /**
   * Create a new AccountHqContract..
   * Convenience method using default BSDMSessionContext.
   * @param AHCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Defaulted Fields: StartDt, Exclude.  Derived Fields: StartDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountHqContractObjectData create (AccountHqContractObjectData AHCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new AccountHqContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Defaulted Fields: StartDt, Exclude.  Derived Fields: StartDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountHqContractObjectData create (BSDMSessionContext context, AccountHqContractObjectData AHCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of an AccountHqContract..
   * Convenience method using default BSDMSessionContext.
   * @param AHCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountHqContractObjectData update (AccountHqContractObjectData AHCupdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of an AccountHqContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountHqContractObjectData update (BSDMSessionContext context, AccountHqContractObjectData AHCupdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of an AccountHqContract..
   * Convenience method using default BSDMSessionContext.
   * @param AHCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountHqContractObjectData update (AccountHqContractObjectData AHCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of an AccountHqContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountHqContractObjectData update (BSDMSessionContext context, AccountHqContractObjectData AHCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease an AccountHqContract row..
   * Convenience method using default BSDMSessionContext.
   * @param AHCdeleteIn Input Object Key.
   * @param AHCInactiveDate (has a default).
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountHqContractObjectData delete (AccountHqContractObjectKeyData AHCdeleteIn, Date AHCInactiveDate) throws BSDMResourceException;
  /**
   * Cease an AccountHqContract row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCdeleteIn Input Object Key.
   * @param AHCInactiveDate (has a default).
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountHqContractObjectData delete (BSDMSessionContext context, AccountHqContractObjectKeyData AHCdeleteIn, Date AHCInactiveDate) throws BSDMResourceException;


  /**
   * Cease an AccountHqContract row..
   * Convenience method using default BSDMSessionContext.
   * @param AHCdeleteIn Input Object Key.
   * @param AHCInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountHqContractObjectData delete (AccountHqContractObjectKeyData AHCdeleteIn, Date AHCInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease an AccountHqContract row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCdeleteIn Input Object Key.
   * @param AHCInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountHqContractObjectData delete (BSDMSessionContext context, AccountHqContractObjectKeyData AHCdeleteIn, Date AHCInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease AccountHqContract's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AHCLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AHCLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (AccountHqContractObjectFilter AHCLdeleteIn, Date AHCLInactiveDate) throws BSDMResourceException;
  /**
   * Cease AccountHqContract's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AHCLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, AccountHqContractObjectFilter AHCLdeleteIn, Date AHCLInactiveDate) throws BSDMResourceException;


  /**
   * Cease AccountHqContract's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AHCLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AHCLInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (AccountHqContractObjectFilter AHCLdeleteIn, Date AHCLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease AccountHqContract's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AHCLInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, AccountHqContractObjectFilter AHCLdeleteIn, Date AHCLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AccountHqContract's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AHCfindIn Input Filter Object.
   * @return AccountHqContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountHqContractObjectDataList find (AccountHqContractObjectFilter AHCfindIn) throws BSDMResourceException;
  /**
   * Find AccountHqContract's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCfindIn Input Filter Object.
   * @return AccountHqContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountHqContractObjectDataList find (BSDMSessionContext context, AccountHqContractObjectFilter AHCfindIn) throws BSDMResourceException;


  /**
   * Find AccountHqContract's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AHCfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountHqContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountHqContractObjectDataList find (AccountHqContractObjectFilter AHCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AccountHqContract's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountHqContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountHqContractObjectDataList find (BSDMSessionContext context, AccountHqContractObjectFilter AHCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
