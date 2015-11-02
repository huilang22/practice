/*
 * Generated code DO NOT EDIT
 * Generated file: InvPlaceholderRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvPlaceholderRequestMethod implements UdtMethod {
  private String method = null;
  private InvPlaceholderRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvPlaceholderCreate method */
  public static final InvPlaceholderRequestMethod INV_PLACEHOLDER_CREATE = new InvPlaceholderRequestMethod("InvPlaceholderCreate");
  /** Variable representing the InvPlaceholderFind method */
  public static final InvPlaceholderRequestMethod INV_PLACEHOLDER_FIND = new InvPlaceholderRequestMethod("InvPlaceholderFind");
  /** Variable representing the InvPlaceholderGet method */
  public static final InvPlaceholderRequestMethod INV_PLACEHOLDER_GET = new InvPlaceholderRequestMethod("InvPlaceholderGet");
  /** Variable representing the InvPlaceholderUpdate method */
  public static final InvPlaceholderRequestMethod INV_PLACEHOLDER_UPDATE = new InvPlaceholderRequestMethod("InvPlaceholderUpdate");
}
