/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstCreateNoOpRequest.java
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
 * NoOp class used to simulate a MilestoneInstCreateNoOpRequest Udt Request/Response
 *
 */
public class MilestoneInstCreateNoOpRequest extends MilestoneInstSubRequestParent {
/**
 *
 * Constructor to create a   MilestoneInstCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MilestoneInstCreateNoOpRequest(String id, MilestoneInstObjectData noOpIn) {
    super(id, "MilestoneInstCreateNoOpRequest");
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
