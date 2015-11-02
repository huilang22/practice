/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueRetryRequest.java
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
 * Class used to create a BsdQueueRetryRequest Udt Request
 *
 */

public class BsdQueueRetryRequest extends BsdQueueSubRequestParent {
/**
 *
 * Constructor to create a  BsdQueueRetryRequest
 * @param id Unique request name
 * @param BsdQueueRetryIn BsdQueueObjectData for BsdQueueRetryRequest
 *
 */
@JsonCreator
  public BsdQueueRetryRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueue")BsdQueueObjectData BsdQueueRetryIn) {
    super(id, "BsdQueueRetry");
    if (BsdQueueRetryIn != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueRetryIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }

/**
 *
 * Retrieves the BsdQueueObjectData that results from the BsdQueueRetryRequest call
 * @return BsdQueueObjectData resulting from udt call
 *
 */

  public BsdQueueObjectData getOutput() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
}
