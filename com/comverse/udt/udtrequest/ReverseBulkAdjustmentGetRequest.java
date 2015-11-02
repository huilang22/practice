/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ReverseBulkAdjustmentGetRequest.java
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
 * Class used to create a ReverseBulkAdjustmentGetRequest Udt Request
 *
 */

public class ReverseBulkAdjustmentGetRequest extends ReverseBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  ReverseBulkAdjustmentGetRequest
 * @param id Unique request name
 * @param _BatchRequest BatchRequestObjectKeyData for ReverseBulkAdjustmentGetRequest
 *
 */
@JsonCreator
  public ReverseBulkAdjustmentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData _BatchRequest) {
    super(id, "ReverseBulkAdjustmentGet");
    if (_BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(_BatchRequest, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ReverseBulkAdjustmentGetOutputData that results from the ReverseBulkAdjustmentGetRequest call
 * @return ReverseBulkAdjustmentGetOutputData resulting from udt call
 *
 */

  public ReverseBulkAdjustmentGetOutputData getOutput() {
    return ReverseBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
}
