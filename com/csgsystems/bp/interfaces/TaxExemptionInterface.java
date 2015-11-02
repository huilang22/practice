
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
public interface TaxExemptionInterface extends BaliInterface {

  /**
   * Get a unique TaxExemption row..
   * Convenience method using default BSDMSessionContext.
   * @param TEgetIn Input Object Key.
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxExemptionObjectData get (TaxExemptionObjectKeyData TEgetIn) throws BSDMResourceException;
  /**
   * Get a unique TaxExemption row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEgetIn Input Object Key.
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxExemptionObjectData get (BSDMSessionContext context, TaxExemptionObjectKeyData TEgetIn) throws BSDMResourceException;


  /**
   * Get a unique TaxExemption row..
   * Convenience method using default BSDMSessionContext.
   * @param TEgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TaxExemptionObjectData get (TaxExemptionObjectKeyData TEgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique TaxExemption row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TaxExemptionObjectData get (BSDMSessionContext context, TaxExemptionObjectKeyData TEgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find TaxExemption rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TEfindIn Input Filter Object.
   * @return TaxExemptionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxExemptionObjectDataList find (TaxExemptionObjectFilter TEfindIn) throws BSDMResourceException;
  /**
   * Find TaxExemption rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEfindIn Input Filter Object.
   * @return TaxExemptionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxExemptionObjectDataList find (BSDMSessionContext context, TaxExemptionObjectFilter TEfindIn) throws BSDMResourceException;


  /**
   * Find TaxExemption rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TEfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxExemptionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TaxExemptionObjectDataList find (TaxExemptionObjectFilter TEfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find TaxExemption rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxExemptionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TaxExemptionObjectDataList find (BSDMSessionContext context, TaxExemptionObjectFilter TEfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new TaxExemption row for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param TEcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Defaulted Fields: TaxPkgInstId, TaxStatus, ActiveDate, ExemptFederal, ExemptState, ExemptCounty, ExemptCity, ExemptOther, TaxTypeCode, CountryCode, FranchiseCode, StateCode, CountyCode, CityCode.  Derived Fields: TrackingId, TrackingIdServ, DateExpiration.
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxExemptionObjectData create (TaxExemptionObjectData TEcreateIn) throws BSDMResourceException;
  /**
   * Create a new TaxExemption row for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Defaulted Fields: TaxPkgInstId, TaxStatus, ActiveDate, ExemptFederal, ExemptState, ExemptCounty, ExemptCity, ExemptOther, TaxTypeCode, CountryCode, FranchiseCode, StateCode, CountyCode, CityCode.  Derived Fields: TrackingId, TrackingIdServ, DateExpiration.
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxExemptionObjectData create (BSDMSessionContext context, TaxExemptionObjectData TEcreateIn) throws BSDMResourceException;


  /**
   * Create a new TaxExemption row for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param TEcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Defaulted Fields: TaxPkgInstId, TaxStatus, ActiveDate, ExemptFederal, ExemptState, ExemptCounty, ExemptCity, ExemptOther, TaxTypeCode, CountryCode, FranchiseCode, StateCode, CountyCode, CityCode.  Derived Fields: TrackingId, TrackingIdServ, DateExpiration.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TaxExemptionObjectData create (TaxExemptionObjectData TEcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new TaxExemption row for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Defaulted Fields: TaxPkgInstId, TaxStatus, ActiveDate, ExemptFederal, ExemptState, ExemptCounty, ExemptCity, ExemptOther, TaxTypeCode, CountryCode, FranchiseCode, StateCode, CountyCode, CityCode.  Derived Fields: TrackingId, TrackingIdServ, DateExpiration.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TaxExemptionObjectData create (BSDMSessionContext context, TaxExemptionObjectData TEcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non key fields of a TaxExemption..
   * Convenience method using default BSDMSessionContext.
   * @param TEupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Derived Fields: DateExpiration.
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxExemptionObjectData update (TaxExemptionObjectData TEupdateIn) throws BSDMResourceException;
  /**
   * Update the non key fields of a TaxExemption..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Derived Fields: DateExpiration.
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxExemptionObjectData update (BSDMSessionContext context, TaxExemptionObjectData TEupdateIn) throws BSDMResourceException;


  /**
   * Update the non key fields of a TaxExemption..
   * Convenience method using default BSDMSessionContext.
   * @param TEupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Derived Fields: DateExpiration.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TaxExemptionObjectData update (TaxExemptionObjectData TEupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non key fields of a TaxExemption..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Derived Fields: DateExpiration.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TaxExemptionObjectData update (BSDMSessionContext context, TaxExemptionObjectData TEupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease a TaxExemption row..
   * Convenience method using default BSDMSessionContext.
   * @param TEdelIn Input Object Key.
   * @param TEInactiveDate (has a default).
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxExemptionObjectData delete (TaxExemptionObjectKeyData TEdelIn, Date TEInactiveDate) throws BSDMResourceException;
  /**
   * Cease a TaxExemption row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEdelIn Input Object Key.
   * @param TEInactiveDate (has a default).
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxExemptionObjectData delete (BSDMSessionContext context, TaxExemptionObjectKeyData TEdelIn, Date TEInactiveDate) throws BSDMResourceException;


  /**
   * Cease a TaxExemption row..
   * Convenience method using default BSDMSessionContext.
   * @param TEdelIn Input Object Key.
   * @param TEInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TaxExemptionObjectData delete (TaxExemptionObjectKeyData TEdelIn, Date TEInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease a TaxExemption row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEdelIn Input Object Key.
   * @param TEInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TaxExemptionObjectData delete (BSDMSessionContext context, TaxExemptionObjectKeyData TEdelIn, Date TEInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease the TaxExemptions that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TELdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param TELInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (TaxExemptionObjectFilter TELdelIn, Date TELInactiveDate) throws BSDMResourceException;
  /**
   * Cease the TaxExemptions that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TELdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param TELInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, TaxExemptionObjectFilter TELdelIn, Date TELInactiveDate) throws BSDMResourceException;


  /**
   * Cease the TaxExemptions that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TELdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param TELInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (TaxExemptionObjectFilter TELdelIn, Date TELInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease the TaxExemptions that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TELdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param TELInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, TaxExemptionObjectFilter TELdelIn, Date TELInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
