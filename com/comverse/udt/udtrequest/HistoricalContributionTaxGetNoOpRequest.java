/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionTaxGetNoOpRequest.java
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
 * NoOp class used to simulate a HistoricalContributionTaxGetNoOpRequest Udt Request/Response
 *
 */
public class HistoricalContributionTaxGetNoOpRequest extends HistoricalContributionTaxSubRequestParent {
/**
 *
 * Constructor to create a   HistoricalContributionTaxGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HistoricalContributionTaxGetNoOpRequest(String id, HistoricalContributionTaxObjectData noOpIn) {
    super(id, "HistoricalContributionTaxGetNoOpRequest");
    if (noOpIn != null) {
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectHelper.toMap(noOpIn, new HashMap(), "HistoricalContributionTax").get("HistoricalContributionTax"));
    }
  }
/**
 *
 * Retrieves the HistoricalContributionTaxObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public HistoricalContributionTaxObjectData getOutput() {
    return HistoricalContributionTaxObjectHelper.fromMap(outputMap, "HistoricalContributionTax");
  }
}
