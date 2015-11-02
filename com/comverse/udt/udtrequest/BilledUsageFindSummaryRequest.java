/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageFindSummaryRequest.java
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
 * Class used to create a BilledUsageFindSummaryRequest Udt Request
 *
 */

public class BilledUsageFindSummaryRequest extends BilledUsageRequest {
/**
 *
 * Constructor to create a  BilledUsageFindSummaryRequest
 * @param id Unique request name
 * @param BilledUsagesfindIn BilledUsageObjectFilter for BilledUsageFindSummaryRequest
 *
 */
@JsonCreator
  public BilledUsageFindSummaryRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageObjectFilter BilledUsagesfindIn) {
    super(id, "BilledUsageFindSummary");
    if (BilledUsagesfindIn != null) {
      Integer index =  BilledUsagesfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsagesfindIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }

/**
 *
 * Retrieves the BilledUsageObjectDataList that results from the BilledUsageFindSummaryRequest call
 * @return BilledUsageObjectDataList resulting from udt call
 *
 */

  public BilledUsageObjectDataList getOutput() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
}
