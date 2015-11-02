
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
public interface AxrtCurrCodeMapInterface extends BaliInterface {

  /**
   * Returns one AxrtCurrCodeMap object matching the supplied key value..
   * Convenience method using default BSDMSessionContext.
   * @param AxrtIsoCurrCodeMapIn Input Object Key.
   * @return AxrtCurrCodeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtCurrCodeMapObjectData get (AxrtCurrCodeMapObjectKeyData AxrtIsoCurrCodeMapIn) throws BSDMResourceException;
  /**
   * Returns one AxrtCurrCodeMap object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param AxrtIsoCurrCodeMapIn Input Object Key.
   * @return AxrtCurrCodeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtCurrCodeMapObjectData get (BSDMSessionContext context, AxrtCurrCodeMapObjectKeyData AxrtIsoCurrCodeMapIn) throws BSDMResourceException;


  /**
   * Returns one AxrtCurrCodeMap object matching the supplied key value..
   * Convenience method using default BSDMSessionContext.
   * @param AxrtIsoCurrCodeMapIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtCurrCodeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AxrtCurrCodeMapObjectData get (AxrtCurrCodeMapObjectKeyData AxrtIsoCurrCodeMapIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns one AxrtCurrCodeMap object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param AxrtIsoCurrCodeMapIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtCurrCodeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AxrtCurrCodeMapObjectData get (BSDMSessionContext context, AxrtCurrCodeMapObjectKeyData AxrtIsoCurrCodeMapIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
