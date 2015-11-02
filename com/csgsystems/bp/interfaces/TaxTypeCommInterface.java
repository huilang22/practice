
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
public interface TaxTypeCommInterface extends BaliInterface {

  /**
   * Get a unique TaxTypeComm..
   * Convenience method using default BSDMSessionContext.
   * @param TTCGetIn Input Object Key.
   * @return TTCObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TTCObjectData get (TTCObjectKeyData TTCGetIn) throws BSDMResourceException;
  /**
   * Get a unique TaxTypeComm..
   * @param context The session context to use when connecting to the APITS server.
   * @param TTCGetIn Input Object Key.
   * @return TTCObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TTCObjectData get (BSDMSessionContext context, TTCObjectKeyData TTCGetIn) throws BSDMResourceException;


  /**
   * Get a unique TaxTypeComm..
   * Convenience method using default BSDMSessionContext.
   * @param TTCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TTCObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TTCObjectData get (TTCObjectKeyData TTCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique TaxTypeComm..
   * @param context The session context to use when connecting to the APITS server.
   * @param TTCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TTCObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TTCObjectData get (BSDMSessionContext context, TTCObjectKeyData TTCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find TaxTypeComm's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TTCFindIn Input Filter Object.
   * @return TTCObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TTCObjectDataList find (TTCObjectFilter TTCFindIn) throws BSDMResourceException;
  /**
   * Find TaxTypeComm's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TTCFindIn Input Filter Object.
   * @return TTCObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TTCObjectDataList find (BSDMSessionContext context, TTCObjectFilter TTCFindIn) throws BSDMResourceException;


  /**
   * Find TaxTypeComm's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TTCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TTCObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TTCObjectDataList find (TTCObjectFilter TTCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find TaxTypeComm's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TTCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TTCObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TTCObjectDataList find (BSDMSessionContext context, TTCObjectFilter TTCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
