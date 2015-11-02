/*
 * Generated code DO NOT EDIT
 * Generated file: BillCycleRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillCycleRequestMethod implements UdtMethod {
  private String method = null;
  private BillCycleRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillCycleFind method */
  public static final BillCycleRequestMethod BILL_CYCLE_FIND = new BillCycleRequestMethod("BillCycleFind");
  /** Variable representing the BillCycleGet method */
  public static final BillCycleRequestMethod BILL_CYCLE_GET = new BillCycleRequestMethod("BillCycleGet");
}
