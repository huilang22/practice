/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateBandOverrideRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CorridorRateBandOverrideRequestMethod implements UdtMethod {
  private String method = null;
  private CorridorRateBandOverrideRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CorridorRateBandOverrideFind method */
  public static final CorridorRateBandOverrideRequestMethod CORRIDOR_RATE_BAND_OVERRIDE_FIND = new CorridorRateBandOverrideRequestMethod("CorridorRateBandOverrideFind");
  /** Variable representing the CorridorRateBandOverrideGet method */
  public static final CorridorRateBandOverrideRequestMethod CORRIDOR_RATE_BAND_OVERRIDE_GET = new CorridorRateBandOverrideRequestMethod("CorridorRateBandOverrideGet");
  /** Variable representing the CorridorRateBandOverrideUpdate method */
  public static final CorridorRateBandOverrideRequestMethod CORRIDOR_RATE_BAND_OVERRIDE_UPDATE = new CorridorRateBandOverrideRequestMethod("CorridorRateBandOverrideUpdate");
}
