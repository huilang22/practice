
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
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bat.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface BilledUsageBulkAdjustmentInterface extends BaliInterface {

  /**
   * Creates a new batch to create Billed usage Adjusments.
   * Convenience method using default BSDMSessionContext.
   * @param _BulkAdjustment Input  Object.
   * @param _BatchRequest Input  Object.
   * @param _____BilledUsage Input List Object.
   * @param _BilledUsageQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BatchRequestObjectData create (BulkAdjustmentObjectData _BulkAdjustment, BatchRequestObjectData _BatchRequest, BilledUsageObjectData[] _____BilledUsage, BilledUsageQueryObjectData _BilledUsageQuery, String XMLFileName, String CDFFileName) throws BSDMResourceException;
  /**
   * Creates a new batch to create Billed usage Adjusments.
   * @param context The session context to use when connecting to the APITS server.
   * @param _BulkAdjustment Input  Object.
   * @param _BatchRequest Input  Object.
   * @param _____BilledUsage Input List Object.
   * @param _BilledUsageQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BatchRequestObjectData create (BSDMSessionContext context, BulkAdjustmentObjectData _BulkAdjustment, BatchRequestObjectData _BatchRequest, BilledUsageObjectData[] _____BilledUsage, BilledUsageQueryObjectData _BilledUsageQuery, String XMLFileName, String CDFFileName) throws BSDMResourceException;


  /**
   * Creates a new batch to create Billed usage Adjusments.
   * Convenience method using default BSDMSessionContext.
   * @param _BulkAdjustment Input  Object.
   * @param _BatchRequest Input  Object.
   * @param _____BilledUsage Input List Object.
   * @param _BilledUsageQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BatchRequestObjectData create (BulkAdjustmentObjectData _BulkAdjustment, BatchRequestObjectData _BatchRequest, BilledUsageObjectData[] _____BilledUsage, BilledUsageQueryObjectData _BilledUsageQuery, String XMLFileName, String CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Creates a new batch to create Billed usage Adjusments.
   * @param context The session context to use when connecting to the APITS server.
   * @param _BulkAdjustment Input  Object.
   * @param _BatchRequest Input  Object.
   * @param _____BilledUsage Input List Object.
   * @param _BilledUsageQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BatchRequestObjectData create (BSDMSessionContext context, BulkAdjustmentObjectData _BulkAdjustment, BatchRequestObjectData _BatchRequest, BilledUsageObjectData[] _____BilledUsage, BilledUsageQueryObjectData _BilledUsageQuery, String XMLFileName, String CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * retrieves Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param ___BatchRequest Input Object Key.
   * @return BilledUsageBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageBulkAdjustmentGetOutputData get (BatchRequestObjectKeyData ___BatchRequest) throws BSDMResourceException;
  /**
   * retrieves Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BatchRequest Input Object Key.
   * @return BilledUsageBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BilledUsageBulkAdjustmentGetOutputData get (BSDMSessionContext context, BatchRequestObjectKeyData ___BatchRequest) throws BSDMResourceException;


  /**
   * retrieves Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param ___BatchRequest Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BilledUsageBulkAdjustmentGetOutputData get (BatchRequestObjectKeyData ___BatchRequest, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * retrieves Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BatchRequest Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BilledUsageBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BilledUsageBulkAdjustmentGetOutputData get (BSDMSessionContext context, BatchRequestObjectKeyData ___BatchRequest, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Updates Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param ___BulkAdjustment Input  Object.
   * @param _____BatchRequest Input  Object.
   * @param _______BilledUsage Input List Object.
   * @param ____BilledUsageQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BatchRequestObjectData update (BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData _____BatchRequest, BilledUsageObjectData[] _______BilledUsage, BilledUsageQueryObjectData ____BilledUsageQuery, String __XMLFileName, String __CDFFileName) throws BSDMResourceException;
  /**
   * Updates Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BulkAdjustment Input  Object.
   * @param _____BatchRequest Input  Object.
   * @param _______BilledUsage Input List Object.
   * @param ____BilledUsageQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BatchRequestObjectData update (BSDMSessionContext context, BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData _____BatchRequest, BilledUsageObjectData[] _______BilledUsage, BilledUsageQueryObjectData ____BilledUsageQuery, String __XMLFileName, String __CDFFileName) throws BSDMResourceException;


  /**
   * Updates Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param ___BulkAdjustment Input  Object.
   * @param _____BatchRequest Input  Object.
   * @param _______BilledUsage Input List Object.
   * @param ____BilledUsageQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BatchRequestObjectData update (BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData _____BatchRequest, BilledUsageObjectData[] _______BilledUsage, BilledUsageQueryObjectData ____BilledUsageQuery, String __XMLFileName, String __CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Updates Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BulkAdjustment Input  Object.
   * @param _____BatchRequest Input  Object.
   * @param _______BilledUsage Input List Object.
   * @param ____BilledUsageQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BatchRequestObjectData update (BSDMSessionContext context, BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData _____BatchRequest, BilledUsageObjectData[] _______BilledUsage, BilledUsageQueryObjectData ____BilledUsageQuery, String __XMLFileName, String __CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
