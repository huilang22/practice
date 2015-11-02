/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsDeleteListRequest.java
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
 * Class used to create a HistoricalThresholdsDeleteListRequest Udt Request
 *
 */

public class HistoricalThresholdsDeleteListRequest extends HistoricalThresholdsRequest {
/**
 *
 * Constructor to create a  HistoricalThresholdsDeleteListRequest
 * @param id Unique request name
 * @param HTDeleteLIn HistoricalThresholdsObjectFilter for HistoricalThresholdsDeleteListRequest
 * @param InactiveDate Date for HistoricalThresholdsDeleteListRequest
 *
 */
@JsonCreator
  public HistoricalThresholdsDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalThresholds")HistoricalThresholdsObjectFilter HTDeleteLIn, @JsonProperty("InactiveDate")Date InactiveDate) {
    super(id, "HistoricalThresholdsDeleteList");
    if (HTDeleteLIn != null) {
      Integer index =  HTDeleteLIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(HTDeleteLIn, new HashMap(), "Void").get("Void"));
    }
    if (InactiveDate != null) {
      addInput("InactiveDate", InactiveDate);
    }
  }

}
