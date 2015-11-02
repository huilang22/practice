/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a RewardBalanceFindNoOpRequest Udt Request/Response
 *
 */
public class RewardBalanceFindNoOpRequest extends RewardBalanceRequest {
/**
 *
 * Constructor to create a   RewardBalanceFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RewardBalanceFindNoOpRequest(String id, RewardBalanceObjectDataList noOpIn) {
    super(id, "RewardBalanceFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RewardBalanceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RewardBalance", noOpIn);
      }
      addInput("RewardBalance", mapList);
    }
  }
/**
 *
 * Retrieves the RewardBalanceObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RewardBalanceObjectDataList getOutput() {
    return RewardBalanceObjectHelper.fromMapList(outputMap, "RewardBalanceList");
  }
}
