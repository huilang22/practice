/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusMovementRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class VoucherStatusMovementRequestMethod implements UdtMethod {
  private String method = null;
  private VoucherStatusMovementRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the VoucherStatusMovementCreate method */
  public static final VoucherStatusMovementRequestMethod VOUCHER_STATUS_MOVEMENT_CREATE = new VoucherStatusMovementRequestMethod("VoucherStatusMovementCreate");
  /** Variable representing the VoucherStatusMovementFind method */
  public static final VoucherStatusMovementRequestMethod VOUCHER_STATUS_MOVEMENT_FIND = new VoucherStatusMovementRequestMethod("VoucherStatusMovementFind");
  /** Variable representing the VoucherStatusMovementGet method */
  public static final VoucherStatusMovementRequestMethod VOUCHER_STATUS_MOVEMENT_GET = new VoucherStatusMovementRequestMethod("VoucherStatusMovementGet");
  /** Variable representing the VoucherStatusMovementUpdate method */
  public static final VoucherStatusMovementRequestMethod VOUCHER_STATUS_MOVEMENT_UPDATE = new VoucherStatusMovementRequestMethod("VoucherStatusMovementUpdate");
}
