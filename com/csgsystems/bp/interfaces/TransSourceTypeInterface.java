
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
public interface TransSourceTypeInterface extends BaliInterface {

  /**
   * Get a unique TransSourceType..
   * Convenience method using default BSDMSessionContext.
   * @param TSGetIn Input Object Key.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransSourceTypeObjectData get (TransSourceTypeObjectKeyData TSGetIn) throws BSDMResourceException;
  /**
   * Get a unique TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSGetIn Input Object Key.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransSourceTypeObjectData get (BSDMSessionContext context, TransSourceTypeObjectKeyData TSGetIn) throws BSDMResourceException;


  /**
   * Get a unique TransSourceType..
   * Convenience method using default BSDMSessionContext.
   * @param TSGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TransSourceTypeObjectData get (TransSourceTypeObjectKeyData TSGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TransSourceTypeObjectData get (BSDMSessionContext context, TransSourceTypeObjectKeyData TSGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find TransSourceType's that match a supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TSFindIn Input Filter Object.
   * @return TransSourceTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransSourceTypeObjectDataList find (TransSourceTypeObjectFilter TSFindIn) throws BSDMResourceException;
  /**
   * Find TransSourceType's that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSFindIn Input Filter Object.
   * @return TransSourceTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransSourceTypeObjectDataList find (BSDMSessionContext context, TransSourceTypeObjectFilter TSFindIn) throws BSDMResourceException;


  /**
   * Find TransSourceType's that match a supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TSFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransSourceTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TransSourceTypeObjectDataList find (TransSourceTypeObjectFilter TSFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find TransSourceType's that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransSourceTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TransSourceTypeObjectDataList find (BSDMSessionContext context, TransSourceTypeObjectFilter TSFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non key fields of a TransSourceType..
   * Convenience method using default BSDMSessionContext.
   * @param TSUpdateIn Input  Object.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransSourceTypeObjectData update (TransSourceTypeObjectData TSUpdateIn) throws BSDMResourceException;
  /**
   * Update the non key fields of a TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSUpdateIn Input  Object.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransSourceTypeObjectData update (BSDMSessionContext context, TransSourceTypeObjectData TSUpdateIn) throws BSDMResourceException;


  /**
   * Update the non key fields of a TransSourceType..
   * Convenience method using default BSDMSessionContext.
   * @param TSUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TransSourceTypeObjectData update (TransSourceTypeObjectData TSUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non key fields of a TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TransSourceTypeObjectData update (BSDMSessionContext context, TransSourceTypeObjectData TSUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a TransSourceType..
   * Convenience method using default BSDMSessionContext.
   * @param TSDeleteIn Input Object Key.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransSourceTypeObjectData delete (TransSourceTypeObjectKeyData TSDeleteIn) throws BSDMResourceException;
  /**
   * Delete a TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSDeleteIn Input Object Key.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransSourceTypeObjectData delete (BSDMSessionContext context, TransSourceTypeObjectKeyData TSDeleteIn) throws BSDMResourceException;


  /**
   * Delete a TransSourceType..
   * Convenience method using default BSDMSessionContext.
   * @param TSDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TransSourceTypeObjectData delete (TransSourceTypeObjectKeyData TSDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TransSourceTypeObjectData delete (BSDMSessionContext context, TransSourceTypeObjectKeyData TSDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new TransSourceType..
   * Convenience method using default BSDMSessionContext.
   * @param TSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransSourceTypeObjectData create (TransSourceTypeObjectData TSCreateIn) throws BSDMResourceException;
  /**
   * Create a new TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransSourceTypeObjectData create (BSDMSessionContext context, TransSourceTypeObjectData TSCreateIn) throws BSDMResourceException;


  /**
   * Create a new TransSourceType..
   * Convenience method using default BSDMSessionContext.
   * @param TSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TransSourceTypeObjectData create (TransSourceTypeObjectData TSCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TransSourceTypeObjectData create (BSDMSessionContext context, TransSourceTypeObjectData TSCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
