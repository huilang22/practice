
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
public interface SecurityAciInterface extends BaliInterface {

  /**
   * Create a ACI record..
   * Convenience method using default BSDMSessionContext.
   * @param AciCreateIn Input  Object.
   * @param user_name.
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityAciObjectData createInternal (SecurityAciObjectData AciCreateIn, String user_name) throws BSDMResourceException;
  /**
   * Create a ACI record..
   * @param context The session context to use when connecting to the APITS server.
   * @param AciCreateIn Input  Object.
   * @param user_name.
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityAciObjectData createInternal (BSDMSessionContext context, SecurityAciObjectData AciCreateIn, String user_name) throws BSDMResourceException;


  /**
   * Create a ACI record..
   * Convenience method using default BSDMSessionContext.
   * @param AciCreateIn Input  Object.
   * @param user_name.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityAciObjectData createInternal (SecurityAciObjectData AciCreateIn, String user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a ACI record..
   * @param context The session context to use when connecting to the APITS server.
   * @param AciCreateIn Input  Object.
   * @param user_name.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityAciObjectData createInternal (BSDMSessionContext context, SecurityAciObjectData AciCreateIn, String user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a ACI record..
   * Convenience method using default BSDMSessionContext.
   * @param AciDeleteIn Input  Object.
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityAciObjectData deleteInternal (SecurityAciObjectData AciDeleteIn) throws BSDMResourceException;
  /**
   * Delete a ACI record..
   * @param context The session context to use when connecting to the APITS server.
   * @param AciDeleteIn Input  Object.
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityAciObjectData deleteInternal (BSDMSessionContext context, SecurityAciObjectData AciDeleteIn) throws BSDMResourceException;


  /**
   * Delete a ACI record..
   * Convenience method using default BSDMSessionContext.
   * @param AciDeleteIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityAciObjectData deleteInternal (SecurityAciObjectData AciDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a ACI record..
   * @param context The session context to use when connecting to the APITS server.
   * @param AciDeleteIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityAciObjectData deleteInternal (BSDMSessionContext context, SecurityAciObjectData AciDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find SecurityAci that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityAciFindIn Input Filter Object.
   * @return SecurityAciObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityAciObjectDataList find (SecurityAciObjectFilter SecurityAciFindIn) throws BSDMResourceException;
  /**
   * Find SecurityAci that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityAciFindIn Input Filter Object.
   * @return SecurityAciObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityAciObjectDataList find (BSDMSessionContext context, SecurityAciObjectFilter SecurityAciFindIn) throws BSDMResourceException;


  /**
   * Find SecurityAci that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityAciFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityAciObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityAciObjectDataList find (SecurityAciObjectFilter SecurityAciFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find SecurityAci that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityAciFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityAciObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityAciObjectDataList find (BSDMSessionContext context, SecurityAciObjectFilter SecurityAciFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
