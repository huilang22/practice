/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsUpdateNoOpRequest.java
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
 * NoOp class used to simulate a HistoricalThresholdsUpdateNoOpRequest Udt Request/Response
 *
 */
public class HistoricalThresholdsUpdateNoOpRequest extends HistoricalThresholdsSubRequestParent {
/**
 *
 * Constructor to create a   HistoricalThresholdsUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HistoricalThresholdsUpdateNoOpRequest(String id, HistoricalThresholdsObjectData noOpIn) {
    super(id, "HistoricalThresholdsUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(noOpIn, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }
/**
 *
 * Retrieves the HistoricalThresholdsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public HistoricalThresholdsObjectData getOutput() {
    return HistoricalThresholdsObjectHelper.fromMap(outputMap, "HistoricalThresholds");
  }
}
