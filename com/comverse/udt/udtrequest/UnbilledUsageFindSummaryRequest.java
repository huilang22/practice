/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageFindSummaryRequest.java
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
 * Class used to create a UnbilledUsageFindSummaryRequest Udt Request
 *
 */

public class UnbilledUsageFindSummaryRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a  UnbilledUsageFindSummaryRequest
 * @param id Unique request name
 * @param UnbilledUsagesfindIn UnbilledUsageObjectFilter for UnbilledUsageFindSummaryRequest
 *
 */
@JsonCreator
  public UnbilledUsageFindSummaryRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageObjectFilter UnbilledUsagesfindIn) {
    super(id, "UnbilledUsageFindSummary");
    if (UnbilledUsagesfindIn != null) {
      Integer index =  UnbilledUsagesfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(UnbilledUsagesfindIn, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }

/**
 *
 * Retrieves the UnbilledUsageObjectDataList that results from the UnbilledUsageFindSummaryRequest call
 * @return UnbilledUsageObjectDataList resulting from udt call
 *
 */

  public UnbilledUsageObjectDataList getOutput() {
    return UnbilledUsageObjectHelper.fromMapList(outputMap, "UnbilledUsageList");
  }
}
