
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
public interface TaxRatesVatInterface extends BaliInterface {

  /**
   * Get a unique TaxRatesVat row..
   * Convenience method using default BSDMSessionContext.
   * @param TRVgetIn Input Object Key.
   * @return TaxRatesVatObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxRatesVatObjectData get (TaxRatesVatObjectKeyData TRVgetIn) throws BSDMResourceException;
  /**
   * Get a unique TaxRatesVat row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TRVgetIn Input Object Key.
   * @return TaxRatesVatObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxRatesVatObjectData get (BSDMSessionContext context, TaxRatesVatObjectKeyData TRVgetIn) throws BSDMResourceException;


  /**
   * Get a unique TaxRatesVat row..
   * Convenience method using default BSDMSessionContext.
   * @param TRVgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxRatesVatObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TaxRatesVatObjectData get (TaxRatesVatObjectKeyData TRVgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique TaxRatesVat row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TRVgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxRatesVatObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TaxRatesVatObjectData get (BSDMSessionContext context, TaxRatesVatObjectKeyData TRVgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find TaxRatesVat's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TRVfindIn Input Filter Object.
   * @return TaxRatesVatObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxRatesVatObjectDataList find (TaxRatesVatObjectFilter TRVfindIn) throws BSDMResourceException;
  /**
   * Find TaxRatesVat's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TRVfindIn Input Filter Object.
   * @return TaxRatesVatObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxRatesVatObjectDataList find (BSDMSessionContext context, TaxRatesVatObjectFilter TRVfindIn) throws BSDMResourceException;


  /**
   * Find TaxRatesVat's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TRVfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxRatesVatObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TaxRatesVatObjectDataList find (TaxRatesVatObjectFilter TRVfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find TaxRatesVat's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TRVfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxRatesVatObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TaxRatesVatObjectDataList find (BSDMSessionContext context, TaxRatesVatObjectFilter TRVfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
