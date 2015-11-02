/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDateRescheduleBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a PaymentDateRescheduleBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentDateRescheduleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceObjectKeyData InvoiceUpdateIn;
  protected Date payment_due_date;
/**
 *
 * Constructor to create a  PaymentDateRescheduleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentDateRescheduleBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectKeyData InvoiceUpdateInIn, Date payment_due_dateIn) {
    super(id, context, "PaymentDateReschedule");
    InvoiceUpdateIn = InvoiceUpdateInIn;
    payment_due_date = payment_due_dateIn;
  }

  public void translateToMap() {
    if (InvoiceUpdateIn != null) {
      InvoiceUpdateIn.resetFlags(true, true);
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(InvoiceUpdateIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
    if (payment_due_date != null) {
      addInput("PaymentDueDate", payment_due_date);
    }
  }


/**
 *
 * Sets the Invoice
 * @param InvoiceUpdateInIn Value of the InvoiceUpdateIn
 *
 */

  public void setInvoice(InvoiceObjectKeyData InvoiceUpdateInIn) {
    InvoiceUpdateIn = InvoiceUpdateInIn;
  }

/**
 *
 * Sets the PaymentDueDate
 * @param payment_due_dateIn Value of the payment_due_date
 *
 */

  public void setPaymentDueDate(Date payment_due_dateIn) {
    payment_due_date = payment_due_dateIn;
  }

  public void translateFromMap() {
    InvoiceUpdateIn = InvoiceObjectKeyHelper.fromMap(inputMap, "Invoice");
    payment_due_date = (Date)inputMap.get("PaymentDueDate");
  }

/**
 *
 * Gets the Invoice
 * @return Value of the Invoice
 *
 */

  public InvoiceObjectKeyData getInvoice( ) {
    return InvoiceUpdateIn;
  }

/**
 *
 * Gets the PaymentDueDate
 * @return Value of the PaymentDueDate
 *
 */

  public Date getPaymentDueDate( ) {
    return payment_due_date;
  }

}
