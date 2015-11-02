/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateDiscountFindNoOpRequest.java
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
 * NoOp class used to simulate a RateDiscountFindNoOpRequest Udt Request/Response
 *
 */
public class RateDiscountFindNoOpRequest extends RateDiscountRequest {
/**
 *
 * Constructor to create a   RateDiscountFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateDiscountFindNoOpRequest(String id, RateDiscountObjectDataList noOpIn) {
    super(id, "RateDiscountFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RateDiscountObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateDiscount", noOpIn);
      }
      addInput("RateDiscount", mapList);
    }
  }
/**
 *
 * Retrieves the RateDiscountObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RateDiscountObjectDataList getOutput() {
    return RateDiscountObjectHelper.fromMapList(outputMap, "RateDiscountList");
  }
}
