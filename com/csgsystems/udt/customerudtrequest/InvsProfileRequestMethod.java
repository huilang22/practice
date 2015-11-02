/*
 * Generated code DO NOT EDIT
 * Generated file: InvsProfileRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsProfileRequestMethod implements UdtMethod {
  private String method = null;
  private InvsProfileRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsProfileCreate method */
  public static final InvsProfileRequestMethod INVS_PROFILE_CREATE = new InvsProfileRequestMethod("InvsProfileCreate");
  /** Variable representing the InvsProfileFind method */
  public static final InvsProfileRequestMethod INVS_PROFILE_FIND = new InvsProfileRequestMethod("InvsProfileFind");
  /** Variable representing the InvsProfileGet method */
  public static final InvsProfileRequestMethod INVS_PROFILE_GET = new InvsProfileRequestMethod("InvsProfileGet");
  /** Variable representing the InvsProfileUpdate method */
  public static final InvsProfileRequestMethod INVS_PROFILE_UPDATE = new InvsProfileRequestMethod("InvsProfileUpdate");
}
