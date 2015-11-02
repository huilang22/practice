/*
 * Generated code DO NOT EDIT
 * Generated file: BillClassRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillClassRequestMethod implements UdtMethod {
  private String method = null;
  private BillClassRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillClassCreate method */
  public static final BillClassRequestMethod BILL_CLASS_CREATE = new BillClassRequestMethod("BillClassCreate");
  /** Variable representing the BillClassDelete method */
  public static final BillClassRequestMethod BILL_CLASS_DELETE = new BillClassRequestMethod("BillClassDelete");
  /** Variable representing the BillClassFind method */
  public static final BillClassRequestMethod BILL_CLASS_FIND = new BillClassRequestMethod("BillClassFind");
  /** Variable representing the BillClassGet method */
  public static final BillClassRequestMethod BILL_CLASS_GET = new BillClassRequestMethod("BillClassGet");
  /** Variable representing the BillClassUpdate method */
  public static final BillClassRequestMethod BILL_CLASS_UPDATE = new BillClassRequestMethod("BillClassUpdate");
}
