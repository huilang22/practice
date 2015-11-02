/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsGetRequest.java
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
 * Class used to create a HistoricalThresholdsGetRequest Udt Request
 *
 */

public class HistoricalThresholdsGetRequest extends HistoricalThresholdsSubRequestParent {
/**
 *
 * Constructor to create a  HistoricalThresholdsGetRequest
 * @param id Unique request name
 * @param HTGetIn HistoricalThresholdsObjectKeyData for HistoricalThresholdsGetRequest
 *
 */
@JsonCreator
  public HistoricalThresholdsGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalThresholds")HistoricalThresholdsObjectKeyData HTGetIn) {
    super(id, "HistoricalThresholdsGet");
    if (HTGetIn != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectKeyHelper.toMap(HTGetIn, new HashMap(), "HistoricalThresholdsObjectKeyData").get("HistoricalThresholdsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the HistoricalThresholdsObjectData that results from the HistoricalThresholdsGetRequest call
 * @return HistoricalThresholdsObjectData resulting from udt call
 *
 */

  public HistoricalThresholdsObjectData getOutput() {
    return HistoricalThresholdsObjectHelper.fromMap(outputMap, "HistoricalThresholds");
  }
}
