/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAddRequest.java
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
 * Class used to create a BsdQueueAddRequest Udt Request
 *
 */

public class BsdQueueAddRequest extends BsdQueueSubRequestParent {
/**
 *
 * Constructor to create a  BsdQueueAddRequest
 * @param id Unique request name
 * @param BsdQueueAddIn BsdQueueObjectData for BsdQueueAddRequest
 *
 */
@JsonCreator
  public BsdQueueAddRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueue")BsdQueueObjectData BsdQueueAddIn) {
    super(id, "BsdQueueAdd");
    if (BsdQueueAddIn != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueAddIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }

/**
 *
 * Retrieves the BsdQueueObjectData that results from the BsdQueueAddRequest call
 * @return BsdQueueObjectData resulting from udt call
 *
 */

  public BsdQueueObjectData getOutput() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
}
