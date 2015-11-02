/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NetActionGetNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a NetActionGetNoOpRequest Udt Request/Response
 *
 */
public class NetActionGetNoOpRequest extends NetActionSubRequestParent {
/**
 *
 * Constructor to create a   NetActionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NetActionGetNoOpRequest(String id, NetActionObjectData noOpIn) {
    super(id, "NetActionGetNoOpRequest");
    if (noOpIn != null) {
      addInput("NetAction", NetActionObjectHelper.toMap(noOpIn, new HashMap(), "NetAction").get("NetAction"));
    }
  }
/**
 *
 * Retrieves the NetActionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public NetActionObjectData getOutput() {
    return NetActionObjectHelper.fromMap(outputMap, "NetAction");
  }
}
