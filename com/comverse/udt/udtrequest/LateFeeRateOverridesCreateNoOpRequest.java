/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesCreateNoOpRequest.java
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
 * NoOp class used to simulate a LateFeeRateOverridesCreateNoOpRequest Udt Request/Response
 *
 */
public class LateFeeRateOverridesCreateNoOpRequest extends LateFeeRateOverridesSubRequestParent {
/**
 *
 * Constructor to create a   LateFeeRateOverridesCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LateFeeRateOverridesCreateNoOpRequest(String id, LateFeeRateOverridesObjectData noOpIn) {
    super(id, "LateFeeRateOverridesCreateNoOpRequest");
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
