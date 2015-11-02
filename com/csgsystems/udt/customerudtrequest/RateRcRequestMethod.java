/*
 * Generated code DO NOT EDIT
 * Generated file: RateRcRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RateRcRequestMethod implements UdtMethod {
  private String method = null;
  private RateRcRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RateRcCreate method */
  public static final RateRcRequestMethod RATE_RC_CREATE = new RateRcRequestMethod("RateRcCreate");
  /** Variable representing the RateRcDelete method */
  public static final RateRcRequestMethod RATE_RC_DELETE = new RateRcRequestMethod("RateRcDelete");
  /** Variable representing the RateRcFind method */
  public static final RateRcRequestMethod RATE_RC_FIND = new RateRcRequestMethod("RateRcFind");
  /** Variable representing the RateRcGet method */
  public static final RateRcRequestMethod RATE_RC_GET = new RateRcRequestMethod("RateRcGet");
  /** Variable representing the RateRcUpdate method */
  public static final RateRcRequestMethod RATE_RC_UPDATE = new RateRcRequestMethod("RateRcUpdate");
}
