
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
public interface PrivacyLevelInterface extends BaliInterface {

  /**
   * Get a unique PrivacyLevel..
   * Convenience method using default BSDMSessionContext.
   * @param PLGetIn Input Object Key.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrivacyLevelObjectData get (PrivacyLevelObjectKeyData PLGetIn) throws BSDMResourceException;
  /**
   * Get a unique PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLGetIn Input Object Key.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrivacyLevelObjectData get (BSDMSessionContext context, PrivacyLevelObjectKeyData PLGetIn) throws BSDMResourceException;


  /**
   * Get a unique PrivacyLevel..
   * Convenience method using default BSDMSessionContext.
   * @param PLGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PrivacyLevelObjectData get (PrivacyLevelObjectKeyData PLGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PrivacyLevelObjectData get (BSDMSessionContext context, PrivacyLevelObjectKeyData PLGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find PrivacyLevel's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PLFindIn Input Filter Object.
   * @return PrivacyLevelObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrivacyLevelObjectDataList find (PrivacyLevelObjectFilter PLFindIn) throws BSDMResourceException;
  /**
   * Find PrivacyLevel's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLFindIn Input Filter Object.
   * @return PrivacyLevelObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrivacyLevelObjectDataList find (BSDMSessionContext context, PrivacyLevelObjectFilter PLFindIn) throws BSDMResourceException;


  /**
   * Find PrivacyLevel's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PLFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrivacyLevelObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PrivacyLevelObjectDataList find (PrivacyLevelObjectFilter PLFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find PrivacyLevel's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrivacyLevelObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PrivacyLevelObjectDataList find (BSDMSessionContext context, PrivacyLevelObjectFilter PLFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of a PrivacyLevel..
   * Convenience method using default BSDMSessionContext.
   * @param PLUpdateIn Input  Object.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrivacyLevelObjectData update (PrivacyLevelObjectData PLUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of a PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLUpdateIn Input  Object.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrivacyLevelObjectData update (BSDMSessionContext context, PrivacyLevelObjectData PLUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of a PrivacyLevel..
   * Convenience method using default BSDMSessionContext.
   * @param PLUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PrivacyLevelObjectData update (PrivacyLevelObjectData PLUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of a PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PrivacyLevelObjectData update (BSDMSessionContext context, PrivacyLevelObjectData PLUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a PrivacyLevel..
   * Convenience method using default BSDMSessionContext.
   * @param PLDeleteIn Input Object Key.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrivacyLevelObjectData delete (PrivacyLevelObjectKeyData PLDeleteIn) throws BSDMResourceException;
  /**
   * Delete a PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLDeleteIn Input Object Key.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrivacyLevelObjectData delete (BSDMSessionContext context, PrivacyLevelObjectKeyData PLDeleteIn) throws BSDMResourceException;


  /**
   * Delete a PrivacyLevel..
   * Convenience method using default BSDMSessionContext.
   * @param PLDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PrivacyLevelObjectData delete (PrivacyLevelObjectKeyData PLDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PrivacyLevelObjectData delete (BSDMSessionContext context, PrivacyLevelObjectKeyData PLDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new PrivacyLevel..
   * Convenience method using default BSDMSessionContext.
   * @param PLCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrivacyLevelObjectData create (PrivacyLevelObjectData PLCreateIn) throws BSDMResourceException;
  /**
   * Create a new PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrivacyLevelObjectData create (BSDMSessionContext context, PrivacyLevelObjectData PLCreateIn) throws BSDMResourceException;


  /**
   * Create a new PrivacyLevel..
   * Convenience method using default BSDMSessionContext.
   * @param PLCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PrivacyLevelObjectData create (PrivacyLevelObjectData PLCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PrivacyLevelObjectData create (BSDMSessionContext context, PrivacyLevelObjectData PLCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
