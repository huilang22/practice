/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaBoundaryConditionUpdateNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaBoundaryConditionUpdateNoOpRequest extends GeoAreaBoundaryConditionSubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaBoundaryConditionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaBoundaryConditionUpdateNoOpRequest(String id, GeoAreaBoundaryConditionObjectData noOpIn) {
    super(id, "GeoAreaBoundaryConditionUpdateNoOpRequest");
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
