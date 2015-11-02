
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
public interface PrepaymentDistributionInterface extends BaliInterface {

  /**
   * Retrieve a unique PrepaymentDistribution row..
   * Convenience method using default BSDMSessionContext.
   * @param PDGetIn Input Object Key.
   * @return PrepaymentDistributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentDistributionObjectData get (PrepaymentDistributionObjectKeyData PDGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique PrepaymentDistribution row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDGetIn Input Object Key.
   * @return PrepaymentDistributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentDistributionObjectData get (BSDMSessionContext context, PrepaymentDistributionObjectKeyData PDGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique PrepaymentDistribution row..
   * Convenience method using default BSDMSessionContext.
   * @param PDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentDistributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PrepaymentDistributionObjectData get (PrepaymentDistributionObjectKeyData PDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique PrepaymentDistribution row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentDistributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PrepaymentDistributionObjectData get (BSDMSessionContext context, PrepaymentDistributionObjectKeyData PDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find PrepaymentDistribution rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PDFindIn Input Filter Object.
   * @return PrepaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentDistributionObjectDataList find (PrepaymentDistributionObjectFilter PDFindIn) throws BSDMResourceException;
  /**
   * Find PrepaymentDistribution rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDFindIn Input Filter Object.
   * @return PrepaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PrepaymentDistributionObjectDataList find (BSDMSessionContext context, PrepaymentDistributionObjectFilter PDFindIn) throws BSDMResourceException;


  /**
   * Find PrepaymentDistribution rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PrepaymentDistributionObjectDataList find (PrepaymentDistributionObjectFilter PDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find PrepaymentDistribution rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PrepaymentDistributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PrepaymentDistributionObjectDataList find (BSDMSessionContext context, PrepaymentDistributionObjectFilter PDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
