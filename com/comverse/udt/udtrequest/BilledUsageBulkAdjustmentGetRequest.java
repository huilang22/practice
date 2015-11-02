/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageBulkAdjustmentGetRequest.java
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

import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BilledUsageBulkAdjustmentGetRequest Udt Request
 *
 */

public class BilledUsageBulkAdjustmentGetRequest extends BilledUsageBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  BilledUsageBulkAdjustmentGetRequest
 * @param id Unique request name
 * @param ___BatchRequest BatchRequestObjectKeyData for BilledUsageBulkAdjustmentGetRequest
 *
 */
@JsonCreator
  public BilledUsageBulkAdjustmentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData ___BatchRequest) {
    super(id, "BilledUsageBulkAdjustmentGet");
    if (___BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(___BatchRequest, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BilledUsageBulkAdjustmentGetOutputData that results from the BilledUsageBulkAdjustmentGetRequest call
 * @return BilledUsageBulkAdjustmentGetOutputData resulting from udt call
 *
 */

  public BilledUsageBulkAdjustmentGetOutputData getOutput() {
    return BilledUsageBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
}
