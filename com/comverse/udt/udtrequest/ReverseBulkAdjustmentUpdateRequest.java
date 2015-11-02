/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ReverseBulkAdjustmentUpdateRequest.java
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
 * Class used to create a ReverseBulkAdjustmentUpdateRequest Udt Request
 *
 */

public class ReverseBulkAdjustmentUpdateRequest extends ReverseBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  ReverseBulkAdjustmentUpdateRequest
 * @param id Unique request name
 * @param ___BatchRequest BatchRequestObjectData for ReverseBulkAdjustmentUpdateRequest
 * @param _ReasonCode Integer for ReverseBulkAdjustmentUpdateRequest
 *
 */
@JsonCreator
  public ReverseBulkAdjustmentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectData ___BatchRequest, @JsonProperty("ReasonCode")Integer _ReasonCode) {
    super(id, "ReverseBulkAdjustmentUpdate");
    if (___BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(___BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_ReasonCode != null) {
      addInput("ReasonCode", _ReasonCode);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the ReverseBulkAdjustmentUpdateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
