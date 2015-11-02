
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
public interface NoteTextInterface extends BaliInterface {

  /**
   * Find NoteText rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param NoteTextFindIn Input Filter Object.
   * @return NoteTextObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NoteTextObjectDataList find (NoteTextObjectFilter NoteTextFindIn) throws BSDMResourceException;
  /**
   * Find NoteText rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param NoteTextFindIn Input Filter Object.
   * @return NoteTextObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NoteTextObjectDataList find (BSDMSessionContext context, NoteTextObjectFilter NoteTextFindIn) throws BSDMResourceException;


  /**
   * Find NoteText rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param NoteTextFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NoteTextObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public NoteTextObjectDataList find (NoteTextObjectFilter NoteTextFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find NoteText rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param NoteTextFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NoteTextObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public NoteTextObjectDataList find (BSDMSessionContext context, NoteTextObjectFilter NoteTextFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve a unique NoteText row..
   * Convenience method using default BSDMSessionContext.
   * @param NoteTextGetIn Input Object Key.
   * @return NoteTextObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NoteTextObjectData get (NoteTextObjectKeyData NoteTextGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique NoteText row..
   * @param context The session context to use when connecting to the APITS server.
   * @param NoteTextGetIn Input Object Key.
   * @return NoteTextObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NoteTextObjectData get (BSDMSessionContext context, NoteTextObjectKeyData NoteTextGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique NoteText row..
   * Convenience method using default BSDMSessionContext.
   * @param NoteTextGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NoteTextObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public NoteTextObjectData get (NoteTextObjectKeyData NoteTextGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique NoteText row..
   * @param context The session context to use when connecting to the APITS server.
   * @param NoteTextGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NoteTextObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public NoteTextObjectData get (BSDMSessionContext context, NoteTextObjectKeyData NoteTextGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
