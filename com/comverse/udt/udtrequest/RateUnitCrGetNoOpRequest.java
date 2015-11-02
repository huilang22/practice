/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUnitCrGetNoOpRequest.java
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
 * NoOp class used to simulate a RateUnitCrGetNoOpRequest Udt Request/Response
 *
 */
public class RateUnitCrGetNoOpRequest extends RateUnitCrSubRequestParent {
/**
 *
 * Constructor to create a   RateUnitCrGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateUnitCrGetNoOpRequest(String id, RateUnitCrObjectData noOpIn) {
    super(id, "RateUnitCrGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(noOpIn, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
  }
/**
 *
 * Retrieves the RateUnitCrObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RateUnitCrObjectData getOutput() {
    return RateUnitCrObjectHelper.fromMap(outputMap, "RateUnitCr");
  }
}
