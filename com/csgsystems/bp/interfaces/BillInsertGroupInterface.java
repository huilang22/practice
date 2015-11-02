
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
public interface BillInsertGroupInterface extends BaliInterface {

  /**
   * Get a BillInsertGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param IGIGetIn Input Object Key.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupObjectData get (BillInsertGroupObjectKeyData IGIGetIn) throws BSDMResourceException;
  /**
   * Get a BillInsertGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIGetIn Input Object Key.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupObjectData get (BSDMSessionContext context, BillInsertGroupObjectKeyData IGIGetIn) throws BSDMResourceException;


  /**
   * Get a BillInsertGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param IGIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillInsertGroupObjectData get (BillInsertGroupObjectKeyData IGIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a BillInsertGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillInsertGroupObjectData get (BSDMSessionContext context, BillInsertGroupObjectKeyData IGIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find BillInsertGroups that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param IGIFindIn Input Filter Object.
   * @return BillInsertGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupObjectDataList find (BillInsertGroupObjectFilter IGIFindIn) throws BSDMResourceException;
  /**
   * Find BillInsertGroups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIFindIn Input Filter Object.
   * @return BillInsertGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupObjectDataList find (BSDMSessionContext context, BillInsertGroupObjectFilter IGIFindIn) throws BSDMResourceException;


  /**
   * Find BillInsertGroups that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param IGIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillInsertGroupObjectDataList find (BillInsertGroupObjectFilter IGIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find BillInsertGroups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillInsertGroupObjectDataList find (BSDMSessionContext context, BillInsertGroupObjectFilter IGIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a BillInsertGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param IGIUpdateIn Input  Object.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupObjectData update (BillInsertGroupObjectData IGIUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a BillInsertGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIUpdateIn Input  Object.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupObjectData update (BSDMSessionContext context, BillInsertGroupObjectData IGIUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a BillInsertGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param IGIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillInsertGroupObjectData update (BillInsertGroupObjectData IGIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a BillInsertGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillInsertGroupObjectData update (BSDMSessionContext context, BillInsertGroupObjectData IGIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a BillInsertGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param IGIDeleteIn Input Object Key.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupObjectData delete (BillInsertGroupObjectKeyData IGIDeleteIn) throws BSDMResourceException;
  /**
   * Delete a BillInsertGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIDeleteIn Input Object Key.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupObjectData delete (BSDMSessionContext context, BillInsertGroupObjectKeyData IGIDeleteIn) throws BSDMResourceException;


  /**
   * Delete a BillInsertGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param IGIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillInsertGroupObjectData delete (BillInsertGroupObjectKeyData IGIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a BillInsertGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillInsertGroupObjectData delete (BSDMSessionContext context, BillInsertGroupObjectKeyData IGIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new BillInsertGroup..
   * Convenience method using default BSDMSessionContext.
   * @param IGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupObjectData create (BillInsertGroupObjectData IGICreateIn) throws BSDMResourceException;
  /**
   * Create a new BillInsertGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInsertGroupObjectData create (BSDMSessionContext context, BillInsertGroupObjectData IGICreateIn) throws BSDMResourceException;


  /**
   * Create a new BillInsertGroup..
   * Convenience method using default BSDMSessionContext.
   * @param IGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillInsertGroupObjectData create (BillInsertGroupObjectData IGICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new BillInsertGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param IGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInsertGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillInsertGroupObjectData create (BSDMSessionContext context, BillInsertGroupObjectData IGICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
