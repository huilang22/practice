
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
public interface OverrideDiscountRateInterface extends BaliInterface {

  /**
   * Get a unique OverrideDiscountRate that matches the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param RDOGetIn Input Object Key.
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RDOverrideObjectData get (RDOverrideObjectKeyData RDOGetIn) throws BSDMResourceException;
  /**
   * Get a unique OverrideDiscountRate that matches the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOGetIn Input Object Key.
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RDOverrideObjectData get (BSDMSessionContext context, RDOverrideObjectKeyData RDOGetIn) throws BSDMResourceException;


  /**
   * Get a unique OverrideDiscountRate that matches the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param RDOGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RDOverrideObjectData get (RDOverrideObjectKeyData RDOGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique OverrideDiscountRate that matches the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RDOverrideObjectData get (BSDMSessionContext context, RDOverrideObjectKeyData RDOGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find OverrideDiscountRate's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RDOFindIn Input Filter Object.
   * @return RDOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RDOverrideObjectDataList find (RDOverrideObjectFilter RDOFindIn) throws BSDMResourceException;
  /**
   * Find OverrideDiscountRate's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOFindIn Input Filter Object.
   * @return RDOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RDOverrideObjectDataList find (BSDMSessionContext context, RDOverrideObjectFilter RDOFindIn) throws BSDMResourceException;


  /**
   * Find OverrideDiscountRate's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RDOFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RDOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RDOverrideObjectDataList find (RDOverrideObjectFilter RDOFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find OverrideDiscountRate's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RDOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RDOverrideObjectDataList find (BSDMSessionContext context, RDOverrideObjectFilter RDOFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of an OverrideDiscountRate object..
   * Convenience method using default BSDMSessionContext.
   * @param RDOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RDOverrideObjectData update (RDOverrideObjectData RDOUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of an OverrideDiscountRate object..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RDOverrideObjectData update (BSDMSessionContext context, RDOverrideObjectData RDOUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of an OverrideDiscountRate object..
   * Convenience method using default BSDMSessionContext.
   * @param RDOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RDOverrideObjectData update (RDOverrideObjectData RDOUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of an OverrideDiscountRate object..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RDOverrideObjectData update (BSDMSessionContext context, RDOverrideObjectData RDOUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new OverrideDiscountRate..
   * Convenience method using default BSDMSessionContext.
   * @param RDOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Defaulted Fields: CurrencyCode, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RDOverrideObjectData create (RDOverrideObjectData RDOCreateIn) throws BSDMResourceException;
  /**
   * Create a new OverrideDiscountRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Defaulted Fields: CurrencyCode, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RDOverrideObjectData create (BSDMSessionContext context, RDOverrideObjectData RDOCreateIn) throws BSDMResourceException;


  /**
   * Create a new OverrideDiscountRate..
   * Convenience method using default BSDMSessionContext.
   * @param RDOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Defaulted Fields: CurrencyCode, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RDOverrideObjectData create (RDOverrideObjectData RDOCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new OverrideDiscountRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param RDOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt.  Defaulted Fields: CurrencyCode, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RDOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RDOverrideObjectData create (BSDMSessionContext context, RDOverrideObjectData RDOCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
