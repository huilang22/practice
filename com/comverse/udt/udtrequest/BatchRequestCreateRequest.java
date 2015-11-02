/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestCreateRequest.java
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
 * Class used to create a BatchRequestCreateRequest Udt Request
 *
 */

public class BatchRequestCreateRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestCreateRequest
 * @param id Unique request name
 * @param batchRequestCreateIn BatchRequestObjectData for BatchRequestCreateRequest
 * @param batchRequestCreateActivityDescriptionIn String for BatchRequestCreateRequest
 *
 */
@JsonCreator
  public BatchRequestCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectData batchRequestCreateIn, @JsonProperty("ActivityDescription")String batchRequestCreateActivityDescriptionIn) {
    super(id, "BatchRequestCreate");
    if (batchRequestCreateIn != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(batchRequestCreateIn, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (batchRequestCreateActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestCreateActivityDescriptionIn);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestCreateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
