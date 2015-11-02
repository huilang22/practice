/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateCreateNoOpRequest.java
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
 * NoOp class used to simulate a RbrRateCreateNoOpRequest Udt Request/Response
 *
 */
public class RbrRateCreateNoOpRequest extends RbrRateSubRequestParent {
/**
 *
 * Constructor to create a   RbrRateCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrRateCreateNoOpRequest(String id, RbrRatesObjectData noOpIn) {
    super(id, "RbrRateCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("RbrRate", RbrRatesObjectHelper.toMap(noOpIn, new HashMap(), "RbrRate").get("RbrRate"));
    }
  }
/**
 *
 * Retrieves the RbrRatesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RbrRatesObjectData getOutput() {
    return RbrRatesObjectHelper.fromMap(outputMap, "RbrRate");
  }
}
