
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
public interface CcAuditLogInterface extends BaliInterface {

  /**
   * 
         The CcAuditLogGet method retrieves one CcAuditLog row.
       .
   * Convenience method using default BSDMSessionContext.
   * @param CALget_In Input Object Key.
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CcAuditLogObjectData get (CcAuditLogObjectKeyData CALget_In) throws BSDMResourceException;
  /**
   * 
         The CcAuditLogGet method retrieves one CcAuditLog row.
       .
   * @param context The session context to use when connecting to the APITS server.
   * @param CALget_In Input Object Key.
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CcAuditLogObjectData get (BSDMSessionContext context, CcAuditLogObjectKeyData CALget_In) throws BSDMResourceException;


  /**
   * 
         The CcAuditLogGet method retrieves one CcAuditLog row.
       .
   * Convenience method using default BSDMSessionContext.
   * @param CALget_In Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CcAuditLogObjectData get (CcAuditLogObjectKeyData CALget_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * 
         The CcAuditLogGet method retrieves one CcAuditLog row.
       .
   * @param context The session context to use when connecting to the APITS server.
   * @param CALget_In Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CcAuditLogObjectData get (BSDMSessionContext context, CcAuditLogObjectKeyData CALget_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * 
        Finds all CcAuditLog objects matching the supplied filter.
      .
   * Convenience method using default BSDMSessionContext.
   * @param CALfind_In Input Filter Object.
   * @return CcAuditLogObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CcAuditLogObjectDataList find (CcAuditLogObjectFilter CALfind_In) throws BSDMResourceException;
  /**
   * 
        Finds all CcAuditLog objects matching the supplied filter.
      .
   * @param context The session context to use when connecting to the APITS server.
   * @param CALfind_In Input Filter Object.
   * @return CcAuditLogObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CcAuditLogObjectDataList find (BSDMSessionContext context, CcAuditLogObjectFilter CALfind_In) throws BSDMResourceException;


  /**
   * 
        Finds all CcAuditLog objects matching the supplied filter.
      .
   * Convenience method using default BSDMSessionContext.
   * @param CALfind_In Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CcAuditLogObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CcAuditLogObjectDataList find (CcAuditLogObjectFilter CALfind_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * 
        Finds all CcAuditLog objects matching the supplied filter.
      .
   * @param context The session context to use when connecting to the APITS server.
   * @param CALfind_In Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CcAuditLogObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CcAuditLogObjectDataList find (BSDMSessionContext context, CcAuditLogObjectFilter CALfind_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * 
        Insert a new row in CC_AUDIT_LOG.
      .
   * Convenience method using default BSDMSessionContext.
   * @param CALcreate_In Input  Object.
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CcAuditLogObjectData create (CcAuditLogObjectData CALcreate_In) throws BSDMResourceException;
  /**
   * 
        Insert a new row in CC_AUDIT_LOG.
      .
   * @param context The session context to use when connecting to the APITS server.
   * @param CALcreate_In Input  Object.
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CcAuditLogObjectData create (BSDMSessionContext context, CcAuditLogObjectData CALcreate_In) throws BSDMResourceException;


  /**
   * 
        Insert a new row in CC_AUDIT_LOG.
      .
   * Convenience method using default BSDMSessionContext.
   * @param CALcreate_In Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CcAuditLogObjectData create (CcAuditLogObjectData CALcreate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * 
        Insert a new row in CC_AUDIT_LOG.
      .
   * @param context The session context to use when connecting to the APITS server.
   * @param CALcreate_In Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CcAuditLogObjectData create (BSDMSessionContext context, CcAuditLogObjectData CALcreate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
