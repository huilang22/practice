
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
public interface TaxAssignmentInterface extends BaliInterface {

  /**
   * Get a unique TaxAssignment..
   * Convenience method using default BSDMSessionContext.
   * @param TAgetIn Input Object Key.
   * @return TaxAssignmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxAssignmentObjectData get (TaxAssignmentObjectKeyData TAgetIn) throws BSDMResourceException;
  /**
   * Get a unique TaxAssignment..
   * @param context The session context to use when connecting to the APITS server.
   * @param TAgetIn Input Object Key.
   * @return TaxAssignmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxAssignmentObjectData get (BSDMSessionContext context, TaxAssignmentObjectKeyData TAgetIn) throws BSDMResourceException;


  /**
   * Get a unique TaxAssignment..
   * Convenience method using default BSDMSessionContext.
   * @param TAgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxAssignmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TaxAssignmentObjectData get (TaxAssignmentObjectKeyData TAgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique TaxAssignment..
   * @param context The session context to use when connecting to the APITS server.
   * @param TAgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxAssignmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TaxAssignmentObjectData get (BSDMSessionContext context, TaxAssignmentObjectKeyData TAgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find TaxAssignment's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TAfindIn Input Filter Object.
   * @return TaxAssignmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxAssignmentObjectDataList find (TaxAssignmentObjectFilter TAfindIn) throws BSDMResourceException;
  /**
   * Find TaxAssignment's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TAfindIn Input Filter Object.
   * @return TaxAssignmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxAssignmentObjectDataList find (BSDMSessionContext context, TaxAssignmentObjectFilter TAfindIn) throws BSDMResourceException;


  /**
   * Find TaxAssignment's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TAfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxAssignmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TaxAssignmentObjectDataList find (TaxAssignmentObjectFilter TAfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find TaxAssignment's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TAfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxAssignmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TaxAssignmentObjectDataList find (BSDMSessionContext context, TaxAssignmentObjectFilter TAfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
