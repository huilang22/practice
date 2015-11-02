/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesDeleteNoOpRequest.java
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
 * NoOp class used to simulate a LateFeeRateOverridesDeleteNoOpRequest Udt Request/Response
 *
 */
public class LateFeeRateOverridesDeleteNoOpRequest extends LateFeeRateOverridesSubRequestParent {
/**
 *
 * Constructor to create a   LateFeeRateOverridesDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LateFeeRateOverridesDeleteNoOpRequest(String id, LateFeeRateOverridesObjectData noOpIn) {
    super(id, "LateFeeRateOverridesDeleteNoOpRequest");
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
