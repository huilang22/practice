/*
 * Generated code DO NOT EDIT
 * Generated file: InvsThresholdRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsThresholdRequestMethod implements UdtMethod {
  private String method = null;
  private InvsThresholdRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsThresholdCreate method */
  public static final InvsThresholdRequestMethod INVS_THRESHOLD_CREATE = new InvsThresholdRequestMethod("InvsThresholdCreate");
  /** Variable representing the InvsThresholdDelete method */
  public static final InvsThresholdRequestMethod INVS_THRESHOLD_DELETE = new InvsThresholdRequestMethod("InvsThresholdDelete");
  /** Variable representing the InvsThresholdFind method */
  public static final InvsThresholdRequestMethod INVS_THRESHOLD_FIND = new InvsThresholdRequestMethod("InvsThresholdFind");
  /** Variable representing the InvsThresholdGet method */
  public static final InvsThresholdRequestMethod INVS_THRESHOLD_GET = new InvsThresholdRequestMethod("InvsThresholdGet");
  /** Variable representing the InvsThresholdUpdate method */
  public static final InvsThresholdRequestMethod INVS_THRESHOLD_UPDATE = new InvsThresholdRequestMethod("InvsThresholdUpdate");
}
