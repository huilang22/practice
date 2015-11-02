
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
public interface AdjustmentTaxInterface extends BaliInterface {

  /**
   * Retrieve a unique AdjustmentTax row..
   * Convenience method using default BSDMSessionContext.
   * @param ATGetIn Input Object Key.
   * @return AdjustmentTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentTaxObjectData get (AdjustmentTaxObjectKeyData ATGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique AdjustmentTax row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ATGetIn Input Object Key.
   * @return AdjustmentTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentTaxObjectData get (BSDMSessionContext context, AdjustmentTaxObjectKeyData ATGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique AdjustmentTax row..
   * Convenience method using default BSDMSessionContext.
   * @param ATGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentTaxObjectData get (AdjustmentTaxObjectKeyData ATGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique AdjustmentTax row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ATGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentTaxObjectData get (BSDMSessionContext context, AdjustmentTaxObjectKeyData ATGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AdjustmentTax rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ATFindIn Input Filter Object.
   * @return AdjustmentTaxObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentTaxObjectDataList find (AdjustmentTaxObjectFilter ATFindIn) throws BSDMResourceException;
  /**
   * Find AdjustmentTax rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ATFindIn Input Filter Object.
   * @return AdjustmentTaxObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AdjustmentTaxObjectDataList find (BSDMSessionContext context, AdjustmentTaxObjectFilter ATFindIn) throws BSDMResourceException;


  /**
   * Find AdjustmentTax rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ATFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentTaxObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AdjustmentTaxObjectDataList find (AdjustmentTaxObjectFilter ATFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AdjustmentTax rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ATFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AdjustmentTaxObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AdjustmentTaxObjectDataList find (BSDMSessionContext context, AdjustmentTaxObjectFilter ATFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
