/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSalesChannelRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsSalesChannelRequestMethod implements UdtMethod {
  private String method = null;
  private InvsSalesChannelRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsSalesChannelCreate method */
  public static final InvsSalesChannelRequestMethod INVS_SALES_CHANNEL_CREATE = new InvsSalesChannelRequestMethod("InvsSalesChannelCreate");
  /** Variable representing the InvsSalesChannelFind method */
  public static final InvsSalesChannelRequestMethod INVS_SALES_CHANNEL_FIND = new InvsSalesChannelRequestMethod("InvsSalesChannelFind");
  /** Variable representing the InvsSalesChannelGet method */
  public static final InvsSalesChannelRequestMethod INVS_SALES_CHANNEL_GET = new InvsSalesChannelRequestMethod("InvsSalesChannelGet");
  /** Variable representing the InvsSalesChannelUpdate method */
  public static final InvsSalesChannelRequestMethod INVS_SALES_CHANNEL_UPDATE = new InvsSalesChannelRequestMethod("InvsSalesChannelUpdate");
}
