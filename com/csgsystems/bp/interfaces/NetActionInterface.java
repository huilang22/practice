
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
public interface NetActionInterface extends BaliInterface {

  /**
   * Get a unique NetAction..
   * Convenience method using default BSDMSessionContext.
   * @param NARGetIn Input Object Key.
   * @return NetActionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NetActionObjectData get (NetActionObjectKeyData NARGetIn) throws BSDMResourceException;
  /**
   * Get a unique NetAction..
   * @param context The session context to use when connecting to the APITS server.
   * @param NARGetIn Input Object Key.
   * @return NetActionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NetActionObjectData get (BSDMSessionContext context, NetActionObjectKeyData NARGetIn) throws BSDMResourceException;


  /**
   * Get a unique NetAction..
   * Convenience method using default BSDMSessionContext.
   * @param NARGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NetActionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public NetActionObjectData get (NetActionObjectKeyData NARGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique NetAction..
   * @param context The session context to use when connecting to the APITS server.
   * @param NARGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NetActionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public NetActionObjectData get (BSDMSessionContext context, NetActionObjectKeyData NARGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find NetAction's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param NARFindIn Input Filter Object.
   * @return NetActionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NetActionObjectDataList find (NetActionObjectFilter NARFindIn) throws BSDMResourceException;
  /**
   * Find NetAction's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param NARFindIn Input Filter Object.
   * @return NetActionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NetActionObjectDataList find (BSDMSessionContext context, NetActionObjectFilter NARFindIn) throws BSDMResourceException;


  /**
   * Find NetAction's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param NARFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NetActionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public NetActionObjectDataList find (NetActionObjectFilter NARFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find NetAction's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param NARFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NetActionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public NetActionObjectDataList find (BSDMSessionContext context, NetActionObjectFilter NARFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
