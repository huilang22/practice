
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
public interface AbiBillMessagesInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiBillMessagesGetIn Input Object Key.
   * @return AbiBillMessagesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiBillMessagesObjectData get (AbiBillMessagesObjectKeyData AbiBillMessagesGetIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiBillMessagesGetIn Input Object Key.
   * @return AbiBillMessagesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiBillMessagesObjectData get (BSDMSessionContext context, AbiBillMessagesObjectKeyData AbiBillMessagesGetIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiBillMessagesGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiBillMessagesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AbiBillMessagesObjectData get (AbiBillMessagesObjectKeyData AbiBillMessagesGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiBillMessagesGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiBillMessagesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AbiBillMessagesObjectData get (BSDMSessionContext context, AbiBillMessagesObjectKeyData AbiBillMessagesGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiBillMessagesFindIn Input Filter Object.
   * @return AbiBillMessagesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiBillMessagesObjectDataList find (AbiBillMessagesObjectFilter AbiBillMessagesFindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiBillMessagesFindIn Input Filter Object.
   * @return AbiBillMessagesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiBillMessagesObjectDataList find (BSDMSessionContext context, AbiBillMessagesObjectFilter AbiBillMessagesFindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiBillMessagesFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiBillMessagesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AbiBillMessagesObjectDataList find (AbiBillMessagesObjectFilter AbiBillMessagesFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiBillMessagesFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiBillMessagesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AbiBillMessagesObjectDataList find (BSDMSessionContext context, AbiBillMessagesObjectFilter AbiBillMessagesFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiBillMessagesUpdateIn Input  Object.
   * @return AbiBillMessagesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiBillMessagesObjectData update (AbiBillMessagesObjectData AbiBillMessagesUpdateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiBillMessagesUpdateIn Input  Object.
   * @return AbiBillMessagesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiBillMessagesObjectData update (BSDMSessionContext context, AbiBillMessagesObjectData AbiBillMessagesUpdateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiBillMessagesUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiBillMessagesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AbiBillMessagesObjectData update (AbiBillMessagesObjectData AbiBillMessagesUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiBillMessagesUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiBillMessagesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AbiBillMessagesObjectData update (BSDMSessionContext context, AbiBillMessagesObjectData AbiBillMessagesUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
