/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFormatRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcFormatRequestMethod implements UdtMethod {
  private String method = null;
  private CtcFormatRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcFormatCreate method */
  public static final CtcFormatRequestMethod CTC_FORMAT_CREATE = new CtcFormatRequestMethod("CtcFormatCreate");
  /** Variable representing the CtcFormatDelete method */
  public static final CtcFormatRequestMethod CTC_FORMAT_DELETE = new CtcFormatRequestMethod("CtcFormatDelete");
  /** Variable representing the CtcFormatFind method */
  public static final CtcFormatRequestMethod CTC_FORMAT_FIND = new CtcFormatRequestMethod("CtcFormatFind");
  /** Variable representing the CtcFormatGet method */
  public static final CtcFormatRequestMethod CTC_FORMAT_GET = new CtcFormatRequestMethod("CtcFormatGet");
  /** Variable representing the CtcFormatUpdate method */
  public static final CtcFormatRequestMethod CTC_FORMAT_UPDATE = new CtcFormatRequestMethod("CtcFormatUpdate");
}
