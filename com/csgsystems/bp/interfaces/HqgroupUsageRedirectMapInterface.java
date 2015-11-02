
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
public interface HqgroupUsageRedirectMapInterface extends BaliInterface {

  /**
   * Insert a new HqGroupUsageRedirectMap.
   * Convenience method using default BSDMSessionContext.
   * @param HGURMInsertIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: ActiveDt.  Derived Fields: TrackingId, TrackingIdServ.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupUsageRedirectMapObjectData create (HqGroupUsageRedirectMapObjectData HGURMInsertIn) throws BSDMResourceException;
  /**
   * Insert a new HqGroupUsageRedirectMap.
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMInsertIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: ActiveDt.  Derived Fields: TrackingId, TrackingIdServ.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupUsageRedirectMapObjectData create (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMInsertIn) throws BSDMResourceException;


  /**
   * Insert a new HqGroupUsageRedirectMap.
   * Convenience method using default BSDMSessionContext.
   * @param HGURMInsertIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: ActiveDt.  Derived Fields: TrackingId, TrackingIdServ.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupUsageRedirectMapObjectData create (HqGroupUsageRedirectMapObjectData HGURMInsertIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Insert a new HqGroupUsageRedirectMap.
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMInsertIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: ActiveDt.  Derived Fields: TrackingId, TrackingIdServ.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupUsageRedirectMapObjectData create (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMInsertIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get a unique HqGroupUsageRedirectMap row..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMGetIn Input Object Key.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupUsageRedirectMapObjectData get (HqGroupUsageRedirectMapObjectKeyData HGURMGetIn) throws BSDMResourceException;
  /**
   * Get a unique HqGroupUsageRedirectMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMGetIn Input Object Key.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupUsageRedirectMapObjectData get (BSDMSessionContext context, HqGroupUsageRedirectMapObjectKeyData HGURMGetIn) throws BSDMResourceException;


  /**
   * Get a unique HqGroupUsageRedirectMap row..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupUsageRedirectMapObjectData get (HqGroupUsageRedirectMapObjectKeyData HGURMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique HqGroupUsageRedirectMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupUsageRedirectMapObjectData get (BSDMSessionContext context, HqGroupUsageRedirectMapObjectKeyData HGURMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find HqGroupUsageRedirectMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMFindIn Input Filter Object.
   * @return HqGroupUsageRedirectMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupUsageRedirectMapObjectDataList find (HqGroupUsageRedirectMapObjectFilter HGURMFindIn) throws BSDMResourceException;
  /**
   * Find HqGroupUsageRedirectMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMFindIn Input Filter Object.
   * @return HqGroupUsageRedirectMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupUsageRedirectMapObjectDataList find (BSDMSessionContext context, HqGroupUsageRedirectMapObjectFilter HGURMFindIn) throws BSDMResourceException;


  /**
   * Find HqGroupUsageRedirectMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupUsageRedirectMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupUsageRedirectMapObjectDataList find (HqGroupUsageRedirectMapObjectFilter HGURMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find HqGroupUsageRedirectMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupUsageRedirectMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupUsageRedirectMapObjectDataList find (BSDMSessionContext context, HqGroupUsageRedirectMapObjectFilter HGURMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease an HqGroupUsageRedirectMap row..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMDeleteIn Input Object Key.
   * @param HGURMDCeaseDate (has a default).
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupUsageRedirectMapObjectData delete (HqGroupUsageRedirectMapObjectKeyData HGURMDeleteIn, Date HGURMDCeaseDate) throws BSDMResourceException;
  /**
   * Cease an HqGroupUsageRedirectMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMDeleteIn Input Object Key.
   * @param HGURMDCeaseDate (has a default).
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupUsageRedirectMapObjectData delete (BSDMSessionContext context, HqGroupUsageRedirectMapObjectKeyData HGURMDeleteIn, Date HGURMDCeaseDate) throws BSDMResourceException;


  /**
   * Cease an HqGroupUsageRedirectMap row..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMDeleteIn Input Object Key.
   * @param HGURMDCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupUsageRedirectMapObjectData delete (HqGroupUsageRedirectMapObjectKeyData HGURMDeleteIn, Date HGURMDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease an HqGroupUsageRedirectMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMDeleteIn Input Object Key.
   * @param HGURMDCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupUsageRedirectMapObjectData delete (BSDMSessionContext context, HqGroupUsageRedirectMapObjectKeyData HGURMDeleteIn, Date HGURMDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease HqGroupUsageRedirectMap's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HqGroupUsageRedirectMapFilter Input Filter Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @param HGURMDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (HqGroupUsageRedirectMapObjectFilter HqGroupUsageRedirectMapFilter, Date HGURMDLCeaseDate) throws BSDMResourceException;
  /**
   * Cease HqGroupUsageRedirectMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HqGroupUsageRedirectMapFilter Input Filter Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @param HGURMDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, HqGroupUsageRedirectMapObjectFilter HqGroupUsageRedirectMapFilter, Date HGURMDLCeaseDate) throws BSDMResourceException;


  /**
   * Cease HqGroupUsageRedirectMap's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HqGroupUsageRedirectMapFilter Input Filter Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @param HGURMDLCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (HqGroupUsageRedirectMapObjectFilter HqGroupUsageRedirectMapFilter, Date HGURMDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease HqGroupUsageRedirectMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HqGroupUsageRedirectMapFilter Input Filter Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @param HGURMDLCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, HqGroupUsageRedirectMapObjectFilter HqGroupUsageRedirectMapFilter, Date HGURMDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of an HqGroupUsageRedirectMap object..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMUpdateIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupUsageRedirectMapObjectData update (HqGroupUsageRedirectMapObjectData HGURMUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of an HqGroupUsageRedirectMap object..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMUpdateIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupUsageRedirectMapObjectData update (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of an HqGroupUsageRedirectMap object..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMUpdateIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupUsageRedirectMapObjectData update (HqGroupUsageRedirectMapObjectData HGURMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of an HqGroupUsageRedirectMap object..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMUpdateIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupUsageRedirectMapObjectData update (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cancel HqGroupUsageRedirectMap given group_id/serv..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: InactiveDt.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void cancel (HqGroupUsageRedirectMapObjectData HGURMCancelIn) throws BSDMResourceException;
  /**
   * Cancel HqGroupUsageRedirectMap given group_id/serv..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: InactiveDt.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void cancel (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMCancelIn) throws BSDMResourceException;


  /**
   * Cancel HqGroupUsageRedirectMap given group_id/serv..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: InactiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void cancel (HqGroupUsageRedirectMapObjectData HGURMCancelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cancel HqGroupUsageRedirectMap given group_id/serv..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: InactiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void cancel (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMCancelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the priority of an HqGroupUsageRedirectMap..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMPrioUpdIn Input  Object.  Read-Only fields: GroupId, GroupIdServ, UsageRedirectGroup, BalanceAccountInternalId, ActiveDt, InactiveDt, ExternalId, ExternalIdType.  Derived Fields: ActiveDt.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupUsageRedirectMapObjectData priorityUpdate (HqGroupUsageRedirectMapObjectData HGURMPrioUpdIn) throws BSDMResourceException;
  /**
   * Update the priority of an HqGroupUsageRedirectMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMPrioUpdIn Input  Object.  Read-Only fields: GroupId, GroupIdServ, UsageRedirectGroup, BalanceAccountInternalId, ActiveDt, InactiveDt, ExternalId, ExternalIdType.  Derived Fields: ActiveDt.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupUsageRedirectMapObjectData priorityUpdate (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMPrioUpdIn) throws BSDMResourceException;


  /**
   * Update the priority of an HqGroupUsageRedirectMap..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMPrioUpdIn Input  Object.  Read-Only fields: GroupId, GroupIdServ, UsageRedirectGroup, BalanceAccountInternalId, ActiveDt, InactiveDt, ExternalId, ExternalIdType.  Derived Fields: ActiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupUsageRedirectMapObjectData priorityUpdate (HqGroupUsageRedirectMapObjectData HGURMPrioUpdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the priority of an HqGroupUsageRedirectMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMPrioUpdIn Input  Object.  Read-Only fields: GroupId, GroupIdServ, UsageRedirectGroup, BalanceAccountInternalId, ActiveDt, InactiveDt, ExternalId, ExternalIdType.  Derived Fields: ActiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupUsageRedirectMapObjectData priorityUpdate (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMPrioUpdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param discIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void disconnectList (HqGroupUsageRedirectMapObjectData discIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param discIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void disconnectList (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData discIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param discIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void disconnectList (HqGroupUsageRedirectMapObjectData discIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param discIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void disconnectList (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData discIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
