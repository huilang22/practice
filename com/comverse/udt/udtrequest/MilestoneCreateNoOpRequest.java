/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneCreateNoOpRequest.java
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
 * NoOp class used to simulate a MilestoneCreateNoOpRequest Udt Request/Response
 *
 */
public class MilestoneCreateNoOpRequest extends MilestoneSubRequestParent {
/**
 *
 * Constructor to create a   MilestoneCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MilestoneCreateNoOpRequest(String id, MilestoneObjectData noOpIn) {
    super(id, "MilestoneCreateNoOpRequest");
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
