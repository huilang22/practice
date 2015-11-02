/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionGetRequest.java
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
 * Class used to create a BatchRequestParticipantDefinitionGetRequest Udt Request
 *
 */

public class BatchRequestParticipantDefinitionGetRequest extends BatchRequestParticipantDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionGetRequest
 * @param id Unique request name
 * @param batchRequestParticipantDefinitionGetIn BatchRequestParticipantDefinitionObjectKeyData for BatchRequestParticipantDefinitionGetRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantDefinitionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipantDefinition")BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionGetIn) {
    super(id, "BatchRequestParticipantDefinitionGet");
    if (batchRequestParticipantDefinitionGetIn != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(batchRequestParticipantDefinitionGetIn, new HashMap(), "BatchRequestParticipantDefinitionObjectKeyData").get("BatchRequestParticipantDefinitionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParticipantDefinitionObjectData that results from the BatchRequestParticipantDefinitionGetRequest call
 * @return BatchRequestParticipantDefinitionObjectData resulting from udt call
 *
 */

  public BatchRequestParticipantDefinitionObjectData getOutput() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
}
