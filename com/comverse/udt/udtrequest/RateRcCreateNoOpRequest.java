/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcCreateNoOpRequest.java
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
 * NoOp class used to simulate a RateRcCreateNoOpRequest Udt Request/Response
 *
 */
public class RateRcCreateNoOpRequest extends RateRcSubRequestParent {
/**
 *
 * Constructor to create a   RateRcCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateRcCreateNoOpRequest(String id, RACObjectData noOpIn) {
    super(id, "RateRcCreateNoOpRequest");
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
