/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsFindRequest.java
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
 * Class used to create a HistoricalThresholdsFindRequest Udt Request
 *
 */

public class HistoricalThresholdsFindRequest extends HistoricalThresholdsRequest {
/**
 *
 * Constructor to create a  HistoricalThresholdsFindRequest
 * @param id Unique request name
 * @param HTFindIn HistoricalThresholdsObjectFilter for HistoricalThresholdsFindRequest
 *
 */
@JsonCreator
  public HistoricalThresholdsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalThresholds")HistoricalThresholdsObjectFilter HTFindIn) {
    super(id, "HistoricalThresholdsFind");
    if (HTFindIn != null) {
      Integer index =  HTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(HTFindIn, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }

/**
 *
 * Retrieves the HistoricalThresholdsObjectDataList that results from the HistoricalThresholdsFindRequest call
 * @return HistoricalThresholdsObjectDataList resulting from udt call
 *
 */

  public HistoricalThresholdsObjectDataList getOutput() {
    return HistoricalThresholdsObjectHelper.fromMapList(outputMap, "HistoricalThresholdsList");
  }
}
