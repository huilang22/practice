/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CorridorUpdateNoOpRequest Udt Request/Response
 *
 */
public class CorridorUpdateNoOpRequest extends CorridorSubRequestParent {
/**
 *
 * Constructor to create a   CorridorUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorUpdateNoOpRequest(String id, CorridorObjectData noOpIn) {
    super(id, "CorridorUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Corridor", CorridorObjectHelper.toMap(noOpIn, new HashMap(), "Corridor").get("Corridor"));
    }
  }
/**
 *
 * Retrieves the CorridorObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CorridorObjectData getOutput() {
    return CorridorObjectHelper.fromMap(outputMap, "Corridor");
  }
}
