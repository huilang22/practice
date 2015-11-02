
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
public interface DepositTypeInterface extends BaliInterface {

  /**
   * Retrieve the DepositType for the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param DTGetIn Input Object Key.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositTypeObjectData get (DepositTypeObjectKeyData DTGetIn) throws BSDMResourceException;
  /**
   * Retrieve the DepositType for the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTGetIn Input Object Key.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositTypeObjectData get (BSDMSessionContext context, DepositTypeObjectKeyData DTGetIn) throws BSDMResourceException;


  /**
   * Retrieve the DepositType for the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param DTGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DepositTypeObjectData get (DepositTypeObjectKeyData DTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve the DepositType for the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DepositTypeObjectData get (BSDMSessionContext context, DepositTypeObjectKeyData DTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find DepositType's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param DTFindIn Input Filter Object.
   * @return DepositTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositTypeObjectDataList find (DepositTypeObjectFilter DTFindIn) throws BSDMResourceException;
  /**
   * Find DepositType's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTFindIn Input Filter Object.
   * @return DepositTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositTypeObjectDataList find (BSDMSessionContext context, DepositTypeObjectFilter DTFindIn) throws BSDMResourceException;


  /**
   * Find DepositType's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param DTFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DepositTypeObjectDataList find (DepositTypeObjectFilter DTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find DepositType's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DepositTypeObjectDataList find (BSDMSessionContext context, DepositTypeObjectFilter DTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non key fields for a DepositType row..
   * Convenience method using default BSDMSessionContext.
   * @param DTUpdateIn Input  Object.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositTypeObjectData update (DepositTypeObjectData DTUpdateIn) throws BSDMResourceException;
  /**
   * Update the non key fields for a DepositType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTUpdateIn Input  Object.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositTypeObjectData update (BSDMSessionContext context, DepositTypeObjectData DTUpdateIn) throws BSDMResourceException;


  /**
   * Update the non key fields for a DepositType row..
   * Convenience method using default BSDMSessionContext.
   * @param DTUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DepositTypeObjectData update (DepositTypeObjectData DTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non key fields for a DepositType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DepositTypeObjectData update (BSDMSessionContext context, DepositTypeObjectData DTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete this DepositType row..
   * Convenience method using default BSDMSessionContext.
   * @param DTDeleteIn Input Object Key.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositTypeObjectData delete (DepositTypeObjectKeyData DTDeleteIn) throws BSDMResourceException;
  /**
   * Delete this DepositType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTDeleteIn Input Object Key.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositTypeObjectData delete (BSDMSessionContext context, DepositTypeObjectKeyData DTDeleteIn) throws BSDMResourceException;


  /**
   * Delete this DepositType row..
   * Convenience method using default BSDMSessionContext.
   * @param DTDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DepositTypeObjectData delete (DepositTypeObjectKeyData DTDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete this DepositType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DepositTypeObjectData delete (BSDMSessionContext context, DepositTypeObjectKeyData DTDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new DepositType..
   * Convenience method using default BSDMSessionContext.
   * @param DTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositTypeObjectData create (DepositTypeObjectData DTCreateIn) throws BSDMResourceException;
  /**
   * Create a new DepositType..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public DepositTypeObjectData create (BSDMSessionContext context, DepositTypeObjectData DTCreateIn) throws BSDMResourceException;


  /**
   * Create a new DepositType..
   * Convenience method using default BSDMSessionContext.
   * @param DTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public DepositTypeObjectData create (DepositTypeObjectData DTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new DepositType..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public DepositTypeObjectData create (BSDMSessionContext context, DepositTypeObjectData DTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
