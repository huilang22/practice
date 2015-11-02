
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
public interface GenderTypeInterface extends BaliInterface {

  /**
   * Get a unique GenderType row..
   * Convenience method using default BSDMSessionContext.
   * @param GGetIn Input Object Key.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GenderTypeObjectData get (GenderTypeObjectKeyData GGetIn) throws BSDMResourceException;
  /**
   * Get a unique GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GGetIn Input Object Key.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GenderTypeObjectData get (BSDMSessionContext context, GenderTypeObjectKeyData GGetIn) throws BSDMResourceException;


  /**
   * Get a unique GenderType row..
   * Convenience method using default BSDMSessionContext.
   * @param GGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GenderTypeObjectData get (GenderTypeObjectKeyData GGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GenderTypeObjectData get (BSDMSessionContext context, GenderTypeObjectKeyData GGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find GenderType rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GFindIn Input Filter Object.
   * @return GenderTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GenderTypeObjectDataList find (GenderTypeObjectFilter GFindIn) throws BSDMResourceException;
  /**
   * Find GenderType rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFindIn Input Filter Object.
   * @return GenderTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GenderTypeObjectDataList find (BSDMSessionContext context, GenderTypeObjectFilter GFindIn) throws BSDMResourceException;


  /**
   * Find GenderType rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GenderTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GenderTypeObjectDataList find (GenderTypeObjectFilter GFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find GenderType rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GenderTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GenderTypeObjectDataList find (BSDMSessionContext context, GenderTypeObjectFilter GFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a GenderType row..
   * Convenience method using default BSDMSessionContext.
   * @param GUpdateIn Input  Object.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GenderTypeObjectData update (GenderTypeObjectData GUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GUpdateIn Input  Object.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GenderTypeObjectData update (BSDMSessionContext context, GenderTypeObjectData GUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a GenderType row..
   * Convenience method using default BSDMSessionContext.
   * @param GUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GenderTypeObjectData update (GenderTypeObjectData GUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GenderTypeObjectData update (BSDMSessionContext context, GenderTypeObjectData GUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a unique GenderType row..
   * Convenience method using default BSDMSessionContext.
   * @param GDeleteIn Input Object Key.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GenderTypeObjectData delete (GenderTypeObjectKeyData GDeleteIn) throws BSDMResourceException;
  /**
   * Delete a unique GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GDeleteIn Input Object Key.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GenderTypeObjectData delete (BSDMSessionContext context, GenderTypeObjectKeyData GDeleteIn) throws BSDMResourceException;


  /**
   * Delete a unique GenderType row..
   * Convenience method using default BSDMSessionContext.
   * @param GDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GenderTypeObjectData delete (GenderTypeObjectKeyData GDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a unique GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GenderTypeObjectData delete (BSDMSessionContext context, GenderTypeObjectKeyData GDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new GenderType row..
   * Convenience method using default BSDMSessionContext.
   * @param GCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GenderTypeObjectData create (GenderTypeObjectData GCreateIn) throws BSDMResourceException;
  /**
   * Create a new GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GenderTypeObjectData create (BSDMSessionContext context, GenderTypeObjectData GCreateIn) throws BSDMResourceException;


  /**
   * Create a new GenderType row..
   * Convenience method using default BSDMSessionContext.
   * @param GCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GenderTypeObjectData create (GenderTypeObjectData GCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GenderTypeObjectData create (BSDMSessionContext context, GenderTypeObjectData GCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
