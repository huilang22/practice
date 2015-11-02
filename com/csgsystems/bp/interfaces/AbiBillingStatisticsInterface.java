
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
public interface AbiBillingStatisticsInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiBillingStatisticsGetIn Input Object Key.
   * @return AbiBillingStatisticsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiBillingStatisticsObjectData get (AbiBillingStatisticsObjectKeyData AbiBillingStatisticsGetIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiBillingStatisticsGetIn Input Object Key.
   * @return AbiBillingStatisticsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiBillingStatisticsObjectData get (BSDMSessionContext context, AbiBillingStatisticsObjectKeyData AbiBillingStatisticsGetIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiBillingStatisticsGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiBillingStatisticsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AbiBillingStatisticsObjectData get (AbiBillingStatisticsObjectKeyData AbiBillingStatisticsGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiBillingStatisticsGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiBillingStatisticsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AbiBillingStatisticsObjectData get (BSDMSessionContext context, AbiBillingStatisticsObjectKeyData AbiBillingStatisticsGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiBillingStatisticsFindIn Input Filter Object.
   * @return AbiBillingStatisticsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiBillingStatisticsObjectDataList find (AbiBillingStatisticsObjectFilter AbiBillingStatisticsFindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiBillingStatisticsFindIn Input Filter Object.
   * @return AbiBillingStatisticsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiBillingStatisticsObjectDataList find (BSDMSessionContext context, AbiBillingStatisticsObjectFilter AbiBillingStatisticsFindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiBillingStatisticsFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiBillingStatisticsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AbiBillingStatisticsObjectDataList find (AbiBillingStatisticsObjectFilter AbiBillingStatisticsFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiBillingStatisticsFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiBillingStatisticsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AbiBillingStatisticsObjectDataList find (BSDMSessionContext context, AbiBillingStatisticsObjectFilter AbiBillingStatisticsFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiBillingStatisticsUpdateIn Input  Object.
   * @return AbiBillingStatisticsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiBillingStatisticsObjectData update (AbiBillingStatisticsObjectData AbiBillingStatisticsUpdateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiBillingStatisticsUpdateIn Input  Object.
   * @return AbiBillingStatisticsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AbiBillingStatisticsObjectData update (BSDMSessionContext context, AbiBillingStatisticsObjectData AbiBillingStatisticsUpdateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiBillingStatisticsUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiBillingStatisticsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AbiBillingStatisticsObjectData update (AbiBillingStatisticsObjectData AbiBillingStatisticsUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiBillingStatisticsUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AbiBillingStatisticsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AbiBillingStatisticsObjectData update (BSDMSessionContext context, AbiBillingStatisticsObjectData AbiBillingStatisticsUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
