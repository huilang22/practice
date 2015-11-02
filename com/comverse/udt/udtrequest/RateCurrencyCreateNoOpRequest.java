/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCurrencyCreateNoOpRequest.java
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
 * NoOp class used to simulate a RateCurrencyCreateNoOpRequest Udt Request/Response
 *
 */
public class RateCurrencyCreateNoOpRequest extends RateCurrencySubRequestParent {
/**
 *
 * Constructor to create a   RateCurrencyCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateCurrencyCreateNoOpRequest(String id, RCObjectData noOpIn) {
    super(id, "RateCurrencyCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("RateCurrency", RCObjectHelper.toMap(noOpIn, new HashMap(), "RateCurrency").get("RateCurrency"));
    }
  }
/**
 *
 * Retrieves the RCObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RCObjectData getOutput() {
    return RCObjectHelper.fromMap(outputMap, "RateCurrency");
  }
}
