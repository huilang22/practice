/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeValidateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsTypeValidateRequestMethod implements UdtMethod {
  private String method = null;
  private InvsTypeValidateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsTypeValidateCreate method */
  public static final InvsTypeValidateRequestMethod INVS_TYPE_VALIDATE_CREATE = new InvsTypeValidateRequestMethod("InvsTypeValidateCreate");
}
