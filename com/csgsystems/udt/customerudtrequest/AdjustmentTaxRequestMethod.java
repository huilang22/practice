/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTaxRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AdjustmentTaxRequestMethod implements UdtMethod {
  private String method = null;
  private AdjustmentTaxRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AdjustmentTaxFind method */
  public static final AdjustmentTaxRequestMethod ADJUSTMENT_TAX_FIND = new AdjustmentTaxRequestMethod("AdjustmentTaxFind");
  /** Variable representing the AdjustmentTaxGet method */
  public static final AdjustmentTaxRequestMethod ADJUSTMENT_TAX_GET = new AdjustmentTaxRequestMethod("AdjustmentTaxGet");
}
