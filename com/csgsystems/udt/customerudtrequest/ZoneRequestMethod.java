/*
 * Generated code DO NOT EDIT
 * Generated file: ZoneRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ZoneRequestMethod implements UdtMethod {
  private String method = null;
  private ZoneRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ZoneCreate method */
  public static final ZoneRequestMethod ZONE_CREATE = new ZoneRequestMethod("ZoneCreate");
  /** Variable representing the ZoneDelete method */
  public static final ZoneRequestMethod ZONE_DELETE = new ZoneRequestMethod("ZoneDelete");
  /** Variable representing the ZoneFind method */
  public static final ZoneRequestMethod ZONE_FIND = new ZoneRequestMethod("ZoneFind");
  /** Variable representing the ZoneGet method */
  public static final ZoneRequestMethod ZONE_GET = new ZoneRequestMethod("ZoneGet");
  /** Variable representing the ZoneUpdate method */
  public static final ZoneRequestMethod ZONE_UPDATE = new ZoneRequestMethod("ZoneUpdate");
}
