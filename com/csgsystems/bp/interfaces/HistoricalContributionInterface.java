
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
public interface HistoricalContributionInterface extends BaliInterface {

  /**
   * Get an HistoricalContribution row..
   * Convenience method using default BSDMSessionContext.
   * @param HCgetIn Input Object Key.
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionObjectData get (HistoricalContributionObjectKeyData HCgetIn) throws BSDMResourceException;
  /**
   * Get an HistoricalContribution row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCgetIn Input Object Key.
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionObjectData get (BSDMSessionContext context, HistoricalContributionObjectKeyData HCgetIn) throws BSDMResourceException;


  /**
   * Get an HistoricalContribution row..
   * Convenience method using default BSDMSessionContext.
   * @param HCgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HistoricalContributionObjectData get (HistoricalContributionObjectKeyData HCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get an HistoricalContribution row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HistoricalContributionObjectData get (BSDMSessionContext context, HistoricalContributionObjectKeyData HCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find HistoricalContribution's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HCfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @return HistoricalContributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionObjectDataList find (HistoricalContributionObjectFilter HCfindIn) throws BSDMResourceException;
  /**
   * Find HistoricalContribution's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @return HistoricalContributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionObjectDataList find (BSDMSessionContext context, HistoricalContributionObjectFilter HCfindIn) throws BSDMResourceException;


  /**
   * Find HistoricalContribution's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HCfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HistoricalContributionObjectDataList find (HistoricalContributionObjectFilter HCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find HistoricalContribution's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HistoricalContributionObjectDataList find (BSDMSessionContext context, HistoricalContributionObjectFilter HCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new HistoricalContribution..
   * Convenience method using default BSDMSessionContext.
   * @param HCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt, AccumulationTrackingId, AccumulationTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: AccumulationTrackingId, AccumulationTrackingIdServ, AccountExternalIdType, ChgDt, ChgWho.
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionObjectData create (HistoricalContributionObjectData HCcreateIn) throws BSDMResourceException;
  /**
   * Create a new HistoricalContribution..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt, AccumulationTrackingId, AccumulationTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: AccumulationTrackingId, AccumulationTrackingIdServ, AccountExternalIdType, ChgDt, ChgWho.
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionObjectData create (BSDMSessionContext context, HistoricalContributionObjectData HCcreateIn) throws BSDMResourceException;


  /**
   * Create a new HistoricalContribution..
   * Convenience method using default BSDMSessionContext.
   * @param HCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt, AccumulationTrackingId, AccumulationTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: AccumulationTrackingId, AccumulationTrackingIdServ, AccountExternalIdType, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HistoricalContributionObjectData create (HistoricalContributionObjectData HCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new HistoricalContribution..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt, AccumulationTrackingId, AccumulationTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: AccumulationTrackingId, AccumulationTrackingIdServ, AccountExternalIdType, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HistoricalContributionObjectData create (BSDMSessionContext context, HistoricalContributionObjectData HCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of an HistoricalContribution row..
   * Convenience method using default BSDMSessionContext.
   * @param HCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionObjectData update (HistoricalContributionObjectData HCupdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of an HistoricalContribution row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionObjectData update (BSDMSessionContext context, HistoricalContributionObjectData HCupdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of an HistoricalContribution row..
   * Convenience method using default BSDMSessionContext.
   * @param HCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HistoricalContributionObjectData update (HistoricalContributionObjectData HCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of an HistoricalContribution row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HistoricalContributionObjectData update (BSDMSessionContext context, HistoricalContributionObjectData HCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
