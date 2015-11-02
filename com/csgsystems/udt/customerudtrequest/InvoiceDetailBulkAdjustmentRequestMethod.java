/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailBulkAdjustmentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvoiceDetailBulkAdjustmentRequestMethod implements UdtMethod {
  private String method = null;
  private InvoiceDetailBulkAdjustmentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvoiceDetailBulkAdjustmentCreate method */
  public static final InvoiceDetailBulkAdjustmentRequestMethod INVOICE_DETAIL_BULK_ADJUSTMENT_CREATE = new InvoiceDetailBulkAdjustmentRequestMethod("InvoiceDetailBulkAdjustmentCreate");
  /** Variable representing the InvoiceDetailBulkAdjustmentGet method */
  public static final InvoiceDetailBulkAdjustmentRequestMethod INVOICE_DETAIL_BULK_ADJUSTMENT_GET = new InvoiceDetailBulkAdjustmentRequestMethod("InvoiceDetailBulkAdjustmentGet");
  /** Variable representing the InvoiceDetailBulkAdjustmentUpdate method */
  public static final InvoiceDetailBulkAdjustmentRequestMethod INVOICE_DETAIL_BULK_ADJUSTMENT_UPDATE = new InvoiceDetailBulkAdjustmentRequestMethod("InvoiceDetailBulkAdjustmentUpdate");
}
