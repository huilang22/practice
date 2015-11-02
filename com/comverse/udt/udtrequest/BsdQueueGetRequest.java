/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueGetRequest.java
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
 * Class used to create a BsdQueueGetRequest Udt Request
 *
 */

public class BsdQueueGetRequest extends BsdQueueSubRequestParent {
/**
 *
 * Constructor to create a  BsdQueueGetRequest
 * @param id Unique request name
 * @param BsdQueueGetIn BsdQueueObjectKeyData for BsdQueueGetRequest
 *
 */
@JsonCreator
  public BsdQueueGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueue")BsdQueueObjectKeyData BsdQueueGetIn) {
    super(id, "BsdQueueGet");
    if (BsdQueueGetIn != null) {
      addInput("BsdQueue", BsdQueueObjectKeyHelper.toMap(BsdQueueGetIn, new HashMap(), "BsdQueueObjectKeyData").get("BsdQueueObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdQueueObjectData that results from the BsdQueueGetRequest call
 * @return BsdQueueObjectData resulting from udt call
 *
 */

  public BsdQueueObjectData getOutput() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
}
