
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
public interface ClearingHouseInfoInterface extends BaliInterface {

  /**
   * Get a ClearingHouseInfo object..
   * Convenience method using default BSDMSessionContext.
   * @param CHIGetIn Input Object Key.
   * @return ClearingHouseInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseInfoObjectData get (ClearingHouseInfoObjectKeyData CHIGetIn) throws BSDMResourceException;
  /**
   * Get a ClearingHouseInfo object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIGetIn Input Object Key.
   * @return ClearingHouseInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseInfoObjectData get (BSDMSessionContext context, ClearingHouseInfoObjectKeyData CHIGetIn) throws BSDMResourceException;


  /**
   * Get a ClearingHouseInfo object..
   * Convenience method using default BSDMSessionContext.
   * @param CHIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ClearingHouseInfoObjectData get (ClearingHouseInfoObjectKeyData CHIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a ClearingHouseInfo object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ClearingHouseInfoObjectData get (BSDMSessionContext context, ClearingHouseInfoObjectKeyData CHIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ClearingHouseInfo's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CHIFindIn Input Filter Object.
   * @return ClearingHouseInfoObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseInfoObjectDataList find (ClearingHouseInfoObjectFilter CHIFindIn) throws BSDMResourceException;
  /**
   * Find ClearingHouseInfo's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIFindIn Input Filter Object.
   * @return ClearingHouseInfoObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseInfoObjectDataList find (BSDMSessionContext context, ClearingHouseInfoObjectFilter CHIFindIn) throws BSDMResourceException;


  /**
   * Find ClearingHouseInfo's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CHIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseInfoObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ClearingHouseInfoObjectDataList find (ClearingHouseInfoObjectFilter CHIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ClearingHouseInfo's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseInfoObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ClearingHouseInfoObjectDataList find (BSDMSessionContext context, ClearingHouseInfoObjectFilter CHIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
