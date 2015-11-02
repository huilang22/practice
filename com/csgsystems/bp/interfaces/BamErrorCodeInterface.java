
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
public interface BamErrorCodeInterface extends BaliInterface {

  /**
   * Get a BamErrorCode..
   * Convenience method using default BSDMSessionContext.
   * @param BECGetIn Input Object Key.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BECObjectData get (BECObjectKeyData BECGetIn) throws BSDMResourceException;
  /**
   * Get a BamErrorCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECGetIn Input Object Key.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BECObjectData get (BSDMSessionContext context, BECObjectKeyData BECGetIn) throws BSDMResourceException;


  /**
   * Get a BamErrorCode..
   * Convenience method using default BSDMSessionContext.
   * @param BECGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BECObjectData get (BECObjectKeyData BECGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a BamErrorCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BECObjectData get (BSDMSessionContext context, BECObjectKeyData BECGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find BamErrorCodes..
   * Convenience method using default BSDMSessionContext.
   * @param BECFindIn Input Filter Object.
   * @return BECObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BECObjectDataList find (BECObjectFilter BECFindIn) throws BSDMResourceException;
  /**
   * Find BamErrorCodes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECFindIn Input Filter Object.
   * @return BECObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BECObjectDataList find (BSDMSessionContext context, BECObjectFilter BECFindIn) throws BSDMResourceException;


  /**
   * Find BamErrorCodes..
   * Convenience method using default BSDMSessionContext.
   * @param BECFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BECObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BECObjectDataList find (BECObjectFilter BECFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find BamErrorCodes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BECObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BECObjectDataList find (BSDMSessionContext context, BECObjectFilter BECFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a BamErrorCode row..
   * Convenience method using default BSDMSessionContext.
   * @param BECUpdateIn Input  Object.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BECObjectData update (BECObjectData BECUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a BamErrorCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECUpdateIn Input  Object.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BECObjectData update (BSDMSessionContext context, BECObjectData BECUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a BamErrorCode row..
   * Convenience method using default BSDMSessionContext.
   * @param BECUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BECObjectData update (BECObjectData BECUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a BamErrorCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BECObjectData update (BSDMSessionContext context, BECObjectData BECUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a BamErrorCode..
   * Convenience method using default BSDMSessionContext.
   * @param BECDeleteIn Input Object Key.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BECObjectData delete (BECObjectKeyData BECDeleteIn) throws BSDMResourceException;
  /**
   * Delete a BamErrorCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECDeleteIn Input Object Key.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BECObjectData delete (BSDMSessionContext context, BECObjectKeyData BECDeleteIn) throws BSDMResourceException;


  /**
   * Delete a BamErrorCode..
   * Convenience method using default BSDMSessionContext.
   * @param BECDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BECObjectData delete (BECObjectKeyData BECDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a BamErrorCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BECObjectData delete (BSDMSessionContext context, BECObjectKeyData BECDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a BamErrorCode..
   * Convenience method using default BSDMSessionContext.
   * @param BECCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BECObjectData create (BECObjectData BECCreateIn) throws BSDMResourceException;
  /**
   * Create a BamErrorCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BECObjectData create (BSDMSessionContext context, BECObjectData BECCreateIn) throws BSDMResourceException;


  /**
   * Create a BamErrorCode..
   * Convenience method using default BSDMSessionContext.
   * @param BECCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BECObjectData create (BECObjectData BECCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a BamErrorCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BECObjectData create (BSDMSessionContext context, BECObjectData BECCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
