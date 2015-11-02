/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionGetNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a HistoricalContributionGetNoOpRequest Udt Request/Response
 *
 */
public class HistoricalContributionGetNoOpRequest extends HistoricalContributionSubRequestParent {
/**
 *
 * Constructor to create a   HistoricalContributionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HistoricalContributionGetNoOpRequest(String id, HistoricalContributionObjectData noOpIn) {
    super(id, "HistoricalContributionGetNoOpRequest");
    if (noOpIn != null) {
      addInput("HistoricalContribution", HistoricalContributionObjectHelper.toMap(noOpIn, new HashMap(), "HistoricalContribution").get("HistoricalContribution"));
    }
  }
/**
 *
 * Retrieves the HistoricalContributionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public HistoricalContributionObjectData getOutput() {
    return HistoricalContributionObjectHelper.fromMap(outputMap, "HistoricalContribution");
  }
}
