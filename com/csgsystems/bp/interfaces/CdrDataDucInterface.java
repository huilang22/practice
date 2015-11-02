
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
public interface CdrDataDucInterface extends BaliInterface {

  /**
   * Convenience method using default BSDMSessionContext.
   * @param CdrDataDucFindIn Input Filter Object.
   * @return CdrDataDucObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CdrDataDucObjectDataList find (CdrDataDucObjectFilter CdrDataDucFindIn) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CdrDataDucFindIn Input Filter Object.
   * @return CdrDataDucObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public CdrDataDucObjectDataList find (BSDMSessionContext context, CdrDataDucObjectFilter CdrDataDucFindIn) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param CdrDataDucFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CdrDataDucObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public CdrDataDucObjectDataList find (CdrDataDucObjectFilter CdrDataDucFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CdrDataDucFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return CdrDataDucObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public CdrDataDucObjectDataList find (BSDMSessionContext context, CdrDataDucObjectFilter CdrDataDucFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
