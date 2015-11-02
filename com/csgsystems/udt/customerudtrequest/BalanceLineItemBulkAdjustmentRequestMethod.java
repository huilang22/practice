/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceLineItemBulkAdjustmentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BalanceLineItemBulkAdjustmentRequestMethod implements UdtMethod {
  private String method = null;
  private BalanceLineItemBulkAdjustmentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BalanceLineItemBulkAdjustmentCreate method */
  public static final BalanceLineItemBulkAdjustmentRequestMethod BALANCE_LINE_ITEM_BULK_ADJUSTMENT_CREATE = new BalanceLineItemBulkAdjustmentRequestMethod("BalanceLineItemBulkAdjustmentCreate");
  /** Variable representing the BalanceLineItemBulkAdjustmentGet method */
  public static final BalanceLineItemBulkAdjustmentRequestMethod BALANCE_LINE_ITEM_BULK_ADJUSTMENT_GET = new BalanceLineItemBulkAdjustmentRequestMethod("BalanceLineItemBulkAdjustmentGet");
  /** Variable representing the BalanceLineItemBulkAdjustmentUpdate method */
  public static final BalanceLineItemBulkAdjustmentRequestMethod BALANCE_LINE_ITEM_BULK_ADJUSTMENT_UPDATE = new BalanceLineItemBulkAdjustmentRequestMethod("BalanceLineItemBulkAdjustmentUpdate");
}
