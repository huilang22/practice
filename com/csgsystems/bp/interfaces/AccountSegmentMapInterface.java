
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
public interface AccountSegmentMapInterface extends BaliInterface {

  /**
   * Retrieve a unique AccountSegmentMap row..
   * Convenience method using default BSDMSessionContext.
   * @param ASMGetIn Input Object Key.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentMapObjectData get (AccountSegmentMapObjectKeyData ASMGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique AccountSegmentMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMGetIn Input Object Key.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentMapObjectData get (BSDMSessionContext context, AccountSegmentMapObjectKeyData ASMGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique AccountSegmentMap row..
   * Convenience method using default BSDMSessionContext.
   * @param ASMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountSegmentMapObjectData get (AccountSegmentMapObjectKeyData ASMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique AccountSegmentMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountSegmentMapObjectData get (BSDMSessionContext context, AccountSegmentMapObjectKeyData ASMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AccountSegmentMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ASMFindIn Input Filter Object.
   * @return AccountSegmentMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentMapObjectDataList find (AccountSegmentMapObjectFilter ASMFindIn) throws BSDMResourceException;
  /**
   * Find AccountSegmentMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMFindIn Input Filter Object.
   * @return AccountSegmentMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentMapObjectDataList find (BSDMSessionContext context, AccountSegmentMapObjectFilter ASMFindIn) throws BSDMResourceException;


  /**
   * Find AccountSegmentMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ASMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountSegmentMapObjectDataList find (AccountSegmentMapObjectFilter ASMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AccountSegmentMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountSegmentMapObjectDataList find (BSDMSessionContext context, AccountSegmentMapObjectFilter ASMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a AccountSegmentMap..
   * Convenience method using default BSDMSessionContext.
   * @param ASMUpdateIn Input  Object.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentMapObjectData update (AccountSegmentMapObjectData ASMUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a AccountSegmentMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMUpdateIn Input  Object.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentMapObjectData update (BSDMSessionContext context, AccountSegmentMapObjectData ASMUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a AccountSegmentMap..
   * Convenience method using default BSDMSessionContext.
   * @param ASMUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountSegmentMapObjectData update (AccountSegmentMapObjectData ASMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a AccountSegmentMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountSegmentMapObjectData update (BSDMSessionContext context, AccountSegmentMapObjectData ASMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a AccountSegmentMap row..
   * Convenience method using default BSDMSessionContext.
   * @param ASMDeleteIn Input Object Key.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentMapObjectData delete (AccountSegmentMapObjectKeyData ASMDeleteIn) throws BSDMResourceException;
  /**
   * Delete a AccountSegmentMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMDeleteIn Input Object Key.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentMapObjectData delete (BSDMSessionContext context, AccountSegmentMapObjectKeyData ASMDeleteIn) throws BSDMResourceException;


  /**
   * Delete a AccountSegmentMap row..
   * Convenience method using default BSDMSessionContext.
   * @param ASMDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountSegmentMapObjectData delete (AccountSegmentMapObjectKeyData ASMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a AccountSegmentMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountSegmentMapObjectData delete (BSDMSessionContext context, AccountSegmentMapObjectKeyData ASMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new AccountSegmentMap row..
   * Convenience method using default BSDMSessionContext.
   * @param ASMCreateIn Input  Object.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentMapObjectData create (AccountSegmentMapObjectData ASMCreateIn) throws BSDMResourceException;
  /**
   * Create a new AccountSegmentMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMCreateIn Input  Object.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentMapObjectData create (BSDMSessionContext context, AccountSegmentMapObjectData ASMCreateIn) throws BSDMResourceException;


  /**
   * Create a new AccountSegmentMap row..
   * Convenience method using default BSDMSessionContext.
   * @param ASMCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountSegmentMapObjectData create (AccountSegmentMapObjectData ASMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new AccountSegmentMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountSegmentMapObjectData create (BSDMSessionContext context, AccountSegmentMapObjectData ASMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
