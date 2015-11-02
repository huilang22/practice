
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
public interface ExtendedDataParamInterface extends BaliInterface {

  /**
   * Get a unique ExtendedDataParam row..
   * Convenience method using default BSDMSessionContext.
   * @param PDGetIn Input Object Key.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public XPDObjectData get (XPDObjectKeyData PDGetIn) throws BSDMResourceException;
  /**
   * Get a unique ExtendedDataParam row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDGetIn Input Object Key.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public XPDObjectData get (BSDMSessionContext context, XPDObjectKeyData PDGetIn) throws BSDMResourceException;


  /**
   * Get a unique ExtendedDataParam row..
   * Convenience method using default BSDMSessionContext.
   * @param PDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public XPDObjectData get (XPDObjectKeyData PDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique ExtendedDataParam row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public XPDObjectData get (BSDMSessionContext context, XPDObjectKeyData PDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ExtendedDataParam rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PDFindIn Input Filter Object.
   * @return XPDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public XPDObjectDataList find (XPDObjectFilter PDFindIn) throws BSDMResourceException;
  /**
   * Find ExtendedDataParam rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDFindIn Input Filter Object.
   * @return XPDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public XPDObjectDataList find (BSDMSessionContext context, XPDObjectFilter PDFindIn) throws BSDMResourceException;


  /**
   * Find ExtendedDataParam rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return XPDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public XPDObjectDataList find (XPDObjectFilter PDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ExtendedDataParam rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return XPDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public XPDObjectDataList find (BSDMSessionContext context, XPDObjectFilter PDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update a new ExtendedDataParam row..
   * Convenience method using default BSDMSessionContext.
   * @param PDUpdateIn Input  Object.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public XPDObjectData update (XPDObjectData PDUpdateIn) throws BSDMResourceException;
  /**
   * Update a new ExtendedDataParam row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDUpdateIn Input  Object.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public XPDObjectData update (BSDMSessionContext context, XPDObjectData PDUpdateIn) throws BSDMResourceException;


  /**
   * Update a new ExtendedDataParam row..
   * Convenience method using default BSDMSessionContext.
   * @param PDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public XPDObjectData update (XPDObjectData PDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update a new ExtendedDataParam row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public XPDObjectData update (BSDMSessionContext context, XPDObjectData PDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param PDDeleteIn Input  Object.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public XPDObjectData delete (XPDObjectData PDDeleteIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PDDeleteIn Input  Object.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public XPDObjectData delete (BSDMSessionContext context, XPDObjectData PDDeleteIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param PDDeleteIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public XPDObjectData delete (XPDObjectData PDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PDDeleteIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public XPDObjectData delete (BSDMSessionContext context, XPDObjectData PDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new ExtendedDataParam row..
   * Convenience method using default BSDMSessionContext.
   * @param PDCreateIn Input  Object.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public XPDObjectData create (XPDObjectData PDCreateIn) throws BSDMResourceException;
  /**
   * Create a new ExtendedDataParam row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDCreateIn Input  Object.
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public XPDObjectData create (BSDMSessionContext context, XPDObjectData PDCreateIn) throws BSDMResourceException;


  /**
   * Create a new ExtendedDataParam row..
   * Convenience method using default BSDMSessionContext.
   * @param PDCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public XPDObjectData create (XPDObjectData PDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new ExtendedDataParam row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDCreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return XPDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public XPDObjectData create (BSDMSessionContext context, XPDObjectData PDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
