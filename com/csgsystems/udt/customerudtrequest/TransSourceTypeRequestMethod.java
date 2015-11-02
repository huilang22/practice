/*
 * Generated code DO NOT EDIT
 * Generated file: TransSourceTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class TransSourceTypeRequestMethod implements UdtMethod {
  private String method = null;
  private TransSourceTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the TransSourceTypeCreate method */
  public static final TransSourceTypeRequestMethod TRANS_SOURCE_TYPE_CREATE = new TransSourceTypeRequestMethod("TransSourceTypeCreate");
  /** Variable representing the TransSourceTypeDelete method */
  public static final TransSourceTypeRequestMethod TRANS_SOURCE_TYPE_DELETE = new TransSourceTypeRequestMethod("TransSourceTypeDelete");
  /** Variable representing the TransSourceTypeFind method */
  public static final TransSourceTypeRequestMethod TRANS_SOURCE_TYPE_FIND = new TransSourceTypeRequestMethod("TransSourceTypeFind");
  /** Variable representing the TransSourceTypeGet method */
  public static final TransSourceTypeRequestMethod TRANS_SOURCE_TYPE_GET = new TransSourceTypeRequestMethod("TransSourceTypeGet");
  /** Variable representing the TransSourceTypeUpdate method */
  public static final TransSourceTypeRequestMethod TRANS_SOURCE_TYPE_UPDATE = new TransSourceTypeRequestMethod("TransSourceTypeUpdate");
}
