/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsGeographicRegionGetNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsGeographicRegionGetNoOpRequest Udt Request/Response
 *
 */
public class InvsGeographicRegionGetNoOpRequest extends InvsGeographicRegionSubRequestParent {
/**
 *
 * Constructor to create a   InvsGeographicRegionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsGeographicRegionGetNoOpRequest(String id, InvsGeographicRegionObjectData noOpIn) {
    super(id, "InvsGeographicRegionGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectHelper.toMap(noOpIn, new HashMap(), "InvsGeographicRegion").get("InvsGeographicRegion"));
    }
  }
/**
 *
 * Retrieves the InvsGeographicRegionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsGeographicRegionObjectData getOutput() {
    return InvsGeographicRegionObjectHelper.fromMap(outputMap, "InvsGeographicRegion");
  }
}
