/*
 * Generated code DO NOT EDIT
 * Generated file: DiscReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DiscReasonRequestMethod implements UdtMethod {
  private String method = null;
  private DiscReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DiscReasonCreate method */
  public static final DiscReasonRequestMethod DISC_REASON_CREATE = new DiscReasonRequestMethod("DiscReasonCreate");
  /** Variable representing the DiscReasonDelete method */
  public static final DiscReasonRequestMethod DISC_REASON_DELETE = new DiscReasonRequestMethod("DiscReasonDelete");
  /** Variable representing the DiscReasonFind method */
  public static final DiscReasonRequestMethod DISC_REASON_FIND = new DiscReasonRequestMethod("DiscReasonFind");
  /** Variable representing the DiscReasonGet method */
  public static final DiscReasonRequestMethod DISC_REASON_GET = new DiscReasonRequestMethod("DiscReasonGet");
  /** Variable representing the DiscReasonUpdate method */
  public static final DiscReasonRequestMethod DISC_REASON_UPDATE = new DiscReasonRequestMethod("DiscReasonUpdate");
}
