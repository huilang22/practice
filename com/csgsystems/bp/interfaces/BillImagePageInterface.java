
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
public interface BillImagePageInterface extends BaliInterface {

  /**
   * Find indicated bill image page text..
   * Convenience method using default BSDMSessionContext.
   * @param BillImagePageFindIn Input Filter Object.  Read-Only fields: PageNo.
   * @param account_active_date (has a default).
   * @return BillImagePageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillImagePageObjectDataList find (BillImagePageObjectFilter BillImagePageFindIn, Date account_active_date) throws BSDMResourceException;
  /**
   * Find indicated bill image page text..
   * @param context The session context to use when connecting to the APITS server.
   * @param BillImagePageFindIn Input Filter Object.  Read-Only fields: PageNo.
   * @param account_active_date (has a default).
   * @return BillImagePageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillImagePageObjectDataList find (BSDMSessionContext context, BillImagePageObjectFilter BillImagePageFindIn, Date account_active_date) throws BSDMResourceException;


  /**
   * Find indicated bill image page text..
   * Convenience method using default BSDMSessionContext.
   * @param BillImagePageFindIn Input Filter Object.  Read-Only fields: PageNo.
   * @param account_active_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillImagePageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillImagePageObjectDataList find (BillImagePageObjectFilter BillImagePageFindIn, Date account_active_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find indicated bill image page text..
   * @param context The session context to use when connecting to the APITS server.
   * @param BillImagePageFindIn Input Filter Object.  Read-Only fields: PageNo.
   * @param account_active_date (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillImagePageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillImagePageObjectDataList find (BSDMSessionContext context, BillImagePageObjectFilter BillImagePageFindIn, Date account_active_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
