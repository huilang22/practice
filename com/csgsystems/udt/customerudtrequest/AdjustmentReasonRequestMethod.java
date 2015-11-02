/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AdjustmentReasonRequestMethod implements UdtMethod {
  private String method = null;
  private AdjustmentReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AdjustmentReasonCreate method */
  public static final AdjustmentReasonRequestMethod ADJUSTMENT_REASON_CREATE = new AdjustmentReasonRequestMethod("AdjustmentReasonCreate");
  /** Variable representing the AdjustmentReasonDelete method */
  public static final AdjustmentReasonRequestMethod ADJUSTMENT_REASON_DELETE = new AdjustmentReasonRequestMethod("AdjustmentReasonDelete");
  /** Variable representing the AdjustmentReasonFind method */
  public static final AdjustmentReasonRequestMethod ADJUSTMENT_REASON_FIND = new AdjustmentReasonRequestMethod("AdjustmentReasonFind");
  /** Variable representing the AdjustmentReasonGet method */
  public static final AdjustmentReasonRequestMethod ADJUSTMENT_REASON_GET = new AdjustmentReasonRequestMethod("AdjustmentReasonGet");
  /** Variable representing the AdjustmentReasonUpdate method */
  public static final AdjustmentReasonRequestMethod ADJUSTMENT_REASON_UPDATE = new AdjustmentReasonRequestMethod("AdjustmentReasonUpdate");
}
