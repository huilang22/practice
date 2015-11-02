/*
 * Generated code DO NOT EDIT
 * Generated file: VipCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class VipCodeRequestMethod implements UdtMethod {
  private String method = null;
  private VipCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the VipCodeCreate method */
  public static final VipCodeRequestMethod VIP_CODE_CREATE = new VipCodeRequestMethod("VipCodeCreate");
  /** Variable representing the VipCodeDelete method */
  public static final VipCodeRequestMethod VIP_CODE_DELETE = new VipCodeRequestMethod("VipCodeDelete");
  /** Variable representing the VipCodeFind method */
  public static final VipCodeRequestMethod VIP_CODE_FIND = new VipCodeRequestMethod("VipCodeFind");
  /** Variable representing the VipCodeGet method */
  public static final VipCodeRequestMethod VIP_CODE_GET = new VipCodeRequestMethod("VipCodeGet");
  /** Variable representing the VipCodeUpdate method */
  public static final VipCodeRequestMethod VIP_CODE_UPDATE = new VipCodeRequestMethod("VipCodeUpdate");
}
