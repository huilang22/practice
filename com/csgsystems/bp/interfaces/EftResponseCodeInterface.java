
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
public interface EftResponseCodeInterface extends BaliInterface {

  /**
   * Get a unique EftResponseCode row..
   * Convenience method using default BSDMSessionContext.
   * @param ERCGetIn Input Object Key.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftResponseCodeObjectData get (EftResponseCodeObjectKeyData ERCGetIn) throws BSDMResourceException;
  /**
   * Get a unique EftResponseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCGetIn Input Object Key.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftResponseCodeObjectData get (BSDMSessionContext context, EftResponseCodeObjectKeyData ERCGetIn) throws BSDMResourceException;


  /**
   * Get a unique EftResponseCode row..
   * Convenience method using default BSDMSessionContext.
   * @param ERCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EftResponseCodeObjectData get (EftResponseCodeObjectKeyData ERCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique EftResponseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EftResponseCodeObjectData get (BSDMSessionContext context, EftResponseCodeObjectKeyData ERCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find EftResponseCode's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ERCFindIn Input Filter Object.
   * @return EftResponseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftResponseCodeObjectDataList find (EftResponseCodeObjectFilter ERCFindIn) throws BSDMResourceException;
  /**
   * Find EftResponseCode's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCFindIn Input Filter Object.
   * @return EftResponseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftResponseCodeObjectDataList find (BSDMSessionContext context, EftResponseCodeObjectFilter ERCFindIn) throws BSDMResourceException;


  /**
   * Find EftResponseCode's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ERCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftResponseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EftResponseCodeObjectDataList find (EftResponseCodeObjectFilter ERCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find EftResponseCode's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftResponseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EftResponseCodeObjectDataList find (BSDMSessionContext context, EftResponseCodeObjectFilter ERCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non key fields of a EftResponseCode..
   * Convenience method using default BSDMSessionContext.
   * @param ERCUpdateIn Input  Object.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftResponseCodeObjectData update (EftResponseCodeObjectData ERCUpdateIn) throws BSDMResourceException;
  /**
   * Update non key fields of a EftResponseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCUpdateIn Input  Object.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftResponseCodeObjectData update (BSDMSessionContext context, EftResponseCodeObjectData ERCUpdateIn) throws BSDMResourceException;


  /**
   * Update non key fields of a EftResponseCode..
   * Convenience method using default BSDMSessionContext.
   * @param ERCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EftResponseCodeObjectData update (EftResponseCodeObjectData ERCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non key fields of a EftResponseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EftResponseCodeObjectData update (BSDMSessionContext context, EftResponseCodeObjectData ERCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a EftResponseCode..
   * Convenience method using default BSDMSessionContext.
   * @param ERCDeleteIn Input Object Key.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftResponseCodeObjectData delete (EftResponseCodeObjectKeyData ERCDeleteIn) throws BSDMResourceException;
  /**
   * Delete a EftResponseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCDeleteIn Input Object Key.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftResponseCodeObjectData delete (BSDMSessionContext context, EftResponseCodeObjectKeyData ERCDeleteIn) throws BSDMResourceException;


  /**
   * Delete a EftResponseCode..
   * Convenience method using default BSDMSessionContext.
   * @param ERCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EftResponseCodeObjectData delete (EftResponseCodeObjectKeyData ERCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a EftResponseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EftResponseCodeObjectData delete (BSDMSessionContext context, EftResponseCodeObjectKeyData ERCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new EftResponseCode..
   * Convenience method using default BSDMSessionContext.
   * @param ERCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftResponseCodeObjectData create (EftResponseCodeObjectData ERCCreateIn) throws BSDMResourceException;
  /**
   * Create a new EftResponseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EftResponseCodeObjectData create (BSDMSessionContext context, EftResponseCodeObjectData ERCCreateIn) throws BSDMResourceException;


  /**
   * Create a new EftResponseCode..
   * Convenience method using default BSDMSessionContext.
   * @param ERCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EftResponseCodeObjectData create (EftResponseCodeObjectData ERCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new EftResponseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EftResponseCodeObjectData create (BSDMSessionContext context, EftResponseCodeObjectData ERCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
