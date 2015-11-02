
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
public interface SalesChannelInterface extends BaliInterface {

  /**
   * Retrieve a unique SalesChannel row..
   * Convenience method using default BSDMSessionContext.
   * @param SCGetIn Input Object Key.
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SalesChannelObjectData get (SalesChannelObjectKeyData SCGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique SalesChannel row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCGetIn Input Object Key.
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SalesChannelObjectData get (BSDMSessionContext context, SalesChannelObjectKeyData SCGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique SalesChannel row..
   * Convenience method using default BSDMSessionContext.
   * @param SCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SalesChannelObjectData get (SalesChannelObjectKeyData SCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique SalesChannel row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SalesChannelObjectData get (BSDMSessionContext context, SalesChannelObjectKeyData SCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find SalesChannel's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SCFindIn Input Filter Object.
   * @return SalesChannelObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SalesChannelObjectDataList find (SalesChannelObjectFilter SCFindIn) throws BSDMResourceException;
  /**
   * Find SalesChannel's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCFindIn Input Filter Object.
   * @return SalesChannelObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SalesChannelObjectDataList find (BSDMSessionContext context, SalesChannelObjectFilter SCFindIn) throws BSDMResourceException;


  /**
   * Find SalesChannel's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SalesChannelObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SalesChannelObjectDataList find (SalesChannelObjectFilter SCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find SalesChannel's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SalesChannelObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SalesChannelObjectDataList find (BSDMSessionContext context, SalesChannelObjectFilter SCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a SalesChannel..
   * Convenience method using default BSDMSessionContext.
   * @param SCUpdateIn Input  Object.
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SalesChannelObjectData update (SalesChannelObjectData SCUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a SalesChannel..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCUpdateIn Input  Object.
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SalesChannelObjectData update (BSDMSessionContext context, SalesChannelObjectData SCUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a SalesChannel..
   * Convenience method using default BSDMSessionContext.
   * @param SCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SalesChannelObjectData update (SalesChannelObjectData SCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a SalesChannel..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SalesChannelObjectData update (BSDMSessionContext context, SalesChannelObjectData SCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a SalesChannel row..
   * Convenience method using default BSDMSessionContext.
   * @param SCDeleteIn Input Object Key.
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SalesChannelObjectData delete (SalesChannelObjectKeyData SCDeleteIn) throws BSDMResourceException;
  /**
   * Delete a SalesChannel row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCDeleteIn Input Object Key.
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SalesChannelObjectData delete (BSDMSessionContext context, SalesChannelObjectKeyData SCDeleteIn) throws BSDMResourceException;


  /**
   * Delete a SalesChannel row..
   * Convenience method using default BSDMSessionContext.
   * @param SCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SalesChannelObjectData delete (SalesChannelObjectKeyData SCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a SalesChannel row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SalesChannelObjectData delete (BSDMSessionContext context, SalesChannelObjectKeyData SCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new SalesChannel..
   * Convenience method using default BSDMSessionContext.
   * @param SCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SalesChannelObjectData create (SalesChannelObjectData SCCreateIn) throws BSDMResourceException;
  /**
   * Create a new SalesChannel..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public SalesChannelObjectData create (BSDMSessionContext context, SalesChannelObjectData SCCreateIn) throws BSDMResourceException;


  /**
   * Create a new SalesChannel..
   * Convenience method using default BSDMSessionContext.
   * @param SCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public SalesChannelObjectData create (SalesChannelObjectData SCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new SalesChannel..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return SalesChannelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public SalesChannelObjectData create (BSDMSessionContext context, SalesChannelObjectData SCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
