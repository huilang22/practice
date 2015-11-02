/*
 * Generated code DO NOT EDIT
 * Generated file: BillMessageGroupMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillMessageGroupMapRequestMethod implements UdtMethod {
  private String method = null;
  private BillMessageGroupMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillMessageGroupMapCreate method */
  public static final BillMessageGroupMapRequestMethod BILL_MESSAGE_GROUP_MAP_CREATE = new BillMessageGroupMapRequestMethod("BillMessageGroupMapCreate");
  /** Variable representing the BillMessageGroupMapFind method */
  public static final BillMessageGroupMapRequestMethod BILL_MESSAGE_GROUP_MAP_FIND = new BillMessageGroupMapRequestMethod("BillMessageGroupMapFind");
  /** Variable representing the BillMessageGroupMapGet method */
  public static final BillMessageGroupMapRequestMethod BILL_MESSAGE_GROUP_MAP_GET = new BillMessageGroupMapRequestMethod("BillMessageGroupMapGet");
}
