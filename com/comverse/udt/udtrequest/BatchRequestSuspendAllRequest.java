/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSuspendAllRequest.java
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
 * Class used to create a BatchRequestSuspendAllRequest Udt Request
 *
 */

public class BatchRequestSuspendAllRequest extends BatchRequestRequest {
/**
 *
 * Constructor to create a  BatchRequestSuspendAllRequest
 * @param id Unique request name
 * @param batchRequestSuspendAllActivityDescriptionIn String for BatchRequestSuspendAllRequest
 *
 */
@JsonCreator
  public BatchRequestSuspendAllRequest(@JsonProperty("RequestId") String id, @JsonProperty("ActivityDescription")String batchRequestSuspendAllActivityDescriptionIn) {
    super(id, "BatchRequestSuspendAll");
    if (batchRequestSuspendAllActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestSuspendAllActivityDescriptionIn);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectDataList that results from the BatchRequestSuspendAllRequest call
 * @return BatchRequestObjectDataList resulting from udt call
 *
 */

  public BatchRequestObjectDataList getOutput() {
    return BatchRequestObjectHelper.fromMapList(outputMap, "BatchRequestList");
  }
}
