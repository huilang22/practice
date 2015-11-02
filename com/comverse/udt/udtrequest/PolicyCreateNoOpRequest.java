/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyCreateNoOpRequest.java
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
 * NoOp class used to simulate a PolicyCreateNoOpRequest Udt Request/Response
 *
 */
public class PolicyCreateNoOpRequest extends PolicySubRequestParent {
/**
 *
 * Constructor to create a   PolicyCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PolicyCreateNoOpRequest(String id, PolicyObjectData noOpIn) {
    super(id, "PolicyCreateNoOpRequest");
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
