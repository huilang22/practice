/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationDefaultRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdApplicationDefaultRequestMethod implements UdtMethod {
  private String method = null;
  private BsdApplicationDefaultRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdApplicationDefaultCreate method */
  public static final BsdApplicationDefaultRequestMethod BSD_APPLICATION_DEFAULT_CREATE = new BsdApplicationDefaultRequestMethod("BsdApplicationDefaultCreate");
  /** Variable representing the BsdApplicationDefaultDelete method */
  public static final BsdApplicationDefaultRequestMethod BSD_APPLICATION_DEFAULT_DELETE = new BsdApplicationDefaultRequestMethod("BsdApplicationDefaultDelete");
  /** Variable representing the BsdApplicationDefaultDeleteAll method */
  public static final BsdApplicationDefaultRequestMethod BSD_APPLICATION_DEFAULT_DELETE_ALL = new BsdApplicationDefaultRequestMethod("BsdApplicationDefaultDeleteAll");
  /** Variable representing the BsdApplicationDefaultFind method */
  public static final BsdApplicationDefaultRequestMethod BSD_APPLICATION_DEFAULT_FIND = new BsdApplicationDefaultRequestMethod("BsdApplicationDefaultFind");
  /** Variable representing the BsdApplicationDefaultGet method */
  public static final BsdApplicationDefaultRequestMethod BSD_APPLICATION_DEFAULT_GET = new BsdApplicationDefaultRequestMethod("BsdApplicationDefaultGet");
}
