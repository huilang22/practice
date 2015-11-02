
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
public interface AccountSegmentInterface extends BaliInterface {

  /**
   * Get an AccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param ASGetIn Input Object Key.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentObjectData get (AccountSegmentObjectKeyData ASGetIn) throws BSDMResourceException;
  /**
   * Get an AccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASGetIn Input Object Key.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentObjectData get (BSDMSessionContext context, AccountSegmentObjectKeyData ASGetIn) throws BSDMResourceException;


  /**
   * Get an AccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param ASGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountSegmentObjectData get (AccountSegmentObjectKeyData ASGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get an AccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountSegmentObjectData get (BSDMSessionContext context, AccountSegmentObjectKeyData ASGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AccountSegments that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ASFindIn Input Filter Object.
   * @return AccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentObjectDataList find (AccountSegmentObjectFilter ASFindIn) throws BSDMResourceException;
  /**
   * Find AccountSegments that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASFindIn Input Filter Object.
   * @return AccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentObjectDataList find (BSDMSessionContext context, AccountSegmentObjectFilter ASFindIn) throws BSDMResourceException;


  /**
   * Find AccountSegments that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ASFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountSegmentObjectDataList find (AccountSegmentObjectFilter ASFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AccountSegments that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountSegmentObjectDataList find (BSDMSessionContext context, AccountSegmentObjectFilter ASFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of an AccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param ASUpdateIn Input  Object.
   * @param ASUpdateFilter Input Filter Object.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentObjectData update (AccountSegmentObjectData ASUpdateIn, AccountSegmentObjectFilter ASUpdateFilter) throws BSDMResourceException;
  /**
   * Update non-key fields of an AccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASUpdateIn Input  Object.
   * @param ASUpdateFilter Input Filter Object.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentObjectData update (BSDMSessionContext context, AccountSegmentObjectData ASUpdateIn, AccountSegmentObjectFilter ASUpdateFilter) throws BSDMResourceException;


  /**
   * Update non-key fields of an AccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param ASUpdateIn Input  Object.
   * @param ASUpdateFilter Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountSegmentObjectData update (AccountSegmentObjectData ASUpdateIn, AccountSegmentObjectFilter ASUpdateFilter, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of an AccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASUpdateIn Input  Object.
   * @param ASUpdateFilter Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountSegmentObjectData update (BSDMSessionContext context, AccountSegmentObjectData ASUpdateIn, AccountSegmentObjectFilter ASUpdateFilter, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete AccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param ASDeleteIn Input Object Key.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentObjectData delete (AccountSegmentObjectKeyData ASDeleteIn) throws BSDMResourceException;
  /**
   * Delete AccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASDeleteIn Input Object Key.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentObjectData delete (BSDMSessionContext context, AccountSegmentObjectKeyData ASDeleteIn) throws BSDMResourceException;


  /**
   * Delete AccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param ASDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountSegmentObjectData delete (AccountSegmentObjectKeyData ASDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete AccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountSegmentObjectData delete (BSDMSessionContext context, AccountSegmentObjectKeyData ASDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new AccountSegment (or create a new AccountSegment description if the id already exists)..
   * Convenience method using default BSDMSessionContext.
   * @param ASCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentObjectData create (AccountSegmentObjectData ASCreateIn) throws BSDMResourceException;
  /**
   * Create a new AccountSegment (or create a new AccountSegment description if the id already exists)..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountSegmentObjectData create (BSDMSessionContext context, AccountSegmentObjectData ASCreateIn) throws BSDMResourceException;


  /**
   * Create a new AccountSegment (or create a new AccountSegment description if the id already exists)..
   * Convenience method using default BSDMSessionContext.
   * @param ASCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountSegmentObjectData create (AccountSegmentObjectData ASCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new AccountSegment (or create a new AccountSegment description if the id already exists)..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountSegmentObjectData create (BSDMSessionContext context, AccountSegmentObjectData ASCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
