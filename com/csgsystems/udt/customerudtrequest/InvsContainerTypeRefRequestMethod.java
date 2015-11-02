/*
 * Generated code DO NOT EDIT
 * Generated file: InvsContainerTypeRefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsContainerTypeRefRequestMethod implements UdtMethod {
  private String method = null;
  private InvsContainerTypeRefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsContainerTypeRefCreate method */
  public static final InvsContainerTypeRefRequestMethod INVS_CONTAINER_TYPE_REF_CREATE = new InvsContainerTypeRefRequestMethod("InvsContainerTypeRefCreate");
  /** Variable representing the InvsContainerTypeRefFind method */
  public static final InvsContainerTypeRefRequestMethod INVS_CONTAINER_TYPE_REF_FIND = new InvsContainerTypeRefRequestMethod("InvsContainerTypeRefFind");
  /** Variable representing the InvsContainerTypeRefGet method */
  public static final InvsContainerTypeRefRequestMethod INVS_CONTAINER_TYPE_REF_GET = new InvsContainerTypeRefRequestMethod("InvsContainerTypeRefGet");
  /** Variable representing the InvsContainerTypeRefUpdate method */
  public static final InvsContainerTypeRefRequestMethod INVS_CONTAINER_TYPE_REF_UPDATE = new InvsContainerTypeRefRequestMethod("InvsContainerTypeRefUpdate");
}
