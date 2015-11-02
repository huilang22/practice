
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
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface CreditCardInterface extends BaliInterface {

  /**
   * Get a CreditCard row..
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return CreditCardObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CreditCardObjectData get (CreditCardObjectKeyData getIn) throws BSDMResourceException;
  /**
   * Get a CreditCard row..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return CreditCardObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CreditCardObjectData get (BSDMSessionContext context, CreditCardObjectKeyData getIn) throws BSDMResourceException;


  /**
   * Get a CreditCard row..
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CreditCardObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CreditCardObjectData get (CreditCardObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a CreditCard row..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CreditCardObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CreditCardObjectData get (BSDMSessionContext context, CreditCardObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CreditCards..
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return CreditCardObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CreditCardObjectDataList find (CreditCardObjectFilter findIn) throws BSDMResourceException;
  /**
   * Find CreditCards..
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return CreditCardObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CreditCardObjectDataList find (BSDMSessionContext context, CreditCardObjectFilter findIn) throws BSDMResourceException;


  /**
   * Find CreditCards..
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CreditCardObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CreditCardObjectDataList find (CreditCardObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CreditCards..
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CreditCardObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CreditCardObjectDataList find (BSDMSessionContext context, CreditCardObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new CreditCard..
   * Convenience method using default BSDMSessionContext.
   * @param createIn Input  Object.
   * @return CreditCardObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CreditCardObjectData create (CreditCardObjectData createIn) throws BSDMResourceException;
  /**
   * Create a new CreditCard..
   * @param context The session context to use when connecting to the APITS server.
   * @param createIn Input  Object.
   * @return CreditCardObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CreditCardObjectData create (BSDMSessionContext context, CreditCardObjectData createIn) throws BSDMResourceException;


  /**
   * Create a new CreditCard..
   * Convenience method using default BSDMSessionContext.
   * @param createIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CreditCardObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CreditCardObjectData create (CreditCardObjectData createIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new CreditCard..
   * @param context The session context to use when connecting to the APITS server.
   * @param createIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CreditCardObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CreditCardObjectData create (BSDMSessionContext context, CreditCardObjectData createIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a CreditCard row..
   * Convenience method using default BSDMSessionContext.
   * @param updateIn Input  Object.
   * @return CreditCardObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CreditCardObjectData update (CreditCardObjectData updateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a CreditCard row..
   * @param context The session context to use when connecting to the APITS server.
   * @param updateIn Input  Object.
   * @return CreditCardObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CreditCardObjectData update (BSDMSessionContext context, CreditCardObjectData updateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a CreditCard row..
   * Convenience method using default BSDMSessionContext.
   * @param updateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CreditCardObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CreditCardObjectData update (CreditCardObjectData updateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a CreditCard row..
   * @param context The session context to use when connecting to the APITS server.
   * @param updateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CreditCardObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CreditCardObjectData update (BSDMSessionContext context, CreditCardObjectData updateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Validate a CreditCard..
   * Convenience method using default BSDMSessionContext.
   * @param validateIn Input  Object.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void validate (CreditCardObjectData validateIn) throws BSDMResourceException;
  /**
   * Validate a CreditCard..
   * @param context The session context to use when connecting to the APITS server.
   * @param validateIn Input  Object.
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void validate (BSDMSessionContext context, CreditCardObjectData validateIn) throws BSDMResourceException;


  /**
   * Validate a CreditCard..
   * Convenience method using default BSDMSessionContext.
   * @param validateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void validate (CreditCardObjectData validateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Validate a CreditCard..
   * @param context The session context to use when connecting to the APITS server.
   * @param validateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void validate (BSDMSessionContext context, CreditCardObjectData validateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
