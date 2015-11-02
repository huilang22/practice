/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeGetNoOpRequest.java
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
 * NoOp class used to simulate a LocationCodeGetNoOpRequest Udt Request/Response
 *
 */
public class LocationCodeGetNoOpRequest extends LocationCodeSubRequestParent {
/**
 *
 * Constructor to create a   LocationCodeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LocationCodeGetNoOpRequest(String id, LOCObjectData noOpIn) {
    super(id, "LocationCodeGetNoOpRequest");
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
