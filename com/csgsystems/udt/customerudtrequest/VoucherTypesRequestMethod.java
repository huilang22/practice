/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherTypesRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class VoucherTypesRequestMethod implements UdtMethod {
  private String method = null;
  private VoucherTypesRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the VoucherTypesCreate method */
  public static final VoucherTypesRequestMethod VOUCHER_TYPES_CREATE = new VoucherTypesRequestMethod("VoucherTypesCreate");
  /** Variable representing the VoucherTypesFind method */
  public static final VoucherTypesRequestMethod VOUCHER_TYPES_FIND = new VoucherTypesRequestMethod("VoucherTypesFind");
  /** Variable representing the VoucherTypesGet method */
  public static final VoucherTypesRequestMethod VOUCHER_TYPES_GET = new VoucherTypesRequestMethod("VoucherTypesGet");
  /** Variable representing the VoucherTypesUpdate method */
  public static final VoucherTypesRequestMethod VOUCHER_TYPES_UPDATE = new VoucherTypesRequestMethod("VoucherTypesUpdate");
}
