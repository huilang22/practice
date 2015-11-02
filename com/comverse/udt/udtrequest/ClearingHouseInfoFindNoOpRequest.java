/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseInfoFindNoOpRequest.java
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
 * NoOp class used to simulate a ClearingHouseInfoFindNoOpRequest Udt Request/Response
 *
 */
public class ClearingHouseInfoFindNoOpRequest extends ClearingHouseInfoRequest {
/**
 *
 * Constructor to create a   ClearingHouseInfoFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ClearingHouseInfoFindNoOpRequest(String id, ClearingHouseInfoObjectDataList noOpIn) {
    super(id, "ClearingHouseInfoFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ClearingHouseInfoObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ClearingHouseInfo", noOpIn);
      }
      addInput("ClearingHouseInfo", mapList);
    }
  }
/**
 *
 * Retrieves the ClearingHouseInfoObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ClearingHouseInfoObjectDataList getOutput() {
    return ClearingHouseInfoObjectHelper.fromMapList(outputMap, "ClearingHouseInfoList");
  }
}
