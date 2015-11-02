/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableServiceTypeFindNoOpRequest.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ServiceableServiceTypeFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceableServiceTypeFindNoOpRequest extends ServiceableServiceTypeRequest {
/**
 *
 * Constructor to create a   ServiceableServiceTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceableServiceTypeFindNoOpRequest(String id, ServicePricingPlanObjectDataList noOpIn) {
    super(id, "ServiceableServiceTypeFindNoOpRequest");
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
