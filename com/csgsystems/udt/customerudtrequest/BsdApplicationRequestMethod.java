/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdApplicationRequestMethod implements UdtMethod {
  private String method = null;
  private BsdApplicationRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdApplicationCreate method */
  public static final BsdApplicationRequestMethod BSD_APPLICATION_CREATE = new BsdApplicationRequestMethod("BsdApplicationCreate");
  /** Variable representing the BsdApplicationDelete method */
  public static final BsdApplicationRequestMethod BSD_APPLICATION_DELETE = new BsdApplicationRequestMethod("BsdApplicationDelete");
  /** Variable representing the BsdApplicationDeleteAll method */
  public static final BsdApplicationRequestMethod BSD_APPLICATION_DELETE_ALL = new BsdApplicationRequestMethod("BsdApplicationDeleteAll");
  /** Variable representing the BsdApplicationFind method */
  public static final BsdApplicationRequestMethod BSD_APPLICATION_FIND = new BsdApplicationRequestMethod("BsdApplicationFind");
  /** Variable representing the BsdApplicationGet method */
  public static final BsdApplicationRequestMethod BSD_APPLICATION_GET = new BsdApplicationRequestMethod("BsdApplicationGet");
  /** Variable representing the BsdApplicationSequenceGet method */
  public static final BsdApplicationRequestMethod BSD_APPLICATION_SEQUENCE_GET = new BsdApplicationRequestMethod("BsdApplicationSequenceGet");
  /** Variable representing the BsdApplicationUpdate method */
  public static final BsdApplicationRequestMethod BSD_APPLICATION_UPDATE = new BsdApplicationRequestMethod("BsdApplicationUpdate");
}
