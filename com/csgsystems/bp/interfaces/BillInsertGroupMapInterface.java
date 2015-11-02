
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
public interface BillInsertGroupMapInterface extends BaliInterface {

  /**
   * Retrieve a unique BillInsertGroupMap row..
   * Convenience method using default BSDMSessionContext.
   * @param BIGGetIn Input Object Key.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupMapObjectData get (BillInsertGroupMapObjectKeyData BIGGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique BillInsertGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGGetIn Input Object Key.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupMapObjectData get (BSDMSessionContext context, BillInsertGroupMapObjectKeyData BIGGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique BillInsertGroupMap row..
   * Convenience method using default BSDMSessionContext.
   * @param BIGGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillInsertGroupMapObjectData get (BillInsertGroupMapObjectKeyData BIGGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique BillInsertGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillInsertGroupMapObjectData get (BSDMSessionContext context, BillInsertGroupMapObjectKeyData BIGGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find BillInsertGroupMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BIGFindIn Input Filter Object.
   * @return BillInsertGroupMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupMapObjectDataList find (BillInsertGroupMapObjectFilter BIGFindIn) throws BSDMResourceException;
  /**
   * Find BillInsertGroupMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGFindIn Input Filter Object.
   * @return BillInsertGroupMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupMapObjectDataList find (BSDMSessionContext context, BillInsertGroupMapObjectFilter BIGFindIn) throws BSDMResourceException;


  /**
   * Find BillInsertGroupMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BIGFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillInsertGroupMapObjectDataList find (BillInsertGroupMapObjectFilter BIGFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find BillInsertGroupMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillInsertGroupMapObjectDataList find (BSDMSessionContext context, BillInsertGroupMapObjectFilter BIGFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a BillInsertGroupMap..
   * Convenience method using default BSDMSessionContext.
   * @param BIGUpdateIn Input  Object.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupMapObjectData update (BillInsertGroupMapObjectData BIGUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a BillInsertGroupMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGUpdateIn Input  Object.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupMapObjectData update (BSDMSessionContext context, BillInsertGroupMapObjectData BIGUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a BillInsertGroupMap..
   * Convenience method using default BSDMSessionContext.
   * @param BIGUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillInsertGroupMapObjectData update (BillInsertGroupMapObjectData BIGUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a BillInsertGroupMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillInsertGroupMapObjectData update (BSDMSessionContext context, BillInsertGroupMapObjectData BIGUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a BillInsertGroupMap row..
   * Convenience method using default BSDMSessionContext.
   * @param BIGDeleteIn Input Object Key.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupMapObjectData delete (BillInsertGroupMapObjectKeyData BIGDeleteIn) throws BSDMResourceException;
  /**
   * Delete a BillInsertGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGDeleteIn Input Object Key.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupMapObjectData delete (BSDMSessionContext context, BillInsertGroupMapObjectKeyData BIGDeleteIn) throws BSDMResourceException;


  /**
   * Delete a BillInsertGroupMap row..
   * Convenience method using default BSDMSessionContext.
   * @param BIGDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillInsertGroupMapObjectData delete (BillInsertGroupMapObjectKeyData BIGDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a BillInsertGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillInsertGroupMapObjectData delete (BSDMSessionContext context, BillInsertGroupMapObjectKeyData BIGDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new BillInsertGroupMap row..
   * Convenience method using default BSDMSessionContext.
   * @param BIGCreateIn Input  Object.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupMapObjectData create (BillInsertGroupMapObjectData BIGCreateIn) throws BSDMResourceException;
  /**
   * Create a new BillInsertGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGCreateIn Input  Object.
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupMapObjectData create (BSDMSessionContext context, BillInsertGroupMapObjectData BIGCreateIn) throws BSDMResourceException;


  /**
   * Create a new BillInsertGroupMap row..
   * Convenience method using default BSDMSessionContext.
   * @param BIGCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillInsertGroupMapObjectData create (BillInsertGroupMapObjectData BIGCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new BillInsertGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BIGCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillInsertGroupMapObjectData create (BSDMSessionContext context, BillInsertGroupMapObjectData BIGCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
