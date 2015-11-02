/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtCurrencyCodeMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AxrtCurrencyCodeMapRequestMethod implements UdtMethod {
  private String method = null;
  private AxrtCurrencyCodeMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AxrtCurrencyCodeMapGet method */
  public static final AxrtCurrencyCodeMapRequestMethod AXRT_CURRENCY_CODE_MAP_GET = new AxrtCurrencyCodeMapRequestMethod("AxrtCurrencyCodeMapGet");
}
