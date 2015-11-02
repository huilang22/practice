/*
 * Generated code DO NOT EDIT
 * Generated file: BillFmtOptRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillFmtOptRequestMethod implements UdtMethod {
  private String method = null;
  private BillFmtOptRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillFmtOptCreate method */
  public static final BillFmtOptRequestMethod BILL_FMT_OPT_CREATE = new BillFmtOptRequestMethod("BillFmtOptCreate");
  /** Variable representing the BillFmtOptDelete method */
  public static final BillFmtOptRequestMethod BILL_FMT_OPT_DELETE = new BillFmtOptRequestMethod("BillFmtOptDelete");
  /** Variable representing the BillFmtOptFind method */
  public static final BillFmtOptRequestMethod BILL_FMT_OPT_FIND = new BillFmtOptRequestMethod("BillFmtOptFind");
  /** Variable representing the BillFmtOptGet method */
  public static final BillFmtOptRequestMethod BILL_FMT_OPT_GET = new BillFmtOptRequestMethod("BillFmtOptGet");
  /** Variable representing the BillFmtOptUpdate method */
  public static final BillFmtOptRequestMethod BILL_FMT_OPT_UPDATE = new BillFmtOptRequestMethod("BillFmtOptUpdate");
}
