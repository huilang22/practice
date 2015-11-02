/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillingStatisticsFindRequest.java
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
 * Class used to create a AbiBillingStatisticsFindRequest Udt Request
 *
 */

public class AbiBillingStatisticsFindRequest extends AbiBillingStatisticsRequest {
/**
 *
 * Constructor to create a  AbiBillingStatisticsFindRequest
 * @param id Unique request name
 * @param AbiBillingStatisticsFindIn AbiBillingStatisticsObjectFilter for AbiBillingStatisticsFindRequest
 *
 */
@JsonCreator
  public AbiBillingStatisticsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AbiBillingStatistics")AbiBillingStatisticsObjectFilter AbiBillingStatisticsFindIn) {
    super(id, "AbiBillingStatisticsFind");
    if (AbiBillingStatisticsFindIn != null) {
      Integer index =  AbiBillingStatisticsFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectHelper.toMap(AbiBillingStatisticsFindIn, new HashMap(), "AbiBillingStatistics").get("AbiBillingStatistics"));
    }
  }

/**
 *
 * Retrieves the AbiBillingStatisticsObjectDataList that results from the AbiBillingStatisticsFindRequest call
 * @return AbiBillingStatisticsObjectDataList resulting from udt call
 *
 */

  public AbiBillingStatisticsObjectDataList getOutput() {
    return AbiBillingStatisticsObjectHelper.fromMapList(outputMap, "AbiBillingStatisticsList");
  }
}
