
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
public interface CsrGroupFunctionInterface extends BaliInterface {

  /**
   * Retrieve a unique CsrGroupFunction row..
   * Convenience method using default BSDMSessionContext.
   * @param GFGetIn Input Object Key.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupFunctionObjectData get (CsrGroupFunctionObjectKeyData GFGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique CsrGroupFunction row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFGetIn Input Object Key.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupFunctionObjectData get (BSDMSessionContext context, CsrGroupFunctionObjectKeyData GFGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique CsrGroupFunction row..
   * Convenience method using default BSDMSessionContext.
   * @param GFGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrGroupFunctionObjectData get (CsrGroupFunctionObjectKeyData GFGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique CsrGroupFunction row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrGroupFunctionObjectData get (BSDMSessionContext context, CsrGroupFunctionObjectKeyData GFGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CsrGroupFunction rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GFFindIn Input Filter Object.
   * @return CsrGroupFunctionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupFunctionObjectDataList find (CsrGroupFunctionObjectFilter GFFindIn) throws BSDMResourceException;
  /**
   * Find CsrGroupFunction rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFFindIn Input Filter Object.
   * @return CsrGroupFunctionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupFunctionObjectDataList find (BSDMSessionContext context, CsrGroupFunctionObjectFilter GFFindIn) throws BSDMResourceException;


  /**
   * Find CsrGroupFunction rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GFFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupFunctionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrGroupFunctionObjectDataList find (CsrGroupFunctionObjectFilter GFFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CsrGroupFunction rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupFunctionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrGroupFunctionObjectDataList find (BSDMSessionContext context, CsrGroupFunctionObjectFilter GFFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a CsrGroupFunction..
   * Convenience method using default BSDMSessionContext.
   * @param GFUpdateIn Input  Object.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupFunctionObjectData update (CsrGroupFunctionObjectData GFUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a CsrGroupFunction..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFUpdateIn Input  Object.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupFunctionObjectData update (BSDMSessionContext context, CsrGroupFunctionObjectData GFUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a CsrGroupFunction..
   * Convenience method using default BSDMSessionContext.
   * @param GFUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrGroupFunctionObjectData update (CsrGroupFunctionObjectData GFUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a CsrGroupFunction..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrGroupFunctionObjectData update (BSDMSessionContext context, CsrGroupFunctionObjectData GFUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a CsrGroupFunction row..
   * Convenience method using default BSDMSessionContext.
   * @param GFDeleteIn Input Object Key.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupFunctionObjectData delete (CsrGroupFunctionObjectKeyData GFDeleteIn) throws BSDMResourceException;
  /**
   * Delete a CsrGroupFunction row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFDeleteIn Input Object Key.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupFunctionObjectData delete (BSDMSessionContext context, CsrGroupFunctionObjectKeyData GFDeleteIn) throws BSDMResourceException;


  /**
   * Delete a CsrGroupFunction row..
   * Convenience method using default BSDMSessionContext.
   * @param GFDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrGroupFunctionObjectData delete (CsrGroupFunctionObjectKeyData GFDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a CsrGroupFunction row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrGroupFunctionObjectData delete (BSDMSessionContext context, CsrGroupFunctionObjectKeyData GFDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new CsrGroupFunction row..
   * Convenience method using default BSDMSessionContext.
   * @param GFCreateIn Input  Object.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupFunctionObjectData create (CsrGroupFunctionObjectData GFCreateIn) throws BSDMResourceException;
  /**
   * Create a new CsrGroupFunction row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFCreateIn Input  Object.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupFunctionObjectData create (BSDMSessionContext context, CsrGroupFunctionObjectData GFCreateIn) throws BSDMResourceException;


  /**
   * Create a new CsrGroupFunction row..
   * Convenience method using default BSDMSessionContext.
   * @param GFCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrGroupFunctionObjectData create (CsrGroupFunctionObjectData GFCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new CsrGroupFunction row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrGroupFunctionObjectData create (BSDMSessionContext context, CsrGroupFunctionObjectData GFCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
