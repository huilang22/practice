
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
public interface ExtendedDataEnumerationInterface extends BaliInterface {

  /**
   * Get a unique ExtendedDataEnumeration row..
   * Convenience method using default BSDMSessionContext.
   * @param EDGetIn Input Object Key.
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EDObjectData get (EDObjectKeyData EDGetIn) throws BSDMResourceException;
  /**
   * Get a unique ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDGetIn Input Object Key.
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EDObjectData get (BSDMSessionContext context, EDObjectKeyData EDGetIn) throws BSDMResourceException;


  /**
   * Get a unique ExtendedDataEnumeration row..
   * Convenience method using default BSDMSessionContext.
   * @param EDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EDObjectData get (EDObjectKeyData EDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EDObjectData get (BSDMSessionContext context, EDObjectKeyData EDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ExtendedDataEnumeration's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param EDFindIn Input Filter Object.
   * @return EDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EDObjectDataList find (EDObjectFilter EDFindIn) throws BSDMResourceException;
  /**
   * Find ExtendedDataEnumeration's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDFindIn Input Filter Object.
   * @return EDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EDObjectDataList find (BSDMSessionContext context, EDObjectFilter EDFindIn) throws BSDMResourceException;


  /**
   * Find ExtendedDataEnumeration's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param EDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EDObjectDataList find (EDObjectFilter EDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ExtendedDataEnumeration's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EDObjectDataList find (BSDMSessionContext context, EDObjectFilter EDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of an ExtendedDataEnumeration row..
   * Convenience method using default BSDMSessionContext.
   * @param EDUpdateIn Input  Object.
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EDObjectData update (EDObjectData EDUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of an ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDUpdateIn Input  Object.
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EDObjectData update (BSDMSessionContext context, EDObjectData EDUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of an ExtendedDataEnumeration row..
   * Convenience method using default BSDMSessionContext.
   * @param EDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EDObjectData update (EDObjectData EDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of an ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EDObjectData update (BSDMSessionContext context, EDObjectData EDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete an ExtendedDataEnumeration row..
   * Convenience method using default BSDMSessionContext.
   * @param EDDeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void delete (EDObjectKeyData EDDeleteIn) throws BSDMResourceException;
  /**
   * Delete an ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDDeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void delete (BSDMSessionContext context, EDObjectKeyData EDDeleteIn) throws BSDMResourceException;


  /**
   * Delete an ExtendedDataEnumeration row..
   * Convenience method using default BSDMSessionContext.
   * @param EDDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void delete (EDObjectKeyData EDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete an ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void delete (BSDMSessionContext context, EDObjectKeyData EDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new ExtendedDataEnumeration row..
   * Convenience method using default BSDMSessionContext.
   * @param EDCreateIn Input  Object.
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EDObjectData create (EDObjectData EDCreateIn) throws BSDMResourceException;
  /**
   * Create a new ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDCreateIn Input  Object.
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EDObjectData create (BSDMSessionContext context, EDObjectData EDCreateIn) throws BSDMResourceException;


  /**
   * Create a new ExtendedDataEnumeration row..
   * Convenience method using default BSDMSessionContext.
   * @param EDCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EDObjectData create (EDObjectData EDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new ExtendedDataEnumeration row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EDObjectData create (BSDMSessionContext context, EDObjectData EDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
