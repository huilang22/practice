/*
 * Generated code DO NOT EDIT
 * Generated file: ReverseBulkAdjustmentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ReverseBulkAdjustmentRequestMethod implements UdtMethod {
  private String method = null;
  private ReverseBulkAdjustmentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ReverseBulkAdjustmentGet method */
  public static final ReverseBulkAdjustmentRequestMethod REVERSE_BULK_ADJUSTMENT_GET = new ReverseBulkAdjustmentRequestMethod("ReverseBulkAdjustmentGet");
  /** Variable representing the ReverseBulkAdjustmentUpdate method */
  public static final ReverseBulkAdjustmentRequestMethod REVERSE_BULK_ADJUSTMENT_UPDATE = new ReverseBulkAdjustmentRequestMethod("ReverseBulkAdjustmentUpdate");
}
