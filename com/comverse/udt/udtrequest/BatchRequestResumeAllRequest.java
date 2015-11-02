/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestResumeAllRequest.java
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
 * Class used to create a BatchRequestResumeAllRequest Udt Request
 *
 */

public class BatchRequestResumeAllRequest extends BatchRequestRequest {
/**
 *
 * Constructor to create a  BatchRequestResumeAllRequest
 * @param id Unique request name
 * @param batchRequestResumeAllActivityDescriptionIn String for BatchRequestResumeAllRequest
 *
 */
@JsonCreator
  public BatchRequestResumeAllRequest(@JsonProperty("RequestId") String id, @JsonProperty("ActivityDescription")String batchRequestResumeAllActivityDescriptionIn) {
    super(id, "BatchRequestResumeAll");
    if (batchRequestResumeAllActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestResumeAllActivityDescriptionIn);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectDataList that results from the BatchRequestResumeAllRequest call
 * @return BatchRequestObjectDataList resulting from udt call
 *
 */

  public BatchRequestObjectDataList getOutput() {
    return BatchRequestObjectHelper.fromMapList(outputMap, "BatchRequestList");
  }
}
