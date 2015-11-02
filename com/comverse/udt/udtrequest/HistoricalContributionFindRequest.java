/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionFindRequest.java
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
 * Class used to create a HistoricalContributionFindRequest Udt Request
 *
 */

public class HistoricalContributionFindRequest extends HistoricalContributionRequest {
/**
 *
 * Constructor to create a  HistoricalContributionFindRequest
 * @param id Unique request name
 * @param HCfindIn HistoricalContributionObjectFilter for HistoricalContributionFindRequest
 *
 */
@JsonCreator
  public HistoricalContributionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalContribution")HistoricalContributionObjectFilter HCfindIn) {
    super(id, "HistoricalContributionFind");
    if (HCfindIn != null) {
      Integer index =  HCfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HistoricalContribution", HistoricalContributionObjectHelper.toMap(HCfindIn, new HashMap(), "HistoricalContribution").get("HistoricalContribution"));
    }
  }

/**
 *
 * Retrieves the HistoricalContributionObjectDataList that results from the HistoricalContributionFindRequest call
 * @return HistoricalContributionObjectDataList resulting from udt call
 *
 */

  public HistoricalContributionObjectDataList getOutput() {
    return HistoricalContributionObjectHelper.fromMapList(outputMap, "HistoricalContributionList");
  }
}
