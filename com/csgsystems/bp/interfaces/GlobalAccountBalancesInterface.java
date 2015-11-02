
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
public interface GlobalAccountBalancesInterface extends BaliInterface {

  /**
   * Retrieve a unique GlobalAccountBalances row..
   * Convenience method using default BSDMSessionContext.
   * @param GABGetIn Input Object Key.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalAccountBalancesObjectData get (GlobalAccountBalancesObjectKeyData GABGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique GlobalAccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABGetIn Input Object Key.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalAccountBalancesObjectData get (BSDMSessionContext context, GlobalAccountBalancesObjectKeyData GABGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique GlobalAccountBalances row..
   * Convenience method using default BSDMSessionContext.
   * @param GABGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalAccountBalancesObjectData get (GlobalAccountBalancesObjectKeyData GABGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique GlobalAccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalAccountBalancesObjectData get (BSDMSessionContext context, GlobalAccountBalancesObjectKeyData GABGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find GlobalAccountBalances rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GABFindIn Input Filter Object.
   * @return GlobalAccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalAccountBalancesObjectDataList find (GlobalAccountBalancesObjectFilter GABFindIn) throws BSDMResourceException;
  /**
   * Find GlobalAccountBalances rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABFindIn Input Filter Object.
   * @return GlobalAccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalAccountBalancesObjectDataList find (BSDMSessionContext context, GlobalAccountBalancesObjectFilter GABFindIn) throws BSDMResourceException;


  /**
   * Find GlobalAccountBalances rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GABFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalAccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalAccountBalancesObjectDataList find (GlobalAccountBalancesObjectFilter GABFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find GlobalAccountBalances rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalAccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalAccountBalancesObjectDataList find (BSDMSessionContext context, GlobalAccountBalancesObjectFilter GABFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a GlobalAccountBalances..
   * Convenience method using default BSDMSessionContext.
   * @param GABUpdateIn Input  Object.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalAccountBalancesObjectData update (GlobalAccountBalancesObjectData GABUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a GlobalAccountBalances..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABUpdateIn Input  Object.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalAccountBalancesObjectData update (BSDMSessionContext context, GlobalAccountBalancesObjectData GABUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a GlobalAccountBalances..
   * Convenience method using default BSDMSessionContext.
   * @param GABUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalAccountBalancesObjectData update (GlobalAccountBalancesObjectData GABUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a GlobalAccountBalances..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalAccountBalancesObjectData update (BSDMSessionContext context, GlobalAccountBalancesObjectData GABUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a GlobalAccountBalances row..
   * Convenience method using default BSDMSessionContext.
   * @param GABDeleteIn Input Object Key.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalAccountBalancesObjectData delete (GlobalAccountBalancesObjectKeyData GABDeleteIn) throws BSDMResourceException;
  /**
   * Delete a GlobalAccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABDeleteIn Input Object Key.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalAccountBalancesObjectData delete (BSDMSessionContext context, GlobalAccountBalancesObjectKeyData GABDeleteIn) throws BSDMResourceException;


  /**
   * Delete a GlobalAccountBalances row..
   * Convenience method using default BSDMSessionContext.
   * @param GABDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalAccountBalancesObjectData delete (GlobalAccountBalancesObjectKeyData GABDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a GlobalAccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalAccountBalancesObjectData delete (BSDMSessionContext context, GlobalAccountBalancesObjectKeyData GABDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new GlobalAccountBalances row..
   * Convenience method using default BSDMSessionContext.
   * @param GABCreateIn Input  Object.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalAccountBalancesObjectData create (GlobalAccountBalancesObjectData GABCreateIn) throws BSDMResourceException;
  /**
   * Create a new GlobalAccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABCreateIn Input  Object.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalAccountBalancesObjectData create (BSDMSessionContext context, GlobalAccountBalancesObjectData GABCreateIn) throws BSDMResourceException;


  /**
   * Create a new GlobalAccountBalances row..
   * Convenience method using default BSDMSessionContext.
   * @param GABCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalAccountBalancesObjectData create (GlobalAccountBalancesObjectData GABCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new GlobalAccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalAccountBalancesObjectData create (BSDMSessionContext context, GlobalAccountBalancesObjectData GABCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
