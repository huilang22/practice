
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
public interface GlobalContractInterface extends BaliInterface {

  /**
   * Create a new GlobalContract..
   * Convenience method using default BSDMSessionContext.
   * @param GlobalContractCreateIn Input  Object.  Read-Only fields: ViewEffectiveDt, StartByDt.  Defaulted Fields: CreateDt, ArchFlag, CommitmentAmount, TotalSavingsAmount, TotalElementAmount, ViewStatus, ViewCreatedDt, IntendedViewEffectiveDt, StartDt, GracePeriod, TrackTotalAmounts, DistributePayback, ProrateContractStrtOverride, ProrateContractEndOverride, ProrateInterimBillOverride, ProratePeriodChangeOverride, ProrateAccountStartOverride, ProrateAccountEndOverride, ProrateTgtThresholdOverride, ProrateTgtRebatesOverride, DurationOverride, NoticeOverride, IsPartOfComponent.  Derived Fields: ViewId, ViewEffectiveDt.
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalContractObjectData create (GlobalContractObjectData GlobalContractCreateIn) throws BSDMResourceException;
  /**
   * Create a new GlobalContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractCreateIn Input  Object.  Read-Only fields: ViewEffectiveDt, StartByDt.  Defaulted Fields: CreateDt, ArchFlag, CommitmentAmount, TotalSavingsAmount, TotalElementAmount, ViewStatus, ViewCreatedDt, IntendedViewEffectiveDt, StartDt, GracePeriod, TrackTotalAmounts, DistributePayback, ProrateContractStrtOverride, ProrateContractEndOverride, ProrateInterimBillOverride, ProratePeriodChangeOverride, ProrateAccountStartOverride, ProrateAccountEndOverride, ProrateTgtThresholdOverride, ProrateTgtRebatesOverride, DurationOverride, NoticeOverride, IsPartOfComponent.  Derived Fields: ViewId, ViewEffectiveDt.
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalContractObjectData create (BSDMSessionContext context, GlobalContractObjectData GlobalContractCreateIn) throws BSDMResourceException;


  /**
   * Create a new GlobalContract..
   * Convenience method using default BSDMSessionContext.
   * @param GlobalContractCreateIn Input  Object.  Read-Only fields: ViewEffectiveDt, StartByDt.  Defaulted Fields: CreateDt, ArchFlag, CommitmentAmount, TotalSavingsAmount, TotalElementAmount, ViewStatus, ViewCreatedDt, IntendedViewEffectiveDt, StartDt, GracePeriod, TrackTotalAmounts, DistributePayback, ProrateContractStrtOverride, ProrateContractEndOverride, ProrateInterimBillOverride, ProratePeriodChangeOverride, ProrateAccountStartOverride, ProrateAccountEndOverride, ProrateTgtThresholdOverride, ProrateTgtRebatesOverride, DurationOverride, NoticeOverride, IsPartOfComponent.  Derived Fields: ViewId, ViewEffectiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalContractObjectData create (GlobalContractObjectData GlobalContractCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new GlobalContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractCreateIn Input  Object.  Read-Only fields: ViewEffectiveDt, StartByDt.  Defaulted Fields: CreateDt, ArchFlag, CommitmentAmount, TotalSavingsAmount, TotalElementAmount, ViewStatus, ViewCreatedDt, IntendedViewEffectiveDt, StartDt, GracePeriod, TrackTotalAmounts, DistributePayback, ProrateContractStrtOverride, ProrateContractEndOverride, ProrateInterimBillOverride, ProratePeriodChangeOverride, ProrateAccountStartOverride, ProrateAccountEndOverride, ProrateTgtThresholdOverride, ProrateTgtRebatesOverride, DurationOverride, NoticeOverride, IsPartOfComponent.  Derived Fields: ViewId, ViewEffectiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalContractObjectData create (BSDMSessionContext context, GlobalContractObjectData GlobalContractCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get a unique GlobalContract row..
   * Convenience method using default BSDMSessionContext.
   * @param GlobalContractGetIn Input Object Key.
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalContractObjectData get (GlobalContractObjectKeyData GlobalContractGetIn) throws BSDMResourceException;
  /**
   * Get a unique GlobalContract row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractGetIn Input Object Key.
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalContractObjectData get (BSDMSessionContext context, GlobalContractObjectKeyData GlobalContractGetIn) throws BSDMResourceException;


  /**
   * Get a unique GlobalContract row..
   * Convenience method using default BSDMSessionContext.
   * @param GlobalContractGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalContractObjectData get (GlobalContractObjectKeyData GlobalContractGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique GlobalContract row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalContractObjectData get (BSDMSessionContext context, GlobalContractObjectKeyData GlobalContractGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find GlobalContracts that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GlobalContractFindIn Input Filter Object.
   * @return GlobalContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalContractObjectDataList find (GlobalContractObjectFilter GlobalContractFindIn) throws BSDMResourceException;
  /**
   * Find GlobalContracts that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractFindIn Input Filter Object.
   * @return GlobalContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalContractObjectDataList find (BSDMSessionContext context, GlobalContractObjectFilter GlobalContractFindIn) throws BSDMResourceException;


  /**
   * Find GlobalContracts that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GlobalContractFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalContractObjectDataList find (GlobalContractObjectFilter GlobalContractFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find GlobalContracts that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalContractObjectDataList find (BSDMSessionContext context, GlobalContractObjectFilter GlobalContractFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of a GlobalContract..
   * Convenience method using default BSDMSessionContext.
   * @param GlobalContractUpdateIn Input  Object.  Read-Only fields: ContractId, ParentGroupNo, ContractType, IsPartOfComponent, TotalPeriods, ViewEffectiveDt, StartByDt.
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalContractObjectData update (GlobalContractObjectData GlobalContractUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of a GlobalContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractUpdateIn Input  Object.  Read-Only fields: ContractId, ParentGroupNo, ContractType, IsPartOfComponent, TotalPeriods, ViewEffectiveDt, StartByDt.
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GlobalContractObjectData update (BSDMSessionContext context, GlobalContractObjectData GlobalContractUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of a GlobalContract..
   * Convenience method using default BSDMSessionContext.
   * @param GlobalContractUpdateIn Input  Object.  Read-Only fields: ContractId, ParentGroupNo, ContractType, IsPartOfComponent, TotalPeriods, ViewEffectiveDt, StartByDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GlobalContractObjectData update (GlobalContractObjectData GlobalContractUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of a GlobalContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractUpdateIn Input  Object.  Read-Only fields: ContractId, ParentGroupNo, ContractType, IsPartOfComponent, TotalPeriods, ViewEffectiveDt, StartByDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GlobalContractObjectData update (BSDMSessionContext context, GlobalContractObjectData GlobalContractUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
