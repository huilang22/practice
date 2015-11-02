/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantReprocessErrorParticipantsRequest.java
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
 * Class used to create a BatchRequestParticipantReprocessErrorParticipantsRequest Udt Request
 *
 */

public class BatchRequestParticipantReprocessErrorParticipantsRequest extends BatchRequestParticipantRequest {
/**
 *
 * Constructor to create a  BatchRequestParticipantReprocessErrorParticipantsRequest
 * @param id Unique request name
 * @param brprepBatchIdIn BigInteger for BatchRequestParticipantReprocessErrorParticipantsRequest
 * @param brprepRunNumberIn Integer for BatchRequestParticipantReprocessErrorParticipantsRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantReprocessErrorParticipantsRequest(@JsonProperty("RequestId") String id, @JsonProperty("BrprepBatchIdIn")BigInteger brprepBatchIdIn, @JsonProperty("BrprepRunNumberIn")Integer brprepRunNumberIn) {
    super(id, "BatchRequestParticipantReprocessErrorParticipants");
    if (brprepBatchIdIn != null) {
      addInput("BrprepBatchIdIn", brprepBatchIdIn);
    }
    if (brprepRunNumberIn != null) {
      addInput("BrprepRunNumberIn", brprepRunNumberIn);
    }
  }

}
