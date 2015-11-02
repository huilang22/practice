
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
public interface HqGroupCorridorInterface extends BaliInterface {

  /**
   * Retrieve a unique Group Corridor..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCgetIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupCorridorObjectData get (HqGroupCorridorObjectData HQGCgetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique Group Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCgetIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupCorridorObjectData get (BSDMSessionContext context, HqGroupCorridorObjectData HQGCgetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique Group Corridor..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCgetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupCorridorObjectData get (HqGroupCorridorObjectData HQGCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique Group Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCgetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupCorridorObjectData get (BSDMSessionContext context, HqGroupCorridorObjectData HQGCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Group Corridor's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCfindIn Input Filter Object.
   * @return HqGroupCorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupCorridorObjectDataList find (HqGroupCorridorObjectFilter HQGCfindIn) throws BSDMResourceException;
  /**
   * Find Group Corridor's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCfindIn Input Filter Object.
   * @return HqGroupCorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupCorridorObjectDataList find (BSDMSessionContext context, HqGroupCorridorObjectFilter HQGCfindIn) throws BSDMResourceException;


  /**
   * Find Group Corridor's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupCorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupCorridorObjectDataList find (HqGroupCorridorObjectFilter HQGCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Group Corridor's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupCorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupCorridorObjectDataList find (BSDMSessionContext context, HqGroupCorridorObjectFilter HQGCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new Group Corridor row..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCcreateIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupCorridorObjectData create (HqGroupCorridorObjectData HQGCcreateIn) throws BSDMResourceException;
  /**
   * Create a new Group Corridor row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCcreateIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupCorridorObjectData create (BSDMSessionContext context, HqGroupCorridorObjectData HQGCcreateIn) throws BSDMResourceException;


  /**
   * Create a new Group Corridor row..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCcreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupCorridorObjectData create (HqGroupCorridorObjectData HQGCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Group Corridor row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCcreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupCorridorObjectData create (BSDMSessionContext context, HqGroupCorridorObjectData HQGCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update a GroupCorridor..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCupdateIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupCorridorObjectData update (HqGroupCorridorObjectData HQGCupdateIn) throws BSDMResourceException;
  /**
   * Update a GroupCorridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCupdateIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupCorridorObjectData update (BSDMSessionContext context, HqGroupCorridorObjectData HQGCupdateIn) throws BSDMResourceException;


  /**
   * Update a GroupCorridor..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCupdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupCorridorObjectData update (HqGroupCorridorObjectData HQGCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update a GroupCorridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCupdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupCorridorObjectData update (BSDMSessionContext context, HqGroupCorridorObjectData HQGCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param HQGCdeleteIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupCorridorObjectData delete (HqGroupCorridorObjectData HQGCdeleteIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCdeleteIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupCorridorObjectData delete (BSDMSessionContext context, HqGroupCorridorObjectData HQGCdeleteIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param HQGCdeleteIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupCorridorObjectData delete (HqGroupCorridorObjectData HQGCdeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCdeleteIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupCorridorObjectData delete (BSDMSessionContext context, HqGroupCorridorObjectData HQGCdeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete HQGroupCorridors..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCdeleteListIn Input Filter Object.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (HqGroupCorridorObjectFilter HQGCdeleteListIn) throws BSDMResourceException;
  /**
   * Delete HQGroupCorridors..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCdeleteListIn Input Filter Object.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, HqGroupCorridorObjectFilter HQGCdeleteListIn) throws BSDMResourceException;


  /**
   * Delete HQGroupCorridors..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCdeleteListIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (HqGroupCorridorObjectFilter HQGCdeleteListIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete HQGroupCorridors..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCdeleteListIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, HqGroupCorridorObjectFilter HQGCdeleteListIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
