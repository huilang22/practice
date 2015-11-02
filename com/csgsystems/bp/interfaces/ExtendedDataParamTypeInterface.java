
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
public interface ExtendedDataParamTypeInterface extends BaliInterface {

  /**
   * Find ExtendedDataParam rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PDFindIn Input Filter Object.
   * @return XPTObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public XPTObjectDataList find (XPTObjectFilter PDFindIn) throws BSDMResourceException;
  /**
   * Find ExtendedDataParam rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDFindIn Input Filter Object.
   * @return XPTObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public XPTObjectDataList find (BSDMSessionContext context, XPTObjectFilter PDFindIn) throws BSDMResourceException;


  /**
   * Find ExtendedDataParam rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return XPTObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public XPTObjectDataList find (XPTObjectFilter PDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ExtendedDataParam rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PDFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return XPTObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public XPTObjectDataList find (BSDMSessionContext context, XPTObjectFilter PDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
