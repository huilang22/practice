/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceFindBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceObjectFilter InvoicefindIn;
/**
 *
 * Constructor to create a  InvoiceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectFilter InvoicefindInIn) {
    super(id, context, "InvoiceFind");
    InvoicefindIn = InvoicefindInIn;
  }

  public void translateToMap() {
    if (InvoicefindIn != null) {
      Integer index =  InvoicefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Invoice", InvoiceObjectHelper.toMap(InvoicefindIn, new HashMap(), "Invoice").get("Invoice"));
    }
  }


/**
 *
 * Sets the Invoice
 * @param InvoicefindInIn Value of the InvoicefindIn
 *
 */

  public void setInvoice(InvoiceObjectFilter InvoicefindInIn) {
    InvoicefindIn = InvoicefindInIn;
  }

  public void translateFromMap() {
    InvoicefindIn = InvoiceObjectHelper.fromMapFilter(inputMap, "Invoice");
  }

/**
 *
 * Gets the Invoice
 * @return Value of the Invoice
 *
 */

  public InvoiceObjectFilter getInvoice( ) {
    return InvoicefindIn;
  }

}
