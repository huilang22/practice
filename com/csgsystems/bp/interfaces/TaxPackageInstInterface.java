
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
public interface TaxPackageInstInterface extends BaliInterface {

  /**
   * Get a unique TaxPackageInst..
   * Convenience method using default BSDMSessionContext.
   * @param TPIGetIn Input Object Key.
   * @return TPIObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TPIObjectData get (TPIObjectKeyData TPIGetIn) throws BSDMResourceException;
  /**
   * Get a unique TaxPackageInst..
   * @param context The session context to use when connecting to the APITS server.
   * @param TPIGetIn Input Object Key.
   * @return TPIObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TPIObjectData get (BSDMSessionContext context, TPIObjectKeyData TPIGetIn) throws BSDMResourceException;


  /**
   * Get a unique TaxPackageInst..
   * Convenience method using default BSDMSessionContext.
   * @param TPIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TPIObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TPIObjectData get (TPIObjectKeyData TPIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique TaxPackageInst..
   * @param context The session context to use when connecting to the APITS server.
   * @param TPIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TPIObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TPIObjectData get (BSDMSessionContext context, TPIObjectKeyData TPIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find TaxPackageInst's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TPIFindIn Input Filter Object.
   * @return TPIObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TPIObjectDataList find (TPIObjectFilter TPIFindIn) throws BSDMResourceException;
  /**
   * Find TaxPackageInst's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TPIFindIn Input Filter Object.
   * @return TPIObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public TPIObjectDataList find (BSDMSessionContext context, TPIObjectFilter TPIFindIn) throws BSDMResourceException;


  /**
   * Find TaxPackageInst's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TPIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TPIObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public TPIObjectDataList find (TPIObjectFilter TPIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find TaxPackageInst's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TPIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return TPIObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public TPIObjectDataList find (BSDMSessionContext context, TPIObjectFilter TPIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
