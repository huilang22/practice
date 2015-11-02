/*
 * Generated code DO NOT EDIT
 * Generated file: CtcUrlTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcUrlTypeRequestMethod implements UdtMethod {
  private String method = null;
  private CtcUrlTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcUrlTypeCreate method */
  public static final CtcUrlTypeRequestMethod CTC_URL_TYPE_CREATE = new CtcUrlTypeRequestMethod("CtcUrlTypeCreate");
  /** Variable representing the CtcUrlTypeDelete method */
  public static final CtcUrlTypeRequestMethod CTC_URL_TYPE_DELETE = new CtcUrlTypeRequestMethod("CtcUrlTypeDelete");
  /** Variable representing the CtcUrlTypeFind method */
  public static final CtcUrlTypeRequestMethod CTC_URL_TYPE_FIND = new CtcUrlTypeRequestMethod("CtcUrlTypeFind");
  /** Variable representing the CtcUrlTypeGet method */
  public static final CtcUrlTypeRequestMethod CTC_URL_TYPE_GET = new CtcUrlTypeRequestMethod("CtcUrlTypeGet");
  /** Variable representing the CtcUrlTypeUpdate method */
  public static final CtcUrlTypeRequestMethod CTC_URL_TYPE_UPDATE = new CtcUrlTypeRequestMethod("CtcUrlTypeUpdate");
}
