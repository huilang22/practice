/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestSegmentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchRequestSegmentRequestMethod implements UdtMethod {
  private String method = null;
  private BatchRequestSegmentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchRequestSegmentCreate method */
  public static final BatchRequestSegmentRequestMethod BATCH_REQUEST_SEGMENT_CREATE = new BatchRequestSegmentRequestMethod("BatchRequestSegmentCreate");
  /** Variable representing the BatchRequestSegmentDelete method */
  public static final BatchRequestSegmentRequestMethod BATCH_REQUEST_SEGMENT_DELETE = new BatchRequestSegmentRequestMethod("BatchRequestSegmentDelete");
  /** Variable representing the BatchRequestSegmentDeleteList method */
  public static final BatchRequestSegmentRequestMethod BATCH_REQUEST_SEGMENT_DELETE_LIST = new BatchRequestSegmentRequestMethod("BatchRequestSegmentDeleteList");
  /** Variable representing the BatchRequestSegmentFind method */
  public static final BatchRequestSegmentRequestMethod BATCH_REQUEST_SEGMENT_FIND = new BatchRequestSegmentRequestMethod("BatchRequestSegmentFind");
  /** Variable representing the BatchRequestSegmentFindForUpdate method */
  public static final BatchRequestSegmentRequestMethod BATCH_REQUEST_SEGMENT_FIND_FOR_UPDATE = new BatchRequestSegmentRequestMethod("BatchRequestSegmentFindForUpdate");
  /** Variable representing the BatchRequestSegmentGet method */
  public static final BatchRequestSegmentRequestMethod BATCH_REQUEST_SEGMENT_GET = new BatchRequestSegmentRequestMethod("BatchRequestSegmentGet");
  /** Variable representing the BatchRequestSegmentSequenceGet method */
  public static final BatchRequestSegmentRequestMethod BATCH_REQUEST_SEGMENT_SEQUENCE_GET = new BatchRequestSegmentRequestMethod("BatchRequestSegmentSequenceGet");
  /** Variable representing the BatchRequestSegmentUpdate method */
  public static final BatchRequestSegmentRequestMethod BATCH_REQUEST_SEGMENT_UPDATE = new BatchRequestSegmentRequestMethod("BatchRequestSegmentUpdate");
  /** Variable representing the BatchRequestSegmentUpdateList method */
  public static final BatchRequestSegmentRequestMethod BATCH_REQUEST_SEGMENT_UPDATE_LIST = new BatchRequestSegmentRequestMethod("BatchRequestSegmentUpdateList");
}
