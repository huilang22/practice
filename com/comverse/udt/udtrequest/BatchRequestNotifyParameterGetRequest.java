/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterGetRequest.java
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
 * Class used to create a BatchRequestNotifyParameterGetRequest Udt Request
 *
 */

public class BatchRequestNotifyParameterGetRequest extends BatchRequestNotifyParameterSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestNotifyParameterGetRequest
 * @param id Unique request name
 * @param batchRequestNotifyParameterGetIn BatchRequestNotifyParameterObjectKeyData for BatchRequestNotifyParameterGetRequest
 *
 */
@JsonCreator
  public BatchRequestNotifyParameterGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestNotifyParameter")BatchRequestNotifyParameterObjectKeyData batchRequestNotifyParameterGetIn) {
    super(id, "BatchRequestNotifyParameterGet");
    if (batchRequestNotifyParameterGetIn != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectKeyHelper.toMap(batchRequestNotifyParameterGetIn, new HashMap(), "BatchRequestNotifyParameterObjectKeyData").get("BatchRequestNotifyParameterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestNotifyParameterObjectData that results from the BatchRequestNotifyParameterGetRequest call
 * @return BatchRequestNotifyParameterObjectData resulting from udt call
 *
 */

  public BatchRequestNotifyParameterObjectData getOutput() {
    return BatchRequestNotifyParameterObjectHelper.fromMap(outputMap, "BatchRequestNotifyParameter");
  }
}
