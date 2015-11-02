/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeRefFindRequest.java
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
 * Class used to create a StatisticTypeRefFindRequest Udt Request
 *
 */

public class StatisticTypeRefFindRequest extends StatisticTypeRefRequest {
/**
 *
 * Constructor to create a  StatisticTypeRefFindRequest
 * @param id Unique request name
 * @param StatisticTypeRefFindIn StatisticTypeRefObjectFilter for StatisticTypeRefFindRequest
 *
 */
@JsonCreator
  public StatisticTypeRefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatisticTypeRef")StatisticTypeRefObjectFilter StatisticTypeRefFindIn) {
    super(id, "StatisticTypeRefFind");
    if (StatisticTypeRefFindIn != null) {
      Integer index =  StatisticTypeRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("StatisticTypeRef", StatisticTypeRefObjectHelper.toMap(StatisticTypeRefFindIn, new HashMap(), "StatisticTypeRef").get("StatisticTypeRef"));
    }
  }

/**
 *
 * Retrieves the StatisticTypeRefObjectDataList that results from the StatisticTypeRefFindRequest call
 * @return StatisticTypeRefObjectDataList resulting from udt call
 *
 */

  public StatisticTypeRefObjectDataList getOutput() {
    return StatisticTypeRefObjectHelper.fromMapList(outputMap, "StatisticTypeRefList");
  }
}
