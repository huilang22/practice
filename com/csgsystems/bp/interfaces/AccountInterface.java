
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

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface AccountInterface extends BaliInterface {

  /**
   * Generates a new AccountInternalId for a new Account.  Used to pass to AccountCreate later..
   * Convenience method using default BSDMSessionContext.
   * @return AccountObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountObjectKeyData sequenceGet () throws BSDMResourceException;
  /**
   * Generates a new AccountInternalId for a new Account.  Used to pass to AccountCreate later..
   * @param context The session context to use when connecting to the APITS server.
   * @return AccountObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountObjectKeyData sequenceGet (BSDMSessionContext context) throws BSDMResourceException;


  /**
   * Generates a new AccountInternalId for a new Account.  Used to pass to AccountCreate later..
   * Convenience method using default BSDMSessionContext.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountObjectKeyData sequenceGet (String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Generates a new AccountInternalId for a new Account.  Used to pass to AccountCreate later..
   * @param context The session context to use when connecting to the APITS server.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountObjectKeyData sequenceGet (BSDMSessionContext context, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Creates a new Account. An optional PaymentProfile object should be passed if payment method is via Credit Card. This method is automatically routed to the least used customer server when called in an MSA environment..
   * Convenience method using default BSDMSessionContext.
   * @param acIn Input  Object.  Read-Only fields: PaymentProfileId, AccountExternalIdType, ParentAccountExternalIdType, ParentAccountExternalId, ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ActiveDate, InactiveDate, ServerId.
   * @param _____PaymentProfile Input  Object.
   * @param billingSC.
   * @param remitSC.
   * @param inquirySC.
   * @param collectionSC.
   * @param printSC.
   * @param server_category (null is allowed).
   * @return AccountCreateOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCreateOutputData create (AccountXIDObjectData acIn, PaymentProfileObjectData _____PaymentProfile, Integer billingSC, Integer remitSC, Integer inquirySC, Integer collectionSC, Integer printSC, Integer server_category) throws BSDMResourceException;
  /**
   * Creates a new Account. An optional PaymentProfile object should be passed if payment method is via Credit Card. This method is automatically routed to the least used customer server when called in an MSA environment..
   * @param context The session context to use when connecting to the APITS server.
   * @param acIn Input  Object.  Read-Only fields: PaymentProfileId, AccountExternalIdType, ParentAccountExternalIdType, ParentAccountExternalId, ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ActiveDate, InactiveDate, ServerId.
   * @param _____PaymentProfile Input  Object.
   * @param billingSC.
   * @param remitSC.
   * @param inquirySC.
   * @param collectionSC.
   * @param printSC.
   * @param server_category (null is allowed).
   * @return AccountCreateOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCreateOutputData create (BSDMSessionContext context, AccountXIDObjectData acIn, PaymentProfileObjectData _____PaymentProfile, Integer billingSC, Integer remitSC, Integer inquirySC, Integer collectionSC, Integer printSC, Integer server_category) throws BSDMResourceException;


  /**
   * Creates a new Account. An optional PaymentProfile object should be passed if payment method is via Credit Card. This method is automatically routed to the least used customer server when called in an MSA environment..
   * Convenience method using default BSDMSessionContext.
   * @param acIn Input  Object.  Read-Only fields: PaymentProfileId, AccountExternalIdType, ParentAccountExternalIdType, ParentAccountExternalId, ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ActiveDate, InactiveDate, ServerId.
   * @param _____PaymentProfile Input  Object.
   * @param billingSC.
   * @param remitSC.
   * @param inquirySC.
   * @param collectionSC.
   * @param printSC.
   * @param server_category (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCreateOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountCreateOutputData create (AccountXIDObjectData acIn, PaymentProfileObjectData _____PaymentProfile, Integer billingSC, Integer remitSC, Integer inquirySC, Integer collectionSC, Integer printSC, Integer server_category, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Creates a new Account. An optional PaymentProfile object should be passed if payment method is via Credit Card. This method is automatically routed to the least used customer server when called in an MSA environment..
   * @param context The session context to use when connecting to the APITS server.
   * @param acIn Input  Object.  Read-Only fields: PaymentProfileId, AccountExternalIdType, ParentAccountExternalIdType, ParentAccountExternalId, ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ActiveDate, InactiveDate, ServerId.
   * @param _____PaymentProfile Input  Object.
   * @param billingSC.
   * @param remitSC.
   * @param inquirySC.
   * @param collectionSC.
   * @param printSC.
   * @param server_category (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCreateOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountCreateOutputData create (BSDMSessionContext context, AccountXIDObjectData acIn, PaymentProfileObjectData _____PaymentProfile, Integer billingSC, Integer remitSC, Integer inquirySC, Integer collectionSC, Integer printSC, Integer server_category, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieves an Account object based on its key..
   * Convenience method using default BSDMSessionContext.
   * @param agIn Input Object Key.
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectData get (AccountObjectKeyData agIn) throws BSDMResourceException;
  /**
   * Retrieves an Account object based on its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param agIn Input Object Key.
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectData get (BSDMSessionContext context, AccountObjectKeyData agIn) throws BSDMResourceException;


  /**
   * Retrieves an Account object based on its key..
   * Convenience method using default BSDMSessionContext.
   * @param agIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountXIDObjectData get (AccountObjectKeyData agIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieves an Account object based on its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param agIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountXIDObjectData get (BSDMSessionContext context, AccountObjectKeyData agIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds the Extended Data associated to a single account..
   * Convenience method using default BSDMSessionContext.
   * @param aedfIn Input Object Key.
   * @return AccountEDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountEDObjectDataList extendedDataFind (AccountObjectKeyData aedfIn) throws BSDMResourceException;
  /**
   * Finds the Extended Data associated to a single account..
   * @param context The session context to use when connecting to the APITS server.
   * @param aedfIn Input Object Key.
   * @return AccountEDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountEDObjectDataList extendedDataFind (BSDMSessionContext context, AccountObjectKeyData aedfIn) throws BSDMResourceException;


  /**
   * Finds the Extended Data associated to a single account..
   * Convenience method using default BSDMSessionContext.
   * @param aedfIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountEDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountEDObjectDataList extendedDataFind (AccountObjectKeyData aedfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds the Extended Data associated to a single account..
   * @param context The session context to use when connecting to the APITS server.
   * @param aedfIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountEDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountEDObjectDataList extendedDataFind (BSDMSessionContext context, AccountObjectKeyData aedfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds the # of direct children of this Account.  Equivalent to the Account.ChildCount field..
   * Convenience method using default BSDMSessionContext.
   * @param accIn Input Object Key.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer childCount (AccountObjectKeyData accIn) throws BSDMResourceException;
  /**
   * Finds the # of direct children of this Account.  Equivalent to the Account.ChildCount field..
   * @param context The session context to use when connecting to the APITS server.
   * @param accIn Input Object Key.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer childCount (BSDMSessionContext context, AccountObjectKeyData accIn) throws BSDMResourceException;


  /**
   * Finds the # of direct children of this Account.  Equivalent to the Account.ChildCount field..
   * Convenience method using default BSDMSessionContext.
   * @param accIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer childCount (AccountObjectKeyData accIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds the # of direct children of this Account.  Equivalent to the Account.ChildCount field..
   * @param context The session context to use when connecting to the APITS server.
   * @param accIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer childCount (BSDMSessionContext context, AccountObjectKeyData accIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds Accounts based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param afIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectDataList find (AccountXIDObjectFilter afIn) throws BSDMResourceException;
  /**
   * Finds Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param afIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectDataList find (BSDMSessionContext context, AccountXIDObjectFilter afIn) throws BSDMResourceException;


  /**
   * Finds Accounts based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param afIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountXIDObjectDataList find (AccountXIDObjectFilter afIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param afIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountXIDObjectDataList find (BSDMSessionContext context, AccountXIDObjectFilter afIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds Accounts based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param aofIn Input Filter Object.
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectDataList findByOrderNumber (AccountXIDOrderObjectFilter aofIn) throws BSDMResourceException;
  /**
   * Finds Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param aofIn Input Filter Object.
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectDataList findByOrderNumber (BSDMSessionContext context, AccountXIDOrderObjectFilter aofIn) throws BSDMResourceException;


  /**
   * Finds Accounts based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param aofIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountXIDObjectDataList findByOrderNumber (AccountXIDOrderObjectFilter aofIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param aofIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountXIDObjectDataList findByOrderNumber (BSDMSessionContext context, AccountXIDOrderObjectFilter aofIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds # of Accounts based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param afcIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (AccountXIDObjectFilter afcIn) throws BSDMResourceException;
  /**
   * Finds # of Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param afcIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (BSDMSessionContext context, AccountXIDObjectFilter afcIn) throws BSDMResourceException;


  /**
   * Finds # of Accounts based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param afcIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findCount (AccountXIDObjectFilter afcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds # of Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param afcIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findCount (BSDMSessionContext context, AccountXIDObjectFilter afcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param au2In Input  Object.  Read-Only fields: ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ServerId.
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectData update (AccountObjectData au2In) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param au2In Input  Object.  Read-Only fields: ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ServerId.
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectData update (BSDMSessionContext context, AccountObjectData au2In) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param au2In Input  Object.  Read-Only fields: ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ServerId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountXIDObjectData update (AccountObjectData au2In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param au2In Input  Object.  Read-Only fields: ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ServerId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountXIDObjectData update (BSDMSessionContext context, AccountObjectData au2In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Activates a pending Account (an Account that was created with a pending status..
   * Convenience method using default BSDMSessionContext.
   * @param aaIn Input Object Key.
   * @param actDate (has a default).
   * @param actReason (has a default).
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectData activate (AccountObjectKeyData aaIn, Date actDate, Integer actReason) throws BSDMResourceException;
  /**
   * Activates a pending Account (an Account that was created with a pending status..
   * @param context The session context to use when connecting to the APITS server.
   * @param aaIn Input Object Key.
   * @param actDate (has a default).
   * @param actReason (has a default).
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectData activate (BSDMSessionContext context, AccountObjectKeyData aaIn, Date actDate, Integer actReason) throws BSDMResourceException;


  /**
   * Activates a pending Account (an Account that was created with a pending status..
   * Convenience method using default BSDMSessionContext.
   * @param aaIn Input Object Key.
   * @param actDate (has a default).
   * @param actReason (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountXIDObjectData activate (AccountObjectKeyData aaIn, Date actDate, Integer actReason, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Activates a pending Account (an Account that was created with a pending status..
   * @param context The session context to use when connecting to the APITS server.
   * @param aaIn Input Object Key.
   * @param actDate (has a default).
   * @param actReason (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountXIDObjectData activate (BSDMSessionContext context, AccountObjectKeyData aaIn, Date actDate, Integer actReason, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Re-Activate a Suspended Account..
   * Convenience method using default BSDMSessionContext.
   * @param araIn Input Object Key.
   * @param ractReason (has a default).
   * @param ractDate (has a default).
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectData reactivate (AccountObjectKeyData araIn, Integer ractReason, Date ractDate) throws BSDMResourceException;
  /**
   * Re-Activate a Suspended Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param araIn Input Object Key.
   * @param ractReason (has a default).
   * @param ractDate (has a default).
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectData reactivate (BSDMSessionContext context, AccountObjectKeyData araIn, Integer ractReason, Date ractDate) throws BSDMResourceException;


  /**
   * Re-Activate a Suspended Account..
   * Convenience method using default BSDMSessionContext.
   * @param araIn Input Object Key.
   * @param ractReason (has a default).
   * @param ractDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountXIDObjectData reactivate (AccountObjectKeyData araIn, Integer ractReason, Date ractDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Re-Activate a Suspended Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param araIn Input Object Key.
   * @param ractReason (has a default).
   * @param ractDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountXIDObjectData reactivate (BSDMSessionContext context, AccountObjectKeyData araIn, Integer ractReason, Date ractDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Returns the BalanceSummary for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param agbsIn Input Object Key.
   * @return AccountBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalanceSummaryOutputData balanceSummary (AccountObjectKeyData agbsIn) throws BSDMResourceException;
  /**
   * Returns the BalanceSummary for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param agbsIn Input Object Key.
   * @return AccountBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalanceSummaryOutputData balanceSummary (BSDMSessionContext context, AccountObjectKeyData agbsIn) throws BSDMResourceException;


  /**
   * Returns the BalanceSummary for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param agbsIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBalanceSummaryOutputData balanceSummary (AccountObjectKeyData agbsIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns the BalanceSummary for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param agbsIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBalanceSummaryOutputData balanceSummary (BSDMSessionContext context, AccountObjectKeyData agbsIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Returns the Status of the Account on the Network..
   * Convenience method using default BSDMSessionContext.
   * @param agnsIn Input Object Key.
   * @param effectiveDate (null is allowed) (has a default).
   * @return NetworkStatusOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NetworkStatusOutputData networkStatus (AccountObjectKeyData agnsIn, Date effectiveDate) throws BSDMResourceException;
  /**
   * Returns the Status of the Account on the Network..
   * @param context The session context to use when connecting to the APITS server.
   * @param agnsIn Input Object Key.
   * @param effectiveDate (null is allowed) (has a default).
   * @return NetworkStatusOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NetworkStatusOutputData networkStatus (BSDMSessionContext context, AccountObjectKeyData agnsIn, Date effectiveDate) throws BSDMResourceException;


  /**
   * Returns the Status of the Account on the Network..
   * Convenience method using default BSDMSessionContext.
   * @param agnsIn Input Object Key.
   * @param effectiveDate (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NetworkStatusOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public NetworkStatusOutputData networkStatus (AccountObjectKeyData agnsIn, Date effectiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns the Status of the Account on the Network..
   * @param context The session context to use when connecting to the APITS server.
   * @param agnsIn Input Object Key.
   * @param effectiveDate (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NetworkStatusOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public NetworkStatusOutputData networkStatus (BSDMSessionContext context, AccountObjectKeyData agnsIn, Date effectiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Returns the number of Child Account's this Account has that are active on the EffectiveDate and do not have DisconnectOrder's against them due to complete prior to EffectiveDate.  Used to see whether a parent account can be Disconnected..
   * Convenience method using default BSDMSessionContext.
   * @param aaccKeyIn Input Object Key.
   * @param effective_date (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer activeChildCount (AccountObjectKeyData aaccKeyIn, Date effective_date) throws BSDMResourceException;
  /**
   * Returns the number of Child Account's this Account has that are active on the EffectiveDate and do not have DisconnectOrder's against them due to complete prior to EffectiveDate.  Used to see whether a parent account can be Disconnected..
   * @param context The session context to use when connecting to the APITS server.
   * @param aaccKeyIn Input Object Key.
   * @param effective_date (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer activeChildCount (BSDMSessionContext context, AccountObjectKeyData aaccKeyIn, Date effective_date) throws BSDMResourceException;


  /**
   * Returns the number of Child Account's this Account has that are active on the EffectiveDate and do not have DisconnectOrder's against them due to complete prior to EffectiveDate.  Used to see whether a parent account can be Disconnected..
   * Convenience method using default BSDMSessionContext.
   * @param aaccKeyIn Input Object Key.
   * @param effective_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer activeChildCount (AccountObjectKeyData aaccKeyIn, Date effective_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns the number of Child Account's this Account has that are active on the EffectiveDate and do not have DisconnectOrder's against them due to complete prior to EffectiveDate.  Used to see whether a parent account can be Disconnected..
   * @param context The session context to use when connecting to the APITS server.
   * @param aaccKeyIn Input Object Key.
   * @param effective_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer activeChildCount (BSDMSessionContext context, AccountObjectKeyData aaccKeyIn, Date effective_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds Accounts based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param afedIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectDataList findWithExtendedData (AccountXIDObjectFilter afedIn) throws BSDMResourceException;
  /**
   * Finds Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param afedIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountXIDObjectDataList findWithExtendedData (BSDMSessionContext context, AccountXIDObjectFilter afedIn) throws BSDMResourceException;


  /**
   * Finds Accounts based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param afedIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountXIDObjectDataList findWithExtendedData (AccountXIDObjectFilter afedIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param afedIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountXIDObjectDataList findWithExtendedData (BSDMSessionContext context, AccountXIDObjectFilter afedIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
