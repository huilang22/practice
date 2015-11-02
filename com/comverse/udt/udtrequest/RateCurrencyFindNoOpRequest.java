/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCurrencyFindNoOpRequest.java
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
 * NoOp class used to simulate a RateCurrencyFindNoOpRequest Udt Request/Response
 *
 */
public class RateCurrencyFindNoOpRequest extends RateCurrencyRequest {
/**
 *
 * Constructor to create a   RateCurrencyFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateCurrencyFindNoOpRequest(String id, RCObjectDataList noOpIn) {
    super(id, "RateCurrencyFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateCurrency", noOpIn);
      }
      addInput("RateCurrency", mapList);
    }
  }
/**
 *
 * Retrieves the RCObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RCObjectDataList getOutput() {
    return RCObjectHelper.fromMapList(outputMap, "RateCurrencyList");
  }
}
