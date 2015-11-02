
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
public interface ServerCategoryInterface extends BaliInterface {

  /**
   * Get a Unique ServerCategory row..
   * Convenience method using default BSDMSessionContext.
   * @param SCGetIn Input Object Key.
   * @return SCObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SCObjectData get (SCObjectKeyData SCGetIn) throws BSDMResourceException;
  /**
   * Get a Unique ServerCategory row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCGetIn Input Object Key.
   * @return SCObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SCObjectData get (BSDMSessionContext context, SCObjectKeyData SCGetIn) throws BSDMResourceException;


  /**
   * Get a Unique ServerCategory row..
   * Convenience method using default BSDMSessionContext.
   * @param SCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SCObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SCObjectData get (SCObjectKeyData SCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a Unique ServerCategory row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SCObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SCObjectData get (BSDMSessionContext context, SCObjectKeyData SCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ServerCategory rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SCFindIn Input Filter Object.
   * @return SCObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SCObjectDataList find (SCObjectFilter SCFindIn) throws BSDMResourceException;
  /**
   * Find ServerCategory rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCFindIn Input Filter Object.
   * @return SCObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SCObjectDataList find (BSDMSessionContext context, SCObjectFilter SCFindIn) throws BSDMResourceException;


  /**
   * Find ServerCategory rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SCObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SCObjectDataList find (SCObjectFilter SCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ServerCategory rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SCObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SCObjectDataList find (BSDMSessionContext context, SCObjectFilter SCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
