/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalAccountBalancesFindNoOpRequest.java
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
 * NoOp class used to simulate a GlobalAccountBalancesFindNoOpRequest Udt Request/Response
 *
 */
public class GlobalAccountBalancesFindNoOpRequest extends GlobalAccountBalancesRequest {
/**
 *
 * Constructor to create a   GlobalAccountBalancesFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GlobalAccountBalancesFindNoOpRequest(String id, GlobalAccountBalancesObjectDataList noOpIn) {
    super(id, "GlobalAccountBalancesFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GlobalAccountBalancesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GlobalAccountBalances", noOpIn);
      }
      addInput("GlobalAccountBalances", mapList);
    }
  }
/**
 *
 * Retrieves the GlobalAccountBalancesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GlobalAccountBalancesObjectDataList getOutput() {
    return GlobalAccountBalancesObjectHelper.fromMapList(outputMap, "GlobalAccountBalancesList");
  }
}
