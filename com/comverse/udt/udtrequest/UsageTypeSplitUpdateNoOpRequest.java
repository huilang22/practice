/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeSplitUpdateNoOpRequest.java
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
 * NoOp class used to simulate a UsageTypeSplitUpdateNoOpRequest Udt Request/Response
 *
 */
public class UsageTypeSplitUpdateNoOpRequest extends UsageTypeSplitSubRequestParent {
/**
 *
 * Constructor to create a   UsageTypeSplitUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageTypeSplitUpdateNoOpRequest(String id, UsageTypeSplitObjectData noOpIn) {
    super(id, "UsageTypeSplitUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("UsageTypeSplit", UsageTypeSplitObjectHelper.toMap(noOpIn, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
  }
/**
 *
 * Retrieves the UsageTypeSplitObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeSplitObjectData getOutput() {
    return UsageTypeSplitObjectHelper.fromMap(outputMap, "UsageTypeSplit");
  }
}
