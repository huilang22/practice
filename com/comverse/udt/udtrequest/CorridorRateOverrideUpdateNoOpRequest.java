/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateOverrideUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CorridorRateOverrideUpdateNoOpRequest Udt Request/Response
 *
 */
public class CorridorRateOverrideUpdateNoOpRequest extends CorridorRateOverrideSubRequestParent {
/**
 *
 * Constructor to create a   CorridorRateOverrideUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorRateOverrideUpdateNoOpRequest(String id, CROObjectData noOpIn) {
    super(id, "CorridorRateOverrideUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CorridorRateOverride", CROObjectHelper.toMap(noOpIn, new HashMap(), "CorridorRateOverride").get("CorridorRateOverride"));
    }
  }
/**
 *
 * Retrieves the CROObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CROObjectData getOutput() {
    return CROObjectHelper.fromMap(outputMap, "CorridorRateOverride");
  }
}
