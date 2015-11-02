/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUnitCrUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RateUnitCrUpdateNoOpRequest Udt Request/Response
 *
 */
public class RateUnitCrUpdateNoOpRequest extends RateUnitCrSubRequestParent {
/**
 *
 * Constructor to create a   RateUnitCrUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateUnitCrUpdateNoOpRequest(String id, RateUnitCrObjectData noOpIn) {
    super(id, "RateUnitCrUpdateNoOpRequest");
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
