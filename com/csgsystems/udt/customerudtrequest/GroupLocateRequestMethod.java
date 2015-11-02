/*
 * Generated code DO NOT EDIT
 * Generated file: GroupLocateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GroupLocateRequestMethod implements UdtMethod {
  private String method = null;
  private GroupLocateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GroupLocateFind method */
  public static final GroupLocateRequestMethod GROUP_LOCATE_FIND = new GroupLocateRequestMethod("GroupLocateFind");
  /** Variable representing the GroupLocateGet method */
  public static final GroupLocateRequestMethod GROUP_LOCATE_GET = new GroupLocateRequestMethod("GroupLocateGet");
}
