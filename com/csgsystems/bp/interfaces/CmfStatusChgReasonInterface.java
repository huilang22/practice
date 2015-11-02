
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
public interface CmfStatusChgReasonInterface extends BaliInterface {

  /**
   * Get a CmfStatusChgReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRGetIn Input Object Key.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusChgReasonObjectData get (CmfStatusChgReasonObjectKeyData CSCRGetIn) throws BSDMResourceException;
  /**
   * Get a CmfStatusChgReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRGetIn Input Object Key.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusChgReasonObjectData get (BSDMSessionContext context, CmfStatusChgReasonObjectKeyData CSCRGetIn) throws BSDMResourceException;


  /**
   * Get a CmfStatusChgReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfStatusChgReasonObjectData get (CmfStatusChgReasonObjectKeyData CSCRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a CmfStatusChgReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfStatusChgReasonObjectData get (BSDMSessionContext context, CmfStatusChgReasonObjectKeyData CSCRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CmfStatusChgReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRFindIn Input Filter Object.
   * @return CmfStatusChgReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusChgReasonObjectDataList find (CmfStatusChgReasonObjectFilter CSCRFindIn) throws BSDMResourceException;
  /**
   * Find CmfStatusChgReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRFindIn Input Filter Object.
   * @return CmfStatusChgReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusChgReasonObjectDataList find (BSDMSessionContext context, CmfStatusChgReasonObjectFilter CSCRFindIn) throws BSDMResourceException;


  /**
   * Find CmfStatusChgReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusChgReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfStatusChgReasonObjectDataList find (CmfStatusChgReasonObjectFilter CSCRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CmfStatusChgReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusChgReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfStatusChgReasonObjectDataList find (BSDMSessionContext context, CmfStatusChgReasonObjectFilter CSCRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a CmfStatusChgReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRUpdateIn Input  Object.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusChgReasonObjectData update (CmfStatusChgReasonObjectData CSCRUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a CmfStatusChgReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRUpdateIn Input  Object.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusChgReasonObjectData update (BSDMSessionContext context, CmfStatusChgReasonObjectData CSCRUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a CmfStatusChgReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfStatusChgReasonObjectData update (CmfStatusChgReasonObjectData CSCRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a CmfStatusChgReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfStatusChgReasonObjectData update (BSDMSessionContext context, CmfStatusChgReasonObjectData CSCRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a CmfStatusChgReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRDeleteIn Input Object Key.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusChgReasonObjectData delete (CmfStatusChgReasonObjectKeyData CSCRDeleteIn) throws BSDMResourceException;
  /**
   * Delete a CmfStatusChgReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRDeleteIn Input Object Key.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusChgReasonObjectData delete (BSDMSessionContext context, CmfStatusChgReasonObjectKeyData CSCRDeleteIn) throws BSDMResourceException;


  /**
   * Delete a CmfStatusChgReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfStatusChgReasonObjectData delete (CmfStatusChgReasonObjectKeyData CSCRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a CmfStatusChgReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfStatusChgReasonObjectData delete (BSDMSessionContext context, CmfStatusChgReasonObjectKeyData CSCRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new CmfStatusChgReason object..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusChgReasonObjectData create (CmfStatusChgReasonObjectData CSCRCreateIn) throws BSDMResourceException;
  /**
   * Create a new CmfStatusChgReason object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfStatusChgReasonObjectData create (BSDMSessionContext context, CmfStatusChgReasonObjectData CSCRCreateIn) throws BSDMResourceException;


  /**
   * Create a new CmfStatusChgReason object..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfStatusChgReasonObjectData create (CmfStatusChgReasonObjectData CSCRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new CmfStatusChgReason object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfStatusChgReasonObjectData create (BSDMSessionContext context, CmfStatusChgReasonObjectData CSCRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
