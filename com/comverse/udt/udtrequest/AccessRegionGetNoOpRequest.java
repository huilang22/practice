/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccessRegionGetNoOpRequest.java
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
 * NoOp class used to simulate a AccessRegionGetNoOpRequest Udt Request/Response
 *
 */
public class AccessRegionGetNoOpRequest extends AccessRegionSubRequestParent {
/**
 *
 * Constructor to create a   AccessRegionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccessRegionGetNoOpRequest(String id, AccessRegionObjectData noOpIn) {
    super(id, "AccessRegionGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AccessRegion", AccessRegionObjectHelper.toMap(noOpIn, new HashMap(), "AccessRegion").get("AccessRegion"));
    }
  }
/**
 *
 * Retrieves the AccessRegionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccessRegionObjectData getOutput() {
    return AccessRegionObjectHelper.fromMap(outputMap, "AccessRegion");
  }
}
