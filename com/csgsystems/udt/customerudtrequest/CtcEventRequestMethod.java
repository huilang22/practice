/*
 * Generated code DO NOT EDIT
 * Generated file: CtcEventRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcEventRequestMethod implements UdtMethod {
  private String method = null;
  private CtcEventRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcEventCreate method */
  public static final CtcEventRequestMethod CTC_EVENT_CREATE = new CtcEventRequestMethod("CtcEventCreate");
  /** Variable representing the CtcEventDelete method */
  public static final CtcEventRequestMethod CTC_EVENT_DELETE = new CtcEventRequestMethod("CtcEventDelete");
  /** Variable representing the CtcEventFind method */
  public static final CtcEventRequestMethod CTC_EVENT_FIND = new CtcEventRequestMethod("CtcEventFind");
  /** Variable representing the CtcEventGet method */
  public static final CtcEventRequestMethod CTC_EVENT_GET = new CtcEventRequestMethod("CtcEventGet");
  /** Variable representing the CtcEventUpdate method */
  public static final CtcEventRequestMethod CTC_EVENT_UPDATE = new CtcEventRequestMethod("CtcEventUpdate");
}
