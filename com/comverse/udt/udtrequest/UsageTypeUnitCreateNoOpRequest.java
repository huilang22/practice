/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUnitCreateNoOpRequest.java
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
 * NoOp class used to simulate a UsageTypeUnitCreateNoOpRequest Udt Request/Response
 *
 */
public class UsageTypeUnitCreateNoOpRequest extends UsageTypeUnitSubRequestParent {
/**
 *
 * Constructor to create a   UsageTypeUnitCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageTypeUnitCreateNoOpRequest(String id, UsageTypeUnitObjectData noOpIn) {
    super(id, "UsageTypeUnitCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("UsageTypeUnit", UsageTypeUnitObjectHelper.toMap(noOpIn, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
  }
/**
 *
 * Retrieves the UsageTypeUnitObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeUnitObjectData getOutput() {
    return UsageTypeUnitObjectHelper.fromMap(outputMap, "UsageTypeUnit");
  }
}
