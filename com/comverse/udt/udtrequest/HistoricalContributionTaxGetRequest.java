/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionTaxGetRequest.java
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
 * Class used to create a HistoricalContributionTaxGetRequest Udt Request
 *
 */

public class HistoricalContributionTaxGetRequest extends HistoricalContributionTaxSubRequestParent {
/**
 *
 * Constructor to create a  HistoricalContributionTaxGetRequest
 * @param id Unique request name
 * @param HCTGetIn HistoricalContributionTaxObjectKeyData for HistoricalContributionTaxGetRequest
 *
 */
@JsonCreator
  public HistoricalContributionTaxGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalContributionTax")HistoricalContributionTaxObjectKeyData HCTGetIn) {
    super(id, "HistoricalContributionTaxGet");
    if (HCTGetIn != null) {
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectKeyHelper.toMap(HCTGetIn, new HashMap(), "HistoricalContributionTaxObjectKeyData").get("HistoricalContributionTaxObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the HistoricalContributionTaxObjectData that results from the HistoricalContributionTaxGetRequest call
 * @return HistoricalContributionTaxObjectData resulting from udt call
 *
 */

  public HistoricalContributionTaxObjectData getOutput() {
    return HistoricalContributionTaxObjectHelper.fromMap(outputMap, "HistoricalContributionTax");
  }
}
