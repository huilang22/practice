/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstHstryFindNoOpRequest.java
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
 * NoOp class used to simulate a MilestoneInstHstryFindNoOpRequest Udt Request/Response
 *
 */
public class MilestoneInstHstryFindNoOpRequest extends MilestoneInstHstryRequest {
/**
 *
 * Constructor to create a   MilestoneInstHstryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MilestoneInstHstryFindNoOpRequest(String id, MilestoneInstHstryObjectDataList noOpIn) {
    super(id, "MilestoneInstHstryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = MilestoneInstHstryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MilestoneInstHstry", noOpIn);
      }
      addInput("MilestoneInstHstry", mapList);
    }
  }
/**
 *
 * Retrieves the MilestoneInstHstryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneInstHstryObjectDataList getOutput() {
    return MilestoneInstHstryObjectHelper.fromMapList(outputMap, "MilestoneInstHstryList");
  }
}
