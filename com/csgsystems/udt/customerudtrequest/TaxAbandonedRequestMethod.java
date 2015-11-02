/*
 * Generated code DO NOT EDIT
 * Generated file: TaxAbandonedRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class TaxAbandonedRequestMethod implements UdtMethod {
  private String method = null;
  private TaxAbandonedRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the TaxAbandonedFind method */
  public static final TaxAbandonedRequestMethod TAX_ABANDONED_FIND = new TaxAbandonedRequestMethod("TaxAbandonedFind");
  /** Variable representing the TaxAbandonedGet method */
  public static final TaxAbandonedRequestMethod TAX_ABANDONED_GET = new TaxAbandonedRequestMethod("TaxAbandonedGet");
}
