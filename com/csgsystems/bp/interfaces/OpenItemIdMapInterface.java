
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
public interface OpenItemIdMapInterface extends BaliInterface {

  /**
   * Create a new OpenItemIdMap..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Defaulted Fields: ServiceInternalId, ServiceInternalIdResets, ChargeElementType, ChargeElementValue, ActiveDt, Ineligible.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectData create (OpenItemIdMapObjectData OIIMCreateIn) throws BSDMResourceException;
  /**
   * Create a new OpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Defaulted Fields: ServiceInternalId, ServiceInternalIdResets, ChargeElementType, ChargeElementValue, ActiveDt, Ineligible.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectData create (BSDMSessionContext context, OpenItemIdMapObjectData OIIMCreateIn) throws BSDMResourceException;


  /**
   * Create a new OpenItemIdMap..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Defaulted Fields: ServiceInternalId, ServiceInternalIdResets, ChargeElementType, ChargeElementValue, ActiveDt, Ineligible.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OpenItemIdMapObjectData create (OpenItemIdMapObjectData OIIMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new OpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Defaulted Fields: ServiceInternalId, ServiceInternalIdResets, ChargeElementType, ChargeElementValue, ActiveDt, Ineligible.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OpenItemIdMapObjectData create (BSDMSessionContext context, OpenItemIdMapObjectData OIIMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get a unique OpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMGetIn Input Object Key.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectData get (OpenItemIdMapObjectKeyData OIIMGetIn) throws BSDMResourceException;
  /**
   * Get a unique OpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMGetIn Input Object Key.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectData get (BSDMSessionContext context, OpenItemIdMapObjectKeyData OIIMGetIn) throws BSDMResourceException;


  /**
   * Get a unique OpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OpenItemIdMapObjectData get (OpenItemIdMapObjectKeyData OIIMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique OpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OpenItemIdMapObjectData get (BSDMSessionContext context, OpenItemIdMapObjectKeyData OIIMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find OpenItemIdMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMFindIn Input Filter Object.
   * @return OpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectDataList find (OpenItemIdMapObjectFilter OIIMFindIn) throws BSDMResourceException;
  /**
   * Find OpenItemIdMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMFindIn Input Filter Object.
   * @return OpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectDataList find (BSDMSessionContext context, OpenItemIdMapObjectFilter OIIMFindIn) throws BSDMResourceException;


  /**
   * Find OpenItemIdMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OpenItemIdMapObjectDataList find (OpenItemIdMapObjectFilter OIIMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find OpenItemIdMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OpenItemIdMapObjectDataList find (BSDMSessionContext context, OpenItemIdMapObjectFilter OIIMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease an OpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMDeleteIn Input Object Key.
   * @param OIIMDCeaseDate (has a default).
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectData delete (OpenItemIdMapObjectKeyData OIIMDeleteIn, Date OIIMDCeaseDate) throws BSDMResourceException;
  /**
   * Cease an OpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMDeleteIn Input Object Key.
   * @param OIIMDCeaseDate (has a default).
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectData delete (BSDMSessionContext context, OpenItemIdMapObjectKeyData OIIMDeleteIn, Date OIIMDCeaseDate) throws BSDMResourceException;


  /**
   * Cease an OpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMDeleteIn Input Object Key.
   * @param OIIMDCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OpenItemIdMapObjectData delete (OpenItemIdMapObjectKeyData OIIMDeleteIn, Date OIIMDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease an OpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMDeleteIn Input Object Key.
   * @param OIIMDCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OpenItemIdMapObjectData delete (BSDMSessionContext context, OpenItemIdMapObjectKeyData OIIMDeleteIn, Date OIIMDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease OpenItemIdMap's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param OpenItemIdMapFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param OIIMDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (OpenItemIdMapObjectFilter OpenItemIdMapFilter, Date OIIMDLCeaseDate) throws BSDMResourceException;
  /**
   * Cease OpenItemIdMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OpenItemIdMapFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param OIIMDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, OpenItemIdMapObjectFilter OpenItemIdMapFilter, Date OIIMDLCeaseDate) throws BSDMResourceException;


  /**
   * Cease OpenItemIdMap's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param OpenItemIdMapFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param OIIMDLCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (OpenItemIdMapObjectFilter OpenItemIdMapFilter, Date OIIMDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease OpenItemIdMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OpenItemIdMapFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param OIIMDLCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, OpenItemIdMapObjectFilter OpenItemIdMapFilter, Date OIIMDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of an OpenItemIdMap object..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectData update (OpenItemIdMapObjectData OIIMUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of an OpenItemIdMap object..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectData update (BSDMSessionContext context, OpenItemIdMapObjectData OIIMUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of an OpenItemIdMap object..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OpenItemIdMapObjectData update (OpenItemIdMapObjectData OIIMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of an OpenItemIdMap object..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OpenItemIdMapObjectData update (BSDMSessionContext context, OpenItemIdMapObjectData OIIMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cancel OpenItemIdMap given ServiceInternalId/Resets..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ.  Defaulted Fields: InactiveDt.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void cancel (OpenItemIdMapObjectData OIIMCancelIn) throws BSDMResourceException;
  /**
   * Cancel OpenItemIdMap given ServiceInternalId/Resets..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ.  Defaulted Fields: InactiveDt.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void cancel (BSDMSessionContext context, OpenItemIdMapObjectData OIIMCancelIn) throws BSDMResourceException;


  /**
   * Cancel OpenItemIdMap given ServiceInternalId/Resets..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ.  Defaulted Fields: InactiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void cancel (OpenItemIdMapObjectData OIIMCancelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cancel OpenItemIdMap given ServiceInternalId/Resets..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ.  Defaulted Fields: InactiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void cancel (BSDMSessionContext context, OpenItemIdMapObjectData OIIMCancelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the priority of an OpenItemIdMap..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMPrioUpdIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, BalanceAccountInternalId, ChargeElementType, ChargeElementValue, OpenItemId, RatePeriod, ActiveDt, InactiveDt, ChgDt, ChgWho, Ineligible, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: ActiveDt, ChgDt, ChgWho.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectData priorityUpdate (OpenItemIdMapObjectData OIIMPrioUpdIn) throws BSDMResourceException;
  /**
   * Update the priority of an OpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMPrioUpdIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, BalanceAccountInternalId, ChargeElementType, ChargeElementValue, OpenItemId, RatePeriod, ActiveDt, InactiveDt, ChgDt, ChgWho, Ineligible, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: ActiveDt, ChgDt, ChgWho.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectData priorityUpdate (BSDMSessionContext context, OpenItemIdMapObjectData OIIMPrioUpdIn) throws BSDMResourceException;


  /**
   * Update the priority of an OpenItemIdMap..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMPrioUpdIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, BalanceAccountInternalId, ChargeElementType, ChargeElementValue, OpenItemId, RatePeriod, ActiveDt, InactiveDt, ChgDt, ChgWho, Ineligible, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: ActiveDt, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OpenItemIdMapObjectData priorityUpdate (OpenItemIdMapObjectData OIIMPrioUpdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the priority of an OpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMPrioUpdIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, BalanceAccountInternalId, ChargeElementType, ChargeElementValue, OpenItemId, RatePeriod, ActiveDt, InactiveDt, ChgDt, ChgWho, Ineligible, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: ActiveDt, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OpenItemIdMapObjectData priorityUpdate (BSDMSessionContext context, OpenItemIdMapObjectData OIIMPrioUpdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find the OpenItemId that best matches the Account/Service/Charge information passed in..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMBestIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, OrderLevel, RatePeriod, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Defaulted Fields: ActiveDt.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectData bestMatch (OpenItemIdMapObjectData OIIMBestIn) throws BSDMResourceException;
  /**
   * Find the OpenItemId that best matches the Account/Service/Charge information passed in..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMBestIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, OrderLevel, RatePeriod, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Defaulted Fields: ActiveDt.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemIdMapObjectData bestMatch (BSDMSessionContext context, OpenItemIdMapObjectData OIIMBestIn) throws BSDMResourceException;


  /**
   * Find the OpenItemId that best matches the Account/Service/Charge information passed in..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMBestIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, OrderLevel, RatePeriod, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Defaulted Fields: ActiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OpenItemIdMapObjectData bestMatch (OpenItemIdMapObjectData OIIMBestIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find the OpenItemId that best matches the Account/Service/Charge information passed in..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMBestIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, OrderLevel, RatePeriod, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Defaulted Fields: ActiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OpenItemIdMapObjectData bestMatch (BSDMSessionContext context, OpenItemIdMapObjectData OIIMBestIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Derive the OrderLevel for an OpenItemIdMap..
   * Convenience method using default BSDMSessionContext.
   * @param OrderLevelDeriveIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalIdResets, TrackingId, TrackingIdServ, OrderLevel, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: OrderLevel.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer orderLevelDerive (OpenItemIdMapObjectData OrderLevelDeriveIn) throws BSDMResourceException;
  /**
   * Derive the OrderLevel for an OpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param OrderLevelDeriveIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalIdResets, TrackingId, TrackingIdServ, OrderLevel, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: OrderLevel.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer orderLevelDerive (BSDMSessionContext context, OpenItemIdMapObjectData OrderLevelDeriveIn) throws BSDMResourceException;


  /**
   * Derive the OrderLevel for an OpenItemIdMap..
   * Convenience method using default BSDMSessionContext.
   * @param OrderLevelDeriveIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalIdResets, TrackingId, TrackingIdServ, OrderLevel, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: OrderLevel.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer orderLevelDerive (OpenItemIdMapObjectData OrderLevelDeriveIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Derive the OrderLevel for an OpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param OrderLevelDeriveIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalIdResets, TrackingId, TrackingIdServ, OrderLevel, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: OrderLevel.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer orderLevelDerive (BSDMSessionContext context, OpenItemIdMapObjectData OrderLevelDeriveIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
