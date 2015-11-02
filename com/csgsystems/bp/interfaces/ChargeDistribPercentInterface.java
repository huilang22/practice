
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
public interface ChargeDistribPercentInterface extends BaliInterface {

  /**
   * Returns one ChargeDistribPercent object matching the supplied key value..
   * Convenience method using default BSDMSessionContext.
   * @param CDPget_In Input Object Key.
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ChargeDistribPercentObjectData get (ChargeDistribPercentObjectKeyData CDPget_In) throws BSDMResourceException;
  /**
   * Returns one ChargeDistribPercent object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPget_In Input Object Key.
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ChargeDistribPercentObjectData get (BSDMSessionContext context, ChargeDistribPercentObjectKeyData CDPget_In) throws BSDMResourceException;


  /**
   * Returns one ChargeDistribPercent object matching the supplied key value..
   * Convenience method using default BSDMSessionContext.
   * @param CDPget_In Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ChargeDistribPercentObjectData get (ChargeDistribPercentObjectKeyData CDPget_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns one ChargeDistribPercent object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPget_In Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ChargeDistribPercentObjectData get (BSDMSessionContext context, ChargeDistribPercentObjectKeyData CDPget_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds all ChargeDistribPercent objects matching the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CDPfind_In Input Filter Object.
   * @return ChargeDistribPercentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ChargeDistribPercentObjectDataList find (ChargeDistribPercentObjectFilter CDPfind_In) throws BSDMResourceException;
  /**
   * Finds all ChargeDistribPercent objects matching the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPfind_In Input Filter Object.
   * @return ChargeDistribPercentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ChargeDistribPercentObjectDataList find (BSDMSessionContext context, ChargeDistribPercentObjectFilter CDPfind_In) throws BSDMResourceException;


  /**
   * Finds all ChargeDistribPercent objects matching the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CDPfind_In Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ChargeDistribPercentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ChargeDistribPercentObjectDataList find (ChargeDistribPercentObjectFilter CDPfind_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds all ChargeDistribPercent objects matching the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPfind_In Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ChargeDistribPercentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ChargeDistribPercentObjectDataList find (BSDMSessionContext context, ChargeDistribPercentObjectFilter CDPfind_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a ChargeDistribPercent based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param CDPcreate_In Input  Object.
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ChargeDistribPercentObjectData create (ChargeDistribPercentObjectData CDPcreate_In) throws BSDMResourceException;
  /**
   * Create a ChargeDistribPercent based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPcreate_In Input  Object.
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ChargeDistribPercentObjectData create (BSDMSessionContext context, ChargeDistribPercentObjectData CDPcreate_In) throws BSDMResourceException;


  /**
   * Create a ChargeDistribPercent based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param CDPcreate_In Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ChargeDistribPercentObjectData create (ChargeDistribPercentObjectData CDPcreate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a ChargeDistribPercent based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPcreate_In Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ChargeDistribPercentObjectData create (BSDMSessionContext context, ChargeDistribPercentObjectData CDPcreate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields for a row in ChargeDistribPercent.
   * Convenience method using default BSDMSessionContext.
   * @param CDPupdate_In Input  Object.
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ChargeDistribPercentObjectData update (ChargeDistribPercentObjectData CDPupdate_In) throws BSDMResourceException;
  /**
   * Update non-key fields for a row in ChargeDistribPercent.
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPupdate_In Input  Object.
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ChargeDistribPercentObjectData update (BSDMSessionContext context, ChargeDistribPercentObjectData CDPupdate_In) throws BSDMResourceException;


  /**
   * Update non-key fields for a row in ChargeDistribPercent.
   * Convenience method using default BSDMSessionContext.
   * @param CDPupdate_In Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ChargeDistribPercentObjectData update (ChargeDistribPercentObjectData CDPupdate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields for a row in ChargeDistribPercent.
   * @param context The session context to use when connecting to the APITS server.
   * @param CDPupdate_In Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ChargeDistribPercentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ChargeDistribPercentObjectData update (BSDMSessionContext context, ChargeDistribPercentObjectData CDPupdate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
