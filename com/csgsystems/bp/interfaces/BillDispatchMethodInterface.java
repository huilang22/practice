
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
public interface BillDispatchMethodInterface extends BaliInterface {

  /**
   * Get a BillDispatchMethod..
   * Convenience method using default BSDMSessionContext.
   * @param BDMGetIn Input Object Key.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillDispatchMethodObjectData get (BillDispatchMethodObjectKeyData BDMGetIn) throws BSDMResourceException;
  /**
   * Get a BillDispatchMethod..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMGetIn Input Object Key.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillDispatchMethodObjectData get (BSDMSessionContext context, BillDispatchMethodObjectKeyData BDMGetIn) throws BSDMResourceException;


  /**
   * Get a BillDispatchMethod..
   * Convenience method using default BSDMSessionContext.
   * @param BDMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillDispatchMethodObjectData get (BillDispatchMethodObjectKeyData BDMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a BillDispatchMethod..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillDispatchMethodObjectData get (BSDMSessionContext context, BillDispatchMethodObjectKeyData BDMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find BillDispatchMethod's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BDMFindIn Input Filter Object.
   * @return BillDispatchMethodObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillDispatchMethodObjectDataList find (BillDispatchMethodObjectFilter BDMFindIn) throws BSDMResourceException;
  /**
   * Find BillDispatchMethod's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMFindIn Input Filter Object.
   * @return BillDispatchMethodObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillDispatchMethodObjectDataList find (BSDMSessionContext context, BillDispatchMethodObjectFilter BDMFindIn) throws BSDMResourceException;


  /**
   * Find BillDispatchMethod's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BDMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillDispatchMethodObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillDispatchMethodObjectDataList find (BillDispatchMethodObjectFilter BDMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find BillDispatchMethod's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillDispatchMethodObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillDispatchMethodObjectDataList find (BSDMSessionContext context, BillDispatchMethodObjectFilter BDMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a BillDispatchMethod row..
   * Convenience method using default BSDMSessionContext.
   * @param BDMUpdateIn Input  Object.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillDispatchMethodObjectData update (BillDispatchMethodObjectData BDMUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a BillDispatchMethod row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMUpdateIn Input  Object.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillDispatchMethodObjectData update (BSDMSessionContext context, BillDispatchMethodObjectData BDMUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a BillDispatchMethod row..
   * Convenience method using default BSDMSessionContext.
   * @param BDMUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillDispatchMethodObjectData update (BillDispatchMethodObjectData BDMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a BillDispatchMethod row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillDispatchMethodObjectData update (BSDMSessionContext context, BillDispatchMethodObjectData BDMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a BillDispatchMethod row..
   * Convenience method using default BSDMSessionContext.
   * @param BDMDeleteIn Input Object Key.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillDispatchMethodObjectData delete (BillDispatchMethodObjectKeyData BDMDeleteIn) throws BSDMResourceException;
  /**
   * Delete a BillDispatchMethod row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMDeleteIn Input Object Key.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillDispatchMethodObjectData delete (BSDMSessionContext context, BillDispatchMethodObjectKeyData BDMDeleteIn) throws BSDMResourceException;


  /**
   * Delete a BillDispatchMethod row..
   * Convenience method using default BSDMSessionContext.
   * @param BDMDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillDispatchMethodObjectData delete (BillDispatchMethodObjectKeyData BDMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a BillDispatchMethod row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillDispatchMethodObjectData delete (BSDMSessionContext context, BillDispatchMethodObjectKeyData BDMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new BillDispatchMethod..
   * Convenience method using default BSDMSessionContext.
   * @param BDMCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillDispatchMethodObjectData create (BillDispatchMethodObjectData BDMCreateIn) throws BSDMResourceException;
  /**
   * Create a new BillDispatchMethod..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillDispatchMethodObjectData create (BSDMSessionContext context, BillDispatchMethodObjectData BDMCreateIn) throws BSDMResourceException;


  /**
   * Create a new BillDispatchMethod..
   * Convenience method using default BSDMSessionContext.
   * @param BDMCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillDispatchMethodObjectData create (BillDispatchMethodObjectData BDMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new BillDispatchMethod..
   * @param context The session context to use when connecting to the APITS server.
   * @param BDMCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillDispatchMethodObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillDispatchMethodObjectData create (BSDMSessionContext context, BillDispatchMethodObjectData BDMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
