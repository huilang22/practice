/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchRequestParticipantRequestMethod implements UdtMethod {
  private String method = null;
  private BatchRequestParticipantRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchRequestParticipantCreate method */
  public static final BatchRequestParticipantRequestMethod BATCH_REQUEST_PARTICIPANT_CREATE = new BatchRequestParticipantRequestMethod("BatchRequestParticipantCreate");
  /** Variable representing the BatchRequestParticipantDelete method */
  public static final BatchRequestParticipantRequestMethod BATCH_REQUEST_PARTICIPANT_DELETE = new BatchRequestParticipantRequestMethod("BatchRequestParticipantDelete");
  /** Variable representing the BatchRequestParticipantDeleteList method */
  public static final BatchRequestParticipantRequestMethod BATCH_REQUEST_PARTICIPANT_DELETE_LIST = new BatchRequestParticipantRequestMethod("BatchRequestParticipantDeleteList");
  /** Variable representing the BatchRequestParticipantFileCreate method */
  public static final BatchRequestParticipantRequestMethod BATCH_REQUEST_PARTICIPANT_FILE_CREATE = new BatchRequestParticipantRequestMethod("BatchRequestParticipantFileCreate");
  /** Variable representing the BatchRequestParticipantFind method */
  public static final BatchRequestParticipantRequestMethod BATCH_REQUEST_PARTICIPANT_FIND = new BatchRequestParticipantRequestMethod("BatchRequestParticipantFind");
  /** Variable representing the BatchRequestParticipantFindCount method */
  public static final BatchRequestParticipantRequestMethod BATCH_REQUEST_PARTICIPANT_FIND_COUNT = new BatchRequestParticipantRequestMethod("BatchRequestParticipantFindCount");
  /** Variable representing the BatchRequestParticipantGet method */
  public static final BatchRequestParticipantRequestMethod BATCH_REQUEST_PARTICIPANT_GET = new BatchRequestParticipantRequestMethod("BatchRequestParticipantGet");
  /** Variable representing the BatchRequestParticipantReprocessErrorParticipants method */
  public static final BatchRequestParticipantRequestMethod BATCH_REQUEST_PARTICIPANT_REPROCESS_ERROR_PARTICIPANTS = new BatchRequestParticipantRequestMethod("BatchRequestParticipantReprocessErrorParticipants");
  /** Variable representing the BatchRequestParticipantSkipErrorParticipants method */
  public static final BatchRequestParticipantRequestMethod BATCH_REQUEST_PARTICIPANT_SKIP_ERROR_PARTICIPANTS = new BatchRequestParticipantRequestMethod("BatchRequestParticipantSkipErrorParticipants");
  /** Variable representing the BatchRequestParticipantUpdate method */
  public static final BatchRequestParticipantRequestMethod BATCH_REQUEST_PARTICIPANT_UPDATE = new BatchRequestParticipantRequestMethod("BatchRequestParticipantUpdate");
}
