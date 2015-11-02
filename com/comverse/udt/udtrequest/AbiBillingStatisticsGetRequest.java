/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillingStatisticsGetRequest.java
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
 * Class used to create a AbiBillingStatisticsGetRequest Udt Request
 *
 */

public class AbiBillingStatisticsGetRequest extends AbiBillingStatisticsSubRequestParent {
/**
 *
 * Constructor to create a  AbiBillingStatisticsGetRequest
 * @param id Unique request name
 * @param AbiBillingStatisticsGetIn AbiBillingStatisticsObjectKeyData for AbiBillingStatisticsGetRequest
 *
 */
@JsonCreator
  public AbiBillingStatisticsGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AbiBillingStatistics")AbiBillingStatisticsObjectKeyData AbiBillingStatisticsGetIn) {
    super(id, "AbiBillingStatisticsGet");
    if (AbiBillingStatisticsGetIn != null) {
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectKeyHelper.toMap(AbiBillingStatisticsGetIn, new HashMap(), "AbiBillingStatisticsObjectKeyData").get("AbiBillingStatisticsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AbiBillingStatisticsObjectData that results from the AbiBillingStatisticsGetRequest call
 * @return AbiBillingStatisticsObjectData resulting from udt call
 *
 */

  public AbiBillingStatisticsObjectData getOutput() {
    return AbiBillingStatisticsObjectHelper.fromMap(outputMap, "AbiBillingStatistics");
  }
}
