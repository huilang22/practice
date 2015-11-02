
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
public interface CmfPackageOverridesInterface extends BaliInterface {

  /**
   * Create a CmfPackageOverrides based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param CPOcIn Input  Object.  Derived Fields: ChgWho, ChgDate.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PackageOverridesObjectData create (PackageOverridesObjectData CPOcIn) throws BSDMResourceException;
  /**
   * Create a CmfPackageOverrides based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOcIn Input  Object.  Derived Fields: ChgWho, ChgDate.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PackageOverridesObjectData create (BSDMSessionContext context, PackageOverridesObjectData CPOcIn) throws BSDMResourceException;


  /**
   * Create a CmfPackageOverrides based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param CPOcIn Input  Object.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PackageOverridesObjectData create (PackageOverridesObjectData CPOcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a CmfPackageOverrides based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOcIn Input  Object.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PackageOverridesObjectData create (BSDMSessionContext context, PackageOverridesObjectData CPOcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields for a row in CmfPackageOverrides.
   * Convenience method using default BSDMSessionContext.
   * @param CPOuIn Input  Object.  Derived Fields: ChgWho, ChgDate.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PackageOverridesObjectData update (PackageOverridesObjectData CPOuIn) throws BSDMResourceException;
  /**
   * Update non-key fields for a row in CmfPackageOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOuIn Input  Object.  Derived Fields: ChgWho, ChgDate.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PackageOverridesObjectData update (BSDMSessionContext context, PackageOverridesObjectData CPOuIn) throws BSDMResourceException;


  /**
   * Update non-key fields for a row in CmfPackageOverrides.
   * Convenience method using default BSDMSessionContext.
   * @param CPOuIn Input  Object.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PackageOverridesObjectData update (PackageOverridesObjectData CPOuIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields for a row in CmfPackageOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOuIn Input  Object.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PackageOverridesObjectData update (BSDMSessionContext context, PackageOverridesObjectData CPOuIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update override status to Inactive (0) for a row in CmfPackageOverrides.
   * Convenience method using default BSDMSessionContext.
   * @param CPOdIn Input Object Key.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PackageOverridesObjectData delete (PackageOverridesObjectKeyData CPOdIn) throws BSDMResourceException;
  /**
   * Update override status to Inactive (0) for a row in CmfPackageOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOdIn Input Object Key.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PackageOverridesObjectData delete (BSDMSessionContext context, PackageOverridesObjectKeyData CPOdIn) throws BSDMResourceException;


  /**
   * Update override status to Inactive (0) for a row in CmfPackageOverrides.
   * Convenience method using default BSDMSessionContext.
   * @param CPOdIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PackageOverridesObjectData delete (PackageOverridesObjectKeyData CPOdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update override status to Inactive (0) for a row in CmfPackageOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOdIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PackageOverridesObjectData delete (BSDMSessionContext context, PackageOverridesObjectKeyData CPOdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Get the unique CmfPackageOverrides row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param CPOgIn Input Object Key.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PackageOverridesObjectData get (PackageOverridesObjectKeyData CPOgIn) throws BSDMResourceException;
  /**
   * Get the unique CmfPackageOverrides row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOgIn Input Object Key.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PackageOverridesObjectData get (BSDMSessionContext context, PackageOverridesObjectKeyData CPOgIn) throws BSDMResourceException;


  /**
   * Get the unique CmfPackageOverrides row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param CPOgIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PackageOverridesObjectData get (PackageOverridesObjectKeyData CPOgIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get the unique CmfPackageOverrides row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOgIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PackageOverridesObjectData get (BSDMSessionContext context, PackageOverridesObjectKeyData CPOgIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CmfPackageOverrides rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CPOfIn Input Filter Object.
   * @return PackageOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PackageOverridesObjectDataList find (PackageOverridesObjectFilter CPOfIn) throws BSDMResourceException;
  /**
   * Find CmfPackageOverrides rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOfIn Input Filter Object.
   * @return PackageOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PackageOverridesObjectDataList find (BSDMSessionContext context, PackageOverridesObjectFilter CPOfIn) throws BSDMResourceException;


  /**
   * Find CmfPackageOverrides rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CPOfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PackageOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PackageOverridesObjectDataList find (PackageOverridesObjectFilter CPOfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CmfPackageOverrides rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PackageOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PackageOverridesObjectDataList find (BSDMSessionContext context, PackageOverridesObjectFilter CPOfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
