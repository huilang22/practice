/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStatusUpdateNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsStatusUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsStatusUpdateNoOpRequest extends InvsStatusSubRequestParent {
/**
 *
 * Constructor to create a   InvsStatusUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsStatusUpdateNoOpRequest(String id, InvsStatusObjectData noOpIn) {
    super(id, "InvsStatusUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsStatus", InvsStatusObjectHelper.toMap(noOpIn, new HashMap(), "InvsStatus").get("InvsStatus"));
    }
  }
/**
 *
 * Retrieves the InvsStatusObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsStatusObjectData getOutput() {
    return InvsStatusObjectHelper.fromMap(outputMap, "InvsStatus");
  }
}
