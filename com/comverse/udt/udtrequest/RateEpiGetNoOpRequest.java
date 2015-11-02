/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiGetNoOpRequest.java
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
 * NoOp class used to simulate a RateEpiGetNoOpRequest Udt Request/Response
 *
 */
public class RateEpiGetNoOpRequest extends RateEpiSubRequestParent {
/**
 *
 * Constructor to create a   RateEpiGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateEpiGetNoOpRequest(String id, RateEpiObjectData noOpIn) {
    super(id, "RateEpiGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RateEpi", RateEpiObjectHelper.toMap(noOpIn, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }
/**
 *
 * Retrieves the RateEpiObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RateEpiObjectData getOutput() {
    return RateEpiObjectHelper.fromMap(outputMap, "RateEpi");
  }
}
