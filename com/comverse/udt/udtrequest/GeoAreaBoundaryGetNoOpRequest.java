/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryGetNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaBoundaryGetNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaBoundaryGetNoOpRequest extends GeoAreaBoundarySubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaBoundaryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaBoundaryGetNoOpRequest(String id, GeoAreaBoundaryObjectData noOpIn) {
    super(id, "GeoAreaBoundaryGetNoOpRequest");
    if (noOpIn != null) {
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectHelper.toMap(noOpIn, new HashMap(), "GeoAreaBoundary").get("GeoAreaBoundary"));
    }
  }
/**
 *
 * Retrieves the GeoAreaBoundaryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaBoundaryObjectData getOutput() {
    return GeoAreaBoundaryObjectHelper.fromMap(outputMap, "GeoAreaBoundary");
  }
}
