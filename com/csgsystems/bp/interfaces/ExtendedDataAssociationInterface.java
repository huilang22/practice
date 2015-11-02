
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
public interface ExtendedDataAssociationInterface extends BaliInterface {

  /**
   * Get a unique ExtendedDataAssociation row..
   * Convenience method using default BSDMSessionContext.
   * @param EDGetIn Input Object Key.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataObjectData get (ExtendedDataObjectKeyData EDGetIn) throws BSDMResourceException;
  /**
   * Get a unique ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDGetIn Input Object Key.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataObjectData get (BSDMSessionContext context, ExtendedDataObjectKeyData EDGetIn) throws BSDMResourceException;


  /**
   * Get a unique ExtendedDataAssociation row..
   * Convenience method using default BSDMSessionContext.
   * @param EDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ExtendedDataObjectData get (ExtendedDataObjectKeyData EDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ExtendedDataObjectData get (BSDMSessionContext context, ExtendedDataObjectKeyData EDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ExtendedDataAssociations that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param EDFindIn Input Filter Object.
   * @return ExtendedDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataObjectDataList find (ExtendedDataObjectFilter EDFindIn) throws BSDMResourceException;
  /**
   * Find ExtendedDataAssociations that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDFindIn Input Filter Object.
   * @return ExtendedDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataObjectDataList find (BSDMSessionContext context, ExtendedDataObjectFilter EDFindIn) throws BSDMResourceException;


  /**
   * Find ExtendedDataAssociations that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param EDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ExtendedDataObjectDataList find (ExtendedDataObjectFilter EDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ExtendedDataAssociations that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ExtendedDataObjectDataList find (BSDMSessionContext context, ExtendedDataObjectFilter EDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of an ExtendedDataAssociation row..
   * Convenience method using default BSDMSessionContext.
   * @param EDUpdateIn Input  Object.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataObjectData update (ExtendedDataObjectData EDUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of an ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDUpdateIn Input  Object.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataObjectData update (BSDMSessionContext context, ExtendedDataObjectData EDUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of an ExtendedDataAssociation row..
   * Convenience method using default BSDMSessionContext.
   * @param EDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ExtendedDataObjectData update (ExtendedDataObjectData EDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of an ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ExtendedDataObjectData update (BSDMSessionContext context, ExtendedDataObjectData EDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete an ExtendedDataAssociation row..
   * Convenience method using default BSDMSessionContext.
   * @param EDDeleteIn Input Object Key.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataObjectData delete (ExtendedDataObjectKeyData EDDeleteIn) throws BSDMResourceException;
  /**
   * Delete an ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDDeleteIn Input Object Key.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataObjectData delete (BSDMSessionContext context, ExtendedDataObjectKeyData EDDeleteIn) throws BSDMResourceException;


  /**
   * Delete an ExtendedDataAssociation row..
   * Convenience method using default BSDMSessionContext.
   * @param EDDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ExtendedDataObjectData delete (ExtendedDataObjectKeyData EDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete an ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ExtendedDataObjectData delete (BSDMSessionContext context, ExtendedDataObjectKeyData EDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new ExtendedDataAssociation row..
   * Convenience method using default BSDMSessionContext.
   * @param EDCreateIn Input  Object.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataObjectData create (ExtendedDataObjectData EDCreateIn) throws BSDMResourceException;
  /**
   * Create a new ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDCreateIn Input  Object.
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExtendedDataObjectData create (BSDMSessionContext context, ExtendedDataObjectData EDCreateIn) throws BSDMResourceException;


  /**
   * Create a new ExtendedDataAssociation row..
   * Convenience method using default BSDMSessionContext.
   * @param EDCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ExtendedDataObjectData create (ExtendedDataObjectData EDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new ExtendedDataAssociation row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EDCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExtendedDataObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ExtendedDataObjectData create (BSDMSessionContext context, ExtendedDataObjectData EDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
