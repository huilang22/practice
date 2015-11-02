/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentDateRescheduleNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentDateRescheduleNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentDateRescheduleNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvoiceObjectData noOpIn;

/**
 *
 * Constructor to create a   PaymentDateRescheduleNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentDateRescheduleNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectData noOpInIn) {
    super(id, context, "PaymentDateReschedule");
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
