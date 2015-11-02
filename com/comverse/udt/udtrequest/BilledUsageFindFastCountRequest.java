/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageFindFastCountRequest.java
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
 * Class used to create a BilledUsageFindFastCountRequest Udt Request
 *
 */

public class BilledUsageFindFastCountRequest extends BilledUsageRequest {
/**
 *
 * Constructor to create a  BilledUsageFindFastCountRequest
 * @param id Unique request name
 * @param BilledUsagefcountIn BilledUsageObjectFilter for BilledUsageFindFastCountRequest
 *
 */
@JsonCreator
  public BilledUsageFindFastCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageObjectFilter BilledUsagefcountIn) {
    super(id, "BilledUsageFindFastCount");
    if (BilledUsagefcountIn != null) {
      Integer index =  BilledUsagefcountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsagefcountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the BilledUsageFindFastCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
