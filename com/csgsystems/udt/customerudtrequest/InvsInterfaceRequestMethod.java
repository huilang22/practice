/*
 * Generated code DO NOT EDIT
 * Generated file: InvsInterfaceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsInterfaceRequestMethod implements UdtMethod {
  private String method = null;
  private InvsInterfaceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsInterfaceCreate method */
  public static final InvsInterfaceRequestMethod INVS_INTERFACE_CREATE = new InvsInterfaceRequestMethod("InvsInterfaceCreate");
  /** Variable representing the InvsInterfaceFind method */
  public static final InvsInterfaceRequestMethod INVS_INTERFACE_FIND = new InvsInterfaceRequestMethod("InvsInterfaceFind");
  /** Variable representing the InvsInterfaceGet method */
  public static final InvsInterfaceRequestMethod INVS_INTERFACE_GET = new InvsInterfaceRequestMethod("InvsInterfaceGet");
  /** Variable representing the InvsInterfaceUpdate method */
  public static final InvsInterfaceRequestMethod INVS_INTERFACE_UPDATE = new InvsInterfaceRequestMethod("InvsInterfaceUpdate");
}
