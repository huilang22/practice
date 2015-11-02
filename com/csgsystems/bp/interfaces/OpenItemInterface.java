
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
public interface OpenItemInterface extends BaliInterface {

  /**
   * Get a unique OpenItem..
   * Convenience method using default BSDMSessionContext.
   * @param OIIGetIn Input Object Key.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemObjectData get (OpenItemObjectKeyData OIIGetIn) throws BSDMResourceException;
  /**
   * Get a unique OpenItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIGetIn Input Object Key.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemObjectData get (BSDMSessionContext context, OpenItemObjectKeyData OIIGetIn) throws BSDMResourceException;


  /**
   * Get a unique OpenItem..
   * Convenience method using default BSDMSessionContext.
   * @param OIIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OpenItemObjectData get (OpenItemObjectKeyData OIIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique OpenItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OpenItemObjectData get (BSDMSessionContext context, OpenItemObjectKeyData OIIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find OpenItem rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param OIIFindIn Input Filter Object.
   * @return OpenItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemObjectDataList find (OpenItemObjectFilter OIIFindIn) throws BSDMResourceException;
  /**
   * Find OpenItem rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIFindIn Input Filter Object.
   * @return OpenItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemObjectDataList find (BSDMSessionContext context, OpenItemObjectFilter OIIFindIn) throws BSDMResourceException;


  /**
   * Find OpenItem rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param OIIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OpenItemObjectDataList find (OpenItemObjectFilter OIIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find OpenItem rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OpenItemObjectDataList find (BSDMSessionContext context, OpenItemObjectFilter OIIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of an OpenItem row..
   * Convenience method using default BSDMSessionContext.
   * @param OIIUpdateIn Input  Object.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemObjectData update (OpenItemObjectData OIIUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of an OpenItem row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIUpdateIn Input  Object.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemObjectData update (BSDMSessionContext context, OpenItemObjectData OIIUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of an OpenItem row..
   * Convenience method using default BSDMSessionContext.
   * @param OIIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OpenItemObjectData update (OpenItemObjectData OIIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of an OpenItem row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OpenItemObjectData update (BSDMSessionContext context, OpenItemObjectData OIIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete an OpenItem row..
   * Convenience method using default BSDMSessionContext.
   * @param OIIDeleteIn Input Object Key.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemObjectData delete (OpenItemObjectKeyData OIIDeleteIn) throws BSDMResourceException;
  /**
   * Delete an OpenItem row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIDeleteIn Input Object Key.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemObjectData delete (BSDMSessionContext context, OpenItemObjectKeyData OIIDeleteIn) throws BSDMResourceException;


  /**
   * Delete an OpenItem row..
   * Convenience method using default BSDMSessionContext.
   * @param OIIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OpenItemObjectData delete (OpenItemObjectKeyData OIIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete an OpenItem row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OpenItemObjectData delete (BSDMSessionContext context, OpenItemObjectKeyData OIIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new OpenItem..
   * Convenience method using default BSDMSessionContext.
   * @param OIICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal, OpenItemIdType.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemObjectData create (OpenItemObjectData OIICreateIn) throws BSDMResourceException;
  /**
   * Create a new OpenItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal, OpenItemIdType.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public OpenItemObjectData create (BSDMSessionContext context, OpenItemObjectData OIICreateIn) throws BSDMResourceException;


  /**
   * Create a new OpenItem..
   * Convenience method using default BSDMSessionContext.
   * @param OIICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal, OpenItemIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public OpenItemObjectData create (OpenItemObjectData OIICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new OpenItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal, OpenItemIdType.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public OpenItemObjectData create (BSDMSessionContext context, OpenItemObjectData OIICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
