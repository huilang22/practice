
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
public interface BalanceLineItemInterface extends BaliInterface {

  /**
   * Get a BalanceLineItem..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemGetIn Input Object Key.
   * @return BalanceLineItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BalanceLineItemObjectData get (BalanceLineItemObjectKeyData BalanceLineItemGetIn) throws BSDMResourceException;
  /**
   * Get a BalanceLineItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemGetIn Input Object Key.
   * @return BalanceLineItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BalanceLineItemObjectData get (BSDMSessionContext context, BalanceLineItemObjectKeyData BalanceLineItemGetIn) throws BSDMResourceException;


  /**
   * Get a BalanceLineItem..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BalanceLineItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BalanceLineItemObjectData get (BalanceLineItemObjectKeyData BalanceLineItemGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a BalanceLineItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BalanceLineItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BalanceLineItemObjectData get (BSDMSessionContext context, BalanceLineItemObjectKeyData BalanceLineItemGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find BalanceLineItem's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemFindIn Input Filter Object.
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BalanceLineItemObjectDataList find (BalanceLineItemObjectFilter BalanceLineItemFindIn) throws BSDMResourceException;
  /**
   * Find BalanceLineItem's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemFindIn Input Filter Object.
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BalanceLineItemObjectDataList find (BSDMSessionContext context, BalanceLineItemObjectFilter BalanceLineItemFindIn) throws BSDMResourceException;


  /**
   * Find BalanceLineItem's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BalanceLineItemObjectDataList find (BalanceLineItemObjectFilter BalanceLineItemFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find BalanceLineItem's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BalanceLineItemObjectDataList find (BSDMSessionContext context, BalanceLineItemObjectFilter BalanceLineItemFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Count of BalanceLineItem's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemFindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (BalanceLineItemObjectFilter BalanceLineItemFindCountIn) throws BSDMResourceException;
  /**
   * Find Count of BalanceLineItem's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemFindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (BSDMSessionContext context, BalanceLineItemObjectFilter BalanceLineItemFindCountIn) throws BSDMResourceException;


  /**
   * Find Count of BalanceLineItem's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemFindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findCount (BalanceLineItemObjectFilter BalanceLineItemFindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Count of BalanceLineItem's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemFindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findCount (BSDMSessionContext context, BalanceLineItemObjectFilter BalanceLineItemFindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find BalanceLineItem's by Account and Invoice attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemAcctFindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BalanceLineItemObjectDataList byAccountFind (BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindIn, Boolean LatestInvoice) throws BSDMResourceException;
  /**
   * Find BalanceLineItem's by Account and Invoice attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemAcctFindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BalanceLineItemObjectDataList byAccountFind (BSDMSessionContext context, BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindIn, Boolean LatestInvoice) throws BSDMResourceException;


  /**
   * Find BalanceLineItem's by Account and Invoice attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemAcctFindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BalanceLineItemObjectDataList byAccountFind (BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindIn, Boolean LatestInvoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find BalanceLineItem's by Account and Invoice attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemAcctFindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BalanceLineItemObjectDataList byAccountFind (BSDMSessionContext context, BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindIn, Boolean LatestInvoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Count BalanceLineItem's by Account and Invoice attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemAcctFindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer byAccountCount (BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindCountIn, Boolean LatestInvoice1) throws BSDMResourceException;
  /**
   * Find Count BalanceLineItem's by Account and Invoice attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemAcctFindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer byAccountCount (BSDMSessionContext context, BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindCountIn, Boolean LatestInvoice1) throws BSDMResourceException;


  /**
   * Find Count BalanceLineItem's by Account and Invoice attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemAcctFindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer byAccountCount (BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindCountIn, Boolean LatestInvoice1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Count BalanceLineItem's by Account and Invoice attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemAcctFindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer byAccountCount (BSDMSessionContext context, BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindCountIn, Boolean LatestInvoice1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve the Amounts for a particular BalanceLineItem..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemAmountGetIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger amountGet (BalanceLineItemObjectKeyData BalanceLineItemAmountGetIn) throws BSDMResourceException;
  /**
   * Retrieve the Amounts for a particular BalanceLineItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemAmountGetIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger amountGet (BSDMSessionContext context, BalanceLineItemObjectKeyData BalanceLineItemAmountGetIn) throws BSDMResourceException;


  /**
   * Retrieve the Amounts for a particular BalanceLineItem..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemAmountGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BigInteger amountGet (BalanceLineItemObjectKeyData BalanceLineItemAmountGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve the Amounts for a particular BalanceLineItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemAmountGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BigInteger amountGet (BSDMSessionContext context, BalanceLineItemObjectKeyData BalanceLineItemAmountGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
