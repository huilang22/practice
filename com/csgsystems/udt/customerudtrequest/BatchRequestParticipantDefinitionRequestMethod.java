/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantDefinitionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchRequestParticipantDefinitionRequestMethod implements UdtMethod {
  private String method = null;
  private BatchRequestParticipantDefinitionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchRequestParticipantDefinitionCreate method */
  public static final BatchRequestParticipantDefinitionRequestMethod BATCH_REQUEST_PARTICIPANT_DEFINITION_CREATE = new BatchRequestParticipantDefinitionRequestMethod("BatchRequestParticipantDefinitionCreate");
  /** Variable representing the BatchRequestParticipantDefinitionDelete method */
  public static final BatchRequestParticipantDefinitionRequestMethod BATCH_REQUEST_PARTICIPANT_DEFINITION_DELETE = new BatchRequestParticipantDefinitionRequestMethod("BatchRequestParticipantDefinitionDelete");
  /** Variable representing the BatchRequestParticipantDefinitionFind method */
  public static final BatchRequestParticipantDefinitionRequestMethod BATCH_REQUEST_PARTICIPANT_DEFINITION_FIND = new BatchRequestParticipantDefinitionRequestMethod("BatchRequestParticipantDefinitionFind");
  /** Variable representing the BatchRequestParticipantDefinitionGet method */
  public static final BatchRequestParticipantDefinitionRequestMethod BATCH_REQUEST_PARTICIPANT_DEFINITION_GET = new BatchRequestParticipantDefinitionRequestMethod("BatchRequestParticipantDefinitionGet");
  /** Variable representing the BatchRequestParticipantDefinitionQueryCreate method */
  public static final BatchRequestParticipantDefinitionRequestMethod BATCH_REQUEST_PARTICIPANT_DEFINITION_QUERY_CREATE = new BatchRequestParticipantDefinitionRequestMethod("BatchRequestParticipantDefinitionQueryCreate");
  /** Variable representing the BatchRequestParticipantDefinitionQueryGet method */
  public static final BatchRequestParticipantDefinitionRequestMethod BATCH_REQUEST_PARTICIPANT_DEFINITION_QUERY_GET = new BatchRequestParticipantDefinitionRequestMethod("BatchRequestParticipantDefinitionQueryGet");
  /** Variable representing the BatchRequestParticipantDefinitionQueryUpdate method */
  public static final BatchRequestParticipantDefinitionRequestMethod BATCH_REQUEST_PARTICIPANT_DEFINITION_QUERY_UPDATE = new BatchRequestParticipantDefinitionRequestMethod("BatchRequestParticipantDefinitionQueryUpdate");
  /** Variable representing the BatchRequestParticipantDefinitionRetrieve method */
  public static final BatchRequestParticipantDefinitionRequestMethod BATCH_REQUEST_PARTICIPANT_DEFINITION_RETRIEVE = new BatchRequestParticipantDefinitionRequestMethod("BatchRequestParticipantDefinitionRetrieve");
  /** Variable representing the BatchRequestParticipantDefinitionSequenceGet method */
  public static final BatchRequestParticipantDefinitionRequestMethod BATCH_REQUEST_PARTICIPANT_DEFINITION_SEQUENCE_GET = new BatchRequestParticipantDefinitionRequestMethod("BatchRequestParticipantDefinitionSequenceGet");
  /** Variable representing the BatchRequestParticipantDefinitionUpdate method */
  public static final BatchRequestParticipantDefinitionRequestMethod BATCH_REQUEST_PARTICIPANT_DEFINITION_UPDATE = new BatchRequestParticipantDefinitionRequestMethod("BatchRequestParticipantDefinitionUpdate");
}
