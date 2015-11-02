/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestNotifyMessageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchRequestNotifyMessageRequestMethod implements UdtMethod {
  private String method = null;
  private BatchRequestNotifyMessageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchRequestNotifyMessageCreate method */
  public static final BatchRequestNotifyMessageRequestMethod BATCH_REQUEST_NOTIFY_MESSAGE_CREATE = new BatchRequestNotifyMessageRequestMethod("BatchRequestNotifyMessageCreate");
  /** Variable representing the BatchRequestNotifyMessageDelete method */
  public static final BatchRequestNotifyMessageRequestMethod BATCH_REQUEST_NOTIFY_MESSAGE_DELETE = new BatchRequestNotifyMessageRequestMethod("BatchRequestNotifyMessageDelete");
  /** Variable representing the BatchRequestNotifyMessageFind method */
  public static final BatchRequestNotifyMessageRequestMethod BATCH_REQUEST_NOTIFY_MESSAGE_FIND = new BatchRequestNotifyMessageRequestMethod("BatchRequestNotifyMessageFind");
  /** Variable representing the BatchRequestNotifyMessageGet method */
  public static final BatchRequestNotifyMessageRequestMethod BATCH_REQUEST_NOTIFY_MESSAGE_GET = new BatchRequestNotifyMessageRequestMethod("BatchRequestNotifyMessageGet");
  /** Variable representing the BatchRequestNotifyMessageSequenceGet method */
  public static final BatchRequestNotifyMessageRequestMethod BATCH_REQUEST_NOTIFY_MESSAGE_SEQUENCE_GET = new BatchRequestNotifyMessageRequestMethod("BatchRequestNotifyMessageSequenceGet");
  /** Variable representing the BatchRequestNotifyMessageUpdate method */
  public static final BatchRequestNotifyMessageRequestMethod BATCH_REQUEST_NOTIFY_MESSAGE_UPDATE = new BatchRequestNotifyMessageRequestMethod("BatchRequestNotifyMessageUpdate");
}
