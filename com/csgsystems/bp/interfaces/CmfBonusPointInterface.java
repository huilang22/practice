
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
public interface CmfBonusPointInterface extends BaliInterface {

  /**
   * Get a unique CmfBonusPoint..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDGetIn Input Object Key.
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfBonusPointObjectData get (CmfBonusPointObjectKeyData CRBDGetIn) throws BSDMResourceException;
  /**
   * Get a unique CmfBonusPoint..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDGetIn Input Object Key.
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfBonusPointObjectData get (BSDMSessionContext context, CmfBonusPointObjectKeyData CRBDGetIn) throws BSDMResourceException;


  /**
   * Get a unique CmfBonusPoint..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfBonusPointObjectData get (CmfBonusPointObjectKeyData CRBDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique CmfBonusPoint..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfBonusPointObjectData get (BSDMSessionContext context, CmfBonusPointObjectKeyData CRBDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CmfBonusPoint rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDFindIn Input Filter Object.
   * @return CmfBonusPointObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfBonusPointObjectDataList find (CmfBonusPointObjectFilter CRBDFindIn) throws BSDMResourceException;
  /**
   * Find CmfBonusPoint rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDFindIn Input Filter Object.
   * @return CmfBonusPointObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfBonusPointObjectDataList find (BSDMSessionContext context, CmfBonusPointObjectFilter CRBDFindIn) throws BSDMResourceException;


  /**
   * Find CmfBonusPoint rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfBonusPointObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfBonusPointObjectDataList find (CmfBonusPointObjectFilter CRBDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CmfBonusPoint rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfBonusPointObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfBonusPointObjectDataList find (BSDMSessionContext context, CmfBonusPointObjectFilter CRBDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of an CmfBonusPoint row..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDUpdateIn Input  Object.
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfBonusPointObjectData update (CmfBonusPointObjectData CRBDUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of an CmfBonusPoint row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDUpdateIn Input  Object.
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfBonusPointObjectData update (BSDMSessionContext context, CmfBonusPointObjectData CRBDUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of an CmfBonusPoint row..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfBonusPointObjectData update (CmfBonusPointObjectData CRBDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of an CmfBonusPoint row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfBonusPointObjectData update (BSDMSessionContext context, CmfBonusPointObjectData CRBDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new CmfBonusPoint..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: ExpirationBillRefNo, ExpirationBillRefResets.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, ChgWho.
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfBonusPointObjectData create (CmfBonusPointObjectData CRBDCreateIn) throws BSDMResourceException;
  /**
   * Create a new CmfBonusPoint..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: ExpirationBillRefNo, ExpirationBillRefResets.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, ChgWho.
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfBonusPointObjectData create (BSDMSessionContext context, CmfBonusPointObjectData CRBDCreateIn) throws BSDMResourceException;


  /**
   * Create a new CmfBonusPoint..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: ExpirationBillRefNo, ExpirationBillRefResets.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfBonusPointObjectData create (CmfBonusPointObjectData CRBDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new CmfBonusPoint..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: ExpirationBillRefNo, ExpirationBillRefResets.  Derived Fields: PointTransTrackingId, PointTransTrackingIdServ, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfBonusPointObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfBonusPointObjectData create (BSDMSessionContext context, CmfBonusPointObjectData CRBDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
