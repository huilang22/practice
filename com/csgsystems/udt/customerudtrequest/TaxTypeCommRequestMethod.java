/*
 * Generated code DO NOT EDIT
 * Generated file: TaxTypeCommRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class TaxTypeCommRequestMethod implements UdtMethod {
  private String method = null;
  private TaxTypeCommRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the TaxTypeCommFind method */
  public static final TaxTypeCommRequestMethod TAX_TYPE_COMM_FIND = new TaxTypeCommRequestMethod("TaxTypeCommFind");
  /** Variable representing the TaxTypeCommGet method */
  public static final TaxTypeCommRequestMethod TAX_TYPE_COMM_GET = new TaxTypeCommRequestMethod("TaxTypeCommGet");
}
