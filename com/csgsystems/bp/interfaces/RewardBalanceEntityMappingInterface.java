
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
public interface RewardBalanceEntityMappingInterface extends BaliInterface {

  /**
   * Get a unique RewardBalanceEntityMapping..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMGetIn Input Object Key.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceEntityMappingObjectData get (RewardBalanceEntityMappingObjectKeyData RBEMGetIn) throws BSDMResourceException;
  /**
   * Get a unique RewardBalanceEntityMapping..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMGetIn Input Object Key.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceEntityMappingObjectData get (BSDMSessionContext context, RewardBalanceEntityMappingObjectKeyData RBEMGetIn) throws BSDMResourceException;


  /**
   * Get a unique RewardBalanceEntityMapping..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RewardBalanceEntityMappingObjectData get (RewardBalanceEntityMappingObjectKeyData RBEMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique RewardBalanceEntityMapping..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RewardBalanceEntityMappingObjectData get (BSDMSessionContext context, RewardBalanceEntityMappingObjectKeyData RBEMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find RewardBalanceEntityMapping rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMFindIn Input Filter Object.
   * @return RewardBalanceEntityMappingObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceEntityMappingObjectDataList find (RewardBalanceEntityMappingObjectFilter RBEMFindIn) throws BSDMResourceException;
  /**
   * Find RewardBalanceEntityMapping rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMFindIn Input Filter Object.
   * @return RewardBalanceEntityMappingObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceEntityMappingObjectDataList find (BSDMSessionContext context, RewardBalanceEntityMappingObjectFilter RBEMFindIn) throws BSDMResourceException;


  /**
   * Find RewardBalanceEntityMapping rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceEntityMappingObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RewardBalanceEntityMappingObjectDataList find (RewardBalanceEntityMappingObjectFilter RBEMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find RewardBalanceEntityMapping rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceEntityMappingObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RewardBalanceEntityMappingObjectDataList find (BSDMSessionContext context, RewardBalanceEntityMappingObjectFilter RBEMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of an RewardBalanceEntityMapping row..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMUpdateIn Input  Object.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceEntityMappingObjectData update (RewardBalanceEntityMappingObjectData RBEMUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of an RewardBalanceEntityMapping row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMUpdateIn Input  Object.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceEntityMappingObjectData update (BSDMSessionContext context, RewardBalanceEntityMappingObjectData RBEMUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of an RewardBalanceEntityMapping row..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RewardBalanceEntityMappingObjectData update (RewardBalanceEntityMappingObjectData RBEMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of an RewardBalanceEntityMapping row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RewardBalanceEntityMappingObjectData update (BSDMSessionContext context, RewardBalanceEntityMappingObjectData RBEMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a RewardBalanceEntityMapping row..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMDeleteIn Input Object Key.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceEntityMappingObjectData delete (RewardBalanceEntityMappingObjectKeyData RBEMDeleteIn) throws BSDMResourceException;
  /**
   * Delete a RewardBalanceEntityMapping row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMDeleteIn Input Object Key.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceEntityMappingObjectData delete (BSDMSessionContext context, RewardBalanceEntityMappingObjectKeyData RBEMDeleteIn) throws BSDMResourceException;


  /**
   * Delete a RewardBalanceEntityMapping row..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RewardBalanceEntityMappingObjectData delete (RewardBalanceEntityMappingObjectKeyData RBEMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a RewardBalanceEntityMapping row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RewardBalanceEntityMappingObjectData delete (BSDMSessionContext context, RewardBalanceEntityMappingObjectKeyData RBEMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new RewardBalanceEntityMapping..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMCreateIn Input  Object.  Defaulted Fields: TrackingIdServ.  Derived Fields: TrackingId.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceEntityMappingObjectData create (RewardBalanceEntityMappingObjectData RBEMCreateIn) throws BSDMResourceException;
  /**
   * Create a new RewardBalanceEntityMapping..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMCreateIn Input  Object.  Defaulted Fields: TrackingIdServ.  Derived Fields: TrackingId.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceEntityMappingObjectData create (BSDMSessionContext context, RewardBalanceEntityMappingObjectData RBEMCreateIn) throws BSDMResourceException;


  /**
   * Create a new RewardBalanceEntityMapping..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMCreateIn Input  Object.  Defaulted Fields: TrackingIdServ.  Derived Fields: TrackingId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RewardBalanceEntityMappingObjectData create (RewardBalanceEntityMappingObjectData RBEMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new RewardBalanceEntityMapping..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMCreateIn Input  Object.  Defaulted Fields: TrackingIdServ.  Derived Fields: TrackingId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RewardBalanceEntityMappingObjectData create (BSDMSessionContext context, RewardBalanceEntityMappingObjectData RBEMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
