
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
public interface HistoricalThresholdsInterface extends BaliInterface {

  /**
   * Retrieve a unique HistoricalThresholds row..
   * Convenience method using default BSDMSessionContext.
   * @param HTGetIn Input Object Key.
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalThresholdsObjectData get (HistoricalThresholdsObjectKeyData HTGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique HistoricalThresholds row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTGetIn Input Object Key.
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalThresholdsObjectData get (BSDMSessionContext context, HistoricalThresholdsObjectKeyData HTGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique HistoricalThresholds row..
   * Convenience method using default BSDMSessionContext.
   * @param HTGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HistoricalThresholdsObjectData get (HistoricalThresholdsObjectKeyData HTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique HistoricalThresholds row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HistoricalThresholdsObjectData get (BSDMSessionContext context, HistoricalThresholdsObjectKeyData HTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find HistoricalThresholds rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HTFindIn Input Filter Object.
   * @return HistoricalThresholdsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalThresholdsObjectDataList find (HistoricalThresholdsObjectFilter HTFindIn) throws BSDMResourceException;
  /**
   * Find HistoricalThresholds rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTFindIn Input Filter Object.
   * @return HistoricalThresholdsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalThresholdsObjectDataList find (BSDMSessionContext context, HistoricalThresholdsObjectFilter HTFindIn) throws BSDMResourceException;


  /**
   * Find HistoricalThresholds rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HTFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalThresholdsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HistoricalThresholdsObjectDataList find (HistoricalThresholdsObjectFilter HTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find HistoricalThresholds rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalThresholdsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HistoricalThresholdsObjectDataList find (BSDMSessionContext context, HistoricalThresholdsObjectFilter HTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a HistoricalThresholds..
   * Convenience method using default BSDMSessionContext.
   * @param HTUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalThresholdsObjectData update (HistoricalThresholdsObjectData HTUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a HistoricalThresholds..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalThresholdsObjectData update (BSDMSessionContext context, HistoricalThresholdsObjectData HTUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a HistoricalThresholds..
   * Convenience method using default BSDMSessionContext.
   * @param HTUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HistoricalThresholdsObjectData update (HistoricalThresholdsObjectData HTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a HistoricalThresholds..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HistoricalThresholdsObjectData update (BSDMSessionContext context, HistoricalThresholdsObjectData HTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a HistoricalThresholds row..
   * Convenience method using default BSDMSessionContext.
   * @param HTDeleteIn Input Object Key.
   * @param inactive_date (has a default).
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalThresholdsObjectData delete (HistoricalThresholdsObjectKeyData HTDeleteIn, Date inactive_date) throws BSDMResourceException;
  /**
   * Delete a HistoricalThresholds row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTDeleteIn Input Object Key.
   * @param inactive_date (has a default).
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalThresholdsObjectData delete (BSDMSessionContext context, HistoricalThresholdsObjectKeyData HTDeleteIn, Date inactive_date) throws BSDMResourceException;


  /**
   * Delete a HistoricalThresholds row..
   * Convenience method using default BSDMSessionContext.
   * @param HTDeleteIn Input Object Key.
   * @param inactive_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HistoricalThresholdsObjectData delete (HistoricalThresholdsObjectKeyData HTDeleteIn, Date inactive_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a HistoricalThresholds row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTDeleteIn Input Object Key.
   * @param inactive_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HistoricalThresholdsObjectData delete (BSDMSessionContext context, HistoricalThresholdsObjectKeyData HTDeleteIn, Date inactive_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete all HistoricalThresholds row that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HTDeleteLIn Input Filter Object.
   * @param InactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (HistoricalThresholdsObjectFilter HTDeleteLIn, Date InactiveDate) throws BSDMResourceException;
  /**
   * Delete all HistoricalThresholds row that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTDeleteLIn Input Filter Object.
   * @param InactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, HistoricalThresholdsObjectFilter HTDeleteLIn, Date InactiveDate) throws BSDMResourceException;


  /**
   * Delete all HistoricalThresholds row that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HTDeleteLIn Input Filter Object.
   * @param InactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (HistoricalThresholdsObjectFilter HTDeleteLIn, Date InactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete all HistoricalThresholds row that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTDeleteLIn Input Filter Object.
   * @param InactiveDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, HistoricalThresholdsObjectFilter HTDeleteLIn, Date InactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new HistoricalThresholds row..
   * Convenience method using default BSDMSessionContext.
   * @param HTCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho, ThresholdTrackingId, ThresholdTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: ThresholdTrackingId, ThresholdTrackingIdServ, ChgDt, ChgWho.
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalThresholdsObjectData create (HistoricalThresholdsObjectData HTCreateIn) throws BSDMResourceException;
  /**
   * Create a new HistoricalThresholds row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho, ThresholdTrackingId, ThresholdTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: ThresholdTrackingId, ThresholdTrackingIdServ, ChgDt, ChgWho.
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HistoricalThresholdsObjectData create (BSDMSessionContext context, HistoricalThresholdsObjectData HTCreateIn) throws BSDMResourceException;


  /**
   * Create a new HistoricalThresholds row..
   * Convenience method using default BSDMSessionContext.
   * @param HTCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho, ThresholdTrackingId, ThresholdTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: ThresholdTrackingId, ThresholdTrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HistoricalThresholdsObjectData create (HistoricalThresholdsObjectData HTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new HistoricalThresholds row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho, ThresholdTrackingId, ThresholdTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: ThresholdTrackingId, ThresholdTrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HistoricalThresholdsObjectData create (BSDMSessionContext context, HistoricalThresholdsObjectData HTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
