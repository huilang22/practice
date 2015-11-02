/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcGetNoOpRequest.java
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
 * NoOp class used to simulate a RateRcGetNoOpRequest Udt Request/Response
 *
 */
public class RateRcGetNoOpRequest extends RateRcSubRequestParent {
/**
 *
 * Constructor to create a   RateRcGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateRcGetNoOpRequest(String id, RACObjectData noOpIn) {
    super(id, "RateRcGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RateRc", RACObjectHelper.toMap(noOpIn, new HashMap(), "RateRc").get("RateRc"));
    }
  }
/**
 *
 * Retrieves the RACObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RACObjectData getOutput() {
    return RACObjectHelper.fromMap(outputMap, "RateRc");
  }
}
