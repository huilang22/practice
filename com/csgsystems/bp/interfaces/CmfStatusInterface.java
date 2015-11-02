
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
public interface CmfStatusInterface extends BaliInterface {

  /**
   * Get a CmfStatus row..
   * Convenience method using default BSDMSessionContext.
   * @param CSGetIn Input Object Key.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusObjectData get (CmfStatusObjectKeyData CSGetIn) throws BSDMResourceException;
  /**
   * Get a CmfStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSGetIn Input Object Key.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusObjectData get (BSDMSessionContext context, CmfStatusObjectKeyData CSGetIn) throws BSDMResourceException;


  /**
   * Get a CmfStatus row..
   * Convenience method using default BSDMSessionContext.
   * @param CSGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfStatusObjectData get (CmfStatusObjectKeyData CSGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a CmfStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfStatusObjectData get (BSDMSessionContext context, CmfStatusObjectKeyData CSGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CmfStatus' that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CSFindIn Input Filter Object.
   * @return CmfStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusObjectDataList find (CmfStatusObjectFilter CSFindIn) throws BSDMResourceException;
  /**
   * Find CmfStatus' that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSFindIn Input Filter Object.
   * @return CmfStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusObjectDataList find (BSDMSessionContext context, CmfStatusObjectFilter CSFindIn) throws BSDMResourceException;


  /**
   * Find CmfStatus' that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CSFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfStatusObjectDataList find (CmfStatusObjectFilter CSFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CmfStatus' that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfStatusObjectDataList find (BSDMSessionContext context, CmfStatusObjectFilter CSFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a CmfStatus row..
   * Convenience method using default BSDMSessionContext.
   * @param CSUpdateIn Input  Object.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusObjectData update (CmfStatusObjectData CSUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a CmfStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSUpdateIn Input  Object.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusObjectData update (BSDMSessionContext context, CmfStatusObjectData CSUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a CmfStatus row..
   * Convenience method using default BSDMSessionContext.
   * @param CSUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfStatusObjectData update (CmfStatusObjectData CSUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a CmfStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfStatusObjectData update (BSDMSessionContext context, CmfStatusObjectData CSUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a CmfStatus row..
   * Convenience method using default BSDMSessionContext.
   * @param CSDeleteIn Input Object Key.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusObjectData delete (CmfStatusObjectKeyData CSDeleteIn) throws BSDMResourceException;
  /**
   * Delete a CmfStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSDeleteIn Input Object Key.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusObjectData delete (BSDMSessionContext context, CmfStatusObjectKeyData CSDeleteIn) throws BSDMResourceException;


  /**
   * Delete a CmfStatus row..
   * Convenience method using default BSDMSessionContext.
   * @param CSDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfStatusObjectData delete (CmfStatusObjectKeyData CSDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a CmfStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfStatusObjectData delete (BSDMSessionContext context, CmfStatusObjectKeyData CSDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a CmfStatus..
   * Convenience method using default BSDMSessionContext.
   * @param CSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusObjectData create (CmfStatusObjectData CSCreateIn) throws BSDMResourceException;
  /**
   * Create a CmfStatus..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusObjectData create (BSDMSessionContext context, CmfStatusObjectData CSCreateIn) throws BSDMResourceException;


  /**
   * Create a CmfStatus..
   * Convenience method using default BSDMSessionContext.
   * @param CSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfStatusObjectData create (CmfStatusObjectData CSCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a CmfStatus..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfStatusObjectData create (BSDMSessionContext context, CmfStatusObjectData CSCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
