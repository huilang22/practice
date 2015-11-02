/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateGetNoOpRequest.java
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
 * NoOp class used to simulate a OverrideUsageCreditRateGetNoOpRequest Udt Request/Response
 *
 */
public class OverrideUsageCreditRateGetNoOpRequest extends OverrideUsageCreditRateSubRequestParent {
/**
 *
 * Constructor to create a   OverrideUsageCreditRateGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OverrideUsageCreditRateGetNoOpRequest(String id, RUCOverrideObjectData noOpIn) {
    super(id, "OverrideUsageCreditRateGetNoOpRequest");
    if (noOpIn != null) {
      addInput("OverrideUsageCreditRate", RUCOverrideObjectHelper.toMap(noOpIn, new HashMap(), "OverrideUsageCreditRate").get("OverrideUsageCreditRate"));
    }
  }
/**
 *
 * Retrieves the RUCOverrideObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RUCOverrideObjectData getOutput() {
    return RUCOverrideObjectHelper.fromMap(outputMap, "OverrideUsageCreditRate");
  }
}
