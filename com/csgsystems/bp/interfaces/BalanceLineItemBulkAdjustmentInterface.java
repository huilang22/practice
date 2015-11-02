
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
public interface BalanceLineItemBulkAdjustmentInterface extends BaliInterface {

  /**
   * Creates a new batch to create Balance Line Item usage Adjusments.
   * Convenience method using default BSDMSessionContext.
   * @param ____BulkAdjustment Input  Object.
   * @param ____BatchRequest Input  Object.
   * @param _____BalanceLineItem Input List Object.
   * @param ____BalanceLineItemQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BatchRequestObjectData create (BulkAdjustmentObjectData ____BulkAdjustment, BatchRequestObjectData ____BatchRequest, BalanceLineItemObjectData[] _____BalanceLineItem, BalanceLineItemQueryObjectData ____BalanceLineItemQuery, String XMLFileName, String CDFFileName) throws BSDMResourceException;
  /**
   * Creates a new batch to create Balance Line Item usage Adjusments.
   * @param context The session context to use when connecting to the APITS server.
   * @param ____BulkAdjustment Input  Object.
   * @param ____BatchRequest Input  Object.
   * @param _____BalanceLineItem Input List Object.
   * @param ____BalanceLineItemQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BatchRequestObjectData create (BSDMSessionContext context, BulkAdjustmentObjectData ____BulkAdjustment, BatchRequestObjectData ____BatchRequest, BalanceLineItemObjectData[] _____BalanceLineItem, BalanceLineItemQueryObjectData ____BalanceLineItemQuery, String XMLFileName, String CDFFileName) throws BSDMResourceException;


  /**
   * Creates a new batch to create Balance Line Item usage Adjusments.
   * Convenience method using default BSDMSessionContext.
   * @param ____BulkAdjustment Input  Object.
   * @param ____BatchRequest Input  Object.
   * @param _____BalanceLineItem Input List Object.
   * @param ____BalanceLineItemQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BatchRequestObjectData create (BulkAdjustmentObjectData ____BulkAdjustment, BatchRequestObjectData ____BatchRequest, BalanceLineItemObjectData[] _____BalanceLineItem, BalanceLineItemQueryObjectData ____BalanceLineItemQuery, String XMLFileName, String CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Creates a new batch to create Balance Line Item usage Adjusments.
   * @param context The session context to use when connecting to the APITS server.
   * @param ____BulkAdjustment Input  Object.
   * @param ____BatchRequest Input  Object.
   * @param _____BalanceLineItem Input List Object.
   * @param ____BalanceLineItemQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BatchRequestObjectData create (BSDMSessionContext context, BulkAdjustmentObjectData ____BulkAdjustment, BatchRequestObjectData ____BatchRequest, BalanceLineItemObjectData[] _____BalanceLineItem, BalanceLineItemQueryObjectData ____BalanceLineItemQuery, String XMLFileName, String CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * retrieves Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param __BatchRequest Input Object Key.
   * @return BalanceLineItemBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BalanceLineItemBulkAdjustmentGetOutputData get (BatchRequestObjectKeyData __BatchRequest) throws BSDMResourceException;
  /**
   * retrieves Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param __BatchRequest Input Object Key.
   * @return BalanceLineItemBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BalanceLineItemBulkAdjustmentGetOutputData get (BSDMSessionContext context, BatchRequestObjectKeyData __BatchRequest) throws BSDMResourceException;


  /**
   * retrieves Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param __BatchRequest Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BalanceLineItemBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BalanceLineItemBulkAdjustmentGetOutputData get (BatchRequestObjectKeyData __BatchRequest, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * retrieves Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param __BatchRequest Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BalanceLineItemBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BalanceLineItemBulkAdjustmentGetOutputData get (BSDMSessionContext context, BatchRequestObjectKeyData __BatchRequest, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Updates Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param ___BulkAdjustment Input  Object.
   * @param ______BatchRequest Input  Object.
   * @param ________BalanceLineItem Input List Object.
   * @param __BalanceLineItemQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BatchRequestObjectData update (BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData ______BatchRequest, BalanceLineItemObjectData[] ________BalanceLineItem, BalanceLineItemQueryObjectData __BalanceLineItemQuery, String __XMLFileName, String __CDFFileName) throws BSDMResourceException;
  /**
   * Updates Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BulkAdjustment Input  Object.
   * @param ______BatchRequest Input  Object.
   * @param ________BalanceLineItem Input List Object.
   * @param __BalanceLineItemQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BatchRequestObjectData update (BSDMSessionContext context, BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData ______BatchRequest, BalanceLineItemObjectData[] ________BalanceLineItem, BalanceLineItemQueryObjectData __BalanceLineItemQuery, String __XMLFileName, String __CDFFileName) throws BSDMResourceException;


  /**
   * Updates Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param ___BulkAdjustment Input  Object.
   * @param ______BatchRequest Input  Object.
   * @param ________BalanceLineItem Input List Object.
   * @param __BalanceLineItemQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BatchRequestObjectData update (BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData ______BatchRequest, BalanceLineItemObjectData[] ________BalanceLineItem, BalanceLineItemQueryObjectData __BalanceLineItemQuery, String __XMLFileName, String __CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Updates Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BulkAdjustment Input  Object.
   * @param ______BatchRequest Input  Object.
   * @param ________BalanceLineItem Input List Object.
   * @param __BalanceLineItemQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BatchRequestObjectData update (BSDMSessionContext context, BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData ______BatchRequest, BalanceLineItemObjectData[] ________BalanceLineItem, BalanceLineItemQueryObjectData __BalanceLineItemQuery, String __XMLFileName, String __CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
