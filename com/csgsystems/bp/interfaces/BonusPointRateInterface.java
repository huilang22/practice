
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
public interface BonusPointRateInterface extends BaliInterface {

  /**
   * Retrieve a unique BonusPointRate row..
   * Convenience method using default BSDMSessionContext.
   * @param BPRGetIn Input Object Key.
   * @return BonusPointRateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointRateObjectData get (BonusPointRateObjectKeyData BPRGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique BonusPointRate row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPRGetIn Input Object Key.
   * @return BonusPointRateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointRateObjectData get (BSDMSessionContext context, BonusPointRateObjectKeyData BPRGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique BonusPointRate row..
   * Convenience method using default BSDMSessionContext.
   * @param BPRGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointRateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BonusPointRateObjectData get (BonusPointRateObjectKeyData BPRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique BonusPointRate row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPRGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointRateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BonusPointRateObjectData get (BSDMSessionContext context, BonusPointRateObjectKeyData BPRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find BonusPointRate rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BPRFindIn Input Filter Object.
   * @return BonusPointRateObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointRateObjectDataList find (BonusPointRateObjectFilter BPRFindIn) throws BSDMResourceException;
  /**
   * Find BonusPointRate rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPRFindIn Input Filter Object.
   * @return BonusPointRateObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointRateObjectDataList find (BSDMSessionContext context, BonusPointRateObjectFilter BPRFindIn) throws BSDMResourceException;


  /**
   * Find BonusPointRate rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BPRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointRateObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BonusPointRateObjectDataList find (BonusPointRateObjectFilter BPRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find BonusPointRate rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointRateObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BonusPointRateObjectDataList find (BSDMSessionContext context, BonusPointRateObjectFilter BPRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new BonusPointRate row..
   * Convenience method using default BSDMSessionContext.
   * @param BPRCreateIn Input  Object.
   * @return BonusPointRateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointRateObjectData create (BonusPointRateObjectData BPRCreateIn) throws BSDMResourceException;
  /**
   * Create a new BonusPointRate row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPRCreateIn Input  Object.
   * @return BonusPointRateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BonusPointRateObjectData create (BSDMSessionContext context, BonusPointRateObjectData BPRCreateIn) throws BSDMResourceException;


  /**
   * Create a new BonusPointRate row..
   * Convenience method using default BSDMSessionContext.
   * @param BPRCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointRateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BonusPointRateObjectData create (BonusPointRateObjectData BPRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new BonusPointRate row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BPRCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BonusPointRateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BonusPointRateObjectData create (BSDMSessionContext context, BonusPointRateObjectData BPRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
