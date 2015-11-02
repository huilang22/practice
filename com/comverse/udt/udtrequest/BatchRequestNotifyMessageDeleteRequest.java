/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageDeleteRequest.java
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
 * Class used to create a BatchRequestNotifyMessageDeleteRequest Udt Request
 *
 */

public class BatchRequestNotifyMessageDeleteRequest extends BatchRequestNotifyMessageSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestNotifyMessageDeleteRequest
 * @param id Unique request name
 * @param batchRequestNotifyMessageDeleteIn BatchRequestNotifyMessageObjectKeyData for BatchRequestNotifyMessageDeleteRequest
 *
 */
@JsonCreator
  public BatchRequestNotifyMessageDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestNotifyMessage")BatchRequestNotifyMessageObjectKeyData batchRequestNotifyMessageDeleteIn) {
    super(id, "BatchRequestNotifyMessageDelete");
    if (batchRequestNotifyMessageDeleteIn != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectKeyHelper.toMap(batchRequestNotifyMessageDeleteIn, new HashMap(), "BatchRequestNotifyMessageObjectKeyData").get("BatchRequestNotifyMessageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestNotifyMessageObjectData that results from the BatchRequestNotifyMessageDeleteRequest call
 * @return BatchRequestNotifyMessageObjectData resulting from udt call
 *
 */

  public BatchRequestNotifyMessageObjectData getOutput() {
    return BatchRequestNotifyMessageObjectHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
}
