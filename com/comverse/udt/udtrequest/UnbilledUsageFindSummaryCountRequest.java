/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageFindSummaryCountRequest.java
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
 * Class used to create a UnbilledUsageFindSummaryCountRequest Udt Request
 *
 */

public class UnbilledUsageFindSummaryCountRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a  UnbilledUsageFindSummaryCountRequest
 * @param id Unique request name
 * @param UnbilledUsagesfindCountIn UnbilledUsageObjectFilter for UnbilledUsageFindSummaryCountRequest
 *
 */
@JsonCreator
  public UnbilledUsageFindSummaryCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageObjectFilter UnbilledUsagesfindCountIn) {
    super(id, "UnbilledUsageFindSummaryCount");
    if (UnbilledUsagesfindCountIn != null) {
      Integer index =  UnbilledUsagesfindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(UnbilledUsagesfindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the UnbilledUsageFindSummaryCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
