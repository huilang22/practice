/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupUsageRedirectGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class HqGroupUsageRedirectGroupRequestMethod implements UdtMethod {
  private String method = null;
  private HqGroupUsageRedirectGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the HqGroupUsageRedirectGroupCreate method */
  public static final HqGroupUsageRedirectGroupRequestMethod HQ_GROUP_USAGE_REDIRECT_GROUP_CREATE = new HqGroupUsageRedirectGroupRequestMethod("HqGroupUsageRedirectGroupCreate");
  /** Variable representing the HqGroupUsageRedirectGroupDelete method */
  public static final HqGroupUsageRedirectGroupRequestMethod HQ_GROUP_USAGE_REDIRECT_GROUP_DELETE = new HqGroupUsageRedirectGroupRequestMethod("HqGroupUsageRedirectGroupDelete");
  /** Variable representing the HqGroupUsageRedirectGroupFind method */
  public static final HqGroupUsageRedirectGroupRequestMethod HQ_GROUP_USAGE_REDIRECT_GROUP_FIND = new HqGroupUsageRedirectGroupRequestMethod("HqGroupUsageRedirectGroupFind");
  /** Variable representing the HqGroupUsageRedirectGroupGet method */
  public static final HqGroupUsageRedirectGroupRequestMethod HQ_GROUP_USAGE_REDIRECT_GROUP_GET = new HqGroupUsageRedirectGroupRequestMethod("HqGroupUsageRedirectGroupGet");
}
