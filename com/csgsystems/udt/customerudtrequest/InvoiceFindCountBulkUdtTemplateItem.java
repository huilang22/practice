/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceFindCountBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceObjectFilter InvoicefindCountIn;
/**
 *
 * Constructor to create a  InvoiceFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectFilter InvoicefindCountInIn) {
    super(id, context, "InvoiceFindCount");
    InvoicefindCountIn = InvoicefindCountInIn;
  }

  public void translateToMap() {
    if (InvoicefindCountIn != null) {
      Integer index =  InvoicefindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Invoice", InvoiceObjectHelper.toMap(InvoicefindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the Invoice
 * @param InvoicefindCountInIn Value of the InvoicefindCountIn
 *
 */

  public void setInvoice(InvoiceObjectFilter InvoicefindCountInIn) {
    InvoicefindCountIn = InvoicefindCountInIn;
  }

  public void translateFromMap() {
    InvoicefindCountIn = InvoiceObjectHelper.fromMapFilter(inputMap, "Invoice");
  }

/**
 *
 * Gets the Invoice
 * @return Value of the Invoice
 *
 */

  public InvoiceObjectFilter getInvoice( ) {
    return InvoicefindCountIn;
  }

}
