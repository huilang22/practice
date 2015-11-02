
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
public interface RtPaymentResponseInterface extends BaliInterface {

  /**
   * Gets all RtPaymentResponse objects matching the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RPRGetIn Input  Object.
   * @return RtPaymentResponseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RtPaymentResponseObjectData get (RtPaymentResponseObjectData RPRGetIn) throws BSDMResourceException;
  /**
   * Gets all RtPaymentResponse objects matching the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RPRGetIn Input  Object.
   * @return RtPaymentResponseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RtPaymentResponseObjectData get (BSDMSessionContext context, RtPaymentResponseObjectData RPRGetIn) throws BSDMResourceException;


  /**
   * Gets all RtPaymentResponse objects matching the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RPRGetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RtPaymentResponseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RtPaymentResponseObjectData get (RtPaymentResponseObjectData RPRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets all RtPaymentResponse objects matching the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RPRGetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RtPaymentResponseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RtPaymentResponseObjectData get (BSDMSessionContext context, RtPaymentResponseObjectData RPRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds all RtPaymentResponse objects matching the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RPRFindIn Input Filter Object.
   * @return RtPaymentResponseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RtPaymentResponseObjectDataList find (RtPaymentResponseObjectFilter RPRFindIn) throws BSDMResourceException;
  /**
   * Finds all RtPaymentResponse objects matching the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RPRFindIn Input Filter Object.
   * @return RtPaymentResponseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RtPaymentResponseObjectDataList find (BSDMSessionContext context, RtPaymentResponseObjectFilter RPRFindIn) throws BSDMResourceException;


  /**
   * Finds all RtPaymentResponse objects matching the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RPRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RtPaymentResponseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RtPaymentResponseObjectDataList find (RtPaymentResponseObjectFilter RPRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds all RtPaymentResponse objects matching the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RPRFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RtPaymentResponseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RtPaymentResponseObjectDataList find (BSDMSessionContext context, RtPaymentResponseObjectFilter RPRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
