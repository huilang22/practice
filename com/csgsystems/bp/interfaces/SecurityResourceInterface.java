
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
public interface SecurityResourceInterface extends BaliInterface {

  /**
   * Create a new Security Resource..
   * Convenience method using default BSDMSessionContext.
   * @param SECreateIn Input  Object.  Defaulted Fields: ResUpdateCount, ResCreateDate, ResModifyDate, SubUpdateCount, SubCreateDate, SubModifyDate, RarUpdateCount, RarCreateDate, RarModifyDate.  Derived Fields: ResId, MrId, SubId, RarId.
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityResourceObjectData create (SecurityResourceObjectData SECreateIn) throws BSDMResourceException;
  /**
   * Create a new Security Resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param SECreateIn Input  Object.  Defaulted Fields: ResUpdateCount, ResCreateDate, ResModifyDate, SubUpdateCount, SubCreateDate, SubModifyDate, RarUpdateCount, RarCreateDate, RarModifyDate.  Derived Fields: ResId, MrId, SubId, RarId.
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityResourceObjectData create (BSDMSessionContext context, SecurityResourceObjectData SECreateIn) throws BSDMResourceException;


  /**
   * Create a new Security Resource..
   * Convenience method using default BSDMSessionContext.
   * @param SECreateIn Input  Object.  Defaulted Fields: ResUpdateCount, ResCreateDate, ResModifyDate, SubUpdateCount, SubCreateDate, SubModifyDate, RarUpdateCount, RarCreateDate, RarModifyDate.  Derived Fields: ResId, MrId, SubId, RarId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityResourceObjectData create (SecurityResourceObjectData SECreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Security Resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param SECreateIn Input  Object.  Defaulted Fields: ResUpdateCount, ResCreateDate, ResModifyDate, SubUpdateCount, SubCreateDate, SubModifyDate, RarUpdateCount, RarCreateDate, RarModifyDate.  Derived Fields: ResId, MrId, SubId, RarId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityResourceObjectData create (BSDMSessionContext context, SecurityResourceObjectData SECreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get Security Resource By Id..
   * Convenience method using default BSDMSessionContext.
   * @param SECGetIn Input  Object.
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityResourceObjectData get (SecurityResourceObjectData SECGetIn) throws BSDMResourceException;
  /**
   * Get Security Resource By Id..
   * @param context The session context to use when connecting to the APITS server.
   * @param SECGetIn Input  Object.
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityResourceObjectData get (BSDMSessionContext context, SecurityResourceObjectData SECGetIn) throws BSDMResourceException;


  /**
   * Get Security Resource By Id..
   * Convenience method using default BSDMSessionContext.
   * @param SECGetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityResourceObjectData get (SecurityResourceObjectData SECGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get Security Resource By Id..
   * @param context The session context to use when connecting to the APITS server.
   * @param SECGetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityResourceObjectData get (BSDMSessionContext context, SecurityResourceObjectData SECGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find secuirty resource by filter..
   * Convenience method using default BSDMSessionContext.
   * @param SECFindIn Input Filter Object.
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityResourceObjectDataList find (SecurityResourceObjectFilter SECFindIn) throws BSDMResourceException;
  /**
   * Find secuirty resource by filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SECFindIn Input Filter Object.
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityResourceObjectDataList find (BSDMSessionContext context, SecurityResourceObjectFilter SECFindIn) throws BSDMResourceException;


  /**
   * Find secuirty resource by filter..
   * Convenience method using default BSDMSessionContext.
   * @param SECFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityResourceObjectDataList find (SecurityResourceObjectFilter SECFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find secuirty resource by filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SECFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityResourceObjectDataList find (BSDMSessionContext context, SecurityResourceObjectFilter SECFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Assign Security Resources to A Security Role..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityResourceAssignIn Input List Object.
   * @param a_role_id.
   * @param a_user_name.
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityResourceObjectDataList assign (SecurityResourceObjectData[] SecurityResourceAssignIn, BigInteger a_role_id, String a_user_name) throws BSDMResourceException;
  /**
   * Assign Security Resources to A Security Role..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityResourceAssignIn Input List Object.
   * @param a_role_id.
   * @param a_user_name.
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityResourceObjectDataList assign (BSDMSessionContext context, SecurityResourceObjectData[] SecurityResourceAssignIn, BigInteger a_role_id, String a_user_name) throws BSDMResourceException;


  /**
   * Assign Security Resources to A Security Role..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityResourceAssignIn Input List Object.
   * @param a_role_id.
   * @param a_user_name.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityResourceObjectDataList assign (SecurityResourceObjectData[] SecurityResourceAssignIn, BigInteger a_role_id, String a_user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Assign Security Resources to A Security Role..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityResourceAssignIn Input List Object.
   * @param a_role_id.
   * @param a_user_name.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityResourceObjectDataList assign (BSDMSessionContext context, SecurityResourceObjectData[] SecurityResourceAssignIn, BigInteger a_role_id, String a_user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Remove the bindings between Security Resources and A Security Role..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityResourceUnassignIn Input List Object.
   * @param b_role_id.
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityResourceObjectDataList unassign (SecurityResourceObjectData[] SecurityResourceUnassignIn, BigInteger b_role_id) throws BSDMResourceException;
  /**
   * Remove the bindings between Security Resources and A Security Role..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityResourceUnassignIn Input List Object.
   * @param b_role_id.
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityResourceObjectDataList unassign (BSDMSessionContext context, SecurityResourceObjectData[] SecurityResourceUnassignIn, BigInteger b_role_id) throws BSDMResourceException;


  /**
   * Remove the bindings between Security Resources and A Security Role..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityResourceUnassignIn Input List Object.
   * @param b_role_id.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityResourceObjectDataList unassign (SecurityResourceObjectData[] SecurityResourceUnassignIn, BigInteger b_role_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Remove the bindings between Security Resources and A Security Role..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityResourceUnassignIn Input List Object.
   * @param b_role_id.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityResourceObjectDataList unassign (BSDMSessionContext context, SecurityResourceObjectData[] SecurityResourceUnassignIn, BigInteger b_role_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
