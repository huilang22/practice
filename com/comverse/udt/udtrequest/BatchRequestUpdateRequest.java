/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestUpdateRequest.java
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
 * Class used to create a BatchRequestUpdateRequest Udt Request
 *
 */

public class BatchRequestUpdateRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestUpdateRequest
 * @param id Unique request name
 * @param batchRequestUpdateIn BatchRequestObjectData for BatchRequestUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectData batchRequestUpdateIn) {
    super(id, "BatchRequestUpdate");
    if (batchRequestUpdateIn != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(batchRequestUpdateIn, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestUpdateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
