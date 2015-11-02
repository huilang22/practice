/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceUpdateNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a PolicyInstanceUpdateNoOpRequest Udt Request/Response
 *
 */
public class PolicyInstanceUpdateNoOpRequest extends PolicyInstanceSubRequestParent {
/**
 *
 * Constructor to create a   PolicyInstanceUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PolicyInstanceUpdateNoOpRequest(String id, PolicyInstanceObjectData noOpIn) {
    super(id, "PolicyInstanceUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(noOpIn, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }
/**
 *
 * Retrieves the PolicyInstanceObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PolicyInstanceObjectData getOutput() {
    return PolicyInstanceObjectHelper.fromMap(outputMap, "PolicyInstance");
  }
}
