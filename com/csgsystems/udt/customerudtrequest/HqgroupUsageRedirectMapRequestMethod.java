/*
 * Generated code DO NOT EDIT
 * Generated file: HqgroupUsageRedirectMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class HqgroupUsageRedirectMapRequestMethod implements UdtMethod {
  private String method = null;
  private HqgroupUsageRedirectMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the HqgroupUsageRedirectMapCancel method */
  public static final HqgroupUsageRedirectMapRequestMethod HQGROUP_USAGE_REDIRECT_MAP_CANCEL = new HqgroupUsageRedirectMapRequestMethod("HqgroupUsageRedirectMapCancel");
  /** Variable representing the HqgroupUsageRedirectMapCreate method */
  public static final HqgroupUsageRedirectMapRequestMethod HQGROUP_USAGE_REDIRECT_MAP_CREATE = new HqgroupUsageRedirectMapRequestMethod("HqgroupUsageRedirectMapCreate");
  /** Variable representing the HqgroupUsageRedirectMapDelete method */
  public static final HqgroupUsageRedirectMapRequestMethod HQGROUP_USAGE_REDIRECT_MAP_DELETE = new HqgroupUsageRedirectMapRequestMethod("HqgroupUsageRedirectMapDelete");
  /** Variable representing the HqgroupUsageRedirectMapDeleteList method */
  public static final HqgroupUsageRedirectMapRequestMethod HQGROUP_USAGE_REDIRECT_MAP_DELETE_LIST = new HqgroupUsageRedirectMapRequestMethod("HqgroupUsageRedirectMapDeleteList");
  /** Variable representing the HqgroupUsageRedirectMapDisconnectList method */
  public static final HqgroupUsageRedirectMapRequestMethod HQGROUP_USAGE_REDIRECT_MAP_DISCONNECT_LIST = new HqgroupUsageRedirectMapRequestMethod("HqgroupUsageRedirectMapDisconnectList");
  /** Variable representing the HqgroupUsageRedirectMapFind method */
  public static final HqgroupUsageRedirectMapRequestMethod HQGROUP_USAGE_REDIRECT_MAP_FIND = new HqgroupUsageRedirectMapRequestMethod("HqgroupUsageRedirectMapFind");
  /** Variable representing the HqgroupUsageRedirectMapGet method */
  public static final HqgroupUsageRedirectMapRequestMethod HQGROUP_USAGE_REDIRECT_MAP_GET = new HqgroupUsageRedirectMapRequestMethod("HqgroupUsageRedirectMapGet");
  /** Variable representing the HqgroupUsageRedirectMapPriorityUpdate method */
  public static final HqgroupUsageRedirectMapRequestMethod HQGROUP_USAGE_REDIRECT_MAP_PRIORITY_UPDATE = new HqgroupUsageRedirectMapRequestMethod("HqgroupUsageRedirectMapPriorityUpdate");
  /** Variable representing the HqgroupUsageRedirectMapUpdate method */
  public static final HqgroupUsageRedirectMapRequestMethod HQGROUP_USAGE_REDIRECT_MAP_UPDATE = new HqgroupUsageRedirectMapRequestMethod("HqgroupUsageRedirectMapUpdate");
}
