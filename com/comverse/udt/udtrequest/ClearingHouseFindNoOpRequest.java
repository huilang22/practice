/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseFindNoOpRequest.java
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
 * NoOp class used to simulate a ClearingHouseFindNoOpRequest Udt Request/Response
 *
 */
public class ClearingHouseFindNoOpRequest extends ClearingHouseRequest {
/**
 *
 * Constructor to create a   ClearingHouseFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ClearingHouseFindNoOpRequest(String id, ClearingHouseObjectDataList noOpIn) {
    super(id, "ClearingHouseFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ClearingHouseObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ClearingHouse", noOpIn);
      }
      addInput("ClearingHouse", mapList);
    }
  }
/**
 *
 * Retrieves the ClearingHouseObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ClearingHouseObjectDataList getOutput() {
    return ClearingHouseObjectHelper.fromMapList(outputMap, "ClearingHouseList");
  }
}
