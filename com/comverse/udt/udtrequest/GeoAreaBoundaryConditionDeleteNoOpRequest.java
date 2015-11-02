/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionDeleteNoOpRequest.java
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

import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a GeoAreaBoundaryConditionDeleteNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaBoundaryConditionDeleteNoOpRequest extends GeoAreaBoundaryConditionSubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaBoundaryConditionDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaBoundaryConditionDeleteNoOpRequest(String id, GeoAreaBoundaryConditionObjectData noOpIn) {
    super(id, "GeoAreaBoundaryConditionDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectHelper.toMap(noOpIn, new HashMap(), "GeoAreaBoundaryCondition").get("GeoAreaBoundaryCondition"));
    }
  }
/**
 *
 * Retrieves the GeoAreaBoundaryConditionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaBoundaryConditionObjectData getOutput() {
    return GeoAreaBoundaryConditionObjectHelper.fromMap(outputMap, "GeoAreaBoundaryCondition");
  }
}
