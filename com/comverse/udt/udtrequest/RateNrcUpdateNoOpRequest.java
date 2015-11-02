/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateNrcUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RateNrcUpdateNoOpRequest Udt Request/Response
 *
 */
public class RateNrcUpdateNoOpRequest extends RateNrcSubRequestParent {
/**
 *
 * Constructor to create a   RateNrcUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateNrcUpdateNoOpRequest(String id, RateNrcObjectData noOpIn) {
    super(id, "RateNrcUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("RateNrc", RateNrcObjectHelper.toMap(noOpIn, new HashMap(), "RateNrc").get("RateNrc"));
    }
  }
/**
 *
 * Retrieves the RateNrcObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RateNrcObjectData getOutput() {
    return RateNrcObjectHelper.fromMap(outputMap, "RateNrc");
  }
}
