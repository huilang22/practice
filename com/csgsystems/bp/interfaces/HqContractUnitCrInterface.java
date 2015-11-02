
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
public interface HqContractUnitCrInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrGetIn Input Object Key.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqContractUnitCrObjectData get (HqContractUnitCrObjectKeyData HqContractUnitCrGetIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrGetIn Input Object Key.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqContractUnitCrObjectData get (BSDMSessionContext context, HqContractUnitCrObjectKeyData HqContractUnitCrGetIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqContractUnitCrObjectData get (HqContractUnitCrObjectKeyData HqContractUnitCrGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqContractUnitCrObjectData get (BSDMSessionContext context, HqContractUnitCrObjectKeyData HqContractUnitCrGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrFindIn Input Filter Object.
   * @return HqContractUnitCrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqContractUnitCrObjectDataList find (HqContractUnitCrObjectFilter HqContractUnitCrFindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrFindIn Input Filter Object.
   * @return HqContractUnitCrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqContractUnitCrObjectDataList find (BSDMSessionContext context, HqContractUnitCrObjectFilter HqContractUnitCrFindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqContractUnitCrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqContractUnitCrObjectDataList find (HqContractUnitCrObjectFilter HqContractUnitCrFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqContractUnitCrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqContractUnitCrObjectDataList find (BSDMSessionContext context, HqContractUnitCrObjectFilter HqContractUnitCrFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrCreateIn Input  Object.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqContractUnitCrObjectData create (HqContractUnitCrObjectData HqContractUnitCrCreateIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrCreateIn Input  Object.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqContractUnitCrObjectData create (BSDMSessionContext context, HqContractUnitCrObjectData HqContractUnitCrCreateIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqContractUnitCrObjectData create (HqContractUnitCrObjectData HqContractUnitCrCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqContractUnitCrObjectData create (BSDMSessionContext context, HqContractUnitCrObjectData HqContractUnitCrCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * 
				Update the values (other than the key) of the HqContractUnitCrObject.
			.
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrupdate_In Input  Object.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqContractUnitCrObjectData update (HqContractUnitCrObjectData HqContractUnitCrupdate_In) throws BSDMResourceException;
  /**
   * 
				Update the values (other than the key) of the HqContractUnitCrObject.
			.
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrupdate_In Input  Object.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqContractUnitCrObjectData update (BSDMSessionContext context, HqContractUnitCrObjectData HqContractUnitCrupdate_In) throws BSDMResourceException;


  /**
   * 
				Update the values (other than the key) of the HqContractUnitCrObject.
			.
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrupdate_In Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqContractUnitCrObjectData update (HqContractUnitCrObjectData HqContractUnitCrupdate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * 
				Update the values (other than the key) of the HqContractUnitCrObject.
			.
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrupdate_In Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqContractUnitCrObjectData update (BSDMSessionContext context, HqContractUnitCrObjectData HqContractUnitCrupdate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * 
				Delete the HQ_CONTRACT_UNIT_CR row.
			.
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrdelete_In Input Object Key.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqContractUnitCrObjectData delete (HqContractUnitCrObjectKeyData HqContractUnitCrdelete_In) throws BSDMResourceException;
  /**
   * 
				Delete the HQ_CONTRACT_UNIT_CR row.
			.
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrdelete_In Input Object Key.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqContractUnitCrObjectData delete (BSDMSessionContext context, HqContractUnitCrObjectKeyData HqContractUnitCrdelete_In) throws BSDMResourceException;


  /**
   * 
				Delete the HQ_CONTRACT_UNIT_CR row.
			.
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrdelete_In Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqContractUnitCrObjectData delete (HqContractUnitCrObjectKeyData HqContractUnitCrdelete_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * 
				Delete the HQ_CONTRACT_UNIT_CR row.
			.
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrdelete_In Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqContractUnitCrObjectData delete (BSDMSessionContext context, HqContractUnitCrObjectKeyData HqContractUnitCrdelete_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
