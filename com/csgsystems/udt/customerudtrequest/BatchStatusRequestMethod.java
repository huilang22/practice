/*
 * Generated code DO NOT EDIT
 * Generated file: BatchStatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchStatusRequestMethod implements UdtMethod {
  private String method = null;
  private BatchStatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchStatusFind method */
  public static final BatchStatusRequestMethod BATCH_STATUS_FIND = new BatchStatusRequestMethod("BatchStatusFind");
  /** Variable representing the BatchStatusGet method */
  public static final BatchStatusRequestMethod BATCH_STATUS_GET = new BatchStatusRequestMethod("BatchStatusGet");
}
