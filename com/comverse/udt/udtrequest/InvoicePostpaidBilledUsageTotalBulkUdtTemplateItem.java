/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePostpaidBilledUsageTotalBulkUdtTemplateItem.java
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
 * Class used to create a InvoicePostpaidBilledUsageTotalBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoicePostpaidBilledUsageTotalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceObjectKeyData totalBUIn;
/**
 *
 * Constructor to create a  InvoicePostpaidBilledUsageTotalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoicePostpaidBilledUsageTotalBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectKeyData totalBUInIn) {
    super(id, context, "InvoicePostpaidBilledUsageTotal");
    totalBUIn = totalBUInIn;
  }

  public void translateToMap() {
    if (totalBUIn != null) {
      totalBUIn.resetFlags(true, true);
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(totalBUIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
  }


/**
 *
 * Sets the Invoice
 * @param totalBUInIn Value of the totalBUIn
 *
 */

  public void setInvoice(InvoiceObjectKeyData totalBUInIn) {
    totalBUIn = totalBUInIn;
  }

  public void translateFromMap() {
    totalBUIn = InvoiceObjectKeyHelper.fromMap(inputMap, "Invoice");
  }

/**
 *
 * Gets the Invoice
 * @return Value of the Invoice
 *
 */

  public InvoiceObjectKeyData getInvoice( ) {
    return totalBUIn;
  }

}
