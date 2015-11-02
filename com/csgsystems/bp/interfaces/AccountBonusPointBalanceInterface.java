
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
public interface AccountBonusPointBalanceInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return AccountBonusPointBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointBalanceObjectData get (AccountBonusPointBalanceObjectKeyData getIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return AccountBonusPointBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointBalanceObjectData get (BSDMSessionContext context, AccountBonusPointBalanceObjectKeyData getIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBonusPointBalanceObjectData get (AccountBonusPointBalanceObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointBalanceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBonusPointBalanceObjectData get (BSDMSessionContext context, AccountBonusPointBalanceObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return AccountBonusPointBalanceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointBalanceObjectDataList find (AccountBonusPointBalanceObjectFilter findIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return AccountBonusPointBalanceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBonusPointBalanceObjectDataList find (BSDMSessionContext context, AccountBonusPointBalanceObjectFilter findIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointBalanceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBonusPointBalanceObjectDataList find (AccountBonusPointBalanceObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBonusPointBalanceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBonusPointBalanceObjectDataList find (BSDMSessionContext context, AccountBonusPointBalanceObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
