/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionCreateRequest.java
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
 * Class used to create a HistoricalContributionCreateRequest Udt Request
 *
 */

public class HistoricalContributionCreateRequest extends HistoricalContributionSubRequestParent {
/**
 *
 * Constructor to create a  HistoricalContributionCreateRequest
 * @param id Unique request name
 * @param HCcreateIn HistoricalContributionObjectData for HistoricalContributionCreateRequest
 *
 */
@JsonCreator
  public HistoricalContributionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HistoricalContribution")HistoricalContributionObjectData HCcreateIn) {
    super(id, "HistoricalContributionCreate");
    if (HCcreateIn != null) {
      addInput("HistoricalContribution", HistoricalContributionObjectHelper.toMap(HCcreateIn, new HashMap(), "HistoricalContribution").get("HistoricalContribution"));
    }
  }

/**
 *
 * Retrieves the HistoricalContributionObjectData that results from the HistoricalContributionCreateRequest call
 * @return HistoricalContributionObjectData resulting from udt call
 *
 */

  public HistoricalContributionObjectData getOutput() {
    return HistoricalContributionObjectHelper.fromMap(outputMap, "HistoricalContribution");
  }
}
