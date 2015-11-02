/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTierRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RbrRateTierRequestMethod implements UdtMethod {
  private String method = null;
  private RbrRateTierRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RbrRateTierCreate method */
  public static final RbrRateTierRequestMethod RBR_RATE_TIER_CREATE = new RbrRateTierRequestMethod("RbrRateTierCreate");
  /** Variable representing the RbrRateTierDelete method */
  public static final RbrRateTierRequestMethod RBR_RATE_TIER_DELETE = new RbrRateTierRequestMethod("RbrRateTierDelete");
  /** Variable representing the RbrRateTierFind method */
  public static final RbrRateTierRequestMethod RBR_RATE_TIER_FIND = new RbrRateTierRequestMethod("RbrRateTierFind");
  /** Variable representing the RbrRateTierGet method */
  public static final RbrRateTierRequestMethod RBR_RATE_TIER_GET = new RbrRateTierRequestMethod("RbrRateTierGet");
  /** Variable representing the RbrRateTierUpdate method */
  public static final RbrRateTierRequestMethod RBR_RATE_TIER_UPDATE = new RbrRateTierRequestMethod("RbrRateTierUpdate");
}
