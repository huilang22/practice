/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageBulkAdjustmentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BilledUsageBulkAdjustmentRequestMethod implements UdtMethod {
  private String method = null;
  private BilledUsageBulkAdjustmentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BilledUsageBulkAdjustmentCreate method */
  public static final BilledUsageBulkAdjustmentRequestMethod BILLED_USAGE_BULK_ADJUSTMENT_CREATE = new BilledUsageBulkAdjustmentRequestMethod("BilledUsageBulkAdjustmentCreate");
  /** Variable representing the BilledUsageBulkAdjustmentGet method */
  public static final BilledUsageBulkAdjustmentRequestMethod BILLED_USAGE_BULK_ADJUSTMENT_GET = new BilledUsageBulkAdjustmentRequestMethod("BilledUsageBulkAdjustmentGet");
  /** Variable representing the BilledUsageBulkAdjustmentUpdate method */
  public static final BilledUsageBulkAdjustmentRequestMethod BILLED_USAGE_BULK_ADJUSTMENT_UPDATE = new BilledUsageBulkAdjustmentRequestMethod("BilledUsageBulkAdjustmentUpdate");
}
