/*
 * Generated code DO NOT EDIT
 * Generated file: ServInvElementRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServInvElementRequestMethod implements UdtMethod {
  private String method = null;
  private ServInvElementRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServInvElementFind method */
  public static final ServInvElementRequestMethod SERV_INV_ELEMENT_FIND = new ServInvElementRequestMethod("ServInvElementFind");
}
