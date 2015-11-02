
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
public interface VoucherStatusInfoInterface extends BaliInterface {

  /**
   * Assign Account or Service to a row in voucher_status_info..
   * Convenience method using default BSDMSessionContext.
   * @param VouAsIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectData assign (VoucherStatusInfoObjectData VouAsIn) throws BSDMResourceException;
  /**
   * Assign Account or Service to a row in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouAsIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectData assign (BSDMSessionContext context, VoucherStatusInfoObjectData VouAsIn) throws BSDMResourceException;


  /**
   * Assign Account or Service to a row in voucher_status_info..
   * Convenience method using default BSDMSessionContext.
   * @param VouAsIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusInfoObjectData assign (VoucherStatusInfoObjectData VouAsIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Assign Account or Service to a row in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouAsIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusInfoObjectData assign (BSDMSessionContext context, VoucherStatusInfoObjectData VouAsIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Activate is Update Required fields for Activation in voucher_status_info..
   * Convenience method using default BSDMSessionContext.
   * @param VouAcIn Input  Object.  Read-Only fields: UniqueVoucherId, AccountInternalId, ServiceInternalId, ServiceInternalIdResets, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectData activate (VoucherStatusInfoObjectData VouAcIn) throws BSDMResourceException;
  /**
   * Activate is Update Required fields for Activation in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouAcIn Input  Object.  Read-Only fields: UniqueVoucherId, AccountInternalId, ServiceInternalId, ServiceInternalIdResets, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectData activate (BSDMSessionContext context, VoucherStatusInfoObjectData VouAcIn) throws BSDMResourceException;


  /**
   * Activate is Update Required fields for Activation in voucher_status_info..
   * Convenience method using default BSDMSessionContext.
   * @param VouAcIn Input  Object.  Read-Only fields: UniqueVoucherId, AccountInternalId, ServiceInternalId, ServiceInternalIdResets, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusInfoObjectData activate (VoucherStatusInfoObjectData VouAcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Activate is Update Required fields for Activation in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouAcIn Input  Object.  Read-Only fields: UniqueVoucherId, AccountInternalId, ServiceInternalId, ServiceInternalIdResets, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusInfoObjectData activate (BSDMSessionContext context, VoucherStatusInfoObjectData VouAcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields for a row in voucher_status_info..
   * Convenience method using default BSDMSessionContext.
   * @param VouUIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectData update (VoucherStatusInfoObjectData VouUIn) throws BSDMResourceException;
  /**
   * Update non-key fields for a row in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouUIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectData update (BSDMSessionContext context, VoucherStatusInfoObjectData VouUIn) throws BSDMResourceException;


  /**
   * Update non-key fields for a row in voucher_status_info..
   * Convenience method using default BSDMSessionContext.
   * @param VouUIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusInfoObjectData update (VoucherStatusInfoObjectData VouUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields for a row in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouUIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusInfoObjectData update (BSDMSessionContext context, VoucherStatusInfoObjectData VouUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update Status to Consumed state for a row in voucher_status_info..
   * Convenience method using default BSDMSessionContext.
   * @param VouCoIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectData consumed (VoucherStatusInfoObjectData VouCoIn) throws BSDMResourceException;
  /**
   * Update Status to Consumed state for a row in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouCoIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectData consumed (BSDMSessionContext context, VoucherStatusInfoObjectData VouCoIn) throws BSDMResourceException;


  /**
   * Update Status to Consumed state for a row in voucher_status_info..
   * Convenience method using default BSDMSessionContext.
   * @param VouCoIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusInfoObjectData consumed (VoucherStatusInfoObjectData VouCoIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update Status to Consumed state for a row in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouCoIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusInfoObjectData consumed (BSDMSessionContext context, VoucherStatusInfoObjectData VouCoIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get Unique Voucher Status Info that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouGIn Input Object Key.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectData get (VoucherStatusInfoObjectKeyData VouGIn) throws BSDMResourceException;
  /**
   * Get Unique Voucher Status Info that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouGIn Input Object Key.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectData get (BSDMSessionContext context, VoucherStatusInfoObjectKeyData VouGIn) throws BSDMResourceException;


  /**
   * Get Unique Voucher Status Info that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusInfoObjectData get (VoucherStatusInfoObjectKeyData VouGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get Unique Voucher Status Info that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusInfoObjectData get (BSDMSessionContext context, VoucherStatusInfoObjectKeyData VouGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Voucher Status Info that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouFIn Input Filter Object.
   * @return VoucherStatusInfoObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectDataList find (VoucherStatusInfoObjectFilter VouFIn) throws BSDMResourceException;
  /**
   * Find Voucher Status Info that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouFIn Input Filter Object.
   * @return VoucherStatusInfoObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectDataList find (BSDMSessionContext context, VoucherStatusInfoObjectFilter VouFIn) throws BSDMResourceException;


  /**
   * Find Voucher Status Info that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusInfoObjectDataList find (VoucherStatusInfoObjectFilter VouFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Voucher Status Info that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusInfoObjectDataList find (BSDMSessionContext context, VoucherStatusInfoObjectFilter VouFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
