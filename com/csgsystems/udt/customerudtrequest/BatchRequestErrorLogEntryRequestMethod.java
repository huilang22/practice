/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestErrorLogEntryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchRequestErrorLogEntryRequestMethod implements UdtMethod {
  private String method = null;
  private BatchRequestErrorLogEntryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchRequestErrorLogDeleteList method */
  public static final BatchRequestErrorLogEntryRequestMethod BATCH_REQUEST_ERROR_LOG_DELETE_LIST = new BatchRequestErrorLogEntryRequestMethod("BatchRequestErrorLogDeleteList");
  /** Variable representing the BatchRequestErrorLogEntryCreate method */
  public static final BatchRequestErrorLogEntryRequestMethod BATCH_REQUEST_ERROR_LOG_ENTRY_CREATE = new BatchRequestErrorLogEntryRequestMethod("BatchRequestErrorLogEntryCreate");
  /** Variable representing the BatchRequestErrorLogEntryDelete method */
  public static final BatchRequestErrorLogEntryRequestMethod BATCH_REQUEST_ERROR_LOG_ENTRY_DELETE = new BatchRequestErrorLogEntryRequestMethod("BatchRequestErrorLogEntryDelete");
  /** Variable representing the BatchRequestErrorLogEntryFind method */
  public static final BatchRequestErrorLogEntryRequestMethod BATCH_REQUEST_ERROR_LOG_ENTRY_FIND = new BatchRequestErrorLogEntryRequestMethod("BatchRequestErrorLogEntryFind");
  /** Variable representing the BatchRequestErrorLogEntryGet method */
  public static final BatchRequestErrorLogEntryRequestMethod BATCH_REQUEST_ERROR_LOG_ENTRY_GET = new BatchRequestErrorLogEntryRequestMethod("BatchRequestErrorLogEntryGet");
  /** Variable representing the BatchRequestErrorLogEntrySequence method */
  public static final BatchRequestErrorLogEntryRequestMethod BATCH_REQUEST_ERROR_LOG_ENTRY_SEQUENCE = new BatchRequestErrorLogEntryRequestMethod("BatchRequestErrorLogEntrySequence");
  /** Variable representing the BatchRequestErrorLogEntryUpdate method */
  public static final BatchRequestErrorLogEntryRequestMethod BATCH_REQUEST_ERROR_LOG_ENTRY_UPDATE = new BatchRequestErrorLogEntryRequestMethod("BatchRequestErrorLogEntryUpdate");
}
