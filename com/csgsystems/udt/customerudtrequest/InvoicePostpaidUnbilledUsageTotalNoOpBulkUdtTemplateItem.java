/*
 * Generated code DO NOT EDIT
 * Generated file: InvoicePostpaidUnbilledUsageTotalNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoicePostpaidUnbilledUsageTotalNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoicePostpaidUnbilledUsageTotalNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvoicePostpaidUnbilledUsageTotalOutputData noOpIn;

/**
 *
 * Constructor to create a   InvoicePostpaidUnbilledUsageTotalNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoicePostpaidUnbilledUsageTotalNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoicePostpaidUnbilledUsageTotalOutputData noOpInIn) {
    super(id, context, "InvoicePostpaidUnbilledUsageTotal");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvoicePostpaidUnbilledUsageTotalOutputData", InvoicePostpaidUnbilledUsageTotalOutputHelper.toMap(noOpIn).get("InvoicePostpaidUnbilledUsageTotalOutputData"));
    }
  }
/**
 *
 * Sets the  InvoicePostpaidUnbilledUsageTotalOutputData
 * @param noOpInIn InvoicePostpaidUnbilledUsageTotalOutputData to set
 *
 */
  public void setInvoicePostpaidUnbilledUsageTotalOutputData(InvoicePostpaidUnbilledUsageTotalOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvoicePostpaidUnbilledUsageTotalOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoicePostpaidUnbilledUsageTotalOutputData getInvoicePostpaidUnbilledUsageTotalOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvoicePostpaidUnbilledUsageTotalOutputHelper.fromMap(inputMap);
  }
}
