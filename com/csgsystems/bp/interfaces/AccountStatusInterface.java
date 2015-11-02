
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
public interface AccountStatusInterface extends BaliInterface {

  /**
   * Retrieve a unique AccountStatus row..
   * Convenience method using default BSDMSessionContext.
   * @param AccountStatusgetIn Input Object Key.
   * @return AccountStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountStatusObjectData get (AccountStatusObjectKeyData AccountStatusgetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique AccountStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountStatusgetIn Input Object Key.
   * @return AccountStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountStatusObjectData get (BSDMSessionContext context, AccountStatusObjectKeyData AccountStatusgetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique AccountStatus row..
   * Convenience method using default BSDMSessionContext.
   * @param AccountStatusgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountStatusObjectData get (AccountStatusObjectKeyData AccountStatusgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique AccountStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountStatusgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountStatusObjectData get (BSDMSessionContext context, AccountStatusObjectKeyData AccountStatusgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AccountStatus' that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AccountStatusfindIn Input Filter Object.
   * @return AccountStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountStatusObjectDataList find (AccountStatusObjectFilter AccountStatusfindIn) throws BSDMResourceException;
  /**
   * Find AccountStatus' that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountStatusfindIn Input Filter Object.
   * @return AccountStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountStatusObjectDataList find (BSDMSessionContext context, AccountStatusObjectFilter AccountStatusfindIn) throws BSDMResourceException;


  /**
   * Find AccountStatus' that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AccountStatusfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountStatusObjectDataList find (AccountStatusObjectFilter AccountStatusfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AccountStatus' that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountStatusfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountStatusObjectDataList find (BSDMSessionContext context, AccountStatusObjectFilter AccountStatusfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
