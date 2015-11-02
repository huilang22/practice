/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillingStatisticsUpdateRequest.java
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
 * Class used to create a AbiBillingStatisticsUpdateRequest Udt Request
 *
 */

public class AbiBillingStatisticsUpdateRequest extends AbiBillingStatisticsSubRequestParent {
/**
 *
 * Constructor to create a  AbiBillingStatisticsUpdateRequest
 * @param id Unique request name
 * @param AbiBillingStatisticsUpdateIn AbiBillingStatisticsObjectData for AbiBillingStatisticsUpdateRequest
 *
 */
@JsonCreator
  public AbiBillingStatisticsUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AbiBillingStatistics")AbiBillingStatisticsObjectData AbiBillingStatisticsUpdateIn) {
    super(id, "AbiBillingStatisticsUpdate");
    if (AbiBillingStatisticsUpdateIn != null) {
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectHelper.toMap(AbiBillingStatisticsUpdateIn, new HashMap(), "AbiBillingStatistics").get("AbiBillingStatistics"));
    }
  }

/**
 *
 * Retrieves the AbiBillingStatisticsObjectData that results from the AbiBillingStatisticsUpdateRequest call
 * @return AbiBillingStatisticsObjectData resulting from udt call
 *
 */

  public AbiBillingStatisticsObjectData getOutput() {
    return AbiBillingStatisticsObjectHelper.fromMap(outputMap, "AbiBillingStatistics");
  }
}
