/*
 * Generated code DO NOT EDIT
 * Generated file: InvoicePrepaidBilledUsageTotalBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a InvoicePrepaidBilledUsageTotalBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoicePrepaidBilledUsageTotalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceObjectKeyData totalBUPIn;
/**
 *
 * Constructor to create a  InvoicePrepaidBilledUsageTotalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoicePrepaidBilledUsageTotalBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectKeyData totalBUPInIn) {
    super(id, context, "InvoicePrepaidBilledUsageTotal");
    totalBUPIn = totalBUPInIn;
  }

  public void translateToMap() {
    if (totalBUPIn != null) {
      totalBUPIn.resetFlags(true, true);
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(totalBUPIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
  }


/**
 *
 * Sets the Invoice
 * @param totalBUPInIn Value of the totalBUPIn
 *
 */

  public void setInvoice(InvoiceObjectKeyData totalBUPInIn) {
    totalBUPIn = totalBUPInIn;
  }

  public void translateFromMap() {
    totalBUPIn = InvoiceObjectKeyHelper.fromMap(inputMap, "Invoice");
  }

/**
 *
 * Gets the Invoice
 * @return Value of the Invoice
 *
 */

  public InvoiceObjectKeyData getInvoice( ) {
    return totalBUPIn;
  }

}
