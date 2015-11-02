
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
public interface AccountInsertInterface extends BaliInterface {

  /**
   * Get an AccountInsert..
   * Convenience method using default BSDMSessionContext.
   * @param AIgetIn Input Object Key.
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountInsertObjectData get (AccountInsertObjectKeyData AIgetIn) throws BSDMResourceException;
  /**
   * Get an AccountInsert..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIgetIn Input Object Key.
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountInsertObjectData get (BSDMSessionContext context, AccountInsertObjectKeyData AIgetIn) throws BSDMResourceException;


  /**
   * Get an AccountInsert..
   * Convenience method using default BSDMSessionContext.
   * @param AIgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountInsertObjectData get (AccountInsertObjectKeyData AIgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get an AccountInsert..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountInsertObjectData get (BSDMSessionContext context, AccountInsertObjectKeyData AIgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AccountInsert's based on the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AIfindIn Input Filter Object.
   * @return AccountInsertObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountInsertObjectDataList find (AccountInsertObjectFilter AIfindIn) throws BSDMResourceException;
  /**
   * Find AccountInsert's based on the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIfindIn Input Filter Object.
   * @return AccountInsertObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountInsertObjectDataList find (BSDMSessionContext context, AccountInsertObjectFilter AIfindIn) throws BSDMResourceException;


  /**
   * Find AccountInsert's based on the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AIfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountInsertObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountInsertObjectDataList find (AccountInsertObjectFilter AIfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AccountInsert's based on the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountInsertObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountInsertObjectDataList find (BSDMSessionContext context, AccountInsertObjectFilter AIfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new AccountInsert for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param AIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountInsertObjectData create (AccountInsertObjectData AIcreateIn) throws BSDMResourceException;
  /**
   * Create a new AccountInsert for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountInsertObjectData create (BSDMSessionContext context, AccountInsertObjectData AIcreateIn) throws BSDMResourceException;


  /**
   * Create a new AccountInsert for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param AIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountInsertObjectData create (AccountInsertObjectData AIcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new AccountInsert for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountInsertObjectData create (BSDMSessionContext context, AccountInsertObjectData AIcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields for an AccountInsert row..
   * Convenience method using default BSDMSessionContext.
   * @param AIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountInsertObjectData update (AccountInsertObjectData AIupdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields for an AccountInsert row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountInsertObjectData update (BSDMSessionContext context, AccountInsertObjectData AIupdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields for an AccountInsert row..
   * Convenience method using default BSDMSessionContext.
   * @param AIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountInsertObjectData update (AccountInsertObjectData AIupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields for an AccountInsert row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountInsertObjectData update (BSDMSessionContext context, AccountInsertObjectData AIupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease an AccountInsert row..
   * Convenience method using default BSDMSessionContext.
   * @param AIdelIn Input Object Key.
   * @param AIDInactiveDate (has a default).
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountInsertObjectData delete (AccountInsertObjectKeyData AIdelIn, Date AIDInactiveDate) throws BSDMResourceException;
  /**
   * Cease an AccountInsert row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIdelIn Input Object Key.
   * @param AIDInactiveDate (has a default).
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountInsertObjectData delete (BSDMSessionContext context, AccountInsertObjectKeyData AIdelIn, Date AIDInactiveDate) throws BSDMResourceException;


  /**
   * Cease an AccountInsert row..
   * Convenience method using default BSDMSessionContext.
   * @param AIdelIn Input Object Key.
   * @param AIDInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountInsertObjectData delete (AccountInsertObjectKeyData AIdelIn, Date AIDInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease an AccountInsert row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIdelIn Input Object Key.
   * @param AIDInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountInsertObjectData delete (BSDMSessionContext context, AccountInsertObjectKeyData AIdelIn, Date AIDInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease AccountInserts that match a supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AIDLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (AccountInsertObjectFilter AILdelIn, Date AIDLInactiveDate) throws BSDMResourceException;
  /**
   * Cease AccountInserts that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AIDLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, AccountInsertObjectFilter AILdelIn, Date AIDLInactiveDate) throws BSDMResourceException;


  /**
   * Cease AccountInserts that match a supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AIDLInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (AccountInsertObjectFilter AILdelIn, Date AIDLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease AccountInserts that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AIDLInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, AccountInsertObjectFilter AILdelIn, Date AIDLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
