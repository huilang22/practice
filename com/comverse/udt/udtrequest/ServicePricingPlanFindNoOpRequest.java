/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServicePricingPlanFindNoOpRequest.java
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
 * NoOp class used to simulate a ServicePricingPlanFindNoOpRequest Udt Request/Response
 *
 */
public class ServicePricingPlanFindNoOpRequest extends ServicePricingPlanRequest {
/**
 *
 * Constructor to create a   ServicePricingPlanFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServicePricingPlanFindNoOpRequest(String id, ServicePricingPlanObjectDataList noOpIn) {
    super(id, "ServicePricingPlanFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServicePricingPlanObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServicePricingPlan", noOpIn);
      }
      addInput("ServicePricingPlan", mapList);
    }
  }
/**
 *
 * Retrieves the ServicePricingPlanObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServicePricingPlanObjectDataList getOutput() {
    return ServicePricingPlanObjectHelper.fromMapList(outputMap, "ServicePricingPlanList");
  }
}
