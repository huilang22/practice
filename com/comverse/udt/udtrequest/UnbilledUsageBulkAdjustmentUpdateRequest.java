/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageBulkAdjustmentUpdateRequest.java
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
 * Class used to create a UnbilledUsageBulkAdjustmentUpdateRequest Udt Request
 *
 */

public class UnbilledUsageBulkAdjustmentUpdateRequest extends UnbilledUsageBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  UnbilledUsageBulkAdjustmentUpdateRequest
 * @param id Unique request name
 * @param ___BulkAdjustment BulkAdjustmentObjectData for UnbilledUsageBulkAdjustmentUpdateRequest
 * @param _____BatchRequest BatchRequestObjectData for UnbilledUsageBulkAdjustmentUpdateRequest
 * @param _______UnbilledUsage UnbilledUsageObjectData[] for UnbilledUsageBulkAdjustmentUpdateRequest
 * @param ___UnbilledUsageQuery UnbilledUsageQueryObjectData for UnbilledUsageBulkAdjustmentUpdateRequest
 * @param __XMLFileName String for UnbilledUsageBulkAdjustmentUpdateRequest
 * @param __CDFFileName String for UnbilledUsageBulkAdjustmentUpdateRequest
 *
 */
@JsonCreator
  public UnbilledUsageBulkAdjustmentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BulkAdjustment")BulkAdjustmentObjectData ___BulkAdjustment, @JsonProperty("BatchRequest")BatchRequestObjectData _____BatchRequest, @JsonProperty("UnbilledUsage")UnbilledUsageObjectData[] _______UnbilledUsage, @JsonProperty("UnbilledUsageQuery")UnbilledUsageQueryObjectData ___UnbilledUsageQuery, @JsonProperty("XMLFileName")String __XMLFileName, @JsonProperty("CDFFileName")String __CDFFileName) {
    super(id, "UnbilledUsageBulkAdjustmentUpdate");
    if (___BulkAdjustment != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(___BulkAdjustment, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_____BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_____BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_______UnbilledUsage != null) {
      Object[] list = new Object[_______UnbilledUsage.length];
      for (int i = 0; i < _______UnbilledUsage.length; i++) {
        list[i] = UnbilledUsageObjectHelper.getMap(_______UnbilledUsage[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "UnbilledUsage");
      }
      addInput("UnbilledUsageList", list);
    }
    if (___UnbilledUsageQuery != null) {
      addInput("UnbilledUsageQuery", UnbilledUsageQueryObjectHelper.toMap(___UnbilledUsageQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
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
 * Retrieves the BatchRequestObjectData that results from the UnbilledUsageBulkAdjustmentUpdateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
