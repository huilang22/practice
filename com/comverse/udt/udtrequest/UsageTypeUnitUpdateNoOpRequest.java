/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUnitUpdateNoOpRequest.java
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
 * NoOp class used to simulate a UsageTypeUnitUpdateNoOpRequest Udt Request/Response
 *
 */
public class UsageTypeUnitUpdateNoOpRequest extends UsageTypeUnitSubRequestParent {
/**
 *
 * Constructor to create a   UsageTypeUnitUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageTypeUnitUpdateNoOpRequest(String id, UsageTypeUnitObjectData noOpIn) {
    super(id, "UsageTypeUnitUpdateNoOpRequest");
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
