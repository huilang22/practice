/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DistanceBandGetNoOpRequest.java
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
 * NoOp class used to simulate a DistanceBandGetNoOpRequest Udt Request/Response
 *
 */
public class DistanceBandGetNoOpRequest extends DistanceBandSubRequestParent {
/**
 *
 * Constructor to create a   DistanceBandGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DistanceBandGetNoOpRequest(String id, DistanceBandObjectData noOpIn) {
    super(id, "DistanceBandGetNoOpRequest");
    if (noOpIn != null) {
      addInput("DistanceBand", DistanceBandObjectHelper.toMap(noOpIn, new HashMap(), "DistanceBand").get("DistanceBand"));
    }
  }
/**
 *
 * Retrieves the DistanceBandObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DistanceBandObjectData getOutput() {
    return DistanceBandObjectHelper.fromMap(outputMap, "DistanceBand");
  }
}
