/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionQueryUpdateRequest.java
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
 * Class used to create a BatchRequestParticipantDefinitionQueryUpdateRequest Udt Request
 *
 */

public class BatchRequestParticipantDefinitionQueryUpdateRequest extends BatchRequestParticipantDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionQueryUpdateRequest
 * @param id Unique request name
 * @param batchRequestParticipantDefinitionQueryUpdateIn BatchRequestParticipantDefinitionObjectKeyData for BatchRequestParticipantDefinitionQueryUpdateRequest
 * @param batchRequestParticipantDefinitionQueryUpdateInParticipantQuery BulkParticipantQuery for BatchRequestParticipantDefinitionQueryUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantDefinitionQueryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipantDefinition")BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionQueryUpdateIn, @JsonProperty("BatchRequestParticipantDefinitionQueryUpdateInParticipantQuery")BulkParticipantQuery batchRequestParticipantDefinitionQueryUpdateInParticipantQuery) {
    super(id, "BatchRequestParticipantDefinitionQueryUpdate");
    if (batchRequestParticipantDefinitionQueryUpdateIn != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(batchRequestParticipantDefinitionQueryUpdateIn, new HashMap(), "BatchRequestParticipantDefinitionObjectKeyData").get("BatchRequestParticipantDefinitionObjectKeyData"));
    }
    if (batchRequestParticipantDefinitionQueryUpdateInParticipantQuery != null) {
      addInput("BatchRequestParticipantDefinitionQueryUpdateInParticipantQuery", batchRequestParticipantDefinitionQueryUpdateInParticipantQuery);
    }
  }

/**
 *
 * Retrieves the BatchRequestParticipantDefinitionObjectKeyData that results from the BatchRequestParticipantDefinitionQueryUpdateRequest call
 * @return BatchRequestParticipantDefinitionObjectKeyData resulting from udt call
 *
 */

  public BatchRequestParticipantDefinitionObjectKeyData getOutput() {
    return BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
}
