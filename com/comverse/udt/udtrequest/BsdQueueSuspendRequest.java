/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueSuspendRequest.java
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
 * Class used to create a BsdQueueSuspendRequest Udt Request
 *
 */

public class BsdQueueSuspendRequest extends BsdQueueSubRequestParent {
/**
 *
 * Constructor to create a  BsdQueueSuspendRequest
 * @param id Unique request name
 * @param BsdQueueSuspendIn BsdQueueObjectData for BsdQueueSuspendRequest
 *
 */
@JsonCreator
  public BsdQueueSuspendRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueue")BsdQueueObjectData BsdQueueSuspendIn) {
    super(id, "BsdQueueSuspend");
    if (BsdQueueSuspendIn != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueSuspendIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }

/**
 *
 * Retrieves the BsdQueueObjectData that results from the BsdQueueSuspendRequest call
 * @return BsdQueueObjectData resulting from udt call
 *
 */

  public BsdQueueObjectData getOutput() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
}
