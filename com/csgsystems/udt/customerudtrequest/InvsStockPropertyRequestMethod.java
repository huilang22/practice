/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStockPropertyRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsStockPropertyRequestMethod implements UdtMethod {
  private String method = null;
  private InvsStockPropertyRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsStockPropertyCreate method */
  public static final InvsStockPropertyRequestMethod INVS_STOCK_PROPERTY_CREATE = new InvsStockPropertyRequestMethod("InvsStockPropertyCreate");
  /** Variable representing the InvsStockPropertyFind method */
  public static final InvsStockPropertyRequestMethod INVS_STOCK_PROPERTY_FIND = new InvsStockPropertyRequestMethod("InvsStockPropertyFind");
  /** Variable representing the InvsStockPropertyGet method */
  public static final InvsStockPropertyRequestMethod INVS_STOCK_PROPERTY_GET = new InvsStockPropertyRequestMethod("InvsStockPropertyGet");
  /** Variable representing the InvsStockPropertyUpdate method */
  public static final InvsStockPropertyRequestMethod INVS_STOCK_PROPERTY_UPDATE = new InvsStockPropertyRequestMethod("InvsStockPropertyUpdate");
}
