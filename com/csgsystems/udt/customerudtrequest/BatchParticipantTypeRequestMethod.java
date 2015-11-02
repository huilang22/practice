/*
 * Generated code DO NOT EDIT
 * Generated file: BatchParticipantTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchParticipantTypeRequestMethod implements UdtMethod {
  private String method = null;
  private BatchParticipantTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchParticipantTypeFind method */
  public static final BatchParticipantTypeRequestMethod BATCH_PARTICIPANT_TYPE_FIND = new BatchParticipantTypeRequestMethod("BatchParticipantTypeFind");
  /** Variable representing the BatchParticipantTypeGet method */
  public static final BatchParticipantTypeRequestMethod BATCH_PARTICIPANT_TYPE_GET = new BatchParticipantTypeRequestMethod("BatchParticipantTypeGet");
}
