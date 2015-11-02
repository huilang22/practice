/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageAmountGetRequest.java
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
 * Class used to create a UnbilledUsageAmountGetRequest Udt Request
 *
 */

public class UnbilledUsageAmountGetRequest extends UnbilledUsageSubRequestParent {
/**
 *
 * Constructor to create a  UnbilledUsageAmountGetRequest
 * @param id Unique request name
 * @param UnbilledUsageAmountIn UnbilledUsageObjectKeyData for UnbilledUsageAmountGetRequest
 *
 */
@JsonCreator
  public UnbilledUsageAmountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageObjectKeyData UnbilledUsageAmountIn) {
    super(id, "UnbilledUsageAmountGet");
    if (UnbilledUsageAmountIn != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectKeyHelper.toMap(UnbilledUsageAmountIn, new HashMap(), "UnbilledUsageObjectKeyData").get("UnbilledUsageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UnbilledUsageAmountObjectData that results from the UnbilledUsageAmountGetRequest call
 * @return UnbilledUsageAmountObjectData resulting from udt call
 *
 */

  public UnbilledUsageAmountObjectData getOutput() {
    return UnbilledUsageAmountObjectHelper.fromMap(outputMap, "UnbilledUsageAmount");
  }
}
