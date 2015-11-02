
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
public interface RefinancePlanInterface extends BaliInterface {

  /**
   * Retreive a unique RefinancePlan..
   * Convenience method using default BSDMSessionContext.
   * @param RefinancePlanGetIn Input Object Key.
   * @return RefinancePlanObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefinancePlanObjectData get (RefinancePlanObjectKeyData RefinancePlanGetIn) throws BSDMResourceException;
  /**
   * Retreive a unique RefinancePlan..
   * @param context The session context to use when connecting to the APITS server.
   * @param RefinancePlanGetIn Input Object Key.
   * @return RefinancePlanObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefinancePlanObjectData get (BSDMSessionContext context, RefinancePlanObjectKeyData RefinancePlanGetIn) throws BSDMResourceException;


  /**
   * Retreive a unique RefinancePlan..
   * Convenience method using default BSDMSessionContext.
   * @param RefinancePlanGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefinancePlanObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefinancePlanObjectData get (RefinancePlanObjectKeyData RefinancePlanGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retreive a unique RefinancePlan..
   * @param context The session context to use when connecting to the APITS server.
   * @param RefinancePlanGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefinancePlanObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefinancePlanObjectData get (BSDMSessionContext context, RefinancePlanObjectKeyData RefinancePlanGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find RefinancePlan's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RefinancePlanFindIn Input Filter Object.
   * @return RefinancePlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefinancePlanObjectDataList find (RefinancePlanObjectFilter RefinancePlanFindIn) throws BSDMResourceException;
  /**
   * Find RefinancePlan's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RefinancePlanFindIn Input Filter Object.
   * @return RefinancePlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RefinancePlanObjectDataList find (BSDMSessionContext context, RefinancePlanObjectFilter RefinancePlanFindIn) throws BSDMResourceException;


  /**
   * Find RefinancePlan's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RefinancePlanFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefinancePlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RefinancePlanObjectDataList find (RefinancePlanObjectFilter RefinancePlanFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find RefinancePlan's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RefinancePlanFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RefinancePlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RefinancePlanObjectDataList find (BSDMSessionContext context, RefinancePlanObjectFilter RefinancePlanFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
