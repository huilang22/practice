/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageAmountGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BilledUsageAmountGetRequest Udt Request
 *
 */

public class BilledUsageAmountGetRequest extends BilledUsageSubRequestParent {
/**
 *
 * Constructor to create a  BilledUsageAmountGetRequest
 * @param id Unique request name
 * @param BilledUsageAmountIn BilledUsageObjectKeyData for BilledUsageAmountGetRequest
 *
 */
@JsonCreator
  public BilledUsageAmountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageObjectKeyData BilledUsageAmountIn) {
    super(id, "BilledUsageAmountGet");
    if (BilledUsageAmountIn != null) {
      addInput("BilledUsage", BilledUsageObjectKeyHelper.toMap(BilledUsageAmountIn, new HashMap(), "BilledUsageObjectKeyData").get("BilledUsageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BilledUsageAmountObjectData that results from the BilledUsageAmountGetRequest call
 * @return BilledUsageAmountObjectData resulting from udt call
 *
 */

  public BilledUsageAmountObjectData getOutput() {
    return BilledUsageAmountObjectHelper.fromMap(outputMap, "BilledUsageAmount");
  }
}
