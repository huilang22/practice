
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
public interface AccountCodeInterface extends BaliInterface {

  /**
   * Retrieve a unique AccountCode row..
   * Convenience method using default BSDMSessionContext.
   * @param CACgetIn Input Object Key.
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeObjectData get (AccountCodeObjectKeyData CACgetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique AccountCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACgetIn Input Object Key.
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeObjectData get (BSDMSessionContext context, AccountCodeObjectKeyData CACgetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique AccountCode row..
   * Convenience method using default BSDMSessionContext.
   * @param CACgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountCodeObjectData get (AccountCodeObjectKeyData CACgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique AccountCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountCodeObjectData get (BSDMSessionContext context, AccountCodeObjectKeyData CACgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AccountCodes that match a filter..
   * Convenience method using default BSDMSessionContext.
   * @param CACfindIn Input Filter Object.
   * @return AccountCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeObjectDataList find (AccountCodeObjectFilter CACfindIn) throws BSDMResourceException;
  /**
   * Find AccountCodes that match a filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACfindIn Input Filter Object.
   * @return AccountCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeObjectDataList find (BSDMSessionContext context, AccountCodeObjectFilter CACfindIn) throws BSDMResourceException;


  /**
   * Find AccountCodes that match a filter..
   * Convenience method using default BSDMSessionContext.
   * @param CACfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountCodeObjectDataList find (AccountCodeObjectFilter CACfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AccountCodes that match a filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountCodeObjectDataList find (BSDMSessionContext context, AccountCodeObjectFilter CACfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new AccountCode..
   * Convenience method using default BSDMSessionContext.
   * @param CACcreateIn Input  Object.
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeObjectData create (AccountCodeObjectData CACcreateIn) throws BSDMResourceException;
  /**
   * Create a new AccountCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACcreateIn Input  Object.
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeObjectData create (BSDMSessionContext context, AccountCodeObjectData CACcreateIn) throws BSDMResourceException;


  /**
   * Create a new AccountCode..
   * Convenience method using default BSDMSessionContext.
   * @param CACcreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountCodeObjectData create (AccountCodeObjectData CACcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new AccountCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACcreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountCodeObjectData create (BSDMSessionContext context, AccountCodeObjectData CACcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of an AccountCode row..
   * Convenience method using default BSDMSessionContext.
   * @param CACupdateIn Input  Object.
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeObjectData update (AccountCodeObjectData CACupdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of an AccountCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACupdateIn Input  Object.
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeObjectData update (BSDMSessionContext context, AccountCodeObjectData CACupdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of an AccountCode row..
   * Convenience method using default BSDMSessionContext.
   * @param CACupdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountCodeObjectData update (AccountCodeObjectData CACupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of an AccountCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACupdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountCodeObjectData update (BSDMSessionContext context, AccountCodeObjectData CACupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete an AccountCode row..
   * Convenience method using default BSDMSessionContext.
   * @param CACdeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void delete (AccountCodeObjectKeyData CACdeleteIn) throws BSDMResourceException;
  /**
   * Delete an AccountCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACdeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void delete (BSDMSessionContext context, AccountCodeObjectKeyData CACdeleteIn) throws BSDMResourceException;


  /**
   * Delete an AccountCode row..
   * Convenience method using default BSDMSessionContext.
   * @param CACdeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void delete (AccountCodeObjectKeyData CACdeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete an AccountCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACdeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void delete (BSDMSessionContext context, AccountCodeObjectKeyData CACdeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete AccountCodes that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CACLdeleteIn Input Filter Object.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (AccountCodeObjectFilter CACLdeleteIn) throws BSDMResourceException;
  /**
   * Delete AccountCodes that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACLdeleteIn Input Filter Object.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, AccountCodeObjectFilter CACLdeleteIn) throws BSDMResourceException;


  /**
   * Delete AccountCodes that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CACLdeleteIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (AccountCodeObjectFilter CACLdeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete AccountCodes that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACLdeleteIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, AccountCodeObjectFilter CACLdeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
