/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionTaxUpdateRequest.java
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
 * Class used to create a HistoricalContributionTaxUpdateRequest Udt Request
 *
 */

public class HistoricalContributionTaxUpdateRequest extends HistoricalContributionTaxSubRequestParent {
/**
 *
 * Constructor to create a  HistoricalContributionTaxUpdateRequest
 * @param id Unique request name
 * @param HCTUpdateIn HistoricalContributionTaxObjectData for HistoricalContributionTaxUpdateRequest
 *
 */
@JsonCreator
  public HistoricalContributionTaxUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalContributionTax")HistoricalContributionTaxObjectData HCTUpdateIn) {
    super(id, "HistoricalContributionTaxUpdate");
    if (HCTUpdateIn != null) {
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectHelper.toMap(HCTUpdateIn, new HashMap(), "HistoricalContributionTax").get("HistoricalContributionTax"));
    }
  }

/**
 *
 * Retrieves the HistoricalContributionTaxObjectData that results from the HistoricalContributionTaxUpdateRequest call
 * @return HistoricalContributionTaxObjectData resulting from udt call
 *
 */

  public HistoricalContributionTaxObjectData getOutput() {
    return HistoricalContributionTaxObjectHelper.fromMap(outputMap, "HistoricalContributionTax");
  }
}
