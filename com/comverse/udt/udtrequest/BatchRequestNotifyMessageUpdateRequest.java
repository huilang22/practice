/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageUpdateRequest.java
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
 * Class used to create a BatchRequestNotifyMessageUpdateRequest Udt Request
 *
 */

public class BatchRequestNotifyMessageUpdateRequest extends BatchRequestNotifyMessageSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestNotifyMessageUpdateRequest
 * @param id Unique request name
 * @param batchRequestNotifyMessageUpdateIn BatchRequestNotifyMessageObjectData for BatchRequestNotifyMessageUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestNotifyMessageUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestNotifyMessage")BatchRequestNotifyMessageObjectData batchRequestNotifyMessageUpdateIn) {
    super(id, "BatchRequestNotifyMessageUpdate");
    if (batchRequestNotifyMessageUpdateIn != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectHelper.toMap(batchRequestNotifyMessageUpdateIn, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }

/**
 *
 * Retrieves the BatchRequestNotifyMessageObjectData that results from the BatchRequestNotifyMessageUpdateRequest call
 * @return BatchRequestNotifyMessageObjectData resulting from udt call
 *
 */

  public BatchRequestNotifyMessageObjectData getOutput() {
    return BatchRequestNotifyMessageObjectHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
}
