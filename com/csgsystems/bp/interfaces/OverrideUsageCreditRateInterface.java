
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
public interface OverrideUsageCreditRateInterface extends BaliInterface {

  /**
   * Get a unique OverrideUsageCreditRate..
   * Convenience method using default BSDMSessionContext.
   * @param fRUCOGetIn Input Object Key.
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RUCOverrideObjectData get (RUCBaseOverrideObjectKeyData fRUCOGetIn) throws BSDMResourceException;
  /**
   * Get a unique OverrideUsageCreditRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param fRUCOGetIn Input Object Key.
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RUCOverrideObjectData get (BSDMSessionContext context, RUCBaseOverrideObjectKeyData fRUCOGetIn) throws BSDMResourceException;


  /**
   * Get a unique OverrideUsageCreditRate..
   * Convenience method using default BSDMSessionContext.
   * @param fRUCOGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RUCOverrideObjectData get (RUCBaseOverrideObjectKeyData fRUCOGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique OverrideUsageCreditRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param fRUCOGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RUCOverrideObjectData get (BSDMSessionContext context, RUCBaseOverrideObjectKeyData fRUCOGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find OverrideUsageCreditRate's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param iRUCOFindIn Input Filter Object.
   * @return RUCOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RUCOverrideObjectDataList find (RUCOverrideObjectFilter iRUCOFindIn) throws BSDMResourceException;
  /**
   * Find OverrideUsageCreditRate's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param iRUCOFindIn Input Filter Object.
   * @return RUCOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RUCOverrideObjectDataList find (BSDMSessionContext context, RUCOverrideObjectFilter iRUCOFindIn) throws BSDMResourceException;


  /**
   * Find OverrideUsageCreditRate's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param iRUCOFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RUCOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RUCOverrideObjectDataList find (RUCOverrideObjectFilter iRUCOFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find OverrideUsageCreditRate's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param iRUCOFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RUCOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RUCOverrideObjectDataList find (BSDMSessionContext context, RUCOverrideObjectFilter iRUCOFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of an OverrideUsageCreditRate row..
   * Convenience method using default BSDMSessionContext.
   * @param iRUCOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Derived Fields: ChgDt, ChgWho.
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RUCOverrideObjectData update (RUCOverrideObjectData iRUCOUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of an OverrideUsageCreditRate row..
   * @param context The session context to use when connecting to the APITS server.
   * @param iRUCOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Derived Fields: ChgDt, ChgWho.
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RUCOverrideObjectData update (BSDMSessionContext context, RUCOverrideObjectData iRUCOUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of an OverrideUsageCreditRate row..
   * Convenience method using default BSDMSessionContext.
   * @param iRUCOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RUCOverrideObjectData update (RUCOverrideObjectData iRUCOUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of an OverrideUsageCreditRate row..
   * @param context The session context to use when connecting to the APITS server.
   * @param iRUCOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RUCOverrideObjectData update (BSDMSessionContext context, RUCOverrideObjectData iRUCOUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new OverrideUsageCreditRate..
   * Convenience method using default BSDMSessionContext.
   * @param iRUCOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Defaulted Fields: UnitsFree, CurrencyCode, AmountFree, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RUCOverrideObjectData create (RUCOverrideObjectData iRUCOCreateIn) throws BSDMResourceException;
  /**
   * Create a new OverrideUsageCreditRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param iRUCOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Defaulted Fields: UnitsFree, CurrencyCode, AmountFree, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RUCOverrideObjectData create (BSDMSessionContext context, RUCOverrideObjectData iRUCOCreateIn) throws BSDMResourceException;


  /**
   * Create a new OverrideUsageCreditRate..
   * Convenience method using default BSDMSessionContext.
   * @param iRUCOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Defaulted Fields: UnitsFree, CurrencyCode, AmountFree, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RUCOverrideObjectData create (RUCOverrideObjectData iRUCOCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new OverrideUsageCreditRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param iRUCOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Defaulted Fields: UnitsFree, CurrencyCode, AmountFree, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RUCOverrideObjectData create (BSDMSessionContext context, RUCOverrideObjectData iRUCOCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
