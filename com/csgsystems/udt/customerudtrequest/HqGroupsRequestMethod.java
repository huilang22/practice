/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupsRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class HqGroupsRequestMethod implements UdtMethod {
  private String method = null;
  private HqGroupsRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the HqGroupsCreate method */
  public static final HqGroupsRequestMethod HQ_GROUPS_CREATE = new HqGroupsRequestMethod("HqGroupsCreate");
  /** Variable representing the HqGroupsDelete method */
  public static final HqGroupsRequestMethod HQ_GROUPS_DELETE = new HqGroupsRequestMethod("HqGroupsDelete");
  /** Variable representing the HqGroupsDeleteList method */
  public static final HqGroupsRequestMethod HQ_GROUPS_DELETE_LIST = new HqGroupsRequestMethod("HqGroupsDeleteList");
  /** Variable representing the HqGroupsFind method */
  public static final HqGroupsRequestMethod HQ_GROUPS_FIND = new HqGroupsRequestMethod("HqGroupsFind");
  /** Variable representing the HqGroupsGet method */
  public static final HqGroupsRequestMethod HQ_GROUPS_GET = new HqGroupsRequestMethod("HqGroupsGet");
  /** Variable representing the HqGroupsUpdate method */
  public static final HqGroupsRequestMethod HQ_GROUPS_UPDATE = new HqGroupsRequestMethod("HqGroupsUpdate");
}
