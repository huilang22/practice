/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvContainerRequestMethod implements UdtMethod {
  private String method = null;
  private InvContainerRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvContainerCreate method */
  public static final InvContainerRequestMethod INV_CONTAINER_CREATE = new InvContainerRequestMethod("InvContainerCreate");
  /** Variable representing the InvContainerDelete method */
  public static final InvContainerRequestMethod INV_CONTAINER_DELETE = new InvContainerRequestMethod("InvContainerDelete");
  /** Variable representing the InvContainerExtendedDataFind method */
  public static final InvContainerRequestMethod INV_CONTAINER_EXTENDED_DATA_FIND = new InvContainerRequestMethod("InvContainerExtendedDataFind");
  /** Variable representing the InvContainerGet method */
  public static final InvContainerRequestMethod INV_CONTAINER_GET = new InvContainerRequestMethod("InvContainerGet");
  /** Variable representing the InvContainerRelationsFind method */
  public static final InvContainerRequestMethod INV_CONTAINER_RELATIONS_FIND = new InvContainerRequestMethod("InvContainerRelationsFind");
  /** Variable representing the InvContainerUpdate method */
  public static final InvContainerRequestMethod INV_CONTAINER_UPDATE = new InvContainerRequestMethod("InvContainerUpdate");
}
