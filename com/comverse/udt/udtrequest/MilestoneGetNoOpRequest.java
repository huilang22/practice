/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneGetNoOpRequest.java
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
 * NoOp class used to simulate a MilestoneGetNoOpRequest Udt Request/Response
 *
 */
public class MilestoneGetNoOpRequest extends MilestoneSubRequestParent {
/**
 *
 * Constructor to create a   MilestoneGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MilestoneGetNoOpRequest(String id, MilestoneObjectData noOpIn) {
    super(id, "MilestoneGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Milestone", MilestoneObjectHelper.toMap(noOpIn, new HashMap(), "Milestone").get("Milestone"));
    }
  }
/**
 *
 * Retrieves the MilestoneObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneObjectData getOutput() {
    return MilestoneObjectHelper.fromMap(outputMap, "Milestone");
  }
}
