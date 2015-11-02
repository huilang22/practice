
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
public interface RewardBalanceInterface extends BaliInterface {

  /**
   * Get a unique RewardBalance..
   * Convenience method using default BSDMSessionContext.
   * @param RBIGetIn Input Object Key.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceObjectData get (RewardBalanceObjectKeyData RBIGetIn) throws BSDMResourceException;
  /**
   * Get a unique RewardBalance..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIGetIn Input Object Key.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceObjectData get (BSDMSessionContext context, RewardBalanceObjectKeyData RBIGetIn) throws BSDMResourceException;


  /**
   * Get a unique RewardBalance..
   * Convenience method using default BSDMSessionContext.
   * @param RBIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RewardBalanceObjectData get (RewardBalanceObjectKeyData RBIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique RewardBalance..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RewardBalanceObjectData get (BSDMSessionContext context, RewardBalanceObjectKeyData RBIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find RewardBalance rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RBIFindIn Input Filter Object.
   * @return RewardBalanceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceObjectDataList find (RewardBalanceObjectFilter RBIFindIn) throws BSDMResourceException;
  /**
   * Find RewardBalance rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIFindIn Input Filter Object.
   * @return RewardBalanceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceObjectDataList find (BSDMSessionContext context, RewardBalanceObjectFilter RBIFindIn) throws BSDMResourceException;


  /**
   * Find RewardBalance rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RBIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RewardBalanceObjectDataList find (RewardBalanceObjectFilter RBIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find RewardBalance rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RewardBalanceObjectDataList find (BSDMSessionContext context, RewardBalanceObjectFilter RBIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of an RewardBalance row..
   * Convenience method using default BSDMSessionContext.
   * @param RBIUpdateIn Input  Object.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceObjectData update (RewardBalanceObjectData RBIUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of an RewardBalance row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIUpdateIn Input  Object.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceObjectData update (BSDMSessionContext context, RewardBalanceObjectData RBIUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of an RewardBalance row..
   * Convenience method using default BSDMSessionContext.
   * @param RBIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RewardBalanceObjectData update (RewardBalanceObjectData RBIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of an RewardBalance row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RewardBalanceObjectData update (BSDMSessionContext context, RewardBalanceObjectData RBIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a RewardBalance row..
   * Convenience method using default BSDMSessionContext.
   * @param RBIDeleteIn Input Object Key.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceObjectData delete (RewardBalanceObjectKeyData RBIDeleteIn) throws BSDMResourceException;
  /**
   * Delete a RewardBalance row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIDeleteIn Input Object Key.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceObjectData delete (BSDMSessionContext context, RewardBalanceObjectKeyData RBIDeleteIn) throws BSDMResourceException;


  /**
   * Delete a RewardBalance row..
   * Convenience method using default BSDMSessionContext.
   * @param RBIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RewardBalanceObjectData delete (RewardBalanceObjectKeyData RBIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a RewardBalance row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RewardBalanceObjectData delete (BSDMSessionContext context, RewardBalanceObjectKeyData RBIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new RewardBalance..
   * Convenience method using default BSDMSessionContext.
   * @param RBICreateIn Input  Object.  Defaulted Fields: BalanceType, IsInternal.  Derived Fields: RewardBalanceId.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceObjectData create (RewardBalanceObjectData RBICreateIn) throws BSDMResourceException;
  /**
   * Create a new RewardBalance..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBICreateIn Input  Object.  Defaulted Fields: BalanceType, IsInternal.  Derived Fields: RewardBalanceId.
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RewardBalanceObjectData create (BSDMSessionContext context, RewardBalanceObjectData RBICreateIn) throws BSDMResourceException;


  /**
   * Create a new RewardBalance..
   * Convenience method using default BSDMSessionContext.
   * @param RBICreateIn Input  Object.  Defaulted Fields: BalanceType, IsInternal.  Derived Fields: RewardBalanceId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RewardBalanceObjectData create (RewardBalanceObjectData RBICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new RewardBalance..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBICreateIn Input  Object.  Defaulted Fields: BalanceType, IsInternal.  Derived Fields: RewardBalanceId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RewardBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RewardBalanceObjectData create (BSDMSessionContext context, RewardBalanceObjectData RBICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
