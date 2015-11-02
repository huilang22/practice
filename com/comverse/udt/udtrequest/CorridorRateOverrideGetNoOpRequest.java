/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateOverrideGetNoOpRequest.java
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
 * NoOp class used to simulate a CorridorRateOverrideGetNoOpRequest Udt Request/Response
 *
 */
public class CorridorRateOverrideGetNoOpRequest extends CorridorRateOverrideSubRequestParent {
/**
 *
 * Constructor to create a   CorridorRateOverrideGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorRateOverrideGetNoOpRequest(String id, CROObjectData noOpIn) {
    super(id, "CorridorRateOverrideGetNoOpRequest");
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
