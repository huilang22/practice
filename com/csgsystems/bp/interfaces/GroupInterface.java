
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
public interface GroupInterface extends BaliInterface {

  /**
   * Get a unique Group row..
   * Convenience method using default BSDMSessionContext.
   * @param GgetIn Input Object Key.
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupObjectData get (GroupObjectKeyData GgetIn) throws BSDMResourceException;
  /**
   * Get a unique Group row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GgetIn Input Object Key.
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupObjectData get (BSDMSessionContext context, GroupObjectKeyData GgetIn) throws BSDMResourceException;


  /**
   * Get a unique Group row..
   * Convenience method using default BSDMSessionContext.
   * @param GgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GroupObjectData get (GroupObjectKeyData GgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique Group row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GroupObjectData get (BSDMSessionContext context, GroupObjectKeyData GgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Groups that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @return GroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupObjectDataList find (GroupObjectFilter GfindIn) throws BSDMResourceException;
  /**
   * Find Groups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @return GroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupObjectDataList find (BSDMSessionContext context, GroupObjectFilter GfindIn) throws BSDMResourceException;


  /**
   * Find Groups that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GroupObjectDataList find (GroupObjectFilter GfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Groups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GroupObjectDataList find (BSDMSessionContext context, GroupObjectFilter GfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new Group..
   * Convenience method using default BSDMSessionContext.
   * @param GcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupNo, ChgWho, ChgDt, CreateDt.  Defaulted Fields: GroupExternalIdType.  Derived Fields: GroupNo, AccountExternalIdType, ChgDt, ChgWho, CreateDt.
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupObjectData create (GroupObjectData GcreateIn) throws BSDMResourceException;
  /**
   * Create a new Group..
   * @param context The session context to use when connecting to the APITS server.
   * @param GcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupNo, ChgWho, ChgDt, CreateDt.  Defaulted Fields: GroupExternalIdType.  Derived Fields: GroupNo, AccountExternalIdType, ChgDt, ChgWho, CreateDt.
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupObjectData create (BSDMSessionContext context, GroupObjectData GcreateIn) throws BSDMResourceException;


  /**
   * Create a new Group..
   * Convenience method using default BSDMSessionContext.
   * @param GcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupNo, ChgWho, ChgDt, CreateDt.  Defaulted Fields: GroupExternalIdType.  Derived Fields: GroupNo, AccountExternalIdType, ChgDt, ChgWho, CreateDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GroupObjectData create (GroupObjectData GcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Group..
   * @param context The session context to use when connecting to the APITS server.
   * @param GcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupNo, ChgWho, ChgDt, CreateDt.  Defaulted Fields: GroupExternalIdType.  Derived Fields: GroupNo, AccountExternalIdType, ChgDt, ChgWho, CreateDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GroupObjectData create (BSDMSessionContext context, GroupObjectData GcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of a Group..
   * Convenience method using default BSDMSessionContext.
   * @param GupdateIn Input  Object.  Read-Only fields: GroupExternalId, GroupExternalIdType, AccountExternalId, AccountExternalIdType, ChgWho, ChgDt, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupObjectData update (GroupObjectData GupdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of a Group..
   * @param context The session context to use when connecting to the APITS server.
   * @param GupdateIn Input  Object.  Read-Only fields: GroupExternalId, GroupExternalIdType, AccountExternalId, AccountExternalIdType, ChgWho, ChgDt, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupObjectData update (BSDMSessionContext context, GroupObjectData GupdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of a Group..
   * Convenience method using default BSDMSessionContext.
   * @param GupdateIn Input  Object.  Read-Only fields: GroupExternalId, GroupExternalIdType, AccountExternalId, AccountExternalIdType, ChgWho, ChgDt, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GroupObjectData update (GroupObjectData GupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of a Group..
   * @param context The session context to use when connecting to the APITS server.
   * @param GupdateIn Input  Object.  Read-Only fields: GroupExternalId, GroupExternalIdType, AccountExternalId, AccountExternalIdType, ChgWho, ChgDt, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GroupObjectData update (BSDMSessionContext context, GroupObjectData GupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
