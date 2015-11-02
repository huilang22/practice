/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceSummaryGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoiceSummaryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoiceSummaryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvoiceSummaryObjectData noOpIn;

/**
 *
 * Constructor to create a   InvoiceSummaryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoiceSummaryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceSummaryObjectData noOpInIn) {
    super(id, context, "InvoiceSummaryGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvoiceSummary", InvoiceSummaryObjectHelper.toMap(noOpIn, new HashMap(), "InvoiceSummary").get("InvoiceSummary"));
    }
  }
/**
 *
 * Sets the  InvoiceSummary
 * @param noOpInIn InvoiceSummaryObjectData to set
 *
 */
  public void setInvoiceSummary(InvoiceSummaryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvoiceSummary passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceSummaryObjectData getInvoiceSummary() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvoiceSummaryObjectHelper.fromMap(inputMap, "InvoiceSummary");
  }
}
