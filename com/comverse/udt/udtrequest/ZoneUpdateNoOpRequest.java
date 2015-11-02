/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ZoneUpdateNoOpRequest Udt Request/Response
 *
 */
public class ZoneUpdateNoOpRequest extends ZoneSubRequestParent {
/**
 *
 * Constructor to create a   ZoneUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ZoneUpdateNoOpRequest(String id, ZoneObjectData noOpIn) {
    super(id, "ZoneUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Zone", ZoneObjectHelper.toMap(noOpIn, new HashMap(), "Zone").get("Zone"));
    }
  }
/**
 *
 * Retrieves the ZoneObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ZoneObjectData getOutput() {
    return ZoneObjectHelper.fromMap(outputMap, "Zone");
  }
}
