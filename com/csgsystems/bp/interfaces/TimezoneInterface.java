
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
public interface TimezoneInterface extends BaliInterface {

  /**
   * Get a unique Timezone..
   * Convenience method using default BSDMSessionContext.
   * @param TZGetIn Input Object Key.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TimezoneObjectData get (TimezoneObjectKeyData TZGetIn) throws BSDMResourceException;
  /**
   * Get a unique Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZGetIn Input Object Key.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TimezoneObjectData get (BSDMSessionContext context, TimezoneObjectKeyData TZGetIn) throws BSDMResourceException;


  /**
   * Get a unique Timezone..
   * Convenience method using default BSDMSessionContext.
   * @param TZGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TimezoneObjectData get (TimezoneObjectKeyData TZGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TimezoneObjectData get (BSDMSessionContext context, TimezoneObjectKeyData TZGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Timezone's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TZFindIn Input Filter Object.
   * @return TimezoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TimezoneObjectDataList find (TimezoneObjectFilter TZFindIn) throws BSDMResourceException;
  /**
   * Find Timezone's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZFindIn Input Filter Object.
   * @return TimezoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TimezoneObjectDataList find (BSDMSessionContext context, TimezoneObjectFilter TZFindIn) throws BSDMResourceException;


  /**
   * Find Timezone's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TZFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TimezoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TimezoneObjectDataList find (TimezoneObjectFilter TZFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Timezone's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TimezoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TimezoneObjectDataList find (BSDMSessionContext context, TimezoneObjectFilter TZFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of a Timezone..
   * Convenience method using default BSDMSessionContext.
   * @param TZUpdateIn Input  Object.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TimezoneObjectData update (TimezoneObjectData TZUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of a Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZUpdateIn Input  Object.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TimezoneObjectData update (BSDMSessionContext context, TimezoneObjectData TZUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of a Timezone..
   * Convenience method using default BSDMSessionContext.
   * @param TZUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TimezoneObjectData update (TimezoneObjectData TZUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of a Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TimezoneObjectData update (BSDMSessionContext context, TimezoneObjectData TZUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a Timezone..
   * Convenience method using default BSDMSessionContext.
   * @param TZDeleteIn Input Object Key.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TimezoneObjectData delete (TimezoneObjectKeyData TZDeleteIn) throws BSDMResourceException;
  /**
   * Delete a Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZDeleteIn Input Object Key.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TimezoneObjectData delete (BSDMSessionContext context, TimezoneObjectKeyData TZDeleteIn) throws BSDMResourceException;


  /**
   * Delete a Timezone..
   * Convenience method using default BSDMSessionContext.
   * @param TZDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TimezoneObjectData delete (TimezoneObjectKeyData TZDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TimezoneObjectData delete (BSDMSessionContext context, TimezoneObjectKeyData TZDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new Timezone..
   * Convenience method using default BSDMSessionContext.
   * @param TZCreateIn Input  Object.  Defaulted Fields: Isdst, IsDefault, IsInternal.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TimezoneObjectData create (TimezoneObjectData TZCreateIn) throws BSDMResourceException;
  /**
   * Create a new Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZCreateIn Input  Object.  Defaulted Fields: Isdst, IsDefault, IsInternal.
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TimezoneObjectData create (BSDMSessionContext context, TimezoneObjectData TZCreateIn) throws BSDMResourceException;


  /**
   * Create a new Timezone..
   * Convenience method using default BSDMSessionContext.
   * @param TZCreateIn Input  Object.  Defaulted Fields: Isdst, IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TimezoneObjectData create (TimezoneObjectData TZCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Timezone..
   * @param context The session context to use when connecting to the APITS server.
   * @param TZCreateIn Input  Object.  Defaulted Fields: Isdst, IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TimezoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TimezoneObjectData create (BSDMSessionContext context, TimezoneObjectData TZCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
