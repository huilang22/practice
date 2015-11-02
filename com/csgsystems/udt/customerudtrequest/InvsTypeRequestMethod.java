/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsTypeRequestMethod implements UdtMethod {
  private String method = null;
  private InvsTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsTypeCreate method */
  public static final InvsTypeRequestMethod INVS_TYPE_CREATE = new InvsTypeRequestMethod("InvsTypeCreate");
  /** Variable representing the InvsTypeFind method */
  public static final InvsTypeRequestMethod INVS_TYPE_FIND = new InvsTypeRequestMethod("InvsTypeFind");
  /** Variable representing the InvsTypeGet method */
  public static final InvsTypeRequestMethod INVS_TYPE_GET = new InvsTypeRequestMethod("InvsTypeGet");
  /** Variable representing the InvsTypeRate method */
  public static final InvsTypeRequestMethod INVS_TYPE_RATE = new InvsTypeRequestMethod("InvsTypeRate");
  /** Variable representing the InvsTypeUpdate method */
  public static final InvsTypeRequestMethod INVS_TYPE_UPDATE = new InvsTypeRequestMethod("InvsTypeUpdate");
}
