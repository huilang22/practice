/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionFindRequest.java
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
 * Class used to create a BatchRequestParticipantDefinitionFindRequest Udt Request
 *
 */

public class BatchRequestParticipantDefinitionFindRequest extends BatchRequestParticipantDefinitionRequest {
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionFindRequest
 * @param id Unique request name
 * @param batchRequestParticipantDefinitionFindIn BatchRequestParticipantDefinitionObjectFilter for BatchRequestParticipantDefinitionFindRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantDefinitionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipantDefinition")BatchRequestParticipantDefinitionObjectFilter batchRequestParticipantDefinitionFindIn) {
    super(id, "BatchRequestParticipantDefinitionFind");
    if (batchRequestParticipantDefinitionFindIn != null) {
      Integer index =  batchRequestParticipantDefinitionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectHelper.toMap(batchRequestParticipantDefinitionFindIn, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParticipantDefinitionObjectDataList that results from the BatchRequestParticipantDefinitionFindRequest call
 * @return BatchRequestParticipantDefinitionObjectDataList resulting from udt call
 *
 */

  public BatchRequestParticipantDefinitionObjectDataList getOutput() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMapList(outputMap, "BatchRequestParticipantDefinitionList");
  }
}
