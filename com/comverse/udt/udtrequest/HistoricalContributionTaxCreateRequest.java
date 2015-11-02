/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionTaxCreateRequest.java
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
 * Class used to create a HistoricalContributionTaxCreateRequest Udt Request
 *
 */

public class HistoricalContributionTaxCreateRequest extends HistoricalContributionTaxSubRequestParent {
/**
 *
 * Constructor to create a  HistoricalContributionTaxCreateRequest
 * @param id Unique request name
 * @param HCTCreateIn HistoricalContributionTaxObjectData for HistoricalContributionTaxCreateRequest
 *
 */
@JsonCreator
  public HistoricalContributionTaxCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalContributionTax")HistoricalContributionTaxObjectData HCTCreateIn) {
    super(id, "HistoricalContributionTaxCreate");
    if (HCTCreateIn != null) {
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectHelper.toMap(HCTCreateIn, new HashMap(), "HistoricalContributionTax").get("HistoricalContributionTax"));
    }
  }

/**
 *
 * Retrieves the HistoricalContributionTaxObjectData that results from the HistoricalContributionTaxCreateRequest call
 * @return HistoricalContributionTaxObjectData resulting from udt call
 *
 */

  public HistoricalContributionTaxObjectData getOutput() {
    return HistoricalContributionTaxObjectHelper.fromMap(outputMap, "HistoricalContributionTax");
  }
}
