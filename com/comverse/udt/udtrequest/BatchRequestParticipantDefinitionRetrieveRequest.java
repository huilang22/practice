/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionRetrieveRequest.java
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
 * Class used to create a BatchRequestParticipantDefinitionRetrieveRequest Udt Request
 *
 */

public class BatchRequestParticipantDefinitionRetrieveRequest extends BatchRequestParticipantDefinitionRequest {
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionRetrieveRequest
 * @param id Unique request name
 * @param batchRequestParticipantDefinitionRetrieveIn BatchRequestParticipantDefinitionObjectKeyData for BatchRequestParticipantDefinitionRetrieveRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantDefinitionRetrieveRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipantDefinition")BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionRetrieveIn) {
    super(id, "BatchRequestParticipantDefinitionRetrieve");
    if (batchRequestParticipantDefinitionRetrieveIn != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(batchRequestParticipantDefinitionRetrieveIn, new HashMap(), "BatchRequestParticipantDefinitionObjectKeyData").get("BatchRequestParticipantDefinitionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the Object that results from the BatchRequestParticipantDefinitionRetrieveRequest call
 * @return Object resulting from udt call
 *
 */

  public Object getOutput() {
    return  (Object)outputMap.get("Participants");
  }
}
