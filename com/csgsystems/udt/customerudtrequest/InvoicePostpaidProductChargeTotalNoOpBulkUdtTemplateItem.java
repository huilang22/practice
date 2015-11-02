/*
 * Generated code DO NOT EDIT
 * Generated file: InvoicePostpaidProductChargeTotalNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoicePostpaidProductChargeTotalNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoicePostpaidProductChargeTotalNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvoicePostpaidProductChargeTotalOutputData noOpIn;

/**
 *
 * Constructor to create a   InvoicePostpaidProductChargeTotalNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoicePostpaidProductChargeTotalNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoicePostpaidProductChargeTotalOutputData noOpInIn) {
    super(id, context, "InvoicePostpaidProductChargeTotal");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvoicePostpaidProductChargeTotalOutputData", InvoicePostpaidProductChargeTotalOutputHelper.toMap(noOpIn).get("InvoicePostpaidProductChargeTotalOutputData"));
    }
  }
/**
 *
 * Sets the  InvoicePostpaidProductChargeTotalOutputData
 * @param noOpInIn InvoicePostpaidProductChargeTotalOutputData to set
 *
 */
  public void setInvoicePostpaidProductChargeTotalOutputData(InvoicePostpaidProductChargeTotalOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvoicePostpaidProductChargeTotalOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoicePostpaidProductChargeTotalOutputData getInvoicePostpaidProductChargeTotalOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvoicePostpaidProductChargeTotalOutputHelper.fromMap(inputMap);
  }
}
