/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestScheduleRequest.java
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
 * Class used to create a BatchRequestScheduleRequest Udt Request
 *
 */

public class BatchRequestScheduleRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestScheduleRequest
 * @param id Unique request name
 * @param batchRequestScheduleIn BatchRequestObjectKeyData for BatchRequestScheduleRequest
 * @param batchRequestScheduleRunTypeIn Integer for BatchRequestScheduleRequest
 * @param batchRequestScheduleErrorThresholdIn Integer for BatchRequestScheduleRequest
 * @param batchRequestScheduleScheduledDateIn Date for BatchRequestScheduleRequest
 * @param batchRequestScheduleActivityDescriptionIn String for BatchRequestScheduleRequest
 *
 */
@JsonCreator
  public BatchRequestScheduleRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData batchRequestScheduleIn, @JsonProperty("RunType")Integer batchRequestScheduleRunTypeIn, @JsonProperty("ErrorThreshold")Integer batchRequestScheduleErrorThresholdIn, @JsonProperty("ScheduledDate")Date batchRequestScheduleScheduledDateIn, @JsonProperty("ActivityDescription")String batchRequestScheduleActivityDescriptionIn) {
    super(id, "BatchRequestSchedule");
    if (batchRequestScheduleIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestScheduleIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestScheduleRunTypeIn != null) {
      addInput("RunType", batchRequestScheduleRunTypeIn);
    }
    if (batchRequestScheduleErrorThresholdIn != null) {
      addInput("ErrorThreshold", batchRequestScheduleErrorThresholdIn);
    }
    if (batchRequestScheduleScheduledDateIn != null) {
      addInput("ScheduledDate", batchRequestScheduleScheduledDateIn);
    }
    if (batchRequestScheduleActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestScheduleActivityDescriptionIn);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestScheduleRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
