
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
public interface ConnectReasonInterface extends BaliInterface {

  /**
   * Get a ConnectReason Object..
   * Convenience method using default BSDMSessionContext.
   * @param CRGetIn Input Object Key.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ConnectReasonObjectData get (ConnectReasonObjectKeyData CRGetIn) throws BSDMResourceException;
  /**
   * Get a ConnectReason Object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRGetIn Input Object Key.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ConnectReasonObjectData get (BSDMSessionContext context, ConnectReasonObjectKeyData CRGetIn) throws BSDMResourceException;


  /**
   * Get a ConnectReason Object..
   * Convenience method using default BSDMSessionContext.
   * @param CRGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ConnectReasonObjectData get (ConnectReasonObjectKeyData CRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a ConnectReason Object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ConnectReasonObjectData get (BSDMSessionContext context, ConnectReasonObjectKeyData CRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ConnectReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CRFindIn Input Filter Object.
   * @return ConnectReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ConnectReasonObjectDataList find (ConnectReasonObjectFilter CRFindIn) throws BSDMResourceException;
  /**
   * Find ConnectReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRFindIn Input Filter Object.
   * @return ConnectReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ConnectReasonObjectDataList find (BSDMSessionContext context, ConnectReasonObjectFilter CRFindIn) throws BSDMResourceException;


  /**
   * Find ConnectReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ConnectReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ConnectReasonObjectDataList find (ConnectReasonObjectFilter CRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ConnectReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ConnectReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ConnectReasonObjectDataList find (BSDMSessionContext context, ConnectReasonObjectFilter CRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields for a ConnectReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CRUpdateIn Input  Object.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ConnectReasonObjectData update (ConnectReasonObjectData CRUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields for a ConnectReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRUpdateIn Input  Object.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ConnectReasonObjectData update (BSDMSessionContext context, ConnectReasonObjectData CRUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields for a ConnectReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CRUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ConnectReasonObjectData update (ConnectReasonObjectData CRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields for a ConnectReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ConnectReasonObjectData update (BSDMSessionContext context, ConnectReasonObjectData CRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a ConnectReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CRDeleteIn Input Object Key.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ConnectReasonObjectData delete (ConnectReasonObjectKeyData CRDeleteIn) throws BSDMResourceException;
  /**
   * Delete a ConnectReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRDeleteIn Input Object Key.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ConnectReasonObjectData delete (BSDMSessionContext context, ConnectReasonObjectKeyData CRDeleteIn) throws BSDMResourceException;


  /**
   * Delete a ConnectReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CRDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ConnectReasonObjectData delete (ConnectReasonObjectKeyData CRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a ConnectReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ConnectReasonObjectData delete (BSDMSessionContext context, ConnectReasonObjectKeyData CRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new ConnectReason..
   * Convenience method using default BSDMSessionContext.
   * @param CRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ConnectReasonObjectData create (ConnectReasonObjectData CRCreateIn) throws BSDMResourceException;
  /**
   * Create a new ConnectReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ConnectReasonObjectData create (BSDMSessionContext context, ConnectReasonObjectData CRCreateIn) throws BSDMResourceException;


  /**
   * Create a new ConnectReason..
   * Convenience method using default BSDMSessionContext.
   * @param CRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ConnectReasonObjectData create (ConnectReasonObjectData CRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new ConnectReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ConnectReasonObjectData create (BSDMSessionContext context, ConnectReasonObjectData CRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
