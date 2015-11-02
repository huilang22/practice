/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestExecuteLogEntryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchRequestExecuteLogEntryRequestMethod implements UdtMethod {
  private String method = null;
  private BatchRequestExecuteLogEntryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchRequestExecuteLogEntryCreate method */
  public static final BatchRequestExecuteLogEntryRequestMethod BATCH_REQUEST_EXECUTE_LOG_ENTRY_CREATE = new BatchRequestExecuteLogEntryRequestMethod("BatchRequestExecuteLogEntryCreate");
  /** Variable representing the BatchRequestExecuteLogEntryDelete method */
  public static final BatchRequestExecuteLogEntryRequestMethod BATCH_REQUEST_EXECUTE_LOG_ENTRY_DELETE = new BatchRequestExecuteLogEntryRequestMethod("BatchRequestExecuteLogEntryDelete");
  /** Variable representing the BatchRequestExecuteLogEntryFind method */
  public static final BatchRequestExecuteLogEntryRequestMethod BATCH_REQUEST_EXECUTE_LOG_ENTRY_FIND = new BatchRequestExecuteLogEntryRequestMethod("BatchRequestExecuteLogEntryFind");
  /** Variable representing the BatchRequestExecuteLogEntryGet method */
  public static final BatchRequestExecuteLogEntryRequestMethod BATCH_REQUEST_EXECUTE_LOG_ENTRY_GET = new BatchRequestExecuteLogEntryRequestMethod("BatchRequestExecuteLogEntryGet");
  /** Variable representing the BatchRequestExecuteLogEntryUpdate method */
  public static final BatchRequestExecuteLogEntryRequestMethod BATCH_REQUEST_EXECUTE_LOG_ENTRY_UPDATE = new BatchRequestExecuteLogEntryRequestMethod("BatchRequestExecuteLogEntryUpdate");
}
