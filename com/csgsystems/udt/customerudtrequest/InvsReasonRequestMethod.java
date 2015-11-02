/*
 * Generated code DO NOT EDIT
 * Generated file: InvsReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsReasonRequestMethod implements UdtMethod {
  private String method = null;
  private InvsReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsReasonCreate method */
  public static final InvsReasonRequestMethod INVS_REASON_CREATE = new InvsReasonRequestMethod("InvsReasonCreate");
  /** Variable representing the InvsReasonFind method */
  public static final InvsReasonRequestMethod INVS_REASON_FIND = new InvsReasonRequestMethod("InvsReasonFind");
  /** Variable representing the InvsReasonGet method */
  public static final InvsReasonRequestMethod INVS_REASON_GET = new InvsReasonRequestMethod("InvsReasonGet");
  /** Variable representing the InvsReasonUpdate method */
  public static final InvsReasonRequestMethod INVS_REASON_UPDATE = new InvsReasonRequestMethod("InvsReasonUpdate");
}
