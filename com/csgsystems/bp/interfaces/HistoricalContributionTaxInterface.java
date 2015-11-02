
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
public interface HistoricalContributionTaxInterface extends BaliInterface {

  /**
   * Retrieve a unique HistoricalContributionTax row..
   * Convenience method using default BSDMSessionContext.
   * @param HCTGetIn Input Object Key.
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionTaxObjectData get (HistoricalContributionTaxObjectKeyData HCTGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique HistoricalContributionTax row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTGetIn Input Object Key.
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionTaxObjectData get (BSDMSessionContext context, HistoricalContributionTaxObjectKeyData HCTGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique HistoricalContributionTax row..
   * Convenience method using default BSDMSessionContext.
   * @param HCTGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HistoricalContributionTaxObjectData get (HistoricalContributionTaxObjectKeyData HCTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique HistoricalContributionTax row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HistoricalContributionTaxObjectData get (BSDMSessionContext context, HistoricalContributionTaxObjectKeyData HCTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find HistoricalContributionTax rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HCTFindIn Input Filter Object.
   * @return HistoricalContributionTaxObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionTaxObjectDataList find (HistoricalContributionTaxObjectFilter HCTFindIn) throws BSDMResourceException;
  /**
   * Find HistoricalContributionTax rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTFindIn Input Filter Object.
   * @return HistoricalContributionTaxObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionTaxObjectDataList find (BSDMSessionContext context, HistoricalContributionTaxObjectFilter HCTFindIn) throws BSDMResourceException;


  /**
   * Find HistoricalContributionTax rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HCTFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionTaxObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HistoricalContributionTaxObjectDataList find (HistoricalContributionTaxObjectFilter HCTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find HistoricalContributionTax rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionTaxObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HistoricalContributionTaxObjectDataList find (BSDMSessionContext context, HistoricalContributionTaxObjectFilter HCTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a HistoricalContributionTax..
   * Convenience method using default BSDMSessionContext.
   * @param HCTUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionTaxObjectData update (HistoricalContributionTaxObjectData HCTUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a HistoricalContributionTax..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionTaxObjectData update (BSDMSessionContext context, HistoricalContributionTaxObjectData HCTUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a HistoricalContributionTax..
   * Convenience method using default BSDMSessionContext.
   * @param HCTUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HistoricalContributionTaxObjectData update (HistoricalContributionTaxObjectData HCTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a HistoricalContributionTax..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HistoricalContributionTaxObjectData update (BSDMSessionContext context, HistoricalContributionTaxObjectData HCTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new HistoricalContributionTax row..
   * Convenience method using default BSDMSessionContext.
   * @param HCTCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionTaxObjectData create (HistoricalContributionTaxObjectData HCTCreateIn) throws BSDMResourceException;
  /**
   * Create a new HistoricalContributionTax row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalContributionTaxObjectData create (BSDMSessionContext context, HistoricalContributionTaxObjectData HCTCreateIn) throws BSDMResourceException;


  /**
   * Create a new HistoricalContributionTax row..
   * Convenience method using default BSDMSessionContext.
   * @param HCTCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HistoricalContributionTaxObjectData create (HistoricalContributionTaxObjectData HCTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new HistoricalContributionTax row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCTCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalContributionTaxObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HistoricalContributionTaxObjectData create (BSDMSessionContext context, HistoricalContributionTaxObjectData HCTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
