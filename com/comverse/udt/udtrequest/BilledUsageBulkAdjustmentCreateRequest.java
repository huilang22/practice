/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageBulkAdjustmentCreateRequest.java
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
 * Class used to create a BilledUsageBulkAdjustmentCreateRequest Udt Request
 *
 */

public class BilledUsageBulkAdjustmentCreateRequest extends BilledUsageBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  BilledUsageBulkAdjustmentCreateRequest
 * @param id Unique request name
 * @param _BulkAdjustment BulkAdjustmentObjectData for BilledUsageBulkAdjustmentCreateRequest
 * @param _BatchRequest BatchRequestObjectData for BilledUsageBulkAdjustmentCreateRequest
 * @param _____BilledUsage BilledUsageObjectData[] for BilledUsageBulkAdjustmentCreateRequest
 * @param _BilledUsageQuery BilledUsageQueryObjectData for BilledUsageBulkAdjustmentCreateRequest
 * @param XMLFileName String for BilledUsageBulkAdjustmentCreateRequest
 * @param CDFFileName String for BilledUsageBulkAdjustmentCreateRequest
 *
 */
@JsonCreator
  public BilledUsageBulkAdjustmentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BulkAdjustment")BulkAdjustmentObjectData _BulkAdjustment, @JsonProperty("BatchRequest")BatchRequestObjectData _BatchRequest, @JsonProperty("BilledUsage")BilledUsageObjectData[] _____BilledUsage, @JsonProperty("BilledUsageQuery")BilledUsageQueryObjectData _BilledUsageQuery, @JsonProperty("XMLFileName")String XMLFileName, @JsonProperty("CDFFileName")String CDFFileName) {
    super(id, "BilledUsageBulkAdjustmentCreate");
    if (_BulkAdjustment != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(_BulkAdjustment, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_____BilledUsage != null) {
      Object[] list = new Object[_____BilledUsage.length];
      for (int i = 0; i < _____BilledUsage.length; i++) {
        list[i] = BilledUsageObjectHelper.getMap(_____BilledUsage[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "BilledUsage");
      }
      addInput("BilledUsageList", list);
    }
    if (_BilledUsageQuery != null) {
      addInput("BilledUsageQuery", BilledUsageQueryObjectHelper.toMap(_BilledUsageQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (XMLFileName != null) {
      addInput("XMLFileName", XMLFileName);
    }
    if (CDFFileName != null) {
      addInput("CDFFileName", CDFFileName);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BilledUsageBulkAdjustmentCreateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
