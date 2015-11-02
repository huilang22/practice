/*
 * Generated code DO NOT EDIT
 * Generated file: InvsRateCenterRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsRateCenterRequestMethod implements UdtMethod {
  private String method = null;
  private InvsRateCenterRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsRateCenterCreate method */
  public static final InvsRateCenterRequestMethod INVS_RATE_CENTER_CREATE = new InvsRateCenterRequestMethod("InvsRateCenterCreate");
  /** Variable representing the InvsRateCenterFind method */
  public static final InvsRateCenterRequestMethod INVS_RATE_CENTER_FIND = new InvsRateCenterRequestMethod("InvsRateCenterFind");
  /** Variable representing the InvsRateCenterGet method */
  public static final InvsRateCenterRequestMethod INVS_RATE_CENTER_GET = new InvsRateCenterRequestMethod("InvsRateCenterGet");
  /** Variable representing the InvsRateCenterUpdate method */
  public static final InvsRateCenterRequestMethod INVS_RATE_CENTER_UPDATE = new InvsRateCenterRequestMethod("InvsRateCenterUpdate");
}
