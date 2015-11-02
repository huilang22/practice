/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RateRcUpdateNoOpRequest Udt Request/Response
 *
 */
public class RateRcUpdateNoOpRequest extends RateRcSubRequestParent {
/**
 *
 * Constructor to create a   RateRcUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateRcUpdateNoOpRequest(String id, RACObjectData noOpIn) {
    super(id, "RateRcUpdateNoOpRequest");
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
