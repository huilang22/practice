/*
 * Generated code DO NOT EDIT
 * Generated file: RateCurrencyRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RateCurrencyRequestMethod implements UdtMethod {
  private String method = null;
  private RateCurrencyRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RateCurrencyCreate method */
  public static final RateCurrencyRequestMethod RATE_CURRENCY_CREATE = new RateCurrencyRequestMethod("RateCurrencyCreate");
  /** Variable representing the RateCurrencyDelete method */
  public static final RateCurrencyRequestMethod RATE_CURRENCY_DELETE = new RateCurrencyRequestMethod("RateCurrencyDelete");
  /** Variable representing the RateCurrencyFind method */
  public static final RateCurrencyRequestMethod RATE_CURRENCY_FIND = new RateCurrencyRequestMethod("RateCurrencyFind");
  /** Variable representing the RateCurrencyGet method */
  public static final RateCurrencyRequestMethod RATE_CURRENCY_GET = new RateCurrencyRequestMethod("RateCurrencyGet");
  /** Variable representing the RateCurrencyUpdate method */
  public static final RateCurrencyRequestMethod RATE_CURRENCY_UPDATE = new RateCurrencyRequestMethod("RateCurrencyUpdate");
}
