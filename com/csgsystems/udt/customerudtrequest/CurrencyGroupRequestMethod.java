/*
 * Generated code DO NOT EDIT
 * Generated file: CurrencyGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CurrencyGroupRequestMethod implements UdtMethod {
  private String method = null;
  private CurrencyGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CurrencyGroupCreate method */
  public static final CurrencyGroupRequestMethod CURRENCY_GROUP_CREATE = new CurrencyGroupRequestMethod("CurrencyGroupCreate");
  /** Variable representing the CurrencyGroupDelete method */
  public static final CurrencyGroupRequestMethod CURRENCY_GROUP_DELETE = new CurrencyGroupRequestMethod("CurrencyGroupDelete");
  /** Variable representing the CurrencyGroupFind method */
  public static final CurrencyGroupRequestMethod CURRENCY_GROUP_FIND = new CurrencyGroupRequestMethod("CurrencyGroupFind");
  /** Variable representing the CurrencyGroupGet method */
  public static final CurrencyGroupRequestMethod CURRENCY_GROUP_GET = new CurrencyGroupRequestMethod("CurrencyGroupGet");
  /** Variable representing the CurrencyGroupUpdate method */
  public static final CurrencyGroupRequestMethod CURRENCY_GROUP_UPDATE = new CurrencyGroupRequestMethod("CurrencyGroupUpdate");
}
