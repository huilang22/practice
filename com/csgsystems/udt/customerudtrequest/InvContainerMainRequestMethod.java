/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerMainRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvContainerMainRequestMethod implements UdtMethod {
  private String method = null;
  private InvContainerMainRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvContainerMainFind method */
  public static final InvContainerMainRequestMethod INV_CONTAINER_MAIN_FIND = new InvContainerMainRequestMethod("InvContainerMainFind");
}
