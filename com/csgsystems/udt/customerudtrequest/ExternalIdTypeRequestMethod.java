/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ExternalIdTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ExternalIdTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ExternalIdTypeCreate method */
  public static final ExternalIdTypeRequestMethod EXTERNAL_ID_TYPE_CREATE = new ExternalIdTypeRequestMethod("ExternalIdTypeCreate");
  /** Variable representing the ExternalIdTypeDelete method */
  public static final ExternalIdTypeRequestMethod EXTERNAL_ID_TYPE_DELETE = new ExternalIdTypeRequestMethod("ExternalIdTypeDelete");
  /** Variable representing the ExternalIdTypeFind method */
  public static final ExternalIdTypeRequestMethod EXTERNAL_ID_TYPE_FIND = new ExternalIdTypeRequestMethod("ExternalIdTypeFind");
  /** Variable representing the ExternalIdTypeGet method */
  public static final ExternalIdTypeRequestMethod EXTERNAL_ID_TYPE_GET = new ExternalIdTypeRequestMethod("ExternalIdTypeGet");
  /** Variable representing the ExternalIdTypeUpdate method */
  public static final ExternalIdTypeRequestMethod EXTERNAL_ID_TYPE_UPDATE = new ExternalIdTypeRequestMethod("ExternalIdTypeUpdate");
}
