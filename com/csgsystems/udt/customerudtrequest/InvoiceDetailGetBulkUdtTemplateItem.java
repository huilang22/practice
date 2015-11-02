/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailGetBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceDetailGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceDetailGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceDetailObjectKeyData InvoiceDetailgetIn;
/**
 *
 * Constructor to create a  InvoiceDetailGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceDetailGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceDetailObjectKeyData InvoiceDetailgetInIn) {
    super(id, context, "InvoiceDetailGet");
    InvoiceDetailgetIn = InvoiceDetailgetInIn;
  }

  public void translateToMap() {
    if (InvoiceDetailgetIn != null) {
      InvoiceDetailgetIn.resetFlags(true, true);
      addInput("InvoiceDetail", InvoiceDetailObjectKeyHelper.toMap(InvoiceDetailgetIn, new HashMap(), "InvoiceDetailObjectKeyData").get("InvoiceDetailObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvoiceDetail
 * @param InvoiceDetailgetInIn Value of the InvoiceDetailgetIn
 *
 */

  public void setInvoiceDetail(InvoiceDetailObjectKeyData InvoiceDetailgetInIn) {
    InvoiceDetailgetIn = InvoiceDetailgetInIn;
  }

  public void translateFromMap() {
    InvoiceDetailgetIn = InvoiceDetailObjectKeyHelper.fromMap(inputMap, "InvoiceDetail");
  }

/**
 *
 * Gets the InvoiceDetail
 * @return Value of the InvoiceDetail
 *
 */

  public InvoiceDetailObjectKeyData getInvoiceDetail( ) {
    return InvoiceDetailgetIn;
  }

}
