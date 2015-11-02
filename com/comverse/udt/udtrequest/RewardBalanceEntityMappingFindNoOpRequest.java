/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceEntityMappingFindNoOpRequest.java
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
 * NoOp class used to simulate a RewardBalanceEntityMappingFindNoOpRequest Udt Request/Response
 *
 */
public class RewardBalanceEntityMappingFindNoOpRequest extends RewardBalanceEntityMappingRequest {
/**
 *
 * Constructor to create a   RewardBalanceEntityMappingFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RewardBalanceEntityMappingFindNoOpRequest(String id, RewardBalanceEntityMappingObjectDataList noOpIn) {
    super(id, "RewardBalanceEntityMappingFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RewardBalanceEntityMappingObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RewardBalanceEntityMapping", noOpIn);
      }
      addInput("RewardBalanceEntityMapping", mapList);
    }
  }
/**
 *
 * Retrieves the RewardBalanceEntityMappingObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RewardBalanceEntityMappingObjectDataList getOutput() {
    return RewardBalanceEntityMappingObjectHelper.fromMapList(outputMap, "RewardBalanceEntityMappingList");
  }
}
