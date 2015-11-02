
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
public interface ProductRateOverrideInterface extends BaliInterface {

  /**
   * Create a new ProductRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param PROCreateIn Input  Object.  Defaulted Fields: ActiveDt.
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateOverrideObjectData create (ProductRateOverrideObjectData PROCreateIn) throws BSDMResourceException;
  /**
   * Create a new ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROCreateIn Input  Object.  Defaulted Fields: ActiveDt.
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateOverrideObjectData create (BSDMSessionContext context, ProductRateOverrideObjectData PROCreateIn) throws BSDMResourceException;


  /**
   * Create a new ProductRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param PROCreateIn Input  Object.  Defaulted Fields: ActiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductRateOverrideObjectData create (ProductRateOverrideObjectData PROCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROCreateIn Input  Object.  Defaulted Fields: ActiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductRateOverrideObjectData create (BSDMSessionContext context, ProductRateOverrideObjectData PROCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of a ProductRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param PROUpdateIn Input  Object.  Read-Only fields: InactiveDt.
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateOverrideObjectData update (ProductRateOverrideObjectData PROUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of a ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROUpdateIn Input  Object.  Read-Only fields: InactiveDt.
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateOverrideObjectData update (BSDMSessionContext context, ProductRateOverrideObjectData PROUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of a ProductRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param PROUpdateIn Input  Object.  Read-Only fields: InactiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductRateOverrideObjectData update (ProductRateOverrideObjectData PROUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of a ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROUpdateIn Input  Object.  Read-Only fields: InactiveDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductRateOverrideObjectData update (BSDMSessionContext context, ProductRateOverrideObjectData PROUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Retrieve a unique ProductRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param PROGetIn Input Object Key.
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateOverrideObjectData get (ProductRateOverrideObjectKeyData PROGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROGetIn Input Object Key.
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateOverrideObjectData get (BSDMSessionContext context, ProductRateOverrideObjectKeyData PROGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique ProductRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param PROGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductRateOverrideObjectData get (ProductRateOverrideObjectKeyData PROGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductRateOverrideObjectData get (BSDMSessionContext context, ProductRateOverrideObjectKeyData PROGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ProductRateOverride's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PROFindIn Input Filter Object.
   * @return ProductRateOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateOverrideObjectDataList find (ProductRateOverrideObjectFilter PROFindIn) throws BSDMResourceException;
  /**
   * Find ProductRateOverride's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROFindIn Input Filter Object.
   * @return ProductRateOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateOverrideObjectDataList find (BSDMSessionContext context, ProductRateOverrideObjectFilter PROFindIn) throws BSDMResourceException;


  /**
   * Find ProductRateOverride's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PROFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductRateOverrideObjectDataList find (ProductRateOverrideObjectFilter PROFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ProductRateOverride's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductRateOverrideObjectDataList find (BSDMSessionContext context, ProductRateOverrideObjectFilter PROFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease a ProductRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param PRODeleteIn Input Object Key.
   * @param PRODCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void delete (ProductRateOverrideObjectKeyData PRODeleteIn, Date PRODCeaseDate) throws BSDMResourceException;
  /**
   * Cease a ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRODeleteIn Input Object Key.
   * @param PRODCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void delete (BSDMSessionContext context, ProductRateOverrideObjectKeyData PRODeleteIn, Date PRODCeaseDate) throws BSDMResourceException;


  /**
   * Cease a ProductRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param PRODeleteIn Input Object Key.
   * @param PRODCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void delete (ProductRateOverrideObjectKeyData PRODeleteIn, Date PRODCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease a ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRODeleteIn Input Object Key.
   * @param PRODCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void delete (BSDMSessionContext context, ProductRateOverrideObjectKeyData PRODeleteIn, Date PRODCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease the ProductRateOverrides that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ProductRateOverrideFilter Input Filter Object.
   * @param PRODLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (ProductRateOverrideObjectFilter ProductRateOverrideFilter, Date PRODLCeaseDate) throws BSDMResourceException;
  /**
   * Cease the ProductRateOverrides that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ProductRateOverrideFilter Input Filter Object.
   * @param PRODLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, ProductRateOverrideObjectFilter ProductRateOverrideFilter, Date PRODLCeaseDate) throws BSDMResourceException;


  /**
   * Cease the ProductRateOverrides that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ProductRateOverrideFilter Input Filter Object.
   * @param PRODLCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (ProductRateOverrideObjectFilter ProductRateOverrideFilter, Date PRODLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease the ProductRateOverrides that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ProductRateOverrideFilter Input Filter Object.
   * @param PRODLCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, ProductRateOverrideObjectFilter ProductRateOverrideFilter, Date PRODLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
