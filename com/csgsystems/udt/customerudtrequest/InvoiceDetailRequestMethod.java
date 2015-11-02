/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvoiceDetailRequestMethod implements UdtMethod {
  private String method = null;
  private InvoiceDetailRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillInvoiceDetailAmountGet method */
  public static final InvoiceDetailRequestMethod BILL_INVOICE_DETAIL_AMOUNT_GET = new InvoiceDetailRequestMethod("BillInvoiceDetailAmountGet");
  /** Variable representing the InvoiceDetailAdjust method */
  public static final InvoiceDetailRequestMethod INVOICE_DETAIL_ADJUST = new InvoiceDetailRequestMethod("InvoiceDetailAdjust");
  /** Variable representing the InvoiceDetailAdjustmentFind method */
  public static final InvoiceDetailRequestMethod INVOICE_DETAIL_ADJUSTMENT_FIND = new InvoiceDetailRequestMethod("InvoiceDetailAdjustmentFind");
  /** Variable representing the InvoiceDetailAmountGet method */
  public static final InvoiceDetailRequestMethod INVOICE_DETAIL_AMOUNT_GET = new InvoiceDetailRequestMethod("InvoiceDetailAmountGet");
  /** Variable representing the InvoiceDetailByAccountFind method */
  public static final InvoiceDetailRequestMethod INVOICE_DETAIL_BY_ACCOUNT_FIND = new InvoiceDetailRequestMethod("InvoiceDetailByAccountFind");
  /** Variable representing the InvoiceDetailByAccountFindCount method */
  public static final InvoiceDetailRequestMethod INVOICE_DETAIL_BY_ACCOUNT_FIND_COUNT = new InvoiceDetailRequestMethod("InvoiceDetailByAccountFindCount");
  /** Variable representing the InvoiceDetailFind method */
  public static final InvoiceDetailRequestMethod INVOICE_DETAIL_FIND = new InvoiceDetailRequestMethod("InvoiceDetailFind");
  /** Variable representing the InvoiceDetailFindCount method */
  public static final InvoiceDetailRequestMethod INVOICE_DETAIL_FIND_COUNT = new InvoiceDetailRequestMethod("InvoiceDetailFindCount");
  /** Variable representing the InvoiceDetailGet method */
  public static final InvoiceDetailRequestMethod INVOICE_DETAIL_GET = new InvoiceDetailRequestMethod("InvoiceDetailGet");
}
