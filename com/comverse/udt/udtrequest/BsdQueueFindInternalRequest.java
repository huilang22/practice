/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueFindInternalRequest.java
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
 * Class used to create a BsdQueueFindInternalRequest Udt Request
 *
 */

public class BsdQueueFindInternalRequest extends BsdQueueRequest {
/**
 *
 * Constructor to create a  BsdQueueFindInternalRequest
 * @param id Unique request name
 * @param BsdQueueFindInternalIn BsdQueueObjectFilter for BsdQueueFindInternalRequest
 *
 */
@JsonCreator
  public BsdQueueFindInternalRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueue")BsdQueueObjectFilter BsdQueueFindInternalIn) {
    super(id, "BsdQueueFindInternal");
    if (BsdQueueFindInternalIn != null) {
      Integer index =  BsdQueueFindInternalIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueFindInternalIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }

/**
 *
 * Retrieves the BsdQueueObjectDataList that results from the BsdQueueFindInternalRequest call
 * @return BsdQueueObjectDataList resulting from udt call
 *
 */

  public BsdQueueObjectDataList getOutput() {
    return BsdQueueObjectHelper.fromMapList(outputMap, "BsdQueueList");
  }
}
