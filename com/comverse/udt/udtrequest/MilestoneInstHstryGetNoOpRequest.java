/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstHstryGetNoOpRequest.java
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
 * NoOp class used to simulate a MilestoneInstHstryGetNoOpRequest Udt Request/Response
 *
 */
public class MilestoneInstHstryGetNoOpRequest extends MilestoneInstHstrySubRequestParent {
/**
 *
 * Constructor to create a   MilestoneInstHstryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MilestoneInstHstryGetNoOpRequest(String id, MilestoneInstHstryObjectData noOpIn) {
    super(id, "MilestoneInstHstryGetNoOpRequest");
    if (noOpIn != null) {
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(noOpIn, new HashMap(), "MilestoneInstHstry").get("MilestoneInstHstry"));
    }
  }
/**
 *
 * Retrieves the MilestoneInstHstryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneInstHstryObjectData getOutput() {
    return MilestoneInstHstryObjectHelper.fromMap(outputMap, "MilestoneInstHstry");
  }
}
