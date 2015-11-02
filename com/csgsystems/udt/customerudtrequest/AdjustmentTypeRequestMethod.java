/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AdjustmentTypeRequestMethod implements UdtMethod {
  private String method = null;
  private AdjustmentTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AdjustmentTypeByGroupFind method */
  public static final AdjustmentTypeRequestMethod ADJUSTMENT_TYPE_BY_GROUP_FIND = new AdjustmentTypeRequestMethod("AdjustmentTypeByGroupFind");
  /** Variable representing the AdjustmentTypeEligibleFind method */
  public static final AdjustmentTypeRequestMethod ADJUSTMENT_TYPE_ELIGIBLE_FIND = new AdjustmentTypeRequestMethod("AdjustmentTypeEligibleFind");
  /** Variable representing the AdjustmentTypeFind method */
  public static final AdjustmentTypeRequestMethod ADJUSTMENT_TYPE_FIND = new AdjustmentTypeRequestMethod("AdjustmentTypeFind");
  /** Variable representing the AdjustmentTypeGet method */
  public static final AdjustmentTypeRequestMethod ADJUSTMENT_TYPE_GET = new AdjustmentTypeRequestMethod("AdjustmentTypeGet");
}
