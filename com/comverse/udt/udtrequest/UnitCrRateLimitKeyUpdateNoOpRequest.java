/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitKeyUpdateNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a UnitCrRateLimitKeyUpdateNoOpRequest Udt Request/Response
 *
 */
public class UnitCrRateLimitKeyUpdateNoOpRequest extends UnitCrRateLimitKeySubRequestParent {
/**
 *
 * Constructor to create a   UnitCrRateLimitKeyUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitCrRateLimitKeyUpdateNoOpRequest(String id, UnitCrRateLimitKeysObjectData noOpIn) {
    super(id, "UnitCrRateLimitKeyUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(noOpIn, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }
/**
 *
 * Retrieves the UnitCrRateLimitKeysObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrRateLimitKeysObjectData getOutput() {
    return UnitCrRateLimitKeysObjectHelper.fromMap(outputMap, "UnitCrRateLimitKey");
  }
}
