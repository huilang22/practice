/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageBulkAdjustmentUpdateRequest.java
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
 * Class used to create a BilledUsageBulkAdjustmentUpdateRequest Udt Request
 *
 */

public class BilledUsageBulkAdjustmentUpdateRequest extends BilledUsageBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  BilledUsageBulkAdjustmentUpdateRequest
 * @param id Unique request name
 * @param ___BulkAdjustment BulkAdjustmentObjectData for BilledUsageBulkAdjustmentUpdateRequest
 * @param _____BatchRequest BatchRequestObjectData for BilledUsageBulkAdjustmentUpdateRequest
 * @param _______BilledUsage BilledUsageObjectData[] for BilledUsageBulkAdjustmentUpdateRequest
 * @param ____BilledUsageQuery BilledUsageQueryObjectData for BilledUsageBulkAdjustmentUpdateRequest
 * @param __XMLFileName String for BilledUsageBulkAdjustmentUpdateRequest
 * @param __CDFFileName String for BilledUsageBulkAdjustmentUpdateRequest
 *
 */
@JsonCreator
  public BilledUsageBulkAdjustmentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BulkAdjustment")BulkAdjustmentObjectData ___BulkAdjustment, @JsonProperty("BatchRequest")BatchRequestObjectData _____BatchRequest, @JsonProperty("BilledUsage")BilledUsageObjectData[] _______BilledUsage, @JsonProperty("BilledUsageQuery")BilledUsageQueryObjectData ____BilledUsageQuery, @JsonProperty("XMLFileName")String __XMLFileName, @JsonProperty("CDFFileName")String __CDFFileName) {
    super(id, "BilledUsageBulkAdjustmentUpdate");
    if (___BulkAdjustment != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(___BulkAdjustment, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_____BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_____BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_______BilledUsage != null) {
      Object[] list = new Object[_______BilledUsage.length];
      for (int i = 0; i < _______BilledUsage.length; i++) {
        list[i] = BilledUsageObjectHelper.getMap(_______BilledUsage[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "BilledUsage");
      }
      addInput("BilledUsageList", list);
    }
    if (____BilledUsageQuery != null) {
      addInput("BilledUsageQuery", BilledUsageQueryObjectHelper.toMap(____BilledUsageQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (__XMLFileName != null) {
      addInput("XMLFileName", __XMLFileName);
    }
    if (__CDFFileName != null) {
      addInput("CDFFileName", __CDFFileName);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BilledUsageBulkAdjustmentUpdateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
