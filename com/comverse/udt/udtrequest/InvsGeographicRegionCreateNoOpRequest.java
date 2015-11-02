/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsGeographicRegionCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsGeographicRegionCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsGeographicRegionCreateNoOpRequest extends InvsGeographicRegionSubRequestParent {
/**
 *
 * Constructor to create a   InvsGeographicRegionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsGeographicRegionCreateNoOpRequest(String id, InvsGeographicRegionObjectData noOpIn) {
    super(id, "InvsGeographicRegionCreateNoOpRequest");
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
