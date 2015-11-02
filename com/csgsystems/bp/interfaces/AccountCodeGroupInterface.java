
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
public interface AccountCodeGroupInterface extends BaliInterface {

  /**
   * Fetch an AccountCodeGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param CACGgetIn Input Object Key.
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeGroupObjectData get (AccountCodeGroupObjectKeyData CACGgetIn) throws BSDMResourceException;
  /**
   * Fetch an AccountCodeGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGgetIn Input Object Key.
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeGroupObjectData get (BSDMSessionContext context, AccountCodeGroupObjectKeyData CACGgetIn) throws BSDMResourceException;


  /**
   * Fetch an AccountCodeGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param CACGgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountCodeGroupObjectData get (AccountCodeGroupObjectKeyData CACGgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Fetch an AccountCodeGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountCodeGroupObjectData get (BSDMSessionContext context, AccountCodeGroupObjectKeyData CACGgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AccountCodeGroups based on the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CACGfindIn Input Filter Object.
   * @return AccountCodeGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeGroupObjectDataList find (AccountCodeGroupObjectFilter CACGfindIn) throws BSDMResourceException;
  /**
   * Find AccountCodeGroups based on the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGfindIn Input Filter Object.
   * @return AccountCodeGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeGroupObjectDataList find (BSDMSessionContext context, AccountCodeGroupObjectFilter CACGfindIn) throws BSDMResourceException;


  /**
   * Find AccountCodeGroups based on the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CACGfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountCodeGroupObjectDataList find (AccountCodeGroupObjectFilter CACGfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AccountCodeGroups based on the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountCodeGroupObjectDataList find (BSDMSessionContext context, AccountCodeGroupObjectFilter CACGfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new AccountCodeGroup..
   * Convenience method using default BSDMSessionContext.
   * @param CACGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AcgTrackingId, AcgTrackingIdServ.  Derived Fields: AcgTrackingId, AcgTrackingIdServ.
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeGroupObjectData create (AccountCodeGroupObjectData CACGcreateIn) throws BSDMResourceException;
  /**
   * Create a new AccountCodeGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AcgTrackingId, AcgTrackingIdServ.  Derived Fields: AcgTrackingId, AcgTrackingIdServ.
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeGroupObjectData create (BSDMSessionContext context, AccountCodeGroupObjectData CACGcreateIn) throws BSDMResourceException;


  /**
   * Create a new AccountCodeGroup..
   * Convenience method using default BSDMSessionContext.
   * @param CACGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AcgTrackingId, AcgTrackingIdServ.  Derived Fields: AcgTrackingId, AcgTrackingIdServ.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountCodeGroupObjectData create (AccountCodeGroupObjectData CACGcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new AccountCodeGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AcgTrackingId, AcgTrackingIdServ.  Derived Fields: AcgTrackingId, AcgTrackingIdServ.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountCodeGroupObjectData create (BSDMSessionContext context, AccountCodeGroupObjectData CACGcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of an AccountCodeGroup..
   * Convenience method using default BSDMSessionContext.
   * @param CACGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeGroupObjectData update (AccountCodeGroupObjectData CACGupdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of an AccountCodeGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountCodeGroupObjectData update (BSDMSessionContext context, AccountCodeGroupObjectData CACGupdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of an AccountCodeGroup..
   * Convenience method using default BSDMSessionContext.
   * @param CACGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountCodeGroupObjectData update (AccountCodeGroupObjectData CACGupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of an AccountCodeGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountCodeGroupObjectData update (BSDMSessionContext context, AccountCodeGroupObjectData CACGupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
