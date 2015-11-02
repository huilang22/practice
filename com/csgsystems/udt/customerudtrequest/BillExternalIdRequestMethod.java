/*
 * Generated code DO NOT EDIT
 * Generated file: BillExternalIdRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillExternalIdRequestMethod implements UdtMethod {
  private String method = null;
  private BillExternalIdRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillExternalIdFind method */
  public static final BillExternalIdRequestMethod BILL_EXTERNAL_ID_FIND = new BillExternalIdRequestMethod("BillExternalIdFind");
  /** Variable representing the BillExternalIdGet method */
  public static final BillExternalIdRequestMethod BILL_EXTERNAL_ID_GET = new BillExternalIdRequestMethod("BillExternalIdGet");
}
