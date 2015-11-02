/*
 * Generated code DO NOT EDIT
 * Generated file: BillDispatchMethodRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillDispatchMethodRequestMethod implements UdtMethod {
  private String method = null;
  private BillDispatchMethodRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillDispatchMethodCreate method */
  public static final BillDispatchMethodRequestMethod BILL_DISPATCH_METHOD_CREATE = new BillDispatchMethodRequestMethod("BillDispatchMethodCreate");
  /** Variable representing the BillDispatchMethodDelete method */
  public static final BillDispatchMethodRequestMethod BILL_DISPATCH_METHOD_DELETE = new BillDispatchMethodRequestMethod("BillDispatchMethodDelete");
  /** Variable representing the BillDispatchMethodFind method */
  public static final BillDispatchMethodRequestMethod BILL_DISPATCH_METHOD_FIND = new BillDispatchMethodRequestMethod("BillDispatchMethodFind");
  /** Variable representing the BillDispatchMethodGet method */
  public static final BillDispatchMethodRequestMethod BILL_DISPATCH_METHOD_GET = new BillDispatchMethodRequestMethod("BillDispatchMethodGet");
  /** Variable representing the BillDispatchMethodUpdate method */
  public static final BillDispatchMethodRequestMethod BILL_DISPATCH_METHOD_UPDATE = new BillDispatchMethodRequestMethod("BillDispatchMethodUpdate");
}
