/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAutoRetryCreateRequest.java
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
 * Class used to create a BsdQueueAutoRetryCreateRequest Udt Request
 *
 */

public class BsdQueueAutoRetryCreateRequest extends BsdQueueAutoRetrySubRequestParent {
/**
 *
 * Constructor to create a  BsdQueueAutoRetryCreateRequest
 * @param id Unique request name
 * @param BsdQueueAutoRetryCreateIn BsdQueueAutoRetryObjectData for BsdQueueAutoRetryCreateRequest
 *
 */
@JsonCreator
  public BsdQueueAutoRetryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueueAutoRetry")BsdQueueAutoRetryObjectData BsdQueueAutoRetryCreateIn) {
    super(id, "BsdQueueAutoRetryCreate");
    if (BsdQueueAutoRetryCreateIn != null) {
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(BsdQueueAutoRetryCreateIn, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }

/**
 *
 * Retrieves the BsdQueueAutoRetryObjectData that results from the BsdQueueAutoRetryCreateRequest call
 * @return BsdQueueAutoRetryObjectData resulting from udt call
 *
 */

  public BsdQueueAutoRetryObjectData getOutput() {
    return BsdQueueAutoRetryObjectHelper.fromMap(outputMap, "BsdQueueAutoRetry");
  }
}
