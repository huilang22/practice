/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideDiscountRateGetNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a OverrideDiscountRateGetNoOpRequest Udt Request/Response
 *
 */
public class OverrideDiscountRateGetNoOpRequest extends OverrideDiscountRateSubRequestParent {
/**
 *
 * Constructor to create a   OverrideDiscountRateGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OverrideDiscountRateGetNoOpRequest(String id, RDOverrideObjectData noOpIn) {
    super(id, "OverrideDiscountRateGetNoOpRequest");
    if (noOpIn != null) {
      addInput("OverrideDiscountRate", RDOverrideObjectHelper.toMap(noOpIn, new HashMap(), "OverrideDiscountRate").get("OverrideDiscountRate"));
    }
  }
/**
 *
 * Retrieves the RDOverrideObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RDOverrideObjectData getOutput() {
    return RDOverrideObjectHelper.fromMap(outputMap, "OverrideDiscountRate");
  }
}
