/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaDeleteNoOpRequest.java
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
 * NoOp class used to simulate a GeoAreaDeleteNoOpRequest Udt Request/Response
 *
 */
public class GeoAreaDeleteNoOpRequest extends GeoAreaSubRequestParent {
/**
 *
 * Constructor to create a   GeoAreaDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GeoAreaDeleteNoOpRequest(String id, GAObjectData noOpIn) {
    super(id, "GeoAreaDeleteNoOpRequest");
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
