
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
public interface ServerInterface extends BaliInterface {

  /**
   * Retrieve a unique Server row..
   * Convenience method using default BSDMSessionContext.
   * @param S_DGetIn Input Object Key.
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerObjectData get (ServerObjectKeyData S_DGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique Server row..
   * @param context The session context to use when connecting to the APITS server.
   * @param S_DGetIn Input Object Key.
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerObjectData get (BSDMSessionContext context, ServerObjectKeyData S_DGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique Server row..
   * Convenience method using default BSDMSessionContext.
   * @param S_DGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServerObjectData get (ServerObjectKeyData S_DGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique Server row..
   * @param context The session context to use when connecting to the APITS server.
   * @param S_DGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServerObjectData get (BSDMSessionContext context, ServerObjectKeyData S_DGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Server rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param S_DFindIn Input Filter Object.
   * @return ServerObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerObjectDataList find (ServerObjectFilter S_DFindIn) throws BSDMResourceException;
  /**
   * Find Server rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param S_DFindIn Input Filter Object.
   * @return ServerObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerObjectDataList find (BSDMSessionContext context, ServerObjectFilter S_DFindIn) throws BSDMResourceException;


  /**
   * Find Server rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param S_DFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServerObjectDataList find (ServerObjectFilter S_DFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Server rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param S_DFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServerObjectDataList find (BSDMSessionContext context, ServerObjectFilter S_DFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a Server..
   * Convenience method using default BSDMSessionContext.
   * @param S_DUpdateIn Input  Object.
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerObjectData update (ServerObjectData S_DUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a Server..
   * @param context The session context to use when connecting to the APITS server.
   * @param S_DUpdateIn Input  Object.
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerObjectData update (BSDMSessionContext context, ServerObjectData S_DUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a Server..
   * Convenience method using default BSDMSessionContext.
   * @param S_DUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServerObjectData update (ServerObjectData S_DUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a Server..
   * @param context The session context to use when connecting to the APITS server.
   * @param S_DUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServerObjectData update (BSDMSessionContext context, ServerObjectData S_DUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a Server row..
   * Convenience method using default BSDMSessionContext.
   * @param S_DDeleteIn Input Object Key.
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerObjectData delete (ServerObjectKeyData S_DDeleteIn) throws BSDMResourceException;
  /**
   * Delete a Server row..
   * @param context The session context to use when connecting to the APITS server.
   * @param S_DDeleteIn Input Object Key.
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerObjectData delete (BSDMSessionContext context, ServerObjectKeyData S_DDeleteIn) throws BSDMResourceException;


  /**
   * Delete a Server row..
   * Convenience method using default BSDMSessionContext.
   * @param S_DDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServerObjectData delete (ServerObjectKeyData S_DDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a Server row..
   * @param context The session context to use when connecting to the APITS server.
   * @param S_DDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServerObjectData delete (BSDMSessionContext context, ServerObjectKeyData S_DDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new Server row..
   * Convenience method using default BSDMSessionContext.
   * @param S_DCreateIn Input  Object.
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerObjectData create (ServerObjectData S_DCreateIn) throws BSDMResourceException;
  /**
   * Create a new Server row..
   * @param context The session context to use when connecting to the APITS server.
   * @param S_DCreateIn Input  Object.
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerObjectData create (BSDMSessionContext context, ServerObjectData S_DCreateIn) throws BSDMResourceException;


  /**
   * Create a new Server row..
   * Convenience method using default BSDMSessionContext.
   * @param S_DCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServerObjectData create (ServerObjectData S_DCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Server row..
   * @param context The session context to use when connecting to the APITS server.
   * @param S_DCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServerObjectData create (BSDMSessionContext context, ServerObjectData S_DCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
