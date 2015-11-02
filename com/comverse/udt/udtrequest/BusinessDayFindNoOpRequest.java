/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayFindNoOpRequest.java
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
 * NoOp class used to simulate a BusinessDayFindNoOpRequest Udt Request/Response
 *
 */
public class BusinessDayFindNoOpRequest extends BusinessDayRequest {
/**
 *
 * Constructor to create a   BusinessDayFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BusinessDayFindNoOpRequest(String id, BusinessDayObjectDataList noOpIn) {
    super(id, "BusinessDayFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BusinessDayObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BusinessDay", noOpIn);
      }
      addInput("BusinessDay", mapList);
    }
  }
/**
 *
 * Retrieves the BusinessDayObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BusinessDayObjectDataList getOutput() {
    return BusinessDayObjectHelper.fromMapList(outputMap, "BusinessDayList");
  }
}
