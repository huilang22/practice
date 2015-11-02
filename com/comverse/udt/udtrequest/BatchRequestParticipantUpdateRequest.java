/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantUpdateRequest.java
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
 * Class used to create a BatchRequestParticipantUpdateRequest Udt Request
 *
 */

public class BatchRequestParticipantUpdateRequest extends BatchRequestParticipantSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParticipantUpdateRequest
 * @param id Unique request name
 * @param batchRequestParticipantUpdateIn BatchRequestParticipantObjectBaseData for BatchRequestParticipantUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipant")BatchRequestParticipantObjectBaseData batchRequestParticipantUpdateIn) {
    super(id, "BatchRequestParticipantUpdate");
    if (batchRequestParticipantUpdateIn != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(batchRequestParticipantUpdateIn, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParticipantObjectBaseData that results from the BatchRequestParticipantUpdateRequest call
 * @return BatchRequestParticipantObjectBaseData resulting from udt call
 *
 */

  public BatchRequestParticipantObjectBaseData getOutput() {
    return BatchRequestParticipantObjectBaseHelper.fromMap(outputMap, "BatchRequestParticipant");
  }
}
