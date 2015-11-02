/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorCreateNoOpRequest.java
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
 * NoOp class used to simulate a HqGroupCorridorCreateNoOpRequest Udt Request/Response
 *
 */
public class HqGroupCorridorCreateNoOpRequest extends HqGroupCorridorSubRequestParent {
/**
 *
 * Constructor to create a   HqGroupCorridorCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupCorridorCreateNoOpRequest(String id, HqGroupCorridorObjectData noOpIn) {
    super(id, "HqGroupCorridorCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(noOpIn, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }
/**
 *
 * Retrieves the HqGroupCorridorObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupCorridorObjectData getOutput() {
    return HqGroupCorridorObjectHelper.fromMap(outputMap, "HqGroupCorridor");
  }
}
