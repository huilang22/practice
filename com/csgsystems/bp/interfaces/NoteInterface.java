
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
public interface NoteInterface extends BaliInterface {

  /**
   * Create a new Note..
   * Convenience method using default BSDMSessionContext.
   * @param NoteCreateIn Input  Object.  Defaulted Fields: PermanentFlag, NoteSource.  Derived Fields: ChgDate, ChgWho.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void create (NoteObjectData NoteCreateIn) throws BSDMResourceException;
  /**
   * Create a new Note..
   * @param context The session context to use when connecting to the APITS server.
   * @param NoteCreateIn Input  Object.  Defaulted Fields: PermanentFlag, NoteSource.  Derived Fields: ChgDate, ChgWho.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void create (BSDMSessionContext context, NoteObjectData NoteCreateIn) throws BSDMResourceException;


  /**
   * Create a new Note..
   * Convenience method using default BSDMSessionContext.
   * @param NoteCreateIn Input  Object.  Defaulted Fields: PermanentFlag, NoteSource.  Derived Fields: ChgDate, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void create (NoteObjectData NoteCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Note..
   * @param context The session context to use when connecting to the APITS server.
   * @param NoteCreateIn Input  Object.  Defaulted Fields: PermanentFlag, NoteSource.  Derived Fields: ChgDate, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void create (BSDMSessionContext context, NoteObjectData NoteCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Note's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param NoteFindIn Input Filter Object.
   * @return NoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NoteObjectDataList find (NoteObjectFilter NoteFindIn) throws BSDMResourceException;
  /**
   * Find Note's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param NoteFindIn Input Filter Object.
   * @return NoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NoteObjectDataList find (BSDMSessionContext context, NoteObjectFilter NoteFindIn) throws BSDMResourceException;


  /**
   * Find Note's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param NoteFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public NoteObjectDataList find (NoteObjectFilter NoteFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Note's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param NoteFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public NoteObjectDataList find (BSDMSessionContext context, NoteObjectFilter NoteFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
