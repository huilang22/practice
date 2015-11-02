
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
public interface CsrInterface extends BaliInterface {

  /**
   * Get a unique Csr row..
   * Convenience method using default BSDMSessionContext.
   * @param CSRgetIn Input Object Key.
   * @return CsrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrObjectData get (CsrObjectKeyData CSRgetIn) throws BSDMResourceException;
  /**
   * Get a unique Csr row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSRgetIn Input Object Key.
   * @return CsrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrObjectData get (BSDMSessionContext context, CsrObjectKeyData CSRgetIn) throws BSDMResourceException;


  /**
   * Get a unique Csr row..
   * Convenience method using default BSDMSessionContext.
   * @param CSRgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrObjectData get (CsrObjectKeyData CSRgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique Csr row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSRgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrObjectData get (BSDMSessionContext context, CsrObjectKeyData CSRgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Csr's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CSRfindIn Input Filter Object.
   * @return CsrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrObjectDataList find (CsrObjectFilter CSRfindIn) throws BSDMResourceException;
  /**
   * Find Csr's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSRfindIn Input Filter Object.
   * @return CsrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrObjectDataList find (BSDMSessionContext context, CsrObjectFilter CSRfindIn) throws BSDMResourceException;


  /**
   * Find Csr's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CSRfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrObjectDataList find (CsrObjectFilter CSRfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Csr's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSRfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrObjectDataList find (BSDMSessionContext context, CsrObjectFilter CSRfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get a list of Groups the Csr is a member of..
   * Convenience method using default BSDMSessionContext.
   * @param user_name.
   * @return CsrGroupOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupOutputData group (String user_name) throws BSDMResourceException;
  /**
   * Get a list of Groups the Csr is a member of..
   * @param context The session context to use when connecting to the APITS server.
   * @param user_name.
   * @return CsrGroupOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CsrGroupOutputData group (BSDMSessionContext context, String user_name) throws BSDMResourceException;


  /**
   * Get a list of Groups the Csr is a member of..
   * Convenience method using default BSDMSessionContext.
   * @param user_name.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CsrGroupOutputData group (String user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a list of Groups the Csr is a member of..
   * @param context The session context to use when connecting to the APITS server.
   * @param user_name.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CsrGroupOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CsrGroupOutputData group (BSDMSessionContext context, String user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
