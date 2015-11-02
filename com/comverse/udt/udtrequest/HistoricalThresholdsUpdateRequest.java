/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsUpdateRequest.java
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
 * Class used to create a HistoricalThresholdsUpdateRequest Udt Request
 *
 */

public class HistoricalThresholdsUpdateRequest extends HistoricalThresholdsSubRequestParent {
/**
 *
 * Constructor to create a  HistoricalThresholdsUpdateRequest
 * @param id Unique request name
 * @param HTUpdateIn HistoricalThresholdsObjectData for HistoricalThresholdsUpdateRequest
 *
 */
@JsonCreator
  public HistoricalThresholdsUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalThresholds")HistoricalThresholdsObjectData HTUpdateIn) {
    super(id, "HistoricalThresholdsUpdate");
    if (HTUpdateIn != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(HTUpdateIn, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }

/**
 *
 * Retrieves the HistoricalThresholdsObjectData that results from the HistoricalThresholdsUpdateRequest call
 * @return HistoricalThresholdsObjectData resulting from udt call
 *
 */

  public HistoricalThresholdsObjectData getOutput() {
    return HistoricalThresholdsObjectHelper.fromMap(outputMap, "HistoricalThresholds");
  }
}
