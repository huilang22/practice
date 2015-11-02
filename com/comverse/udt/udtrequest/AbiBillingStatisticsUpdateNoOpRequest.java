/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillingStatisticsUpdateNoOpRequest.java
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
 * NoOp class used to simulate a AbiBillingStatisticsUpdateNoOpRequest Udt Request/Response
 *
 */
public class AbiBillingStatisticsUpdateNoOpRequest extends AbiBillingStatisticsSubRequestParent {
/**
 *
 * Constructor to create a   AbiBillingStatisticsUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AbiBillingStatisticsUpdateNoOpRequest(String id, AbiBillingStatisticsObjectData noOpIn) {
    super(id, "AbiBillingStatisticsUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectHelper.toMap(noOpIn, new HashMap(), "AbiBillingStatistics").get("AbiBillingStatistics"));
    }
  }
/**
 *
 * Retrieves the AbiBillingStatisticsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AbiBillingStatisticsObjectData getOutput() {
    return AbiBillingStatisticsObjectHelper.fromMap(outputMap, "AbiBillingStatistics");
  }
}
