
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
public interface AbiNrcDucInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiNrcDucGetIn Input Object Key.
   * @return AbiNrcDucObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiNrcDucObjectData get (AbiNrcDucObjectKeyData AbiNrcDucGetIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiNrcDucGetIn Input Object Key.
   * @return AbiNrcDucObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiNrcDucObjectData get (BSDMSessionContext context, AbiNrcDucObjectKeyData AbiNrcDucGetIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiNrcDucGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiNrcDucObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AbiNrcDucObjectData get (AbiNrcDucObjectKeyData AbiNrcDucGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiNrcDucGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiNrcDucObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AbiNrcDucObjectData get (BSDMSessionContext context, AbiNrcDucObjectKeyData AbiNrcDucGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiNrcDucFindIn Input Filter Object.
   * @return AbiNrcDucObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiNrcDucObjectDataList find (AbiNrcDucObjectFilter AbiNrcDucFindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiNrcDucFindIn Input Filter Object.
   * @return AbiNrcDucObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiNrcDucObjectDataList find (BSDMSessionContext context, AbiNrcDucObjectFilter AbiNrcDucFindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiNrcDucFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiNrcDucObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AbiNrcDucObjectDataList find (AbiNrcDucObjectFilter AbiNrcDucFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiNrcDucFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiNrcDucObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AbiNrcDucObjectDataList find (BSDMSessionContext context, AbiNrcDucObjectFilter AbiNrcDucFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiNrcDucUpdateIn Input  Object.
   * @return AbiNrcDucObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiNrcDucObjectData update (AbiNrcDucObjectData AbiNrcDucUpdateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiNrcDucUpdateIn Input  Object.
   * @return AbiNrcDucObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiNrcDucObjectData update (BSDMSessionContext context, AbiNrcDucObjectData AbiNrcDucUpdateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiNrcDucUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiNrcDucObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AbiNrcDucObjectData update (AbiNrcDucObjectData AbiNrcDucUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiNrcDucUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiNrcDucObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AbiNrcDucObjectData update (BSDMSessionContext context, AbiNrcDucObjectData AbiNrcDucUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
