/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RbrRateRequestMethod implements UdtMethod {
  private String method = null;
  private RbrRateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RbrRateCreate method */
  public static final RbrRateRequestMethod RBR_RATE_CREATE = new RbrRateRequestMethod("RbrRateCreate");
  /** Variable representing the RbrRateDelete method */
  public static final RbrRateRequestMethod RBR_RATE_DELETE = new RbrRateRequestMethod("RbrRateDelete");
  /** Variable representing the RbrRateFind method */
  public static final RbrRateRequestMethod RBR_RATE_FIND = new RbrRateRequestMethod("RbrRateFind");
  /** Variable representing the RbrRateGet method */
  public static final RbrRateRequestMethod RBR_RATE_GET = new RbrRateRequestMethod("RbrRateGet");
  /** Variable representing the RbrRateUpdate method */
  public static final RbrRateRequestMethod RBR_RATE_UPDATE = new RbrRateRequestMethod("RbrRateUpdate");
}
