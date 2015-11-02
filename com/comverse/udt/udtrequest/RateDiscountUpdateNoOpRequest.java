/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateDiscountUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RateDiscountUpdateNoOpRequest Udt Request/Response
 *
 */
public class RateDiscountUpdateNoOpRequest extends RateDiscountSubRequestParent {
/**
 *
 * Constructor to create a   RateDiscountUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateDiscountUpdateNoOpRequest(String id, RateDiscountObjectData noOpIn) {
    super(id, "RateDiscountUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(noOpIn, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }
/**
 *
 * Retrieves the RateDiscountObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RateDiscountObjectData getOutput() {
    return RateDiscountObjectHelper.fromMap(outputMap, "RateDiscount");
  }
}
