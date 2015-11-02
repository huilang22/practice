/*
 * Generated code DO NOT EDIT
 * Generated file: BillImageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillImageRequestMethod implements UdtMethod {
  private String method = null;
  private BillImageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillImageFind method */
  public static final BillImageRequestMethod BILL_IMAGE_FIND = new BillImageRequestMethod("BillImageFind");
  /** Variable representing the BillImageGet method */
  public static final BillImageRequestMethod BILL_IMAGE_GET = new BillImageRequestMethod("BillImageGet");
}
