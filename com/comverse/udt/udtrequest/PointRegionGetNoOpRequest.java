/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointRegionGetNoOpRequest.java
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
 * NoOp class used to simulate a PointRegionGetNoOpRequest Udt Request/Response
 *
 */
public class PointRegionGetNoOpRequest extends PointRegionSubRequestParent {
/**
 *
 * Constructor to create a   PointRegionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PointRegionGetNoOpRequest(String id, PointRegionObjectData noOpIn) {
    super(id, "PointRegionGetNoOpRequest");
    if (noOpIn != null) {
      addInput("PointRegion", PointRegionObjectHelper.toMap(noOpIn, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }
/**
 *
 * Retrieves the PointRegionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PointRegionObjectData getOutput() {
    return PointRegionObjectHelper.fromMap(outputMap, "PointRegion");
  }
}
