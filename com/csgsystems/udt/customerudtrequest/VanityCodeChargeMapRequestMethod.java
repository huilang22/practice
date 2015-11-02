/*
 * Generated code DO NOT EDIT
 * Generated file: VanityCodeChargeMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class VanityCodeChargeMapRequestMethod implements UdtMethod {
  private String method = null;
  private VanityCodeChargeMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the VanityCodeChargeMapCreate method */
  public static final VanityCodeChargeMapRequestMethod VANITY_CODE_CHARGE_MAP_CREATE = new VanityCodeChargeMapRequestMethod("VanityCodeChargeMapCreate");
  /** Variable representing the VanityCodeChargeMapFind method */
  public static final VanityCodeChargeMapRequestMethod VANITY_CODE_CHARGE_MAP_FIND = new VanityCodeChargeMapRequestMethod("VanityCodeChargeMapFind");
  /** Variable representing the VanityCodeChargeMapGet method */
  public static final VanityCodeChargeMapRequestMethod VANITY_CODE_CHARGE_MAP_GET = new VanityCodeChargeMapRequestMethod("VanityCodeChargeMapGet");
  /** Variable representing the VanityCodeChargeMapUpdate method */
  public static final VanityCodeChargeMapRequestMethod VANITY_CODE_CHARGE_MAP_UPDATE = new VanityCodeChargeMapRequestMethod("VanityCodeChargeMapUpdate");
}
