
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
public interface ServicePricingPlanInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param ServicePricingPlanGetIn Input Object Key.
   * @return ServicePricingPlanObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServicePricingPlanObjectData get (ServicePricingPlanObjectKeyData ServicePricingPlanGetIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param ServicePricingPlanGetIn Input Object Key.
   * @return ServicePricingPlanObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServicePricingPlanObjectData get (BSDMSessionContext context, ServicePricingPlanObjectKeyData ServicePricingPlanGetIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param ServicePricingPlanGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServicePricingPlanObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServicePricingPlanObjectData get (ServicePricingPlanObjectKeyData ServicePricingPlanGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param ServicePricingPlanGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServicePricingPlanObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServicePricingPlanObjectData get (BSDMSessionContext context, ServicePricingPlanObjectKeyData ServicePricingPlanGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param ServicePricingPlanFindIn Input Filter Object.
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServicePricingPlanObjectDataList find (ServicePricingPlanObjectFilter ServicePricingPlanFindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param ServicePricingPlanFindIn Input Filter Object.
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServicePricingPlanObjectDataList find (BSDMSessionContext context, ServicePricingPlanObjectFilter ServicePricingPlanFindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param ServicePricingPlanFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServicePricingPlanObjectDataList find (ServicePricingPlanObjectFilter ServicePricingPlanFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param ServicePricingPlanFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServicePricingPlanObjectDataList find (BSDMSessionContext context, ServicePricingPlanObjectFilter ServicePricingPlanFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param account_internal_id.
   * @param language_code.
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServicePricingPlanObjectDataList findByAccount (Integer account_internal_id, Integer language_code) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internal_id.
   * @param language_code.
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServicePricingPlanObjectDataList findByAccount (BSDMSessionContext context, Integer account_internal_id, Integer language_code) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param account_internal_id.
   * @param language_code.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServicePricingPlanObjectDataList findByAccount (Integer account_internal_id, Integer language_code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internal_id.
   * @param language_code.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServicePricingPlanObjectDataList findByAccount (BSDMSessionContext context, Integer account_internal_id, Integer language_code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param hierarchy_id.
   * @param _language_code.
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServicePricingPlanObjectDataList findByHierarchy (Integer hierarchy_id, Integer _language_code) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param hierarchy_id.
   * @param _language_code.
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServicePricingPlanObjectDataList findByHierarchy (BSDMSessionContext context, Integer hierarchy_id, Integer _language_code) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param hierarchy_id.
   * @param _language_code.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServicePricingPlanObjectDataList findByHierarchy (Integer hierarchy_id, Integer _language_code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param hierarchy_id.
   * @param _language_code.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServicePricingPlanObjectDataList findByHierarchy (BSDMSessionContext context, Integer hierarchy_id, Integer _language_code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
