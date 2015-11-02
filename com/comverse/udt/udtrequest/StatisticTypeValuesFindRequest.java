/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeValuesFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a StatisticTypeValuesFindRequest Udt Request
 *
 */

public class StatisticTypeValuesFindRequest extends StatisticTypeValuesRequest {
/**
 *
 * Constructor to create a  StatisticTypeValuesFindRequest
 * @param id Unique request name
 * @param StatisticTypeValuesFindIn StatisticTypeValuesObjectFilter for StatisticTypeValuesFindRequest
 *
 */
@JsonCreator
  public StatisticTypeValuesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatisticTypeValues")StatisticTypeValuesObjectFilter StatisticTypeValuesFindIn) {
    super(id, "StatisticTypeValuesFind");
    if (StatisticTypeValuesFindIn != null) {
      Integer index =  StatisticTypeValuesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("StatisticTypeValues", StatisticTypeValuesObjectHelper.toMap(StatisticTypeValuesFindIn, new HashMap(), "StatisticTypeValues").get("StatisticTypeValues"));
    }
  }

/**
 *
 * Retrieves the StatisticTypeValuesObjectDataList that results from the StatisticTypeValuesFindRequest call
 * @return StatisticTypeValuesObjectDataList resulting from udt call
 *
 */

  public StatisticTypeValuesObjectDataList getOutput() {
    return StatisticTypeValuesObjectHelper.fromMapList(outputMap, "StatisticTypeValuesList");
  }
}
