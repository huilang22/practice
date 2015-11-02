/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstFindNoOpRequest.java
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
 * NoOp class used to simulate a MilestoneInstFindNoOpRequest Udt Request/Response
 *
 */
public class MilestoneInstFindNoOpRequest extends MilestoneInstRequest {
/**
 *
 * Constructor to create a   MilestoneInstFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MilestoneInstFindNoOpRequest(String id, MilestoneInstObjectDataList noOpIn) {
    super(id, "MilestoneInstFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = MilestoneInstObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MilestoneInst", noOpIn);
      }
      addInput("MilestoneInst", mapList);
    }
  }
/**
 *
 * Retrieves the MilestoneInstObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneInstObjectDataList getOutput() {
    return MilestoneInstObjectHelper.fromMapList(outputMap, "MilestoneInstList");
  }
}
