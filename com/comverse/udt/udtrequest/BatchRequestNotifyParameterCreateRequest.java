/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterCreateRequest.java
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
 * Class used to create a BatchRequestNotifyParameterCreateRequest Udt Request
 *
 */

public class BatchRequestNotifyParameterCreateRequest extends BatchRequestNotifyParameterSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestNotifyParameterCreateRequest
 * @param id Unique request name
 * @param batchRequestNotifyParameterCreateIn BatchRequestNotifyParameterObjectData for BatchRequestNotifyParameterCreateRequest
 *
 */
@JsonCreator
  public BatchRequestNotifyParameterCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestNotifyParameter")BatchRequestNotifyParameterObjectData batchRequestNotifyParameterCreateIn) {
    super(id, "BatchRequestNotifyParameterCreate");
    if (batchRequestNotifyParameterCreateIn != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(batchRequestNotifyParameterCreateIn, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }

/**
 *
 * Retrieves the BatchRequestNotifyParameterObjectData that results from the BatchRequestNotifyParameterCreateRequest call
 * @return BatchRequestNotifyParameterObjectData resulting from udt call
 *
 */

  public BatchRequestNotifyParameterObjectData getOutput() {
    return BatchRequestNotifyParameterObjectHelper.fromMap(outputMap, "BatchRequestNotifyParameter");
  }
}
