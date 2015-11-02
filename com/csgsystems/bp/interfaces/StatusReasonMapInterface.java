
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
public interface StatusReasonMapInterface extends BaliInterface {

  /**
   * Get a unique StatusReasonMap row..
   * Convenience method using default BSDMSessionContext.
   * @param SRMGetIn Input Object Key.
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SRMObjectData get (SRMObjectKeyData SRMGetIn) throws BSDMResourceException;
  /**
   * Get a unique StatusReasonMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SRMGetIn Input Object Key.
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SRMObjectData get (BSDMSessionContext context, SRMObjectKeyData SRMGetIn) throws BSDMResourceException;


  /**
   * Get a unique StatusReasonMap row..
   * Convenience method using default BSDMSessionContext.
   * @param SRMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SRMObjectData get (SRMObjectKeyData SRMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique StatusReasonMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SRMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SRMObjectData get (BSDMSessionContext context, SRMObjectKeyData SRMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find StatusReasonMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SRMFindIn Input Filter Object.
   * @return SRMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SRMObjectDataList find (SRMObjectFilter SRMFindIn) throws BSDMResourceException;
  /**
   * Find StatusReasonMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SRMFindIn Input Filter Object.
   * @return SRMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SRMObjectDataList find (BSDMSessionContext context, SRMObjectFilter SRMFindIn) throws BSDMResourceException;


  /**
   * Find StatusReasonMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SRMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SRMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SRMObjectDataList find (SRMObjectFilter SRMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find StatusReasonMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SRMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SRMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SRMObjectDataList find (BSDMSessionContext context, SRMObjectFilter SRMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new StatusReasonMap row..
   * Convenience method using default BSDMSessionContext.
   * @param SRMCreateIn Input  Object.  Defaulted Fields: LanguageCode.
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SRMObjectData create (SRMObjectData SRMCreateIn) throws BSDMResourceException;
  /**
   * Create a new StatusReasonMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SRMCreateIn Input  Object.  Defaulted Fields: LanguageCode.
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SRMObjectData create (BSDMSessionContext context, SRMObjectData SRMCreateIn) throws BSDMResourceException;


  /**
   * Create a new StatusReasonMap row..
   * Convenience method using default BSDMSessionContext.
   * @param SRMCreateIn Input  Object.  Defaulted Fields: LanguageCode.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SRMObjectData create (SRMObjectData SRMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new StatusReasonMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SRMCreateIn Input  Object.  Defaulted Fields: LanguageCode.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SRMObjectData create (BSDMSessionContext context, SRMObjectData SRMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
