/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionQueryCreateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.bat.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BatchRequestParticipantDefinitionQueryCreateRequest Udt Request
 *
 */

public class BatchRequestParticipantDefinitionQueryCreateRequest extends BatchRequestParticipantDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionQueryCreateRequest
 * @param id Unique request name
 * @param batchRequestParticipantDefinitionQueryCreateIn BatchRequestParticipantDefinitionObjectKeyData for BatchRequestParticipantDefinitionQueryCreateRequest
 * @param batchRequestParticipantDefinitionQueryCreateInParticipantQuery BulkParticipantQuery for BatchRequestParticipantDefinitionQueryCreateRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantDefinitionQueryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipantDefinition")BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionQueryCreateIn, @JsonProperty("BatchRequestParticipantDefinitionQueryCreateInParticipantQuery")BulkParticipantQuery batchRequestParticipantDefinitionQueryCreateInParticipantQuery) {
    super(id, "BatchRequestParticipantDefinitionQueryCreate");
    if (batchRequestParticipantDefinitionQueryCreateIn != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(batchRequestParticipantDefinitionQueryCreateIn, new HashMap(), "BatchRequestParticipantDefinitionObjectKeyData").get("BatchRequestParticipantDefinitionObjectKeyData"));
    }
    if (batchRequestParticipantDefinitionQueryCreateInParticipantQuery != null) {
      addInput("BatchRequestParticipantDefinitionQueryCreateInParticipantQuery", batchRequestParticipantDefinitionQueryCreateInParticipantQuery);
    }
  }

/**
 *
 * Retrieves the BatchRequestParticipantDefinitionObjectKeyData that results from the BatchRequestParticipantDefinitionQueryCreateRequest call
 * @return BatchRequestParticipantDefinitionObjectKeyData resulting from udt call
 *
 */

  public BatchRequestParticipantDefinitionObjectKeyData getOutput() {
    return BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
}
