/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageGetRequest.java
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
 * Class used to create a BatchRequestNotifyMessageGetRequest Udt Request
 *
 */

public class BatchRequestNotifyMessageGetRequest extends BatchRequestNotifyMessageSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestNotifyMessageGetRequest
 * @param id Unique request name
 * @param batchRequestNotifyMessageGetIn BatchRequestNotifyMessageObjectKeyData for BatchRequestNotifyMessageGetRequest
 *
 */
@JsonCreator
  public BatchRequestNotifyMessageGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestNotifyMessage")BatchRequestNotifyMessageObjectKeyData batchRequestNotifyMessageGetIn) {
    super(id, "BatchRequestNotifyMessageGet");
    if (batchRequestNotifyMessageGetIn != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectKeyHelper.toMap(batchRequestNotifyMessageGetIn, new HashMap(), "BatchRequestNotifyMessageObjectKeyData").get("BatchRequestNotifyMessageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestNotifyMessageObjectData that results from the BatchRequestNotifyMessageGetRequest call
 * @return BatchRequestNotifyMessageObjectData resulting from udt call
 *
 */

  public BatchRequestNotifyMessageObjectData getOutput() {
    return BatchRequestNotifyMessageObjectHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
}
