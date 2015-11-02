/*
 * Generated code DO NOT EDIT
 * Generated file: RateEpiRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RateEpiRequestMethod implements UdtMethod {
  private String method = null;
  private RateEpiRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RateEpiCreate method */
  public static final RateEpiRequestMethod RATE_EPI_CREATE = new RateEpiRequestMethod("RateEpiCreate");
  /** Variable representing the RateEpiDelete method */
  public static final RateEpiRequestMethod RATE_EPI_DELETE = new RateEpiRequestMethod("RateEpiDelete");
  /** Variable representing the RateEpiFind method */
  public static final RateEpiRequestMethod RATE_EPI_FIND = new RateEpiRequestMethod("RateEpiFind");
  /** Variable representing the RateEpiGet method */
  public static final RateEpiRequestMethod RATE_EPI_GET = new RateEpiRequestMethod("RateEpiGet");
  /** Variable representing the RateEpiUpdate method */
  public static final RateEpiRequestMethod RATE_EPI_UPDATE = new RateEpiRequestMethod("RateEpiUpdate");
}
