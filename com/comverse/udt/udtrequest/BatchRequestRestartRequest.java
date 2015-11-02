/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestRestartRequest.java
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
 * Class used to create a BatchRequestRestartRequest Udt Request
 *
 */

public class BatchRequestRestartRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestRestartRequest
 * @param id Unique request name
 * @param batchRequestRestartIn BatchRequestObjectKeyData for BatchRequestRestartRequest
 * @param batchRequestRestartErrorThresholdIn Integer for BatchRequestRestartRequest
 * @param batchRequestRestartScheduledDateIn Date for BatchRequestRestartRequest
 * @param batchRequestRestartActivityDescriptionIn String for BatchRequestRestartRequest
 *
 */
@JsonCreator
  public BatchRequestRestartRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData batchRequestRestartIn, @JsonProperty("ErrorThreshold")Integer batchRequestRestartErrorThresholdIn, @JsonProperty("ScheduledDate")Date batchRequestRestartScheduledDateIn, @JsonProperty("ActivityDescription")String batchRequestRestartActivityDescriptionIn) {
    super(id, "BatchRequestRestart");
    if (batchRequestRestartIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestRestartIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestRestartErrorThresholdIn != null) {
      addInput("ErrorThreshold", batchRequestRestartErrorThresholdIn);
    }
    if (batchRequestRestartScheduledDateIn != null) {
      addInput("ScheduledDate", batchRequestRestartScheduledDateIn);
    }
    if (batchRequestRestartActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestRestartActivityDescriptionIn);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestRestartRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
