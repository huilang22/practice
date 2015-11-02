
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
public interface AbiAutoPayCmfMapInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiAutoPayCmfMapGetIn Input Object Key.
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiAutoPayCmfMapObjectData get (AbiAutoPayCmfMapObjectKeyData AbiAutoPayCmfMapGetIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapGetIn Input Object Key.
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiAutoPayCmfMapObjectData get (BSDMSessionContext context, AbiAutoPayCmfMapObjectKeyData AbiAutoPayCmfMapGetIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiAutoPayCmfMapGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AbiAutoPayCmfMapObjectData get (AbiAutoPayCmfMapObjectKeyData AbiAutoPayCmfMapGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AbiAutoPayCmfMapObjectData get (BSDMSessionContext context, AbiAutoPayCmfMapObjectKeyData AbiAutoPayCmfMapGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiAutoPayCmfMapFindIn Input Filter Object.
   * @return AbiAutoPayCmfMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiAutoPayCmfMapObjectDataList find (AbiAutoPayCmfMapObjectFilter AbiAutoPayCmfMapFindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapFindIn Input Filter Object.
   * @return AbiAutoPayCmfMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiAutoPayCmfMapObjectDataList find (BSDMSessionContext context, AbiAutoPayCmfMapObjectFilter AbiAutoPayCmfMapFindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiAutoPayCmfMapFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiAutoPayCmfMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AbiAutoPayCmfMapObjectDataList find (AbiAutoPayCmfMapObjectFilter AbiAutoPayCmfMapFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiAutoPayCmfMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AbiAutoPayCmfMapObjectDataList find (BSDMSessionContext context, AbiAutoPayCmfMapObjectFilter AbiAutoPayCmfMapFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiAutoPayCmfMapUpdateIn Input  Object.
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiAutoPayCmfMapObjectData update (AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapUpdateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapUpdateIn Input  Object.
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiAutoPayCmfMapObjectData update (BSDMSessionContext context, AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapUpdateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiAutoPayCmfMapUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AbiAutoPayCmfMapObjectData update (AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AbiAutoPayCmfMapObjectData update (BSDMSessionContext context, AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiAutoPayCmfMapCreateIn Input  Object.
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiAutoPayCmfMapObjectData create (AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapCreateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapCreateIn Input  Object.
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiAutoPayCmfMapObjectData create (BSDMSessionContext context, AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapCreateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiAutoPayCmfMapCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AbiAutoPayCmfMapObjectData create (AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AbiAutoPayCmfMapObjectData create (BSDMSessionContext context, AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
