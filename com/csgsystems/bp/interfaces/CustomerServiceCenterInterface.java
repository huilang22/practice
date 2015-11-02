
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
public interface CustomerServiceCenterInterface extends BaliInterface {

  /**
   * Get a CustomerServiceCenter..
   * Convenience method using default BSDMSessionContext.
   * @param CSCgetIn Input Object Key.
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerServiceCenterObjectData get (CustomerServiceCenterObjectKeyData CSCgetIn) throws BSDMResourceException;
  /**
   * Get a CustomerServiceCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCgetIn Input Object Key.
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerServiceCenterObjectData get (BSDMSessionContext context, CustomerServiceCenterObjectKeyData CSCgetIn) throws BSDMResourceException;


  /**
   * Get a CustomerServiceCenter..
   * Convenience method using default BSDMSessionContext.
   * @param CSCgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CustomerServiceCenterObjectData get (CustomerServiceCenterObjectKeyData CSCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a CustomerServiceCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CustomerServiceCenterObjectData get (BSDMSessionContext context, CustomerServiceCenterObjectKeyData CSCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CustomerServiceCenters..
   * Convenience method using default BSDMSessionContext.
   * @param CSCfindIn Input Filter Object.
   * @return CustomerServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerServiceCenterObjectDataList find (CustomerServiceCenterObjectFilter CSCfindIn) throws BSDMResourceException;
  /**
   * Find CustomerServiceCenters..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCfindIn Input Filter Object.
   * @return CustomerServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerServiceCenterObjectDataList find (BSDMSessionContext context, CustomerServiceCenterObjectFilter CSCfindIn) throws BSDMResourceException;


  /**
   * Find CustomerServiceCenters..
   * Convenience method using default BSDMSessionContext.
   * @param CSCfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CustomerServiceCenterObjectDataList find (CustomerServiceCenterObjectFilter CSCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CustomerServiceCenters..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CustomerServiceCenterObjectDataList find (BSDMSessionContext context, CustomerServiceCenterObjectFilter CSCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new CustomerServiceCenter..
   * Convenience method using default BSDMSessionContext.
   * @param CSCcreateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerServiceCenterObjectData create (CustomerServiceCenterObjectData CSCcreateIn) throws BSDMResourceException;
  /**
   * Create a new CustomerServiceCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCcreateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerServiceCenterObjectData create (BSDMSessionContext context, CustomerServiceCenterObjectData CSCcreateIn) throws BSDMResourceException;


  /**
   * Create a new CustomerServiceCenter..
   * Convenience method using default BSDMSessionContext.
   * @param CSCcreateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CustomerServiceCenterObjectData create (CustomerServiceCenterObjectData CSCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new CustomerServiceCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCcreateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CustomerServiceCenterObjectData create (BSDMSessionContext context, CustomerServiceCenterObjectData CSCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a CustomerServiceCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param CSCupdateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerServiceCenterObjectData update (CustomerServiceCenterObjectData CSCupdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a CustomerServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCupdateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerServiceCenterObjectData update (BSDMSessionContext context, CustomerServiceCenterObjectData CSCupdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a CustomerServiceCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param CSCupdateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CustomerServiceCenterObjectData update (CustomerServiceCenterObjectData CSCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a CustomerServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCupdateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CustomerServiceCenterObjectData update (BSDMSessionContext context, CustomerServiceCenterObjectData CSCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
