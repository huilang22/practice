/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneFindNoOpRequest.java
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
 * NoOp class used to simulate a MilestoneFindNoOpRequest Udt Request/Response
 *
 */
public class MilestoneFindNoOpRequest extends MilestoneRequest {
/**
 *
 * Constructor to create a   MilestoneFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MilestoneFindNoOpRequest(String id, MilestoneObjectDataList noOpIn) {
    super(id, "MilestoneFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = MilestoneObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Milestone", noOpIn);
      }
      addInput("Milestone", mapList);
    }
  }
/**
 *
 * Retrieves the MilestoneObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneObjectDataList getOutput() {
    return MilestoneObjectHelper.fromMapList(outputMap, "MilestoneList");
  }
}
