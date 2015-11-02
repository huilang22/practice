/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceReissueFindBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceReissueFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceReissueFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceObjectFilter InvoiceRfindIn;
/**
 *
 * Constructor to create a  InvoiceReissueFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceReissueFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectFilter InvoiceRfindInIn) {
    super(id, context, "InvoiceReissueFind");
    InvoiceRfindIn = InvoiceRfindInIn;
  }

  public void translateToMap() {
    if (InvoiceRfindIn != null) {
      Integer index =  InvoiceRfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Invoice", InvoiceObjectHelper.toMap(InvoiceRfindIn, new HashMap(), "Invoice").get("Invoice"));
    }
  }


/**
 *
 * Sets the Invoice
 * @param InvoiceRfindInIn Value of the InvoiceRfindIn
 *
 */

  public void setInvoice(InvoiceObjectFilter InvoiceRfindInIn) {
    InvoiceRfindIn = InvoiceRfindInIn;
  }

  public void translateFromMap() {
    InvoiceRfindIn = InvoiceObjectHelper.fromMapFilter(inputMap, "Invoice");
  }

/**
 *
 * Gets the Invoice
 * @return Value of the Invoice
 *
 */

  public InvoiceObjectFilter getInvoice( ) {
    return InvoiceRfindIn;
  }

}
