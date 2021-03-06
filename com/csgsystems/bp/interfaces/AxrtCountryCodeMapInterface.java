
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
public interface AxrtCountryCodeMapInterface extends BaliInterface {

  /**
   * Returns one AxrtCountryCodeMap object matching the supplied key value..
   * Convenience method using default BSDMSessionContext.
   * @param AxrtCountryCodeMapIn Input Object Key.
   * @return AxrtCountryCodeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtCountryCodeMapObjectData get (AxrtCountryCodeMapObjectKeyData AxrtCountryCodeMapIn) throws BSDMResourceException;
  /**
   * Returns one AxrtCountryCodeMap object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param AxrtCountryCodeMapIn Input Object Key.
   * @return AxrtCountryCodeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtCountryCodeMapObjectData get (BSDMSessionContext context, AxrtCountryCodeMapObjectKeyData AxrtCountryCodeMapIn) throws BSDMResourceException;


  /**
   * Returns one AxrtCountryCodeMap object matching the supplied key value..
   * Convenience method using default BSDMSessionContext.
   * @param AxrtCountryCodeMapIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtCountryCodeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AxrtCountryCodeMapObjectData get (AxrtCountryCodeMapObjectKeyData AxrtCountryCodeMapIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns one AxrtCountryCodeMap object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param AxrtCountryCodeMapIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtCountryCodeMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AxrtCountryCodeMapObjectData get (BSDMSessionContext context, AxrtCountryCodeMapObjectKeyData AxrtCountryCodeMapIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
