/*
 * Generated code DO NOT EDIT
 * Generated file: BsdActionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdActionRequestMethod implements UdtMethod {
  private String method = null;
  private BsdActionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdActionCreate method */
  public static final BsdActionRequestMethod BSD_ACTION_CREATE = new BsdActionRequestMethod("BsdActionCreate");
  /** Variable representing the BsdActionDelete method */
  public static final BsdActionRequestMethod BSD_ACTION_DELETE = new BsdActionRequestMethod("BsdActionDelete");
  /** Variable representing the BsdActionDeleteAll method */
  public static final BsdActionRequestMethod BSD_ACTION_DELETE_ALL = new BsdActionRequestMethod("BsdActionDeleteAll");
  /** Variable representing the BsdActionFind method */
  public static final BsdActionRequestMethod BSD_ACTION_FIND = new BsdActionRequestMethod("BsdActionFind");
  /** Variable representing the BsdActionGet method */
  public static final BsdActionRequestMethod BSD_ACTION_GET = new BsdActionRequestMethod("BsdActionGet");
  /** Variable representing the BsdActionSequenceGet method */
  public static final BsdActionRequestMethod BSD_ACTION_SEQUENCE_GET = new BsdActionRequestMethod("BsdActionSequenceGet");
  /** Variable representing the BsdActionUpdate method */
  public static final BsdActionRequestMethod BSD_ACTION_UPDATE = new BsdActionRequestMethod("BsdActionUpdate");
}
