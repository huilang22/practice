/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceBalanceSummaryNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoiceBalanceSummaryNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoiceBalanceSummaryNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvoiceBalanceSummaryOutputData noOpIn;

/**
 *
 * Constructor to create a   InvoiceBalanceSummaryNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoiceBalanceSummaryNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceBalanceSummaryOutputData noOpInIn) {
    super(id, context, "InvoiceBalanceSummary");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvoiceBalanceSummaryOutputData", InvoiceBalanceSummaryOutputHelper.toMap(noOpIn).get("InvoiceBalanceSummaryOutputData"));
    }
  }
/**
 *
 * Sets the  InvoiceBalanceSummaryOutputData
 * @param noOpInIn InvoiceBalanceSummaryOutputData to set
 *
 */
  public void setInvoiceBalanceSummaryOutputData(InvoiceBalanceSummaryOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvoiceBalanceSummaryOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceBalanceSummaryOutputData getInvoiceBalanceSummaryOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvoiceBalanceSummaryOutputHelper.fromMap(inputMap);
  }
}
