
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
public interface ServiceZoneInterface extends BaliInterface {

  /**
   * Get a unique ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZGetIn Input Object Key.
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceZoneObjectData get (ServiceZoneObjectKeyData SZGetIn) throws BSDMResourceException;
  /**
   * Get a unique ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZGetIn Input Object Key.
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceZoneObjectData get (BSDMSessionContext context, ServiceZoneObjectKeyData SZGetIn) throws BSDMResourceException;


  /**
   * Get a unique ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceZoneObjectData get (ServiceZoneObjectKeyData SZGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceZoneObjectData get (BSDMSessionContext context, ServiceZoneObjectKeyData SZGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ.
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceZoneObjectData create (ServiceZoneObjectData SZCreateIn) throws BSDMResourceException;
  /**
   * Create a new ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ.
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceZoneObjectData create (BSDMSessionContext context, ServiceZoneObjectData SZCreateIn) throws BSDMResourceException;


  /**
   * Create a new ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceZoneObjectData create (ServiceZoneObjectData SZCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceZoneObjectData create (BSDMSessionContext context, ServiceZoneObjectData SZCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of a ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZUpdateIn Input  Object.
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceZoneObjectData update (ServiceZoneObjectData SZUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of a ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZUpdateIn Input  Object.
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceZoneObjectData update (BSDMSessionContext context, ServiceZoneObjectData SZUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of a ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceZoneObjectData update (ServiceZoneObjectData SZUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of a ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceZoneObjectData update (BSDMSessionContext context, ServiceZoneObjectData SZUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ServiceZone's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SZFindIn Input Filter Object.
   * @return ServiceZoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceZoneObjectDataList find (ServiceZoneObjectFilter SZFindIn) throws BSDMResourceException;
  /**
   * Find ServiceZone's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZFindIn Input Filter Object.
   * @return ServiceZoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceZoneObjectDataList find (BSDMSessionContext context, ServiceZoneObjectFilter SZFindIn) throws BSDMResourceException;


  /**
   * Find ServiceZone's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SZFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceZoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceZoneObjectDataList find (ServiceZoneObjectFilter SZFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ServiceZone's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceZoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceZoneObjectDataList find (BSDMSessionContext context, ServiceZoneObjectFilter SZFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease a ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZDeleteIn Input Object Key.
   * @param SZDCeaseDate (has a default).
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceZoneObjectData delete (ServiceZoneObjectKeyData SZDeleteIn, Date SZDCeaseDate) throws BSDMResourceException;
  /**
   * Cease a ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZDeleteIn Input Object Key.
   * @param SZDCeaseDate (has a default).
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceZoneObjectData delete (BSDMSessionContext context, ServiceZoneObjectKeyData SZDeleteIn, Date SZDCeaseDate) throws BSDMResourceException;


  /**
   * Cease a ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZDeleteIn Input Object Key.
   * @param SZDCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceZoneObjectData delete (ServiceZoneObjectKeyData SZDeleteIn, Date SZDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease a ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZDeleteIn Input Object Key.
   * @param SZDCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceZoneObjectData delete (BSDMSessionContext context, ServiceZoneObjectKeyData SZDeleteIn, Date SZDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease the ServiceZone's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ServiceZoneFilter Input Filter Object.  Read-Only fields: ServiceExternalId, ServiceExternalIdType.
   * @param SZDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (ServiceZoneObjectFilter ServiceZoneFilter, Date SZDLCeaseDate) throws BSDMResourceException;
  /**
   * Cease the ServiceZone's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ServiceZoneFilter Input Filter Object.  Read-Only fields: ServiceExternalId, ServiceExternalIdType.
   * @param SZDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, ServiceZoneObjectFilter ServiceZoneFilter, Date SZDLCeaseDate) throws BSDMResourceException;


  /**
   * Cease the ServiceZone's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ServiceZoneFilter Input Filter Object.  Read-Only fields: ServiceExternalId, ServiceExternalIdType.
   * @param SZDLCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (ServiceZoneObjectFilter ServiceZoneFilter, Date SZDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease the ServiceZone's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ServiceZoneFilter Input Filter Object.  Read-Only fields: ServiceExternalId, ServiceExternalIdType.
   * @param SZDLCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, ServiceZoneObjectFilter ServiceZoneFilter, Date SZDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cancel a ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ActiveDt, InactiveDt, ZoneId, ElementId, ServiceExternalId, ServiceExternalIdType.
   * @param SZCCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void cancel (ServiceZoneObjectData SZCancelIn, Date SZCCeaseDate) throws BSDMResourceException;
  /**
   * Cancel a ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ActiveDt, InactiveDt, ZoneId, ElementId, ServiceExternalId, ServiceExternalIdType.
   * @param SZCCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void cancel (BSDMSessionContext context, ServiceZoneObjectData SZCancelIn, Date SZCCeaseDate) throws BSDMResourceException;


  /**
   * Cancel a ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ActiveDt, InactiveDt, ZoneId, ElementId, ServiceExternalId, ServiceExternalIdType.
   * @param SZCCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void cancel (ServiceZoneObjectData SZCancelIn, Date SZCCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cancel a ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ActiveDt, InactiveDt, ZoneId, ElementId, ServiceExternalId, ServiceExternalIdType.
   * @param SZCCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void cancel (BSDMSessionContext context, ServiceZoneObjectData SZCancelIn, Date SZCCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
