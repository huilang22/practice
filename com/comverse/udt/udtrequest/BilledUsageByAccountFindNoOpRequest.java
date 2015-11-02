/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageByAccountFindNoOpRequest.java
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
 * NoOp class used to simulate a BilledUsageByAccountFindNoOpRequest Udt Request/Response
 *
 */
public class BilledUsageByAccountFindNoOpRequest extends BilledUsageRequest {
/**
 *
 * Constructor to create a   BilledUsageByAccountFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BilledUsageByAccountFindNoOpRequest(String id, BilledUsageObjectDataList noOpIn) {
    super(id, "BilledUsageByAccountFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BilledUsageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BilledUsage", noOpIn);
      }
      addInput("BilledUsage", mapList);
    }
  }
/**
 *
 * Retrieves the BilledUsageObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BilledUsageObjectDataList getOutput() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
}
