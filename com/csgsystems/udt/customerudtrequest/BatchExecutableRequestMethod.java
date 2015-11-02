/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchExecutableRequestMethod implements UdtMethod {
  private String method = null;
  private BatchExecutableRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchExecutableCreate method */
  public static final BatchExecutableRequestMethod BATCH_EXECUTABLE_CREATE = new BatchExecutableRequestMethod("BatchExecutableCreate");
  /** Variable representing the BatchExecutableDelete method */
  public static final BatchExecutableRequestMethod BATCH_EXECUTABLE_DELETE = new BatchExecutableRequestMethod("BatchExecutableDelete");
  /** Variable representing the BatchExecutableFind method */
  public static final BatchExecutableRequestMethod BATCH_EXECUTABLE_FIND = new BatchExecutableRequestMethod("BatchExecutableFind");
  /** Variable representing the BatchExecutableGet method */
  public static final BatchExecutableRequestMethod BATCH_EXECUTABLE_GET = new BatchExecutableRequestMethod("BatchExecutableGet");
  /** Variable representing the BatchExecutableSequenceGet method */
  public static final BatchExecutableRequestMethod BATCH_EXECUTABLE_SEQUENCE_GET = new BatchExecutableRequestMethod("BatchExecutableSequenceGet");
  /** Variable representing the BatchExecutableUpdate method */
  public static final BatchExecutableRequestMethod BATCH_EXECUTABLE_UPDATE = new BatchExecutableRequestMethod("BatchExecutableUpdate");
}
