/*
 * Generated code DO NOT EDIT
 * Generated file: InvsContainerTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsContainerTypeRequestMethod implements UdtMethod {
  private String method = null;
  private InvsContainerTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsContainerTypeCreate method */
  public static final InvsContainerTypeRequestMethod INVS_CONTAINER_TYPE_CREATE = new InvsContainerTypeRequestMethod("InvsContainerTypeCreate");
  /** Variable representing the InvsContainerTypeFind method */
  public static final InvsContainerTypeRequestMethod INVS_CONTAINER_TYPE_FIND = new InvsContainerTypeRequestMethod("InvsContainerTypeFind");
  /** Variable representing the InvsContainerTypeGet method */
  public static final InvsContainerTypeRequestMethod INVS_CONTAINER_TYPE_GET = new InvsContainerTypeRequestMethod("InvsContainerTypeGet");
  /** Variable representing the InvsContainerTypeUpdate method */
  public static final InvsContainerTypeRequestMethod INVS_CONTAINER_TYPE_UPDATE = new InvsContainerTypeRequestMethod("InvsContainerTypeUpdate");
}
