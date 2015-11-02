
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
public interface EarlyTerminationChargeInterface extends BaliInterface {

  /**
   * Returns a list of ETC quotes based on the specified parameters..
   * Convenience method using default BSDMSessionContext.
   * @param ETCQuoteRequest Input  Object.
   * @param RequestDate.
   * @return ETCQuoteResponseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ETCQuoteResponseObjectDataList quote (ETCQuoteRequestObjectData ETCQuoteRequest, Date RequestDate) throws BSDMResourceException;
  /**
   * Returns a list of ETC quotes based on the specified parameters..
   * @param context The session context to use when connecting to the APITS server.
   * @param ETCQuoteRequest Input  Object.
   * @param RequestDate.
   * @return ETCQuoteResponseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ETCQuoteResponseObjectDataList quote (BSDMSessionContext context, ETCQuoteRequestObjectData ETCQuoteRequest, Date RequestDate) throws BSDMResourceException;


  /**
   * Returns a list of ETC quotes based on the specified parameters..
   * Convenience method using default BSDMSessionContext.
   * @param ETCQuoteRequest Input  Object.
   * @param RequestDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ETCQuoteResponseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ETCQuoteResponseObjectDataList quote (ETCQuoteRequestObjectData ETCQuoteRequest, Date RequestDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns a list of ETC quotes based on the specified parameters..
   * @param context The session context to use when connecting to the APITS server.
   * @param ETCQuoteRequest Input  Object.
   * @param RequestDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ETCQuoteResponseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ETCQuoteResponseObjectDataList quote (BSDMSessionContext context, ETCQuoteRequestObjectData ETCQuoteRequest, Date RequestDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
