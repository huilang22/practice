/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeSplitCreateNoOpRequest.java
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
 * NoOp class used to simulate a UsageTypeSplitCreateNoOpRequest Udt Request/Response
 *
 */
public class UsageTypeSplitCreateNoOpRequest extends UsageTypeSplitSubRequestParent {
/**
 *
 * Constructor to create a   UsageTypeSplitCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageTypeSplitCreateNoOpRequest(String id, UsageTypeSplitObjectData noOpIn) {
    super(id, "UsageTypeSplitCreateNoOpRequest");
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
