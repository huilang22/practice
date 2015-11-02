/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneStatusCreateNoOpRequest.java
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
 * NoOp class used to simulate a MilestoneStatusCreateNoOpRequest Udt Request/Response
 *
 */
public class MilestoneStatusCreateNoOpRequest extends MilestoneStatusSubRequestParent {
/**
 *
 * Constructor to create a   MilestoneStatusCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MilestoneStatusCreateNoOpRequest(String id, MilestoneStatusObjectData noOpIn) {
    super(id, "MilestoneStatusCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("MilestoneStatus", MilestoneStatusObjectHelper.toMap(noOpIn, new HashMap(), "MilestoneStatus").get("MilestoneStatus"));
    }
  }
/**
 *
 * Retrieves the MilestoneStatusObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneStatusObjectData getOutput() {
    return MilestoneStatusObjectHelper.fromMap(outputMap, "MilestoneStatus");
  }
}
