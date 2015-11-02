/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiCreateNoOpRequest.java
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
 * NoOp class used to simulate a RateEpiCreateNoOpRequest Udt Request/Response
 *
 */
public class RateEpiCreateNoOpRequest extends RateEpiSubRequestParent {
/**
 *
 * Constructor to create a   RateEpiCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateEpiCreateNoOpRequest(String id, RateEpiObjectData noOpIn) {
    super(id, "RateEpiCreateNoOpRequest");
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
