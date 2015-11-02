/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionDeleteRequest.java
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
 * Class used to create a BatchRequestParticipantDefinitionDeleteRequest Udt Request
 *
 */

public class BatchRequestParticipantDefinitionDeleteRequest extends BatchRequestParticipantDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionDeleteRequest
 * @param id Unique request name
 * @param batchRequestParticipantDefinitionDeleteIn BatchRequestParticipantDefinitionObjectKeyData for BatchRequestParticipantDefinitionDeleteRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantDefinitionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipantDefinition")BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionDeleteIn) {
    super(id, "BatchRequestParticipantDefinitionDelete");
    if (batchRequestParticipantDefinitionDeleteIn != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(batchRequestParticipantDefinitionDeleteIn, new HashMap(), "BatchRequestParticipantDefinitionObjectKeyData").get("BatchRequestParticipantDefinitionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParticipantDefinitionObjectData that results from the BatchRequestParticipantDefinitionDeleteRequest call
 * @return BatchRequestParticipantDefinitionObjectData resulting from udt call
 *
 */

  public BatchRequestParticipantDefinitionObjectData getOutput() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
}
