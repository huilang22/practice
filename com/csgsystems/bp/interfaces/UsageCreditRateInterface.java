
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
public interface UsageCreditRateInterface extends BaliInterface {

  /**
   * Get a unique UsageCreditRate..
   * Convenience method using default BSDMSessionContext.
   * @param RUCGetIn Input Object Key.
   * @return RUCreditObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RUCreditObjectData get (RUCreditObjectKeyData RUCGetIn) throws BSDMResourceException;
  /**
   * Get a unique UsageCreditRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param RUCGetIn Input Object Key.
   * @return RUCreditObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RUCreditObjectData get (BSDMSessionContext context, RUCreditObjectKeyData RUCGetIn) throws BSDMResourceException;


  /**
   * Get a unique UsageCreditRate..
   * Convenience method using default BSDMSessionContext.
   * @param RUCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RUCreditObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RUCreditObjectData get (RUCreditObjectKeyData RUCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique UsageCreditRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param RUCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RUCreditObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RUCreditObjectData get (BSDMSessionContext context, RUCreditObjectKeyData RUCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find UsageCreditRate's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RUCFindIn Input Filter Object.
   * @return RUCreditObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RUCreditObjectDataList find (RUCreditObjectFilter RUCFindIn) throws BSDMResourceException;
  /**
   * Find UsageCreditRate's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RUCFindIn Input Filter Object.
   * @return RUCreditObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RUCreditObjectDataList find (BSDMSessionContext context, RUCreditObjectFilter RUCFindIn) throws BSDMResourceException;


  /**
   * Find UsageCreditRate's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RUCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RUCreditObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RUCreditObjectDataList find (RUCreditObjectFilter RUCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find UsageCreditRate's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RUCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RUCreditObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RUCreditObjectDataList find (BSDMSessionContext context, RUCreditObjectFilter RUCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
