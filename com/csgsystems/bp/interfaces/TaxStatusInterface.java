
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
public interface TaxStatusInterface extends BaliInterface {

  /**
   * Get a unique TaxStatus row..
   * Convenience method using default BSDMSessionContext.
   * @param TSGetIn Input Object Key.
   * @return TSObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TSObjectData get (TSObjectKeyData TSGetIn) throws BSDMResourceException;
  /**
   * Get a unique TaxStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSGetIn Input Object Key.
   * @return TSObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TSObjectData get (BSDMSessionContext context, TSObjectKeyData TSGetIn) throws BSDMResourceException;


  /**
   * Get a unique TaxStatus row..
   * Convenience method using default BSDMSessionContext.
   * @param TSGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TSObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TSObjectData get (TSObjectKeyData TSGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique TaxStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TSObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TSObjectData get (BSDMSessionContext context, TSObjectKeyData TSGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find TaxStatus rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TSFindIn Input Filter Object.
   * @return TSObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TSObjectDataList find (TSObjectFilter TSFindIn) throws BSDMResourceException;
  /**
   * Find TaxStatus rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSFindIn Input Filter Object.
   * @return TSObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TSObjectDataList find (BSDMSessionContext context, TSObjectFilter TSFindIn) throws BSDMResourceException;


  /**
   * Find TaxStatus rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TSFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TSObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TSObjectDataList find (TSObjectFilter TSFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find TaxStatus rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TSObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TSObjectDataList find (BSDMSessionContext context, TSObjectFilter TSFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
