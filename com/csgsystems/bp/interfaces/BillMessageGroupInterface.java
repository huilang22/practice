
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
public interface BillMessageGroupInterface extends BaliInterface {

  /**
   * Get a BillMessageGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param MGIGetIn Input Object Key.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupObjectData get (BillMessageGroupObjectKeyData MGIGetIn) throws BSDMResourceException;
  /**
   * Get a BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIGetIn Input Object Key.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupObjectData get (BSDMSessionContext context, BillMessageGroupObjectKeyData MGIGetIn) throws BSDMResourceException;


  /**
   * Get a BillMessageGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param MGIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillMessageGroupObjectData get (BillMessageGroupObjectKeyData MGIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillMessageGroupObjectData get (BSDMSessionContext context, BillMessageGroupObjectKeyData MGIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find BillMessageGroups that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param MGIFindIn Input Filter Object.
   * @return BillMessageGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupObjectDataList find (BillMessageGroupObjectFilter MGIFindIn) throws BSDMResourceException;
  /**
   * Find BillMessageGroups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIFindIn Input Filter Object.
   * @return BillMessageGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupObjectDataList find (BSDMSessionContext context, BillMessageGroupObjectFilter MGIFindIn) throws BSDMResourceException;


  /**
   * Find BillMessageGroups that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param MGIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillMessageGroupObjectDataList find (BillMessageGroupObjectFilter MGIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find BillMessageGroups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillMessageGroupObjectDataList find (BSDMSessionContext context, BillMessageGroupObjectFilter MGIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a BillMessageGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param MGIUpdateIn Input  Object.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupObjectData update (BillMessageGroupObjectData MGIUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIUpdateIn Input  Object.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupObjectData update (BSDMSessionContext context, BillMessageGroupObjectData MGIUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a BillMessageGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param MGIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillMessageGroupObjectData update (BillMessageGroupObjectData MGIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillMessageGroupObjectData update (BSDMSessionContext context, BillMessageGroupObjectData MGIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a BillMessageGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param MGIDeleteIn Input Object Key.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupObjectData delete (BillMessageGroupObjectKeyData MGIDeleteIn) throws BSDMResourceException;
  /**
   * Delete a BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIDeleteIn Input Object Key.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupObjectData delete (BSDMSessionContext context, BillMessageGroupObjectKeyData MGIDeleteIn) throws BSDMResourceException;


  /**
   * Delete a BillMessageGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param MGIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillMessageGroupObjectData delete (BillMessageGroupObjectKeyData MGIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillMessageGroupObjectData delete (BSDMSessionContext context, BillMessageGroupObjectKeyData MGIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new BillMessageGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param MGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupObjectData create (BillMessageGroupObjectData MGICreateIn) throws BSDMResourceException;
  /**
   * Create a new BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillMessageGroupObjectData create (BSDMSessionContext context, BillMessageGroupObjectData MGICreateIn) throws BSDMResourceException;


  /**
   * Create a new BillMessageGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param MGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillMessageGroupObjectData create (BillMessageGroupObjectData MGICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new BillMessageGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param MGICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillMessageGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillMessageGroupObjectData create (BSDMSessionContext context, BillMessageGroupObjectData MGICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
