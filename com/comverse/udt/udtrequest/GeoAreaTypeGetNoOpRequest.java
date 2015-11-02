/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaTypeGetNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaTypeGetNoOpRequest extends GeoAreaTypeSubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaTypeGetNoOpRequest(String id, GeoAreaTypeObjectData noOpIn) {
    super(id, "GeoAreaTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("GeoAreaType", GeoAreaTypeObjectHelper.toMap(noOpIn, new HashMap(), "GeoAreaType").get("GeoAreaType"));
    }
  }
/**
 *
 * Retrieves the GeoAreaTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaTypeObjectData getOutput() {
    return GeoAreaTypeObjectHelper.fromMap(outputMap, "GeoAreaType");
  }
}
