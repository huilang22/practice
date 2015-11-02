
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
public interface DiscReasonInterface extends BaliInterface {

  /**
   * Get the DiscReason for the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param DRGetIn Input Object Key.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DiscReasonObjectData get (DiscReasonObjectKeyData DRGetIn) throws BSDMResourceException;
  /**
   * Get the DiscReason for the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRGetIn Input Object Key.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DiscReasonObjectData get (BSDMSessionContext context, DiscReasonObjectKeyData DRGetIn) throws BSDMResourceException;


  /**
   * Get the DiscReason for the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param DRGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DiscReasonObjectData get (DiscReasonObjectKeyData DRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get the DiscReason for the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DiscReasonObjectData get (BSDMSessionContext context, DiscReasonObjectKeyData DRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find DiscReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param DRFindIn Input Filter Object.
   * @return DiscReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DiscReasonObjectDataList find (DiscReasonObjectFilter DRFindIn) throws BSDMResourceException;
  /**
   * Find DiscReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRFindIn Input Filter Object.
   * @return DiscReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DiscReasonObjectDataList find (BSDMSessionContext context, DiscReasonObjectFilter DRFindIn) throws BSDMResourceException;


  /**
   * Find DiscReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param DRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DiscReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DiscReasonObjectDataList find (DiscReasonObjectFilter DRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find DiscReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DiscReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DiscReasonObjectDataList find (BSDMSessionContext context, DiscReasonObjectFilter DRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields for this DiscReason row..
   * Convenience method using default BSDMSessionContext.
   * @param DRUpdateIn Input  Object.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DiscReasonObjectData update (DiscReasonObjectData DRUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields for this DiscReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRUpdateIn Input  Object.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DiscReasonObjectData update (BSDMSessionContext context, DiscReasonObjectData DRUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields for this DiscReason row..
   * Convenience method using default BSDMSessionContext.
   * @param DRUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DiscReasonObjectData update (DiscReasonObjectData DRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields for this DiscReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DiscReasonObjectData update (BSDMSessionContext context, DiscReasonObjectData DRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete the DiscReason row..
   * Convenience method using default BSDMSessionContext.
   * @param DRDeleteIn Input Object Key.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DiscReasonObjectData delete (DiscReasonObjectKeyData DRDeleteIn) throws BSDMResourceException;
  /**
   * Delete the DiscReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRDeleteIn Input Object Key.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DiscReasonObjectData delete (BSDMSessionContext context, DiscReasonObjectKeyData DRDeleteIn) throws BSDMResourceException;


  /**
   * Delete the DiscReason row..
   * Convenience method using default BSDMSessionContext.
   * @param DRDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DiscReasonObjectData delete (DiscReasonObjectKeyData DRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete the DiscReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DiscReasonObjectData delete (BSDMSessionContext context, DiscReasonObjectKeyData DRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new DiscReason row..
   * Convenience method using default BSDMSessionContext.
   * @param DRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DiscReasonObjectData create (DiscReasonObjectData DRCreateIn) throws BSDMResourceException;
  /**
   * Create a new DiscReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DiscReasonObjectData create (BSDMSessionContext context, DiscReasonObjectData DRCreateIn) throws BSDMResourceException;


  /**
   * Create a new DiscReason row..
   * Convenience method using default BSDMSessionContext.
   * @param DRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DiscReasonObjectData create (DiscReasonObjectData DRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new DiscReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DiscReasonObjectData create (BSDMSessionContext context, DiscReasonObjectData DRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
