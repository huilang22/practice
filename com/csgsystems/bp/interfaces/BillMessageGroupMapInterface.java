
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
public interface BillMessageGroupMapInterface extends BaliInterface {

  /**
   * Retrieve a unique BillMessageGroupMap row..
   * Convenience method using default BSDMSessionContext.
   * @param BMGGetIn Input Object Key.
   * @return BillMessageGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupMapObjectData get (BillMessageGroupMapObjectKeyData BMGGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique BillMessageGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BMGGetIn Input Object Key.
   * @return BillMessageGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupMapObjectData get (BSDMSessionContext context, BillMessageGroupMapObjectKeyData BMGGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique BillMessageGroupMap row..
   * Convenience method using default BSDMSessionContext.
   * @param BMGGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillMessageGroupMapObjectData get (BillMessageGroupMapObjectKeyData BMGGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique BillMessageGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BMGGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillMessageGroupMapObjectData get (BSDMSessionContext context, BillMessageGroupMapObjectKeyData BMGGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find BillMessageGroupMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BMGFindIn Input Filter Object.
   * @return BillMessageGroupMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupMapObjectDataList find (BillMessageGroupMapObjectFilter BMGFindIn) throws BSDMResourceException;
  /**
   * Find BillMessageGroupMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BMGFindIn Input Filter Object.
   * @return BillMessageGroupMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupMapObjectDataList find (BSDMSessionContext context, BillMessageGroupMapObjectFilter BMGFindIn) throws BSDMResourceException;


  /**
   * Find BillMessageGroupMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BMGFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillMessageGroupMapObjectDataList find (BillMessageGroupMapObjectFilter BMGFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find BillMessageGroupMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BMGFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillMessageGroupMapObjectDataList find (BSDMSessionContext context, BillMessageGroupMapObjectFilter BMGFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new BillMessageGroupMap row..
   * Convenience method using default BSDMSessionContext.
   * @param BMGCreateIn Input  Object.
   * @return BillMessageGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupMapObjectData create (BillMessageGroupMapObjectData BMGCreateIn) throws BSDMResourceException;
  /**
   * Create a new BillMessageGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BMGCreateIn Input  Object.
   * @return BillMessageGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupMapObjectData create (BSDMSessionContext context, BillMessageGroupMapObjectData BMGCreateIn) throws BSDMResourceException;


  /**
   * Create a new BillMessageGroupMap row..
   * Convenience method using default BSDMSessionContext.
   * @param BMGCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillMessageGroupMapObjectData create (BillMessageGroupMapObjectData BMGCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new BillMessageGroupMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BMGCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillMessageGroupMapObjectData create (BSDMSessionContext context, BillMessageGroupMapObjectData BMGCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
