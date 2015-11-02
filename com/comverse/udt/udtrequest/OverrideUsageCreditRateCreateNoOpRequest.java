/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateCreateNoOpRequest.java
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
 * NoOp class used to simulate a OverrideUsageCreditRateCreateNoOpRequest Udt Request/Response
 *
 */
public class OverrideUsageCreditRateCreateNoOpRequest extends OverrideUsageCreditRateSubRequestParent {
/**
 *
 * Constructor to create a   OverrideUsageCreditRateCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OverrideUsageCreditRateCreateNoOpRequest(String id, RUCOverrideObjectData noOpIn) {
    super(id, "OverrideUsageCreditRateCreateNoOpRequest");
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
