/*
 * Generated code DO NOT EDIT
 * Generated file: InvsInterfaceRefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsInterfaceRefRequestMethod implements UdtMethod {
  private String method = null;
  private InvsInterfaceRefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsInterfaceRefCreate method */
  public static final InvsInterfaceRefRequestMethod INVS_INTERFACE_REF_CREATE = new InvsInterfaceRefRequestMethod("InvsInterfaceRefCreate");
  /** Variable representing the InvsInterfaceRefFind method */
  public static final InvsInterfaceRefRequestMethod INVS_INTERFACE_REF_FIND = new InvsInterfaceRefRequestMethod("InvsInterfaceRefFind");
  /** Variable representing the InvsInterfaceRefGet method */
  public static final InvsInterfaceRefRequestMethod INVS_INTERFACE_REF_GET = new InvsInterfaceRefRequestMethod("InvsInterfaceRefGet");
  /** Variable representing the InvsInterfaceRefUpdate method */
  public static final InvsInterfaceRefRequestMethod INVS_INTERFACE_REF_UPDATE = new InvsInterfaceRefRequestMethod("InvsInterfaceRefUpdate");
}
