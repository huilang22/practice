/*
 * Generated code DO NOT EDIT
 * Generated file: AbiAutoPayCmfMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AbiAutoPayCmfMapRequestMethod implements UdtMethod {
  private String method = null;
  private AbiAutoPayCmfMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AbiAutoPayCmfMapCreate method */
  public static final AbiAutoPayCmfMapRequestMethod ABI_AUTO_PAY_CMF_MAP_CREATE = new AbiAutoPayCmfMapRequestMethod("AbiAutoPayCmfMapCreate");
  /** Variable representing the AbiAutoPayCmfMapFind method */
  public static final AbiAutoPayCmfMapRequestMethod ABI_AUTO_PAY_CMF_MAP_FIND = new AbiAutoPayCmfMapRequestMethod("AbiAutoPayCmfMapFind");
  /** Variable representing the AbiAutoPayCmfMapGet method */
  public static final AbiAutoPayCmfMapRequestMethod ABI_AUTO_PAY_CMF_MAP_GET = new AbiAutoPayCmfMapRequestMethod("AbiAutoPayCmfMapGet");
  /** Variable representing the AbiAutoPayCmfMapUpdate method */
  public static final AbiAutoPayCmfMapRequestMethod ABI_AUTO_PAY_CMF_MAP_UPDATE = new AbiAutoPayCmfMapRequestMethod("AbiAutoPayCmfMapUpdate");
}
