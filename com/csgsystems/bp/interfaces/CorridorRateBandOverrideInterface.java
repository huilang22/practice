
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
public interface CorridorRateBandOverrideInterface extends BaliInterface {

  /**
   * Get a CorridorRateBandOverride..
   * Convenience method using default BSDMSessionContext.
   * @param CRBOGetIn Input Object Key.
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CRBOObjectData get (CRBOObjectKeyData CRBOGetIn) throws BSDMResourceException;
  /**
   * Get a CorridorRateBandOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBOGetIn Input Object Key.
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CRBOObjectData get (BSDMSessionContext context, CRBOObjectKeyData CRBOGetIn) throws BSDMResourceException;


  /**
   * Get a CorridorRateBandOverride..
   * Convenience method using default BSDMSessionContext.
   * @param CRBOGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CRBOObjectData get (CRBOObjectKeyData CRBOGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a CorridorRateBandOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBOGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CRBOObjectData get (BSDMSessionContext context, CRBOObjectKeyData CRBOGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CorridorRateBandOverrides..
   * Convenience method using default BSDMSessionContext.
   * @param CRBOFindIn Input Filter Object.
   * @return CRBOObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CRBOObjectDataList find (CRBOObjectFilter CRBOFindIn) throws BSDMResourceException;
  /**
   * Find CorridorRateBandOverrides..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBOFindIn Input Filter Object.
   * @return CRBOObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CRBOObjectDataList find (BSDMSessionContext context, CRBOObjectFilter CRBOFindIn) throws BSDMResourceException;


  /**
   * Find CorridorRateBandOverrides..
   * Convenience method using default BSDMSessionContext.
   * @param CRBOFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CRBOObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CRBOObjectDataList find (CRBOObjectFilter CRBOFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CorridorRateBandOverrides..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBOFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CRBOObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CRBOObjectDataList find (BSDMSessionContext context, CRBOObjectFilter CRBOFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a CorridorRateBandOverride row..
   * Convenience method using default BSDMSessionContext.
   * @param CRBOUpdateIn Input  Object.
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CRBOObjectData update (CRBOObjectData CRBOUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a CorridorRateBandOverride row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBOUpdateIn Input  Object.
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CRBOObjectData update (BSDMSessionContext context, CRBOObjectData CRBOUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a CorridorRateBandOverride row..
   * Convenience method using default BSDMSessionContext.
   * @param CRBOUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CRBOObjectData update (CRBOObjectData CRBOUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a CorridorRateBandOverride row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBOUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CRBOObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CRBOObjectData update (BSDMSessionContext context, CRBOObjectData CRBOUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
