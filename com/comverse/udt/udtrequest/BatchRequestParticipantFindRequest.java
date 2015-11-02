/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantFindRequest.java
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
 * Class used to create a BatchRequestParticipantFindRequest Udt Request
 *
 */

public class BatchRequestParticipantFindRequest extends BatchRequestParticipantRequest {
/**
 *
 * Constructor to create a  BatchRequestParticipantFindRequest
 * @param id Unique request name
 * @param batchRequestParticipantFindIn BatchRequestParticipantObjectFilter for BatchRequestParticipantFindRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipant")BatchRequestParticipantObjectFilter batchRequestParticipantFindIn) {
    super(id, "BatchRequestParticipantFind");
    if (batchRequestParticipantFindIn != null) {
      Integer index =  batchRequestParticipantFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectHelper.toMap(batchRequestParticipantFindIn, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParticipantObjectDataList that results from the BatchRequestParticipantFindRequest call
 * @return BatchRequestParticipantObjectDataList resulting from udt call
 *
 */

  public BatchRequestParticipantObjectDataList getOutput() {
    return BatchRequestParticipantObjectHelper.fromMapList(outputMap, "BatchRequestParticipantList");
  }
}
