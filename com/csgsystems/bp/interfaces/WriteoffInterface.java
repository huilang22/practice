
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
public interface WriteoffInterface extends BaliInterface {

  /**
   * Get a unique Writeoff..
   * Convenience method using default BSDMSessionContext.
   * @param WRITEOFFgetIn Input Object Key.
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public WriteoffObjectData get (WriteoffObjectKeyData WRITEOFFgetIn) throws BSDMResourceException;
  /**
   * Get a unique Writeoff..
   * @param context The session context to use when connecting to the APITS server.
   * @param WRITEOFFgetIn Input Object Key.
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public WriteoffObjectData get (BSDMSessionContext context, WriteoffObjectKeyData WRITEOFFgetIn) throws BSDMResourceException;


  /**
   * Get a unique Writeoff..
   * Convenience method using default BSDMSessionContext.
   * @param WRITEOFFgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public WriteoffObjectData get (WriteoffObjectKeyData WRITEOFFgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique Writeoff..
   * @param context The session context to use when connecting to the APITS server.
   * @param WRITEOFFgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public WriteoffObjectData get (BSDMSessionContext context, WriteoffObjectKeyData WRITEOFFgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Writeoff rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param WRITEOFFfindIn Input Filter Object.
   * @return WriteoffObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public WriteoffObjectDataList find (WriteoffObjectFilter WRITEOFFfindIn) throws BSDMResourceException;
  /**
   * Find Writeoff rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param WRITEOFFfindIn Input Filter Object.
   * @return WriteoffObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public WriteoffObjectDataList find (BSDMSessionContext context, WriteoffObjectFilter WRITEOFFfindIn) throws BSDMResourceException;


  /**
   * Find Writeoff rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param WRITEOFFfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return WriteoffObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public WriteoffObjectDataList find (WriteoffObjectFilter WRITEOFFfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Writeoff rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param WRITEOFFfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return WriteoffObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public WriteoffObjectDataList find (BSDMSessionContext context, WriteoffObjectFilter WRITEOFFfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new Writeoff Recovery..
   * Convenience method using default BSDMSessionContext.
   * @param WRITEOFFcreateIn Input  Object.  Read-Only fields: WriteoffTypeCode, AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ, MicrBankId.  Derived Fields: TrackingId, TrackingIdServ, WriteoffTypeCode.
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public WriteoffObjectData recoveryCreate (WriteoffObjectData WRITEOFFcreateIn) throws BSDMResourceException;
  /**
   * Create a new Writeoff Recovery..
   * @param context The session context to use when connecting to the APITS server.
   * @param WRITEOFFcreateIn Input  Object.  Read-Only fields: WriteoffTypeCode, AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ, MicrBankId.  Derived Fields: TrackingId, TrackingIdServ, WriteoffTypeCode.
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public WriteoffObjectData recoveryCreate (BSDMSessionContext context, WriteoffObjectData WRITEOFFcreateIn) throws BSDMResourceException;


  /**
   * Create a new Writeoff Recovery..
   * Convenience method using default BSDMSessionContext.
   * @param WRITEOFFcreateIn Input  Object.  Read-Only fields: WriteoffTypeCode, AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ, MicrBankId.  Derived Fields: TrackingId, TrackingIdServ, WriteoffTypeCode.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public WriteoffObjectData recoveryCreate (WriteoffObjectData WRITEOFFcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Writeoff Recovery..
   * @param context The session context to use when connecting to the APITS server.
   * @param WRITEOFFcreateIn Input  Object.  Read-Only fields: WriteoffTypeCode, AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ, MicrBankId.  Derived Fields: TrackingId, TrackingIdServ, WriteoffTypeCode.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return WriteoffObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public WriteoffObjectData recoveryCreate (BSDMSessionContext context, WriteoffObjectData WRITEOFFcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
