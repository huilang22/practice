
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
public interface RevRcvCostCenterInterface extends BaliInterface {

  /**
   * Retrieve a unique RevRcvCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCGetIn Input Object Key.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RevRcvCostCenterObjectData get (RevRcvCostCenterObjectKeyData RRCCGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique RevRcvCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCGetIn Input Object Key.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RevRcvCostCenterObjectData get (BSDMSessionContext context, RevRcvCostCenterObjectKeyData RRCCGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique RevRcvCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RevRcvCostCenterObjectData get (RevRcvCostCenterObjectKeyData RRCCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique RevRcvCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RevRcvCostCenterObjectData get (BSDMSessionContext context, RevRcvCostCenterObjectKeyData RRCCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find RevRcvCostCenter's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCFindIn Input Filter Object.
   * @return RevRcvCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RevRcvCostCenterObjectDataList find (RevRcvCostCenterObjectFilter RRCCFindIn) throws BSDMResourceException;
  /**
   * Find RevRcvCostCenter's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCFindIn Input Filter Object.
   * @return RevRcvCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RevRcvCostCenterObjectDataList find (BSDMSessionContext context, RevRcvCostCenterObjectFilter RRCCFindIn) throws BSDMResourceException;


  /**
   * Find RevRcvCostCenter's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RevRcvCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RevRcvCostCenterObjectDataList find (RevRcvCostCenterObjectFilter RRCCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find RevRcvCostCenter's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RevRcvCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RevRcvCostCenterObjectDataList find (BSDMSessionContext context, RevRcvCostCenterObjectFilter RRCCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields for a RevRcvCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCUpdateIn Input  Object.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RevRcvCostCenterObjectData update (RevRcvCostCenterObjectData RRCCUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields for a RevRcvCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCUpdateIn Input  Object.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RevRcvCostCenterObjectData update (BSDMSessionContext context, RevRcvCostCenterObjectData RRCCUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields for a RevRcvCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RevRcvCostCenterObjectData update (RevRcvCostCenterObjectData RRCCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields for a RevRcvCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RevRcvCostCenterObjectData update (BSDMSessionContext context, RevRcvCostCenterObjectData RRCCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a RevRcvCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCDeleteIn Input Object Key.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RevRcvCostCenterObjectData delete (RevRcvCostCenterObjectKeyData RRCCDeleteIn) throws BSDMResourceException;
  /**
   * Delete a RevRcvCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCDeleteIn Input Object Key.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RevRcvCostCenterObjectData delete (BSDMSessionContext context, RevRcvCostCenterObjectKeyData RRCCDeleteIn) throws BSDMResourceException;


  /**
   * Delete a RevRcvCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RevRcvCostCenterObjectData delete (RevRcvCostCenterObjectKeyData RRCCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a RevRcvCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RevRcvCostCenterObjectData delete (BSDMSessionContext context, RevRcvCostCenterObjectKeyData RRCCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new RevRcvCostCenter..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RevRcvCostCenterObjectData create (RevRcvCostCenterObjectData RRCCCreateIn) throws BSDMResourceException;
  /**
   * Create a new RevRcvCostCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RevRcvCostCenterObjectData create (BSDMSessionContext context, RevRcvCostCenterObjectData RRCCCreateIn) throws BSDMResourceException;


  /**
   * Create a new RevRcvCostCenter..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RevRcvCostCenterObjectData create (RevRcvCostCenterObjectData RRCCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new RevRcvCostCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RevRcvCostCenterObjectData create (BSDMSessionContext context, RevRcvCostCenterObjectData RRCCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
