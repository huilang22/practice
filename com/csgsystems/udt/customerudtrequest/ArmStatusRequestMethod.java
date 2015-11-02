/*
 * Generated code DO NOT EDIT
 * Generated file: ArmStatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ArmStatusRequestMethod implements UdtMethod {
  private String method = null;
  private ArmStatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ArmStatusFind method */
  public static final ArmStatusRequestMethod ARM_STATUS_FIND = new ArmStatusRequestMethod("ArmStatusFind");
  /** Variable representing the ArmStatusGet method */
  public static final ArmStatusRequestMethod ARM_STATUS_GET = new ArmStatusRequestMethod("ArmStatusGet");
}
