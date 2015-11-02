
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
public interface CmfRewardBalanceDetailInterface extends BaliInterface {

  /**
   * Get a unique CmfRewardBalanceDetail..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDGetIn Input Object Key.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfRewardBalanceDetailObjectData get (CmfRewardBalanceDetailObjectKeyData CRBDGetIn) throws BSDMResourceException;
  /**
   * Get a unique CmfRewardBalanceDetail..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDGetIn Input Object Key.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfRewardBalanceDetailObjectData get (BSDMSessionContext context, CmfRewardBalanceDetailObjectKeyData CRBDGetIn) throws BSDMResourceException;


  /**
   * Get a unique CmfRewardBalanceDetail..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfRewardBalanceDetailObjectData get (CmfRewardBalanceDetailObjectKeyData CRBDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique CmfRewardBalanceDetail..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfRewardBalanceDetailObjectData get (BSDMSessionContext context, CmfRewardBalanceDetailObjectKeyData CRBDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CmfRewardBalanceDetail rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDFindIn Input Filter Object.
   * @return CmfRewardBalanceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfRewardBalanceDetailObjectDataList find (CmfRewardBalanceDetailObjectFilter CRBDFindIn) throws BSDMResourceException;
  /**
   * Find CmfRewardBalanceDetail rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDFindIn Input Filter Object.
   * @return CmfRewardBalanceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfRewardBalanceDetailObjectDataList find (BSDMSessionContext context, CmfRewardBalanceDetailObjectFilter CRBDFindIn) throws BSDMResourceException;


  /**
   * Find CmfRewardBalanceDetail rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfRewardBalanceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfRewardBalanceDetailObjectDataList find (CmfRewardBalanceDetailObjectFilter CRBDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CmfRewardBalanceDetail rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfRewardBalanceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfRewardBalanceDetailObjectDataList find (BSDMSessionContext context, CmfRewardBalanceDetailObjectFilter CRBDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of an CmfRewardBalanceDetail row..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDUpdateIn Input  Object.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfRewardBalanceDetailObjectData update (CmfRewardBalanceDetailObjectData CRBDUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of an CmfRewardBalanceDetail row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDUpdateIn Input  Object.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfRewardBalanceDetailObjectData update (BSDMSessionContext context, CmfRewardBalanceDetailObjectData CRBDUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of an CmfRewardBalanceDetail row..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfRewardBalanceDetailObjectData update (CmfRewardBalanceDetailObjectData CRBDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of an CmfRewardBalanceDetail row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfRewardBalanceDetailObjectData update (BSDMSessionContext context, CmfRewardBalanceDetailObjectData CRBDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a CmfRewardBalanceDetail row..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDDeleteIn Input Object Key.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfRewardBalanceDetailObjectData delete (CmfRewardBalanceDetailObjectKeyData CRBDDeleteIn) throws BSDMResourceException;
  /**
   * Delete a CmfRewardBalanceDetail row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDDeleteIn Input Object Key.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfRewardBalanceDetailObjectData delete (BSDMSessionContext context, CmfRewardBalanceDetailObjectKeyData CRBDDeleteIn) throws BSDMResourceException;


  /**
   * Delete a CmfRewardBalanceDetail row..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfRewardBalanceDetailObjectData delete (CmfRewardBalanceDetailObjectKeyData CRBDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a CmfRewardBalanceDetail row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfRewardBalanceDetailObjectData delete (BSDMSessionContext context, CmfRewardBalanceDetailObjectKeyData CRBDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new CmfRewardBalanceDetail..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: TotalAdj, TotalSpend.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfRewardBalanceDetailObjectData create (CmfRewardBalanceDetailObjectData CRBDCreateIn) throws BSDMResourceException;
  /**
   * Create a new CmfRewardBalanceDetail..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: TotalAdj, TotalSpend.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CmfRewardBalanceDetailObjectData create (BSDMSessionContext context, CmfRewardBalanceDetailObjectData CRBDCreateIn) throws BSDMResourceException;


  /**
   * Create a new CmfRewardBalanceDetail..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: TotalAdj, TotalSpend.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CmfRewardBalanceDetailObjectData create (CmfRewardBalanceDetailObjectData CRBDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new CmfRewardBalanceDetail..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: TotalAdj, TotalSpend.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CmfRewardBalanceDetailObjectData create (BSDMSessionContext context, CmfRewardBalanceDetailObjectData CRBDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
