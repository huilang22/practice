/*
 * Generated code DO NOT EDIT
 * Generated file: InvdThresholdRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvdThresholdRequestMethod implements UdtMethod {
  private String method = null;
  private InvdThresholdRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvdThresholdCreate method */
  public static final InvdThresholdRequestMethod INVD_THRESHOLD_CREATE = new InvdThresholdRequestMethod("InvdThresholdCreate");
  /** Variable representing the InvdThresholdDelete method */
  public static final InvdThresholdRequestMethod INVD_THRESHOLD_DELETE = new InvdThresholdRequestMethod("InvdThresholdDelete");
  /** Variable representing the InvdThresholdFind method */
  public static final InvdThresholdRequestMethod INVD_THRESHOLD_FIND = new InvdThresholdRequestMethod("InvdThresholdFind");
  /** Variable representing the InvdThresholdGet method */
  public static final InvdThresholdRequestMethod INVD_THRESHOLD_GET = new InvdThresholdRequestMethod("InvdThresholdGet");
  /** Variable representing the InvdThresholdUpdate method */
  public static final InvdThresholdRequestMethod INVD_THRESHOLD_UPDATE = new InvdThresholdRequestMethod("InvdThresholdUpdate");
}
