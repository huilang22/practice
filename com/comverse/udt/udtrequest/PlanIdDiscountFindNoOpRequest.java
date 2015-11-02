/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdDiscountFindNoOpRequest.java
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
 * NoOp class used to simulate a PlanIdDiscountFindNoOpRequest Udt Request/Response
 *
 */
public class PlanIdDiscountFindNoOpRequest extends PlanIdDiscountRequest {
/**
 *
 * Constructor to create a   PlanIdDiscountFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PlanIdDiscountFindNoOpRequest(String id, PIDObjectDataList noOpIn) {
    super(id, "PlanIdDiscountFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PIDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PlanIdDiscount", noOpIn);
      }
      addInput("PlanIdDiscount", mapList);
    }
  }
/**
 *
 * Retrieves the PIDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PIDObjectDataList getOutput() {
    return PIDObjectHelper.fromMapList(outputMap, "PlanIdDiscountList");
  }
}
