/*
 * Generated code DO NOT EDIT
 * Generated file: TaxStatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class TaxStatusRequestMethod implements UdtMethod {
  private String method = null;
  private TaxStatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the TaxStatusFind method */
  public static final TaxStatusRequestMethod TAX_STATUS_FIND = new TaxStatusRequestMethod("TaxStatusFind");
  /** Variable representing the TaxStatusGet method */
  public static final TaxStatusRequestMethod TAX_STATUS_GET = new TaxStatusRequestMethod("TaxStatusGet");
}
