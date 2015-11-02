
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
public interface CreditCardTypeCodeInterface extends BaliInterface {

  /**
   * Get a CreditCardTypeCode..
   * Convenience method using default BSDMSessionContext.
   * @param CreditCardTypeCodegetIn Input Object Key.
   * @return CreditCardTypeCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CreditCardTypeCodeObjectData get (CreditCardTypeCodeObjectKeyData CreditCardTypeCodegetIn) throws BSDMResourceException;
  /**
   * Get a CreditCardTypeCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param CreditCardTypeCodegetIn Input Object Key.
   * @return CreditCardTypeCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CreditCardTypeCodeObjectData get (BSDMSessionContext context, CreditCardTypeCodeObjectKeyData CreditCardTypeCodegetIn) throws BSDMResourceException;


  /**
   * Get a CreditCardTypeCode..
   * Convenience method using default BSDMSessionContext.
   * @param CreditCardTypeCodegetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CreditCardTypeCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CreditCardTypeCodeObjectData get (CreditCardTypeCodeObjectKeyData CreditCardTypeCodegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a CreditCardTypeCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param CreditCardTypeCodegetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CreditCardTypeCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CreditCardTypeCodeObjectData get (BSDMSessionContext context, CreditCardTypeCodeObjectKeyData CreditCardTypeCodegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find CreditCardTypeCodes..
   * Convenience method using default BSDMSessionContext.
   * @param CreditCardTypeCodefindIn Input Filter Object.
   * @return CreditCardTypeCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CreditCardTypeCodeObjectDataList find (CreditCardTypeCodeObjectFilter CreditCardTypeCodefindIn) throws BSDMResourceException;
  /**
   * Find CreditCardTypeCodes..
   * @param context The session context to use when connecting to the APITS server.
   * @param CreditCardTypeCodefindIn Input Filter Object.
   * @return CreditCardTypeCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CreditCardTypeCodeObjectDataList find (BSDMSessionContext context, CreditCardTypeCodeObjectFilter CreditCardTypeCodefindIn) throws BSDMResourceException;


  /**
   * Find CreditCardTypeCodes..
   * Convenience method using default BSDMSessionContext.
   * @param CreditCardTypeCodefindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CreditCardTypeCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CreditCardTypeCodeObjectDataList find (CreditCardTypeCodeObjectFilter CreditCardTypeCodefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find CreditCardTypeCodes..
   * @param context The session context to use when connecting to the APITS server.
   * @param CreditCardTypeCodefindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CreditCardTypeCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CreditCardTypeCodeObjectDataList find (BSDMSessionContext context, CreditCardTypeCodeObjectFilter CreditCardTypeCodefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
