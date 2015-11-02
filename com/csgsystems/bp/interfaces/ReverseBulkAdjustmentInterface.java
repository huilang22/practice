
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
import com.csgsystems.bat.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface ReverseBulkAdjustmentInterface extends BaliInterface {

  /**
   * retrieves Reversal Batch Request with Parameters data.
   * Convenience method using default BSDMSessionContext.
   * @param _BatchRequest Input Object Key.
   * @return ReverseBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ReverseBulkAdjustmentGetOutputData get (BatchRequestObjectKeyData _BatchRequest) throws BSDMResourceException;
  /**
   * retrieves Reversal Batch Request with Parameters data.
   * @param context The session context to use when connecting to the APITS server.
   * @param _BatchRequest Input Object Key.
   * @return ReverseBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ReverseBulkAdjustmentGetOutputData get (BSDMSessionContext context, BatchRequestObjectKeyData _BatchRequest) throws BSDMResourceException;


  /**
   * retrieves Reversal Batch Request with Parameters data.
   * Convenience method using default BSDMSessionContext.
   * @param _BatchRequest Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ReverseBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ReverseBulkAdjustmentGetOutputData get (BatchRequestObjectKeyData _BatchRequest, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * retrieves Reversal Batch Request with Parameters data.
   * @param context The session context to use when connecting to the APITS server.
   * @param _BatchRequest Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ReverseBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ReverseBulkAdjustmentGetOutputData get (BSDMSessionContext context, BatchRequestObjectKeyData _BatchRequest, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Updates Batch Request with Reversal Batch Request with Parameters data.
   * Convenience method using default BSDMSessionContext.
   * @param ___BatchRequest Input  Object.
   * @param _ReasonCode.
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BatchRequestObjectData update (BatchRequestObjectData ___BatchRequest, Integer _ReasonCode) throws BSDMResourceException;
  /**
   * Updates Batch Request with Reversal Batch Request with Parameters data.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BatchRequest Input  Object.
   * @param _ReasonCode.
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BatchRequestObjectData update (BSDMSessionContext context, BatchRequestObjectData ___BatchRequest, Integer _ReasonCode) throws BSDMResourceException;


  /**
   * Updates Batch Request with Reversal Batch Request with Parameters data.
   * Convenience method using default BSDMSessionContext.
   * @param ___BatchRequest Input  Object.
   * @param _ReasonCode.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BatchRequestObjectData update (BatchRequestObjectData ___BatchRequest, Integer _ReasonCode, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Updates Batch Request with Reversal Batch Request with Parameters data.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BatchRequest Input  Object.
   * @param _ReasonCode.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BatchRequestObjectData update (BSDMSessionContext context, BatchRequestObjectData ___BatchRequest, Integer _ReasonCode, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
