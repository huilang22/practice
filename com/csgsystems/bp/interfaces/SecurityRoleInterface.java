
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
public interface SecurityRoleInterface extends BaliInterface {

  /**
   * Find SecurityRoles that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityRoleFindIn Input Filter Object.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityRoleObjectDataList find (SecurityRoleObjectFilter SecurityRoleFindIn) throws BSDMResourceException;
  /**
   * Find SecurityRoles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityRoleFindIn Input Filter Object.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityRoleObjectDataList find (BSDMSessionContext context, SecurityRoleObjectFilter SecurityRoleFindIn) throws BSDMResourceException;


  /**
   * Find SecurityRoles that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityRoleFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityRoleObjectDataList find (SecurityRoleObjectFilter SecurityRoleFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find SecurityRoles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityRoleFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityRoleObjectDataList find (BSDMSessionContext context, SecurityRoleObjectFilter SecurityRoleFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get security role list bound to a security resource..
   * Convenience method using default BSDMSessionContext.
   * @param res_name.
   * @param language_code.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityRoleObjectDataList findByResourceName (String res_name, Integer language_code) throws BSDMResourceException;
  /**
   * Get security role list bound to a security resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param res_name.
   * @param language_code.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityRoleObjectDataList findByResourceName (BSDMSessionContext context, String res_name, Integer language_code) throws BSDMResourceException;


  /**
   * Get security role list bound to a security resource..
   * Convenience method using default BSDMSessionContext.
   * @param res_name.
   * @param language_code.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityRoleObjectDataList findByResourceName (String res_name, Integer language_code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get security role list bound to a security resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param res_name.
   * @param language_code.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityRoleObjectDataList findByResourceName (BSDMSessionContext context, String res_name, Integer language_code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Assign Security Roles to A Security Resource..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityRoleAssignIn Input List Object.
   * @param a_res_id.
   * @param a_user_name.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityRoleObjectDataList assign (SecurityRoleObjectData[] SecurityRoleAssignIn, BigInteger a_res_id, String a_user_name) throws BSDMResourceException;
  /**
   * Assign Security Roles to A Security Resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityRoleAssignIn Input List Object.
   * @param a_res_id.
   * @param a_user_name.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityRoleObjectDataList assign (BSDMSessionContext context, SecurityRoleObjectData[] SecurityRoleAssignIn, BigInteger a_res_id, String a_user_name) throws BSDMResourceException;


  /**
   * Assign Security Roles to A Security Resource..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityRoleAssignIn Input List Object.
   * @param a_res_id.
   * @param a_user_name.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityRoleObjectDataList assign (SecurityRoleObjectData[] SecurityRoleAssignIn, BigInteger a_res_id, String a_user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Assign Security Roles to A Security Resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityRoleAssignIn Input List Object.
   * @param a_res_id.
   * @param a_user_name.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityRoleObjectDataList assign (BSDMSessionContext context, SecurityRoleObjectData[] SecurityRoleAssignIn, BigInteger a_res_id, String a_user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Remove the bindings between Security Roles and A Security Resource..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityRoleUnassignIn Input List Object.
   * @param b_res_id.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityRoleObjectDataList unassign (SecurityRoleObjectData[] SecurityRoleUnassignIn, BigInteger b_res_id) throws BSDMResourceException;
  /**
   * Remove the bindings between Security Roles and A Security Resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityRoleUnassignIn Input List Object.
   * @param b_res_id.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SecurityRoleObjectDataList unassign (BSDMSessionContext context, SecurityRoleObjectData[] SecurityRoleUnassignIn, BigInteger b_res_id) throws BSDMResourceException;


  /**
   * Remove the bindings between Security Roles and A Security Resource..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityRoleUnassignIn Input List Object.
   * @param b_res_id.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SecurityRoleObjectDataList unassign (SecurityRoleObjectData[] SecurityRoleUnassignIn, BigInteger b_res_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Remove the bindings between Security Roles and A Security Resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityRoleUnassignIn Input List Object.
   * @param b_res_id.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SecurityRoleObjectDataList unassign (BSDMSessionContext context, SecurityRoleObjectData[] SecurityRoleUnassignIn, BigInteger b_res_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
