/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchRequestRequestMethod implements UdtMethod {
  private String method = null;
  private BatchRequestRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchRequestCancel method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_CANCEL = new BatchRequestRequestMethod("BatchRequestCancel");
  /** Variable representing the BatchRequestCancelRun method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_CANCEL_RUN = new BatchRequestRequestMethod("BatchRequestCancelRun");
  /** Variable representing the BatchRequestClose method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_CLOSE = new BatchRequestRequestMethod("BatchRequestClose");
  /** Variable representing the BatchRequestCreate method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_CREATE = new BatchRequestRequestMethod("BatchRequestCreate");
  /** Variable representing the BatchRequestDelete method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_DELETE = new BatchRequestRequestMethod("BatchRequestDelete");
  /** Variable representing the BatchRequestFind method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_FIND = new BatchRequestRequestMethod("BatchRequestFind");
  /** Variable representing the BatchRequestGet method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_GET = new BatchRequestRequestMethod("BatchRequestGet");
  /** Variable representing the BatchRequestParticipantDispositionSummary method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_PARTICIPANT_DISPOSITION_SUMMARY = new BatchRequestRequestMethod("BatchRequestParticipantDispositionSummary");
  /** Variable representing the BatchRequestReopen method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_REOPEN = new BatchRequestRequestMethod("BatchRequestReopen");
  /** Variable representing the BatchRequestRestart method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_RESTART = new BatchRequestRequestMethod("BatchRequestRestart");
  /** Variable representing the BatchRequestResume method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_RESUME = new BatchRequestRequestMethod("BatchRequestResume");
  /** Variable representing the BatchRequestResumeAll method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_RESUME_ALL = new BatchRequestRequestMethod("BatchRequestResumeAll");
  /** Variable representing the BatchRequestSchedule method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_SCHEDULE = new BatchRequestRequestMethod("BatchRequestSchedule");
  /** Variable representing the BatchRequestSequenceGet method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_SEQUENCE_GET = new BatchRequestRequestMethod("BatchRequestSequenceGet");
  /** Variable representing the BatchRequestSuspend method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_SUSPEND = new BatchRequestRequestMethod("BatchRequestSuspend");
  /** Variable representing the BatchRequestSuspendAll method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_SUSPEND_ALL = new BatchRequestRequestMethod("BatchRequestSuspendAll");
  /** Variable representing the BatchRequestTerminate method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_TERMINATE = new BatchRequestRequestMethod("BatchRequestTerminate");
  /** Variable representing the BatchRequestUnschedule method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_UNSCHEDULE = new BatchRequestRequestMethod("BatchRequestUnschedule");
  /** Variable representing the BatchRequestUpdate method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_UPDATE = new BatchRequestRequestMethod("BatchRequestUpdate");
  /** Variable representing the BatchRequestWorkSubmit method */
  public static final BatchRequestRequestMethod BATCH_REQUEST_WORK_SUBMIT = new BatchRequestRequestMethod("BatchRequestWorkSubmit");
}
