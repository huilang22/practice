/*
 * Generated code DO NOT EDIT
 * Generated file: BillMessageGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillMessageGroupRequestMethod implements UdtMethod {
  private String method = null;
  private BillMessageGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillMessageGroupCreate method */
  public static final BillMessageGroupRequestMethod BILL_MESSAGE_GROUP_CREATE = new BillMessageGroupRequestMethod("BillMessageGroupCreate");
  /** Variable representing the BillMessageGroupDelete method */
  public static final BillMessageGroupRequestMethod BILL_MESSAGE_GROUP_DELETE = new BillMessageGroupRequestMethod("BillMessageGroupDelete");
  /** Variable representing the BillMessageGroupFind method */
  public static final BillMessageGroupRequestMethod BILL_MESSAGE_GROUP_FIND = new BillMessageGroupRequestMethod("BillMessageGroupFind");
  /** Variable representing the BillMessageGroupGet method */
  public static final BillMessageGroupRequestMethod BILL_MESSAGE_GROUP_GET = new BillMessageGroupRequestMethod("BillMessageGroupGet");
  /** Variable representing the BillMessageGroupUpdate method */
  public static final BillMessageGroupRequestMethod BILL_MESSAGE_GROUP_UPDATE = new BillMessageGroupRequestMethod("BillMessageGroupUpdate");
}
