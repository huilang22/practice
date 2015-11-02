
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
public interface AxrtPaymentProfileInterface extends BaliInterface {

  /**
   * Create a AxrtPaymentProfile based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param axrtppcIn Input  Object.  Derived Fields: ProfileId, ProfileCreationTime.
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentProfileObjectData create (AxrtPaymentProfileObjectData axrtppcIn) throws BSDMResourceException;
  /**
   * Create a AxrtPaymentProfile based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppcIn Input  Object.  Derived Fields: ProfileId, ProfileCreationTime.
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentProfileObjectData create (BSDMSessionContext context, AxrtPaymentProfileObjectData axrtppcIn) throws BSDMResourceException;


  /**
   * Create a AxrtPaymentProfile based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param axrtppcIn Input  Object.  Derived Fields: ProfileId, ProfileCreationTime.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AxrtPaymentProfileObjectData create (AxrtPaymentProfileObjectData axrtppcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a AxrtPaymentProfile based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppcIn Input  Object.  Derived Fields: ProfileId, ProfileCreationTime.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AxrtPaymentProfileObjectData create (BSDMSessionContext context, AxrtPaymentProfileObjectData axrtppcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update a AxrtPaymentProfile.
   * Convenience method using default BSDMSessionContext.
   * @param axrtppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentProfileObjectData update (AxrtPaymentProfileObjectData axrtppuIn) throws BSDMResourceException;
  /**
   * Update a AxrtPaymentProfile.
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentProfileObjectData update (BSDMSessionContext context, AxrtPaymentProfileObjectData axrtppuIn) throws BSDMResourceException;


  /**
   * Update a AxrtPaymentProfile.
   * Convenience method using default BSDMSessionContext.
   * @param axrtppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AxrtPaymentProfileObjectData update (AxrtPaymentProfileObjectData axrtppuIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update a AxrtPaymentProfile.
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AxrtPaymentProfileObjectData update (BSDMSessionContext context, AxrtPaymentProfileObjectData axrtppuIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param axrtppdIn Input  Object.
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentProfileObjectData delete (AxrtPaymentProfileObjectData axrtppdIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppdIn Input  Object.
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentProfileObjectData delete (BSDMSessionContext context, AxrtPaymentProfileObjectData axrtppdIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param axrtppdIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AxrtPaymentProfileObjectData delete (AxrtPaymentProfileObjectData axrtppdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppdIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AxrtPaymentProfileObjectData delete (BSDMSessionContext context, AxrtPaymentProfileObjectData axrtppdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find AxrtPaymentProfiles that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param axrtppfIn Input Filter Object.
   * @return AxrtPaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentProfileObjectDataList find (AxrtPaymentProfileObjectFilter axrtppfIn) throws BSDMResourceException;
  /**
   * Find AxrtPaymentProfiles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppfIn Input Filter Object.
   * @return AxrtPaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AxrtPaymentProfileObjectDataList find (BSDMSessionContext context, AxrtPaymentProfileObjectFilter axrtppfIn) throws BSDMResourceException;


  /**
   * Find AxrtPaymentProfiles that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param axrtppfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AxrtPaymentProfileObjectDataList find (AxrtPaymentProfileObjectFilter axrtppfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find AxrtPaymentProfiles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AxrtPaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AxrtPaymentProfileObjectDataList find (BSDMSessionContext context, AxrtPaymentProfileObjectFilter axrtppfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
