
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
public interface HqGroupProductInterface extends BaliInterface {

  /**
   * Retrieve a unique Group Product..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPgetIn Input  Object.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupProductObjectData get (HqGroupProductObjectData HQGPgetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique Group Product..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPgetIn Input  Object.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupProductObjectData get (BSDMSessionContext context, HqGroupProductObjectData HQGPgetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique Group Product..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPgetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupProductObjectData get (HqGroupProductObjectData HQGPgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique Group Product..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPgetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupProductObjectData get (BSDMSessionContext context, HqGroupProductObjectData HQGPgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Group Product's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPfindIn Input Filter Object.
   * @return HqGroupProductObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupProductObjectDataList find (HqGroupProductObjectFilter HQGPfindIn) throws BSDMResourceException;
  /**
   * Find Group Product's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPfindIn Input Filter Object.
   * @return HqGroupProductObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupProductObjectDataList find (BSDMSessionContext context, HqGroupProductObjectFilter HQGPfindIn) throws BSDMResourceException;


  /**
   * Find Group Product's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupProductObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupProductObjectDataList find (HqGroupProductObjectFilter HQGPfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Group Product's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupProductObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupProductObjectDataList find (BSDMSessionContext context, HqGroupProductObjectFilter HQGPfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new Group Product row..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPcreateIn Input  Object.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupProductObjectData create (HqGroupProductObjectData HQGPcreateIn) throws BSDMResourceException;
  /**
   * Create a new Group Product row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPcreateIn Input  Object.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupProductObjectData create (BSDMSessionContext context, HqGroupProductObjectData HQGPcreateIn) throws BSDMResourceException;


  /**
   * Create a new Group Product row..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPcreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupProductObjectData create (HqGroupProductObjectData HQGPcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Group Product row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPcreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupProductObjectData create (BSDMSessionContext context, HqGroupProductObjectData HQGPcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update a GroupProduct..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPupdateIn Input  Object.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupProductObjectData update (HqGroupProductObjectData HQGPupdateIn) throws BSDMResourceException;
  /**
   * Update a GroupProduct..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPupdateIn Input  Object.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupProductObjectData update (BSDMSessionContext context, HqGroupProductObjectData HQGPupdateIn) throws BSDMResourceException;


  /**
   * Update a GroupProduct..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPupdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupProductObjectData update (HqGroupProductObjectData HQGPupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update a GroupProduct..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPupdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupProductObjectData update (BSDMSessionContext context, HqGroupProductObjectData HQGPupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param HQGPdeleteIn Input  Object.
   * @param ProductViewId.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupProductObjectData delete (HqGroupProductObjectData HQGPdeleteIn, Integer ProductViewId) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPdeleteIn Input  Object.
   * @param ProductViewId.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupProductObjectData delete (BSDMSessionContext context, HqGroupProductObjectData HQGPdeleteIn, Integer ProductViewId) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param HQGPdeleteIn Input  Object.
   * @param ProductViewId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupProductObjectData delete (HqGroupProductObjectData HQGPdeleteIn, Integer ProductViewId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPdeleteIn Input  Object.
   * @param ProductViewId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupProductObjectData delete (BSDMSessionContext context, HqGroupProductObjectData HQGPdeleteIn, Integer ProductViewId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete GroupProducts..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPdeleteListIn Input Filter Object.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (HqGroupProductObjectFilter HQGPdeleteListIn) throws BSDMResourceException;
  /**
   * Delete GroupProducts..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPdeleteListIn Input Filter Object.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, HqGroupProductObjectFilter HQGPdeleteListIn) throws BSDMResourceException;


  /**
   * Delete GroupProducts..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPdeleteListIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (HqGroupProductObjectFilter HQGPdeleteListIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete GroupProducts..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPdeleteListIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, HqGroupProductObjectFilter HQGPdeleteListIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
