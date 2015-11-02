/*
 * Generated code DO NOT EDIT
 * Generated file: BillFmtOptFormatsRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillFmtOptFormatsRequestMethod implements UdtMethod {
  private String method = null;
  private BillFmtOptFormatsRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillFmtOptFormatsCreate method */
  public static final BillFmtOptFormatsRequestMethod BILL_FMT_OPT_FORMATS_CREATE = new BillFmtOptFormatsRequestMethod("BillFmtOptFormatsCreate");
  /** Variable representing the BillFmtOptFormatsDelete method */
  public static final BillFmtOptFormatsRequestMethod BILL_FMT_OPT_FORMATS_DELETE = new BillFmtOptFormatsRequestMethod("BillFmtOptFormatsDelete");
  /** Variable representing the BillFmtOptFormatsFind method */
  public static final BillFmtOptFormatsRequestMethod BILL_FMT_OPT_FORMATS_FIND = new BillFmtOptFormatsRequestMethod("BillFmtOptFormatsFind");
  /** Variable representing the BillFmtOptFormatsGet method */
  public static final BillFmtOptFormatsRequestMethod BILL_FMT_OPT_FORMATS_GET = new BillFmtOptFormatsRequestMethod("BillFmtOptFormatsGet");
  /** Variable representing the BillFmtOptFormatsUpdate method */
  public static final BillFmtOptFormatsRequestMethod BILL_FMT_OPT_FORMATS_UPDATE = new BillFmtOptFormatsRequestMethod("BillFmtOptFormatsUpdate");
}
