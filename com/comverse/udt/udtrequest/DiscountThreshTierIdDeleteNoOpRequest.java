/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountThreshTierIdDeleteNoOpRequest.java
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
 * NoOp class used to simulate a DiscountThreshTierIdDeleteNoOpRequest Udt Request/Response
 *
 */
public class DiscountThreshTierIdDeleteNoOpRequest extends DiscountThreshTierIdSubRequestParent {
/**
 *
 * Constructor to create a   DiscountThreshTierIdDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountThreshTierIdDeleteNoOpRequest(String id, DTTObjectData noOpIn) {
    super(id, "DiscountThreshTierIdDeleteNoOpRequest");
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
