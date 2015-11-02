/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesUpdateNoOpRequest.java
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
 * NoOp class used to simulate a LateFeeRateOverridesUpdateNoOpRequest Udt Request/Response
 *
 */
public class LateFeeRateOverridesUpdateNoOpRequest extends LateFeeRateOverridesSubRequestParent {
/**
 *
 * Constructor to create a   LateFeeRateOverridesUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LateFeeRateOverridesUpdateNoOpRequest(String id, LateFeeRateOverridesObjectData noOpIn) {
    super(id, "LateFeeRateOverridesUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectHelper.toMap(noOpIn, new HashMap(), "LateFeeRateOverrides").get("LateFeeRateOverrides"));
    }
  }
/**
 *
 * Retrieves the LateFeeRateOverridesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public LateFeeRateOverridesObjectData getOutput() {
    return LateFeeRateOverridesObjectHelper.fromMap(outputMap, "LateFeeRateOverrides");
  }
}
