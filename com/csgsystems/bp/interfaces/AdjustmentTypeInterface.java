
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
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface AdjustmentTypeInterface extends BaliInterface {

  /**
   * Get an AdjustmentType..
   * Convenience method using default BSDMSessionContext.
   * @param atdGetIn Input Object Key.
   * @return AdjustmentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentTypeObjectData get (AdjustmentTypeObjectKeyData atdGetIn) throws BSDMResourceException;
  /**
   * Get an AdjustmentType..
   * @param context The session context to use when connecting to the APITS server.
   * @param atdGetIn Input Object Key.
   * @return AdjustmentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentTypeObjectData get (BSDMSessionContext context, AdjustmentTypeObjectKeyData atdGetIn) throws BSDMResourceException;


  /**
   * Get an AdjustmentType..
   * Convenience method using default BSDMSessionContext.
   * @param atdGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentTypeObjectData get (AdjustmentTypeObjectKeyData atdGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get an AdjustmentType..
   * @param context The session context to use when connecting to the APITS server.
   * @param atdGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentTypeObjectData get (BSDMSessionContext context, AdjustmentTypeObjectKeyData atdGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AdjustmentTypes..
   * Convenience method using default BSDMSessionContext.
   * @param atdFindIn Input Filter Object.
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentTypeObjectDataList find (AdjustmentTypeObjectFilter atdFindIn) throws BSDMResourceException;
  /**
   * Find AdjustmentTypes..
   * @param context The session context to use when connecting to the APITS server.
   * @param atdFindIn Input Filter Object.
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentTypeObjectDataList find (BSDMSessionContext context, AdjustmentTypeObjectFilter atdFindIn) throws BSDMResourceException;


  /**
   * Find AdjustmentTypes..
   * Convenience method using default BSDMSessionContext.
   * @param atdFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentTypeObjectDataList find (AdjustmentTypeObjectFilter atdFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AdjustmentTypes..
   * @param context The session context to use when connecting to the APITS server.
   * @param atdFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentTypeObjectDataList find (BSDMSessionContext context, AdjustmentTypeObjectFilter atdFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find eligible AdjustmentTypes for the specified item..
   * Convenience method using default BSDMSessionContext.
   * @param unbilled_usage Input  Object.
   * @param billed_usage Input  Object.
   * @param invoice_detail Input  Object.
   * @param balance_line_item Input  Object.
   * @param invoice Input  Object.
   * @param language_code (null is allowed).
   * @param trans_sign (null is allowed).
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentTypeObjectDataList eligibleFind (UnbilledUsageObjectData unbilled_usage, BilledUsageObjectData billed_usage, InvoiceDetailObjectData invoice_detail, BalanceLineItemObjectData balance_line_item, InvoiceObjectData invoice, Integer language_code, Integer trans_sign) throws BSDMResourceException;
  /**
   * Find eligible AdjustmentTypes for the specified item..
   * @param context The session context to use when connecting to the APITS server.
   * @param unbilled_usage Input  Object.
   * @param billed_usage Input  Object.
   * @param invoice_detail Input  Object.
   * @param balance_line_item Input  Object.
   * @param invoice Input  Object.
   * @param language_code (null is allowed).
   * @param trans_sign (null is allowed).
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentTypeObjectDataList eligibleFind (BSDMSessionContext context, UnbilledUsageObjectData unbilled_usage, BilledUsageObjectData billed_usage, InvoiceDetailObjectData invoice_detail, BalanceLineItemObjectData balance_line_item, InvoiceObjectData invoice, Integer language_code, Integer trans_sign) throws BSDMResourceException;


  /**
   * Find eligible AdjustmentTypes for the specified item..
   * Convenience method using default BSDMSessionContext.
   * @param unbilled_usage Input  Object.
   * @param billed_usage Input  Object.
   * @param invoice_detail Input  Object.
   * @param balance_line_item Input  Object.
   * @param invoice Input  Object.
   * @param language_code (null is allowed).
   * @param trans_sign (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentTypeObjectDataList eligibleFind (UnbilledUsageObjectData unbilled_usage, BilledUsageObjectData billed_usage, InvoiceDetailObjectData invoice_detail, BalanceLineItemObjectData balance_line_item, InvoiceObjectData invoice, Integer language_code, Integer trans_sign, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find eligible AdjustmentTypes for the specified item..
   * @param context The session context to use when connecting to the APITS server.
   * @param unbilled_usage Input  Object.
   * @param billed_usage Input  Object.
   * @param invoice_detail Input  Object.
   * @param balance_line_item Input  Object.
   * @param invoice Input  Object.
   * @param language_code (null is allowed).
   * @param trans_sign (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentTypeObjectDataList eligibleFind (BSDMSessionContext context, UnbilledUsageObjectData unbilled_usage, BilledUsageObjectData billed_usage, InvoiceDetailObjectData invoice_detail, BalanceLineItemObjectData balance_line_item, InvoiceObjectData invoice, Integer language_code, Integer trans_sign, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param LanguageCode.
   * @param adj_trans_group.
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentTypeObjectDataList byGroupFind (Integer LanguageCode, Integer adj_trans_group) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param LanguageCode.
   * @param adj_trans_group.
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentTypeObjectDataList byGroupFind (BSDMSessionContext context, Integer LanguageCode, Integer adj_trans_group) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param LanguageCode.
   * @param adj_trans_group.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentTypeObjectDataList byGroupFind (Integer LanguageCode, Integer adj_trans_group, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param LanguageCode.
   * @param adj_trans_group.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentTypeObjectDataList byGroupFind (BSDMSessionContext context, Integer LanguageCode, Integer adj_trans_group, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
