/*
 * Generated code DO NOT EDIT
 * Generated file: ZoneClassRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ZoneClassRequestMethod implements UdtMethod {
  private String method = null;
  private ZoneClassRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ZoneClassCreate method */
  public static final ZoneClassRequestMethod ZONE_CLASS_CREATE = new ZoneClassRequestMethod("ZoneClassCreate");
  /** Variable representing the ZoneClassFind method */
  public static final ZoneClassRequestMethod ZONE_CLASS_FIND = new ZoneClassRequestMethod("ZoneClassFind");
  /** Variable representing the ZoneClassGet method */
  public static final ZoneClassRequestMethod ZONE_CLASS_GET = new ZoneClassRequestMethod("ZoneClassGet");
  /** Variable representing the ZoneClassUpdate method */
  public static final ZoneClassRequestMethod ZONE_CLASS_UPDATE = new ZoneClassRequestMethod("ZoneClassUpdate");
}
