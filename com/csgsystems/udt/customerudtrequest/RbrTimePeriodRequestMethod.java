/*
 * Generated code DO NOT EDIT
 * Generated file: RbrTimePeriodRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RbrTimePeriodRequestMethod implements UdtMethod {
  private String method = null;
  private RbrTimePeriodRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RbrTimePeriodCreate method */
  public static final RbrTimePeriodRequestMethod RBR_TIME_PERIOD_CREATE = new RbrTimePeriodRequestMethod("RbrTimePeriodCreate");
  /** Variable representing the RbrTimePeriodFind method */
  public static final RbrTimePeriodRequestMethod RBR_TIME_PERIOD_FIND = new RbrTimePeriodRequestMethod("RbrTimePeriodFind");
  /** Variable representing the RbrTimePeriodGet method */
  public static final RbrTimePeriodRequestMethod RBR_TIME_PERIOD_GET = new RbrTimePeriodRequestMethod("RbrTimePeriodGet");
  /** Variable representing the RbrTimePeriodUpdate method */
  public static final RbrTimePeriodRequestMethod RBR_TIME_PERIOD_UPDATE = new RbrTimePeriodRequestMethod("RbrTimePeriodUpdate");
}
