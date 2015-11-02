/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DistanceBandCreateNoOpRequest.java
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
 * NoOp class used to simulate a DistanceBandCreateNoOpRequest Udt Request/Response
 *
 */
public class DistanceBandCreateNoOpRequest extends DistanceBandSubRequestParent {
/**
 *
 * Constructor to create a   DistanceBandCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DistanceBandCreateNoOpRequest(String id, DistanceBandObjectData noOpIn) {
    super(id, "DistanceBandCreateNoOpRequest");
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
