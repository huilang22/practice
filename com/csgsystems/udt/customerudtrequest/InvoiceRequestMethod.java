/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvoiceRequestMethod implements UdtMethod {
  private String method = null;
  private InvoiceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvoiceAmountGet method */
  public static final InvoiceRequestMethod INVOICE_AMOUNT_GET = new InvoiceRequestMethod("InvoiceAmountGet");
  /** Variable representing the InvoiceBalanceSummary method */
  public static final InvoiceRequestMethod INVOICE_BALANCE_SUMMARY = new InvoiceRequestMethod("InvoiceBalanceSummary");
  /** Variable representing the InvoiceFind method */
  public static final InvoiceRequestMethod INVOICE_FIND = new InvoiceRequestMethod("InvoiceFind");
  /** Variable representing the InvoiceFindCount method */
  public static final InvoiceRequestMethod INVOICE_FIND_COUNT = new InvoiceRequestMethod("InvoiceFindCount");
  /** Variable representing the InvoiceGet method */
  public static final InvoiceRequestMethod INVOICE_GET = new InvoiceRequestMethod("InvoiceGet");
  /** Variable representing the InvoicePostpaidBilledUsageTotal method */
  public static final InvoiceRequestMethod INVOICE_POSTPAID_BILLED_USAGE_TOTAL = new InvoiceRequestMethod("InvoicePostpaidBilledUsageTotal");
  /** Variable representing the InvoicePostpaidProductChargeTotal method */
  public static final InvoiceRequestMethod INVOICE_POSTPAID_PRODUCT_CHARGE_TOTAL = new InvoiceRequestMethod("InvoicePostpaidProductChargeTotal");
  /** Variable representing the InvoicePostpaidUnbilledUsageTotal method */
  public static final InvoiceRequestMethod INVOICE_POSTPAID_UNBILLED_USAGE_TOTAL = new InvoiceRequestMethod("InvoicePostpaidUnbilledUsageTotal");
  /** Variable representing the InvoicePrepaidBilledUsageTotal method */
  public static final InvoiceRequestMethod INVOICE_PREPAID_BILLED_USAGE_TOTAL = new InvoiceRequestMethod("InvoicePrepaidBilledUsageTotal");
  /** Variable representing the InvoicePrepaidProductChargeTotal method */
  public static final InvoiceRequestMethod INVOICE_PREPAID_PRODUCT_CHARGE_TOTAL = new InvoiceRequestMethod("InvoicePrepaidProductChargeTotal");
  /** Variable representing the InvoicePrepaidUnbilledUsageTotal method */
  public static final InvoiceRequestMethod INVOICE_PREPAID_UNBILLED_USAGE_TOTAL = new InvoiceRequestMethod("InvoicePrepaidUnbilledUsageTotal");
  /** Variable representing the InvoiceReIssue method */
  public static final InvoiceRequestMethod INVOICE_RE_ISSUE = new InvoiceRequestMethod("InvoiceReIssue");
  /** Variable representing the InvoiceReissueFind method */
  public static final InvoiceRequestMethod INVOICE_REISSUE_FIND = new InvoiceRequestMethod("InvoiceReissueFind");
  /** Variable representing the InvoiceReissueGet method */
  public static final InvoiceRequestMethod INVOICE_REISSUE_GET = new InvoiceRequestMethod("InvoiceReissueGet");
  /** Variable representing the InvoiceSummaryGet method */
  public static final InvoiceRequestMethod INVOICE_SUMMARY_GET = new InvoiceRequestMethod("InvoiceSummaryGet");
  /** Variable representing the PaymentDateReschedule method */
  public static final InvoiceRequestMethod PAYMENT_DATE_RESCHEDULE = new InvoiceRequestMethod("PaymentDateReschedule");
}
