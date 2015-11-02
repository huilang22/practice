
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
public interface BalanceXferDiffInterface extends BaliInterface {

  /**
   * Retrieve a unique BalanceXferDiff row..
   * Convenience method using default BSDMSessionContext.
   * @param BXDGetIn Input Object Key.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BXDObjectData get (BXDObjectKeyData BXDGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique BalanceXferDiff row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDGetIn Input Object Key.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BXDObjectData get (BSDMSessionContext context, BXDObjectKeyData BXDGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique BalanceXferDiff row..
   * Convenience method using default BSDMSessionContext.
   * @param BXDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BXDObjectData get (BXDObjectKeyData BXDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique BalanceXferDiff row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BXDObjectData get (BSDMSessionContext context, BXDObjectKeyData BXDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find BalanceXferDiff's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BXDFindIn Input Filter Object.
   * @return BXDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BXDObjectDataList find (BXDObjectFilter BXDFindIn) throws BSDMResourceException;
  /**
   * Find BalanceXferDiff's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDFindIn Input Filter Object.
   * @return BXDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BXDObjectDataList find (BSDMSessionContext context, BXDObjectFilter BXDFindIn) throws BSDMResourceException;


  /**
   * Find BalanceXferDiff's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BXDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BXDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BXDObjectDataList find (BXDObjectFilter BXDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find BalanceXferDiff's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BXDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BXDObjectDataList find (BSDMSessionContext context, BXDObjectFilter BXDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a BalanceXferDiff..
   * Convenience method using default BSDMSessionContext.
   * @param BXDUpdateIn Input  Object.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BXDObjectData update (BXDObjectData BXDUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a BalanceXferDiff..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDUpdateIn Input  Object.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BXDObjectData update (BSDMSessionContext context, BXDObjectData BXDUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a BalanceXferDiff..
   * Convenience method using default BSDMSessionContext.
   * @param BXDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BXDObjectData update (BXDObjectData BXDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a BalanceXferDiff..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BXDObjectData update (BSDMSessionContext context, BXDObjectData BXDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a BalanceXferDiff..
   * Convenience method using default BSDMSessionContext.
   * @param BXDDeleteIn Input Object Key.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BXDObjectData delete (BXDObjectKeyData BXDDeleteIn) throws BSDMResourceException;
  /**
   * Delete a BalanceXferDiff..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDDeleteIn Input Object Key.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BXDObjectData delete (BSDMSessionContext context, BXDObjectKeyData BXDDeleteIn) throws BSDMResourceException;


  /**
   * Delete a BalanceXferDiff..
   * Convenience method using default BSDMSessionContext.
   * @param BXDDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BXDObjectData delete (BXDObjectKeyData BXDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a BalanceXferDiff..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BXDObjectData delete (BSDMSessionContext context, BXDObjectKeyData BXDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a BalanceXferDiff..
   * Convenience method using default BSDMSessionContext.
   * @param BXDCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BXDObjectData create (BXDObjectData BXDCreateIn) throws BSDMResourceException;
  /**
   * Create a BalanceXferDiff..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BXDObjectData create (BSDMSessionContext context, BXDObjectData BXDCreateIn) throws BSDMResourceException;


  /**
   * Create a BalanceXferDiff..
   * Convenience method using default BSDMSessionContext.
   * @param BXDCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BXDObjectData create (BXDObjectData BXDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a BalanceXferDiff..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BXDObjectData create (BSDMSessionContext context, BXDObjectData BXDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
