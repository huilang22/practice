/*
 * Generated code DO NOT EDIT
 * Generated file: RateNrcRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RateNrcRequestMethod implements UdtMethod {
  private String method = null;
  private RateNrcRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RateNrcCreate method */
  public static final RateNrcRequestMethod RATE_NRC_CREATE = new RateNrcRequestMethod("RateNrcCreate");
  /** Variable representing the RateNrcFind method */
  public static final RateNrcRequestMethod RATE_NRC_FIND = new RateNrcRequestMethod("RateNrcFind");
  /** Variable representing the RateNrcGet method */
  public static final RateNrcRequestMethod RATE_NRC_GET = new RateNrcRequestMethod("RateNrcGet");
  /** Variable representing the RateNrcUpdate method */
  public static final RateNrcRequestMethod RATE_NRC_UPDATE = new RateNrcRequestMethod("RateNrcUpdate");
}
