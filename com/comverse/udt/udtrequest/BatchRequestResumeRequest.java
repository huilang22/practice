/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestResumeRequest.java
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
 * Class used to create a BatchRequestResumeRequest Udt Request
 *
 */

public class BatchRequestResumeRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestResumeRequest
 * @param id Unique request name
 * @param batchRequestResumeIn BatchRequestObjectKeyData for BatchRequestResumeRequest
 * @param batchRequestResumeErrorThresholdIn Integer for BatchRequestResumeRequest
 * @param batchRequestResumeScheduledDateIn Date for BatchRequestResumeRequest
 * @param batchRequestResumeActivityDescriptionIn String for BatchRequestResumeRequest
 *
 */
@JsonCreator
  public BatchRequestResumeRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData batchRequestResumeIn, @JsonProperty("ErrorThreshold")Integer batchRequestResumeErrorThresholdIn, @JsonProperty("ScheduledDate")Date batchRequestResumeScheduledDateIn, @JsonProperty("ActivityDescription")String batchRequestResumeActivityDescriptionIn) {
    super(id, "BatchRequestResume");
    if (batchRequestResumeIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestResumeIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestResumeErrorThresholdIn != null) {
      addInput("ErrorThreshold", batchRequestResumeErrorThresholdIn);
    }
    if (batchRequestResumeScheduledDateIn != null) {
      addInput("ScheduledDate", batchRequestResumeScheduledDateIn);
    }
    if (batchRequestResumeActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestResumeActivityDescriptionIn);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestResumeRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
