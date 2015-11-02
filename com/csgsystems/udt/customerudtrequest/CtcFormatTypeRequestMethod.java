/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFormatTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcFormatTypeRequestMethod implements UdtMethod {
  private String method = null;
  private CtcFormatTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcFormatTypeCreate method */
  public static final CtcFormatTypeRequestMethod CTC_FORMAT_TYPE_CREATE = new CtcFormatTypeRequestMethod("CtcFormatTypeCreate");
  /** Variable representing the CtcFormatTypeDelete method */
  public static final CtcFormatTypeRequestMethod CTC_FORMAT_TYPE_DELETE = new CtcFormatTypeRequestMethod("CtcFormatTypeDelete");
  /** Variable representing the CtcFormatTypeFind method */
  public static final CtcFormatTypeRequestMethod CTC_FORMAT_TYPE_FIND = new CtcFormatTypeRequestMethod("CtcFormatTypeFind");
  /** Variable representing the CtcFormatTypeGet method */
  public static final CtcFormatTypeRequestMethod CTC_FORMAT_TYPE_GET = new CtcFormatTypeRequestMethod("CtcFormatTypeGet");
  /** Variable representing the CtcFormatTypeUpdate method */
  public static final CtcFormatTypeRequestMethod CTC_FORMAT_TYPE_UPDATE = new CtcFormatTypeRequestMethod("CtcFormatTypeUpdate");
}
