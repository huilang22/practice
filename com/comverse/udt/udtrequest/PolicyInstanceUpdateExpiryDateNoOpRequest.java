/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceUpdateExpiryDateNoOpRequest.java
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
 * NoOp class used to simulate a PolicyInstanceUpdateExpiryDateNoOpRequest Udt Request/Response
 *
 */
public class PolicyInstanceUpdateExpiryDateNoOpRequest extends PolicyInstanceRequest {
/**
 *
 * Constructor to create a   PolicyInstanceUpdateExpiryDateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PolicyInstanceUpdateExpiryDateNoOpRequest(String id, Integer noOpIn) {
    super(id, "PolicyInstanceUpdateExpiryDateNoOpRequest");
    if (noOpIn != null) {
      addInput("Result", noOpIn);
    }
  }
/**
 *
 * Retrieves the Integer passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return  (Integer)outputMap.get("Result");
  }
}
