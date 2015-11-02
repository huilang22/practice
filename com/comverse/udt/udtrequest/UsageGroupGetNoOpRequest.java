/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageGroupGetNoOpRequest.java
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
 * NoOp class used to simulate a UsageGroupGetNoOpRequest Udt Request/Response
 *
 */
public class UsageGroupGetNoOpRequest extends UsageGroupSubRequestParent {
/**
 *
 * Constructor to create a   UsageGroupGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageGroupGetNoOpRequest(String id, UsageGroupObjectData noOpIn) {
    super(id, "UsageGroupGetNoOpRequest");
    if (noOpIn != null) {
      addInput("UsageGroup", UsageGroupObjectHelper.toMap(noOpIn, new HashMap(), "UsageGroup").get("UsageGroup"));
    }
  }
/**
 *
 * Retrieves the UsageGroupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UsageGroupObjectData getOutput() {
    return UsageGroupObjectHelper.fromMap(outputMap, "UsageGroup");
  }
}
