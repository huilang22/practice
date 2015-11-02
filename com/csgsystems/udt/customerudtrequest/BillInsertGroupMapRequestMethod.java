/*
 * Generated code DO NOT EDIT
 * Generated file: BillInsertGroupMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillInsertGroupMapRequestMethod implements UdtMethod {
  private String method = null;
  private BillInsertGroupMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillInsertGroupMapCreate method */
  public static final BillInsertGroupMapRequestMethod BILL_INSERT_GROUP_MAP_CREATE = new BillInsertGroupMapRequestMethod("BillInsertGroupMapCreate");
  /** Variable representing the BillInsertGroupMapDelete method */
  public static final BillInsertGroupMapRequestMethod BILL_INSERT_GROUP_MAP_DELETE = new BillInsertGroupMapRequestMethod("BillInsertGroupMapDelete");
  /** Variable representing the BillInsertGroupMapFind method */
  public static final BillInsertGroupMapRequestMethod BILL_INSERT_GROUP_MAP_FIND = new BillInsertGroupMapRequestMethod("BillInsertGroupMapFind");
  /** Variable representing the BillInsertGroupMapGet method */
  public static final BillInsertGroupMapRequestMethod BILL_INSERT_GROUP_MAP_GET = new BillInsertGroupMapRequestMethod("BillInsertGroupMapGet");
  /** Variable representing the BillInsertGroupMapUpdate method */
  public static final BillInsertGroupMapRequestMethod BILL_INSERT_GROUP_MAP_UPDATE = new BillInsertGroupMapRequestMethod("BillInsertGroupMapUpdate");
}
