/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageCreditRateGetNoOpRequest.java
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
 * NoOp class used to simulate a UsageCreditRateGetNoOpRequest Udt Request/Response
 *
 */
public class UsageCreditRateGetNoOpRequest extends UsageCreditRateSubRequestParent {
/**
 *
 * Constructor to create a   UsageCreditRateGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageCreditRateGetNoOpRequest(String id, RUCreditObjectData noOpIn) {
    super(id, "UsageCreditRateGetNoOpRequest");
    if (noOpIn != null) {
      addInput("UsageCreditRate", RUCreditObjectHelper.toMap(noOpIn, new HashMap(), "UsageCreditRate").get("UsageCreditRate"));
    }
  }
/**
 *
 * Retrieves the RUCreditObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RUCreditObjectData getOutput() {
    return RUCreditObjectHelper.fromMap(outputMap, "UsageCreditRate");
  }
}
