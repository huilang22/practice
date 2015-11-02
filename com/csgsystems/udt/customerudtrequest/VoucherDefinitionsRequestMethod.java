/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherDefinitionsRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class VoucherDefinitionsRequestMethod implements UdtMethod {
  private String method = null;
  private VoucherDefinitionsRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the VoucherConsume method */
  public static final VoucherDefinitionsRequestMethod VOUCHER_CONSUME = new VoucherDefinitionsRequestMethod("VoucherConsume");
  /** Variable representing the VoucherDefinitionsCreate method */
  public static final VoucherDefinitionsRequestMethod VOUCHER_DEFINITIONS_CREATE = new VoucherDefinitionsRequestMethod("VoucherDefinitionsCreate");
  /** Variable representing the VoucherDefinitionsFind method */
  public static final VoucherDefinitionsRequestMethod VOUCHER_DEFINITIONS_FIND = new VoucherDefinitionsRequestMethod("VoucherDefinitionsFind");
  /** Variable representing the VoucherDefinitionsGet method */
  public static final VoucherDefinitionsRequestMethod VOUCHER_DEFINITIONS_GET = new VoucherDefinitionsRequestMethod("VoucherDefinitionsGet");
  /** Variable representing the VoucherDefinitionsLocationUpdate method */
  public static final VoucherDefinitionsRequestMethod VOUCHER_DEFINITIONS_LOCATION_UPDATE = new VoucherDefinitionsRequestMethod("VoucherDefinitionsLocationUpdate");
  /** Variable representing the VoucherDefinitionsPinGet method */
  public static final VoucherDefinitionsRequestMethod VOUCHER_DEFINITIONS_PIN_GET = new VoucherDefinitionsRequestMethod("VoucherDefinitionsPinGet");
  /** Variable representing the VoucherDefinitionsPinVerify method */
  public static final VoucherDefinitionsRequestMethod VOUCHER_DEFINITIONS_PIN_VERIFY = new VoucherDefinitionsRequestMethod("VoucherDefinitionsPinVerify");
  /** Variable representing the VoucherDefinitionsUpdateByBatchId method */
  public static final VoucherDefinitionsRequestMethod VOUCHER_DEFINITIONS_UPDATE_BY_BATCH_ID = new VoucherDefinitionsRequestMethod("VoucherDefinitionsUpdateByBatchId");
}
