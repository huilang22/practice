/*
 * Generated code DO NOT EDIT
 * Generated file: BillPeriodRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillPeriodRequestMethod implements UdtMethod {
  private String method = null;
  private BillPeriodRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillPeriodCreate method */
  public static final BillPeriodRequestMethod BILL_PERIOD_CREATE = new BillPeriodRequestMethod("BillPeriodCreate");
  /** Variable representing the BillPeriodDelete method */
  public static final BillPeriodRequestMethod BILL_PERIOD_DELETE = new BillPeriodRequestMethod("BillPeriodDelete");
  /** Variable representing the BillPeriodFind method */
  public static final BillPeriodRequestMethod BILL_PERIOD_FIND = new BillPeriodRequestMethod("BillPeriodFind");
  /** Variable representing the BillPeriodGet method */
  public static final BillPeriodRequestMethod BILL_PERIOD_GET = new BillPeriodRequestMethod("BillPeriodGet");
  /** Variable representing the BillPeriodUpdate method */
  public static final BillPeriodRequestMethod BILL_PERIOD_UPDATE = new BillPeriodRequestMethod("BillPeriodUpdate");
}
