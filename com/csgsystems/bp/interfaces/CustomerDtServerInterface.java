
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
public interface CustomerDtServerInterface extends BaliInterface {

  /**
   * Find Customer Document Server that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CusDocServerFindIn Input Filter Object.
   * @return CustomerDtServerObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDtServerObjectDataList find (CustomerDtServerObjectFilter CusDocServerFindIn) throws BSDMResourceException;
  /**
   * Find Customer Document Server that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CusDocServerFindIn Input Filter Object.
   * @return CustomerDtServerObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDtServerObjectDataList find (BSDMSessionContext context, CustomerDtServerObjectFilter CusDocServerFindIn) throws BSDMResourceException;


  /**
   * Find Customer Document Server that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CusDocServerFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDtServerObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CustomerDtServerObjectDataList find (CustomerDtServerObjectFilter CusDocServerFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Customer Document Server that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CusDocServerFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDtServerObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CustomerDtServerObjectDataList find (BSDMSessionContext context, CustomerDtServerObjectFilter CusDocServerFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
