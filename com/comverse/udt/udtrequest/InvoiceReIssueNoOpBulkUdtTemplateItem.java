/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceReIssueNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoiceReIssueNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoiceReIssueNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvoiceObjectData noOpIn;

/**
 *
 * Constructor to create a   InvoiceReIssueNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoiceReIssueNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectData noOpInIn) {
    super(id, context, "InvoiceReIssue");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Invoice", InvoiceObjectHelper.toMap(noOpIn, new HashMap(), "Invoice").get("Invoice"));
    }
  }
/**
 *
 * Sets the  Invoice
 * @param noOpInIn InvoiceObjectData to set
 *
 */
  public void setInvoice(InvoiceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Invoice passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceObjectData getInvoice() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvoiceObjectHelper.fromMap(inputMap, "Invoice");
  }
}
