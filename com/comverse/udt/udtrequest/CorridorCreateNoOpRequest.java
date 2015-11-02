/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorCreateNoOpRequest.java
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
 * NoOp class used to simulate a CorridorCreateNoOpRequest Udt Request/Response
 *
 */
public class CorridorCreateNoOpRequest extends CorridorSubRequestParent {
/**
 *
 * Constructor to create a   CorridorCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorCreateNoOpRequest(String id, CorridorObjectData noOpIn) {
    super(id, "CorridorCreateNoOpRequest");
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
