/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsCreateRequest.java
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
 * Class used to create a HistoricalThresholdsCreateRequest Udt Request
 *
 */

public class HistoricalThresholdsCreateRequest extends HistoricalThresholdsSubRequestParent {
/**
 *
 * Constructor to create a  HistoricalThresholdsCreateRequest
 * @param id Unique request name
 * @param HTCreateIn HistoricalThresholdsObjectData for HistoricalThresholdsCreateRequest
 *
 */
@JsonCreator
  public HistoricalThresholdsCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalThresholds")HistoricalThresholdsObjectData HTCreateIn) {
    super(id, "HistoricalThresholdsCreate");
    if (HTCreateIn != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(HTCreateIn, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }

/**
 *
 * Retrieves the HistoricalThresholdsObjectData that results from the HistoricalThresholdsCreateRequest call
 * @return HistoricalThresholdsObjectData resulting from udt call
 *
 */

  public HistoricalThresholdsObjectData getOutput() {
    return HistoricalThresholdsObjectHelper.fromMap(outputMap, "HistoricalThresholds");
  }
}
