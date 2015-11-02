
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
public interface BillImageInterface extends BaliInterface {

  /**
   * Retrieve a BillImage based upon its key..
   * Convenience method using default BSDMSessionContext.
   * @param bill_imageGetIn Input Object Key.
   * @return BillImageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillImageObjectData get (BillImageObjectKeyData bill_imageGetIn) throws BSDMResourceException;
  /**
   * Retrieve a BillImage based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_imageGetIn Input Object Key.
   * @return BillImageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillImageObjectData get (BSDMSessionContext context, BillImageObjectKeyData bill_imageGetIn) throws BSDMResourceException;


  /**
   * Retrieve a BillImage based upon its key..
   * Convenience method using default BSDMSessionContext.
   * @param bill_imageGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillImageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillImageObjectData get (BillImageObjectKeyData bill_imageGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a BillImage based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_imageGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillImageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillImageObjectData get (BSDMSessionContext context, BillImageObjectKeyData bill_imageGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find BillImages that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param bill_imageFindIn Input Filter Object.
   * @return BillImageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillImageObjectDataList find (BillImageObjectFilter bill_imageFindIn) throws BSDMResourceException;
  /**
   * Find BillImages that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_imageFindIn Input Filter Object.
   * @return BillImageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillImageObjectDataList find (BSDMSessionContext context, BillImageObjectFilter bill_imageFindIn) throws BSDMResourceException;


  /**
   * Find BillImages that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param bill_imageFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillImageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillImageObjectDataList find (BillImageObjectFilter bill_imageFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find BillImages that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_imageFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillImageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillImageObjectDataList find (BSDMSessionContext context, BillImageObjectFilter bill_imageFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
