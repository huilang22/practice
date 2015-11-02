
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
public interface SecurityUserInterface extends BaliInterface {

  /**
   * Finds security users that match filter criteria.
   * Convenience method using default BSDMSessionContext.
   * @param SecurityUserFindIn Input Filter Object.
   * @return SecurityUserObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityUserObjectDataList find (SecurityUserObjectFilter SecurityUserFindIn) throws BSDMResourceException;
  /**
   * Finds security users that match filter criteria.
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityUserFindIn Input Filter Object.
   * @return SecurityUserObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityUserObjectDataList find (BSDMSessionContext context, SecurityUserObjectFilter SecurityUserFindIn) throws BSDMResourceException;


  /**
   * Finds security users that match filter criteria.
   * Convenience method using default BSDMSessionContext.
   * @param SecurityUserFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityUserObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityUserObjectDataList find (SecurityUserObjectFilter SecurityUserFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds security users that match filter criteria.
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityUserFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityUserObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityUserObjectDataList find (BSDMSessionContext context, SecurityUserObjectFilter SecurityUserFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieves a specific security user.
   * Convenience method using default BSDMSessionContext.
   * @param SecurityUserGetIn Input Object Key.
   * @return SecurityUserObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityUserObjectData get (SecurityUserObjectKeyData SecurityUserGetIn) throws BSDMResourceException;
  /**
   * Retrieves a specific security user.
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityUserGetIn Input Object Key.
   * @return SecurityUserObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityUserObjectData get (BSDMSessionContext context, SecurityUserObjectKeyData SecurityUserGetIn) throws BSDMResourceException;


  /**
   * Retrieves a specific security user.
   * Convenience method using default BSDMSessionContext.
   * @param SecurityUserGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityUserObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityUserObjectData get (SecurityUserObjectKeyData SecurityUserGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieves a specific security user.
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityUserGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityUserObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityUserObjectData get (BSDMSessionContext context, SecurityUserObjectKeyData SecurityUserGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
