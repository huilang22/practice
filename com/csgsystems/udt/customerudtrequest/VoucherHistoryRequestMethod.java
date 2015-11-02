/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherHistoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class VoucherHistoryRequestMethod implements UdtMethod {
  private String method = null;
  private VoucherHistoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the VoucherHistoryFind method */
  public static final VoucherHistoryRequestMethod VOUCHER_HISTORY_FIND = new VoucherHistoryRequestMethod("VoucherHistoryFind");
  /** Variable representing the VoucherHistoryGet method */
  public static final VoucherHistoryRequestMethod VOUCHER_HISTORY_GET = new VoucherHistoryRequestMethod("VoucherHistoryGet");
}
