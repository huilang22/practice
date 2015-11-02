
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
public interface ExtendedDataLocateInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param elcIn Input  Object.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void create (ExtendedDataLocateObjectData elcIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param elcIn Input  Object.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void create (BSDMSessionContext context, ExtendedDataLocateObjectData elcIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param elcIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void create (ExtendedDataLocateObjectData elcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param elcIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void create (BSDMSessionContext context, ExtendedDataLocateObjectData elcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param elfIn Input Filter Object.
   * @return ExtendedDataLocateObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataLocateObjectDataList find (ExtendedDataLocateObjectFilter elfIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param elfIn Input Filter Object.
   * @return ExtendedDataLocateObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataLocateObjectDataList find (BSDMSessionContext context, ExtendedDataLocateObjectFilter elfIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param elfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataLocateObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ExtendedDataLocateObjectDataList find (ExtendedDataLocateObjectFilter elfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param elfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataLocateObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ExtendedDataLocateObjectDataList find (BSDMSessionContext context, ExtendedDataLocateObjectFilter elfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param elxlistIn Input Filter Object.
   * @return ExtendedDataLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataLocateObjectData deleteList (ExtendedDataLocateObjectFilter elxlistIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param elxlistIn Input Filter Object.
   * @return ExtendedDataLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataLocateObjectData deleteList (BSDMSessionContext context, ExtendedDataLocateObjectFilter elxlistIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param elxlistIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ExtendedDataLocateObjectData deleteList (ExtendedDataLocateObjectFilter elxlistIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param elxlistIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ExtendedDataLocateObjectData deleteList (BSDMSessionContext context, ExtendedDataLocateObjectFilter elxlistIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
