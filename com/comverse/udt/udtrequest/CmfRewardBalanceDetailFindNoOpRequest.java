/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfRewardBalanceDetailFindNoOpRequest.java
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
 * NoOp class used to simulate a CmfRewardBalanceDetailFindNoOpRequest Udt Request/Response
 *
 */
public class CmfRewardBalanceDetailFindNoOpRequest extends CmfRewardBalanceDetailRequest {
/**
 *
 * Constructor to create a   CmfRewardBalanceDetailFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CmfRewardBalanceDetailFindNoOpRequest(String id, CmfRewardBalanceDetailObjectDataList noOpIn) {
    super(id, "CmfRewardBalanceDetailFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CmfRewardBalanceDetailObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CmfRewardBalanceDetail", noOpIn);
      }
      addInput("CmfRewardBalanceDetail", mapList);
    }
  }
/**
 *
 * Retrieves the CmfRewardBalanceDetailObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CmfRewardBalanceDetailObjectDataList getOutput() {
    return CmfRewardBalanceDetailObjectHelper.fromMapList(outputMap, "CmfRewardBalanceDetailList");
  }
}
