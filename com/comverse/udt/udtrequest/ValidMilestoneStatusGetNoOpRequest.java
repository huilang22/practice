/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ValidMilestoneStatusGetNoOpRequest.java
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
 * NoOp class used to simulate a ValidMilestoneStatusGetNoOpRequest Udt Request/Response
 *
 */
public class ValidMilestoneStatusGetNoOpRequest extends ValidMilestoneStatusSubRequestParent {
/**
 *
 * Constructor to create a   ValidMilestoneStatusGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ValidMilestoneStatusGetNoOpRequest(String id, ValidMilestoneStatusObjectData noOpIn) {
    super(id, "ValidMilestoneStatusGetNoOpRequest");
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
