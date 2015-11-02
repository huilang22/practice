/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestReopenRequest.java
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
 * Class used to create a BatchRequestReopenRequest Udt Request
 *
 */

public class BatchRequestReopenRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestReopenRequest
 * @param id Unique request name
 * @param batchRequestReopenIn BatchRequestObjectKeyData for BatchRequestReopenRequest
 * @param batchRequestReopenActivityDescriptionIn String for BatchRequestReopenRequest
 *
 */
@JsonCreator
  public BatchRequestReopenRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData batchRequestReopenIn, @JsonProperty("ActivityDescription")String batchRequestReopenActivityDescriptionIn) {
    super(id, "BatchRequestReopen");
    if (batchRequestReopenIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestReopenIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestReopenActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestReopenActivityDescriptionIn);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestReopenRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
