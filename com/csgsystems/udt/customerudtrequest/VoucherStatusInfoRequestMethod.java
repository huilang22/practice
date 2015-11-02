/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusInfoRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class VoucherStatusInfoRequestMethod implements UdtMethod {
  private String method = null;
  private VoucherStatusInfoRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the VoucherStatusInfoActivate method */
  public static final VoucherStatusInfoRequestMethod VOUCHER_STATUS_INFO_ACTIVATE = new VoucherStatusInfoRequestMethod("VoucherStatusInfoActivate");
  /** Variable representing the VoucherStatusInfoAssign method */
  public static final VoucherStatusInfoRequestMethod VOUCHER_STATUS_INFO_ASSIGN = new VoucherStatusInfoRequestMethod("VoucherStatusInfoAssign");
  /** Variable representing the VoucherStatusInfoConsumed method */
  public static final VoucherStatusInfoRequestMethod VOUCHER_STATUS_INFO_CONSUMED = new VoucherStatusInfoRequestMethod("VoucherStatusInfoConsumed");
  /** Variable representing the VoucherStatusInfoFind method */
  public static final VoucherStatusInfoRequestMethod VOUCHER_STATUS_INFO_FIND = new VoucherStatusInfoRequestMethod("VoucherStatusInfoFind");
  /** Variable representing the VoucherStatusInfoGet method */
  public static final VoucherStatusInfoRequestMethod VOUCHER_STATUS_INFO_GET = new VoucherStatusInfoRequestMethod("VoucherStatusInfoGet");
  /** Variable representing the VoucherStatusInfoUpdate method */
  public static final VoucherStatusInfoRequestMethod VOUCHER_STATUS_INFO_UPDATE = new VoucherStatusInfoRequestMethod("VoucherStatusInfoUpdate");
}
