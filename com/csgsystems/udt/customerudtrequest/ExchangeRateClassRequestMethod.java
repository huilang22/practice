/*
 * Generated code DO NOT EDIT
 * Generated file: ExchangeRateClassRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ExchangeRateClassRequestMethod implements UdtMethod {
  private String method = null;
  private ExchangeRateClassRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ExchangeRateClassCreate method */
  public static final ExchangeRateClassRequestMethod EXCHANGE_RATE_CLASS_CREATE = new ExchangeRateClassRequestMethod("ExchangeRateClassCreate");
  /** Variable representing the ExchangeRateClassDelete method */
  public static final ExchangeRateClassRequestMethod EXCHANGE_RATE_CLASS_DELETE = new ExchangeRateClassRequestMethod("ExchangeRateClassDelete");
  /** Variable representing the ExchangeRateClassFind method */
  public static final ExchangeRateClassRequestMethod EXCHANGE_RATE_CLASS_FIND = new ExchangeRateClassRequestMethod("ExchangeRateClassFind");
  /** Variable representing the ExchangeRateClassGet method */
  public static final ExchangeRateClassRequestMethod EXCHANGE_RATE_CLASS_GET = new ExchangeRateClassRequestMethod("ExchangeRateClassGet");
  /** Variable representing the ExchangeRateClassUpdate method */
  public static final ExchangeRateClassRequestMethod EXCHANGE_RATE_CLASS_UPDATE = new ExchangeRateClassRequestMethod("ExchangeRateClassUpdate");
}
