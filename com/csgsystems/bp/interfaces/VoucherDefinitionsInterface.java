
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
public interface VoucherDefinitionsInterface extends BaliInterface {

  /**
   * Create New Voucher Definition..
   * Convenience method using default BSDMSessionContext.
   * @param VouCIn Input  Object.
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherDefinitionsObjectData create (VoucherDefinitionsObjectData VouCIn) throws BSDMResourceException;
  /**
   * Create New Voucher Definition..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouCIn Input  Object.
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherDefinitionsObjectData create (BSDMSessionContext context, VoucherDefinitionsObjectData VouCIn) throws BSDMResourceException;


  /**
   * Create New Voucher Definition..
   * Convenience method using default BSDMSessionContext.
   * @param VouCIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherDefinitionsObjectData create (VoucherDefinitionsObjectData VouCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create New Voucher Definition..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouCIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherDefinitionsObjectData create (BSDMSessionContext context, VoucherDefinitionsObjectData VouCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update Location ID field for a row in VOUCHER_DEFINITIONS..
   * Convenience method using default BSDMSessionContext.
   * @param VouULIn Input  Object.  Read-Only fields: UniqueVoucherId, VoucherTypeId, PinCode1, PinCode2, UnitCreditContractId, NumberOfUnits, Amount, CurrencyCode, BatchId, CheckSum.
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherDefinitionsObjectData locationUpdate (VoucherDefinitionsObjectData VouULIn) throws BSDMResourceException;
  /**
   * Update Location ID field for a row in VOUCHER_DEFINITIONS..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouULIn Input  Object.  Read-Only fields: UniqueVoucherId, VoucherTypeId, PinCode1, PinCode2, UnitCreditContractId, NumberOfUnits, Amount, CurrencyCode, BatchId, CheckSum.
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherDefinitionsObjectData locationUpdate (BSDMSessionContext context, VoucherDefinitionsObjectData VouULIn) throws BSDMResourceException;


  /**
   * Update Location ID field for a row in VOUCHER_DEFINITIONS..
   * Convenience method using default BSDMSessionContext.
   * @param VouULIn Input  Object.  Read-Only fields: UniqueVoucherId, VoucherTypeId, PinCode1, PinCode2, UnitCreditContractId, NumberOfUnits, Amount, CurrencyCode, BatchId, CheckSum.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherDefinitionsObjectData locationUpdate (VoucherDefinitionsObjectData VouULIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update Location ID field for a row in VOUCHER_DEFINITIONS..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouULIn Input  Object.  Read-Only fields: UniqueVoucherId, VoucherTypeId, PinCode1, PinCode2, UnitCreditContractId, NumberOfUnits, Amount, CurrencyCode, BatchId, CheckSum.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherDefinitionsObjectData locationUpdate (BSDMSessionContext context, VoucherDefinitionsObjectData VouULIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Verify the PIN in Voucher Definition..
   * Convenience method using default BSDMSessionContext.
   * @param VouVIn Input  Object.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger pinVerify (VoucherDefinitionsObjectData VouVIn) throws BSDMResourceException;
  /**
   * Verify the PIN in Voucher Definition..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouVIn Input  Object.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger pinVerify (BSDMSessionContext context, VoucherDefinitionsObjectData VouVIn) throws BSDMResourceException;


  /**
   * Verify the PIN in Voucher Definition..
   * Convenience method using default BSDMSessionContext.
   * @param VouVIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BigInteger pinVerify (VoucherDefinitionsObjectData VouVIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Verify the PIN in Voucher Definition..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouVIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BigInteger pinVerify (BSDMSessionContext context, VoucherDefinitionsObjectData VouVIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get the PIN from Voucher Definition Matching Voucher ID..
   * Convenience method using default BSDMSessionContext.
   * @param VouVGIn Input Object Key.
   * @return VoucherDefinitionsPinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherDefinitionsPinGetOutputData pinGet (VoucherDefinitionsObjectKeyData VouVGIn) throws BSDMResourceException;
  /**
   * Get the PIN from Voucher Definition Matching Voucher ID..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouVGIn Input Object Key.
   * @return VoucherDefinitionsPinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherDefinitionsPinGetOutputData pinGet (BSDMSessionContext context, VoucherDefinitionsObjectKeyData VouVGIn) throws BSDMResourceException;


  /**
   * Get the PIN from Voucher Definition Matching Voucher ID..
   * Convenience method using default BSDMSessionContext.
   * @param VouVGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherDefinitionsPinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherDefinitionsPinGetOutputData pinGet (VoucherDefinitionsObjectKeyData VouVGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get the PIN from Voucher Definition Matching Voucher ID..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouVGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherDefinitionsPinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherDefinitionsPinGetOutputData pinGet (BSDMSessionContext context, VoucherDefinitionsObjectKeyData VouVGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get Unique Voucher Definition that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouGIn Input Object Key.
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherDefinitionsObjectData get (VoucherDefinitionsObjectKeyData VouGIn) throws BSDMResourceException;
  /**
   * Get Unique Voucher Definition that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouGIn Input Object Key.
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherDefinitionsObjectData get (BSDMSessionContext context, VoucherDefinitionsObjectKeyData VouGIn) throws BSDMResourceException;


  /**
   * Get Unique Voucher Definition that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherDefinitionsObjectData get (VoucherDefinitionsObjectKeyData VouGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get Unique Voucher Definition that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouGIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherDefinitionsObjectData get (BSDMSessionContext context, VoucherDefinitionsObjectKeyData VouGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Voucher Definition that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouFIn Input Filter Object.
   * @return VoucherDefinitionsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherDefinitionsObjectDataList find (VoucherDefinitionsObjectFilter VouFIn) throws BSDMResourceException;
  /**
   * Find Voucher Definition that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouFIn Input Filter Object.
   * @return VoucherDefinitionsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherDefinitionsObjectDataList find (BSDMSessionContext context, VoucherDefinitionsObjectFilter VouFIn) throws BSDMResourceException;


  /**
   * Find Voucher Definition that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherDefinitionsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherDefinitionsObjectDataList find (VoucherDefinitionsObjectFilter VouFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Voucher Definition that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouFIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherDefinitionsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherDefinitionsObjectDataList find (BSDMSessionContext context, VoucherDefinitionsObjectFilter VouFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update Location ID and STatus Id field for rows in VOUCHER_DEFINITIONS and VOUCHER_STATUS_INFO related to supplied Batch ID..
   * Convenience method using default BSDMSessionContext.
   * @param VDUBBatchId_In.
   * @param VDUBLocCode_In (null is allowed).
   * @param VDUBStatus_In (null is allowed).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer updateByBatchId (BigInteger VDUBBatchId_In, BigInteger VDUBLocCode_In, BigInteger VDUBStatus_In) throws BSDMResourceException;
  /**
   * Update Location ID and STatus Id field for rows in VOUCHER_DEFINITIONS and VOUCHER_STATUS_INFO related to supplied Batch ID..
   * @param context The session context to use when connecting to the APITS server.
   * @param VDUBBatchId_In.
   * @param VDUBLocCode_In (null is allowed).
   * @param VDUBStatus_In (null is allowed).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer updateByBatchId (BSDMSessionContext context, BigInteger VDUBBatchId_In, BigInteger VDUBLocCode_In, BigInteger VDUBStatus_In) throws BSDMResourceException;


  /**
   * Update Location ID and STatus Id field for rows in VOUCHER_DEFINITIONS and VOUCHER_STATUS_INFO related to supplied Batch ID..
   * Convenience method using default BSDMSessionContext.
   * @param VDUBBatchId_In.
   * @param VDUBLocCode_In (null is allowed).
   * @param VDUBStatus_In (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer updateByBatchId (BigInteger VDUBBatchId_In, BigInteger VDUBLocCode_In, BigInteger VDUBStatus_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update Location ID and STatus Id field for rows in VOUCHER_DEFINITIONS and VOUCHER_STATUS_INFO related to supplied Batch ID..
   * @param context The session context to use when connecting to the APITS server.
   * @param VDUBBatchId_In.
   * @param VDUBLocCode_In (null is allowed).
   * @param VDUBStatus_In (null is allowed).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer updateByBatchId (BSDMSessionContext context, BigInteger VDUBBatchId_In, BigInteger VDUBLocCode_In, BigInteger VDUBStatus_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Consume Voucher..
   * Convenience method using default BSDMSessionContext.
   * @param VC_In Input  Object.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectData voucherConsume (VoucherDefinitionsObjectData VC_In) throws BSDMResourceException;
  /**
   * Consume Voucher..
   * @param context The session context to use when connecting to the APITS server.
   * @param VC_In Input  Object.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public VoucherStatusInfoObjectData voucherConsume (BSDMSessionContext context, VoucherDefinitionsObjectData VC_In) throws BSDMResourceException;


  /**
   * Consume Voucher..
   * Convenience method using default BSDMSessionContext.
   * @param VC_In Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public VoucherStatusInfoObjectData voucherConsume (VoucherDefinitionsObjectData VC_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Consume Voucher..
   * @param context The session context to use when connecting to the APITS server.
   * @param VC_In Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public VoucherStatusInfoObjectData voucherConsume (BSDMSessionContext context, VoucherDefinitionsObjectData VC_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
