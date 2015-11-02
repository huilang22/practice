/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionUpdateRequest.java
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
 * Class used to create a HistoricalContributionUpdateRequest Udt Request
 *
 */

public class HistoricalContributionUpdateRequest extends HistoricalContributionSubRequestParent {
/**
 *
 * Constructor to create a  HistoricalContributionUpdateRequest
 * @param id Unique request name
 * @param HCupdateIn HistoricalContributionObjectData for HistoricalContributionUpdateRequest
 *
 */
@JsonCreator
  public HistoricalContributionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalContribution")HistoricalContributionObjectData HCupdateIn) {
    super(id, "HistoricalContributionUpdate");
    if (HCupdateIn != null) {
      addInput("HistoricalContribution", HistoricalContributionObjectHelper.toMap(HCupdateIn, new HashMap(), "HistoricalContribution").get("HistoricalContribution"));
    }
  }

/**
 *
 * Retrieves the HistoricalContributionObjectData that results from the HistoricalContributionUpdateRequest call
 * @return HistoricalContributionObjectData resulting from udt call
 *
 */

  public HistoricalContributionObjectData getOutput() {
    return HistoricalContributionObjectHelper.fromMap(outputMap, "HistoricalContribution");
  }
}
