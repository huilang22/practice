/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionUpdateRequest.java
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
 * Class used to create a BatchRequestParticipantDefinitionUpdateRequest Udt Request
 *
 */

public class BatchRequestParticipantDefinitionUpdateRequest extends BatchRequestParticipantDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionUpdateRequest
 * @param id Unique request name
 * @param batchRequestParticipantDefinitionUpdateIn BatchRequestParticipantDefinitionObjectData for BatchRequestParticipantDefinitionUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantDefinitionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipantDefinition")BatchRequestParticipantDefinitionObjectData batchRequestParticipantDefinitionUpdateIn) {
    super(id, "BatchRequestParticipantDefinitionUpdate");
    if (batchRequestParticipantDefinitionUpdateIn != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectHelper.toMap(batchRequestParticipantDefinitionUpdateIn, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParticipantDefinitionObjectData that results from the BatchRequestParticipantDefinitionUpdateRequest call
 * @return BatchRequestParticipantDefinitionObjectData resulting from udt call
 *
 */

  public BatchRequestParticipantDefinitionObjectData getOutput() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
}
