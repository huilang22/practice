/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceSummaryGetBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceSummaryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceSummaryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceObjectKeyData InvoiceSumgetIn;
/**
 *
 * Constructor to create a  InvoiceSummaryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceSummaryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectKeyData InvoiceSumgetInIn) {
    super(id, context, "InvoiceSummaryGet");
    InvoiceSumgetIn = InvoiceSumgetInIn;
  }

  public void translateToMap() {
    if (InvoiceSumgetIn != null) {
      InvoiceSumgetIn.resetFlags(true, true);
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(InvoiceSumgetIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
  }


/**
 *
 * Sets the Invoice
 * @param InvoiceSumgetInIn Value of the InvoiceSumgetIn
 *
 */

  public void setInvoice(InvoiceObjectKeyData InvoiceSumgetInIn) {
    InvoiceSumgetIn = InvoiceSumgetInIn;
  }

  public void translateFromMap() {
    InvoiceSumgetIn = InvoiceObjectKeyHelper.fromMap(inputMap, "Invoice");
  }

/**
 *
 * Gets the Invoice
 * @return Value of the Invoice
 *
 */

  public InvoiceObjectKeyData getInvoice( ) {
    return InvoiceSumgetIn;
  }

}
