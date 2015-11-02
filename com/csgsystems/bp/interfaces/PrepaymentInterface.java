
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
public interface PrepaymentInterface extends BaliInterface {

  /**
   * Gets an Active Prepayment (NoBill=0).  Can not get an Inactive Prepayment because there is no unique key for an Inactive Prepayment..
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentObjectData get (PrepaymentObjectKeyData getIn) throws BSDMResourceException;
  /**
   * Gets an Active Prepayment (NoBill=0).  Can not get an Inactive Prepayment because there is no unique key for an Inactive Prepayment..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentObjectData get (BSDMSessionContext context, PrepaymentObjectKeyData getIn) throws BSDMResourceException;


  /**
   * Gets an Active Prepayment (NoBill=0).  Can not get an Inactive Prepayment because there is no unique key for an Inactive Prepayment..
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PrepaymentObjectData get (PrepaymentObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets an Active Prepayment (NoBill=0).  Can not get an Inactive Prepayment because there is no unique key for an Inactive Prepayment..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PrepaymentObjectData get (BSDMSessionContext context, PrepaymentObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return PrepaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentObjectDataList find (PrepaymentObjectFilter findIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return PrepaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentObjectDataList find (BSDMSessionContext context, PrepaymentObjectFilter findIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PrepaymentObjectDataList find (PrepaymentObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PrepaymentObjectDataList find (BSDMSessionContext context, PrepaymentObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param prepaymentCreateIn Input  Object.
   * @param WaiveEpg (has a default).
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentObjectData create (PrepaymentObjectData prepaymentCreateIn, Integer WaiveEpg) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param prepaymentCreateIn Input  Object.
   * @param WaiveEpg (has a default).
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentObjectData create (BSDMSessionContext context, PrepaymentObjectData prepaymentCreateIn, Integer WaiveEpg) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param prepaymentCreateIn Input  Object.
   * @param WaiveEpg (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PrepaymentObjectData create (PrepaymentObjectData prepaymentCreateIn, Integer WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param prepaymentCreateIn Input  Object.
   * @param WaiveEpg (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PrepaymentObjectData create (BSDMSessionContext context, PrepaymentObjectData prepaymentCreateIn, Integer WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param prepaymentUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentObjectData update (PrepaymentObjectData prepaymentUpdateIn1, Integer _WaiveEpg) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param prepaymentUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentObjectData update (BSDMSessionContext context, PrepaymentObjectData prepaymentUpdateIn1, Integer _WaiveEpg) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param prepaymentUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PrepaymentObjectData update (PrepaymentObjectData prepaymentUpdateIn1, Integer _WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param prepaymentUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PrepaymentObjectData update (BSDMSessionContext context, PrepaymentObjectData prepaymentUpdateIn1, Integer _WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param prepaymentDeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void delete (PrepaymentObjectKeyData prepaymentDeleteIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param prepaymentDeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void delete (BSDMSessionContext context, PrepaymentObjectKeyData prepaymentDeleteIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param prepaymentDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void delete (PrepaymentObjectKeyData prepaymentDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param prepaymentDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void delete (BSDMSessionContext context, PrepaymentObjectKeyData prepaymentDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets a Prepayment.  Can't guarantee uniqueness though..
   * Convenience method using default BSDMSessionContext.
   * @param getOldIn Input Object Key.
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentObjectData getOld (PrepaymentObjectKeyData getOldIn) throws BSDMResourceException;
  /**
   * Gets a Prepayment.  Can't guarantee uniqueness though..
   * @param context The session context to use when connecting to the APITS server.
   * @param getOldIn Input Object Key.
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentObjectData getOld (BSDMSessionContext context, PrepaymentObjectKeyData getOldIn) throws BSDMResourceException;


  /**
   * Gets a Prepayment.  Can't guarantee uniqueness though..
   * Convenience method using default BSDMSessionContext.
   * @param getOldIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PrepaymentObjectData getOld (PrepaymentObjectKeyData getOldIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets a Prepayment.  Can't guarantee uniqueness though..
   * @param context The session context to use when connecting to the APITS server.
   * @param getOldIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PrepaymentObjectData getOld (BSDMSessionContext context, PrepaymentObjectKeyData getOldIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
