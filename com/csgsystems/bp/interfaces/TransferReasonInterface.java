
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
public interface TransferReasonInterface extends BaliInterface {

  /**
   * Get a unique TransferReason..
   * Convenience method using default BSDMSessionContext.
   * @param XRGetIn Input Object Key.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransferReasonObjectData get (TransferReasonObjectKeyData XRGetIn) throws BSDMResourceException;
  /**
   * Get a unique TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRGetIn Input Object Key.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransferReasonObjectData get (BSDMSessionContext context, TransferReasonObjectKeyData XRGetIn) throws BSDMResourceException;


  /**
   * Get a unique TransferReason..
   * Convenience method using default BSDMSessionContext.
   * @param XRGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TransferReasonObjectData get (TransferReasonObjectKeyData XRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TransferReasonObjectData get (BSDMSessionContext context, TransferReasonObjectKeyData XRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find TransferReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param XRFindIn Input Filter Object.
   * @return TransferReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransferReasonObjectDataList find (TransferReasonObjectFilter XRFindIn) throws BSDMResourceException;
  /**
   * Find TransferReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRFindIn Input Filter Object.
   * @return TransferReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransferReasonObjectDataList find (BSDMSessionContext context, TransferReasonObjectFilter XRFindIn) throws BSDMResourceException;


  /**
   * Find TransferReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param XRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransferReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TransferReasonObjectDataList find (TransferReasonObjectFilter XRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find TransferReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransferReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TransferReasonObjectDataList find (BSDMSessionContext context, TransferReasonObjectFilter XRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non key fields of a TransferReason..
   * Convenience method using default BSDMSessionContext.
   * @param XRUpdateIn Input  Object.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransferReasonObjectData update (TransferReasonObjectData XRUpdateIn) throws BSDMResourceException;
  /**
   * Update non key fields of a TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRUpdateIn Input  Object.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransferReasonObjectData update (BSDMSessionContext context, TransferReasonObjectData XRUpdateIn) throws BSDMResourceException;


  /**
   * Update non key fields of a TransferReason..
   * Convenience method using default BSDMSessionContext.
   * @param XRUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TransferReasonObjectData update (TransferReasonObjectData XRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non key fields of a TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TransferReasonObjectData update (BSDMSessionContext context, TransferReasonObjectData XRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a TransferReason..
   * Convenience method using default BSDMSessionContext.
   * @param XRDeleteIn Input Object Key.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransferReasonObjectData delete (TransferReasonObjectKeyData XRDeleteIn) throws BSDMResourceException;
  /**
   * Delete a TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRDeleteIn Input Object Key.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransferReasonObjectData delete (BSDMSessionContext context, TransferReasonObjectKeyData XRDeleteIn) throws BSDMResourceException;


  /**
   * Delete a TransferReason..
   * Convenience method using default BSDMSessionContext.
   * @param XRDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TransferReasonObjectData delete (TransferReasonObjectKeyData XRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TransferReasonObjectData delete (BSDMSessionContext context, TransferReasonObjectKeyData XRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new TransferReason..
   * Convenience method using default BSDMSessionContext.
   * @param XRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransferReasonObjectData create (TransferReasonObjectData XRCreateIn) throws BSDMResourceException;
  /**
   * Create a new TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TransferReasonObjectData create (BSDMSessionContext context, TransferReasonObjectData XRCreateIn) throws BSDMResourceException;


  /**
   * Create a new TransferReason..
   * Convenience method using default BSDMSessionContext.
   * @param XRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TransferReasonObjectData create (TransferReasonObjectData XRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TransferReasonObjectData create (BSDMSessionContext context, TransferReasonObjectData XRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
