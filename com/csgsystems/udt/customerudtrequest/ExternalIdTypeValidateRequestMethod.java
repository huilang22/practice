/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdTypeValidateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ExternalIdTypeValidateRequestMethod implements UdtMethod {
  private String method = null;
  private ExternalIdTypeValidateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ExternalIdTypeValidateCreate method */
  public static final ExternalIdTypeValidateRequestMethod EXTERNAL_ID_TYPE_VALIDATE_CREATE = new ExternalIdTypeValidateRequestMethod("ExternalIdTypeValidateCreate");
}
