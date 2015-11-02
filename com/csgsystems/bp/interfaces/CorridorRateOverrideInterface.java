
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
public interface CorridorRateOverrideInterface extends BaliInterface {

  /**
   * Get a CorridorRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param CROGetIn Input Object Key.
   * @return CROObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CROObjectData get (CROObjectKeyData CROGetIn) throws BSDMResourceException;
  /**
   * Get a CorridorRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param CROGetIn Input Object Key.
   * @return CROObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CROObjectData get (BSDMSessionContext context, CROObjectKeyData CROGetIn) throws BSDMResourceException;


  /**
   * Get a CorridorRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param CROGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CROObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CROObjectData get (CROObjectKeyData CROGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a CorridorRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param CROGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CROObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CROObjectData get (BSDMSessionContext context, CROObjectKeyData CROGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CorridorRateOverrides..
   * Convenience method using default BSDMSessionContext.
   * @param CROFindIn Input Filter Object.
   * @return CROObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CROObjectDataList find (CROObjectFilter CROFindIn) throws BSDMResourceException;
  /**
   * Find CorridorRateOverrides..
   * @param context The session context to use when connecting to the APITS server.
   * @param CROFindIn Input Filter Object.
   * @return CROObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CROObjectDataList find (BSDMSessionContext context, CROObjectFilter CROFindIn) throws BSDMResourceException;


  /**
   * Find CorridorRateOverrides..
   * Convenience method using default BSDMSessionContext.
   * @param CROFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CROObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CROObjectDataList find (CROObjectFilter CROFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CorridorRateOverrides..
   * @param context The session context to use when connecting to the APITS server.
   * @param CROFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CROObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CROObjectDataList find (BSDMSessionContext context, CROObjectFilter CROFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a CorridorRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param CROUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.
   * @return CROObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CROObjectData update (CROObjectData CROUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a CorridorRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param CROUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.
   * @return CROObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CROObjectData update (BSDMSessionContext context, CROObjectData CROUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a CorridorRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param CROUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CROObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CROObjectData update (CROObjectData CROUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a CorridorRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param CROUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CROObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CROObjectData update (BSDMSessionContext context, CROObjectData CROUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
