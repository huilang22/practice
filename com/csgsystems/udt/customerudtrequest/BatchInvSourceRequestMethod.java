/*
 * Generated code DO NOT EDIT
 * Generated file: BatchInvSourceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchInvSourceRequestMethod implements UdtMethod {
  private String method = null;
  private BatchInvSourceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchInvSourceCreate method */
  public static final BatchInvSourceRequestMethod BATCH_INV_SOURCE_CREATE = new BatchInvSourceRequestMethod("BatchInvSourceCreate");
  /** Variable representing the BatchInvSourceDelete method */
  public static final BatchInvSourceRequestMethod BATCH_INV_SOURCE_DELETE = new BatchInvSourceRequestMethod("BatchInvSourceDelete");
  /** Variable representing the BatchInvSourceFind method */
  public static final BatchInvSourceRequestMethod BATCH_INV_SOURCE_FIND = new BatchInvSourceRequestMethod("BatchInvSourceFind");
  /** Variable representing the BatchInvSourceGet method */
  public static final BatchInvSourceRequestMethod BATCH_INV_SOURCE_GET = new BatchInvSourceRequestMethod("BatchInvSourceGet");
  /** Variable representing the BatchInvSourceUpdate method */
  public static final BatchInvSourceRequestMethod BATCH_INV_SOURCE_UPDATE = new BatchInvSourceRequestMethod("BatchInvSourceUpdate");
}
