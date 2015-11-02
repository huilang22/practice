/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitKeyFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a UnitCrRateLimitKeyFindNoOpRequest Udt Request/Response
 *
 */
public class UnitCrRateLimitKeyFindNoOpRequest extends UnitCrRateLimitKeyRequest {
/**
 *
 * Constructor to create a   UnitCrRateLimitKeyFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitCrRateLimitKeyFindNoOpRequest(String id, UnitCrRateLimitKeysObjectDataList noOpIn) {
    super(id, "UnitCrRateLimitKeyFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UnitCrRateLimitKeysObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnitCrRateLimitKey", noOpIn);
      }
      addInput("UnitCrRateLimitKey", mapList);
    }
  }
/**
 *
 * Retrieves the UnitCrRateLimitKeysObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrRateLimitKeysObjectDataList getOutput() {
    return UnitCrRateLimitKeysObjectHelper.fromMapList(outputMap, "UnitCrRateLimitKeyList");
  }
}
