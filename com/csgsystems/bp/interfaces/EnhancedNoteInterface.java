
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
public interface EnhancedNoteInterface extends BaliInterface {

  /**
   * Creates a new enhanced note.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteCreateIn Input  Object.  Defaulted Fields: NoteSource, IsPermanent, ChgWho, ChgDt.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectData create (EnhancedNoteObjectData enhancedNoteCreateIn) throws BSDMResourceException;
  /**
   * Creates a new enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteCreateIn Input  Object.  Defaulted Fields: NoteSource, IsPermanent, ChgWho, ChgDt.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectData create (BSDMSessionContext context, EnhancedNoteObjectData enhancedNoteCreateIn) throws BSDMResourceException;


  /**
   * Creates a new enhanced note.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteCreateIn Input  Object.  Defaulted Fields: NoteSource, IsPermanent, ChgWho, ChgDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EnhancedNoteObjectData create (EnhancedNoteObjectData enhancedNoteCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Creates a new enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteCreateIn Input  Object.  Defaulted Fields: NoteSource, IsPermanent, ChgWho, ChgDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EnhancedNoteObjectData create (BSDMSessionContext context, EnhancedNoteObjectData enhancedNoteCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Deletes a enhanced note.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteDeleteIn Input Object Key.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectData delete (EnhancedNoteObjectKeyData enhancedNoteDeleteIn) throws BSDMResourceException;
  /**
   * Deletes a enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteDeleteIn Input Object Key.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectData delete (BSDMSessionContext context, EnhancedNoteObjectKeyData enhancedNoteDeleteIn) throws BSDMResourceException;


  /**
   * Deletes a enhanced note.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EnhancedNoteObjectData delete (EnhancedNoteObjectKeyData enhancedNoteDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Deletes a enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EnhancedNoteObjectData delete (BSDMSessionContext context, EnhancedNoteObjectKeyData enhancedNoteDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds enhanced notes.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteFindIn Input Filter Object.
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectDataList find (EnhancedNoteObjectFilter enhancedNoteFindIn) throws BSDMResourceException;
  /**
   * Finds enhanced notes.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteFindIn Input Filter Object.
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectDataList find (BSDMSessionContext context, EnhancedNoteObjectFilter enhancedNoteFindIn) throws BSDMResourceException;


  /**
   * Finds enhanced notes.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EnhancedNoteObjectDataList find (EnhancedNoteObjectFilter enhancedNoteFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds enhanced notes.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EnhancedNoteObjectDataList find (BSDMSessionContext context, EnhancedNoteObjectFilter enhancedNoteFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds enhanced notes and groups them when possible.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteGroupedFindIn Input Filter Object.
   * @param delimiter (null is allowed).
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectDataList groupedFind (EnhancedNoteObjectFilter enhancedNoteGroupedFindIn, String delimiter) throws BSDMResourceException;
  /**
   * Finds enhanced notes and groups them when possible.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteGroupedFindIn Input Filter Object.
   * @param delimiter (null is allowed).
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectDataList groupedFind (BSDMSessionContext context, EnhancedNoteObjectFilter enhancedNoteGroupedFindIn, String delimiter) throws BSDMResourceException;


  /**
   * Finds enhanced notes and groups them when possible.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteGroupedFindIn Input Filter Object.
   * @param delimiter (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EnhancedNoteObjectDataList groupedFind (EnhancedNoteObjectFilter enhancedNoteGroupedFindIn, String delimiter, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds enhanced notes and groups them when possible.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteGroupedFindIn Input Filter Object.
   * @param delimiter (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EnhancedNoteObjectDataList groupedFind (BSDMSessionContext context, EnhancedNoteObjectFilter enhancedNoteGroupedFindIn, String delimiter, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieves a specific enhanced note.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteGetIn Input Object Key.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectData get (EnhancedNoteObjectKeyData enhancedNoteGetIn) throws BSDMResourceException;
  /**
   * Retrieves a specific enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteGetIn Input Object Key.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectData get (BSDMSessionContext context, EnhancedNoteObjectKeyData enhancedNoteGetIn) throws BSDMResourceException;


  /**
   * Retrieves a specific enhanced note.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EnhancedNoteObjectData get (EnhancedNoteObjectKeyData enhancedNoteGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieves a specific enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EnhancedNoteObjectData get (BSDMSessionContext context, EnhancedNoteObjectKeyData enhancedNoteGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Generates a new EnhancedNoteId for a new EnhancedNote. Used to pass to EnhancedNoteCreate later.
   * Convenience method using default BSDMSessionContext.
   * @return EnhancedNoteObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectKeyData sequenceGet () throws BSDMResourceException;
  /**
   * Generates a new EnhancedNoteId for a new EnhancedNote. Used to pass to EnhancedNoteCreate later.
   * @param context The session context to use when connecting to the APITS server.
   * @return EnhancedNoteObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectKeyData sequenceGet (BSDMSessionContext context) throws BSDMResourceException;


  /**
   * Generates a new EnhancedNoteId for a new EnhancedNote. Used to pass to EnhancedNoteCreate later.
   * Convenience method using default BSDMSessionContext.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EnhancedNoteObjectKeyData sequenceGet (String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Generates a new EnhancedNoteId for a new EnhancedNote. Used to pass to EnhancedNoteCreate later.
   * @param context The session context to use when connecting to the APITS server.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EnhancedNoteObjectKeyData sequenceGet (BSDMSessionContext context, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Updates a enhanced note.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteUpdateIn Input  Object.  Defaulted Fields: ChgWho, ChgDt.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectData update (EnhancedNoteObjectData enhancedNoteUpdateIn) throws BSDMResourceException;
  /**
   * Updates a enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteUpdateIn Input  Object.  Defaulted Fields: ChgWho, ChgDt.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EnhancedNoteObjectData update (BSDMSessionContext context, EnhancedNoteObjectData enhancedNoteUpdateIn) throws BSDMResourceException;


  /**
   * Updates a enhanced note.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteUpdateIn Input  Object.  Defaulted Fields: ChgWho, ChgDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EnhancedNoteObjectData update (EnhancedNoteObjectData enhancedNoteUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Updates a enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteUpdateIn Input  Object.  Defaulted Fields: ChgWho, ChgDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EnhancedNoteObjectData update (BSDMSessionContext context, EnhancedNoteObjectData enhancedNoteUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
