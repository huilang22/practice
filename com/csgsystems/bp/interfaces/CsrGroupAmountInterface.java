
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
public interface CsrGroupAmountInterface extends BaliInterface {

  /**
   * Retrieve a unique CsrGroupAmount row..
   * Convenience method using default BSDMSessionContext.
   * @param GAGetIn Input Object Key.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupAmountObjectData get (CsrGroupAmountObjectKeyData GAGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique CsrGroupAmount row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GAGetIn Input Object Key.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupAmountObjectData get (BSDMSessionContext context, CsrGroupAmountObjectKeyData GAGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique CsrGroupAmount row..
   * Convenience method using default BSDMSessionContext.
   * @param GAGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrGroupAmountObjectData get (CsrGroupAmountObjectKeyData GAGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique CsrGroupAmount row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GAGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrGroupAmountObjectData get (BSDMSessionContext context, CsrGroupAmountObjectKeyData GAGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CsrGroupAmount rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GAFindIn Input Filter Object.
   * @return CsrGroupAmountObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupAmountObjectDataList find (CsrGroupAmountObjectFilter GAFindIn) throws BSDMResourceException;
  /**
   * Find CsrGroupAmount rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GAFindIn Input Filter Object.
   * @return CsrGroupAmountObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupAmountObjectDataList find (BSDMSessionContext context, CsrGroupAmountObjectFilter GAFindIn) throws BSDMResourceException;


  /**
   * Find CsrGroupAmount rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GAFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupAmountObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrGroupAmountObjectDataList find (CsrGroupAmountObjectFilter GAFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CsrGroupAmount rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GAFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupAmountObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrGroupAmountObjectDataList find (BSDMSessionContext context, CsrGroupAmountObjectFilter GAFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a CsrGroupAmount..
   * Convenience method using default BSDMSessionContext.
   * @param GAUpdateIn Input  Object.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupAmountObjectData update (CsrGroupAmountObjectData GAUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a CsrGroupAmount..
   * @param context The session context to use when connecting to the APITS server.
   * @param GAUpdateIn Input  Object.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupAmountObjectData update (BSDMSessionContext context, CsrGroupAmountObjectData GAUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a CsrGroupAmount..
   * Convenience method using default BSDMSessionContext.
   * @param GAUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrGroupAmountObjectData update (CsrGroupAmountObjectData GAUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a CsrGroupAmount..
   * @param context The session context to use when connecting to the APITS server.
   * @param GAUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrGroupAmountObjectData update (BSDMSessionContext context, CsrGroupAmountObjectData GAUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a CsrGroupAmount row..
   * Convenience method using default BSDMSessionContext.
   * @param GADeleteIn Input Object Key.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupAmountObjectData delete (CsrGroupAmountObjectKeyData GADeleteIn) throws BSDMResourceException;
  /**
   * Delete a CsrGroupAmount row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GADeleteIn Input Object Key.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupAmountObjectData delete (BSDMSessionContext context, CsrGroupAmountObjectKeyData GADeleteIn) throws BSDMResourceException;


  /**
   * Delete a CsrGroupAmount row..
   * Convenience method using default BSDMSessionContext.
   * @param GADeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrGroupAmountObjectData delete (CsrGroupAmountObjectKeyData GADeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a CsrGroupAmount row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GADeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrGroupAmountObjectData delete (BSDMSessionContext context, CsrGroupAmountObjectKeyData GADeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new CsrGroupAmount row..
   * Convenience method using default BSDMSessionContext.
   * @param GACreateIn Input  Object.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupAmountObjectData create (CsrGroupAmountObjectData GACreateIn) throws BSDMResourceException;
  /**
   * Create a new CsrGroupAmount row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GACreateIn Input  Object.
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupAmountObjectData create (BSDMSessionContext context, CsrGroupAmountObjectData GACreateIn) throws BSDMResourceException;


  /**
   * Create a new CsrGroupAmount row..
   * Convenience method using default BSDMSessionContext.
   * @param GACreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrGroupAmountObjectData create (CsrGroupAmountObjectData GACreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new CsrGroupAmount row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GACreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrGroupAmountObjectData create (BSDMSessionContext context, CsrGroupAmountObjectData GACreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
