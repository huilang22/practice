/*
 * Generated code DO NOT EDIT
 * Generated file: DistanceBandRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DistanceBandRequestMethod implements UdtMethod {
  private String method = null;
  private DistanceBandRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DistanceBandCreate method */
  public static final DistanceBandRequestMethod DISTANCE_BAND_CREATE = new DistanceBandRequestMethod("DistanceBandCreate");
  /** Variable representing the DistanceBandDelete method */
  public static final DistanceBandRequestMethod DISTANCE_BAND_DELETE = new DistanceBandRequestMethod("DistanceBandDelete");
  /** Variable representing the DistanceBandFind method */
  public static final DistanceBandRequestMethod DISTANCE_BAND_FIND = new DistanceBandRequestMethod("DistanceBandFind");
  /** Variable representing the DistanceBandGet method */
  public static final DistanceBandRequestMethod DISTANCE_BAND_GET = new DistanceBandRequestMethod("DistanceBandGet");
  /** Variable representing the DistanceBandUpdate method */
  public static final DistanceBandRequestMethod DISTANCE_BAND_UPDATE = new DistanceBandRequestMethod("DistanceBandUpdate");
}
