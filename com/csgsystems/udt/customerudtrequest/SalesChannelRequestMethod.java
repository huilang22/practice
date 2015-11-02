/*
 * Generated code DO NOT EDIT
 * Generated file: SalesChannelRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SalesChannelRequestMethod implements UdtMethod {
  private String method = null;
  private SalesChannelRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SalesChannelCreate method */
  public static final SalesChannelRequestMethod SALES_CHANNEL_CREATE = new SalesChannelRequestMethod("SalesChannelCreate");
  /** Variable representing the SalesChannelDelete method */
  public static final SalesChannelRequestMethod SALES_CHANNEL_DELETE = new SalesChannelRequestMethod("SalesChannelDelete");
  /** Variable representing the SalesChannelFind method */
  public static final SalesChannelRequestMethod SALES_CHANNEL_FIND = new SalesChannelRequestMethod("SalesChannelFind");
  /** Variable representing the SalesChannelGet method */
  public static final SalesChannelRequestMethod SALES_CHANNEL_GET = new SalesChannelRequestMethod("SalesChannelGet");
  /** Variable representing the SalesChannelUpdate method */
  public static final SalesChannelRequestMethod SALES_CHANNEL_UPDATE = new SalesChannelRequestMethod("SalesChannelUpdate");
}
