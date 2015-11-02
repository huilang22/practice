/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageBulkAdjustmentCreateRequest.java
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
 * Class used to create a UnbilledUsageBulkAdjustmentCreateRequest Udt Request
 *
 */

public class UnbilledUsageBulkAdjustmentCreateRequest extends UnbilledUsageBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  UnbilledUsageBulkAdjustmentCreateRequest
 * @param id Unique request name
 * @param _BulkAdjustment BulkAdjustmentObjectData for UnbilledUsageBulkAdjustmentCreateRequest
 * @param _BatchRequest BatchRequestObjectData for UnbilledUsageBulkAdjustmentCreateRequest
 * @param _____UnbilledUsage UnbilledUsageObjectData[] for UnbilledUsageBulkAdjustmentCreateRequest
 * @param _UnbilledUsageQuery UnbilledUsageQueryObjectData for UnbilledUsageBulkAdjustmentCreateRequest
 * @param XMLFileName String for UnbilledUsageBulkAdjustmentCreateRequest
 * @param CDFFileName String for UnbilledUsageBulkAdjustmentCreateRequest
 *
 */
@JsonCreator
  public UnbilledUsageBulkAdjustmentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BulkAdjustment")BulkAdjustmentObjectData _BulkAdjustment, @JsonProperty("BatchRequest")BatchRequestObjectData _BatchRequest, @JsonProperty("UnbilledUsage")UnbilledUsageObjectData[] _____UnbilledUsage, @JsonProperty("UnbilledUsageQuery")UnbilledUsageQueryObjectData _UnbilledUsageQuery, @JsonProperty("XMLFileName")String XMLFileName, @JsonProperty("CDFFileName")String CDFFileName) {
    super(id, "UnbilledUsageBulkAdjustmentCreate");
    if (_BulkAdjustment != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(_BulkAdjustment, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_____UnbilledUsage != null) {
      Object[] list = new Object[_____UnbilledUsage.length];
      for (int i = 0; i < _____UnbilledUsage.length; i++) {
        list[i] = UnbilledUsageObjectHelper.getMap(_____UnbilledUsage[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "UnbilledUsage");
      }
      addInput("UnbilledUsageList", list);
    }
    if (_UnbilledUsageQuery != null) {
      addInput("UnbilledUsageQuery", UnbilledUsageQueryObjectHelper.toMap(_UnbilledUsageQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
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
 * Retrieves the BatchRequestObjectData that results from the UnbilledUsageBulkAdjustmentCreateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
