/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsStatusRequestMethod implements UdtMethod {
  private String method = null;
  private InvsStatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsStatusCreate method */
  public static final InvsStatusRequestMethod INVS_STATUS_CREATE = new InvsStatusRequestMethod("InvsStatusCreate");
  /** Variable representing the InvsStatusFind method */
  public static final InvsStatusRequestMethod INVS_STATUS_FIND = new InvsStatusRequestMethod("InvsStatusFind");
  /** Variable representing the InvsStatusGet method */
  public static final InvsStatusRequestMethod INVS_STATUS_GET = new InvsStatusRequestMethod("InvsStatusGet");
  /** Variable representing the InvsStatusUpdate method */
  public static final InvsStatusRequestMethod INVS_STATUS_UPDATE = new InvsStatusRequestMethod("InvsStatusUpdate");
}
