/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueDeleteInternalRequest.java
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
 * Class used to create a BsdQueueDeleteInternalRequest Udt Request
 *
 */

public class BsdQueueDeleteInternalRequest extends BsdQueueSubRequestParent {
/**
 *
 * Constructor to create a  BsdQueueDeleteInternalRequest
 * @param id Unique request name
 * @param BsdQueueDeleteInternalIn BsdQueueObjectKeyData for BsdQueueDeleteInternalRequest
 *
 */
@JsonCreator
  public BsdQueueDeleteInternalRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueue")BsdQueueObjectKeyData BsdQueueDeleteInternalIn) {
    super(id, "BsdQueueDeleteInternal");
    if (BsdQueueDeleteInternalIn != null) {
      addInput("BsdQueue", BsdQueueObjectKeyHelper.toMap(BsdQueueDeleteInternalIn, new HashMap(), "BsdQueueObjectKeyData").get("BsdQueueObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdQueueObjectData that results from the BsdQueueDeleteInternalRequest call
 * @return BsdQueueObjectData resulting from udt call
 *
 */

  public BsdQueueObjectData getOutput() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
}
