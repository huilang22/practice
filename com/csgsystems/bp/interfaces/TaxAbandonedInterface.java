
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
public interface TaxAbandonedInterface extends BaliInterface {

  /**
   * Returns one TaxAbandoned object matching the supplied key value..
   * Convenience method using default BSDMSessionContext.
   * @param TAget_In Input Object Key.
   * @return TaxAbandonedObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxAbandonedObjectData get (TaxAbandonedObjectKeyData TAget_In) throws BSDMResourceException;
  /**
   * Returns one TaxAbandoned object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param TAget_In Input Object Key.
   * @return TaxAbandonedObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxAbandonedObjectData get (BSDMSessionContext context, TaxAbandonedObjectKeyData TAget_In) throws BSDMResourceException;


  /**
   * Returns one TaxAbandoned object matching the supplied key value..
   * Convenience method using default BSDMSessionContext.
   * @param TAget_In Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxAbandonedObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TaxAbandonedObjectData get (TaxAbandonedObjectKeyData TAget_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Returns one TaxAbandoned object matching the supplied key value..
   * @param context The session context to use when connecting to the APITS server.
   * @param TAget_In Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxAbandonedObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TaxAbandonedObjectData get (BSDMSessionContext context, TaxAbandonedObjectKeyData TAget_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds all TaxAbandoned objects matching the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TAfind_In Input Filter Object.
   * @return TaxAbandonedObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxAbandonedObjectDataList find (TaxAbandonedObjectFilter TAfind_In) throws BSDMResourceException;
  /**
   * Finds all TaxAbandoned objects matching the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TAfind_In Input Filter Object.
   * @return TaxAbandonedObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TaxAbandonedObjectDataList find (BSDMSessionContext context, TaxAbandonedObjectFilter TAfind_In) throws BSDMResourceException;


  /**
   * Finds all TaxAbandoned objects matching the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TAfind_In Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxAbandonedObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TaxAbandonedObjectDataList find (TaxAbandonedObjectFilter TAfind_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds all TaxAbandoned objects matching the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TAfind_In Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TaxAbandonedObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TaxAbandonedObjectDataList find (BSDMSessionContext context, TaxAbandonedObjectFilter TAfind_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
