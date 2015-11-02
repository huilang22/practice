/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimSalesChannelRefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsSimSalesChannelRefRequestMethod implements UdtMethod {
  private String method = null;
  private InvsSimSalesChannelRefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsSimSalesChannelRefCreate method */
  public static final InvsSimSalesChannelRefRequestMethod INVS_SIM_SALES_CHANNEL_REF_CREATE = new InvsSimSalesChannelRefRequestMethod("InvsSimSalesChannelRefCreate");
  /** Variable representing the InvsSimSalesChannelRefFind method */
  public static final InvsSimSalesChannelRefRequestMethod INVS_SIM_SALES_CHANNEL_REF_FIND = new InvsSimSalesChannelRefRequestMethod("InvsSimSalesChannelRefFind");
  /** Variable representing the InvsSimSalesChannelRefGet method */
  public static final InvsSimSalesChannelRefRequestMethod INVS_SIM_SALES_CHANNEL_REF_GET = new InvsSimSalesChannelRefRequestMethod("InvsSimSalesChannelRefGet");
  /** Variable representing the InvsSimSalesChannelRefUpdate method */
  public static final InvsSimSalesChannelRefRequestMethod INVS_SIM_SALES_CHANNEL_REF_UPDATE = new InvsSimSalesChannelRefRequestMethod("InvsSimSalesChannelRefUpdate");
}
