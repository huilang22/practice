/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherLocationRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class VoucherLocationRequestMethod implements UdtMethod {
  private String method = null;
  private VoucherLocationRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the VoucherLocationCreate method */
  public static final VoucherLocationRequestMethod VOUCHER_LOCATION_CREATE = new VoucherLocationRequestMethod("VoucherLocationCreate");
  /** Variable representing the VoucherLocationFind method */
  public static final VoucherLocationRequestMethod VOUCHER_LOCATION_FIND = new VoucherLocationRequestMethod("VoucherLocationFind");
  /** Variable representing the VoucherLocationGet method */
  public static final VoucherLocationRequestMethod VOUCHER_LOCATION_GET = new VoucherLocationRequestMethod("VoucherLocationGet");
  /** Variable representing the VoucherLocationUpdate method */
  public static final VoucherLocationRequestMethod VOUCHER_LOCATION_UPDATE = new VoucherLocationRequestMethod("VoucherLocationUpdate");
}
