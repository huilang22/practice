
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
public interface OwningCostCenterInterface extends BaliInterface {

  /**
   * Get a unique OwningCostCenter..
   * Convenience method using default BSDMSessionContext.
   * @param OCCGetIn Input Object Key.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OwningCostCenterObjectData get (OwningCostCenterObjectKeyData OCCGetIn) throws BSDMResourceException;
  /**
   * Get a unique OwningCostCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCGetIn Input Object Key.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OwningCostCenterObjectData get (BSDMSessionContext context, OwningCostCenterObjectKeyData OCCGetIn) throws BSDMResourceException;


  /**
   * Get a unique OwningCostCenter..
   * Convenience method using default BSDMSessionContext.
   * @param OCCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OwningCostCenterObjectData get (OwningCostCenterObjectKeyData OCCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique OwningCostCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OwningCostCenterObjectData get (BSDMSessionContext context, OwningCostCenterObjectKeyData OCCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find OwningCostCenters that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param OCCFindIn Input Filter Object.
   * @return OwningCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OwningCostCenterObjectDataList find (OwningCostCenterObjectFilter OCCFindIn) throws BSDMResourceException;
  /**
   * Find OwningCostCenters that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCFindIn Input Filter Object.
   * @return OwningCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OwningCostCenterObjectDataList find (BSDMSessionContext context, OwningCostCenterObjectFilter OCCFindIn) throws BSDMResourceException;


  /**
   * Find OwningCostCenters that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param OCCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OwningCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OwningCostCenterObjectDataList find (OwningCostCenterObjectFilter OCCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find OwningCostCenters that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OwningCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OwningCostCenterObjectDataList find (BSDMSessionContext context, OwningCostCenterObjectFilter OCCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of an OwningCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param OCCUpdateIn Input  Object.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OwningCostCenterObjectData update (OwningCostCenterObjectData OCCUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of an OwningCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCUpdateIn Input  Object.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OwningCostCenterObjectData update (BSDMSessionContext context, OwningCostCenterObjectData OCCUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of an OwningCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param OCCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OwningCostCenterObjectData update (OwningCostCenterObjectData OCCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of an OwningCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OwningCostCenterObjectData update (BSDMSessionContext context, OwningCostCenterObjectData OCCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete an OwningCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param OCCDeleteIn Input Object Key.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OwningCostCenterObjectData delete (OwningCostCenterObjectKeyData OCCDeleteIn) throws BSDMResourceException;
  /**
   * Delete an OwningCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCDeleteIn Input Object Key.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OwningCostCenterObjectData delete (BSDMSessionContext context, OwningCostCenterObjectKeyData OCCDeleteIn) throws BSDMResourceException;


  /**
   * Delete an OwningCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param OCCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OwningCostCenterObjectData delete (OwningCostCenterObjectKeyData OCCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete an OwningCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OwningCostCenterObjectData delete (BSDMSessionContext context, OwningCostCenterObjectKeyData OCCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new OwningCostCenter..
   * Convenience method using default BSDMSessionContext.
   * @param OCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OwningCostCenterObjectData create (OwningCostCenterObjectData OCCCreateIn) throws BSDMResourceException;
  /**
   * Create a new OwningCostCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OwningCostCenterObjectData create (BSDMSessionContext context, OwningCostCenterObjectData OCCCreateIn) throws BSDMResourceException;


  /**
   * Create a new OwningCostCenter..
   * Convenience method using default BSDMSessionContext.
   * @param OCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OwningCostCenterObjectData create (OwningCostCenterObjectData OCCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new OwningCostCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OwningCostCenterObjectData create (BSDMSessionContext context, OwningCostCenterObjectData OCCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
