/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterDeleteRequest.java
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
 * Class used to create a BatchRequestNotifyParameterDeleteRequest Udt Request
 *
 */

public class BatchRequestNotifyParameterDeleteRequest extends BatchRequestNotifyParameterSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestNotifyParameterDeleteRequest
 * @param id Unique request name
 * @param batchRequestNotifyParameterDeleteIn BatchRequestNotifyParameterObjectKeyData for BatchRequestNotifyParameterDeleteRequest
 *
 */
@JsonCreator
  public BatchRequestNotifyParameterDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestNotifyParameter")BatchRequestNotifyParameterObjectKeyData batchRequestNotifyParameterDeleteIn) {
    super(id, "BatchRequestNotifyParameterDelete");
    if (batchRequestNotifyParameterDeleteIn != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectKeyHelper.toMap(batchRequestNotifyParameterDeleteIn, new HashMap(), "BatchRequestNotifyParameterObjectKeyData").get("BatchRequestNotifyParameterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestNotifyParameterObjectData that results from the BatchRequestNotifyParameterDeleteRequest call
 * @return BatchRequestNotifyParameterObjectData resulting from udt call
 *
 */

  public BatchRequestNotifyParameterObjectData getOutput() {
    return BatchRequestNotifyParameterObjectHelper.fromMap(outputMap, "BatchRequestNotifyParameter");
  }
}
