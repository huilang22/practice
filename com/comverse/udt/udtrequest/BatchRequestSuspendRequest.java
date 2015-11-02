/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSuspendRequest.java
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
 * Class used to create a BatchRequestSuspendRequest Udt Request
 *
 */

public class BatchRequestSuspendRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestSuspendRequest
 * @param id Unique request name
 * @param batchRequestSuspendIn BatchRequestObjectKeyData for BatchRequestSuspendRequest
 * @param batchRequestSuspendActivityDescriptionIn String for BatchRequestSuspendRequest
 *
 */
@JsonCreator
  public BatchRequestSuspendRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData batchRequestSuspendIn, @JsonProperty("ActivityDescription")String batchRequestSuspendActivityDescriptionIn) {
    super(id, "BatchRequestSuspend");
    if (batchRequestSuspendIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestSuspendIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestSuspendActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestSuspendActivityDescriptionIn);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestSuspendRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
