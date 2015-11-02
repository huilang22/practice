
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
public interface RefundReasonInterface extends BaliInterface {

  /**
   * Get a unique RefundReason..
   * Convenience method using default BSDMSessionContext.
   * @param RRGetIn Input Object Key.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundReasonObjectData get (RefundReasonObjectKeyData RRGetIn) throws BSDMResourceException;
  /**
   * Get a unique RefundReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRGetIn Input Object Key.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundReasonObjectData get (BSDMSessionContext context, RefundReasonObjectKeyData RRGetIn) throws BSDMResourceException;


  /**
   * Get a unique RefundReason..
   * Convenience method using default BSDMSessionContext.
   * @param RRGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefundReasonObjectData get (RefundReasonObjectKeyData RRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique RefundReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefundReasonObjectData get (BSDMSessionContext context, RefundReasonObjectKeyData RRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find RefundReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RRFindIn Input Filter Object.
   * @return RefundReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundReasonObjectDataList find (RefundReasonObjectFilter RRFindIn) throws BSDMResourceException;
  /**
   * Find RefundReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRFindIn Input Filter Object.
   * @return RefundReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundReasonObjectDataList find (BSDMSessionContext context, RefundReasonObjectFilter RRFindIn) throws BSDMResourceException;


  /**
   * Find RefundReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefundReasonObjectDataList find (RefundReasonObjectFilter RRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find RefundReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefundReasonObjectDataList find (BSDMSessionContext context, RefundReasonObjectFilter RRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of a RefundReason row..
   * Convenience method using default BSDMSessionContext.
   * @param RRUpdateIn Input  Object.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundReasonObjectData update (RefundReasonObjectData RRUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of a RefundReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRUpdateIn Input  Object.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundReasonObjectData update (BSDMSessionContext context, RefundReasonObjectData RRUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of a RefundReason row..
   * Convenience method using default BSDMSessionContext.
   * @param RRUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefundReasonObjectData update (RefundReasonObjectData RRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of a RefundReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefundReasonObjectData update (BSDMSessionContext context, RefundReasonObjectData RRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a RefundReason row..
   * Convenience method using default BSDMSessionContext.
   * @param RRDeleteIn Input Object Key.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundReasonObjectData delete (RefundReasonObjectKeyData RRDeleteIn) throws BSDMResourceException;
  /**
   * Delete a RefundReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRDeleteIn Input Object Key.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundReasonObjectData delete (BSDMSessionContext context, RefundReasonObjectKeyData RRDeleteIn) throws BSDMResourceException;


  /**
   * Delete a RefundReason row..
   * Convenience method using default BSDMSessionContext.
   * @param RRDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefundReasonObjectData delete (RefundReasonObjectKeyData RRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a RefundReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefundReasonObjectData delete (BSDMSessionContext context, RefundReasonObjectKeyData RRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new RefundReason..
   * Convenience method using default BSDMSessionContext.
   * @param RRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundReasonObjectData create (RefundReasonObjectData RRCreateIn) throws BSDMResourceException;
  /**
   * Create a new RefundReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefundReasonObjectData create (BSDMSessionContext context, RefundReasonObjectData RRCreateIn) throws BSDMResourceException;


  /**
   * Create a new RefundReason..
   * Convenience method using default BSDMSessionContext.
   * @param RRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefundReasonObjectData create (RefundReasonObjectData RRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new RefundReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefundReasonObjectData create (BSDMSessionContext context, RefundReasonObjectData RRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
