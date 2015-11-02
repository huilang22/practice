/*
 * Generated code DO NOT EDIT
 * Generated file: BillInsertGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillInsertGroupRequestMethod implements UdtMethod {
  private String method = null;
  private BillInsertGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillInsertGroupCreate method */
  public static final BillInsertGroupRequestMethod BILL_INSERT_GROUP_CREATE = new BillInsertGroupRequestMethod("BillInsertGroupCreate");
  /** Variable representing the BillInsertGroupDelete method */
  public static final BillInsertGroupRequestMethod BILL_INSERT_GROUP_DELETE = new BillInsertGroupRequestMethod("BillInsertGroupDelete");
  /** Variable representing the BillInsertGroupFind method */
  public static final BillInsertGroupRequestMethod BILL_INSERT_GROUP_FIND = new BillInsertGroupRequestMethod("BillInsertGroupFind");
  /** Variable representing the BillInsertGroupGet method */
  public static final BillInsertGroupRequestMethod BILL_INSERT_GROUP_GET = new BillInsertGroupRequestMethod("BillInsertGroupGet");
  /** Variable representing the BillInsertGroupUpdate method */
  public static final BillInsertGroupRequestMethod BILL_INSERT_GROUP_UPDATE = new BillInsertGroupRequestMethod("BillInsertGroupUpdate");
}
