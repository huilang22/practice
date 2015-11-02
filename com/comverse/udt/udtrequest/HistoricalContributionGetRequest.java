/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionGetRequest.java
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
 * Class used to create a HistoricalContributionGetRequest Udt Request
 *
 */

public class HistoricalContributionGetRequest extends HistoricalContributionSubRequestParent {
/**
 *
 * Constructor to create a  HistoricalContributionGetRequest
 * @param id Unique request name
 * @param HCgetIn HistoricalContributionObjectKeyData for HistoricalContributionGetRequest
 *
 */
@JsonCreator
  public HistoricalContributionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalContribution")HistoricalContributionObjectKeyData HCgetIn) {
    super(id, "HistoricalContributionGet");
    if (HCgetIn != null) {
      addInput("HistoricalContribution", HistoricalContributionObjectKeyHelper.toMap(HCgetIn, new HashMap(), "HistoricalContributionObjectKeyData").get("HistoricalContributionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the HistoricalContributionObjectData that results from the HistoricalContributionGetRequest call
 * @return HistoricalContributionObjectData resulting from udt call
 *
 */

  public HistoricalContributionObjectData getOutput() {
    return HistoricalContributionObjectHelper.fromMap(outputMap, "HistoricalContribution");
  }
}
