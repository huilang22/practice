
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
public interface PackageComponentDefInterface extends BaliInterface {

  /**
   * Retrieve a unique PackageComponentDef row..
   * Convenience method using default BSDMSessionContext.
   * @param PCDGetIn Input Object Key.
   * @return PCDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PCDObjectData get (PCDObjectKeyData PCDGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique PackageComponentDef row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCDGetIn Input Object Key.
   * @return PCDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PCDObjectData get (BSDMSessionContext context, PCDObjectKeyData PCDGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique PackageComponentDef row..
   * Convenience method using default BSDMSessionContext.
   * @param PCDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PCDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PCDObjectData get (PCDObjectKeyData PCDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique PackageComponentDef row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PCDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PCDObjectData get (BSDMSessionContext context, PCDObjectKeyData PCDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find PackageComponentDef rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PCDFindIn Input Filter Object.
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PCDObjectDataList find (PCDObjectFilter PCDFindIn) throws BSDMResourceException;
  /**
   * Find PackageComponentDef rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCDFindIn Input Filter Object.
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PCDObjectDataList find (BSDMSessionContext context, PCDObjectFilter PCDFindIn) throws BSDMResourceException;


  /**
   * Find PackageComponentDef rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PCDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PCDObjectDataList find (PCDObjectFilter PCDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find PackageComponentDef rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PCDObjectDataList find (BSDMSessionContext context, PCDObjectFilter PCDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find PackageComponentDef rows for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param language_code.
   * @param account_internal_id.
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PCDObjectDataList findByAccount (Integer language_code, Integer account_internal_id) throws BSDMResourceException;
  /**
   * Find PackageComponentDef rows for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param language_code.
   * @param account_internal_id.
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PCDObjectDataList findByAccount (BSDMSessionContext context, Integer language_code, Integer account_internal_id) throws BSDMResourceException;


  /**
   * Find PackageComponentDef rows for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param language_code.
   * @param account_internal_id.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PCDObjectDataList findByAccount (Integer language_code, Integer account_internal_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find PackageComponentDef rows for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param language_code.
   * @param account_internal_id.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PCDObjectDataList findByAccount (BSDMSessionContext context, Integer language_code, Integer account_internal_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find PackageComponentDef rows for a Service..
   * Convenience method using default BSDMSessionContext.
   * @param LanguageCode.
   * @param service_internal_id.
   * @param service_internal_id_resets.
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PCDObjectDataList findByService (Integer LanguageCode, Integer service_internal_id, Integer service_internal_id_resets) throws BSDMResourceException;
  /**
   * Find PackageComponentDef rows for a Service..
   * @param context The session context to use when connecting to the APITS server.
   * @param LanguageCode.
   * @param service_internal_id.
   * @param service_internal_id_resets.
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PCDObjectDataList findByService (BSDMSessionContext context, Integer LanguageCode, Integer service_internal_id, Integer service_internal_id_resets) throws BSDMResourceException;


  /**
   * Find PackageComponentDef rows for a Service..
   * Convenience method using default BSDMSessionContext.
   * @param LanguageCode.
   * @param service_internal_id.
   * @param service_internal_id_resets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PCDObjectDataList findByService (Integer LanguageCode, Integer service_internal_id, Integer service_internal_id_resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find PackageComponentDef rows for a Service..
   * @param context The session context to use when connecting to the APITS server.
   * @param LanguageCode.
   * @param service_internal_id.
   * @param service_internal_id_resets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PCDObjectDataList findByService (BSDMSessionContext context, Integer LanguageCode, Integer service_internal_id, Integer service_internal_id_resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
