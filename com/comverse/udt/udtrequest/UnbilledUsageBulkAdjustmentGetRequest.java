/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageBulkAdjustmentGetRequest.java
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
 * Class used to create a UnbilledUsageBulkAdjustmentGetRequest Udt Request
 *
 */

public class UnbilledUsageBulkAdjustmentGetRequest extends UnbilledUsageBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  UnbilledUsageBulkAdjustmentGetRequest
 * @param id Unique request name
 * @param ___BatchRequest BatchRequestObjectKeyData for UnbilledUsageBulkAdjustmentGetRequest
 *
 */
@JsonCreator
  public UnbilledUsageBulkAdjustmentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData ___BatchRequest) {
    super(id, "UnbilledUsageBulkAdjustmentGet");
    if (___BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(___BatchRequest, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UnbilledUsageBulkAdjustmentGetOutputData that results from the UnbilledUsageBulkAdjustmentGetRequest call
 * @return UnbilledUsageBulkAdjustmentGetOutputData resulting from udt call
 *
 */

  public UnbilledUsageBulkAdjustmentGetOutputData getOutput() {
    return UnbilledUsageBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
}
