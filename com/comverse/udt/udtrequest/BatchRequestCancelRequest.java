/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestCancelRequest.java
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
 * Class used to create a BatchRequestCancelRequest Udt Request
 *
 */

public class BatchRequestCancelRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestCancelRequest
 * @param id Unique request name
 * @param batchRequestCancelIn BatchRequestObjectKeyData for BatchRequestCancelRequest
 * @param batchRequestCancelActivityDescriptionIn String for BatchRequestCancelRequest
 *
 */
@JsonCreator
  public BatchRequestCancelRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData batchRequestCancelIn, @JsonProperty("ActivityDescription")String batchRequestCancelActivityDescriptionIn) {
    super(id, "BatchRequestCancel");
    if (batchRequestCancelIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestCancelIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestCancelActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestCancelActivityDescriptionIn);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestCancelRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
