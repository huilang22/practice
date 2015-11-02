/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterUpdateRequest.java
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
 * Class used to create a BatchRequestNotifyParameterUpdateRequest Udt Request
 *
 */

public class BatchRequestNotifyParameterUpdateRequest extends BatchRequestNotifyParameterSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestNotifyParameterUpdateRequest
 * @param id Unique request name
 * @param batchRequestNotifyParameterUpdateIn BatchRequestNotifyParameterObjectData for BatchRequestNotifyParameterUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestNotifyParameterUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestNotifyParameter")BatchRequestNotifyParameterObjectData batchRequestNotifyParameterUpdateIn) {
    super(id, "BatchRequestNotifyParameterUpdate");
    if (batchRequestNotifyParameterUpdateIn != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(batchRequestNotifyParameterUpdateIn, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }

/**
 *
 * Retrieves the BatchRequestNotifyParameterObjectData that results from the BatchRequestNotifyParameterUpdateRequest call
 * @return BatchRequestNotifyParameterObjectData resulting from udt call
 *
 */

  public BatchRequestNotifyParameterObjectData getOutput() {
    return BatchRequestNotifyParameterObjectHelper.fromMap(outputMap, "BatchRequestNotifyParameter");
  }
}
