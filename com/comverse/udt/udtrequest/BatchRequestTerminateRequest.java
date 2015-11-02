/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTerminateRequest.java
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
 * Class used to create a BatchRequestTerminateRequest Udt Request
 *
 */

public class BatchRequestTerminateRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestTerminateRequest
 * @param id Unique request name
 * @param batchRequestTerminateIn BatchRequestObjectKeyData for BatchRequestTerminateRequest
 * @param batchRequestTerminateActivityDescriptionIn String for BatchRequestTerminateRequest
 *
 */
@JsonCreator
  public BatchRequestTerminateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData batchRequestTerminateIn, @JsonProperty("ActivityDescription")String batchRequestTerminateActivityDescriptionIn) {
    super(id, "BatchRequestTerminate");
    if (batchRequestTerminateIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestTerminateIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestTerminateActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestTerminateActivityDescriptionIn);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestTerminateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
