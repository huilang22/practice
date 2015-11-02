/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateNrcCreateNoOpRequest.java
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
 * NoOp class used to simulate a RateNrcCreateNoOpRequest Udt Request/Response
 *
 */
public class RateNrcCreateNoOpRequest extends RateNrcSubRequestParent {
/**
 *
 * Constructor to create a   RateNrcCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateNrcCreateNoOpRequest(String id, RateNrcObjectData noOpIn) {
    super(id, "RateNrcCreateNoOpRequest");
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
