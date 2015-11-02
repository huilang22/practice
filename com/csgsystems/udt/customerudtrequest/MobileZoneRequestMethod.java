/*
 * Generated code DO NOT EDIT
 * Generated file: MobileZoneRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class MobileZoneRequestMethod implements UdtMethod {
  private String method = null;
  private MobileZoneRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the MobileZoneCreate method */
  public static final MobileZoneRequestMethod MOBILE_ZONE_CREATE = new MobileZoneRequestMethod("MobileZoneCreate");
  /** Variable representing the MobileZoneDelete method */
  public static final MobileZoneRequestMethod MOBILE_ZONE_DELETE = new MobileZoneRequestMethod("MobileZoneDelete");
  /** Variable representing the MobileZoneFind method */
  public static final MobileZoneRequestMethod MOBILE_ZONE_FIND = new MobileZoneRequestMethod("MobileZoneFind");
  /** Variable representing the MobileZoneGet method */
  public static final MobileZoneRequestMethod MOBILE_ZONE_GET = new MobileZoneRequestMethod("MobileZoneGet");
  /** Variable representing the MobileZoneUpdate method */
  public static final MobileZoneRequestMethod MOBILE_ZONE_UPDATE = new MobileZoneRequestMethod("MobileZoneUpdate");
}
