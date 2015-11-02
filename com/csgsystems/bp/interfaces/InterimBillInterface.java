
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
public interface InterimBillInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillObjectData get (InterimBillObjectKeyData getIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillObjectData get (BSDMSessionContext context, InterimBillObjectKeyData getIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InterimBillObjectData get (InterimBillObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InterimBillObjectData get (BSDMSessionContext context, InterimBillObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return InterimBillObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillObjectDataList find (InterimBillObjectFilter findIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return InterimBillObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillObjectDataList find (BSDMSessionContext context, InterimBillObjectFilter findIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InterimBillObjectDataList find (InterimBillObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InterimBillObjectDataList find (BSDMSessionContext context, InterimBillObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillCreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Derived Fields: TrackingId, TrackingIdServ.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillObjectData create (InterimBillObjectData intBillCreateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillCreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Derived Fields: TrackingId, TrackingIdServ.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillObjectData create (BSDMSessionContext context, InterimBillObjectData intBillCreateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillCreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Derived Fields: TrackingId, TrackingIdServ.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InterimBillObjectData create (InterimBillObjectData intBillCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillCreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Derived Fields: TrackingId, TrackingIdServ.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InterimBillObjectData create (BSDMSessionContext context, InterimBillObjectData intBillCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillUpdateIn Input  Object.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillObjectData update (InterimBillObjectData intBillUpdateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillUpdateIn Input  Object.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillObjectData update (BSDMSessionContext context, InterimBillObjectData intBillUpdateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InterimBillObjectData update (InterimBillObjectData intBillUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InterimBillObjectData update (BSDMSessionContext context, InterimBillObjectData intBillUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillDelIn Input Object Key.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillObjectData cancel (InterimBillObjectKeyData intBillDelIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillDelIn Input Object Key.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillObjectData cancel (BSDMSessionContext context, InterimBillObjectKeyData intBillDelIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillDelIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InterimBillObjectData cancel (InterimBillObjectKeyData intBillDelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillDelIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InterimBillObjectData cancel (BSDMSessionContext context, InterimBillObjectKeyData intBillDelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillHotIn Input  Object.
   * @param Hot_Invoice Input  Object (Optional).  Read-Only fields: HotReqReturnCustom, HotReqReturnStatus, HotReqBillRefNo, HotReqBillRefResets.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillObjectData requestHot (InterimBillObjectData intBillHotIn, HotInvoiceObjectData Hot_Invoice) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillHotIn Input  Object.
   * @param Hot_Invoice Input  Object (Optional).  Read-Only fields: HotReqReturnCustom, HotReqReturnStatus, HotReqBillRefNo, HotReqBillRefResets.
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillObjectData requestHot (BSDMSessionContext context, InterimBillObjectData intBillHotIn, HotInvoiceObjectData Hot_Invoice) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillHotIn Input  Object.
   * @param Hot_Invoice Input  Object (Optional).  Read-Only fields: HotReqReturnCustom, HotReqReturnStatus, HotReqBillRefNo, HotReqBillRefResets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InterimBillObjectData requestHot (InterimBillObjectData intBillHotIn, HotInvoiceObjectData Hot_Invoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillHotIn Input  Object.
   * @param Hot_Invoice Input  Object (Optional).  Read-Only fields: HotReqReturnCustom, HotReqReturnStatus, HotReqBillRefNo, HotReqBillRefResets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InterimBillObjectData requestHot (BSDMSessionContext context, InterimBillObjectData intBillHotIn, HotInvoiceObjectData Hot_Invoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillPollIn Input  Object.
   * @return InterimBillPollHotOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillPollHotOutputData pollHot (InterimBillObjectData intBillPollIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillPollIn Input  Object.
   * @return InterimBillPollHotOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public InterimBillPollHotOutputData pollHot (BSDMSessionContext context, InterimBillObjectData intBillPollIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param intBillPollIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillPollHotOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InterimBillPollHotOutputData pollHot (InterimBillObjectData intBillPollIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param intBillPollIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InterimBillPollHotOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InterimBillPollHotOutputData pollHot (BSDMSessionContext context, InterimBillObjectData intBillPollIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
