/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAutoRetryFindRequest.java
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
 * Class used to create a BsdQueueAutoRetryFindRequest Udt Request
 *
 */

public class BsdQueueAutoRetryFindRequest extends BsdQueueAutoRetryRequest {
/**
 *
 * Constructor to create a  BsdQueueAutoRetryFindRequest
 * @param id Unique request name
 * @param BsdQueueAutoRetryFindIn BsdQueueAutoRetryObjectFilter for BsdQueueAutoRetryFindRequest
 *
 */
@JsonCreator
  public BsdQueueAutoRetryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueueAutoRetry")BsdQueueAutoRetryObjectFilter BsdQueueAutoRetryFindIn) {
    super(id, "BsdQueueAutoRetryFind");
    if (BsdQueueAutoRetryFindIn != null) {
      Integer index =  BsdQueueAutoRetryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(BsdQueueAutoRetryFindIn, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }

/**
 *
 * Retrieves the BsdQueueAutoRetryObjectDataList that results from the BsdQueueAutoRetryFindRequest call
 * @return BsdQueueAutoRetryObjectDataList resulting from udt call
 *
 */

  public BsdQueueAutoRetryObjectDataList getOutput() {
    return BsdQueueAutoRetryObjectHelper.fromMapList(outputMap, "BsdQueueAutoRetryList");
  }
}
