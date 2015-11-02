/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionQueryGetRequest.java
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
 * Class used to create a BatchRequestParticipantDefinitionQueryGetRequest Udt Request
 *
 */

public class BatchRequestParticipantDefinitionQueryGetRequest extends BatchRequestParticipantDefinitionRequest {
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionQueryGetRequest
 * @param id Unique request name
 * @param batchRequestParticipantDefinitionQueryGetIn BatchRequestParticipantDefinitionObjectKeyData for BatchRequestParticipantDefinitionQueryGetRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantDefinitionQueryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipantDefinition")BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionQueryGetIn) {
    super(id, "BatchRequestParticipantDefinitionQueryGet");
    if (batchRequestParticipantDefinitionQueryGetIn != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(batchRequestParticipantDefinitionQueryGetIn, new HashMap(), "BatchRequestParticipantDefinitionObjectKeyData").get("BatchRequestParticipantDefinitionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BulkParticipantQuery that results from the BatchRequestParticipantDefinitionQueryGetRequest call
 * @return BulkParticipantQuery resulting from udt call
 *
 */

  public BulkParticipantQuery getOutput() {
    return  (BulkParticipantQuery)outputMap.get("BatchRequestParticipantDefinitionQueryGetOut");
  }
}
