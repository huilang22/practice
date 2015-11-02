/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyGetNoOpRequest.java
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
 * NoOp class used to simulate a PolicyGetNoOpRequest Udt Request/Response
 *
 */
public class PolicyGetNoOpRequest extends PolicySubRequestParent {
/**
 *
 * Constructor to create a   PolicyGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PolicyGetNoOpRequest(String id, PolicyObjectData noOpIn) {
    super(id, "PolicyGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Policy", PolicyObjectHelper.toMap(noOpIn, new HashMap(), "Policy").get("Policy"));
    }
  }
/**
 *
 * Retrieves the PolicyObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PolicyObjectData getOutput() {
    return PolicyObjectHelper.fromMap(outputMap, "Policy");
  }
}
