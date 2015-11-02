
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
public interface ContractDiscountInterface extends BaliInterface {

  /**
   * Get a unique ContractDiscount..
   * Convenience method using default BSDMSessionContext.
   * @param CDGetIn Input Object Key.
   * @return ContractDiscountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContractDiscountObjectData get (ContractDiscountObjectKeyData CDGetIn) throws BSDMResourceException;
  /**
   * Get a unique ContractDiscount..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDGetIn Input Object Key.
   * @return ContractDiscountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContractDiscountObjectData get (BSDMSessionContext context, ContractDiscountObjectKeyData CDGetIn) throws BSDMResourceException;


  /**
   * Get a unique ContractDiscount..
   * Convenience method using default BSDMSessionContext.
   * @param CDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContractDiscountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ContractDiscountObjectData get (ContractDiscountObjectKeyData CDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique ContractDiscount..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContractDiscountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ContractDiscountObjectData get (BSDMSessionContext context, ContractDiscountObjectKeyData CDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ContractDiscount's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CDFindIn Input Filter Object.
   * @return ContractDiscountObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContractDiscountObjectDataList find (ContractDiscountObjectFilter CDFindIn) throws BSDMResourceException;
  /**
   * Find ContractDiscount's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDFindIn Input Filter Object.
   * @return ContractDiscountObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContractDiscountObjectDataList find (BSDMSessionContext context, ContractDiscountObjectFilter CDFindIn) throws BSDMResourceException;


  /**
   * Find ContractDiscount's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContractDiscountObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ContractDiscountObjectDataList find (ContractDiscountObjectFilter CDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ContractDiscount's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContractDiscountObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ContractDiscountObjectDataList find (BSDMSessionContext context, ContractDiscountObjectFilter CDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
