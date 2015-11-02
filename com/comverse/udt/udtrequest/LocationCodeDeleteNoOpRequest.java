/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeDeleteNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a LocationCodeDeleteNoOpRequest Udt Request/Response
 *
 */
public class LocationCodeDeleteNoOpRequest extends LocationCodeSubRequestParent {
/**
 *
 * Constructor to create a   LocationCodeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LocationCodeDeleteNoOpRequest(String id, LOCObjectData noOpIn) {
    super(id, "LocationCodeDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("LocationCode", LOCObjectHelper.toMap(noOpIn, new HashMap(), "LocationCode").get("LocationCode"));
    }
  }
/**
 *
 * Retrieves the LOCObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public LOCObjectData getOutput() {
    return LOCObjectHelper.fromMap(outputMap, "LocationCode");
  }
}
