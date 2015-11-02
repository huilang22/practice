
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
public interface AdjustmentReasonInterface extends BaliInterface {

  /**
   * Get a unique AdjustmentReason..
   * Convenience method using default BSDMSessionContext.
   * @param ARGetIn Input Object Key.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentReasonObjectData get (AdjustmentReasonObjectKeyData ARGetIn) throws BSDMResourceException;
  /**
   * Get a unique AdjustmentReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARGetIn Input Object Key.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentReasonObjectData get (BSDMSessionContext context, AdjustmentReasonObjectKeyData ARGetIn) throws BSDMResourceException;


  /**
   * Get a unique AdjustmentReason..
   * Convenience method using default BSDMSessionContext.
   * @param ARGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentReasonObjectData get (AdjustmentReasonObjectKeyData ARGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique AdjustmentReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentReasonObjectData get (BSDMSessionContext context, AdjustmentReasonObjectKeyData ARGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AdjustmentReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ARFindIn Input Filter Object.
   * @return AdjustmentReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentReasonObjectDataList find (AdjustmentReasonObjectFilter ARFindIn) throws BSDMResourceException;
  /**
   * Find AdjustmentReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARFindIn Input Filter Object.
   * @return AdjustmentReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentReasonObjectDataList find (BSDMSessionContext context, AdjustmentReasonObjectFilter ARFindIn) throws BSDMResourceException;


  /**
   * Find AdjustmentReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ARFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentReasonObjectDataList find (AdjustmentReasonObjectFilter ARFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AdjustmentReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentReasonObjectDataList find (BSDMSessionContext context, AdjustmentReasonObjectFilter ARFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of an AdjustmentReason object..
   * Convenience method using default BSDMSessionContext.
   * @param ARUpdateIn Input  Object.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentReasonObjectData update (AdjustmentReasonObjectData ARUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of an AdjustmentReason object..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARUpdateIn Input  Object.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentReasonObjectData update (BSDMSessionContext context, AdjustmentReasonObjectData ARUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of an AdjustmentReason object..
   * Convenience method using default BSDMSessionContext.
   * @param ARUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentReasonObjectData update (AdjustmentReasonObjectData ARUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of an AdjustmentReason object..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentReasonObjectData update (BSDMSessionContext context, AdjustmentReasonObjectData ARUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete an AdjustmentReason..
   * Convenience method using default BSDMSessionContext.
   * @param ARDeleteIn Input Object Key.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentReasonObjectData delete (AdjustmentReasonObjectKeyData ARDeleteIn) throws BSDMResourceException;
  /**
   * Delete an AdjustmentReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARDeleteIn Input Object Key.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentReasonObjectData delete (BSDMSessionContext context, AdjustmentReasonObjectKeyData ARDeleteIn) throws BSDMResourceException;


  /**
   * Delete an AdjustmentReason..
   * Convenience method using default BSDMSessionContext.
   * @param ARDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentReasonObjectData delete (AdjustmentReasonObjectKeyData ARDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete an AdjustmentReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentReasonObjectData delete (BSDMSessionContext context, AdjustmentReasonObjectKeyData ARDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create an AdjustmentReason..
   * Convenience method using default BSDMSessionContext.
   * @param ARCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentReasonObjectData create (AdjustmentReasonObjectData ARCreateIn) throws BSDMResourceException;
  /**
   * Create an AdjustmentReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentReasonObjectData create (BSDMSessionContext context, AdjustmentReasonObjectData ARCreateIn) throws BSDMResourceException;


  /**
   * Create an AdjustmentReason..
   * Convenience method using default BSDMSessionContext.
   * @param ARCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentReasonObjectData create (AdjustmentReasonObjectData ARCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create an AdjustmentReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentReasonObjectData create (BSDMSessionContext context, AdjustmentReasonObjectData ARCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
