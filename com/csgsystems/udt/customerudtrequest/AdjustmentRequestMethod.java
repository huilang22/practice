/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AdjustmentRequestMethod implements UdtMethod {
  private String method = null;
  private AdjustmentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AdjustmentApprove method */
  public static final AdjustmentRequestMethod ADJUSTMENT_APPROVE = new AdjustmentRequestMethod("AdjustmentApprove");
  /** Variable representing the AdjustmentCancel method */
  public static final AdjustmentRequestMethod ADJUSTMENT_CANCEL = new AdjustmentRequestMethod("AdjustmentCancel");
  /** Variable representing the AdjustmentCreate method */
  public static final AdjustmentRequestMethod ADJUSTMENT_CREATE = new AdjustmentRequestMethod("AdjustmentCreate");
  /** Variable representing the AdjustmentDeny method */
  public static final AdjustmentRequestMethod ADJUSTMENT_DENY = new AdjustmentRequestMethod("AdjustmentDeny");
  /** Variable representing the AdjustmentFind method */
  public static final AdjustmentRequestMethod ADJUSTMENT_FIND = new AdjustmentRequestMethod("AdjustmentFind");
  /** Variable representing the AdjustmentFindCount method */
  public static final AdjustmentRequestMethod ADJUSTMENT_FIND_COUNT = new AdjustmentRequestMethod("AdjustmentFindCount");
  /** Variable representing the AdjustmentGet method */
  public static final AdjustmentRequestMethod ADJUSTMENT_GET = new AdjustmentRequestMethod("AdjustmentGet");
  /** Variable representing the AdjustmentModify method */
  public static final AdjustmentRequestMethod ADJUSTMENT_MODIFY = new AdjustmentRequestMethod("AdjustmentModify");
  /** Variable representing the AdjustmentNoBackoutFind method */
  public static final AdjustmentRequestMethod ADJUSTMENT_NO_BACKOUT_FIND = new AdjustmentRequestMethod("AdjustmentNoBackoutFind");
  /** Variable representing the AdjustmentNoBackoutFindCount method */
  public static final AdjustmentRequestMethod ADJUSTMENT_NO_BACKOUT_FIND_COUNT = new AdjustmentRequestMethod("AdjustmentNoBackoutFindCount");
  /** Variable representing the AdjustmentUpdate method */
  public static final AdjustmentRequestMethod ADJUSTMENT_UPDATE = new AdjustmentRequestMethod("AdjustmentUpdate");
  /** Variable representing the InvoiceAdjustmentTotalGet method */
  public static final AdjustmentRequestMethod INVOICE_ADJUSTMENT_TOTAL_GET = new AdjustmentRequestMethod("InvoiceAdjustmentTotalGet");
}
