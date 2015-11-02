/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantSkipErrorParticipantsRequest.java
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
 * Class used to create a BatchRequestParticipantSkipErrorParticipantsRequest Udt Request
 *
 */

public class BatchRequestParticipantSkipErrorParticipantsRequest extends BatchRequestParticipantRequest {
/**
 *
 * Constructor to create a  BatchRequestParticipantSkipErrorParticipantsRequest
 * @param id Unique request name
 * @param brpsepBatchIdIn BigInteger for BatchRequestParticipantSkipErrorParticipantsRequest
 * @param brpsepRunNumberIn Integer for BatchRequestParticipantSkipErrorParticipantsRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantSkipErrorParticipantsRequest(@JsonProperty("RequestId") String id, @JsonProperty("BrpsepBatchIdIn")BigInteger brpsepBatchIdIn, @JsonProperty("BrpsepRunNumberIn")Integer brpsepRunNumberIn) {
    super(id, "BatchRequestParticipantSkipErrorParticipants");
    if (brpsepBatchIdIn != null) {
      addInput("BrpsepBatchIdIn", brpsepBatchIdIn);
    }
    if (brpsepRunNumberIn != null) {
      addInput("BrpsepRunNumberIn", brpsepRunNumberIn);
    }
  }

}
