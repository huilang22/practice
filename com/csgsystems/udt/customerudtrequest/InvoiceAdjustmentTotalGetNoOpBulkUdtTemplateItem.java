/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceAdjustmentTotalGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoiceAdjustmentTotalGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoiceAdjustmentTotalGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BigInteger noOpIn;

/**
 *
 * Constructor to create a   InvoiceAdjustmentTotalGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoiceAdjustmentTotalGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger noOpInIn) {
    super(id, context, "InvoiceAdjustmentTotalGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("TotalAmount", noOpIn);
    }
  }
/**
 *
 * Sets the  TotalAmount
 * @param noOpInIn BigInteger to set
 *
 */
  public void setTotalAmount(BigInteger noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TotalAmount passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getTotalAmount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (BigInteger)inputMap.get("TotalAmount");
  }
}
