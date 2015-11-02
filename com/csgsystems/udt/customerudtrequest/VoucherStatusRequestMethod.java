/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class VoucherStatusRequestMethod implements UdtMethod {
  private String method = null;
  private VoucherStatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the VoucherStatusCreate method */
  public static final VoucherStatusRequestMethod VOUCHER_STATUS_CREATE = new VoucherStatusRequestMethod("VoucherStatusCreate");
  /** Variable representing the VoucherStatusFind method */
  public static final VoucherStatusRequestMethod VOUCHER_STATUS_FIND = new VoucherStatusRequestMethod("VoucherStatusFind");
  /** Variable representing the VoucherStatusGet method */
  public static final VoucherStatusRequestMethod VOUCHER_STATUS_GET = new VoucherStatusRequestMethod("VoucherStatusGet");
  /** Variable representing the VoucherStatusUpdate method */
  public static final VoucherStatusRequestMethod VOUCHER_STATUS_UPDATE = new VoucherStatusRequestMethod("VoucherStatusUpdate");
}
