/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageBulkAdjustmentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UnbilledUsageBulkAdjustmentRequestMethod implements UdtMethod {
  private String method = null;
  private UnbilledUsageBulkAdjustmentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UnbilledUsageBulkAdjustmentCreate method */
  public static final UnbilledUsageBulkAdjustmentRequestMethod UNBILLED_USAGE_BULK_ADJUSTMENT_CREATE = new UnbilledUsageBulkAdjustmentRequestMethod("UnbilledUsageBulkAdjustmentCreate");
  /** Variable representing the UnbilledUsageBulkAdjustmentGet method */
  public static final UnbilledUsageBulkAdjustmentRequestMethod UNBILLED_USAGE_BULK_ADJUSTMENT_GET = new UnbilledUsageBulkAdjustmentRequestMethod("UnbilledUsageBulkAdjustmentGet");
  /** Variable representing the UnbilledUsageBulkAdjustmentUpdate method */
  public static final UnbilledUsageBulkAdjustmentRequestMethod UNBILLED_USAGE_BULK_ADJUSTMENT_UPDATE = new UnbilledUsageBulkAdjustmentRequestMethod("UnbilledUsageBulkAdjustmentUpdate");
}
