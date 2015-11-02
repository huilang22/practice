/*
 * Generated code DO NOT EDIT
 * Generated file: InterimBillRequestHotBulkUdtTemplateItem.java
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
 * Class used to create a InterimBillRequestHotBulkUdtTemplateItem Bulk Template
 *
 */

public class InterimBillRequestHotBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InterimBillObjectData intBillHotIn;
  protected HotInvoiceObjectData Hot_Invoice;
/**
 *
 * Constructor to create a  InterimBillRequestHotBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InterimBillRequestHotBulkUdtTemplateItem(String id, BSDMSessionContext context, InterimBillObjectData intBillHotInIn, HotInvoiceObjectData Hot_InvoiceIn) {
    super(id, context, "InterimBillRequestHot");
    intBillHotIn = intBillHotInIn;
    Hot_Invoice = Hot_InvoiceIn;
  }

  public void translateToMap() {
    if (intBillHotIn != null) {
      intBillHotIn.resetFlags(true, true);
      addInput("InterimBill", InterimBillObjectHelper.toMap(intBillHotIn, new HashMap(), "InterimBill").get("InterimBill"));
    }
    if (Hot_Invoice != null) {
      Hot_Invoice.resetFlags(true, true);
      addInput("HotInvoice", HotInvoiceObjectHelper.toMap(Hot_Invoice, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }


/**
 *
 * Sets the InterimBill
 * @param intBillHotInIn Value of the intBillHotIn
 *
 */

  public void setInterimBill(InterimBillObjectData intBillHotInIn) {
    intBillHotIn = intBillHotInIn;
  }

/**
 *
 * Sets the HotInvoice
 * @param Hot_InvoiceIn Value of the Hot_Invoice
 *
 */

  public void setHotInvoice(HotInvoiceObjectData Hot_InvoiceIn) {
    Hot_Invoice = Hot_InvoiceIn;
  }

  public void translateFromMap() {
    intBillHotIn = InterimBillObjectHelper.fromMap(inputMap, "InterimBill");
    Hot_Invoice = HotInvoiceObjectHelper.fromMap(inputMap, "HotInvoice");
  }

/**
 *
 * Gets the InterimBill
 * @return Value of the InterimBill
 *
 */

  public InterimBillObjectData getInterimBill( ) {
    return intBillHotIn;
  }

/**
 *
 * Gets the HotInvoice
 * @return Value of the HotInvoice
 *
 */

  public HotInvoiceObjectData getHotInvoice( ) {
    return Hot_Invoice;
  }

}
