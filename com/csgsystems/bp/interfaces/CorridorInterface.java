
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
public interface CorridorInterface extends BaliInterface {

  /**
   * Get a Corridor..
   * Convenience method using default BSDMSessionContext.
   * @param CCGetIn Input Object Key.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectData get (CorridorObjectKeyData CCGetIn) throws BSDMResourceException;
  /**
   * Get a Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param CCGetIn Input Object Key.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectData get (BSDMSessionContext context, CorridorObjectKeyData CCGetIn) throws BSDMResourceException;


  /**
   * Get a Corridor..
   * Convenience method using default BSDMSessionContext.
   * @param CCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CorridorObjectData get (CorridorObjectKeyData CCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param CCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CorridorObjectData get (BSDMSessionContext context, CorridorObjectKeyData CCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Corridors..
   * Convenience method using default BSDMSessionContext.
   * @param CCFindIn Input Filter Object.  Defaulted Fields: OwningAccountExternalIdType.
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectDataList find (CorridorObjectFilter CCFindIn) throws BSDMResourceException;
  /**
   * Find Corridors..
   * @param context The session context to use when connecting to the APITS server.
   * @param CCFindIn Input Filter Object.  Defaulted Fields: OwningAccountExternalIdType.
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectDataList find (BSDMSessionContext context, CorridorObjectFilter CCFindIn) throws BSDMResourceException;


  /**
   * Find Corridors..
   * Convenience method using default BSDMSessionContext.
   * @param CCFindIn Input Filter Object.  Defaulted Fields: OwningAccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CorridorObjectDataList find (CorridorObjectFilter CCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Corridors..
   * @param context The session context to use when connecting to the APITS server.
   * @param CCFindIn Input Filter Object.  Defaulted Fields: OwningAccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CorridorObjectDataList find (BSDMSessionContext context, CorridorObjectFilter CCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease a Corridor row..
   * Convenience method using default BSDMSessionContext.
   * @param CCDeleteIn Input Object Key.
   * @param CDCeaseDate (has a default).
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectData delete (CorridorObjectKeyData CCDeleteIn, Date CDCeaseDate) throws BSDMResourceException;
  /**
   * Cease a Corridor row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CCDeleteIn Input Object Key.
   * @param CDCeaseDate (has a default).
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectData delete (BSDMSessionContext context, CorridorObjectKeyData CCDeleteIn, Date CDCeaseDate) throws BSDMResourceException;


  /**
   * Cease a Corridor row..
   * Convenience method using default BSDMSessionContext.
   * @param CCDeleteIn Input Object Key.
   * @param CDCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CorridorObjectData delete (CorridorObjectKeyData CCDeleteIn, Date CDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease a Corridor row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CCDeleteIn Input Object Key.
   * @param CDCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CorridorObjectData delete (BSDMSessionContext context, CorridorObjectKeyData CCDeleteIn, Date CDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param CorridorDeleteListIn Input Filter Object.
   * @param InactiveDate (has a default).
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectDataList deleteList (CorridorObjectFilter CorridorDeleteListIn, Date InactiveDate) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CorridorDeleteListIn Input Filter Object.
   * @param InactiveDate (has a default).
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectDataList deleteList (BSDMSessionContext context, CorridorObjectFilter CorridorDeleteListIn, Date InactiveDate) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param CorridorDeleteListIn Input Filter Object.
   * @param InactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CorridorObjectDataList deleteList (CorridorObjectFilter CorridorDeleteListIn, Date InactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CorridorDeleteListIn Input Filter Object.
   * @param InactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CorridorObjectDataList deleteList (BSDMSessionContext context, CorridorObjectFilter CorridorDeleteListIn, Date InactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new Corridor..
   * Convenience method using default BSDMSessionContext.
   * @param CorrCreateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode, ActiveDt.  Derived Fields: TrackingId, TrackingIdServ, CreateDt, ChgDt, ChgWho.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectData create (CorridorObjectData CorrCreateIn) throws BSDMResourceException;
  /**
   * Create a new Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param CorrCreateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode, ActiveDt.  Derived Fields: TrackingId, TrackingIdServ, CreateDt, ChgDt, ChgWho.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectData create (BSDMSessionContext context, CorridorObjectData CorrCreateIn) throws BSDMResourceException;


  /**
   * Create a new Corridor..
   * Convenience method using default BSDMSessionContext.
   * @param CorrCreateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode, ActiveDt.  Derived Fields: TrackingId, TrackingIdServ, CreateDt, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CorridorObjectData create (CorridorObjectData CorrCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param CorrCreateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode, ActiveDt.  Derived Fields: TrackingId, TrackingIdServ, CreateDt, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CorridorObjectData create (BSDMSessionContext context, CorridorObjectData CorrCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a Corridor..
   * Convenience method using default BSDMSessionContext.
   * @param CorrUpdateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode.  Derived Fields: ChgDt, ChgWho.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectData update (CorridorObjectData CorrUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param CorrUpdateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode.  Derived Fields: ChgDt, ChgWho.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectData update (BSDMSessionContext context, CorridorObjectData CorrUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a Corridor..
   * Convenience method using default BSDMSessionContext.
   * @param CorrUpdateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CorridorObjectData update (CorridorObjectData CorrUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param CorrUpdateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CorridorObjectData update (BSDMSessionContext context, CorridorObjectData CorrUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convert a Corridor to an ICB..
   * Convenience method using default BSDMSessionContext.
   * @param CorrConvertIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt, ActiveDt, InactiveDt, PointOrigin, OriginIsXact, CountryCodeOrigin, PointTarget, TargetIsXact, CountryCodeTarget, CorridorPlanId, AccessRegionOrigin, AccessRegionTarget, PointCategory, ServiceInternalId, ServiceInternalIdResets, OwningAccountInternalId, OwningAccountExternalId, OwningAccountExternalIdType, LanguageCode, ShortDisplay, DisplayValue, IsIcbCorridor, OriginRestriction, TargetRestriction, PlanType, PlanLevel, DiscountId, MaxCorridors, IsDefault, IsInternal.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectData convert (CorridorObjectData CorrConvertIn) throws BSDMResourceException;
  /**
   * Convert a Corridor to an ICB..
   * @param context The session context to use when connecting to the APITS server.
   * @param CorrConvertIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt, ActiveDt, InactiveDt, PointOrigin, OriginIsXact, CountryCodeOrigin, PointTarget, TargetIsXact, CountryCodeTarget, CorridorPlanId, AccessRegionOrigin, AccessRegionTarget, PointCategory, ServiceInternalId, ServiceInternalIdResets, OwningAccountInternalId, OwningAccountExternalId, OwningAccountExternalIdType, LanguageCode, ShortDisplay, DisplayValue, IsIcbCorridor, OriginRestriction, TargetRestriction, PlanType, PlanLevel, DiscountId, MaxCorridors, IsDefault, IsInternal.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CorridorObjectData convert (BSDMSessionContext context, CorridorObjectData CorrConvertIn) throws BSDMResourceException;


  /**
   * Convert a Corridor to an ICB..
   * Convenience method using default BSDMSessionContext.
   * @param CorrConvertIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt, ActiveDt, InactiveDt, PointOrigin, OriginIsXact, CountryCodeOrigin, PointTarget, TargetIsXact, CountryCodeTarget, CorridorPlanId, AccessRegionOrigin, AccessRegionTarget, PointCategory, ServiceInternalId, ServiceInternalIdResets, OwningAccountInternalId, OwningAccountExternalId, OwningAccountExternalIdType, LanguageCode, ShortDisplay, DisplayValue, IsIcbCorridor, OriginRestriction, TargetRestriction, PlanType, PlanLevel, DiscountId, MaxCorridors, IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CorridorObjectData convert (CorridorObjectData CorrConvertIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Convert a Corridor to an ICB..
   * @param context The session context to use when connecting to the APITS server.
   * @param CorrConvertIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt, ActiveDt, InactiveDt, PointOrigin, OriginIsXact, CountryCodeOrigin, PointTarget, TargetIsXact, CountryCodeTarget, CorridorPlanId, AccessRegionOrigin, AccessRegionTarget, PointCategory, ServiceInternalId, ServiceInternalIdResets, OwningAccountInternalId, OwningAccountExternalId, OwningAccountExternalIdType, LanguageCode, ShortDisplay, DisplayValue, IsIcbCorridor, OriginRestriction, TargetRestriction, PlanType, PlanLevel, DiscountId, MaxCorridors, IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CorridorObjectData convert (BSDMSessionContext context, CorridorObjectData CorrConvertIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
