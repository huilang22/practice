
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
public interface BonusPointTransTypeInterface extends BaliInterface {

  /**
   * Get a Bonus Point Transaction Type object..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTGetIn Input Object Key.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointTransTypeObjectData get (BonusPointTransTypeObjectKeyData BPTTGetIn) throws BSDMResourceException;
  /**
   * Get a Bonus Point Transaction Type object..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTGetIn Input Object Key.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointTransTypeObjectData get (BSDMSessionContext context, BonusPointTransTypeObjectKeyData BPTTGetIn) throws BSDMResourceException;


  /**
   * Get a Bonus Point Transaction Type object..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BonusPointTransTypeObjectData get (BonusPointTransTypeObjectKeyData BPTTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a Bonus Point Transaction Type object..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BonusPointTransTypeObjectData get (BSDMSessionContext context, BonusPointTransTypeObjectKeyData BPTTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find BonusPointTransType's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTFindIn Input Filter Object.
   * @return BonusPointTransTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointTransTypeObjectDataList find (BonusPointTransTypeObjectFilter BPTTFindIn) throws BSDMResourceException;
  /**
   * Find BonusPointTransType's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTFindIn Input Filter Object.
   * @return BonusPointTransTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointTransTypeObjectDataList find (BSDMSessionContext context, BonusPointTransTypeObjectFilter BPTTFindIn) throws BSDMResourceException;


  /**
   * Find BonusPointTransType's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointTransTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BonusPointTransTypeObjectDataList find (BonusPointTransTypeObjectFilter BPTTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find BonusPointTransType's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointTransTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BonusPointTransTypeObjectDataList find (BSDMSessionContext context, BonusPointTransTypeObjectFilter BPTTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields for the BonusPointTransType row..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTUpdateIn Input  Object.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointTransTypeObjectData update (BonusPointTransTypeObjectData BPTTUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields for the BonusPointTransType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTUpdateIn Input  Object.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointTransTypeObjectData update (BSDMSessionContext context, BonusPointTransTypeObjectData BPTTUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields for the BonusPointTransType row..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BonusPointTransTypeObjectData update (BonusPointTransTypeObjectData BPTTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields for the BonusPointTransType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BonusPointTransTypeObjectData update (BSDMSessionContext context, BonusPointTransTypeObjectData BPTTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a BonusPointTransType row..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTDeleteIn Input Object Key.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointTransTypeObjectData delete (BonusPointTransTypeObjectKeyData BPTTDeleteIn) throws BSDMResourceException;
  /**
   * Delete a BonusPointTransType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTDeleteIn Input Object Key.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointTransTypeObjectData delete (BSDMSessionContext context, BonusPointTransTypeObjectKeyData BPTTDeleteIn) throws BSDMResourceException;


  /**
   * Delete a BonusPointTransType row..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BonusPointTransTypeObjectData delete (BonusPointTransTypeObjectKeyData BPTTDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a BonusPointTransType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BonusPointTransTypeObjectData delete (BSDMSessionContext context, BonusPointTransTypeObjectKeyData BPTTDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new BonusPointTransType..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointTransTypeObjectData create (BonusPointTransTypeObjectData BPTTCreateIn) throws BSDMResourceException;
  /**
   * Create a new BonusPointTransType..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointTransTypeObjectData create (BSDMSessionContext context, BonusPointTransTypeObjectData BPTTCreateIn) throws BSDMResourceException;


  /**
   * Create a new BonusPointTransType..
   * Convenience method using default BSDMSessionContext.
   * @param BPTTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BonusPointTransTypeObjectData create (BonusPointTransTypeObjectData BPTTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new BonusPointTransType..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPTTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointTransTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BonusPointTransTypeObjectData create (BSDMSessionContext context, BonusPointTransTypeObjectData BPTTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
