/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceBalanceSummaryBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceBalanceSummaryBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceBalanceSummaryBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceObjectData InvoiceBalSumIn;
/**
 *
 * Constructor to create a  InvoiceBalanceSummaryBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceBalanceSummaryBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectData InvoiceBalSumInIn) {
    super(id, context, "InvoiceBalanceSummary");
    InvoiceBalSumIn = InvoiceBalSumInIn;
  }

  public void translateToMap() {
    if (InvoiceBalSumIn != null) {
      InvoiceBalSumIn.resetFlags(true, true);
      addInput("Invoice", InvoiceObjectHelper.toMap(InvoiceBalSumIn, new HashMap(), "InvoiceBalanceSummaryOutputData").get("InvoiceBalanceSummaryOutputData"));
    }
  }


/**
 *
 * Sets the Invoice
 * @param InvoiceBalSumInIn Value of the InvoiceBalSumIn
 *
 */

  public void setInvoice(InvoiceObjectData InvoiceBalSumInIn) {
    InvoiceBalSumIn = InvoiceBalSumInIn;
  }

  public void translateFromMap() {
    InvoiceBalSumIn = InvoiceObjectHelper.fromMap(inputMap, "Invoice");
  }

/**
 *
 * Gets the Invoice
 * @return Value of the Invoice
 *
 */

  public InvoiceObjectData getInvoice( ) {
    return InvoiceBalSumIn;
  }

}
