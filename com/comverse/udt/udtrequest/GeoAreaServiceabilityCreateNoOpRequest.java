/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityCreateNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaServiceabilityCreateNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaServiceabilityCreateNoOpRequest extends GeoAreaServiceabilitySubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaServiceabilityCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaServiceabilityCreateNoOpRequest(String id, GASObjData noOpIn) {
    super(id, "GeoAreaServiceabilityCreateNoOpRequest");
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
