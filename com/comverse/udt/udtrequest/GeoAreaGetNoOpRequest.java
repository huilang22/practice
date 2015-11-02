/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaGetNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaGetNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaGetNoOpRequest extends GeoAreaSubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaGetNoOpRequest(String id, GAObjectData noOpIn) {
    super(id, "GeoAreaGetNoOpRequest");
    if (noOpIn != null) {
      addInput("GeoArea", GAObjectHelper.toMap(noOpIn, new HashMap(), "GeoArea").get("GeoArea"));
    }
  }
/**
 *
 * Retrieves the GAObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GAObjectData getOutput() {
    return GAObjectHelper.fromMap(outputMap, "GeoArea");
  }
}
