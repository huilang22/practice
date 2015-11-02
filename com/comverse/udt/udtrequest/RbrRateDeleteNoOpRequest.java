/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateDeleteNoOpRequest.java
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
 * NoOp class used to simulate a RbrRateDeleteNoOpRequest Udt Request/Response
 *
 */
public class RbrRateDeleteNoOpRequest extends RbrRateSubRequestParent {
/**
 *
 * Constructor to create a   RbrRateDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrRateDeleteNoOpRequest(String id, RbrRatesObjectData noOpIn) {
    super(id, "RbrRateDeleteNoOpRequest");
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
