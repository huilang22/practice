
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
public interface GroupMemberInterface extends BaliInterface {

  /**
   * Retrieve a unique GroupMember..
   * Convenience method using default BSDMSessionContext.
   * @param GMgetIn Input Object Key.
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupMemberObjectData get (GroupMemberObjectKeyData GMgetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique GroupMember..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMgetIn Input Object Key.
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupMemberObjectData get (BSDMSessionContext context, GroupMemberObjectKeyData GMgetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique GroupMember..
   * Convenience method using default BSDMSessionContext.
   * @param GMgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GroupMemberObjectData get (GroupMemberObjectKeyData GMgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique GroupMember..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GroupMemberObjectData get (BSDMSessionContext context, GroupMemberObjectKeyData GMgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find GroupMember's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GMfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @return GroupMemberObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupMemberObjectDataList find (GroupMemberObjectFilter GMfindIn) throws BSDMResourceException;
  /**
   * Find GroupMember's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @return GroupMemberObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupMemberObjectDataList find (BSDMSessionContext context, GroupMemberObjectFilter GMfindIn) throws BSDMResourceException;


  /**
   * Find GroupMember's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GMfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupMemberObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GroupMemberObjectDataList find (GroupMemberObjectFilter GMfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find GroupMember's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupMemberObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GroupMemberObjectDataList find (BSDMSessionContext context, GroupMemberObjectFilter GMfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new GroupMember row..
   * Convenience method using default BSDMSessionContext.
   * @param GMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Defaulted Fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, ActiveDt, IsDesignated.  Derived Fields: ActiveDt, AccountExternalIdType, ChgDt, ChgWho, CreateDt.
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupMemberObjectData create (GroupMemberObjectData GMcreateIn) throws BSDMResourceException;
  /**
   * Create a new GroupMember row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Defaulted Fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, ActiveDt, IsDesignated.  Derived Fields: ActiveDt, AccountExternalIdType, ChgDt, ChgWho, CreateDt.
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupMemberObjectData create (BSDMSessionContext context, GroupMemberObjectData GMcreateIn) throws BSDMResourceException;


  /**
   * Create a new GroupMember row..
   * Convenience method using default BSDMSessionContext.
   * @param GMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Defaulted Fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, ActiveDt, IsDesignated.  Derived Fields: ActiveDt, AccountExternalIdType, ChgDt, ChgWho, CreateDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GroupMemberObjectData create (GroupMemberObjectData GMcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new GroupMember row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Defaulted Fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, ActiveDt, IsDesignated.  Derived Fields: ActiveDt, AccountExternalIdType, ChgDt, ChgWho, CreateDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GroupMemberObjectData create (BSDMSessionContext context, GroupMemberObjectData GMcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non key information in a GroupMember object..
   * Convenience method using default BSDMSessionContext.
   * @param GMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupMemberObjectData update (GroupMemberObjectData GMupdateIn) throws BSDMResourceException;
  /**
   * Update non key information in a GroupMember object..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupMemberObjectData update (BSDMSessionContext context, GroupMemberObjectData GMupdateIn) throws BSDMResourceException;


  /**
   * Update non key information in a GroupMember object..
   * Convenience method using default BSDMSessionContext.
   * @param GMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GroupMemberObjectData update (GroupMemberObjectData GMupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non key information in a GroupMember object..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GroupMemberObjectData update (BSDMSessionContext context, GroupMemberObjectData GMupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease a GroupMember..
   * Convenience method using default BSDMSessionContext.
   * @param GMdeleteIn Input Object Key.
   * @param GMInactiveDate (has a default).
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupMemberObjectData delete (GroupMemberObjectKeyData GMdeleteIn, Date GMInactiveDate) throws BSDMResourceException;
  /**
   * Cease a GroupMember..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMdeleteIn Input Object Key.
   * @param GMInactiveDate (has a default).
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GroupMemberObjectData delete (BSDMSessionContext context, GroupMemberObjectKeyData GMdeleteIn, Date GMInactiveDate) throws BSDMResourceException;


  /**
   * Cease a GroupMember..
   * Convenience method using default BSDMSessionContext.
   * @param GMdeleteIn Input Object Key.
   * @param GMInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GroupMemberObjectData delete (GroupMemberObjectKeyData GMdeleteIn, Date GMInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease a GroupMember..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMdeleteIn Input Object Key.
   * @param GMInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GroupMemberObjectData delete (BSDMSessionContext context, GroupMemberObjectKeyData GMdeleteIn, Date GMInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease GroupMember's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GMLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, GroupExternalId, GroupExternalIdType.
   * @param GMLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (GroupMemberObjectFilter GMLdeleteIn, Date GMLInactiveDate) throws BSDMResourceException;
  /**
   * Cease GroupMember's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, GroupExternalId, GroupExternalIdType.
   * @param GMLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, GroupMemberObjectFilter GMLdeleteIn, Date GMLInactiveDate) throws BSDMResourceException;


  /**
   * Cease GroupMember's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GMLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, GroupExternalId, GroupExternalIdType.
   * @param GMLInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (GroupMemberObjectFilter GMLdeleteIn, Date GMLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease GroupMember's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, GroupExternalId, GroupExternalIdType.
   * @param GMLInactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, GroupMemberObjectFilter GMLdeleteIn, Date GMLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
