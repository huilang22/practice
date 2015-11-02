
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
public interface RegulatoryIdInterface extends BaliInterface {

  /**
   * Retreive a unique RegulatoryId row..
   * Convenience method using default BSDMSessionContext.
   * @param RIGetIn Input Object Key.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RegulatoryIdObjectData get (RegulatoryIdObjectKeyData RIGetIn) throws BSDMResourceException;
  /**
   * Retreive a unique RegulatoryId row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIGetIn Input Object Key.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RegulatoryIdObjectData get (BSDMSessionContext context, RegulatoryIdObjectKeyData RIGetIn) throws BSDMResourceException;


  /**
   * Retreive a unique RegulatoryId row..
   * Convenience method using default BSDMSessionContext.
   * @param RIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RegulatoryIdObjectData get (RegulatoryIdObjectKeyData RIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retreive a unique RegulatoryId row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RegulatoryIdObjectData get (BSDMSessionContext context, RegulatoryIdObjectKeyData RIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find RegulatoryId's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RIFindIn Input Filter Object.
   * @return RegulatoryIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RegulatoryIdObjectDataList find (RegulatoryIdObjectFilter RIFindIn) throws BSDMResourceException;
  /**
   * Find RegulatoryId's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIFindIn Input Filter Object.
   * @return RegulatoryIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RegulatoryIdObjectDataList find (BSDMSessionContext context, RegulatoryIdObjectFilter RIFindIn) throws BSDMResourceException;


  /**
   * Find RegulatoryId's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RegulatoryIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RegulatoryIdObjectDataList find (RegulatoryIdObjectFilter RIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find RegulatoryId's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RegulatoryIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RegulatoryIdObjectDataList find (BSDMSessionContext context, RegulatoryIdObjectFilter RIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of a RegulatoryId..
   * Convenience method using default BSDMSessionContext.
   * @param RIUpdateIn Input  Object.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RegulatoryIdObjectData update (RegulatoryIdObjectData RIUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of a RegulatoryId..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIUpdateIn Input  Object.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RegulatoryIdObjectData update (BSDMSessionContext context, RegulatoryIdObjectData RIUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of a RegulatoryId..
   * Convenience method using default BSDMSessionContext.
   * @param RIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RegulatoryIdObjectData update (RegulatoryIdObjectData RIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of a RegulatoryId..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RegulatoryIdObjectData update (BSDMSessionContext context, RegulatoryIdObjectData RIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a RegulatoryId..
   * Convenience method using default BSDMSessionContext.
   * @param RIDeleteIn Input Object Key.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RegulatoryIdObjectData delete (RegulatoryIdObjectKeyData RIDeleteIn) throws BSDMResourceException;
  /**
   * Delete a RegulatoryId..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIDeleteIn Input Object Key.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RegulatoryIdObjectData delete (BSDMSessionContext context, RegulatoryIdObjectKeyData RIDeleteIn) throws BSDMResourceException;


  /**
   * Delete a RegulatoryId..
   * Convenience method using default BSDMSessionContext.
   * @param RIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RegulatoryIdObjectData delete (RegulatoryIdObjectKeyData RIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a RegulatoryId..
   * @param context The session context to use when connecting to the APITS server.
   * @param RIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RegulatoryIdObjectData delete (BSDMSessionContext context, RegulatoryIdObjectKeyData RIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new RegulatoryId..
   * Convenience method using default BSDMSessionContext.
   * @param RICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RegulatoryIdObjectData create (RegulatoryIdObjectData RICreateIn) throws BSDMResourceException;
  /**
   * Create a new RegulatoryId..
   * @param context The session context to use when connecting to the APITS server.
   * @param RICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public RegulatoryIdObjectData create (BSDMSessionContext context, RegulatoryIdObjectData RICreateIn) throws BSDMResourceException;


  /**
   * Create a new RegulatoryId..
   * Convenience method using default BSDMSessionContext.
   * @param RICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public RegulatoryIdObjectData create (RegulatoryIdObjectData RICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new RegulatoryId..
   * @param context The session context to use when connecting to the APITS server.
   * @param RICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return RegulatoryIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public RegulatoryIdObjectData create (BSDMSessionContext context, RegulatoryIdObjectData RICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
