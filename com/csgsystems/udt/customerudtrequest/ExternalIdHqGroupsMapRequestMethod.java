/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdHqGroupsMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ExternalIdHqGroupsMapRequestMethod implements UdtMethod {
  private String method = null;
  private ExternalIdHqGroupsMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ExternalIdHqgroupsMapFind method */
  public static final ExternalIdHqGroupsMapRequestMethod EXTERNAL_ID_HQGROUPS_MAP_FIND = new ExternalIdHqGroupsMapRequestMethod("ExternalIdHqgroupsMapFind");
  /** Variable representing the ExternalIdHqgroupsMapGet method */
  public static final ExternalIdHqGroupsMapRequestMethod EXTERNAL_ID_HQGROUPS_MAP_GET = new ExternalIdHqGroupsMapRequestMethod("ExternalIdHqgroupsMapGet");
}
