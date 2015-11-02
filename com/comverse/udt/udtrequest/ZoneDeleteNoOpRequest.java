/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneDeleteNoOpRequest.java
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
 * NoOp class used to simulate a ZoneDeleteNoOpRequest Udt Request/Response
 *
 */
public class ZoneDeleteNoOpRequest extends ZoneSubRequestParent {
/**
 *
 * Constructor to create a   ZoneDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ZoneDeleteNoOpRequest(String id, ZoneObjectData noOpIn) {
    super(id, "ZoneDeleteNoOpRequest");
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
