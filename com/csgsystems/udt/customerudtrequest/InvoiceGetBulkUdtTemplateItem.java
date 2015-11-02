/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceGetBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceObjectKeyData InvoicegetIn;
/**
 *
 * Constructor to create a  InvoiceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectKeyData InvoicegetInIn) {
    super(id, context, "InvoiceGet");
    InvoicegetIn = InvoicegetInIn;
  }

  public void translateToMap() {
    if (InvoicegetIn != null) {
      InvoicegetIn.resetFlags(true, true);
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(InvoicegetIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
  }


/**
 *
 * Sets the Invoice
 * @param InvoicegetInIn Value of the InvoicegetIn
 *
 */

  public void setInvoice(InvoiceObjectKeyData InvoicegetInIn) {
    InvoicegetIn = InvoicegetInIn;
  }

  public void translateFromMap() {
    InvoicegetIn = InvoiceObjectKeyHelper.fromMap(inputMap, "Invoice");
  }

/**
 *
 * Gets the Invoice
 * @return Value of the Invoice
 *
 */

  public InvoiceObjectKeyData getInvoice( ) {
    return InvoicegetIn;
  }

}
