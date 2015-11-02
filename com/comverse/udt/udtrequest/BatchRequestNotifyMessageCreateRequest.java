/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageCreateRequest.java
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
 * Class used to create a BatchRequestNotifyMessageCreateRequest Udt Request
 *
 */

public class BatchRequestNotifyMessageCreateRequest extends BatchRequestNotifyMessageSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestNotifyMessageCreateRequest
 * @param id Unique request name
 * @param batchRequestNotifyMessageCreateIn BatchRequestNotifyMessageObjectData for BatchRequestNotifyMessageCreateRequest
 *
 */
@JsonCreator
  public BatchRequestNotifyMessageCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestNotifyMessage")BatchRequestNotifyMessageObjectData batchRequestNotifyMessageCreateIn) {
    super(id, "BatchRequestNotifyMessageCreate");
    if (batchRequestNotifyMessageCreateIn != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectHelper.toMap(batchRequestNotifyMessageCreateIn, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }

/**
 *
 * Retrieves the BatchRequestNotifyMessageObjectData that results from the BatchRequestNotifyMessageCreateRequest call
 * @return BatchRequestNotifyMessageObjectData resulting from udt call
 *
 */

  public BatchRequestNotifyMessageObjectData getOutput() {
    return BatchRequestNotifyMessageObjectHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
}
