/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsGeographicRegionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsGeographicRegionUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsGeographicRegionUpdateNoOpRequest extends InvsGeographicRegionSubRequestParent {
/**
 *
 * Constructor to create a   InvsGeographicRegionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsGeographicRegionUpdateNoOpRequest(String id, InvsGeographicRegionObjectData noOpIn) {
    super(id, "InvsGeographicRegionUpdateNoOpRequest");
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
