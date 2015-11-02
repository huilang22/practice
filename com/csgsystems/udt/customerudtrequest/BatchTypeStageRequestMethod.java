/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeStageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchTypeStageRequestMethod implements UdtMethod {
  private String method = null;
  private BatchTypeStageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchTypeStageCreate method */
  public static final BatchTypeStageRequestMethod BATCH_TYPE_STAGE_CREATE = new BatchTypeStageRequestMethod("BatchTypeStageCreate");
  /** Variable representing the BatchTypeStageDelete method */
  public static final BatchTypeStageRequestMethod BATCH_TYPE_STAGE_DELETE = new BatchTypeStageRequestMethod("BatchTypeStageDelete");
  /** Variable representing the BatchTypeStageFind method */
  public static final BatchTypeStageRequestMethod BATCH_TYPE_STAGE_FIND = new BatchTypeStageRequestMethod("BatchTypeStageFind");
  /** Variable representing the BatchTypeStageGet method */
  public static final BatchTypeStageRequestMethod BATCH_TYPE_STAGE_GET = new BatchTypeStageRequestMethod("BatchTypeStageGet");
  /** Variable representing the BatchTypeStageSequenceGet method */
  public static final BatchTypeStageRequestMethod BATCH_TYPE_STAGE_SEQUENCE_GET = new BatchTypeStageRequestMethod("BatchTypeStageSequenceGet");
  /** Variable representing the BatchTypeStageUpdate method */
  public static final BatchTypeStageRequestMethod BATCH_TYPE_STAGE_UPDATE = new BatchTypeStageRequestMethod("BatchTypeStageUpdate");
}
