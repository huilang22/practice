
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

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface PaymentInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectData get (PaymentObjectKeyData getIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectData get (BSDMSessionContext context, PaymentObjectKeyData getIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentObjectData get (PaymentObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentObjectData get (BSDMSessionContext context, PaymentObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectDataList find (PaymentObjectFilter findIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectDataList find (BSDMSessionContext context, PaymentObjectFilter findIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentObjectDataList find (PaymentObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentObjectDataList find (BSDMSessionContext context, PaymentObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param nbfindIn Input Filter Object.
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectDataList noBackoutFind (PaymentObjectFilter nbfindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param nbfindIn Input Filter Object.
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectDataList noBackoutFind (BSDMSessionContext context, PaymentObjectFilter nbfindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param nbfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentObjectDataList noBackoutFind (PaymentObjectFilter nbfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param nbfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentObjectDataList noBackoutFind (BSDMSessionContext context, PaymentObjectFilter nbfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param findCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (PaymentObjectFilter findCountIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (BSDMSessionContext context, PaymentObjectFilter findCountIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param findCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findCount (PaymentObjectFilter findCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findCount (BSDMSessionContext context, PaymentObjectFilter findCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * PaymentCreate creates a new Payment.  New version will no longer create an entry in PAYMENT_PROFILE.  You must first call PaymentProfileCreate, if necessary..
   * Convenience method using default BSDMSessionContext.
   * @param payCreateIn1 Input  Object.
   * @param WaiveEpg (has a default).
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectData create (PaymentObjectData payCreateIn1, Integer WaiveEpg) throws BSDMResourceException;
  /**
   * PaymentCreate creates a new Payment.  New version will no longer create an entry in PAYMENT_PROFILE.  You must first call PaymentProfileCreate, if necessary..
   * @param context The session context to use when connecting to the APITS server.
   * @param payCreateIn1 Input  Object.
   * @param WaiveEpg (has a default).
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectData create (BSDMSessionContext context, PaymentObjectData payCreateIn1, Integer WaiveEpg) throws BSDMResourceException;


  /**
   * PaymentCreate creates a new Payment.  New version will no longer create an entry in PAYMENT_PROFILE.  You must first call PaymentProfileCreate, if necessary..
   * Convenience method using default BSDMSessionContext.
   * @param payCreateIn1 Input  Object.
   * @param WaiveEpg (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentObjectData create (PaymentObjectData payCreateIn1, Integer WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * PaymentCreate creates a new Payment.  New version will no longer create an entry in PAYMENT_PROFILE.  You must first call PaymentProfileCreate, if necessary..
   * @param context The session context to use when connecting to the APITS server.
   * @param payCreateIn1 Input  Object.
   * @param WaiveEpg (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentObjectData create (BSDMSessionContext context, PaymentObjectData payCreateIn1, Integer WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param payUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectData update (PaymentObjectData payUpdateIn1, Integer _WaiveEpg) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectData update (BSDMSessionContext context, PaymentObjectData payUpdateIn1, Integer _WaiveEpg) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param payUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentObjectData update (PaymentObjectData payUpdateIn1, Integer _WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentObjectData update (BSDMSessionContext context, PaymentObjectData payUpdateIn1, Integer _WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param payXferIn Input Object Key.
   * @param account_external_id.
   * @param account_external_id_type.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectData transfer (PaymentObjectKeyData payXferIn, String account_external_id, Integer account_external_id_type, Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payXferIn Input Object Key.
   * @param account_external_id.
   * @param account_external_id_type.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectData transfer (BSDMSessionContext context, PaymentObjectKeyData payXferIn, String account_external_id, Integer account_external_id_type, Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param payXferIn Input Object Key.
   * @param account_external_id.
   * @param account_external_id_type.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentObjectData transfer (PaymentObjectKeyData payXferIn, String account_external_id, Integer account_external_id_type, Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payXferIn Input Object Key.
   * @param account_external_id.
   * @param account_external_id_type.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentObjectData transfer (BSDMSessionContext context, PaymentObjectKeyData payXferIn, String account_external_id, Integer account_external_id_type, Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param payReverseIn Input  Object.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectData reverse (PaymentObjectData payReverseIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payReverseIn Input  Object.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectData reverse (BSDMSessionContext context, PaymentObjectData payReverseIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param payReverseIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentObjectData reverse (PaymentObjectData payReverseIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payReverseIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentObjectData reverse (BSDMSessionContext context, PaymentObjectData payReverseIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param payDeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void delete (PaymentObjectKeyData payDeleteIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payDeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void delete (BSDMSessionContext context, PaymentObjectKeyData payDeleteIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param payDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void delete (PaymentObjectKeyData payDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void delete (BSDMSessionContext context, PaymentObjectKeyData payDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param payCountIn Input  Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer count (PaymentObjectData payCountIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payCountIn Input  Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer count (BSDMSessionContext context, PaymentObjectData payCountIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param payCountIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer count (PaymentObjectData payCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payCountIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer count (BSDMSessionContext context, PaymentObjectData payCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Allocate a Payment from the Suspense Account..
   * Convenience method using default BSDMSessionContext.
   * @param payAllocateIn Input  Object.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void allocate (PaymentObjectData payAllocateIn) throws BSDMResourceException;
  /**
   * Allocate a Payment from the Suspense Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param payAllocateIn Input  Object.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void allocate (BSDMSessionContext context, PaymentObjectData payAllocateIn) throws BSDMResourceException;


  /**
   * Allocate a Payment from the Suspense Account..
   * Convenience method using default BSDMSessionContext.
   * @param payAllocateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void allocate (PaymentObjectData payAllocateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Allocate a Payment from the Suspense Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param payAllocateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void allocate (BSDMSessionContext context, PaymentObjectData payAllocateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param charge_type.
   * @param conversion_date (null is allowed).
   * @param currency_code.
   * @param exrate_class.
   * @param external_amount.
   * @param external_currency.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger amountConvert (Integer charge_type, Date conversion_date, Integer currency_code, Integer exrate_class, BigInteger external_amount, Integer external_currency) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param charge_type.
   * @param conversion_date (null is allowed).
   * @param currency_code.
   * @param exrate_class.
   * @param external_amount.
   * @param external_currency.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger amountConvert (BSDMSessionContext context, Integer charge_type, Date conversion_date, Integer currency_code, Integer exrate_class, BigInteger external_amount, Integer external_currency) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param charge_type.
   * @param conversion_date (null is allowed).
   * @param currency_code.
   * @param exrate_class.
   * @param external_amount.
   * @param external_currency.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BigInteger amountConvert (Integer charge_type, Date conversion_date, Integer currency_code, Integer exrate_class, BigInteger external_amount, Integer external_currency, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param charge_type.
   * @param conversion_date (null is allowed).
   * @param currency_code.
   * @param exrate_class.
   * @param external_amount.
   * @param external_currency.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BigInteger amountConvert (BSDMSessionContext context, Integer charge_type, Date conversion_date, Integer currency_code, Integer exrate_class, BigInteger external_amount, Integer external_currency, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param payDebitAssumedIn1 Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData debitAssumed (PaymentObjectData payDebitAssumedIn1) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payDebitAssumedIn1 Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData debitAssumed (BSDMSessionContext context, PaymentObjectData payDebitAssumedIn1) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param payDebitAssumedIn1 Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentTransObjectData debitAssumed (PaymentObjectData payDebitAssumedIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payDebitAssumedIn1 Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentTransObjectData debitAssumed (BSDMSessionContext context, PaymentObjectData payDebitAssumedIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param payCreditIn1 Input  Object.
   * @param _payment_Trans Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData credit (PaymentObjectData payCreditIn1, PaymentTransObjectData _payment_Trans) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payCreditIn1 Input  Object.
   * @param _payment_Trans Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData credit (BSDMSessionContext context, PaymentObjectData payCreditIn1, PaymentTransObjectData _payment_Trans) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param payCreditIn1 Input  Object.
   * @param _payment_Trans Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentTransObjectData credit (PaymentObjectData payCreditIn1, PaymentTransObjectData _payment_Trans, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payCreditIn1 Input  Object.
   * @param _payment_Trans Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentTransObjectData credit (BSDMSessionContext context, PaymentObjectData payCreditIn1, PaymentTransObjectData _payment_Trans, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param payValidateIn1 Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData validate (PaymentObjectData payValidateIn1) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payValidateIn1 Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData validate (BSDMSessionContext context, PaymentObjectData payValidateIn1) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param payValidateIn1 Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentTransObjectData validate (PaymentObjectData payValidateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payValidateIn1 Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentTransObjectData validate (BSDMSessionContext context, PaymentObjectData payValidateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * PaymentCreatePending creates an authorization of a pending Payment. It creates a row in PAYMENT_TRANS. .
   * Convenience method using default BSDMSessionContext.
   * @param paypendingCreateIn1 Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData createPending (PaymentObjectData paypendingCreateIn1) throws BSDMResourceException;
  /**
   * PaymentCreatePending creates an authorization of a pending Payment. It creates a row in PAYMENT_TRANS. .
   * @param context The session context to use when connecting to the APITS server.
   * @param paypendingCreateIn1 Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData createPending (BSDMSessionContext context, PaymentObjectData paypendingCreateIn1) throws BSDMResourceException;


  /**
   * PaymentCreatePending creates an authorization of a pending Payment. It creates a row in PAYMENT_TRANS. .
   * Convenience method using default BSDMSessionContext.
   * @param paypendingCreateIn1 Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentTransObjectData createPending (PaymentObjectData paypendingCreateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * PaymentCreatePending creates an authorization of a pending Payment. It creates a row in PAYMENT_TRANS. .
   * @param context The session context to use when connecting to the APITS server.
   * @param paypendingCreateIn1 Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentTransObjectData createPending (BSDMSessionContext context, PaymentObjectData paypendingCreateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * PaymentCompletePending completes a pending Payment. It creates a row in BMF. .
   * Convenience method using default BSDMSessionContext.
   * @param paypndcmp_tracking_id.
   * @param paypndcmp_tracking_id_serv.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectData completePending (Integer paypndcmp_tracking_id, Integer paypndcmp_tracking_id_serv) throws BSDMResourceException;
  /**
   * PaymentCompletePending completes a pending Payment. It creates a row in BMF. .
   * @param context The session context to use when connecting to the APITS server.
   * @param paypndcmp_tracking_id.
   * @param paypndcmp_tracking_id_serv.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentObjectData completePending (BSDMSessionContext context, Integer paypndcmp_tracking_id, Integer paypndcmp_tracking_id_serv) throws BSDMResourceException;


  /**
   * PaymentCompletePending completes a pending Payment. It creates a row in BMF. .
   * Convenience method using default BSDMSessionContext.
   * @param paypndcmp_tracking_id.
   * @param paypndcmp_tracking_id_serv.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentObjectData completePending (Integer paypndcmp_tracking_id, Integer paypndcmp_tracking_id_serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * PaymentCompletePending completes a pending Payment. It creates a row in BMF. .
   * @param context The session context to use when connecting to the APITS server.
   * @param paypndcmp_tracking_id.
   * @param paypndcmp_tracking_id_serv.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentObjectData completePending (BSDMSessionContext context, Integer paypndcmp_tracking_id, Integer paypndcmp_tracking_id_serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * PaymentCancelPending cancels a pending Payment, updates PAYMENT_TRANS. .
   * Convenience method using default BSDMSessionContext.
   * @param paypndcnl_tracking_id.
   * @param paypndcnl_tracking_id_serv.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData cancelPending (Integer paypndcnl_tracking_id, Integer paypndcnl_tracking_id_serv) throws BSDMResourceException;
  /**
   * PaymentCancelPending cancels a pending Payment, updates PAYMENT_TRANS. .
   * @param context The session context to use when connecting to the APITS server.
   * @param paypndcnl_tracking_id.
   * @param paypndcnl_tracking_id_serv.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PaymentTransObjectData cancelPending (BSDMSessionContext context, Integer paypndcnl_tracking_id, Integer paypndcnl_tracking_id_serv) throws BSDMResourceException;


  /**
   * PaymentCancelPending cancels a pending Payment, updates PAYMENT_TRANS. .
   * Convenience method using default BSDMSessionContext.
   * @param paypndcnl_tracking_id.
   * @param paypndcnl_tracking_id_serv.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PaymentTransObjectData cancelPending (Integer paypndcnl_tracking_id, Integer paypndcnl_tracking_id_serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * PaymentCancelPending cancels a pending Payment, updates PAYMENT_TRANS. .
   * @param context The session context to use when connecting to the APITS server.
   * @param paypndcnl_tracking_id.
   * @param paypndcnl_tracking_id_serv.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PaymentTransObjectData cancelPending (BSDMSessionContext context, Integer paypndcnl_tracking_id, Integer paypndcnl_tracking_id_serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
