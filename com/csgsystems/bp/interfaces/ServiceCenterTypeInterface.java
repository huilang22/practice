
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
public interface ServiceCenterTypeInterface extends BaliInterface {

  /**
   * Get a unique ServiceCenterType..
   * Convenience method using default BSDMSessionContext.
   * @param SCTGetIn Input Object Key.
   * @return ServiceCenterTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterTypeObjectData get (ServiceCenterTypeObjectKeyData SCTGetIn) throws BSDMResourceException;
  /**
   * Get a unique ServiceCenterType..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCTGetIn Input Object Key.
   * @return ServiceCenterTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterTypeObjectData get (BSDMSessionContext context, ServiceCenterTypeObjectKeyData SCTGetIn) throws BSDMResourceException;


  /**
   * Get a unique ServiceCenterType..
   * Convenience method using default BSDMSessionContext.
   * @param SCTGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceCenterTypeObjectData get (ServiceCenterTypeObjectKeyData SCTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique ServiceCenterType..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCTGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceCenterTypeObjectData get (BSDMSessionContext context, ServiceCenterTypeObjectKeyData SCTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ServiceCenterType's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SCTFindIn Input Filter Object.
   * @return ServiceCenterTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterTypeObjectDataList find (ServiceCenterTypeObjectFilter SCTFindIn) throws BSDMResourceException;
  /**
   * Find ServiceCenterType's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCTFindIn Input Filter Object.
   * @return ServiceCenterTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceCenterTypeObjectDataList find (BSDMSessionContext context, ServiceCenterTypeObjectFilter SCTFindIn) throws BSDMResourceException;


  /**
   * Find ServiceCenterType's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SCTFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceCenterTypeObjectDataList find (ServiceCenterTypeObjectFilter SCTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ServiceCenterType's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCTFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceCenterTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceCenterTypeObjectDataList find (BSDMSessionContext context, ServiceCenterTypeObjectFilter SCTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
