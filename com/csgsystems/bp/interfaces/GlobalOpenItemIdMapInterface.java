
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
public interface GlobalOpenItemIdMapInterface extends BaliInterface {

  /**
   * Retrieve a unique GlobalOpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMGetIn Input Object Key.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalOpenItemIdMapObjectData get (GlobalOpenItemIdMapObjectKeyData GOIIMGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique GlobalOpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMGetIn Input Object Key.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalOpenItemIdMapObjectData get (BSDMSessionContext context, GlobalOpenItemIdMapObjectKeyData GOIIMGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique GlobalOpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalOpenItemIdMapObjectData get (GlobalOpenItemIdMapObjectKeyData GOIIMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique GlobalOpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalOpenItemIdMapObjectData get (BSDMSessionContext context, GlobalOpenItemIdMapObjectKeyData GOIIMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find GlobalOpenItemIdMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMFindIn Input Filter Object.
   * @return GlobalOpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalOpenItemIdMapObjectDataList find (GlobalOpenItemIdMapObjectFilter GOIIMFindIn) throws BSDMResourceException;
  /**
   * Find GlobalOpenItemIdMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMFindIn Input Filter Object.
   * @return GlobalOpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalOpenItemIdMapObjectDataList find (BSDMSessionContext context, GlobalOpenItemIdMapObjectFilter GOIIMFindIn) throws BSDMResourceException;


  /**
   * Find GlobalOpenItemIdMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalOpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalOpenItemIdMapObjectDataList find (GlobalOpenItemIdMapObjectFilter GOIIMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find GlobalOpenItemIdMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalOpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalOpenItemIdMapObjectDataList find (BSDMSessionContext context, GlobalOpenItemIdMapObjectFilter GOIIMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a GlobalOpenItemIdMap..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMUpdateIn Input  Object.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalOpenItemIdMapObjectData update (GlobalOpenItemIdMapObjectData GOIIMUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a GlobalOpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMUpdateIn Input  Object.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalOpenItemIdMapObjectData update (BSDMSessionContext context, GlobalOpenItemIdMapObjectData GOIIMUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a GlobalOpenItemIdMap..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalOpenItemIdMapObjectData update (GlobalOpenItemIdMapObjectData GOIIMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a GlobalOpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalOpenItemIdMapObjectData update (BSDMSessionContext context, GlobalOpenItemIdMapObjectData GOIIMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a GlobalOpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMDeleteIn Input Object Key.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalOpenItemIdMapObjectData delete (GlobalOpenItemIdMapObjectKeyData GOIIMDeleteIn) throws BSDMResourceException;
  /**
   * Delete a GlobalOpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMDeleteIn Input Object Key.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalOpenItemIdMapObjectData delete (BSDMSessionContext context, GlobalOpenItemIdMapObjectKeyData GOIIMDeleteIn) throws BSDMResourceException;


  /**
   * Delete a GlobalOpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalOpenItemIdMapObjectData delete (GlobalOpenItemIdMapObjectKeyData GOIIMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a GlobalOpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalOpenItemIdMapObjectData delete (BSDMSessionContext context, GlobalOpenItemIdMapObjectKeyData GOIIMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new GlobalOpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMCreateIn Input  Object.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalOpenItemIdMapObjectData create (GlobalOpenItemIdMapObjectData GOIIMCreateIn) throws BSDMResourceException;
  /**
   * Create a new GlobalOpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMCreateIn Input  Object.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalOpenItemIdMapObjectData create (BSDMSessionContext context, GlobalOpenItemIdMapObjectData GOIIMCreateIn) throws BSDMResourceException;


  /**
   * Create a new GlobalOpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalOpenItemIdMapObjectData create (GlobalOpenItemIdMapObjectData GOIIMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new GlobalOpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalOpenItemIdMapObjectData create (BSDMSessionContext context, GlobalOpenItemIdMapObjectData GOIIMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
