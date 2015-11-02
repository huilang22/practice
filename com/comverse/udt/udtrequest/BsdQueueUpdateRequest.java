/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueUpdateRequest.java
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
 * Class used to create a BsdQueueUpdateRequest Udt Request
 *
 */

public class BsdQueueUpdateRequest extends BsdQueueSubRequestParent {
/**
 *
 * Constructor to create a  BsdQueueUpdateRequest
 * @param id Unique request name
 * @param BsdQueueUpdateIn BsdQueueObjectData for BsdQueueUpdateRequest
 *
 */
@JsonCreator
  public BsdQueueUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueue")BsdQueueObjectData BsdQueueUpdateIn) {
    super(id, "BsdQueueUpdate");
    if (BsdQueueUpdateIn != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueUpdateIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }

/**
 *
 * Retrieves the BsdQueueObjectData that results from the BsdQueueUpdateRequest call
 * @return BsdQueueObjectData resulting from udt call
 *
 */

  public BsdQueueObjectData getOutput() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
}
