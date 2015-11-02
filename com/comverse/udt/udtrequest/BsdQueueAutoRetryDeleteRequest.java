/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAutoRetryDeleteRequest.java
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

import com.csgsystems.sfq.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BsdQueueAutoRetryDeleteRequest Udt Request
 *
 */

public class BsdQueueAutoRetryDeleteRequest extends BsdQueueAutoRetrySubRequestParent {
/**
 *
 * Constructor to create a  BsdQueueAutoRetryDeleteRequest
 * @param id Unique request name
 * @param BsdQueueAutoRetryDeleteIn BsdQueueAutoRetryObjectData for BsdQueueAutoRetryDeleteRequest
 *
 */
@JsonCreator
  public BsdQueueAutoRetryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueueAutoRetry")BsdQueueAutoRetryObjectData BsdQueueAutoRetryDeleteIn) {
    super(id, "BsdQueueAutoRetryDelete");
    if (BsdQueueAutoRetryDeleteIn != null) {
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(BsdQueueAutoRetryDeleteIn, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }

/**
 *
 * Retrieves the BsdQueueAutoRetryObjectData that results from the BsdQueueAutoRetryDeleteRequest call
 * @return BsdQueueAutoRetryObjectData resulting from udt call
 *
 */

  public BsdQueueAutoRetryObjectData getOutput() {
    return BsdQueueAutoRetryObjectHelper.fromMap(outputMap, "BsdQueueAutoRetry");
  }
}
