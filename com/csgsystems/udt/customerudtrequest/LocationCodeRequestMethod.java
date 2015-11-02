/*
 * Generated code DO NOT EDIT
 * Generated file: LocationCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class LocationCodeRequestMethod implements UdtMethod {
  private String method = null;
  private LocationCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the LocationCodeCreate method */
  public static final LocationCodeRequestMethod LOCATION_CODE_CREATE = new LocationCodeRequestMethod("LocationCodeCreate");
  /** Variable representing the LocationCodeDelete method */
  public static final LocationCodeRequestMethod LOCATION_CODE_DELETE = new LocationCodeRequestMethod("LocationCodeDelete");
  /** Variable representing the LocationCodeFind method */
  public static final LocationCodeRequestMethod LOCATION_CODE_FIND = new LocationCodeRequestMethod("LocationCodeFind");
  /** Variable representing the LocationCodeGet method */
  public static final LocationCodeRequestMethod LOCATION_CODE_GET = new LocationCodeRequestMethod("LocationCodeGet");
  /** Variable representing the LocationCodeUpdate method */
  public static final LocationCodeRequestMethod LOCATION_CODE_UPDATE = new LocationCodeRequestMethod("LocationCodeUpdate");
}
