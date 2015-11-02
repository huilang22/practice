
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
public interface GroupLocateInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param GLFindIn Input Filter Object.
   * @return GroupLocateObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupLocateObjectDataList find (GroupLocateObjectFilter GLFindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param GLFindIn Input Filter Object.
   * @return GroupLocateObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupLocateObjectDataList find (BSDMSessionContext context, GroupLocateObjectFilter GLFindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param GLFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupLocateObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GroupLocateObjectDataList find (GroupLocateObjectFilter GLFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param GLFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupLocateObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GroupLocateObjectDataList find (BSDMSessionContext context, GroupLocateObjectFilter GLFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param GLGetIn Input Object Key.
   * @return GroupLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupLocateObjectData get (GroupLocateObjectKeyData GLGetIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param GLGetIn Input Object Key.
   * @return GroupLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupLocateObjectData get (BSDMSessionContext context, GroupLocateObjectKeyData GLGetIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param GLGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GroupLocateObjectData get (GroupLocateObjectKeyData GLGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param GLGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GroupLocateObjectData get (BSDMSessionContext context, GroupLocateObjectKeyData GLGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
