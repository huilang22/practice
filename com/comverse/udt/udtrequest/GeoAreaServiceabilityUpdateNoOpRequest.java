/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityUpdateNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaServiceabilityUpdateNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaServiceabilityUpdateNoOpRequest extends GeoAreaServiceabilitySubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaServiceabilityUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaServiceabilityUpdateNoOpRequest(String id, GASObjData noOpIn) {
    super(id, "GeoAreaServiceabilityUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("GeoAreaServiceability", GASObjHelper.toMap(noOpIn, new HashMap(), "GeoAreaServiceability").get("GeoAreaServiceability"));
    }
  }
/**
 *
 * Retrieves the GASObjData passed into the constructor
 * @return Simulated response
 *
 */
  public GASObjData getOutput() {
    return GASObjHelper.fromMap(outputMap, "GeoAreaServiceability");
  }
}
