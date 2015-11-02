
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
public interface NoteCodeInterface extends BaliInterface {

  /**
   * Find NoteCode rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param NoteCodeFindIn Input Filter Object.
   * @return NoteCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NoteCodeObjectDataList find (NoteCodeObjectFilter NoteCodeFindIn) throws BSDMResourceException;
  /**
   * Find NoteCode rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param NoteCodeFindIn Input Filter Object.
   * @return NoteCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NoteCodeObjectDataList find (BSDMSessionContext context, NoteCodeObjectFilter NoteCodeFindIn) throws BSDMResourceException;


  /**
   * Find NoteCode rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param NoteCodeFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NoteCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public NoteCodeObjectDataList find (NoteCodeObjectFilter NoteCodeFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find NoteCode rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param NoteCodeFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NoteCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public NoteCodeObjectDataList find (BSDMSessionContext context, NoteCodeObjectFilter NoteCodeFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve a unique NoteCode row..
   * Convenience method using default BSDMSessionContext.
   * @param NoteCodeGetIn Input Object Key.
   * @return NoteCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NoteCodeObjectData get (NoteCodeObjectKeyData NoteCodeGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique NoteCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param NoteCodeGetIn Input Object Key.
   * @return NoteCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NoteCodeObjectData get (BSDMSessionContext context, NoteCodeObjectKeyData NoteCodeGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique NoteCode row..
   * Convenience method using default BSDMSessionContext.
   * @param NoteCodeGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NoteCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public NoteCodeObjectData get (NoteCodeObjectKeyData NoteCodeGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique NoteCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param NoteCodeGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NoteCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public NoteCodeObjectData get (BSDMSessionContext context, NoteCodeObjectKeyData NoteCodeGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
