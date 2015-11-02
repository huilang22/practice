/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupCorridorRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class HqGroupCorridorRequestMethod implements UdtMethod {
  private String method = null;
  private HqGroupCorridorRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the HqGroupCorridorCreate method */
  public static final HqGroupCorridorRequestMethod HQ_GROUP_CORRIDOR_CREATE = new HqGroupCorridorRequestMethod("HqGroupCorridorCreate");
  /** Variable representing the HqGroupCorridorDelete method */
  public static final HqGroupCorridorRequestMethod HQ_GROUP_CORRIDOR_DELETE = new HqGroupCorridorRequestMethod("HqGroupCorridorDelete");
  /** Variable representing the HqGroupCorridorDeleteList method */
  public static final HqGroupCorridorRequestMethod HQ_GROUP_CORRIDOR_DELETE_LIST = new HqGroupCorridorRequestMethod("HqGroupCorridorDeleteList");
  /** Variable representing the HqGroupCorridorFind method */
  public static final HqGroupCorridorRequestMethod HQ_GROUP_CORRIDOR_FIND = new HqGroupCorridorRequestMethod("HqGroupCorridorFind");
  /** Variable representing the HqGroupCorridorGet method */
  public static final HqGroupCorridorRequestMethod HQ_GROUP_CORRIDOR_GET = new HqGroupCorridorRequestMethod("HqGroupCorridorGet");
  /** Variable representing the HqGroupCorridorUpdate method */
  public static final HqGroupCorridorRequestMethod HQ_GROUP_CORRIDOR_UPDATE = new HqGroupCorridorRequestMethod("HqGroupCorridorUpdate");
}
