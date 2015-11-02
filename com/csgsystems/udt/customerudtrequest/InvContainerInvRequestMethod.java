/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerInvRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvContainerInvRequestMethod implements UdtMethod {
  private String method = null;
  private InvContainerInvRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvContainerInvCreate method */
  public static final InvContainerInvRequestMethod INV_CONTAINER_INV_CREATE = new InvContainerInvRequestMethod("InvContainerInvCreate");
  /** Variable representing the InvContainerInvDelete method */
  public static final InvContainerInvRequestMethod INV_CONTAINER_INV_DELETE = new InvContainerInvRequestMethod("InvContainerInvDelete");
  /** Variable representing the InvContainerInvFind method */
  public static final InvContainerInvRequestMethod INV_CONTAINER_INV_FIND = new InvContainerInvRequestMethod("InvContainerInvFind");
}
