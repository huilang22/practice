
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
public interface OrderQuoteInterface extends BaliInterface {

  /**
   * Retrieves bill invoices and specific charges for the order associated with the charge elemements passed in..
   * Convenience method using default BSDMSessionContext.
   * @param oqqpChargesIn Input List Object.
   * @param asOfDate.
   * @param accountNo.
   * @param invoiceCount.
   * @return BillInvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInvoiceObjectDataList quotePrice (ChargeElementObjectData[] oqqpChargesIn, Date asOfDate, Integer accountNo, Integer invoiceCount) throws BSDMResourceException;
  /**
   * Retrieves bill invoices and specific charges for the order associated with the charge elemements passed in..
   * @param context The session context to use when connecting to the APITS server.
   * @param oqqpChargesIn Input List Object.
   * @param asOfDate.
   * @param accountNo.
   * @param invoiceCount.
   * @return BillInvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public BillInvoiceObjectDataList quotePrice (BSDMSessionContext context, ChargeElementObjectData[] oqqpChargesIn, Date asOfDate, Integer accountNo, Integer invoiceCount) throws BSDMResourceException;


  /**
   * Retrieves bill invoices and specific charges for the order associated with the charge elemements passed in..
   * Convenience method using default BSDMSessionContext.
   * @param oqqpChargesIn Input List Object.
   * @param asOfDate.
   * @param accountNo.
   * @param invoiceCount.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public BillInvoiceObjectDataList quotePrice (ChargeElementObjectData[] oqqpChargesIn, Date asOfDate, Integer accountNo, Integer invoiceCount, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieves bill invoices and specific charges for the order associated with the charge elemements passed in..
   * @param context The session context to use when connecting to the APITS server.
   * @param oqqpChargesIn Input List Object.
   * @param asOfDate.
   * @param accountNo.
   * @param invoiceCount.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return BillInvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public BillInvoiceObjectDataList quotePrice (BSDMSessionContext context, ChargeElementObjectData[] oqqpChargesIn, Date asOfDate, Integer accountNo, Integer invoiceCount, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
