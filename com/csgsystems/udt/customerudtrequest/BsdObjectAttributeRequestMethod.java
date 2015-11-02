/*
 * Generated code DO NOT EDIT
 * Generated file: BsdObjectAttributeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdObjectAttributeRequestMethod implements UdtMethod {
  private String method = null;
  private BsdObjectAttributeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdObjectAttributeCreate method */
  public static final BsdObjectAttributeRequestMethod BSD_OBJECT_ATTRIBUTE_CREATE = new BsdObjectAttributeRequestMethod("BsdObjectAttributeCreate");
  /** Variable representing the BsdObjectAttributeDelete method */
  public static final BsdObjectAttributeRequestMethod BSD_OBJECT_ATTRIBUTE_DELETE = new BsdObjectAttributeRequestMethod("BsdObjectAttributeDelete");
  /** Variable representing the BsdObjectAttributeDeleteAll method */
  public static final BsdObjectAttributeRequestMethod BSD_OBJECT_ATTRIBUTE_DELETE_ALL = new BsdObjectAttributeRequestMethod("BsdObjectAttributeDeleteAll");
  /** Variable representing the BsdObjectAttributeFind method */
  public static final BsdObjectAttributeRequestMethod BSD_OBJECT_ATTRIBUTE_FIND = new BsdObjectAttributeRequestMethod("BsdObjectAttributeFind");
  /** Variable representing the BsdObjectAttributeGet method */
  public static final BsdObjectAttributeRequestMethod BSD_OBJECT_ATTRIBUTE_GET = new BsdObjectAttributeRequestMethod("BsdObjectAttributeGet");
}
