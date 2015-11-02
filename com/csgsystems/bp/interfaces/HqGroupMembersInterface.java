
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
public interface HqGroupMembersInterface extends BaliInterface {

  /**
   * Creates a new HqGroupMembers..
   * Convenience method using default BSDMSessionContext.
   * @param HGMCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupMembersObjectData create (HqGroupMembersObjectData HGMCreateIn) throws BSDMResourceException;
  /**
   * Creates a new HqGroupMembers..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupMembersObjectData create (BSDMSessionContext context, HqGroupMembersObjectData HGMCreateIn) throws BSDMResourceException;


  /**
   * Creates a new HqGroupMembers..
   * Convenience method using default BSDMSessionContext.
   * @param HGMCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupMembersObjectData create (HqGroupMembersObjectData HGMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Creates a new HqGroupMembers..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupMembersObjectData create (BSDMSessionContext context, HqGroupMembersObjectData HGMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields in an group members..
   * Convenience method using default BSDMSessionContext.
   * @param HGMUpdateIn Input  Object.  Derived Fields: ChgDt, ChgWho.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupMembersObjectData update (HqGroupMembersObjectData HGMUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields in an group members..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMUpdateIn Input  Object.  Derived Fields: ChgDt, ChgWho.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupMembersObjectData update (BSDMSessionContext context, HqGroupMembersObjectData HGMUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields in an group members..
   * Convenience method using default BSDMSessionContext.
   * @param HGMUpdateIn Input  Object.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupMembersObjectData update (HqGroupMembersObjectData HGMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields in an group members..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMUpdateIn Input  Object.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupMembersObjectData update (BSDMSessionContext context, HqGroupMembersObjectData HGMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds Group members based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HGMFindIn Input Filter Object.
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupMembersObjectDataList find (HqGroupMembersObjectFilter HGMFindIn) throws BSDMResourceException;
  /**
   * Finds Group members based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMFindIn Input Filter Object.
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupMembersObjectDataList find (BSDMSessionContext context, HqGroupMembersObjectFilter HGMFindIn) throws BSDMResourceException;


  /**
   * Finds Group members based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HGMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupMembersObjectDataList find (HqGroupMembersObjectFilter HGMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds Group members based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupMembersObjectDataList find (BSDMSessionContext context, HqGroupMembersObjectFilter HGMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieves a Group Members object based on its key..
   * Convenience method using default BSDMSessionContext.
   * @param HGMGetIn Input  Object.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupMembersObjectData get (HqGroupMembersObjectData HGMGetIn) throws BSDMResourceException;
  /**
   * Retrieves a Group Members object based on its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMGetIn Input  Object.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupMembersObjectData get (BSDMSessionContext context, HqGroupMembersObjectData HGMGetIn) throws BSDMResourceException;


  /**
   * Retrieves a Group Members object based on its key..
   * Convenience method using default BSDMSessionContext.
   * @param HGMGetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupMembersObjectData get (HqGroupMembersObjectData HGMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieves a Group Members object based on its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMGetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupMembersObjectData get (BSDMSessionContext context, HqGroupMembersObjectData HGMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease a Group Member..
   * Convenience method using default BSDMSessionContext.
   * @param HGMDeleteIn Input  Object.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupMembersObjectData delete (HqGroupMembersObjectData HGMDeleteIn) throws BSDMResourceException;
  /**
   * Cease a Group Member..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMDeleteIn Input  Object.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupMembersObjectData delete (BSDMSessionContext context, HqGroupMembersObjectData HGMDeleteIn) throws BSDMResourceException;


  /**
   * Cease a Group Member..
   * Convenience method using default BSDMSessionContext.
   * @param HGMDeleteIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupMembersObjectData delete (HqGroupMembersObjectData HGMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease a Group Member..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMDeleteIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupMembersObjectData delete (BSDMSessionContext context, HqGroupMembersObjectData HGMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease group Members that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HGMDlIn Input Filter Object.
   * @param HGMDlInactiveDate (has a default).
   * @param HGMDlDiscRe.
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupMembersObjectDataList deleteList (HqGroupMembersObjectFilter HGMDlIn, Date HGMDlInactiveDate, Integer HGMDlDiscRe) throws BSDMResourceException;
  /**
   * Cease group Members that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMDlIn Input Filter Object.
   * @param HGMDlInactiveDate (has a default).
   * @param HGMDlDiscRe.
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupMembersObjectDataList deleteList (BSDMSessionContext context, HqGroupMembersObjectFilter HGMDlIn, Date HGMDlInactiveDate, Integer HGMDlDiscRe) throws BSDMResourceException;


  /**
   * Cease group Members that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HGMDlIn Input Filter Object.
   * @param HGMDlInactiveDate (has a default).
   * @param HGMDlDiscRe.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupMembersObjectDataList deleteList (HqGroupMembersObjectFilter HGMDlIn, Date HGMDlInactiveDate, Integer HGMDlDiscRe, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease group Members that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMDlIn Input Filter Object.
   * @param HGMDlInactiveDate (has a default).
   * @param HGMDlDiscRe.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupMembersObjectDataList deleteList (BSDMSessionContext context, HqGroupMembersObjectFilter HGMDlIn, Date HGMDlInactiveDate, Integer HGMDlDiscRe, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
