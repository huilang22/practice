/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimSalesChannelRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsSimSalesChannelRequestMethod implements UdtMethod {
  private String method = null;
  private InvsSimSalesChannelRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsSimSalesChannelCreate method */
  public static final InvsSimSalesChannelRequestMethod INVS_SIM_SALES_CHANNEL_CREATE = new InvsSimSalesChannelRequestMethod("InvsSimSalesChannelCreate");
  /** Variable representing the InvsSimSalesChannelFind method */
  public static final InvsSimSalesChannelRequestMethod INVS_SIM_SALES_CHANNEL_FIND = new InvsSimSalesChannelRequestMethod("InvsSimSalesChannelFind");
  /** Variable representing the InvsSimSalesChannelGet method */
  public static final InvsSimSalesChannelRequestMethod INVS_SIM_SALES_CHANNEL_GET = new InvsSimSalesChannelRequestMethod("InvsSimSalesChannelGet");
  /** Variable representing the InvsSimSalesChannelUpdate method */
  public static final InvsSimSalesChannelRequestMethod INVS_SIM_SALES_CHANNEL_UPDATE = new InvsSimSalesChannelRequestMethod("InvsSimSalesChannelUpdate");
}
