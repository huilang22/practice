/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorDeleteNoOpRequest.java
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
 * NoOp class used to simulate a HqGroupCorridorDeleteNoOpRequest Udt Request/Response
 *
 */
public class HqGroupCorridorDeleteNoOpRequest extends HqGroupCorridorSubRequestParent {
/**
 *
 * Constructor to create a   HqGroupCorridorDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupCorridorDeleteNoOpRequest(String id, HqGroupCorridorObjectData noOpIn) {
    super(id, "HqGroupCorridorDeleteNoOpRequest");
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
