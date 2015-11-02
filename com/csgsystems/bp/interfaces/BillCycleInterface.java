
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
public interface BillCycleInterface extends BaliInterface {

  /**
   * Get a BillCycle row..
   * Convenience method using default BSDMSessionContext.
   * @param BillCyclegetIn Input Object Key.
   * @return BillCycleObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillCycleObjectData get (BillCycleObjectKeyData BillCyclegetIn) throws BSDMResourceException;
  /**
   * Get a BillCycle row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BillCyclegetIn Input Object Key.
   * @return BillCycleObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillCycleObjectData get (BSDMSessionContext context, BillCycleObjectKeyData BillCyclegetIn) throws BSDMResourceException;


  /**
   * Get a BillCycle row..
   * Convenience method using default BSDMSessionContext.
   * @param BillCyclegetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillCycleObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillCycleObjectData get (BillCycleObjectKeyData BillCyclegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a BillCycle row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BillCyclegetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillCycleObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillCycleObjectData get (BSDMSessionContext context, BillCycleObjectKeyData BillCyclegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find BillCycles that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BillCyclefindIn Input Filter Object.
   * @return BillCycleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillCycleObjectDataList find (BillCycleObjectFilter BillCyclefindIn) throws BSDMResourceException;
  /**
   * Find BillCycles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BillCyclefindIn Input Filter Object.
   * @return BillCycleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillCycleObjectDataList find (BSDMSessionContext context, BillCycleObjectFilter BillCyclefindIn) throws BSDMResourceException;


  /**
   * Find BillCycles that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BillCyclefindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillCycleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillCycleObjectDataList find (BillCycleObjectFilter BillCyclefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find BillCycles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BillCyclefindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillCycleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillCycleObjectDataList find (BSDMSessionContext context, BillCycleObjectFilter BillCyclefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
