/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountPlanFindNoOpRequest.java
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
 * NoOp class used to simulate a DiscountPlanFindNoOpRequest Udt Request/Response
 *
 */
public class DiscountPlanFindNoOpRequest extends DiscountPlanRequest {
/**
 *
 * Constructor to create a   DiscountPlanFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountPlanFindNoOpRequest(String id, DPObjectDataList noOpIn) {
    super(id, "DiscountPlanFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DPObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DiscountPlan", noOpIn);
      }
      addInput("DiscountPlan", mapList);
    }
  }
/**
 *
 * Retrieves the DPObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DPObjectDataList getOutput() {
    return DPObjectHelper.fromMapList(outputMap, "DiscountPlanList");
  }
}
