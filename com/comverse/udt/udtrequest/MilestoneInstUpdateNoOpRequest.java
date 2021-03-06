/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstUpdateNoOpRequest.java
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
 * NoOp class used to simulate a MilestoneInstUpdateNoOpRequest Udt Request/Response
 *
 */
public class MilestoneInstUpdateNoOpRequest extends MilestoneInstSubRequestParent {
/**
 *
 * Constructor to create a   MilestoneInstUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MilestoneInstUpdateNoOpRequest(String id, MilestoneInstObjectData noOpIn) {
    super(id, "MilestoneInstUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(noOpIn, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }
/**
 *
 * Retrieves the MilestoneInstObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneInstObjectData getOutput() {
    return MilestoneInstObjectHelper.fromMap(outputMap, "MilestoneInst");
  }
}
