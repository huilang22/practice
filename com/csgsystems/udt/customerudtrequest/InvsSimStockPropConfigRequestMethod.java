/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimStockPropConfigRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsSimStockPropConfigRequestMethod implements UdtMethod {
  private String method = null;
  private InvsSimStockPropConfigRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsSimStockPropConfigCreate method */
  public static final InvsSimStockPropConfigRequestMethod INVS_SIM_STOCK_PROP_CONFIG_CREATE = new InvsSimStockPropConfigRequestMethod("InvsSimStockPropConfigCreate");
  /** Variable representing the InvsSimStockPropConfigFind method */
  public static final InvsSimStockPropConfigRequestMethod INVS_SIM_STOCK_PROP_CONFIG_FIND = new InvsSimStockPropConfigRequestMethod("InvsSimStockPropConfigFind");
  /** Variable representing the InvsSimStockPropConfigGet method */
  public static final InvsSimStockPropConfigRequestMethod INVS_SIM_STOCK_PROP_CONFIG_GET = new InvsSimStockPropConfigRequestMethod("InvsSimStockPropConfigGet");
  /** Variable representing the InvsSimStockPropConfigUpdate method */
  public static final InvsSimStockPropConfigRequestMethod INVS_SIM_STOCK_PROP_CONFIG_UPDATE = new InvsSimStockPropConfigRequestMethod("InvsSimStockPropConfigUpdate");
}
