
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
public interface CustomerDocumentInterface extends BaliInterface {

  /**
   * Get Customer Document object that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentGetIn Input Object Key.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDocumentObjectData get (CustomerDocumentObjectKeyData CustomerDocumentGetIn) throws BSDMResourceException;
  /**
   * Get Customer Document object that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentGetIn Input Object Key.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDocumentObjectData get (BSDMSessionContext context, CustomerDocumentObjectKeyData CustomerDocumentGetIn) throws BSDMResourceException;


  /**
   * Get Customer Document object that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CustomerDocumentObjectData get (CustomerDocumentObjectKeyData CustomerDocumentGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get Customer Document object that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CustomerDocumentObjectData get (BSDMSessionContext context, CustomerDocumentObjectKeyData CustomerDocumentGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CustomerDocument that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentFindIn Input Filter Object.
   * @return CustomerDocumentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDocumentObjectDataList find (CustomerDocumentObjectFilter CustomerDocumentFindIn) throws BSDMResourceException;
  /**
   * Find CustomerDocument that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentFindIn Input Filter Object.
   * @return CustomerDocumentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDocumentObjectDataList find (BSDMSessionContext context, CustomerDocumentObjectFilter CustomerDocumentFindIn) throws BSDMResourceException;


  /**
   * Find CustomerDocument that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDocumentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CustomerDocumentObjectDataList find (CustomerDocumentObjectFilter CustomerDocumentFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CustomerDocument that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDocumentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CustomerDocumentObjectDataList find (BSDMSessionContext context, CustomerDocumentObjectFilter CustomerDocumentFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a CustomerDocument..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentUpdateIn Input  Object.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDocumentObjectData update (CustomerDocumentObjectData CustomerDocumentUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a CustomerDocument..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentUpdateIn Input  Object.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDocumentObjectData update (BSDMSessionContext context, CustomerDocumentObjectData CustomerDocumentUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a CustomerDocument..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CustomerDocumentObjectData update (CustomerDocumentObjectData CustomerDocumentUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a CustomerDocument..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CustomerDocumentObjectData update (BSDMSessionContext context, CustomerDocumentObjectData CustomerDocumentUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a CustomerDocument..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentDeleteIn Input  Object.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDocumentObjectData delete (CustomerDocumentObjectData CustomerDocumentDeleteIn) throws BSDMResourceException;
  /**
   * Delete a CustomerDocument..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentDeleteIn Input  Object.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDocumentObjectData delete (BSDMSessionContext context, CustomerDocumentObjectData CustomerDocumentDeleteIn) throws BSDMResourceException;


  /**
   * Delete a CustomerDocument..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentDeleteIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CustomerDocumentObjectData delete (CustomerDocumentObjectData CustomerDocumentDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a CustomerDocument..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentDeleteIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CustomerDocumentObjectData delete (BSDMSessionContext context, CustomerDocumentObjectData CustomerDocumentDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new CustomerDocument..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentCreateIn Input  Object.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDocumentObjectData create (CustomerDocumentObjectData CustomerDocumentCreateIn) throws BSDMResourceException;
  /**
   * Create a new CustomerDocument..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentCreateIn Input  Object.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CustomerDocumentObjectData create (BSDMSessionContext context, CustomerDocumentObjectData CustomerDocumentCreateIn) throws BSDMResourceException;


  /**
   * Create a new CustomerDocument..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CustomerDocumentObjectData create (CustomerDocumentObjectData CustomerDocumentCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new CustomerDocument..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CustomerDocumentObjectData create (BSDMSessionContext context, CustomerDocumentObjectData CustomerDocumentCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
