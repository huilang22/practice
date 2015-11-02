/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountThreshTierIdGetNoOpRequest.java
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
 * NoOp class used to simulate a DiscountThreshTierIdGetNoOpRequest Udt Request/Response
 *
 */
public class DiscountThreshTierIdGetNoOpRequest extends DiscountThreshTierIdSubRequestParent {
/**
 *
 * Constructor to create a   DiscountThreshTierIdGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountThreshTierIdGetNoOpRequest(String id, DTTObjectData noOpIn) {
    super(id, "DiscountThreshTierIdGetNoOpRequest");
    if (noOpIn != null) {
      addInput("DiscountThreshTierId", DTTObjectHelper.toMap(noOpIn, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }
/**
 *
 * Retrieves the DTTObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DTTObjectData getOutput() {
    return DTTObjectHelper.fromMap(outputMap, "DiscountThreshTierId");
  }
}
