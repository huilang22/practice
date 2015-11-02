/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionTaxFindRequest.java
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
 * Class used to create a HistoricalContributionTaxFindRequest Udt Request
 *
 */

public class HistoricalContributionTaxFindRequest extends HistoricalContributionTaxRequest {
/**
 *
 * Constructor to create a  HistoricalContributionTaxFindRequest
 * @param id Unique request name
 * @param HCTFindIn HistoricalContributionTaxObjectFilter for HistoricalContributionTaxFindRequest
 *
 */
@JsonCreator
  public HistoricalContributionTaxFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalContributionTax")HistoricalContributionTaxObjectFilter HCTFindIn) {
    super(id, "HistoricalContributionTaxFind");
    if (HCTFindIn != null) {
      Integer index =  HCTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectHelper.toMap(HCTFindIn, new HashMap(), "HistoricalContributionTax").get("HistoricalContributionTax"));
    }
  }

/**
 *
 * Retrieves the HistoricalContributionTaxObjectDataList that results from the HistoricalContributionTaxFindRequest call
 * @return HistoricalContributionTaxObjectDataList resulting from udt call
 *
 */

  public HistoricalContributionTaxObjectDataList getOutput() {
    return HistoricalContributionTaxObjectHelper.fromMapList(outputMap, "HistoricalContributionTaxList");
  }
}
