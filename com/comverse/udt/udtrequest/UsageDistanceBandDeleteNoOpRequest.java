/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageDistanceBandDeleteNoOpRequest.java
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
 * NoOp class used to simulate a UsageDistanceBandDeleteNoOpRequest Udt Request/Response
 *
 */
public class UsageDistanceBandDeleteNoOpRequest extends UsageDistanceBandSubRequestParent {
/**
 *
 * Constructor to create a   UsageDistanceBandDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageDistanceBandDeleteNoOpRequest(String id, UsageDistBandObjectData noOpIn) {
    super(id, "UsageDistanceBandDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("UsageDistanceBand", UsageDistBandObjectHelper.toMap(noOpIn, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
  }
/**
 *
 * Retrieves the UsageDistBandObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UsageDistBandObjectData getOutput() {
    return UsageDistBandObjectHelper.fromMap(outputMap, "UsageDistanceBand");
  }
}
