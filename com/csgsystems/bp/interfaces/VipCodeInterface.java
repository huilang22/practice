
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
public interface VipCodeInterface extends BaliInterface {

  /**
   * Get a unique VipCode row..
   * Convenience method using default BSDMSessionContext.
   * @param VCGetIn Input Object Key.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VipCodeObjectData get (VipCodeObjectKeyData VCGetIn) throws BSDMResourceException;
  /**
   * Get a unique VipCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCGetIn Input Object Key.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VipCodeObjectData get (BSDMSessionContext context, VipCodeObjectKeyData VCGetIn) throws BSDMResourceException;


  /**
   * Get a unique VipCode row..
   * Convenience method using default BSDMSessionContext.
   * @param VCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VipCodeObjectData get (VipCodeObjectKeyData VCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique VipCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VipCodeObjectData get (BSDMSessionContext context, VipCodeObjectKeyData VCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find VipCode's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VCFindIn Input Filter Object.
   * @return VipCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VipCodeObjectDataList find (VipCodeObjectFilter VCFindIn) throws BSDMResourceException;
  /**
   * Find VipCode's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCFindIn Input Filter Object.
   * @return VipCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VipCodeObjectDataList find (BSDMSessionContext context, VipCodeObjectFilter VCFindIn) throws BSDMResourceException;


  /**
   * Find VipCode's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VipCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VipCodeObjectDataList find (VipCodeObjectFilter VCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find VipCode's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VipCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VipCodeObjectDataList find (BSDMSessionContext context, VipCodeObjectFilter VCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non key fields of a VipCode..
   * Convenience method using default BSDMSessionContext.
   * @param VCUpdateIn Input  Object.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VipCodeObjectData update (VipCodeObjectData VCUpdateIn) throws BSDMResourceException;
  /**
   * Update non key fields of a VipCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCUpdateIn Input  Object.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VipCodeObjectData update (BSDMSessionContext context, VipCodeObjectData VCUpdateIn) throws BSDMResourceException;


  /**
   * Update non key fields of a VipCode..
   * Convenience method using default BSDMSessionContext.
   * @param VCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VipCodeObjectData update (VipCodeObjectData VCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non key fields of a VipCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VipCodeObjectData update (BSDMSessionContext context, VipCodeObjectData VCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a VipCode..
   * Convenience method using default BSDMSessionContext.
   * @param VCDeleteIn Input Object Key.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VipCodeObjectData delete (VipCodeObjectKeyData VCDeleteIn) throws BSDMResourceException;
  /**
   * Delete a VipCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCDeleteIn Input Object Key.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VipCodeObjectData delete (BSDMSessionContext context, VipCodeObjectKeyData VCDeleteIn) throws BSDMResourceException;


  /**
   * Delete a VipCode..
   * Convenience method using default BSDMSessionContext.
   * @param VCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VipCodeObjectData delete (VipCodeObjectKeyData VCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a VipCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VipCodeObjectData delete (BSDMSessionContext context, VipCodeObjectKeyData VCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new VipCode..
   * Convenience method using default BSDMSessionContext.
   * @param VCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VipCodeObjectData create (VipCodeObjectData VCCreateIn) throws BSDMResourceException;
  /**
   * Create a new VipCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VipCodeObjectData create (BSDMSessionContext context, VipCodeObjectData VCCreateIn) throws BSDMResourceException;


  /**
   * Create a new VipCode..
   * Convenience method using default BSDMSessionContext.
   * @param VCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VipCodeObjectData create (VipCodeObjectData VCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new VipCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VipCodeObjectData create (BSDMSessionContext context, VipCodeObjectData VCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
