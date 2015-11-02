
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
public interface ProductChargeMapInterface extends BaliInterface {

  /**
   * Create a new ProductChargeMap..
   * Convenience method using default BSDMSessionContext.
   * @param PCMapCreateIn Input  Object.  Defaulted Fields: InArrearsOverride, ActivationCode, TerminationCode.  Derived Fields: ActiveDt.
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductChargeMapObjectData create (ProductChargeMapObjectData PCMapCreateIn) throws BSDMResourceException;
  /**
   * Create a new ProductChargeMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapCreateIn Input  Object.  Defaulted Fields: InArrearsOverride, ActivationCode, TerminationCode.  Derived Fields: ActiveDt.
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductChargeMapObjectData create (BSDMSessionContext context, ProductChargeMapObjectData PCMapCreateIn) throws BSDMResourceException;


  /**
   * Create a new ProductChargeMap..
   * Convenience method using default BSDMSessionContext.
   * @param PCMapCreateIn Input  Object.  Defaulted Fields: InArrearsOverride, ActivationCode, TerminationCode.  Derived Fields: ActiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductChargeMapObjectData create (ProductChargeMapObjectData PCMapCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new ProductChargeMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapCreateIn Input  Object.  Defaulted Fields: InArrearsOverride, ActivationCode, TerminationCode.  Derived Fields: ActiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductChargeMapObjectData create (BSDMSessionContext context, ProductChargeMapObjectData PCMapCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get a unique ProductChargeMap row..
   * Convenience method using default BSDMSessionContext.
   * @param PCMapGetIn Input Object Key.
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductChargeMapObjectData get (ProductChargeMapObjectKeyData PCMapGetIn) throws BSDMResourceException;
  /**
   * Get a unique ProductChargeMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapGetIn Input Object Key.
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductChargeMapObjectData get (BSDMSessionContext context, ProductChargeMapObjectKeyData PCMapGetIn) throws BSDMResourceException;


  /**
   * Get a unique ProductChargeMap row..
   * Convenience method using default BSDMSessionContext.
   * @param PCMapGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductChargeMapObjectData get (ProductChargeMapObjectKeyData PCMapGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique ProductChargeMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductChargeMapObjectData get (BSDMSessionContext context, ProductChargeMapObjectKeyData PCMapGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ProductChargeMap's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PCMapFindIn Input Filter Object.
   * @return ProductChargeMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductChargeMapObjectDataList find (ProductChargeMapObjectFilter PCMapFindIn) throws BSDMResourceException;
  /**
   * Find ProductChargeMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapFindIn Input Filter Object.
   * @return ProductChargeMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductChargeMapObjectDataList find (BSDMSessionContext context, ProductChargeMapObjectFilter PCMapFindIn) throws BSDMResourceException;


  /**
   * Find ProductChargeMap's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PCMapFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductChargeMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductChargeMapObjectDataList find (ProductChargeMapObjectFilter PCMapFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ProductChargeMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductChargeMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductChargeMapObjectDataList find (BSDMSessionContext context, ProductChargeMapObjectFilter PCMapFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a ProductChargeMap..
   * Convenience method using default BSDMSessionContext.
   * @param PCMapUpdateIn Input  Object.
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductChargeMapObjectData update (ProductChargeMapObjectData PCMapUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a ProductChargeMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapUpdateIn Input  Object.
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductChargeMapObjectData update (BSDMSessionContext context, ProductChargeMapObjectData PCMapUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a ProductChargeMap..
   * Convenience method using default BSDMSessionContext.
   * @param PCMapUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductChargeMapObjectData update (ProductChargeMapObjectData PCMapUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a ProductChargeMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCMapUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductChargeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductChargeMapObjectData update (BSDMSessionContext context, ProductChargeMapObjectData PCMapUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
