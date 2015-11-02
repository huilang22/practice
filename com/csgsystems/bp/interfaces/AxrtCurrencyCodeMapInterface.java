
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
public interface AxrtCurrencyCodeMapInterface extends BaliInterface {

  /**
   * Returns one AxrtCurrencyCodeMap object matching the supplied key value..
   * Convenience method using default BSDMSessionContext.
   * @param AxrtIsoCurrCodeMapIn Input Object Key.
   * @return AxrtCurrencyCodeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtCurrencyCodeMapObjectData get (AxrtCurrencyCodeMapObjectKeyData AxrtIsoCurrCodeMapIn) throws BSDMResourceException;
  /**
   * Returns one AxrtCurrencyCodeMap object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param AxrtIsoCurrCodeMapIn Input Object Key.
   * @return AxrtCurrencyCodeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtCurrencyCodeMapObjectData get (BSDMSessionContext context, AxrtCurrencyCodeMapObjectKeyData AxrtIsoCurrCodeMapIn) throws BSDMResourceException;


  /**
   * Returns one AxrtCurrencyCodeMap object matching the supplied key value..
   * Convenience method using default BSDMSessionContext.
   * @param AxrtIsoCurrCodeMapIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtCurrencyCodeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AxrtCurrencyCodeMapObjectData get (AxrtCurrencyCodeMapObjectKeyData AxrtIsoCurrCodeMapIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns one AxrtCurrencyCodeMap object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param AxrtIsoCurrCodeMapIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtCurrencyCodeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AxrtCurrencyCodeMapObjectData get (BSDMSessionContext context, AxrtCurrencyCodeMapObjectKeyData AxrtIsoCurrCodeMapIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
