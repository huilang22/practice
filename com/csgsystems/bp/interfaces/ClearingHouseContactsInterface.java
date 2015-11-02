
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
public interface ClearingHouseContactsInterface extends BaliInterface {

  /**
   * Find ClearingHouseContacts that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CHCFindIn Input Filter Object.
   * @return ClearingHouseContactsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseContactsObjectDataList find (ClearingHouseContactsObjectFilter CHCFindIn) throws BSDMResourceException;
  /**
   * Find ClearingHouseContacts that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHCFindIn Input Filter Object.
   * @return ClearingHouseContactsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseContactsObjectDataList find (BSDMSessionContext context, ClearingHouseContactsObjectFilter CHCFindIn) throws BSDMResourceException;


  /**
   * Find ClearingHouseContacts that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CHCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseContactsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ClearingHouseContactsObjectDataList find (ClearingHouseContactsObjectFilter CHCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ClearingHouseContacts that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseContactsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ClearingHouseContactsObjectDataList find (BSDMSessionContext context, ClearingHouseContactsObjectFilter CHCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ClearingHouseContacts count that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CHCFindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (ClearingHouseContactsObjectFilter CHCFindCountIn) throws BSDMResourceException;
  /**
   * Find ClearingHouseContacts count that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHCFindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer findCount (BSDMSessionContext context, ClearingHouseContactsObjectFilter CHCFindCountIn) throws BSDMResourceException;


  /**
   * Find ClearingHouseContacts count that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CHCFindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer findCount (ClearingHouseContactsObjectFilter CHCFindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ClearingHouseContacts count that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHCFindCountIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer findCount (BSDMSessionContext context, ClearingHouseContactsObjectFilter CHCFindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
