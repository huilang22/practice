/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStockPropConfigRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsStockPropConfigRequestMethod implements UdtMethod {
  private String method = null;
  private InvsStockPropConfigRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsStockPropConfigCreate method */
  public static final InvsStockPropConfigRequestMethod INVS_STOCK_PROP_CONFIG_CREATE = new InvsStockPropConfigRequestMethod("InvsStockPropConfigCreate");
  /** Variable representing the InvsStockPropConfigFind method */
  public static final InvsStockPropConfigRequestMethod INVS_STOCK_PROP_CONFIG_FIND = new InvsStockPropConfigRequestMethod("InvsStockPropConfigFind");
  /** Variable representing the InvsStockPropConfigGet method */
  public static final InvsStockPropConfigRequestMethod INVS_STOCK_PROP_CONFIG_GET = new InvsStockPropConfigRequestMethod("InvsStockPropConfigGet");
  /** Variable representing the InvsStockPropConfigUpdate method */
  public static final InvsStockPropConfigRequestMethod INVS_STOCK_PROP_CONFIG_UPDATE = new InvsStockPropConfigRequestMethod("InvsStockPropConfigUpdate");
}
