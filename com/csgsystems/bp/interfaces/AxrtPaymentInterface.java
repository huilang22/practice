
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
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface AxrtPaymentInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param axrtPayUpdateIn Input  Object.
   * @return AxrtPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentObjectData update (AxrtPaymentObjectData axrtPayUpdateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtPayUpdateIn Input  Object.
   * @return AxrtPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentObjectData update (BSDMSessionContext context, AxrtPaymentObjectData axrtPayUpdateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param axrtPayUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AxrtPaymentObjectData update (AxrtPaymentObjectData axrtPayUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtPayUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AxrtPaymentObjectData update (BSDMSessionContext context, AxrtPaymentObjectData axrtPayUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
