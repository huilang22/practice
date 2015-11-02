
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
public interface LateFeeRateOverridesInterface extends BaliInterface {

  /**
   * Create a LateFeeRateOverrides based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param LFROcIn Input  Object.  Defaulted Fields: GracePeriod, MinBalThresh.
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LateFeeRateOverridesObjectData create (LateFeeRateOverridesObjectData LFROcIn) throws BSDMResourceException;
  /**
   * Create a LateFeeRateOverrides based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROcIn Input  Object.  Defaulted Fields: GracePeriod, MinBalThresh.
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LateFeeRateOverridesObjectData create (BSDMSessionContext context, LateFeeRateOverridesObjectData LFROcIn) throws BSDMResourceException;


  /**
   * Create a LateFeeRateOverrides based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param LFROcIn Input  Object.  Defaulted Fields: GracePeriod, MinBalThresh.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public LateFeeRateOverridesObjectData create (LateFeeRateOverridesObjectData LFROcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a LateFeeRateOverrides based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROcIn Input  Object.  Defaulted Fields: GracePeriod, MinBalThresh.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public LateFeeRateOverridesObjectData create (BSDMSessionContext context, LateFeeRateOverridesObjectData LFROcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields for a row in LateFeeRateOverrides.
   * Convenience method using default BSDMSessionContext.
   * @param LFROuIn Input  Object.
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LateFeeRateOverridesObjectData update (LateFeeRateOverridesObjectData LFROuIn) throws BSDMResourceException;
  /**
   * Update non-key fields for a row in LateFeeRateOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROuIn Input  Object.
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LateFeeRateOverridesObjectData update (BSDMSessionContext context, LateFeeRateOverridesObjectData LFROuIn) throws BSDMResourceException;


  /**
   * Update non-key fields for a row in LateFeeRateOverrides.
   * Convenience method using default BSDMSessionContext.
   * @param LFROuIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public LateFeeRateOverridesObjectData update (LateFeeRateOverridesObjectData LFROuIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields for a row in LateFeeRateOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROuIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public LateFeeRateOverridesObjectData update (BSDMSessionContext context, LateFeeRateOverridesObjectData LFROuIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update Inactive date  for a row in LateFeeRateOverrides.
   * Convenience method using default BSDMSessionContext.
   * @param LFROdIn Input Object Key.
   * @param LFROCeaseDate (has a default).
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LateFeeRateOverridesObjectData delete (LateFeeRateOverridesObjectKeyData LFROdIn, Date LFROCeaseDate) throws BSDMResourceException;
  /**
   * Update Inactive date  for a row in LateFeeRateOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROdIn Input Object Key.
   * @param LFROCeaseDate (has a default).
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LateFeeRateOverridesObjectData delete (BSDMSessionContext context, LateFeeRateOverridesObjectKeyData LFROdIn, Date LFROCeaseDate) throws BSDMResourceException;


  /**
   * Update Inactive date  for a row in LateFeeRateOverrides.
   * Convenience method using default BSDMSessionContext.
   * @param LFROdIn Input Object Key.
   * @param LFROCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public LateFeeRateOverridesObjectData delete (LateFeeRateOverridesObjectKeyData LFROdIn, Date LFROCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update Inactive date  for a row in LateFeeRateOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROdIn Input Object Key.
   * @param LFROCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public LateFeeRateOverridesObjectData delete (BSDMSessionContext context, LateFeeRateOverridesObjectKeyData LFROdIn, Date LFROCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get the unique LateFeeRateOverrides row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param LFROgIn Input Object Key.
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LateFeeRateOverridesObjectData get (LateFeeRateOverridesObjectKeyData LFROgIn) throws BSDMResourceException;
  /**
   * Get the unique LateFeeRateOverrides row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROgIn Input Object Key.
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LateFeeRateOverridesObjectData get (BSDMSessionContext context, LateFeeRateOverridesObjectKeyData LFROgIn) throws BSDMResourceException;


  /**
   * Get the unique LateFeeRateOverrides row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param LFROgIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public LateFeeRateOverridesObjectData get (LateFeeRateOverridesObjectKeyData LFROgIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get the unique LateFeeRateOverrides row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROgIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public LateFeeRateOverridesObjectData get (BSDMSessionContext context, LateFeeRateOverridesObjectKeyData LFROgIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find LateFeeRateOverrides rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param LFROfIn Input Filter Object.
   * @return LateFeeRateOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LateFeeRateOverridesObjectDataList find (LateFeeRateOverridesObjectFilter LFROfIn) throws BSDMResourceException;
  /**
   * Find LateFeeRateOverrides rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROfIn Input Filter Object.
   * @return LateFeeRateOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public LateFeeRateOverridesObjectDataList find (BSDMSessionContext context, LateFeeRateOverridesObjectFilter LFROfIn) throws BSDMResourceException;


  /**
   * Find LateFeeRateOverrides rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param LFROfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LateFeeRateOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public LateFeeRateOverridesObjectDataList find (LateFeeRateOverridesObjectFilter LFROfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find LateFeeRateOverrides rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return LateFeeRateOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public LateFeeRateOverridesObjectDataList find (BSDMSessionContext context, LateFeeRateOverridesObjectFilter LFROfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
