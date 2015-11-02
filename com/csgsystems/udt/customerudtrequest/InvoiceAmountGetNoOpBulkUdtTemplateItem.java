/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceAmountGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoiceAmountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoiceAmountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvoiceAmountObjectData noOpIn;

/**
 *
 * Constructor to create a   InvoiceAmountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoiceAmountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceAmountObjectData noOpInIn) {
    super(id, context, "InvoiceAmountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvoiceAmount", InvoiceAmountObjectHelper.toMap(noOpIn, new HashMap(), "InvoiceAmount").get("InvoiceAmount"));
    }
  }
/**
 *
 * Sets the  InvoiceAmount
 * @param noOpInIn InvoiceAmountObjectData to set
 *
 */
  public void setInvoiceAmount(InvoiceAmountObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvoiceAmount passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceAmountObjectData getInvoiceAmount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvoiceAmountObjectHelper.fromMap(inputMap, "InvoiceAmount");
  }
}
