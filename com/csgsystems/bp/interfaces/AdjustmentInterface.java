
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
public interface AdjustmentInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData get (AdjustmentObjectKeyData getIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData get (BSDMSessionContext context, AdjustmentObjectKeyData getIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentObjectData get (AdjustmentObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentObjectData get (BSDMSessionContext context, AdjustmentObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectDataList find (AdjustmentObjectFilter findIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectDataList find (BSDMSessionContext context, AdjustmentObjectFilter findIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentObjectDataList find (AdjustmentObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentObjectDataList find (BSDMSessionContext context, AdjustmentObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param findCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (AdjustmentObjectFilter findCountIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (BSDMSessionContext context, AdjustmentObjectFilter findCountIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param findCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findCount (AdjustmentObjectFilter findCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findCount (BSDMSessionContext context, AdjustmentObjectFilter findCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param nbfindIn Input Filter Object.
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectDataList noBackoutFind (AdjustmentObjectFilter nbfindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param nbfindIn Input Filter Object.
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectDataList noBackoutFind (BSDMSessionContext context, AdjustmentObjectFilter nbfindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param nbfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentObjectDataList noBackoutFind (AdjustmentObjectFilter nbfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param nbfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentObjectDataList noBackoutFind (BSDMSessionContext context, AdjustmentObjectFilter nbfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param nbfindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer noBackoutFindCount (AdjustmentObjectFilter nbfindCountIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param nbfindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer noBackoutFindCount (BSDMSessionContext context, AdjustmentObjectFilter nbfindCountIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param nbfindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer noBackoutFindCount (AdjustmentObjectFilter nbfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param nbfindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer noBackoutFindCount (BSDMSessionContext context, AdjustmentObjectFilter nbfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjCreateIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData create (AdjustmentObjectData adjCreateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjCreateIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData create (BSDMSessionContext context, AdjustmentObjectData adjCreateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjCreateIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentObjectData create (AdjustmentObjectData adjCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjCreateIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentObjectData create (BSDMSessionContext context, AdjustmentObjectData adjCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjUpdateIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData update (AdjustmentObjectData adjUpdateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjUpdateIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData update (BSDMSessionContext context, AdjustmentObjectData adjUpdateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjUpdateIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentObjectData update (AdjustmentObjectData adjUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjUpdateIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentObjectData update (BSDMSessionContext context, AdjustmentObjectData adjUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjModifyIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData modify (AdjustmentObjectData adjModifyIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjModifyIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData modify (BSDMSessionContext context, AdjustmentObjectData adjModifyIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjModifyIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentObjectData modify (AdjustmentObjectData adjModifyIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjModifyIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentObjectData modify (BSDMSessionContext context, AdjustmentObjectData adjModifyIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjCancelIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData cancel (AdjustmentObjectData adjCancelIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjCancelIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData cancel (BSDMSessionContext context, AdjustmentObjectData adjCancelIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjCancelIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentObjectData cancel (AdjustmentObjectData adjCancelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjCancelIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentObjectData cancel (BSDMSessionContext context, AdjustmentObjectData adjCancelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjApproveIn Input  Object.  Read-Only fields: ServerId.
   * @param SupervisorName.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData approve (AdjustmentObjectData adjApproveIn, String SupervisorName) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjApproveIn Input  Object.  Read-Only fields: ServerId.
   * @param SupervisorName.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData approve (BSDMSessionContext context, AdjustmentObjectData adjApproveIn, String SupervisorName) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjApproveIn Input  Object.  Read-Only fields: ServerId.
   * @param SupervisorName.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentObjectData approve (AdjustmentObjectData adjApproveIn, String SupervisorName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjApproveIn Input  Object.  Read-Only fields: ServerId.
   * @param SupervisorName.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentObjectData approve (BSDMSessionContext context, AdjustmentObjectData adjApproveIn, String SupervisorName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjDenyIn Input  Object.  Read-Only fields: ServerId.
   * @param supervisor_name.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData deny (AdjustmentObjectData adjDenyIn, String supervisor_name) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjDenyIn Input  Object.  Read-Only fields: ServerId.
   * @param supervisor_name.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentObjectData deny (BSDMSessionContext context, AdjustmentObjectData adjDenyIn, String supervisor_name) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjDenyIn Input  Object.  Read-Only fields: ServerId.
   * @param supervisor_name.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentObjectData deny (AdjustmentObjectData adjDenyIn, String supervisor_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjDenyIn Input  Object.  Read-Only fields: ServerId.
   * @param supervisor_name.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentObjectData deny (BSDMSessionContext context, AdjustmentObjectData adjDenyIn, String supervisor_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger invoiceAdjustmentTotalGet (Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BigInteger invoiceAdjustmentTotalGet (BSDMSessionContext context, Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BigInteger invoiceAdjustmentTotalGet (Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BigInteger invoiceAdjustmentTotalGet (BSDMSessionContext context, Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
