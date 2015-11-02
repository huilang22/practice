/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeValuesGetRequest.java
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
 * Class used to create a StatisticTypeValuesGetRequest Udt Request
 *
 */

public class StatisticTypeValuesGetRequest extends StatisticTypeValuesSubRequestParent {
/**
 *
 * Constructor to create a  StatisticTypeValuesGetRequest
 * @param id Unique request name
 * @param StatisticTypeValuesGetIn StatisticTypeValuesObjectKeyData for StatisticTypeValuesGetRequest
 *
 */
@JsonCreator
  public StatisticTypeValuesGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatisticTypeValues")StatisticTypeValuesObjectKeyData StatisticTypeValuesGetIn) {
    super(id, "StatisticTypeValuesGet");
    if (StatisticTypeValuesGetIn != null) {
      addInput("StatisticTypeValues", StatisticTypeValuesObjectKeyHelper.toMap(StatisticTypeValuesGetIn, new HashMap(), "StatisticTypeValuesObjectKeyData").get("StatisticTypeValuesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the StatisticTypeValuesObjectData that results from the StatisticTypeValuesGetRequest call
 * @return StatisticTypeValuesObjectData resulting from udt call
 *
 */

  public StatisticTypeValuesObjectData getOutput() {
    return StatisticTypeValuesObjectHelper.fromMap(outputMap, "StatisticTypeValues");
  }
}
