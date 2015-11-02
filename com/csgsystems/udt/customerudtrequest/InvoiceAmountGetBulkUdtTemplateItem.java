/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceAmountGetBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceAmountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceAmountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceObjectKeyData InvoiceAmountGetIn;
/**
 *
 * Constructor to create a  InvoiceAmountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceAmountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectKeyData InvoiceAmountGetInIn) {
    super(id, context, "InvoiceAmountGet");
    InvoiceAmountGetIn = InvoiceAmountGetInIn;
  }

  public void translateToMap() {
    if (InvoiceAmountGetIn != null) {
      InvoiceAmountGetIn.resetFlags(true, true);
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(InvoiceAmountGetIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
  }


/**
 *
 * Sets the Invoice
 * @param InvoiceAmountGetInIn Value of the InvoiceAmountGetIn
 *
 */

  public void setInvoice(InvoiceObjectKeyData InvoiceAmountGetInIn) {
    InvoiceAmountGetIn = InvoiceAmountGetInIn;
  }

  public void translateFromMap() {
    InvoiceAmountGetIn = InvoiceObjectKeyHelper.fromMap(inputMap, "Invoice");
  }

/**
 *
 * Gets the Invoice
 * @return Value of the Invoice
 *
 */

  public InvoiceObjectKeyData getInvoice( ) {
    return InvoiceAmountGetIn;
  }

}
