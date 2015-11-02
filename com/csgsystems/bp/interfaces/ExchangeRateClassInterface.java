
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
public interface ExchangeRateClassInterface extends BaliInterface {

  /**
   * Get a unique ExchangeRateClass row..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCGetIn Input Object Key.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExchangeRateClassObjectData get (ExchangeRateClassObjectKeyData EXRCGetIn) throws BSDMResourceException;
  /**
   * Get a unique ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCGetIn Input Object Key.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExchangeRateClassObjectData get (BSDMSessionContext context, ExchangeRateClassObjectKeyData EXRCGetIn) throws BSDMResourceException;


  /**
   * Get a unique ExchangeRateClass row..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ExchangeRateClassObjectData get (ExchangeRateClassObjectKeyData EXRCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ExchangeRateClassObjectData get (BSDMSessionContext context, ExchangeRateClassObjectKeyData EXRCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ExchangeRateClass rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCFindIn Input Filter Object.
   * @return ExchangeRateClassObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExchangeRateClassObjectDataList find (ExchangeRateClassObjectFilter EXRCFindIn) throws BSDMResourceException;
  /**
   * Find ExchangeRateClass rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCFindIn Input Filter Object.
   * @return ExchangeRateClassObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExchangeRateClassObjectDataList find (BSDMSessionContext context, ExchangeRateClassObjectFilter EXRCFindIn) throws BSDMResourceException;


  /**
   * Find ExchangeRateClass rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExchangeRateClassObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ExchangeRateClassObjectDataList find (ExchangeRateClassObjectFilter EXRCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ExchangeRateClass rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExchangeRateClassObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ExchangeRateClassObjectDataList find (BSDMSessionContext context, ExchangeRateClassObjectFilter EXRCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of an ExchangeRateClass row..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCUpdateIn Input  Object.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExchangeRateClassObjectData update (ExchangeRateClassObjectData EXRCUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of an ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCUpdateIn Input  Object.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExchangeRateClassObjectData update (BSDMSessionContext context, ExchangeRateClassObjectData EXRCUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of an ExchangeRateClass row..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ExchangeRateClassObjectData update (ExchangeRateClassObjectData EXRCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of an ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ExchangeRateClassObjectData update (BSDMSessionContext context, ExchangeRateClassObjectData EXRCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete an ExchangeRateClass row..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCDeleteIn Input Object Key.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExchangeRateClassObjectData delete (ExchangeRateClassObjectKeyData EXRCDeleteIn) throws BSDMResourceException;
  /**
   * Delete an ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCDeleteIn Input Object Key.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExchangeRateClassObjectData delete (BSDMSessionContext context, ExchangeRateClassObjectKeyData EXRCDeleteIn) throws BSDMResourceException;


  /**
   * Delete an ExchangeRateClass row..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ExchangeRateClassObjectData delete (ExchangeRateClassObjectKeyData EXRCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete an ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ExchangeRateClassObjectData delete (BSDMSessionContext context, ExchangeRateClassObjectKeyData EXRCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new ExchangeRateClass row..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExchangeRateClassObjectData create (ExchangeRateClassObjectData EXRCCreateIn) throws BSDMResourceException;
  /**
   * Create a new ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExchangeRateClassObjectData create (BSDMSessionContext context, ExchangeRateClassObjectData EXRCCreateIn) throws BSDMResourceException;


  /**
   * Create a new ExchangeRateClass row..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ExchangeRateClassObjectData create (ExchangeRateClassObjectData EXRCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ExchangeRateClassObjectData create (BSDMSessionContext context, ExchangeRateClassObjectData EXRCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
