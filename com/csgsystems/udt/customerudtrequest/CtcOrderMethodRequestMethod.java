/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOrderMethodRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcOrderMethodRequestMethod implements UdtMethod {
  private String method = null;
  private CtcOrderMethodRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcOrderMethodCreate method */
  public static final CtcOrderMethodRequestMethod CTC_ORDER_METHOD_CREATE = new CtcOrderMethodRequestMethod("CtcOrderMethodCreate");
  /** Variable representing the CtcOrderMethodDelete method */
  public static final CtcOrderMethodRequestMethod CTC_ORDER_METHOD_DELETE = new CtcOrderMethodRequestMethod("CtcOrderMethodDelete");
  /** Variable representing the CtcOrderMethodFind method */
  public static final CtcOrderMethodRequestMethod CTC_ORDER_METHOD_FIND = new CtcOrderMethodRequestMethod("CtcOrderMethodFind");
  /** Variable representing the CtcOrderMethodGet method */
  public static final CtcOrderMethodRequestMethod CTC_ORDER_METHOD_GET = new CtcOrderMethodRequestMethod("CtcOrderMethodGet");
  /** Variable representing the CtcOrderMethodUpdate method */
  public static final CtcOrderMethodRequestMethod CTC_ORDER_METHOD_UPDATE = new CtcOrderMethodRequestMethod("CtcOrderMethodUpdate");
}
