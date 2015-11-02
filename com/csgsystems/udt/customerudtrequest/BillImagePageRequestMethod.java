/*
 * Generated code DO NOT EDIT
 * Generated file: BillImagePageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillImagePageRequestMethod implements UdtMethod {
  private String method = null;
  private BillImagePageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillImagePageFind method */
  public static final BillImagePageRequestMethod BILL_IMAGE_PAGE_FIND = new BillImagePageRequestMethod("BillImagePageFind");
}
