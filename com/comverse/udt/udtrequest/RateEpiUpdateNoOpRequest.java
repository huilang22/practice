/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RateEpiUpdateNoOpRequest Udt Request/Response
 *
 */
public class RateEpiUpdateNoOpRequest extends RateEpiSubRequestParent {
/**
 *
 * Constructor to create a   RateEpiUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateEpiUpdateNoOpRequest(String id, RateEpiObjectData noOpIn) {
    super(id, "RateEpiUpdateNoOpRequest");
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
