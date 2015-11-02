/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAutoRetryUpdateRequest.java
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
 * Class used to create a BsdQueueAutoRetryUpdateRequest Udt Request
 *
 */

public class BsdQueueAutoRetryUpdateRequest extends BsdQueueAutoRetrySubRequestParent {
/**
 *
 * Constructor to create a  BsdQueueAutoRetryUpdateRequest
 * @param id Unique request name
 * @param BsdQueueAutoRetryUpdateIn BsdQueueAutoRetryObjectData for BsdQueueAutoRetryUpdateRequest
 *
 */
@JsonCreator
  public BsdQueueAutoRetryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdQueueAutoRetry")BsdQueueAutoRetryObjectData BsdQueueAutoRetryUpdateIn) {
    super(id, "BsdQueueAutoRetryUpdate");
    if (BsdQueueAutoRetryUpdateIn != null) {
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(BsdQueueAutoRetryUpdateIn, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }

/**
 *
 * Retrieves the BsdQueueAutoRetryObjectData that results from the BsdQueueAutoRetryUpdateRequest call
 * @return BsdQueueAutoRetryObjectData resulting from udt call
 *
 */

  public BsdQueueAutoRetryObjectData getOutput() {
    return BsdQueueAutoRetryObjectHelper.fromMap(outputMap, "BsdQueueAutoRetry");
  }
}
