/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityGetNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaServiceabilityGetNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaServiceabilityGetNoOpRequest extends GeoAreaServiceabilitySubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaServiceabilityGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaServiceabilityGetNoOpRequest(String id, GASObjData noOpIn) {
    super(id, "GeoAreaServiceabilityGetNoOpRequest");
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
