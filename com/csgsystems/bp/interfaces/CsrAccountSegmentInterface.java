
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
public interface CsrAccountSegmentInterface extends BaliInterface {

  /**
   * Retrieve a unique CsrAccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param CASGetIn Input Object Key.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrAccountSegmentObjectData get (CsrAccountSegmentObjectKeyData CASGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique CsrAccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASGetIn Input Object Key.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrAccountSegmentObjectData get (BSDMSessionContext context, CsrAccountSegmentObjectKeyData CASGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique CsrAccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param CASGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrAccountSegmentObjectData get (CsrAccountSegmentObjectKeyData CASGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique CsrAccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrAccountSegmentObjectData get (BSDMSessionContext context, CsrAccountSegmentObjectKeyData CASGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CsrAccountSegment rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CASFindIn Input Filter Object.
   * @return CsrAccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrAccountSegmentObjectDataList find (CsrAccountSegmentObjectFilter CASFindIn) throws BSDMResourceException;
  /**
   * Find CsrAccountSegment rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASFindIn Input Filter Object.
   * @return CsrAccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrAccountSegmentObjectDataList find (BSDMSessionContext context, CsrAccountSegmentObjectFilter CASFindIn) throws BSDMResourceException;


  /**
   * Find CsrAccountSegment rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CASFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrAccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrAccountSegmentObjectDataList find (CsrAccountSegmentObjectFilter CASFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CsrAccountSegment rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrAccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrAccountSegmentObjectDataList find (BSDMSessionContext context, CsrAccountSegmentObjectFilter CASFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a CsrAccountSegment..
   * Convenience method using default BSDMSessionContext.
   * @param CASUpdateIn Input  Object.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrAccountSegmentObjectData update (CsrAccountSegmentObjectData CASUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a CsrAccountSegment..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASUpdateIn Input  Object.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrAccountSegmentObjectData update (BSDMSessionContext context, CsrAccountSegmentObjectData CASUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a CsrAccountSegment..
   * Convenience method using default BSDMSessionContext.
   * @param CASUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrAccountSegmentObjectData update (CsrAccountSegmentObjectData CASUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a CsrAccountSegment..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrAccountSegmentObjectData update (BSDMSessionContext context, CsrAccountSegmentObjectData CASUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a CsrAccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param CASDeleteIn Input Object Key.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrAccountSegmentObjectData delete (CsrAccountSegmentObjectKeyData CASDeleteIn) throws BSDMResourceException;
  /**
   * Delete a CsrAccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASDeleteIn Input Object Key.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrAccountSegmentObjectData delete (BSDMSessionContext context, CsrAccountSegmentObjectKeyData CASDeleteIn) throws BSDMResourceException;


  /**
   * Delete a CsrAccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param CASDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrAccountSegmentObjectData delete (CsrAccountSegmentObjectKeyData CASDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a CsrAccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrAccountSegmentObjectData delete (BSDMSessionContext context, CsrAccountSegmentObjectKeyData CASDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new CsrAccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param CASCreateIn Input  Object.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrAccountSegmentObjectData create (CsrAccountSegmentObjectData CASCreateIn) throws BSDMResourceException;
  /**
   * Create a new CsrAccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASCreateIn Input  Object.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrAccountSegmentObjectData create (BSDMSessionContext context, CsrAccountSegmentObjectData CASCreateIn) throws BSDMResourceException;


  /**
   * Create a new CsrAccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param CASCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrAccountSegmentObjectData create (CsrAccountSegmentObjectData CASCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new CsrAccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrAccountSegmentObjectData create (BSDMSessionContext context, CsrAccountSegmentObjectData CASCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
