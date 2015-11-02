
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
public interface ServiceCenterInterface extends BaliInterface {

  /**
   * Retrieve a unique ServiceCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param SCGetIn Input Object Key.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterObjectData get (ServiceCenterObjectKeyData SCGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique ServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCGetIn Input Object Key.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterObjectData get (BSDMSessionContext context, ServiceCenterObjectKeyData SCGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique ServiceCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param SCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceCenterObjectData get (ServiceCenterObjectKeyData SCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique ServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceCenterObjectData get (BSDMSessionContext context, ServiceCenterObjectKeyData SCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ServiceCenter rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SCFindIn Input Filter Object.
   * @return ServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterObjectDataList find (ServiceCenterObjectFilter SCFindIn) throws BSDMResourceException;
  /**
   * Find ServiceCenter rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCFindIn Input Filter Object.
   * @return ServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterObjectDataList find (BSDMSessionContext context, ServiceCenterObjectFilter SCFindIn) throws BSDMResourceException;


  /**
   * Find ServiceCenter rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceCenterObjectDataList find (ServiceCenterObjectFilter SCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ServiceCenter rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceCenterObjectDataList find (BSDMSessionContext context, ServiceCenterObjectFilter SCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a ServiceCenter..
   * Convenience method using default BSDMSessionContext.
   * @param SCUpdateIn Input  Object.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterObjectData update (ServiceCenterObjectData SCUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a ServiceCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCUpdateIn Input  Object.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterObjectData update (BSDMSessionContext context, ServiceCenterObjectData SCUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a ServiceCenter..
   * Convenience method using default BSDMSessionContext.
   * @param SCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceCenterObjectData update (ServiceCenterObjectData SCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a ServiceCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceCenterObjectData update (BSDMSessionContext context, ServiceCenterObjectData SCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a ServiceCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param SCDeleteIn Input Object Key.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterObjectData delete (ServiceCenterObjectKeyData SCDeleteIn) throws BSDMResourceException;
  /**
   * Delete a ServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCDeleteIn Input Object Key.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterObjectData delete (BSDMSessionContext context, ServiceCenterObjectKeyData SCDeleteIn) throws BSDMResourceException;


  /**
   * Delete a ServiceCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param SCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceCenterObjectData delete (ServiceCenterObjectKeyData SCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a ServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceCenterObjectData delete (BSDMSessionContext context, ServiceCenterObjectKeyData SCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new ServiceCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param SCCreateIn Input  Object.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterObjectData create (ServiceCenterObjectData SCCreateIn) throws BSDMResourceException;
  /**
   * Create a new ServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCCreateIn Input  Object.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterObjectData create (BSDMSessionContext context, ServiceCenterObjectData SCCreateIn) throws BSDMResourceException;


  /**
   * Create a new ServiceCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param SCCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceCenterObjectData create (ServiceCenterObjectData SCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new ServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceCenterObjectData create (BSDMSessionContext context, ServiceCenterObjectData SCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
