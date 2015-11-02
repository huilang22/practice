/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionCreateRequest.java
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
 * Class used to create a BatchRequestParticipantDefinitionCreateRequest Udt Request
 *
 */

public class BatchRequestParticipantDefinitionCreateRequest extends BatchRequestParticipantDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionCreateRequest
 * @param id Unique request name
 * @param batchRequestParticipantDefinitionCreateIn BatchRequestParticipantDefinitionObjectData for BatchRequestParticipantDefinitionCreateRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantDefinitionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipantDefinition")BatchRequestParticipantDefinitionObjectData batchRequestParticipantDefinitionCreateIn) {
    super(id, "BatchRequestParticipantDefinitionCreate");
    if (batchRequestParticipantDefinitionCreateIn != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectHelper.toMap(batchRequestParticipantDefinitionCreateIn, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParticipantDefinitionObjectData that results from the BatchRequestParticipantDefinitionCreateRequest call
 * @return BatchRequestParticipantDefinitionObjectData resulting from udt call
 *
 */

  public BatchRequestParticipantDefinitionObjectData getOutput() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
}
