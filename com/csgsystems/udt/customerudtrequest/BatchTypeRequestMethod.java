/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchTypeRequestMethod implements UdtMethod {
  private String method = null;
  private BatchTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchTypeCreate method */
  public static final BatchTypeRequestMethod BATCH_TYPE_CREATE = new BatchTypeRequestMethod("BatchTypeCreate");
  /** Variable representing the BatchTypeDelete method */
  public static final BatchTypeRequestMethod BATCH_TYPE_DELETE = new BatchTypeRequestMethod("BatchTypeDelete");
  /** Variable representing the BatchTypeFind method */
  public static final BatchTypeRequestMethod BATCH_TYPE_FIND = new BatchTypeRequestMethod("BatchTypeFind");
  /** Variable representing the BatchTypeGet method */
  public static final BatchTypeRequestMethod BATCH_TYPE_GET = new BatchTypeRequestMethod("BatchTypeGet");
  /** Variable representing the BatchTypeSequenceGet method */
  public static final BatchTypeRequestMethod BATCH_TYPE_SEQUENCE_GET = new BatchTypeRequestMethod("BatchTypeSequenceGet");
  /** Variable representing the BatchTypeUpdate method */
  public static final BatchTypeRequestMethod BATCH_TYPE_UPDATE = new BatchTypeRequestMethod("BatchTypeUpdate");
}
