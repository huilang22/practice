
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
public interface CustomerDtUrlInterface extends BaliInterface {

  /**
   * Find Customer Document URL that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDtUrlFindIn Input Filter Object.
   * @return CustomerDtUrlObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDtUrlObjectDataList find (CustomerDtUrlInputObjectFilter CustomerDtUrlFindIn) throws BSDMResourceException;
  /**
   * Find Customer Document URL that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDtUrlFindIn Input Filter Object.
   * @return CustomerDtUrlObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDtUrlObjectDataList find (BSDMSessionContext context, CustomerDtUrlInputObjectFilter CustomerDtUrlFindIn) throws BSDMResourceException;


  /**
   * Find Customer Document URL that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDtUrlFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDtUrlObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CustomerDtUrlObjectDataList find (CustomerDtUrlInputObjectFilter CustomerDtUrlFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Customer Document URL that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDtUrlFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDtUrlObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CustomerDtUrlObjectDataList find (BSDMSessionContext context, CustomerDtUrlInputObjectFilter CustomerDtUrlFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get Customer Document URL that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param DocumentId.
   * @return CustomerDtUrlObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDtUrlObjectData get (Integer DocumentId) throws BSDMResourceException;
  /**
   * Get Customer Document URL that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param DocumentId.
   * @return CustomerDtUrlObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDtUrlObjectData get (BSDMSessionContext context, Integer DocumentId) throws BSDMResourceException;


  /**
   * Get Customer Document URL that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param DocumentId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDtUrlObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CustomerDtUrlObjectData get (Integer DocumentId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get Customer Document URL that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param DocumentId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDtUrlObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CustomerDtUrlObjectData get (BSDMSessionContext context, Integer DocumentId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
