/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionTaxUpdateNoOpRequest.java
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
 * NoOp class used to simulate a HistoricalContributionTaxUpdateNoOpRequest Udt Request/Response
 *
 */
public class HistoricalContributionTaxUpdateNoOpRequest extends HistoricalContributionTaxSubRequestParent {
/**
 *
 * Constructor to create a   HistoricalContributionTaxUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HistoricalContributionTaxUpdateNoOpRequest(String id, HistoricalContributionTaxObjectData noOpIn) {
    super(id, "HistoricalContributionTaxUpdateNoOpRequest");
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
