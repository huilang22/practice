
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
public interface FranchiseCodeInterface extends BaliInterface {

  /**
   * Get a unique FranchiseCode row..
   * Convenience method using default BSDMSessionContext.
   * @param FCGetIn Input Object Key.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public FranchiseCodeObjectData get (FranchiseCodeObjectKeyData FCGetIn) throws BSDMResourceException;
  /**
   * Get a unique FranchiseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCGetIn Input Object Key.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public FranchiseCodeObjectData get (BSDMSessionContext context, FranchiseCodeObjectKeyData FCGetIn) throws BSDMResourceException;


  /**
   * Get a unique FranchiseCode row..
   * Convenience method using default BSDMSessionContext.
   * @param FCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public FranchiseCodeObjectData get (FranchiseCodeObjectKeyData FCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique FranchiseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public FranchiseCodeObjectData get (BSDMSessionContext context, FranchiseCodeObjectKeyData FCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find FranchiseCode's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param FCFindIn Input Filter Object.
   * @return FranchiseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public FranchiseCodeObjectDataList find (FranchiseCodeObjectFilter FCFindIn) throws BSDMResourceException;
  /**
   * Find FranchiseCode's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCFindIn Input Filter Object.
   * @return FranchiseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public FranchiseCodeObjectDataList find (BSDMSessionContext context, FranchiseCodeObjectFilter FCFindIn) throws BSDMResourceException;


  /**
   * Find FranchiseCode's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param FCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return FranchiseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public FranchiseCodeObjectDataList find (FranchiseCodeObjectFilter FCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find FranchiseCode's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return FranchiseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public FranchiseCodeObjectDataList find (BSDMSessionContext context, FranchiseCodeObjectFilter FCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non key fields of a FranchiseCode row..
   * Convenience method using default BSDMSessionContext.
   * @param FCUpdateIn Input  Object.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public FranchiseCodeObjectData update (FranchiseCodeObjectData FCUpdateIn) throws BSDMResourceException;
  /**
   * Update non key fields of a FranchiseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCUpdateIn Input  Object.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public FranchiseCodeObjectData update (BSDMSessionContext context, FranchiseCodeObjectData FCUpdateIn) throws BSDMResourceException;


  /**
   * Update non key fields of a FranchiseCode row..
   * Convenience method using default BSDMSessionContext.
   * @param FCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public FranchiseCodeObjectData update (FranchiseCodeObjectData FCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non key fields of a FranchiseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public FranchiseCodeObjectData update (BSDMSessionContext context, FranchiseCodeObjectData FCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a FranchiseCode row..
   * Convenience method using default BSDMSessionContext.
   * @param FCDeleteIn Input Object Key.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public FranchiseCodeObjectData delete (FranchiseCodeObjectKeyData FCDeleteIn) throws BSDMResourceException;
  /**
   * Delete a FranchiseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCDeleteIn Input Object Key.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public FranchiseCodeObjectData delete (BSDMSessionContext context, FranchiseCodeObjectKeyData FCDeleteIn) throws BSDMResourceException;


  /**
   * Delete a FranchiseCode row..
   * Convenience method using default BSDMSessionContext.
   * @param FCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public FranchiseCodeObjectData delete (FranchiseCodeObjectKeyData FCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a FranchiseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public FranchiseCodeObjectData delete (BSDMSessionContext context, FranchiseCodeObjectKeyData FCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new FranchiseCode..
   * Convenience method using default BSDMSessionContext.
   * @param FCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public FranchiseCodeObjectData create (FranchiseCodeObjectData FCCreateIn) throws BSDMResourceException;
  /**
   * Create a new FranchiseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public FranchiseCodeObjectData create (BSDMSessionContext context, FranchiseCodeObjectData FCCreateIn) throws BSDMResourceException;


  /**
   * Create a new FranchiseCode..
   * Convenience method using default BSDMSessionContext.
   * @param FCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public FranchiseCodeObjectData create (FranchiseCodeObjectData FCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new FranchiseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param FCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return FranchiseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public FranchiseCodeObjectData create (BSDMSessionContext context, FranchiseCodeObjectData FCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
