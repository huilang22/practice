/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestActivityLogEntryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchRequestActivityLogEntryRequestMethod implements UdtMethod {
  private String method = null;
  private BatchRequestActivityLogEntryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchRequestActivityLogEntryCreate method */
  public static final BatchRequestActivityLogEntryRequestMethod BATCH_REQUEST_ACTIVITY_LOG_ENTRY_CREATE = new BatchRequestActivityLogEntryRequestMethod("BatchRequestActivityLogEntryCreate");
  /** Variable representing the BatchRequestActivityLogEntryDelete method */
  public static final BatchRequestActivityLogEntryRequestMethod BATCH_REQUEST_ACTIVITY_LOG_ENTRY_DELETE = new BatchRequestActivityLogEntryRequestMethod("BatchRequestActivityLogEntryDelete");
  /** Variable representing the BatchRequestActivityLogEntryFind method */
  public static final BatchRequestActivityLogEntryRequestMethod BATCH_REQUEST_ACTIVITY_LOG_ENTRY_FIND = new BatchRequestActivityLogEntryRequestMethod("BatchRequestActivityLogEntryFind");
  /** Variable representing the BatchRequestActivityLogEntryGet method */
  public static final BatchRequestActivityLogEntryRequestMethod BATCH_REQUEST_ACTIVITY_LOG_ENTRY_GET = new BatchRequestActivityLogEntryRequestMethod("BatchRequestActivityLogEntryGet");
  /** Variable representing the BatchRequestActivityLogEntryUpdate method */
  public static final BatchRequestActivityLogEntryRequestMethod BATCH_REQUEST_ACTIVITY_LOG_ENTRY_UPDATE = new BatchRequestActivityLogEntryRequestMethod("BatchRequestActivityLogEntryUpdate");
}
