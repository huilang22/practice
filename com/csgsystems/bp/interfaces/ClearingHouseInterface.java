
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
public interface ClearingHouseInterface extends BaliInterface {

  /**
   * Get a ClearingHouse object..
   * Convenience method using default BSDMSessionContext.
   * @param CHIGetIn Input Object Key.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseObjectData get (ClearingHouseObjectKeyData CHIGetIn) throws BSDMResourceException;
  /**
   * Get a ClearingHouse object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIGetIn Input Object Key.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseObjectData get (BSDMSessionContext context, ClearingHouseObjectKeyData CHIGetIn) throws BSDMResourceException;


  /**
   * Get a ClearingHouse object..
   * Convenience method using default BSDMSessionContext.
   * @param CHIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ClearingHouseObjectData get (ClearingHouseObjectKeyData CHIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a ClearingHouse object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ClearingHouseObjectData get (BSDMSessionContext context, ClearingHouseObjectKeyData CHIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ClearingHouse's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CHIFindIn Input Filter Object.
   * @return ClearingHouseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseObjectDataList find (ClearingHouseObjectFilter CHIFindIn) throws BSDMResourceException;
  /**
   * Find ClearingHouse's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIFindIn Input Filter Object.
   * @return ClearingHouseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseObjectDataList find (BSDMSessionContext context, ClearingHouseObjectFilter CHIFindIn) throws BSDMResourceException;


  /**
   * Find ClearingHouse's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CHIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ClearingHouseObjectDataList find (ClearingHouseObjectFilter CHIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ClearingHouse's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ClearingHouseObjectDataList find (BSDMSessionContext context, ClearingHouseObjectFilter CHIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a ClearingHouse row..
   * Convenience method using default BSDMSessionContext.
   * @param CHIUpdateIn Input  Object.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseObjectData update (ClearingHouseObjectData CHIUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a ClearingHouse row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIUpdateIn Input  Object.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseObjectData update (BSDMSessionContext context, ClearingHouseObjectData CHIUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a ClearingHouse row..
   * Convenience method using default BSDMSessionContext.
   * @param CHIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ClearingHouseObjectData update (ClearingHouseObjectData CHIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a ClearingHouse row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ClearingHouseObjectData update (BSDMSessionContext context, ClearingHouseObjectData CHIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a ClearingHouse row..
   * Convenience method using default BSDMSessionContext.
   * @param CHIDeleteIn Input Object Key.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseObjectData delete (ClearingHouseObjectKeyData CHIDeleteIn) throws BSDMResourceException;
  /**
   * Delete a ClearingHouse row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIDeleteIn Input Object Key.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseObjectData delete (BSDMSessionContext context, ClearingHouseObjectKeyData CHIDeleteIn) throws BSDMResourceException;


  /**
   * Delete a ClearingHouse row..
   * Convenience method using default BSDMSessionContext.
   * @param CHIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ClearingHouseObjectData delete (ClearingHouseObjectKeyData CHIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a ClearingHouse row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ClearingHouseObjectData delete (BSDMSessionContext context, ClearingHouseObjectKeyData CHIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new ClearingHouse..
   * Convenience method using default BSDMSessionContext.
   * @param CHICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseObjectData create (ClearingHouseObjectData CHICreateIn) throws BSDMResourceException;
  /**
   * Create a new ClearingHouse..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ClearingHouseObjectData create (BSDMSessionContext context, ClearingHouseObjectData CHICreateIn) throws BSDMResourceException;


  /**
   * Create a new ClearingHouse..
   * Convenience method using default BSDMSessionContext.
   * @param CHICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ClearingHouseObjectData create (ClearingHouseObjectData CHICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new ClearingHouse..
   * @param context The session context to use when connecting to the APITS server.
   * @param CHICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ClearingHouseObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ClearingHouseObjectData create (BSDMSessionContext context, ClearingHouseObjectData CHICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
