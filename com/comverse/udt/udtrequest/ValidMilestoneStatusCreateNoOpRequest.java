/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ValidMilestoneStatusCreateNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a ValidMilestoneStatusCreateNoOpRequest Udt Request/Response
 *
 */
public class ValidMilestoneStatusCreateNoOpRequest extends ValidMilestoneStatusSubRequestParent {
/**
 *
 * Constructor to create a   ValidMilestoneStatusCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ValidMilestoneStatusCreateNoOpRequest(String id, ValidMilestoneStatusObjectData noOpIn) {
    super(id, "ValidMilestoneStatusCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectHelper.toMap(noOpIn, new HashMap(), "ValidMilestoneStatus").get("ValidMilestoneStatus"));
    }
  }
/**
 *
 * Retrieves the ValidMilestoneStatusObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ValidMilestoneStatusObjectData getOutput() {
    return ValidMilestoneStatusObjectHelper.fromMap(outputMap, "ValidMilestoneStatus");
  }
}
