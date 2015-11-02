/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueDeleteRequest.java
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
 * Class used to create a BsdQueueDeleteRequest Udt Request
 *
 */

public class BsdQueueDeleteRequest extends BsdQueueSubRequestParent {
/**
 *
 * Constructor to create a  BsdQueueDeleteRequest
 * @param id Unique request name
 * @param BsdQueueDeleteIn BsdQueueObjectData for BsdQueueDeleteRequest
 *
 */
@JsonCreator
  public BsdQueueDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueue")BsdQueueObjectData BsdQueueDeleteIn) {
    super(id, "BsdQueueDelete");
    if (BsdQueueDeleteIn != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueDeleteIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }

/**
 *
 * Retrieves the BsdQueueObjectData that results from the BsdQueueDeleteRequest call
 * @return BsdQueueObjectData resulting from udt call
 *
 */

  public BsdQueueObjectData getOutput() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
}
