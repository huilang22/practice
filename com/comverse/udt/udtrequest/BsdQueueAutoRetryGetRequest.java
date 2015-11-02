/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAutoRetryGetRequest.java
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
 * Class used to create a BsdQueueAutoRetryGetRequest Udt Request
 *
 */

public class BsdQueueAutoRetryGetRequest extends BsdQueueAutoRetrySubRequestParent {
/**
 *
 * Constructor to create a  BsdQueueAutoRetryGetRequest
 * @param id Unique request name
 * @param BsdQueueAutoRetryGetIn BsdQueueAutoRetryObjectKeyData for BsdQueueAutoRetryGetRequest
 *
 */
@JsonCreator
  public BsdQueueAutoRetryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueueAutoRetry")BsdQueueAutoRetryObjectKeyData BsdQueueAutoRetryGetIn) {
    super(id, "BsdQueueAutoRetryGet");
    if (BsdQueueAutoRetryGetIn != null) {
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectKeyHelper.toMap(BsdQueueAutoRetryGetIn, new HashMap(), "BsdQueueAutoRetryObjectKeyData").get("BsdQueueAutoRetryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdQueueAutoRetryObjectData that results from the BsdQueueAutoRetryGetRequest call
 * @return BsdQueueAutoRetryObjectData resulting from udt call
 *
 */

  public BsdQueueAutoRetryObjectData getOutput() {
    return BsdQueueAutoRetryObjectHelper.fromMap(outputMap, "BsdQueueAutoRetry");
  }
}
