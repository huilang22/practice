
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
public interface AccountBalancesInterface extends BaliInterface {

  /**
   * Returns the # of AccountBalances for a given Account..
   * Convenience method using default BSDMSessionContext.
   * @param accIn Input Object Key.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer count (CmfObjectKeyData accIn) throws BSDMResourceException;
  /**
   * Returns the # of AccountBalances for a given Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param accIn Input Object Key.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer count (BSDMSessionContext context, CmfObjectKeyData accIn) throws BSDMResourceException;


  /**
   * Returns the # of AccountBalances for a given Account..
   * Convenience method using default BSDMSessionContext.
   * @param accIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer count (CmfObjectKeyData accIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns the # of AccountBalances for a given Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param accIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer count (BSDMSessionContext context, CmfObjectKeyData accIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Creates an AccountBalance for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param ABCreateIn Input  Object.  Read-Only fields: BalanceTrackingIdServ, ChgWho, ChgDt, CreateDt.  Defaulted Fields: IsBalancePrepaid, AuthorizationFlag, Priority, ActiveDt.  Derived Fields: BalanceTrackingIdServ, CreateDt, ChgDt, ChgWho.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalancesObjectData create (AccountBalancesObjectData ABCreateIn) throws BSDMResourceException;
  /**
   * Creates an AccountBalance for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABCreateIn Input  Object.  Read-Only fields: BalanceTrackingIdServ, ChgWho, ChgDt, CreateDt.  Defaulted Fields: IsBalancePrepaid, AuthorizationFlag, Priority, ActiveDt.  Derived Fields: BalanceTrackingIdServ, CreateDt, ChgDt, ChgWho.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalancesObjectData create (BSDMSessionContext context, AccountBalancesObjectData ABCreateIn) throws BSDMResourceException;


  /**
   * Creates an AccountBalance for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param ABCreateIn Input  Object.  Read-Only fields: BalanceTrackingIdServ, ChgWho, ChgDt, CreateDt.  Defaulted Fields: IsBalancePrepaid, AuthorizationFlag, Priority, ActiveDt.  Derived Fields: BalanceTrackingIdServ, CreateDt, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBalancesObjectData create (AccountBalancesObjectData ABCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Creates an AccountBalance for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABCreateIn Input  Object.  Read-Only fields: BalanceTrackingIdServ, ChgWho, ChgDt, CreateDt.  Defaulted Fields: IsBalancePrepaid, AuthorizationFlag, Priority, ActiveDt.  Derived Fields: BalanceTrackingIdServ, CreateDt, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBalancesObjectData create (BSDMSessionContext context, AccountBalancesObjectData ABCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieves one unique AccountBalance row..
   * Convenience method using default BSDMSessionContext.
   * @param ABGetIn Input Object Key.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalancesObjectData get (AccountBalancesObjectKeyData ABGetIn) throws BSDMResourceException;
  /**
   * Retrieves one unique AccountBalance row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABGetIn Input Object Key.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalancesObjectData get (BSDMSessionContext context, AccountBalancesObjectKeyData ABGetIn) throws BSDMResourceException;


  /**
   * Retrieves one unique AccountBalance row..
   * Convenience method using default BSDMSessionContext.
   * @param ABGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBalancesObjectData get (AccountBalancesObjectKeyData ABGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieves one unique AccountBalance row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBalancesObjectData get (BSDMSessionContext context, AccountBalancesObjectKeyData ABGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieves one unique AccountBalance row by OpenItemId and BalanceAccountInternalId..
   * Convenience method using default BSDMSessionContext.
   * @param ABAlternateGetIn Input  Object.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalancesObjectData alternateGet (AccountBalancesObjectData ABAlternateGetIn) throws BSDMResourceException;
  /**
   * Retrieves one unique AccountBalance row by OpenItemId and BalanceAccountInternalId..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABAlternateGetIn Input  Object.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalancesObjectData alternateGet (BSDMSessionContext context, AccountBalancesObjectData ABAlternateGetIn) throws BSDMResourceException;


  /**
   * Retrieves one unique AccountBalance row by OpenItemId and BalanceAccountInternalId..
   * Convenience method using default BSDMSessionContext.
   * @param ABAlternateGetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBalancesObjectData alternateGet (AccountBalancesObjectData ABAlternateGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieves one unique AccountBalance row by OpenItemId and BalanceAccountInternalId..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABAlternateGetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBalancesObjectData alternateGet (BSDMSessionContext context, AccountBalancesObjectData ABAlternateGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds AccountBalances that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ABFindIn Input Filter Object.
   * @return AccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalancesObjectDataList find (AccountBalancesObjectFilter ABFindIn) throws BSDMResourceException;
  /**
   * Finds AccountBalances that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABFindIn Input Filter Object.
   * @return AccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalancesObjectDataList find (BSDMSessionContext context, AccountBalancesObjectFilter ABFindIn) throws BSDMResourceException;


  /**
   * Finds AccountBalances that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ABFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBalancesObjectDataList find (AccountBalancesObjectFilter ABFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds AccountBalances that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBalancesObjectDataList find (BSDMSessionContext context, AccountBalancesObjectFilter ABFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields on an AccountBalances row..
   * Convenience method using default BSDMSessionContext.
   * @param ABUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalancesObjectData update (AccountBalancesObjectData ABUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields on an AccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalancesObjectData update (BSDMSessionContext context, AccountBalancesObjectData ABUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields on an AccountBalances row..
   * Convenience method using default BSDMSessionContext.
   * @param ABUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBalancesObjectData update (AccountBalancesObjectData ABUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields on an AccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBalancesObjectData update (BSDMSessionContext context, AccountBalancesObjectData ABUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease an AccountBalance..
   * Convenience method using default BSDMSessionContext.
   * @param ABDeleteIn Input Object Key.
   * @param ABDCeaseDate (has a default).
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalancesObjectData delete (AccountBalancesObjectKeyData ABDeleteIn, Date ABDCeaseDate) throws BSDMResourceException;
  /**
   * Cease an AccountBalance..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABDeleteIn Input Object Key.
   * @param ABDCeaseDate (has a default).
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountBalancesObjectData delete (BSDMSessionContext context, AccountBalancesObjectKeyData ABDeleteIn, Date ABDCeaseDate) throws BSDMResourceException;


  /**
   * Cease an AccountBalance..
   * Convenience method using default BSDMSessionContext.
   * @param ABDeleteIn Input Object Key.
   * @param ABDCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountBalancesObjectData delete (AccountBalancesObjectKeyData ABDeleteIn, Date ABDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease an AccountBalance..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABDeleteIn Input Object Key.
   * @param ABDCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountBalancesObjectData delete (BSDMSessionContext context, AccountBalancesObjectKeyData ABDeleteIn, Date ABDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease AccountBalances based upon a filter..
   * Convenience method using default BSDMSessionContext.
   * @param AccountBalancesFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABInactiveDate (null is allowed) (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (AccountBalancesObjectFilter AccountBalancesFilter, Date ABInactiveDate) throws BSDMResourceException;
  /**
   * Cease AccountBalances based upon a filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountBalancesFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABInactiveDate (null is allowed) (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, AccountBalancesObjectFilter AccountBalancesFilter, Date ABInactiveDate) throws BSDMResourceException;


  /**
   * Cease AccountBalances based upon a filter..
   * Convenience method using default BSDMSessionContext.
   * @param AccountBalancesFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABInactiveDate (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (AccountBalancesObjectFilter AccountBalancesFilter, Date ABInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease AccountBalances based upon a filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountBalancesFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABInactiveDate (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, AccountBalancesObjectFilter AccountBalancesFilter, Date ABInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease AccountBalances for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param ABInObject Input  Object.  Read-Only fields: ChgDt, ChgWho, InactiveDt, ActiveDt, CreateDt, BalanceDesc, BalanceTrackingId, BalanceTrackingIdServ, IsBalancePrepaid, RegulatoryId, AuthorizationFlag, LanguageCode, Priority, BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABAInactiveDate (null is allowed) (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteByAccount (AccountBalancesObjectData ABInObject, Date ABAInactiveDate) throws BSDMResourceException;
  /**
   * Cease AccountBalances for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABInObject Input  Object.  Read-Only fields: ChgDt, ChgWho, InactiveDt, ActiveDt, CreateDt, BalanceDesc, BalanceTrackingId, BalanceTrackingIdServ, IsBalancePrepaid, RegulatoryId, AuthorizationFlag, LanguageCode, Priority, BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABAInactiveDate (null is allowed) (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteByAccount (BSDMSessionContext context, AccountBalancesObjectData ABInObject, Date ABAInactiveDate) throws BSDMResourceException;


  /**
   * Cease AccountBalances for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param ABInObject Input  Object.  Read-Only fields: ChgDt, ChgWho, InactiveDt, ActiveDt, CreateDt, BalanceDesc, BalanceTrackingId, BalanceTrackingIdServ, IsBalancePrepaid, RegulatoryId, AuthorizationFlag, LanguageCode, Priority, BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABAInactiveDate (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteByAccount (AccountBalancesObjectData ABInObject, Date ABAInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease AccountBalances for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABInObject Input  Object.  Read-Only fields: ChgDt, ChgWho, InactiveDt, ActiveDt, CreateDt, BalanceDesc, BalanceTrackingId, BalanceTrackingIdServ, IsBalancePrepaid, RegulatoryId, AuthorizationFlag, LanguageCode, Priority, BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABAInactiveDate (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteByAccount (BSDMSessionContext context, AccountBalancesObjectData ABInObject, Date ABAInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
