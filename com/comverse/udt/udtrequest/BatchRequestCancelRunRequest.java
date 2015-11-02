/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestCancelRunRequest.java
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
 * Class used to create a BatchRequestCancelRunRequest Udt Request
 *
 */

public class BatchRequestCancelRunRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestCancelRunRequest
 * @param id Unique request name
 * @param batchRequestCancelRunIn BatchRequestObjectKeyData for BatchRequestCancelRunRequest
 * @param batchRequestCancelRunActivityDescriptionIn String for BatchRequestCancelRunRequest
 *
 */
@JsonCreator
  public BatchRequestCancelRunRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData batchRequestCancelRunIn, @JsonProperty("ActivityDescription")String batchRequestCancelRunActivityDescriptionIn) {
    super(id, "BatchRequestCancelRun");
    if (batchRequestCancelRunIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestCancelRunIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestCancelRunActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestCancelRunActivityDescriptionIn);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestCancelRunRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
