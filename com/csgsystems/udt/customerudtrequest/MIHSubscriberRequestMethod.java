/*
 * Generated code DO NOT EDIT
 * Generated file: MIHSubscriberRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class MIHSubscriberRequestMethod implements UdtMethod {
  private String method = null;
  private MIHSubscriberRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the MIHSubscriberCreate method */
  public static final MIHSubscriberRequestMethod M_I_H_SUBSCRIBER_CREATE = new MIHSubscriberRequestMethod("MIHSubscriberCreate");
  /** Variable representing the MIHSubscriberDelete method */
  public static final MIHSubscriberRequestMethod M_I_H_SUBSCRIBER_DELETE = new MIHSubscriberRequestMethod("MIHSubscriberDelete");
  /** Variable representing the MIHSubscriberGet method */
  public static final MIHSubscriberRequestMethod M_I_H_SUBSCRIBER_GET = new MIHSubscriberRequestMethod("MIHSubscriberGet");
  /** Variable representing the MIHSubscriberSync method */
  public static final MIHSubscriberRequestMethod M_I_H_SUBSCRIBER_SYNC = new MIHSubscriberRequestMethod("MIHSubscriberSync");
  /** Variable representing the MIHSubscriberUpdateCoses method */
  public static final MIHSubscriberRequestMethod M_I_H_SUBSCRIBER_UPDATE_COSES = new MIHSubscriberRequestMethod("MIHSubscriberUpdateCoses");
}
