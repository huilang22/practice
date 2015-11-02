
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
public interface ServerDefinitionInterface extends BaliInterface {

  /**
   * Retrieve a unique ServerDefinition row..
   * Convenience method using default BSDMSessionContext.
   * @param SDGetIn Input Object Key.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerDefinitionObjectData get (ServerDefinitionObjectKeyData SDGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique ServerDefinition row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDGetIn Input Object Key.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerDefinitionObjectData get (BSDMSessionContext context, ServerDefinitionObjectKeyData SDGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique ServerDefinition row..
   * Convenience method using default BSDMSessionContext.
   * @param SDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServerDefinitionObjectData get (ServerDefinitionObjectKeyData SDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique ServerDefinition row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServerDefinitionObjectData get (BSDMSessionContext context, ServerDefinitionObjectKeyData SDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ServerDefinition rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SDFindIn Input Filter Object.
   * @return ServerDefinitionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerDefinitionObjectDataList find (ServerDefinitionObjectFilter SDFindIn) throws BSDMResourceException;
  /**
   * Find ServerDefinition rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDFindIn Input Filter Object.
   * @return ServerDefinitionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerDefinitionObjectDataList find (BSDMSessionContext context, ServerDefinitionObjectFilter SDFindIn) throws BSDMResourceException;


  /**
   * Find ServerDefinition rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerDefinitionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServerDefinitionObjectDataList find (ServerDefinitionObjectFilter SDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ServerDefinition rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerDefinitionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServerDefinitionObjectDataList find (BSDMSessionContext context, ServerDefinitionObjectFilter SDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a ServerDefinition..
   * Convenience method using default BSDMSessionContext.
   * @param SDUpdateIn Input  Object.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerDefinitionObjectData update (ServerDefinitionObjectData SDUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a ServerDefinition..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDUpdateIn Input  Object.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerDefinitionObjectData update (BSDMSessionContext context, ServerDefinitionObjectData SDUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a ServerDefinition..
   * Convenience method using default BSDMSessionContext.
   * @param SDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServerDefinitionObjectData update (ServerDefinitionObjectData SDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a ServerDefinition..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServerDefinitionObjectData update (BSDMSessionContext context, ServerDefinitionObjectData SDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a ServerDefinition row..
   * Convenience method using default BSDMSessionContext.
   * @param SDDeleteIn Input Object Key.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerDefinitionObjectData delete (ServerDefinitionObjectKeyData SDDeleteIn) throws BSDMResourceException;
  /**
   * Delete a ServerDefinition row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDDeleteIn Input Object Key.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerDefinitionObjectData delete (BSDMSessionContext context, ServerDefinitionObjectKeyData SDDeleteIn) throws BSDMResourceException;


  /**
   * Delete a ServerDefinition row..
   * Convenience method using default BSDMSessionContext.
   * @param SDDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServerDefinitionObjectData delete (ServerDefinitionObjectKeyData SDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a ServerDefinition row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServerDefinitionObjectData delete (BSDMSessionContext context, ServerDefinitionObjectKeyData SDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new ServerDefinition row..
   * Convenience method using default BSDMSessionContext.
   * @param SDCreateIn Input  Object.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerDefinitionObjectData create (ServerDefinitionObjectData SDCreateIn) throws BSDMResourceException;
  /**
   * Create a new ServerDefinition row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDCreateIn Input  Object.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServerDefinitionObjectData create (BSDMSessionContext context, ServerDefinitionObjectData SDCreateIn) throws BSDMResourceException;


  /**
   * Create a new ServerDefinition row..
   * Convenience method using default BSDMSessionContext.
   * @param SDCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServerDefinitionObjectData create (ServerDefinitionObjectData SDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new ServerDefinition row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServerDefinitionObjectData create (BSDMSessionContext context, ServerDefinitionObjectData SDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
