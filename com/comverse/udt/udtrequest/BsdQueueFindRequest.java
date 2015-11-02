/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueFindRequest.java
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
 * Class used to create a BsdQueueFindRequest Udt Request
 *
 */

public class BsdQueueFindRequest extends BsdQueueRequest {
/**
 *
 * Constructor to create a  BsdQueueFindRequest
 * @param id Unique request name
 * @param BsdQueueFindIn BsdQueueObjectFilter for BsdQueueFindRequest
 *
 */
@JsonCreator
  public BsdQueueFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueue")BsdQueueObjectFilter BsdQueueFindIn) {
    super(id, "BsdQueueFind");
    if (BsdQueueFindIn != null) {
      Integer index =  BsdQueueFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueFindIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }

/**
 *
 * Retrieves the BsdQueueObjectDataList that results from the BsdQueueFindRequest call
 * @return BsdQueueObjectDataList resulting from udt call
 *
 */

  public BsdQueueObjectDataList getOutput() {
    return BsdQueueObjectHelper.fromMapList(outputMap, "BsdQueueList");
  }
}
