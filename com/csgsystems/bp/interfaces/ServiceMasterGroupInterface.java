
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
public interface ServiceMasterGroupInterface extends BaliInterface {

  /**
   * Get a unique ServiceMasterGroup..
   * Convenience method using default BSDMSessionContext.
   * @param EMGgetIn Input Object Key.
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceMasterGroupObjectData get (ServiceMasterGroupObjectKeyData EMGgetIn) throws BSDMResourceException;
  /**
   * Get a unique ServiceMasterGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGgetIn Input Object Key.
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceMasterGroupObjectData get (BSDMSessionContext context, ServiceMasterGroupObjectKeyData EMGgetIn) throws BSDMResourceException;


  /**
   * Get a unique ServiceMasterGroup..
   * Convenience method using default BSDMSessionContext.
   * @param EMGgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceMasterGroupObjectData get (ServiceMasterGroupObjectKeyData EMGgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique ServiceMasterGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceMasterGroupObjectData get (BSDMSessionContext context, ServiceMasterGroupObjectKeyData EMGgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ServiceMasterGroup's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param EMGfindIn Input Filter Object.
   * @return ServiceMasterGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceMasterGroupObjectDataList find (ServiceMasterGroupObjectFilter EMGfindIn) throws BSDMResourceException;
  /**
   * Find ServiceMasterGroup's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGfindIn Input Filter Object.
   * @return ServiceMasterGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceMasterGroupObjectDataList find (BSDMSessionContext context, ServiceMasterGroupObjectFilter EMGfindIn) throws BSDMResourceException;


  /**
   * Find ServiceMasterGroup's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param EMGfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceMasterGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceMasterGroupObjectDataList find (ServiceMasterGroupObjectFilter EMGfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ServiceMasterGroup's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceMasterGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceMasterGroupObjectDataList find (BSDMSessionContext context, ServiceMasterGroupObjectFilter EMGfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new ServiceMasterGroup..
   * Convenience method using default BSDMSessionContext.
   * @param EMGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.  Derived Fields: CreateDt.
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceMasterGroupObjectData create (ServiceMasterGroupObjectData EMGcreateIn) throws BSDMResourceException;
  /**
   * Create a new ServiceMasterGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.  Derived Fields: CreateDt.
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceMasterGroupObjectData create (BSDMSessionContext context, ServiceMasterGroupObjectData EMGcreateIn) throws BSDMResourceException;


  /**
   * Create a new ServiceMasterGroup..
   * Convenience method using default BSDMSessionContext.
   * @param EMGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.  Derived Fields: CreateDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceMasterGroupObjectData create (ServiceMasterGroupObjectData EMGcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new ServiceMasterGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.  Derived Fields: CreateDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceMasterGroupObjectData create (BSDMSessionContext context, ServiceMasterGroupObjectData EMGcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of a ServiceMasterGroup..
   * Convenience method using default BSDMSessionContext.
   * @param EMGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceMasterGroupObjectData update (ServiceMasterGroupObjectData EMGupdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of a ServiceMasterGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceMasterGroupObjectData update (BSDMSessionContext context, ServiceMasterGroupObjectData EMGupdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of a ServiceMasterGroup..
   * Convenience method using default BSDMSessionContext.
   * @param EMGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceMasterGroupObjectData update (ServiceMasterGroupObjectData EMGupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of a ServiceMasterGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceMasterGroupObjectData update (BSDMSessionContext context, ServiceMasterGroupObjectData EMGupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
