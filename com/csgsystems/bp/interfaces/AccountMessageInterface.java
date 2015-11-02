
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
public interface AccountMessageInterface extends BaliInterface {

  /**
   * Get an AccountMessage row..
   * Convenience method using default BSDMSessionContext.
   * @param AMgetIn Input Object Key.
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountMessageObjectData get (AccountMessageObjectKeyData AMgetIn) throws BSDMResourceException;
  /**
   * Get an AccountMessage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMgetIn Input Object Key.
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountMessageObjectData get (BSDMSessionContext context, AccountMessageObjectKeyData AMgetIn) throws BSDMResourceException;


  /**
   * Get an AccountMessage row..
   * Convenience method using default BSDMSessionContext.
   * @param AMgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountMessageObjectData get (AccountMessageObjectKeyData AMgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get an AccountMessage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountMessageObjectData get (BSDMSessionContext context, AccountMessageObjectKeyData AMgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AccountMessage's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AMfindIn Input Filter Object.
   * @return AccountMessageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountMessageObjectDataList find (AccountMessageObjectFilter AMfindIn) throws BSDMResourceException;
  /**
   * Find AccountMessage's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMfindIn Input Filter Object.
   * @return AccountMessageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountMessageObjectDataList find (BSDMSessionContext context, AccountMessageObjectFilter AMfindIn) throws BSDMResourceException;


  /**
   * Find AccountMessage's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AMfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountMessageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountMessageObjectDataList find (AccountMessageObjectFilter AMfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AccountMessage's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountMessageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountMessageObjectDataList find (BSDMSessionContext context, AccountMessageObjectFilter AMfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new AccountMessage..
   * Convenience method using default BSDMSessionContext.
   * @param AMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountMessageObjectData create (AccountMessageObjectData AMcreateIn) throws BSDMResourceException;
  /**
   * Create a new AccountMessage..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountMessageObjectData create (BSDMSessionContext context, AccountMessageObjectData AMcreateIn) throws BSDMResourceException;


  /**
   * Create a new AccountMessage..
   * Convenience method using default BSDMSessionContext.
   * @param AMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountMessageObjectData create (AccountMessageObjectData AMcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new AccountMessage..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountMessageObjectData create (BSDMSessionContext context, AccountMessageObjectData AMcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of an AccountMessage row..
   * Convenience method using default BSDMSessionContext.
   * @param AMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountMessageObjectData update (AccountMessageObjectData AMupdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of an AccountMessage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountMessageObjectData update (BSDMSessionContext context, AccountMessageObjectData AMupdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of an AccountMessage row..
   * Convenience method using default BSDMSessionContext.
   * @param AMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountMessageObjectData update (AccountMessageObjectData AMupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of an AccountMessage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountMessageObjectData update (BSDMSessionContext context, AccountMessageObjectData AMupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease an AccountMessage row..
   * Convenience method using default BSDMSessionContext.
   * @param AMdelIn Input Object Key.
   * @param AMDInactiveDate (has a default).
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountMessageObjectData delete (AccountMessageObjectKeyData AMdelIn, Date AMDInactiveDate) throws BSDMResourceException;
  /**
   * Cease an AccountMessage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMdelIn Input Object Key.
   * @param AMDInactiveDate (has a default).
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountMessageObjectData delete (BSDMSessionContext context, AccountMessageObjectKeyData AMdelIn, Date AMDInactiveDate) throws BSDMResourceException;


  /**
   * Cease an AccountMessage row..
   * Convenience method using default BSDMSessionContext.
   * @param AMdelIn Input Object Key.
   * @param AMDInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountMessageObjectData delete (AccountMessageObjectKeyData AMdelIn, Date AMDInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease an AccountMessage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMdelIn Input Object Key.
   * @param AMDInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountMessageObjectData delete (BSDMSessionContext context, AccountMessageObjectKeyData AMdelIn, Date AMDInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease AccountMessages that match a supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AMLdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AMDLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (AccountMessageObjectFilter AMLdelIn, Date AMDLInactiveDate) throws BSDMResourceException;
  /**
   * Cease AccountMessages that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMLdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AMDLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, AccountMessageObjectFilter AMLdelIn, Date AMDLInactiveDate) throws BSDMResourceException;


  /**
   * Cease AccountMessages that match a supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AMLdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AMDLInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (AccountMessageObjectFilter AMLdelIn, Date AMDLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease AccountMessages that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMLdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AMDLInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, AccountMessageObjectFilter AMLdelIn, Date AMDLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
