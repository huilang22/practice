/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsDeleteRequest.java
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
 * Class used to create a HistoricalThresholdsDeleteRequest Udt Request
 *
 */

public class HistoricalThresholdsDeleteRequest extends HistoricalThresholdsSubRequestParent {
/**
 *
 * Constructor to create a  HistoricalThresholdsDeleteRequest
 * @param id Unique request name
 * @param HTDeleteIn HistoricalThresholdsObjectKeyData for HistoricalThresholdsDeleteRequest
 * @param inactive_date Date for HistoricalThresholdsDeleteRequest
 *
 */
@JsonCreator
  public HistoricalThresholdsDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalThresholds")HistoricalThresholdsObjectKeyData HTDeleteIn, @JsonProperty("InactiveDate")Date inactive_date) {
    super(id, "HistoricalThresholdsDelete");
    if (HTDeleteIn != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectKeyHelper.toMap(HTDeleteIn, new HashMap(), "HistoricalThresholdsObjectKeyData").get("HistoricalThresholdsObjectKeyData"));
    }
    if (inactive_date != null) {
      addInput("InactiveDate", inactive_date);
    }
  }

/**
 *
 * Retrieves the HistoricalThresholdsObjectData that results from the HistoricalThresholdsDeleteRequest call
 * @return HistoricalThresholdsObjectData resulting from udt call
 *
 */

  public HistoricalThresholdsObjectData getOutput() {
    return HistoricalThresholdsObjectHelper.fromMap(outputMap, "HistoricalThresholds");
  }
}
