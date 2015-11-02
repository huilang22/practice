/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateOverrideRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CorridorRateOverrideRequestMethod implements UdtMethod {
  private String method = null;
  private CorridorRateOverrideRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CorridorRateOverrideFind method */
  public static final CorridorRateOverrideRequestMethod CORRIDOR_RATE_OVERRIDE_FIND = new CorridorRateOverrideRequestMethod("CorridorRateOverrideFind");
  /** Variable representing the CorridorRateOverrideGet method */
  public static final CorridorRateOverrideRequestMethod CORRIDOR_RATE_OVERRIDE_GET = new CorridorRateOverrideRequestMethod("CorridorRateOverrideGet");
  /** Variable representing the CorridorRateOverrideUpdate method */
  public static final CorridorRateOverrideRequestMethod CORRIDOR_RATE_OVERRIDE_UPDATE = new CorridorRateOverrideRequestMethod("CorridorRateOverrideUpdate");
}
