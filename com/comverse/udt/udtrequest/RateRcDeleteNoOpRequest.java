/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcDeleteNoOpRequest.java
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
 * NoOp class used to simulate a RateRcDeleteNoOpRequest Udt Request/Response
 *
 */
public class RateRcDeleteNoOpRequest extends RateRcSubRequestParent {
/**
 *
 * Constructor to create a   RateRcDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateRcDeleteNoOpRequest(String id, RACObjectData noOpIn) {
    super(id, "RateRcDeleteNoOpRequest");
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
