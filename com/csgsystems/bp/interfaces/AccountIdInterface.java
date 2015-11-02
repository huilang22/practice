
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
public interface AccountIdInterface extends BaliInterface {

  /**
   * Retrieve one unique Account ExternalId..
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountIdObjectData get (AccountIdObjectKeyData getIn) throws BSDMResourceException;
  /**
   * Retrieve one unique Account ExternalId..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountIdObjectData get (BSDMSessionContext context, AccountIdObjectKeyData getIn) throws BSDMResourceException;


  /**
   * Retrieve one unique Account ExternalId..
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountIdObjectData get (AccountIdObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve one unique Account ExternalId..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountIdObjectData get (BSDMSessionContext context, AccountIdObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease an AccountId..
   * Convenience method using default BSDMSessionContext.
   * @param axIn Input Object Key.
   * @param AIDCeaseDate (has a default).
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountIdObjectData delete (AccountIdObjectKeyData axIn, Date AIDCeaseDate) throws BSDMResourceException;
  /**
   * Cease an AccountId..
   * @param context The session context to use when connecting to the APITS server.
   * @param axIn Input Object Key.
   * @param AIDCeaseDate (has a default).
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountIdObjectData delete (BSDMSessionContext context, AccountIdObjectKeyData axIn, Date AIDCeaseDate) throws BSDMResourceException;


  /**
   * Cease an AccountId..
   * Convenience method using default BSDMSessionContext.
   * @param axIn Input Object Key.
   * @param AIDCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountIdObjectData delete (AccountIdObjectKeyData axIn, Date AIDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease an AccountId..
   * @param context The session context to use when connecting to the APITS server.
   * @param axIn Input Object Key.
   * @param AIDCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountIdObjectData delete (BSDMSessionContext context, AccountIdObjectKeyData axIn, Date AIDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease AccountId's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param xlFilter Input Filter Object.
   * @param AIDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (AccountIdObjectFilter xlFilter, Date AIDLCeaseDate) throws BSDMResourceException;
  /**
   * Cease AccountId's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param xlFilter Input Filter Object.
   * @param AIDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, AccountIdObjectFilter xlFilter, Date AIDLCeaseDate) throws BSDMResourceException;


  /**
   * Cease AccountId's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param xlFilter Input Filter Object.
   * @param AIDLCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (AccountIdObjectFilter xlFilter, Date AIDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease AccountId's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param xlFilter Input Filter Object.
   * @param AIDLCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, AccountIdObjectFilter xlFilter, Date AIDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AccountId's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return AccountIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountIdObjectDataList find (AccountIdObjectFilter findIn) throws BSDMResourceException;
  /**
   * Find AccountId's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return AccountIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountIdObjectDataList find (BSDMSessionContext context, AccountIdObjectFilter findIn) throws BSDMResourceException;


  /**
   * Find AccountId's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountIdObjectDataList find (AccountIdObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AccountId's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountIdObjectDataList find (BSDMSessionContext context, AccountIdObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of an AccountId..
   * Convenience method using default BSDMSessionContext.
   * @param updateIn Input  Object.  Read-Only fields: InactiveDate.
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountIdObjectData update (AccountIdObjectData updateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of an AccountId..
   * @param context The session context to use when connecting to the APITS server.
   * @param updateIn Input  Object.  Read-Only fields: InactiveDate.
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountIdObjectData update (BSDMSessionContext context, AccountIdObjectData updateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of an AccountId..
   * Convenience method using default BSDMSessionContext.
   * @param updateIn Input  Object.  Read-Only fields: InactiveDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountIdObjectData update (AccountIdObjectData updateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of an AccountId..
   * @param context The session context to use when connecting to the APITS server.
   * @param updateIn Input  Object.  Read-Only fields: InactiveDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountIdObjectData update (BSDMSessionContext context, AccountIdObjectData updateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new Account External Id for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param createIn Input  Object.  Defaulted Fields: AccountExternalIdType, ActiveDate, IsCurrent.  Derived Fields: ActiveDate, InactiveDate.
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountIdObjectData create (AccountIdObjectData createIn) throws BSDMResourceException;
  /**
   * Create a new Account External Id for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param createIn Input  Object.  Defaulted Fields: AccountExternalIdType, ActiveDate, IsCurrent.  Derived Fields: ActiveDate, InactiveDate.
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountIdObjectData create (BSDMSessionContext context, AccountIdObjectData createIn) throws BSDMResourceException;


  /**
   * Create a new Account External Id for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param createIn Input  Object.  Defaulted Fields: AccountExternalIdType, ActiveDate, IsCurrent.  Derived Fields: ActiveDate, InactiveDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountIdObjectData create (AccountIdObjectData createIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Account External Id for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param createIn Input  Object.  Defaulted Fields: AccountExternalIdType, ActiveDate, IsCurrent.  Derived Fields: ActiveDate, InactiveDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountIdObjectData create (BSDMSessionContext context, AccountIdObjectData createIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
