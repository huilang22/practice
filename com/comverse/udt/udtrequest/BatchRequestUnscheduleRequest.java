/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestUnscheduleRequest.java
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
 * Class used to create a BatchRequestUnscheduleRequest Udt Request
 *
 */

public class BatchRequestUnscheduleRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestUnscheduleRequest
 * @param id Unique request name
 * @param batchRequestUnscheduleIn BatchRequestObjectKeyData for BatchRequestUnscheduleRequest
 * @param batchRequestUnscheduleActivityDescriptionIn String for BatchRequestUnscheduleRequest
 *
 */
@JsonCreator
  public BatchRequestUnscheduleRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData batchRequestUnscheduleIn, @JsonProperty("ActivityDescription")String batchRequestUnscheduleActivityDescriptionIn) {
    super(id, "BatchRequestUnschedule");
    if (batchRequestUnscheduleIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestUnscheduleIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestUnscheduleActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestUnscheduleActivityDescriptionIn);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestUnscheduleRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
